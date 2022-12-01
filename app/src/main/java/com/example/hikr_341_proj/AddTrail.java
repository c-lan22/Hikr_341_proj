package com.example.hikr_341_proj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AddTrail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_trail);


        Intent receiveIntent = new Intent(Intent.ACTION_GET_CONTENT);


//        Uri uri = Uri.parse("geo:0,0?q=http://miruta.googlecode.com/files/miruta.kml");
//        Intent mapIntent = new Intent(Intent.ACTION_VIEW, uri);
        //Add KML file button
        Button Login= (Button)findViewById(R.id.AddKMLfile);
        //Intent KMLIntent = new Intent(Intent.ACTION_OPEN_DOCUMENT);
        Login.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                receiveIntent.setType("*/*");
                String[] mimetypes = {"application/vnd.google-earth.kml+xml"};
                receiveIntent.putExtra(Intent.EXTRA_MIME_TYPES, mimetypes);
                //startActivity(KMLIntent);
                startActivity(receiveIntent);
                //File newKML = new File(receiveIntent.getExtras());



                Bundle bundleKML = receiveIntent.getExtras();
                //bundleKML.getSerializable();


            }
        });


        Button Submit = (Button)findViewById(R.id.SubmitButt);
        Login.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                //save


                finish();
            }
        });


    }
}