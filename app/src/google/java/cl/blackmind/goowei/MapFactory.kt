package cl.blackmind.goowei

import android.content.Context
import android.content.Intent
import cl.blackmind.google_map.MapGoogleActivity

class MapFactory {
    companion object {
        fun showMap(context: Context) {
            context.startActivity(Intent(context, MapGoogleActivity::class.java))
        }
    }
}
