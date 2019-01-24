package org.pursuit.unit_03_assessment;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import org.pursuit.unit_03_assessment.R;

import java.util.ArrayList;

public class RecyclerActivity extends AppCompatActivity {

    private static final String TAG = "RecyclerActivity";

    private ArrayList<String> mName = new ArrayList<>();
    private ArrayList<String> mImageUrls = new ArrayList<>();
    private ArrayList<String> mNumber = new ArrayList<>();
    RecyclerView recyclerView ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);




    /*
        * TODO: Add logic that will:
        * TODO 1. Make Retrofit instance for this endpoint: https://raw.githubusercontent.com/JDVila/storybook/master/planets.json
        * TODO 2. Make data model objects based on JSON
        * TODO 3. Make a service interface with method(s) to make a GET request
        * TODO 4. Make a request to the JSON endpoint using the Retrofit instance and the service
        * TODO 5. Subclass a RecyclerView Adapter
        * TODO 6. Subclass a RecyclerView ViewHolder
        * TODO 7. Pass list to RecyclerView
        * TODO 8. Display planet name in a RecyclerView tile
        * TODO 9. Implement an OnClickListener for the itemview
        * TODO 10. Pass the Planet Name, Number, and Image URL data to DisplayActivity when tile is clicked
        */


}
