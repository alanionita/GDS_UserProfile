package com.example.alanionita.userprofile;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView name = findViewById(R.id.name);
        TextView birthday = findViewById(R.id.birthday);
        TextView country = findViewById(R.id.country);

        name.setText("Elon Musk");
        birthday.setText("28th June 1971");
        country.setText("South Africa");

        ImageView picture_profile = findViewById(R.id.picture_profile);
        picture_profile.setImageResource(R.drawable.elon_musk);

        name.setTextSize(36);
        birthday.setTextSize(24);
        country.setTextSize(24);

        name.setTextColor(Color.BLACK);
        birthday.setTextColor(Color.RED);
        country.setTextColor(Color.BLUE);
    }
}
