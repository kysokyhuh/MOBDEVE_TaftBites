package com.mobdeve.s21.grp4.mco_taftbites;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView restaurantRV;
    private RestaurantAdapter adapter;
    private List<RestaurantItem> restaurantList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_page);

        restaurantRV = findViewById(R.id.restaurantRV);
        restaurantRV.setLayoutManager(new LinearLayoutManager(this));

        // Populate with sample data
        restaurantList = new ArrayList<>();
        restaurantList.add(new RestaurantItem("Pork Sisig with Egg", 4.5f, "1.5 km away", "Filipino Cuisine"));
        restaurantList.add(new RestaurantItem("Beef Steak", 4.0f, "2.0 km away", "American Cuisine"));
        restaurantList.add(new RestaurantItem("Chicken Adobo", 5.0f, "3.2 km away", "Filipino Cuisine"));

        adapter = new RestaurantAdapter(restaurantList, this);
        restaurantRV.setAdapter(adapter);
    }
}
