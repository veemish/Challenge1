package com.example.challange_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button about = findViewById(R.id.button2);
        Button profile = findViewById(R.id.button);
        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I = new Intent(MainActivity.this,Main2Activity.class);
                startActivity(I);


            }

        });

            profile.setOnClickListener((new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent H = new Intent( MainActivity.this, Main3Activity.class);
                    startActivity(H);
                }
            }));



    }



}
