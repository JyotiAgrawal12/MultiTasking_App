package com.example.multitaskingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;


public class Calculator extends AppCompatActivity {
    Button b1,b2,b3,b4,b5,b6;
    EditText e1,e2;
    TextView t1;
    TextToSpeech ts;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        b1 = (Button)findViewById(R.id.button22);
        b2 = (Button)findViewById(R.id.button23);
        b3 = (Button)findViewById(R.id.button24);
        b4 = (Button)findViewById(R.id.button25);
        b5 = (Button)findViewById(R.id.button26);
        e1 = (EditText)findViewById(R.id.editTexta);
        e2 = (EditText)findViewById(R.id.editTextb);
        t1 = (TextView)findViewById(R.id.textViewa);
        b6 = (Button)findViewById(R.id.button27);
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent  i = new Intent(Calculator.this,MainActivity.class);
                startActivity(i);
                finish();
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent k = new Intent(Calculator.this,Log.class);
                startActivity(k);
                finish();
            }
        });
        ts = new TextToSpeech(this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int i) {
                ts.setLanguage(Locale.ENGLISH);
                ts.setSpeechRate(0.5f);

            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1 = e1.getText().toString();
                ts.speak(s1, TextToSpeech.QUEUE_FLUSH, null);
                String s2 = e2.getText().toString();
                ts.speak(s2, TextToSpeech.QUEUE_FLUSH, null);
                Integer i1 = Integer.parseInt(s1);
                Integer i2 = Integer.parseInt(s2);
                Integer i3 = i1 + i2;
                String s3 = Integer.toString(i3);
                t1.setText(s3);
                ts.speak(s3, TextToSpeech.QUEUE_FLUSH, null);
                Toast.makeText(Calculator.this, "Addition"+i3, Toast.LENGTH_SHORT).show();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String w1 = e1.getText().toString();
                ts.speak(w1, TextToSpeech.QUEUE_FLUSH, null);
                String w2 = e2.getText().toString();
                ts.speak(w2, TextToSpeech.QUEUE_FLUSH, null);
                Integer i1 = Integer.parseInt(w1);
                Integer i2 = Integer.parseInt(w2);
                Integer i3 = i1 - i2;
                String w3 = Integer.toString(i3);
                t1.setText(w3);
                ts.speak(w3, TextToSpeech.QUEUE_FLUSH, null);
                Toast.makeText(Calculator.this, "Subtraction"+i3, Toast.LENGTH_SHORT).show();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1 = e1.getText().toString();
                ts.speak(s1, TextToSpeech.QUEUE_FLUSH, null);
                String s2 = e2.getText().toString();
                ts.speak(s2, TextToSpeech.QUEUE_FLUSH, null);
                Integer i1 = Integer.parseInt(s1);
                Integer i2 = Integer.parseInt(s2);
                Integer i3 = i1 * i2;
                String s3 = Integer.toString(i3);
                t1.setText(s3);
                ts.speak(s3, TextToSpeech.QUEUE_FLUSH, null);
                Toast.makeText(Calculator.this, "Multipilication"+i3, Toast.LENGTH_SHORT).show();
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1 = e1.getText().toString();
                ts.speak(s1, TextToSpeech.QUEUE_FLUSH, null);
                String s2 = e2.getText().toString();
                ts.speak(s2, TextToSpeech.QUEUE_FLUSH, null);
                Integer i1 = Integer.parseInt(s1);
                Integer i2 = Integer.parseInt(s2);
                Integer i3 = i1 / i2;
                String s3 = Integer.toString(i3);
                t1.setText(s3);
                ts.speak(s3, TextToSpeech.QUEUE_FLUSH, null);
                Toast.makeText(Calculator.this, "Division"+i3, Toast.LENGTH_SHORT).show();
            }
        });
    }
}



