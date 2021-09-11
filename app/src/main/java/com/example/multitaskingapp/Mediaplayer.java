package com.example.multitaskingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.media.MediaPlayer;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import javax.crypto.spec.OAEPParameterSpec;


public class Mediaplayer extends AppCompatActivity {
    Button b1,b2,b3,b4;
    MediaPlayer m1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mediaplayer);
        b1= (Button)findViewById(R.id.button34);
        b2=(Button)findViewById(R.id.button35);
        b3= (Button)findViewById(R.id.button36);
        b4=(Button)findViewById(R.id.button37);

        m1= MediaPlayer.create(this,R.raw.song);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                m1.start();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                m1.pause();
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Mediaplayer.this,Log.class);
                startActivity(i);
                finish();

            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent j=new Intent(Mediaplayer.this,MainActivity.class);
                startActivity(j);
                finish();
            }
        });



    }
}