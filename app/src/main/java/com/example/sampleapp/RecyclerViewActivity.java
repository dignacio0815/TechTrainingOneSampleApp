package com.example.sampleapp;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.sampleapp.Adapter.ItemsAdapter;

import java.util.ArrayList;

public class RecyclerViewActivity extends AppCompatActivity {

    RecyclerView rvItems;
    ArrayList<Integer> items;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);
        rvItems = findViewById(R.id.recyclerView);

        View view = this.getWindow().getDecorView();
        view.setBackgroundColor(Color.rgb(225,  198, 153));

        items = new ArrayList<>();

        for (int i = 0; i < 50; i++) {
            items.add(i);
        }

        ItemsAdapter adapter = new ItemsAdapter(items);

        rvItems.setAdapter(adapter);

        rvItems.setLayoutManager(new LinearLayoutManager(this));
    }
}