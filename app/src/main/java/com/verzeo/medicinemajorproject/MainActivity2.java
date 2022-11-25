package com.verzeo.medicinemajorproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;


import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;


public class MainActivity2 extends AppCompatActivity {
    public FloatingActionButton fab;

    ImageView me,hoss,calender;
    TextView d1,t1;
    EditText nam, dose;

    RecyclerView recyclerView;
    DatabaseReference database;
    Medicinelist medicinelist;
    ArrayList<UserHelperClass> list;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(getWindow().FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main2);

        t1 = findViewById(R.id.time);
        d1 = findViewById(R.id.date);
        nam = findViewById(R.id.name);
        dose = findViewById(R.id.dose);

        recyclerView = findViewById(R.id.medslist);
        database = FirebaseDatabase.getInstance().getReference("Medicine");
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        list = new ArrayList<>();
        medicinelist = new Medicinelist(this,list);
        recyclerView.setAdapter(medicinelist);


        database.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {

                for(DataSnapshot dataSnapshot: snapshot.getChildren()){
                    UserHelperClass userHelperClass = dataSnapshot.getValue(UserHelperClass.class);
                    list.add(userHelperClass);


                }

                medicinelist.notifyDataSetChanged();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });


        me = findViewById(R.id.user);
        me.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMainActivity5();
            }
        });

        calender = findViewById(R.id.calender);
        calender.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMainActivity6();
            }
        });

        hoss = findViewById(R.id.hosp);
        hoss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMainActivity7();
            }
        });

        fab = findViewById(R.id.addreminde);
        fab.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){ openMainActivity3();
            }
        });
    }

    @Override
    public void onBackPressed() {
        moveTaskToBack(true);
        android.os.Process.killProcess(android.os.Process.myPid());
        System.exit(1);
    }

    private void openMainActivity7() {
        Intent intent = new Intent(this, MainActivity7.class);
        startActivity(intent);
    }

    private void openMainActivity6() {
        Intent intent = new Intent(this, MainActivity6.class);
        startActivity(intent);

    }

    private void openMainActivity5() {
        Intent intent = new Intent(this, MainActivity5.class);
        startActivity(intent);
    }

    public void openMainActivity3( ) {
                Intent intent = new Intent(this,MainActivity3.class);
                startActivity(intent);


    }


}