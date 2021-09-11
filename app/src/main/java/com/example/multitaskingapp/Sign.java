package com.example.multitaskingapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class Sign extends AppCompatActivity {
    EditText e1,e2;
    Button b1,b2;
    FirebaseAuth firebaseAuth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign);
        e1=(EditText)findViewById(R.id.editText3);
        e2=(EditText)findViewById(R.id.editText4);
        b1=(Button)findViewById(R.id.button3);
        b2=(Button)findViewById(R.id.button4);
        firebaseAuth=FirebaseAuth.getInstance();

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1=e1.getText().toString().trim();
                String s2=e2.getText().toString();

                if(s1.isEmpty()){
                    e1.setError("fill username");
                    return;
                }
                else{
                    if(s2.isEmpty()){
                        e2.setError("fill password");
                        return;

                    }
                }
                firebaseAuth.createUserWithEmailAndPassword(s1,s2).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull @org.jetbrains.annotations.NotNull Task<AuthResult> task) {
                        if(task.isSuccessful()){
                            Toast.makeText(Sign.this, "sign up done", Toast.LENGTH_SHORT).show();
                            Intent i=new Intent(Sign.this,MainActivity.class);
                            startActivity(i);
                            finish();

                        }
                        else{
                            Toast.makeText(Sign.this, "already exist", Toast.LENGTH_SHORT).show();
                            Intent j=new Intent(Sign.this,MainActivity.class);
                            startActivity(j);
                            finish();
                        }

                    }
                });
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k=new Intent(Sign.this,MainActivity.class);
                startActivity(k);
                finish();

            }
        });
    }
}