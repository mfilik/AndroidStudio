package com.example.martaapp;

import androidx.annotation.NonNull;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;

import android.Manifest;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import android.view.VerifiedInputEvent;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MapStyleOptions;
import com.google.android.gms.maps.model.MarkerOptions;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
// imports for train pngs
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;


public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private int ACCESS_LOCATION_REQUEST_CODE = 10001;

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
        try {
            // Customise the styling of the base map using a JSON object defined
            // in a raw resource file.
            boolean success = googleMap.setMapStyle(
                    MapStyleOptions.loadRawResourceStyle(
                            this, R.raw.style));

            if (!success) {
                Log.e("MapsActivity", "Style parsing failed.");
            }
        } catch (Resources.NotFoundException e) {
            Log.e("MapsActivity", "Can't find style. Error: ", e);
        }



        mMap = googleMap;

        if (ContextCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) == PackageManager.PERMISSION_GRANTED) {
            enableUserLocation();
        } else {
            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.ACCESS_FINE_LOCATION}, ACCESS_LOCATION_REQUEST_CODE);
        }

        // region "Markers"

        //--------------------------------------------------------------------------markers from north to south
        // marker created for North Springs
        LatLng NorthSprings = new LatLng(33.945126, -84.357005);
        mMap.addMarker(new MarkerOptions().position(NorthSprings).title("North Springs")).setIcon(BitmapFromVector(getApplicationContext(), R.drawable.ic_baseline_commute_24));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(NorthSprings));

        // marker created for Sandy Springs
        LatLng SandySprings = new LatLng(33.932125, -84.350996);
        mMap.addMarker(new MarkerOptions().position(SandySprings).title("Sandy Springs")).setIcon(BitmapFromVector(getApplicationContext(), R.drawable.ic_baseline_commute_24));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(SandySprings));

        // marker created for Dunwoody
        LatLng Dunwoody = new LatLng(33.920698, -84.344474);
        mMap.addMarker(new MarkerOptions().position(Dunwoody).title("Dunwoody")).setIcon(BitmapFromVector(getApplicationContext(), R.drawable.ic_baseline_commute_24));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Dunwoody));

        // marker created for Medical Center
        LatLng medical = new LatLng(33.910440, -84.351590);
        mMap.addMarker(new MarkerOptions().position(medical).title("Medical Center")).setIcon(BitmapFromVector(getApplicationContext(), R.drawable.ic_baseline_commute_24));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(medical));

        // marker created for Doraville
        LatLng Doraville = new LatLng(33.902885, -84.280222);
        mMap.addMarker(new MarkerOptions().position(Doraville).title("Doraville")).setIcon(BitmapFromVector(getApplicationContext(), R.drawable.ic_baseline_commute_24));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Doraville));

        // marker created for Chamblee
        LatLng Chamblee = new LatLng(33.886955, -84.306832);
        mMap.addMarker(new MarkerOptions().position(Chamblee).title("Chamblee")).setIcon(BitmapFromVector(getApplicationContext(), R.drawable.ic_baseline_commute_24));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Chamblee));

        // marker created for buckhead
        LatLng Buckhead = new LatLng(33.848656, -84.368184);
        mMap.addMarker(new MarkerOptions().position(Buckhead).title("Buckhead")).setIcon(BitmapFromVector(getApplicationContext(), R.drawable.ic_baseline_commute_24));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Buckhead));

        // marker created for Lindbergh
        LatLng Lindbergh = new LatLng(33.823067, -84.368717);
        mMap.addMarker(new MarkerOptions().position(Lindbergh).title("Lindbergh")).setIcon(BitmapFromVector(getApplicationContext(), R.drawable.ic_baseline_commute_24));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Lindbergh));

        // marker created for Arts Center
        LatLng Arts_Center = new LatLng(33.7892273, -84.3873023);
        mMap.addMarker(new MarkerOptions().position(Arts_Center).title("Arts Center")).setIcon(BitmapFromVector(getApplicationContext(), R.drawable.ic_baseline_commute_24));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Arts_Center));

        // marker created for Midtown
        LatLng Midtown = new LatLng(33.7809944, -84.3863843);
        mMap.addMarker(new MarkerOptions().position(Midtown).title("Midtown")).setIcon(BitmapFromVector(getApplicationContext(), R.drawable.ic_baseline_commute_24));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Midtown));

        // marker created for North Ave
        LatLng North_Ave = new LatLng(33.7715057, -84.3870118);
        mMap.addMarker(new MarkerOptions().position(North_Ave).title("North Avenue")).setIcon(BitmapFromVector(getApplicationContext(), R.drawable.ic_baseline_commute_24));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(North_Ave));

        // marker created for Civic Center
        LatLng Civic_Center = new LatLng(33.7665368, -84.3876211);
        mMap.addMarker(new MarkerOptions().position(Civic_Center).title("Civic Center")).setIcon(BitmapFromVector(getApplicationContext(), R.drawable.ic_baseline_commute_24));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Civic_Center));

        // marker created for Peachtree Center
        LatLng Peachtree_Center = new LatLng(33.7579893, -84.3878127);
        mMap.addMarker(new MarkerOptions().position(Peachtree_Center).title("Peachtree_Center")).setIcon(BitmapFromVector(getApplicationContext(), R.drawable.ic_baseline_commute_24));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Peachtree_Center, 13));

        // marker created for Five Points
        LatLng Five_Points = new LatLng(33.753711, -84.391487);
        mMap.addMarker(new MarkerOptions().position(Five_Points).title("Five Points")).setIcon(BitmapFromVector(getApplicationContext(), R.drawable.ic_baseline_commute_24));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Five_Points));

        // marker created for Garnett Transit Station
        LatLng Garnett = new LatLng(33.7482011, -84.3962491);
        mMap.addMarker(new MarkerOptions().position(Garnett).title("Garnet Transit Stationn")).setIcon(BitmapFromVector(getApplicationContext(), R.drawable.ic_baseline_commute_24));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Garnett));

        // marker created for West End Station
        LatLng West_End = new LatLng(33.7482011, -84.3962491);
        mMap.addMarker(new MarkerOptions().position(West_End).title("West End Station")).setIcon(BitmapFromVector(getApplicationContext(), R.drawable.ic_baseline_commute_24));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(West_End));

        // marker created for Oakland City
        LatLng Oakland_City = new LatLng(33.7169157, -84.4250138);
        mMap.addMarker(new MarkerOptions().position(Oakland_City).title("Oakland City")).setIcon(BitmapFromVector(getApplicationContext(), R.drawable.ic_baseline_commute_24));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Oakland_City));

        // marker created for Lakewood Fort
        LatLng Lakewood_Fort = new LatLng(33.699818, -84.427833);
        mMap.addMarker(new MarkerOptions().position(Lakewood_Fort).title("Lakewood-Fort")).setIcon(BitmapFromVector(getApplicationContext(), R.drawable.ic_baseline_commute_24));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Lakewood_Fort));

        // marker created for East Point
        LatLng East_Point = new LatLng(33.676822, -84.440193);
        mMap.addMarker(new MarkerOptions().position(East_Point).title("East Point Transit Station")).setIcon(BitmapFromVector(getApplicationContext(), R.drawable.ic_baseline_commute_24));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(East_Point));

        // marker created for East Point
        LatLng College_Park = new LatLng(33.651248, -84.448261);
        mMap.addMarker(new MarkerOptions().position(College_Park).title("College Park")).setIcon(BitmapFromVector(getApplicationContext(), R.drawable.ic_baseline_commute_24));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(College_Park));

        //----------------------------------------------------------------------------------markers from East to West
        // marker created for Hamilton E Holmes
        LatLng Hamilton = new LatLng(33.754220, -84.469933);
        mMap.addMarker(new MarkerOptions().position(Hamilton).title("Hamilton E. Holmes")).setIcon(BitmapFromVector(getApplicationContext(), R.drawable.ic_baseline_commute_24));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Hamilton));

        // marker created for Ashby Transit Station
        LatLng Ashby = new LatLng(33.755879, -84.416782);
        mMap.addMarker(new MarkerOptions().position(Ashby).title("Ashby Transit Station")).setIcon(BitmapFromVector(getApplicationContext(), R.drawable.ic_baseline_commute_24));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Ashby));

        // marker created for Vine City
        LatLng Vine_City = new LatLng(33.756486, -84.403950);
        mMap.addMarker(new MarkerOptions().position(Vine_City).title("Vine City Transit Station")).setIcon(BitmapFromVector(getApplicationContext(), R.drawable.ic_baseline_commute_24));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Vine_City));

        // marker created for CNN Center
        LatLng CNN = new LatLng(33.7563934, -84.3967671);
        mMap.addMarker(new MarkerOptions().position(CNN).title("CNN Center Transit Station")).setIcon(BitmapFromVector(getApplicationContext(), R.drawable.ic_baseline_commute_24));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(CNN));

        // marker created for Georgia State Transit Station
        LatLng Georgia_State = new LatLng(33.750188, -84.386441);
        mMap.addMarker(new MarkerOptions().position(Georgia_State).title("Georgia State")).setIcon(BitmapFromVector(getApplicationContext(), R.drawable.ic_baseline_commute_24));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Georgia_State));

        // marker created for King Memorial Transit Station
        LatLng King_Memorial = new LatLng(33.750224, -84.375218);
        mMap.addMarker(new MarkerOptions().position(King_Memorial).title("King Memorial Transit Station")).setIcon(BitmapFromVector(getApplicationContext(), R.drawable.ic_baseline_commute_24));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(King_Memorial));

        // marker created for Inman Park / Reynolds Town
        LatLng Inman_Park = new LatLng(33.757788, -84.352902);
        mMap.addMarker(new MarkerOptions().position(Inman_Park).title("Inman Park / Reynolds Town")).setIcon(BitmapFromVector(getApplicationContext(), R.drawable.ic_baseline_commute_24));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Inman_Park));

        // marker created for Edgewood-Candler Park
        LatLng Candler = new LatLng(33.762377, -84.340006);
        mMap.addMarker(new MarkerOptions().position(Candler).title("Edgewood-Candler Park Station")).setIcon(BitmapFromVector(getApplicationContext(), R.drawable.ic_baseline_commute_24));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Candler));

        // marker created for East Lake Transit Station
        LatLng East_Lake = new LatLng(33.762444, -84.312176);
        mMap.addMarker(new MarkerOptions().position(East_Lake).title("East Lake Transit Station")).setIcon(BitmapFromVector(getApplicationContext(), R.drawable.ic_baseline_commute_24));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(East_Lake));

        // marker created for East Lake Transit Station
        LatLng Decatur = new LatLng(33.774525, -84.295307);
        mMap.addMarker(new MarkerOptions().position(Decatur).title("Decatur Transit Station")).setIcon(BitmapFromVector(getApplicationContext(), R.drawable.ic_baseline_commute_24));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Decatur));

        // endregion
    }

    private BitmapDescriptor BitmapFromVector(Context context, int vectorResId) {
        // below line is use to generate a drawable.
        Drawable vectorDrawable = ContextCompat.getDrawable(context, vectorResId);

        // below line is use to set bounds to our vector drawable.
        vectorDrawable.setBounds(0, 0, vectorDrawable.getIntrinsicWidth(), vectorDrawable.getIntrinsicHeight());

        // below line is use to create a bitmap for our
        // drawable which we have added.
        Bitmap bitmap = Bitmap.createBitmap(vectorDrawable.getIntrinsicWidth(), vectorDrawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);

        // below line is use to add bitmap in our canvas.
        Canvas canvas = new Canvas(bitmap);

        // below line is use to draw our
        // vector drawable in canvas.
        vectorDrawable.draw(canvas);

        // after generating our bitmap we are returning our bitmap.
        return BitmapDescriptorFactory.fromBitmap(bitmap);
    }

    private void enableUserLocation() {
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
            return;
        }
        mMap.setMyLocationEnabled(true);

    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        if(requestCode == ACCESS_LOCATION_REQUEST_CODE){
            if(grantResults.length>0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                enableUserLocation();
            }
            else {
                // show dialogue that permission isn't granted
            }
        }
    }



}