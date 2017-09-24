package id.web.adrie.gallery.gallerylist

import android.support.v7.widget.RecyclerView
import android.view.View
import com.mikepenz.fastadapter.items.AbstractItem
import id.web.adrie.gallery.R
import kotlinx.android.synthetic.main.item_gallery.view.*

/**
 * Created by adrie_savana on 9/25/17.
 */
class GalleryListItem(val name: String):
        AbstractItem<GalleryListItem, GalleryListItem.ViewHolder>() {

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
        holder.name.setText(name)
    }

    override fun unbindView(holder: ViewHolder?) {
        super.unbindView(holder)
        holder!!.name.setText(null)
    }

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        internal var name = itemView.textName
    }

}
