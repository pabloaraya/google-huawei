package cl.blackmind.goowei

import android.content.Context
import android.content.Intent
import cl.blackmind.huawei_map.MapHuaweiActivity

class MapFactory {
    companion object {
        fun showMap(context: Context) {
            context.startActivity(Intent(context, MapHuaweiActivity::class.java))
        }
    }
}