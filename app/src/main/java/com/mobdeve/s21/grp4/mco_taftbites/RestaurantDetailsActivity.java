package com.mobdeve.s21.grp4.mco_taftbites;
// RESTAURANT DETAILS PAGE

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class RestaurantDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant_details);  // Set the layout

        // Set up RecyclerView for menu items
        RecyclerView menuRecyclerView = findViewById(R.id.menuRecyclerView);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        menuRecyclerView.setLayoutManager(layoutManager);
        List<MenuItem> menuItemsList = new ArrayList<>();
        menuItemsList.add(new MenuItem("Pork Sisig with Egg", R.drawable.sisig));
        menuItemsList.add(new MenuItem("Adobo", R.drawable.sisig));
        menuItemsList.add(new MenuItem("Kare-Kare", R.drawable.sisig));
        MenuAdapter menuAdapter = new MenuAdapter(menuItemsList, this);
        menuRecyclerView.setAdapter(menuAdapter);

        // Set up the RecyclerView for reviews
        setupReviewRecyclerView();

        ImageView nextButton = findViewById(R.id.nextButton);

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RestaurantDetailsActivity.this, ReviewRatingsReviews_DetailsActivity.class);
                startActivity(intent);
            }
        });
    }

    private void setupReviewRecyclerView() {
        RecyclerView reviewRecyclerView = findViewById(R.id.reviewRecyclerView);
        LinearLayoutManager reviewLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        reviewRecyclerView.setLayoutManager(reviewLayoutManager);
        List<Review> reviewsList = new ArrayList<>();
        reviewsList.add(new Review("Cool place! Great food!", "Ellaine M.", 5));
        reviewsList.add(new Review("Amazing food, but service could be better.", "John D.", 4));
        reviewsList.add(new Review("Loved the ambiance!", "Catherine K.", 5));
        ReviewAdapter reviewAdapter = new ReviewAdapter(reviewsList, this);
        reviewRecyclerView.setAdapter(reviewAdapter);
    }
}
