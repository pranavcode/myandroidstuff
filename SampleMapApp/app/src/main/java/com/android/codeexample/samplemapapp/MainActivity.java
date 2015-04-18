package com.android.codeexample.samplemapapp;

import android.app.AlertDialog;
import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class MainActivity extends ActionBarActivity {

//    String textLat;
//    String textLon;
    static final LatLng HAMBURG = new LatLng(53.558, 9.927);
    static final LatLng KIEL = new LatLng(53.551, 9.993);

    private GoogleMap map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        LocationManager lm = (LocationManager) getSystemService(Context.LOCATION_SERVICE);
//        LocationListener ll = new myLocationListener();
//
//        lm.requestLocationUpdates(LocationManager.GPS_PROVIDER, 0, 0, ll);

        map = ((MapFragment) getFragmentManager().findFragmentById((R.id.map))).getMap();

        if(map!=null) {
            Marker hamburg = map.addMarker(new MarkerOptions().position(HAMBURG).title("Hamburg"));
            Marker kiel = map.addMarker(new MarkerOptions()
                    .position(KIEL)
                    .title("Kiel")
                    .snippet("Kiel is cool")
                    .icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_plusone_medium_off_client)));
        }
    }

//    private class myLocationListener implements LocationListener {
//        @Override
//        public void onLocationChanged(Location location) {
//            if(location != null) {
//                double lat = location.getLatitude();
//                double lon = location.getLongitude();
//
//                textLat = Double.toString(lat);
//                textLon = Double.toString(lon);
//
//
//
//            }
//        }
//
//        @Override
//        public void onStatusChanged(String s, int i, Bundle bundle) {
//
//        }
//
//        @Override
//        public void onProviderEnabled(String s) {
//
//        }
//
//        @Override
//        public void onProviderDisabled(String s) {
//
//        }
//    }
}
