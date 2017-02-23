package com.example.recyclerview0220;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private List<Dog> dogList = new ArrayList<Dog>();
    private MyAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initDogList();
        initViews();
    }

    private void initViews() {
        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerview);
       // LinearLayoutManager manager = new LinearLayoutManager(this);
       // manager.setOrientation(LinearLayoutManager.HORIZONTAL);
        //GridLayoutManager manager = new GridLayoutManager(this,3);
        StaggeredGridLayoutManager manager = new StaggeredGridLayoutManager(3,StaggeredGridLayoutManager.VERTICAL);
        mRecyclerView.setLayoutManager(manager);
        mAdapter = new MyAdapter(dogList);
        mRecyclerView.setAdapter(mAdapter);
    }

    private void initDogList() {
        dogList.add(new Dog( R.drawable.dog1));
        dogList.add(new Dog( R.drawable.dog2));
        dogList.add(new Dog( R.drawable.dog3));
        dogList.add(new Dog( R.drawable.dog4));
        dogList.add(new Dog( R.drawable.dog5));
        dogList.add(new Dog( R.drawable.dog6));
        dogList.add(new Dog( R.drawable.dog7));
        dogList.add(new Dog( R.drawable.dog8));
        dogList.add(new Dog( R.drawable.dog9));
        dogList.add(new Dog( R.drawable.dog10));
    }
}
