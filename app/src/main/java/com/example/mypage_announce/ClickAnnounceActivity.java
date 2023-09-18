package com.example.mypage_announce;


import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.content.Intent;
import android.widget.ImageView;

public class ClickAnnounceActivity extends AppCompatActivity {

    ImageView backbtn1;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.click_announce);

        backbtn1 = findViewById(R.id.backbtn1);
        backbtn1.setOnClickListener(view -> {
            Intent intent = new
                    Intent(getApplicationContext(),
                    MainActivity.class);
            startActivity(intent);
        });
    }
}