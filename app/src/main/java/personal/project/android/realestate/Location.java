package personal.project.android.realestate;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class Location extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location);
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

       //Markers of the locations of the Flats 
        LatLng Kol = new LatLng(22.620986, 88.439620);
        mMap.addMarker(new MarkerOptions().position(Kol).title("Galaxy Apartments"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Kol));

        LatLng Kol2 = new LatLng(22.628117, 88.455449);
        mMap.addMarker(new MarkerOptions().position(Kol2).title("Vasudha Mansion"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Kol2));

        LatLng Kol3 = new LatLng(22.607460, 88.467969);
        mMap.addMarker(new MarkerOptions().position(Kol3).title("Gaur City"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Kol3));

        LatLng Kol4=new LatLng(22.593788, 88.411742);
        mMap.addMarker(new MarkerOptions().position(Kol4).title("Olympia Ridge"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Kol4));

        LatLng Kol5=new LatLng(22.580314, 88.453607);
        mMap.addMarker(new MarkerOptions().position(Kol5).title("Solana Courtyard"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Kol5));

        LatLng Kol6=new LatLng(22.565573, 88.465550);
        mMap.addMarker(new MarkerOptions().position(Kol6).title("Law Hill"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Kol6));

        LatLng Kol7=new LatLng(22.568491, 88.434106);
        mMap.addMarker(new MarkerOptions().position(Kol7).title("Poland View"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Kol7));


        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(Kol2,12.0f));
    }
}
