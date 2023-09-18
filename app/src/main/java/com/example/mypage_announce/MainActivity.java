package com.example.mypage_announce;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1 = findViewById(R.id.tv1);
        tv1.setOnClickListener(view -> {
            Intent intent = new
                    Intent(getApplicationContext(),
                    ClickAnnounceActivity.class);
            startActivity(intent);
        });
    }
}