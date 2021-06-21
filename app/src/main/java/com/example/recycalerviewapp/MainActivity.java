package com.example.recycalerviewapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;


import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    LinearLayoutManager layoutManager;
    List<ModelClass> nameList;
    MyAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        initData();
        initRecycler();

    }

    private void initData() {
        nameList = new ArrayList<>();
        nameList.add(new ModelClass("Anisur Rahman","Hello How Are You",R.drawable.am));
        nameList.add(new ModelClass("Atikur Rahman","Hello How Are You",R.drawable.bm));
        nameList.add(new ModelClass("Arifur Rahman","Hello How Are You",R.drawable.cm));
        nameList.add(new ModelClass("Abdur Rahman","Hello How Are You",R.drawable.dm));
        nameList.add(new ModelClass(" Rayyhan Uddin","Hello How Are You",R.drawable.am));
        nameList.add(new ModelClass("Anisur Rahman","Hello How Are You",R.drawable.bm));

    }

    private void initRecycler() {
        recyclerView = findViewById(R.id.recyclerView);
        layoutManager = new LinearLayoutManager(this) ;
        layoutManager.setOrientation(recyclerView.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        myAdapter  = new MyAdapter(nameList);
        recyclerView.setAdapter(myAdapter);
        myAdapter.notifyDataSetChanged();

    }
}