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

import org.jetbrains.annotations.NotNull;

public class MainActivity extends AppCompatActivity {
    EditText e1,e2;
    Button b1,b2;
    FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=(EditText)findViewById(R.id.editText);
        e2=(EditText)findViewById(R.id.editText2);
        b1=(Button)findViewById(R.id.button);
        b2=(Button)findViewById(R.id.button2);
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
                else {
                    if (s2.isEmpty()) {
                        e2.setError("fill password");
                        return;

                    }
                }

                firebaseAuth.signInWithEmailAndPassword(s1,s2).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull @NotNull Task<AuthResult> task) {
                        if(task.isSuccessful()){
                            Toast.makeText(MainActivity.this, "Login done", Toast.LENGTH_SHORT).show();
                            Intent i=new Intent(MainActivity.this,Log.class);
                            startActivity(i);
                            finish();
                        }
                        else{

                            Toast.makeText(MainActivity.this, "mismatch", Toast.LENGTH_SHORT).show();
                            Intent j=new Intent(MainActivity.this,Sign.class);
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
                Intent k=new Intent(MainActivity.this,Sign.class);
                startActivity(k);
                finish();
            }
        });
    }
}