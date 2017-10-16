package com.maxaaustin.peta;

import com.maxaaustin.peta.R.drawable.*;

import static com.maxaaustin.peta.R.drawable.temp1;
import static com.maxaaustin.peta.R.drawable.temp2;
import static com.maxaaustin.peta.R.drawable.temp3;
import static com.maxaaustin.peta.R.drawable.temp4;
import static com.maxaaustin.peta.R.drawable.temp5;


/**
 * Created by maaus on 10/16/2017.
 */

public class DishCardData {

    int foodID;
    int foodPic;
    String dishName;
    String cuisineType;

    static Integer[] foodPicArray = {temp1, temp2, temp3, temp4, temp5};

    static Integer[] cuisineID = {0,1,2,3,4,5,6,7};
    static String[] cuisineTypes = {"American", "French", "Italian", "Thai", "Japanese", "Chinese", "Indian", "BBQ"};
    static String[] dishNameArray = {"Pizza", "Ramen", "Spaghetti","Biryani", "Sushi", "Panang Curry", "Pulled Pork"};

    public int getFoodID() {return foodID;}

    public int getFoodPic() {
        return foodPic;
    }

    public String getDishName() {
        return dishName;
    }

    public  String getCuisineType() {return cuisineType;}

}
