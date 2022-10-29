package com.verzeo.medicinemajorproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity7 extends AppCompatActivity {

    ImageView me,home,calender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(getWindow().FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main7);

        me = findViewById(R.id.user4);
        me.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMainActivity5();
            }
        });

        calender = findViewById(R.id.calender4);
        calender.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMainActivity6();
            }
        });

        home = findViewById(R.id.home4);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMainActivity2();
            }
        });



        ImageView buton = findViewById(R.id.back);
        buton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                openMainActivity2();

            }
        });}

    private void openMainActivity6() {
        Intent intent = new Intent(this, MainActivity6.class);
        startActivity(intent);
    }

    private void openMainActivity5() {
        Intent intent = new Intent(this, MainActivity5.class);
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