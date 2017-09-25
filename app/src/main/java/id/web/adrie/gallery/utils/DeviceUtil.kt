package id.web.adrie.gallery.utils

import android.app.Activity
import android.content.Context
import android.graphics.Point

/**
 * Created by adrie_savana on 9/25/17.
 */
class DeviceUtil {
    companion object {

        fun getScreenWith(context: Context): Int {
            val size = getScreenSize(context as Activity)
            return size.x
        }

        fun getScreenHeight(context: Context): Int {
            val size = getScreenSize(context as Activity)
            return size.y
        }

        fun dpToPx(dp: Int, context: Context): Int {
            val density = context.resources.displayMetrics.density
            return Math.round(dp * density)
        }

        private fun getScreenSize(contex: Activity): Point {
            val display = contex.windowManager.defaultDisplay
            val size = Point()
            display.getSize(size)
            return size
        }
    }

}