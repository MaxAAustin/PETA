package com.maxaaustin.peta;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.Adapter;
import android.support.v7.widget.RecyclerView.LayoutManager;

import com.maxaaustin.peta.R.id.*;

public class MainActivity extends AppCompatActivity {

    private RecyclerView globalEventRecyclerView;
    private Adapter adapter;
    private LayoutManager mLayoutManager;


    private static java.util.ArrayList<com.maxaaustin.peta.SplashCardDataModel> dataHolder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        globalEventRecyclerView= (RecyclerView) findViewById(R.id.rvMain);
        globalEventRecyclerView.setHasFixedSize(true);

        mLayoutManager = new LinearLayoutManager(this);
        globalEventRecyclerView.setLayoutManager(mLayoutManager);
        globalEventRecyclerView.setItemAnimator(new DefaultItemAnimator());

        dataHolder = new java.util.ArrayList<SplashCardDataModel>();
        for (int i = 0; i< DishCardData.cuisineID.length; i++){
            dataHolder.add(new SplashCardDataModel(com.maxaaustin.peta.DishCardData.cuisineID[i],com.maxaaustin.peta.DishCardData.foodPicArray[i], com.maxaaustin.peta.DishCardData.dishNameArray[i], com.maxaaustin.peta.DishCardData.cuisineTypes[i]));

            adapter = new SplashCardAdapter(dataHolder);
            globalEventRecyclerView.setAdapter(adapter);
        }
    }
}
