package com.gzeinnumer.recyclerviewstaggered;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    List<Integer> images = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        images.add(R.drawable.poster_1);
        images.add(R.drawable.poster_11);
        images.add(R.drawable.poster_2);
        images.add(R.drawable.poster_3);
        images.add(R.drawable.poster_4);
        images.add(R.drawable.poster_5);
        images.add(R.drawable.poster_6);
        images.add(R.drawable.poster_7);
        images.add(R.drawable.poster_8);
        images.add(R.drawable.poster_9);
        images.add(R.drawable.poster_10);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);

        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(3, LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(staggeredGridLayoutManager);

//        RVAdapter RVAdapter = new RVAdapter(MainActivity.this, images);
        RVAdapterBC RVAdapter = new RVAdapterBC(MainActivity.this, images);

        recyclerView.setAdapter(RVAdapter);
    }
}