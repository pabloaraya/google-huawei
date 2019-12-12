package cl.blackmind.goowei

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import cl.blackmind.core_map.MapService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        buttonMap.setOnClickListener { MapFactory.showMap(this) }
    }
}
