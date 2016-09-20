package com.jitesh.filtr;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = getIntent();
        Uri uri = Uri.parse(intent.getStringExtra("imageUri"));
        ImageView imageView = (ImageView)findViewById(R.id.imageView);

        imageView.setImageURI(uri);

        String[] someString= {"Filter 1", "Filter 1", "Filter 1", "Filter 1", "Filter 1", "Filter 1", "Filter 1"};
        ListView listView= (ListView)findViewById(R.id.listView);
        ListAdapter adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, someString);
        listView.setAdapter(adapter);


    }
}
