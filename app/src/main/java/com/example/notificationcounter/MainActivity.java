package com.example.notificationcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.nex3z.notificationbadge.NotificationBadge;

public class MainActivity extends AppCompatActivity {
    int count = 0;
    NotificationBadge mbadge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mbadge = findViewById(R.id.badge);
        ImageView imageView20 = findViewById(R.id.imageView20);

        mbadge.setNumber(20);
    }
}