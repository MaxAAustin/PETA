package com.maxaaustin.peta;


import static com.maxaaustin.peta.R.drawable.*;

/**
 * Created by maaus on 10/13/2017.
 */

public class SplashCardDataModel {

    private int foodID;
    private int foodPic;
    String dishName;
    String cuisineType;

    public SplashCardDataModel(int foodID, int foodPic, String dishName, String cuisineType) {
        this.foodID = foodID;
        this.foodPic = foodPic;
        this.dishName = dishName;
        this.cuisineType = cuisineType;
    }

    public int getFoodID() {return foodID;}

    public int getFoodPic() {return foodPic;}

    public String getDishName() {
        return dishName;
    }

    public String getCuisineType() {return cuisineType;}
}
