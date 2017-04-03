package com.example.gabi.quiz;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button Bstart = (Button) findViewById(R.id.buttonStart);
        Bstart.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Context context;
                context = getApplicationContext();
                Intent intent = new Intent(context, Pytania.class);
                startActivity(intent);
            }


        });


    }
}
