package cl.blackmind.goowei

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.huawei.hms.maps.*
import com.huawei.hms.maps.model.LatLng
import com.huawei.hms.maps.model.CameraPosition


class MapHuaweiActivity : AppCompatActivity(), OnMapReadyCallback {

    private lateinit var mMap: HuaweiMap
    private lateinit var mMapView: MapView

    override fun onMapReady(huaweiMap: HuaweiMap) {
        Log.e("MapHuaweiActivity", "onMapReady: ")
        mMap = huaweiMap

        val build = CameraPosition.Builder().target(LatLng(60.0, 60.0)).zoom(5f).build()

        val cameraUpdate = CameraUpdateFactory.newCameraPosition(build)
        mMap.animateCamera(cameraUpdate)
        mMap.setMaxZoomPreference(5f)
        mMap.setMinZoomPreference(2f)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_huawei_map)
        mMapView = findViewById<MapView>(R.id.mapView)
        var mapViewBundle: Bundle? = null
        if (savedInstanceState != null) {
            mapViewBundle = savedInstanceState.getBundle("MapViewBundleKey")
        }
        mMapView.onCreate(mapViewBundle)
        //mMapView.getMapAsync(this)
    }

    override fun onStart() {
        super.onStart()
        mMapView.onStart()
    }

    override fun onLowMemory() {
        super.onLowMemory()
        mMapView.onLowMemory()
    }
}
