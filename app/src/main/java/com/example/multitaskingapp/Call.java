package com.example.multitaskingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class Call extends AppCompatActivity {

    EditText e1;
    Button b1,b2,b3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call);

        e1=(EditText)findViewById(R.id.editTextttttt);
        b1=(Button)findViewById(R.id.button42);
        b2=(Button)findViewById(R.id.button43);
        b3=(Button)findViewById(R.id.button51);

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String phone = e1.getText().toString();


                if (phone.isEmpty()) {
                    Toast.makeText(Call.this, "enter mob number", Toast.LENGTH_SHORT).show();
                } else {
                    String s = "tel" + phone;


                    Intent intent = new Intent(Intent.ACTION_CALL);
                    intent.setData(Uri.parse(s));
                    startActivity(intent);
                }
            }
        });



        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Call.this,Log.class);
                startActivity(i);
                finish();
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent j=new Intent(Call.this,MainActivity.class);
                startActivity(j);
                finish();
            }
        });
    }
}