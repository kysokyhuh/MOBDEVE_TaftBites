package com.mobdeve.s21.grp4.mco_taftbites;

// REVIEW MODEL SPECIFIC FOR THE ReviewRatingsReview PAGE

public class ReviewRatingsReview {
    private String reviewerName;
    private String reviewText;
    private String reviewDate;
    private int profileImageResId = -1;
    private float rating;

    // Constructor with profile image
    public ReviewRatingsReview(String reviewerName, String reviewText, String reviewDate, int profileImageResId, float rating) {
        this.reviewerName = reviewerName;
        this.reviewText = reviewText;
        this.reviewDate = reviewDate;
        this.profileImageResId = profileImageResId;
        this.rating = rating;
    }

    // Constructor without profile image
    public ReviewRatingsReview(String reviewerName, String reviewText, String reviewDate, float rating) {
        this.reviewerName = reviewerName;
        this.reviewText = reviewText;
        this.reviewDate = reviewDate;
        this.rating = rating;
    }

    // Getters
    public String getReviewerName() {
        return reviewerName;
    }

    public String getReviewText() {
        return reviewText;
    }

    public String getReviewDate() {
        return reviewDate;
    }

    public int getProfileImageResId() {
        return profileImageResId;
    }

    public float getRating() {
        return rating;
    }
}

