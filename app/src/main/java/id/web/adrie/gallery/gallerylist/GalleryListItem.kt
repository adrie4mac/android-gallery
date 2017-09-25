package id.web.adrie.gallery.gallerylist

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.mikepenz.fastadapter.items.AbstractItem
import id.web.adrie.gallery.R
import id.web.adrie.gallery.utils.DeviceUtil
import kotlinx.android.synthetic.main.item_gallery.view.*

/**
 * Created by adrie_savana on 9/25/17.
 */
class GalleryListItem(val name: String): AbstractItem<GalleryListItem, GalleryListItem.ViewHolder>() {

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
        //holder.name.text = name
        Glide.with(holder.itemView.context)
                .load("https://mostodd.files.wordpress.com/2011/01/types-of-goldfish.jpg")
                .into(holder.image)
    }

    override fun unbindView(holder: ViewHolder?) {
        super.unbindView(holder)
        //holder!!.name.text = null
    }

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        //var name = itemView.textName
        var image = itemView.imgImagePhoto

        init {
            val height = DeviceUtil.getScreenWith(itemView.context)
            image.layoutParams.height = height / 2
            image.layoutParams.width = height / 2
        }


    }

}
