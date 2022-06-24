package com.HEOA.ordinario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    private ImageButton ubicarme,ubicarme2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ubicarme=(ImageButton) findViewById(R.id.ubicarme);

        ubicarme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(MainActivity.this,MapsActivity.class);
                startActivity(intent);

            }
        });



        ubicarme2=(ImageButton) findViewById(R.id.ubicarme2);

        ubicarme2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(MainActivity.this,MapsActivity2.class);
                startActivity(intent);
            }
        });

    }
}