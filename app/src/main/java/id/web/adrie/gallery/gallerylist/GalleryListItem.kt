package id.web.adrie.gallery.gallerylist

import android.support.v7.widget.RecyclerView
import android.view.View
import com.bumptech.glide.Glide
import com.mikepenz.fastadapter.items.AbstractItem
import id.web.adrie.gallery.R
import id.web.adrie.gallery.utils.DeviceUtil
import kotlinx.android.synthetic.main.item_gallery.view.*

/**
 * Created by adrie_savana on 9/25/17.
 */
class GalleryListItem(val name: String): AbstractItem<GalleryListItem, GalleryListItem.ViewHolder>() {

    private var mViewHolder: ViewHolder? = null

    init {

    }

    override fun getViewHolder(v: View): ViewHolder {
        return ViewHolder(v)
    }

    override fun getLayoutRes(): Int {
        return R.layout.item_gallery
    }

    override fun getType(): Int {
        return this.hashCode()
    }

    override fun bindView(holder: ViewHolder, payloads: MutableList<Any>?) {
        super.bindView(holder, payloads)
        mViewHolder = holder
        Glide.with(holder.itemView.context)
                .load("https://mostodd.files.wordpress.com/2011/01/types-of-goldfish.jpg")
                .into(holder.image)
    }

    override fun unbindView(holder: ViewHolder?) {
        super.unbindView(holder)
    }

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var image = itemView.imgImagePhoto.apply {
            layoutParams.height = DeviceUtil.getScreenWith(itemView.context) / 2
            layoutParams.width = layoutParams.height
        }
    }
}