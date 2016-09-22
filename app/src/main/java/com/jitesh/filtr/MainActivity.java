package com.jitesh.filtr;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.widget.ImageView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = getIntent();
        String imageLink = intent.getStringExtra("imageUri");
        Uri uri = Uri.parse(imageLink);
        ImageView imageView = (ImageView) findViewById(R.id.imageView);

        imageView.setImageURI(uri);

        String[] someString = {"Filter 1", "Filter 2", "Filter 3", "Filter 4", "Filter 5", "Filter 6", "Filter 7"};
        ArrayList<Filter> listFilters = new ArrayList<>();
        for (String x : someString) {
            Filter filter = new Filter();
            filter.setFilterName(x);
            listFilters.add(filter);
        }

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerViewMain);
        ImageAdapter imageAdapter = new ImageAdapter(MainActivity.this, listFilters, imageLink);
        recyclerView.setAdapter(imageAdapter);
        recyclerView.setLayoutManager(new StaggeredGridLayoutManager(3, StaggeredGridLayoutManager.HORIZONTAL));
        /*
        ListView listView= (ListView)findViewById(R.id.listView);
        ListAdapter adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, someString);
        listView.setAdapter(adapter);
        */


    }
}
