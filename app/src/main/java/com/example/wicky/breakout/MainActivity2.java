package com.example.wicky.breakout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
// code in here
    public void Hurr(View view){
        Intent DaHurricane = new Intent(this, hurricane.class);

         startActivity(DaHurricane);
    }

    public void Earthquake(View view){
        Intent mundo = new Intent(this, EarthQuake.class);

        startActivity(mundo);
    }

}
