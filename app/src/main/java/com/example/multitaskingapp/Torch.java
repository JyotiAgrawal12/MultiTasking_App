package com.example.multitaskingapp;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
public class Torch extends AppCompatActivity {
    Button b1,b2,b3,b4;
    CameraManager cm ;
    private boolean cmr = false;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_torch);
        b1 = (Button)findViewById(R.id.button38);
        b2 = (Button)findViewById(R.id.button39);
        b3 = (Button)findViewById(R.id.button40);
        b4 = (Button)findViewById(R.id.button41);
        cm = (CameraManager)getSystemService(CAMERA_SERVICE);




        b1.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View view) {
                try {
                    String s1 = cm.getCameraIdList()[0];
                    cm.setTorchMode(s1, true);
                    cmr = true;
                } catch (CameraAccessException e) {
                }
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View view) {
                try {
                    String s2 = cm.getCameraIdList()[0];
                    cm.setTorchMode(s2,false);
                    cmr = false;
                }
                catch (CameraAccessException e){}
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Torch.this,Options.class);
                startActivity(i);
                finish();

            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent j = new Intent(Torch.this,MainActivity.class);
                startActivity(j);
                finish();

            }
        });
    }
}