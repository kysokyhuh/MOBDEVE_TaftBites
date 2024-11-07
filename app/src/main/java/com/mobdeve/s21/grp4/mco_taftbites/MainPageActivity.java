package com.mobdeve.s21.grp4.mco_taftbites;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainPageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_page);  // Make sure this is the correct layout file name

        // Get the button by its ID
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button myButton = findViewById(R.id.filter_button); // Use the actual button ID

        // Set a background color directly (replace #8BC34A with your desired color)
        myButton.setBackgroundColor(Color.parseColor("#8BC34A"));
    }
}
