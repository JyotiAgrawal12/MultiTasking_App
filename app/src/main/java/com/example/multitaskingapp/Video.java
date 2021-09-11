package com.example.multitaskingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class Video extends AppCompatActivity {
    Button b1,b2,b3;
    Uri u1;                             //used to store video

    MediaController m1;   //for controlling video
    VideoView v1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);
        b1=(Button)findViewById(R.id.button29);
        b2=(Button)findViewById(R.id.button30);
        b3=(Button)findViewById(R.id.button31);
        v1=(VideoView)findViewById(R.id.videoView);
        m1=new MediaController(this);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1=new Intent(MediaStore.ACTION_VIDEO_CAPTURE);
                startActivityForResult(i1,0);

            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Video.this,Options.class);
                startActivity(i);
                finish();

            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent j=new Intent(Video.this,MainActivity.class);
                startActivity(j);
                finish();

            }
        });
    }
}



