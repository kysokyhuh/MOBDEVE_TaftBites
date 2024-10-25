package com.mobdeve.s21.grp4.mco_taftbites;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class ReviewRatingsReviews_DetailsActivity extends AppCompatActivity {

    private RecyclerView reviewsRecyclerView;
    private ReviewRatingsReviewAdapter reviewAdapter;
    private List<ReviewRatingsReview> reviewList;
    private ImageButton backButton;
    private LinearLayout writeReviewButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ratings_review_details);

        // Initialize RecyclerView
        reviewsRecyclerView = findViewById(R.id.reviewsRecyclerView);
        reviewsRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Initialize Back Button
        backButton = findViewById(R.id.back_button);

        // Set Back Button functionality
        backButton.setOnClickListener(v -> finish());

        // Initialize write review button (to navigate to the review form)
        writeReviewButton = findViewById(R.id.write_review_button);
        writeReviewButton.setOnClickListener(v -> {
            // Navigate to the activity for writing a review
            Intent intent = new Intent(ReviewRatingsReviews_DetailsActivity.this, RateReviewActivity.class);
            startActivity(intent);
        });

        // Initialize review list with sample data
        reviewList = new ArrayList<>();
        reviewList.add(new ReviewRatingsReview("Alyce Lambo", "Really convenient and the points system helps benefit loyalty.", "25/06/2023", R.drawable.raterimage, 4.5f));
        reviewList.add(new ReviewRatingsReview("Gonalo Salom", "Been a lifesaver for keeping our sanity...", "27/06/2023", R.drawable.raterimage, 4.0f));

        // Set the adapter
        reviewAdapter = new ReviewRatingsReviewAdapter(reviewList, this);
        reviewsRecyclerView.setAdapter(reviewAdapter);
    }
}
