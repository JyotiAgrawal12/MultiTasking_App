package com.example.multitaskingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Log extends AppCompatActivity {
    Button b1,b2,b3,b4,b5,b6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log);

        b1=(Button)findViewById(R.id.button18);
        b2=(Button)findViewById(R.id.button19);
        b3=(Button)findViewById(R.id.button20);
        b4=(Button)findViewById(R.id.button21);
        b5=(Button)findViewById(R.id.button44);
        b6=(Button)findViewById(R.id.button45);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Log.this,Calculator.class);
                startActivity(i);
                finish();



            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent j=new Intent(Log.this,Options.class);
                startActivity(j);
                finish();


            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k=new Intent(Log.this,Mediaplayer.class);
                startActivity(k);
                finish();
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent l=new Intent(Log.this,Web.class);
                startActivity(l);
                finish();
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent n=new Intent(Log.this,Call.class);
                startActivity(n);
                finish();

            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent m=new Intent(Log.this,Sms.class);
                startActivity(m);
                finish();

            }
        });



    }
}