package com.example.multitaskingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.bluetooth.BluetoothAdapter;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Bluetooth extends AppCompatActivity {
    Button b1,b2,b3,b4;
    BluetoothAdapter ba;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bluetooth);

        b1=(Button)findViewById(R.id.button7);
        b2=(Button)findViewById(R.id.button8);
        b3=(Button)findViewById(R.id.button11);
        b4=(Button)findViewById(R.id.button12);
        ba=BluetoothAdapter.getDefaultAdapter();

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ba.enable();

            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ba.disable();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Bluetooth.this,Options.class);
                startActivity(i);
                finish();
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent j=new Intent(Bluetooth.this,MainActivity.class);
                startActivity(j);
                finish();
            }
        });
    }
}