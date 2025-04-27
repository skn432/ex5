package com.example.exp5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.content.ClipData;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ItemAdapter adapter;
    private List<com.example.exp5.Item> itemList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Sample data
        itemList = new ArrayList<>();
        itemList.add(new com.example.exp5.Item("Item 1"));
        itemList.add(new com.example.exp5.Item("Item 2"));
        itemList.add(new com.example.exp5.Item("Item 3"));
        itemList.add(new com.example.exp5.Item("Item 4"));
        itemList.add(new com.example.exp5.Item("Item 5"));
        itemList.add(new com.example.exp5.Item("Item 6"));
        itemList.add(new com.example.exp5.Item("Item 7"));
        itemList.add(new com.example.exp5.Item("Item 8"));

        adapter = new ItemAdapter(itemList);
        recyclerView.setAdapter(adapter);
    }

}
