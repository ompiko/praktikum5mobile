package com.example.modul5mobile;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in SMP 1 Malang and move the camera
        LatLng SMP1 = new LatLng(-7.9712025,112.6216231);
        mMap.addMarker(new MarkerOptions().position(SMP1).title("Marker in SMP Negeri 1 Kota Malang"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(SMP1));

        // Add a marker in SMP 2 Malang and move the camera
        LatLng SMP2 = new LatLng(-7.990263,112.6286913);
        mMap.addMarker(new MarkerOptions().position(SMP2).title("Marker in SMP Negeri 2 Kota Malang"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(SMP2));

        // Add a marker in SMP 3 Malang and move the camera
        LatLng SMP3 = new LatLng(-7.9691003,112.6333607);
        mMap.addMarker(new MarkerOptions().position(SMP3).title("Marker in SMP Negeri 3 Kota Malang"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(SMP3));

        // Add a marker in SMP 4 Malang and move the camera
        LatLng SMP4 = new LatLng(-7.9581102,112.6145601);
        mMap.addMarker(new MarkerOptions().position(SMP4).title("Marker in SMP Negeri 4 Kota Malang"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(SMP4));

        // Add a marker in SMP 5 Malang and move the camera
        LatLng SMP5 = new LatLng(-7.9663588,112.636275);
        mMap.addMarker(new MarkerOptions().position(SMP5).title("Marker in SMP Negeri 5 Kota Malang"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(SMP5));

        // Add a marker in SMP 6 Malang and move the camera
        LatLng SMP6 = new LatLng(-7.979534,112.6224983);
        mMap.addMarker(new MarkerOptions().position(SMP6).title("Marker in SMP Negeri 6 Kota Malang"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(SMP6));

        // Add a marker in SMP 7 Malang and move the camera
        LatLng SMP7 = new LatLng(-8.0038992,112.6344055);
        mMap.addMarker(new MarkerOptions().position(SMP7).title("Marker in SMP Negeri 7 Kota Malang"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(SMP7));

        // Add a marker in SMP 8 Malang and move the camera
        LatLng SMP8 = new LatLng(-7.9771707,112.6251132);
        mMap.addMarker(new MarkerOptions().position(SMP8).title("Marker in SMP Negeri 8 Kota Malang"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(SMP8));

        // Add a marker in SMP 9 Malang and move the camera
        LatLng SMP9 = new LatLng(-7.9896033,112.6286666);
        mMap.addMarker(new MarkerOptions().position(SMP9).title("Marker in SMP Negeri 9 Kota Malang"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(SMP9));

        // Add a marker in SMP 10 Malang and move the camera
        LatLng SMP10 = new LatLng(-8.0096367,112.6418325);
        mMap.addMarker(new MarkerOptions().position(SMP10).title("Marker in SMP Negeri 10 Kota Malang"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(SMP10));

        // Add a marker in SMP 11 Malang and move the camera
        LatLng SMP11 = new LatLng(-7.932683,112.6354713);
        mMap.addMarker(new MarkerOptions().position(SMP11).title("Marker in SMP Negeri 11 Kota Malang"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(SMP11));

        // Add a marker in SMP 12 Malang and move the camera
        LatLng SMP12 = new LatLng(-8.0059204,112.6201822);
        mMap.addMarker(new MarkerOptions().position(SMP12).title("Marker in SMP Negeri 12 Kota Malang"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(SMP12));

        // Add a marker in SMP 13 Malang and move the camera
        LatLng SMP13 = new LatLng(-7.9490465,112.6049374);
        mMap.addMarker(new MarkerOptions().position(SMP13).title("Marker in SMP Negeri 13 Kota Malang"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(SMP13));

        // Add a marker in SMP 14 Malang and move the camera
        LatLng SMP14 = new LatLng(-7.943497,112.6603058);
        mMap.addMarker(new MarkerOptions().position(SMP14).title("Marker in SMP Negeri 14 Kota Malang"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(SMP14));

        // Add a marker in SMP 15 Malang and move the camera
        LatLng SMP15 = new LatLng(-7.9760118,112.6014502);
        mMap.addMarker(new MarkerOptions().position(SMP15).title("Marker in SMP Negeri 15 Kota Malang"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(SMP15));

        // Add a marker in SMP 16 Malang and move the camera
        LatLng SMP16 = new LatLng(-7.93447,112.6599589);
        mMap.addMarker(new MarkerOptions().position(SMP16).title("Marker in SMP Negeri 16 Kota Malang"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(SMP16));

        // Add a marker in SMP 17 Malang and move the camera
        LatLng SMP17 = new LatLng(-8.0064612,112.6014505);
        mMap.addMarker(new MarkerOptions().position(SMP17).title("Marker in SMP Negeri 17 Kota Malang"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(SMP17));

        // Add a marker in SMP 18 Malang and move the camera
        LatLng SMP18 = new LatLng(-7.9394045,112.6173567);
        mMap.addMarker(new MarkerOptions().position(SMP5).title("Marker in SMP Negeri 18 Kota Malang"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(SMP5));

        // Add a marker in SMP 19 Malang and move the camera
        LatLng SMP19 = new LatLng(-7.993899,112.6228823);
        mMap.addMarker(new MarkerOptions().position(SMP19).title("Marker in SMP Negeri 19 Kota Malang"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(SMP19));

        // Add a marker in SMP 20 Malang and move the camera
        LatLng SMP20 = new LatLng(-7.963635,112.6386488);
        mMap.addMarker(new MarkerOptions().position(SMP20).title("Marker in SMP Negeri 20 Kota Malang"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(SMP20));
    }
}
