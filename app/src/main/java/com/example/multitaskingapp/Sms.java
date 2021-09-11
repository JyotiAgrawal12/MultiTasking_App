package com.example.multitaskingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Sms extends AppCompatActivity {

    EditText e1,e2;
    Button b1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sms);

        e1=(EditText)findViewById(R.id.editTextp);
        e2=(EditText)findViewById(R.id.editTextq);
        b1=(Button)findViewById(R.id.button46);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.M){

                    if(checkSelfPermission(Manifest.permission.SEND_SMS)== PackageManager.PERMISSION_GRANTED){
                        sendSMS();;
                    }else{
                        requestPermissions(new String[]{Manifest.permission.SEND_SMS},1);
                    }
                }

            }
        });



    }

    private void sendSMS(){

        String a =e1.getText().toString().trim();
        String b= e2.getText().toString().trim();

        try {
            SmsManager smsManager = SmsManager.getDefault();
            smsManager.sendTextMessage(a,null,b,null,null);
            Toast.makeText(this, "message is send", Toast.LENGTH_SHORT).show();

        } catch(Exception e){
            e.printStackTrace();
            Toast.makeText(this, "failed to send message", Toast.LENGTH_SHORT).show();
        }




    }
}