package com.example.hikr_341_proj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MapView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map_view);

        //add trail button
        Button Login= (Button)findViewById(R.id.AddTrailButt);
        Intent addIntent = new Intent(this, AddTrail.class);
        Login.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                startActivity(addIntent);
            }
        });

        //Search button
        Button Search = (Button)findViewById(R.id.SearchButt);
        Intent searchIntent = new Intent(this, SearchTrail.class);
        Search.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                startActivity(searchIntent);
            }
        });
    }
}