package com.verzeo.medicinemajorproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;

public class MainActivity5 extends AppCompatActivity {

    ImageView hosp,home,calender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(getWindow().FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main5);
        

        home = findViewById(R.id.home2);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMainActivity2();
            }
        });

        calender = findViewById(R.id.calender2);
        calender.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMainActivity6();
            }
        });

        hosp = findViewById(R.id.hosp2);
        hosp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMainActivity7();
            }
        });


        ImageView buton = findViewById(R.id.back2);
        buton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                openMainActivity2();

            }
        });}

    private void openMainActivity7() {
        Intent intent = new Intent(this, MainActivity7.class);
        startActivity(intent);
    }

    private void openMainActivity6() {
        Intent intent = new Intent(this, MainActivity6.class);
        startActivity(intent);
    }

    private void openMainActivity2() {
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }

    @Override
    public void onBackPressed() {
        openMainActivity2();
    }
}