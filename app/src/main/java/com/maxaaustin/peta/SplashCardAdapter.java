package com.maxaaustin.peta;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import static com.maxaaustin.peta.R.layout.splash_card_view;

/**
 * Created by maaus on 10/13/2017.
 */

public class SplashCardAdapter extends RecyclerView.Adapter<SplashCardAdapter.CardViewHolder> {

    private ArrayList<SplashCardDataModel> splashDataSet;

    public static class CardViewHolder extends ViewHolder{
        ImageView dishPic;
        TextView dishName;
        TextView cuisineType;

        public CardViewHolder(View view) {
            super(view);
            this.dishPic = view.findViewById(com.maxaaustin.peta.R.id.dish_pic);
            this.dishName = view.findViewById(com.maxaaustin.peta.R.id.dish_name);
            this.cuisineType = view.findViewById(com.maxaaustin.peta.R.id.cuisine_label);
        }
    }

    public SplashCardAdapter(ArrayList<SplashCardDataModel> splashData) {
        this.splashDataSet = splashData;
    }

    /**
     *
     * @param parent
     * @param viewType
     * @return
     */
    @Override
    public SplashCardAdapter.CardViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(splash_card_view, parent, false);
        CardViewHolder viewHolder = new SplashCardAdapter.CardViewHolder(view);
        return viewHolder;
    }

    /**
     *
     * @param holder
     * @param position
     */
    @Override
    public void onBindViewHolder(final SplashCardAdapter.CardViewHolder holder, final int position) {

        ImageView dishPic = holder.dishPic;
        TextView dishName = holder.dishName;
        TextView cuisineType = holder.cuisineType;

        dishPic.setImageResource(splashDataSet.get(position).getFoodPic());
        dishName.setText(splashDataSet.get(position).getDishName());
        cuisineType.setText(splashDataSet.get(position).getCuisineType());
    }

    @Override
    public int getItemCount() {
        return splashDataSet.size();
    }
}
