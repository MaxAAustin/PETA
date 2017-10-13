package com.maxaaustin.peta;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ViewHolder;

/**
 * Created by maaus on 10/13/2017.
 */

public class SplashCardAdapter extends RecyclerView.Adapter<SplashCardAdapter.CardViewHolder> {

    private java.util.ArrayList<com.maxaaustin.peta.SplashCardDataModel> splashData;

    public static class CardViewHolder extends ViewHolder{
        android.widget.ImageView dishPic;
        android.widget.TextView dishName;

        public CardViewHolder(android.view.View view) {
            super(view);
            this.dishPic = view.findViewById(com.maxaaustin.peta.R.id.dish_pic);
            this.dishName = view.findViewById(com.maxaaustin.peta.R.id.dish_name);
        }
    }

    public SplashCardAdapter(java.util.ArrayList<SplashCardDataModel> splashData) {
        this.splashData = splashData;
    }

    @Override
    public com.maxaaustin.peta.SplashCardAdapter.CardViewHolder onCreateViewHolder(android.view.ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(com.maxaaustin.peta.SplashCardAdapter.CardViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
