package com.verzeo.medicinemajorproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {
    Animation topAnim, bottomAnim;
    ImageView cap,her;
    FirebaseAuth auth ;
        private static int SPLASH_SCREEN = 1500;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            requestWindowFeature(getWindow().FEATURE_NO_TITLE);
            this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
            getSupportActionBar().hide();
            setContentView(R.layout.activity_main);
            auth = FirebaseAuth.getInstance();


            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    if ( auth.getCurrentUser() != null) {
                        Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                        startActivity(intent);
                        finish();

                    }
                    else {
                        Intent intent = new Intent(MainActivity.this, login_page.class);
                        startActivity(intent);
                        finish();
                    }
//                    Toast.makeText(MainActivity.this, "made with ♥ by Sunidhi", Toast.LENGTH_LONG).show();
                }
            }, SPLASH_SCREEN);

    }

    
}