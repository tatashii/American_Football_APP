package com.example.american_football_scores;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView miamiGoals=findViewById(R.id.tv2);
        final TextView dallasGoals=findViewById(R.id.tv4);
        Button miamiPoint_1=findViewById(R.id.bt1);
        Button miamiPoint_2=findViewById(R.id.bt2);
        Button miamiPoint_3=findViewById(R.id.bt3);
        Button miamiPoint_6=findViewById(R.id.bt4);
        Button dallasiPoint_1=findViewById(R.id.bt5);
        Button dallasiPoint_2=findViewById(R.id.bt6);
        Button dallasiPoint_3=findViewById(R.id.bt7);
        Button dallasiPoint_6=findViewById(R.id.bt8);

        Button reset=findViewById(R.id.reset);


   //******************************************************************

      miamiPoint_1.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
            String ss=  miamiGoals.getText().toString();
            int ii= Integer.parseInt(ss);
            miamiGoals.setText(ii+1+"");

          }
      });

        miamiPoint_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ss=  miamiGoals.getText().toString();
                int ii= Integer.parseInt(ss);
                miamiGoals.setText(ii+2+"");

            }
        });

        miamiPoint_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ss=  miamiGoals.getText().toString();
                int ii= Integer.parseInt(ss);
                miamiGoals.setText(ii+3+"");

            }
        });

        miamiPoint_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ss=  miamiGoals.getText().toString();
                int ii= Integer.parseInt(ss);
                miamiGoals.setText(ii+6+"");

            }
        });


        dallasiPoint_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ss=  dallasGoals.getText().toString();
                int ii= Integer.parseInt(ss);
                dallasGoals.setText(ii+1+"");

            }
        });

        dallasiPoint_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ss=  dallasGoals.getText().toString();
                int ii= Integer.parseInt(ss);
                dallasGoals.setText(ii+2+"");

            }
        });

        dallasiPoint_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ss=  dallasGoals.getText().toString();
                int ii= Integer.parseInt(ss);
                dallasGoals.setText(ii+3+"");

            }
        });

        dallasiPoint_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ss=  dallasGoals.getText().toString();
                int ii= Integer.parseInt(ss);
                dallasGoals.setText(ii+6+"");

            }
        });


        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                miamiGoals.setText(0 + "");

                dallasGoals.setText(0 + "");


            }
        });













    }
}
