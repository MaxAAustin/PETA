package com.maxaaustin.peta;


import static com.maxaaustin.peta.R.drawable.*;

/**
 * Created by maaus on 10/13/2017.
 */

public class SplashCardDataModel {

    private int foodID;
    private int foodPic;
    String dishName;

    public SplashCardDataModel(int foodID, int foodPic, String dishName) {
        this.foodID = foodID;
        this.foodPic = foodPic;
        this.dishName = dishName;
    }
    static Integer[] foodPicArray = {temp1, temp2, temp3, temp4, temp5};

    static Integer[] cuisineID = {0,1,2,3,4,5,6,7};
    static String[] cuisineTypes = {"American", "French", "Italian", "Thai", "Japanese", "Chinese", "Indian", "BBQ"};

    public int getFoodID() {
        return foodID;
    }

    public int getFoodPic() {
        return foodPic;
    }

    public String getDishName() {
        return dishName;
    }
}
