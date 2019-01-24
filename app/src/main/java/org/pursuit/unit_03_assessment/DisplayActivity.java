package org.pursuit.unit_03_assessment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.util.Log;

import org.pursuit.unit_03_assessment.R;

public class DisplayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        Log.d(TAG, "onCreate: started.");

        initImagePlanets();

        recyclerView = findViewById(R.id.plants_recyclerview);

    }

    private void initImagePlanets(){
        Log.d(TAG,"initImagePlanets: planets.");

        mName.add("Mercury");
        mNumber.add("1");
        mImageUrls.add("https://www.go-astronomy.com/images/planets/planet-mercury.jpg");

        mName.add("Venus");
        mNumber.add("2");
        mImageUrls.add("http://blogs.scientificamerican.com/guest-blog/files/2012/06/Venus.jpg");

        mName.add("Earth");
        mNumber.add("3");
        mImageUrls.add("https://cdn.britannica.com/700x450/25/160325-004-AD594C66.jpg");

        mName.add("Mars");
        mNumber.add("4");
        mImageUrls.add("http://davidmkelly.net/wp-content/uploads/2013/09/planet-mars.jpg");

        mName.add("Jupiter");
        mNumber.add("5");
        mImageUrls.add("http://www.clker.com/cliparts/d/c/e/d/12786361781616141935jupiter.png");

        mName.add("Saturn");
        mNumber.add("6");
        mImageUrls.add("https://www.yourdictionary.com/images/definitions/lg/8616.saturn.jpg");

        mName.add("Uranus");
        mNumber.add("7");
        mImageUrls.add("https://www.startrekdb.se/astronomi/bilder/uranus2.jpg");

        mName.add("Neptune");
        mNumber.add("8");
        mImageUrls.add("http://imgc.allpostersimages.com/images/P-473-488-90/37/3792/96AIF00Z/posters/excellent-narrow-angle-camera-views-of-the-planet-neptune-taken-from-voyager-2-spacecraft.jpg");

        initRecyclerView();
    }

    private void initRecyclerView() {
        Log.d(TAG, "initRecyclerView: init recyclerview.");
        recyclerView = findViewById(R.id.recycler_view);
        RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(mName, mNumber, mImageUrls, this);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL,false);
        recyclerView.setAdapter(recyclerViewAdapter);
        recyclerView.setLayoutManager(linearLayoutManager);

    }







    /*
        * TODO: Add logic that will:
        * TODO 1. Receive values from sending intent
        * TODO 2. Create a TextView instance for the Planet Name
        * TODO 3. Create a TextView instance for the Planet Number count
        * TODO 4. Create an ImageView for the image url
        * TODO 5. Display each value in views - Strings for TextViews, and Picasso for the ImageView
        */
    }
}
