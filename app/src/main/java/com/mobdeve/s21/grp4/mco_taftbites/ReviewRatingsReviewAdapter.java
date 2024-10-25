package com.mobdeve.s21.grp4.mco_taftbites;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class ReviewRatingsReviewAdapter extends RecyclerView.Adapter<ReviewRatingsReviewAdapter.ReviewViewHolder> {

    private List<ReviewRatingsReview> reviewsList;
    private Context context;

    // Adapter constructor
    public ReviewRatingsReviewAdapter(List<ReviewRatingsReview> reviewsList, Context context) {
        this.reviewsList = reviewsList;
        this.context = context;
    }

    @NonNull
    @Override
    public ReviewViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // Inflate the item layout for each review
        View view = LayoutInflater.from(context).inflate(R.layout.item_ratings_review, parent, false);
        return new ReviewViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ReviewViewHolder holder, int position) {
        ReviewRatingsReview review = reviewsList.get(position);

        // Bind the reviewer's name, review text, and date
        holder.reviewerName.setText(review.getReviewerName());
        holder.reviewText.setText(review.getReviewText());
        holder.reviewDate.setText(review.getReviewDate());

        if (review.getProfileImageResId() != -1) {
            holder.reviewerProfileImage.setImageResource(review.getProfileImageResId());
        } else {
            holder.reviewerProfileImage.setImageResource(R.drawable.raterimage);
        }

        holder.reviewerRating.setRating(review.getRating());
    }

    @Override
    public int getItemCount() {
        return reviewsList.size();  // Return the number of reviews
    }

    // ViewHolder class for the Review item layout
    public static class ReviewViewHolder extends RecyclerView.ViewHolder {

        ImageView reviewerProfileImage;
        TextView reviewerName, reviewText, reviewDate;
        RatingBar reviewerRating;

        public ReviewViewHolder(@NonNull View itemView) {
            super(itemView);
            // Initialize the views from the item_ratings_review layout
            reviewerProfileImage = itemView.findViewById(R.id.reviewerProfileImage);
            reviewerName = itemView.findViewById(R.id.reviewerName);
            reviewText = itemView.findViewById(R.id.reviewText);
            reviewDate = itemView.findViewById(R.id.reviewDate);
            reviewerRating = itemView.findViewById(R.id.reviewerRating);
        }
    }
}
