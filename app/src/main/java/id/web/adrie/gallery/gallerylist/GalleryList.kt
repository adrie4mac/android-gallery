package id.web.adrie.gallery.gallerylist

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.StaggeredGridLayoutManager
import com.mikepenz.fastadapter.IItem
import com.mikepenz.fastadapter.commons.adapters.FastItemAdapter
import id.web.adrie.gallery.R
import kotlinx.android.synthetic.main.activity_gallery.*

/**
 * Created by adrie_savana on 9/24/17.
 */
class GalleryList: AppCompatActivity() {

    private val mAdapter = FastItemAdapter<IItem<*, *>>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gallery)


        gallery_list.layoutManager = StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
        gallery_list.adapter = mAdapter

        for (i in 1 until 30) {
            mAdapter.add(GalleryListItem("savana"+i))
        }
    }


}