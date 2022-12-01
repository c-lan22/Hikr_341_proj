package com.example.hikr_341_proj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.concurrent.TimeUnit;

public class AddTrail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_trail);


        Intent receiveIntent = new Intent(Intent.ACTION_GET_CONTENT);
        receiveIntent.setType("*/*");
        String[] mimetypes = {"application/vnd.google-earth.kml+xml"};
        receiveIntent.putExtra(Intent.EXTRA_MIME_TYPES, mimetypes);
        receiveIntent.addCategory(Intent.CATEGORY_OPENABLE);

        //set choosen file name
        TextView KmlFileName = (TextView) findViewById(R.id.KMLfileDescript);



                                                                                //Add KML file button
        Button Login= (Button)findViewById(R.id.AddKMLfile);
        Login.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

                //startActivity(KMLIntent);
                startActivity(receiveIntent);
                //File newKML = new File(receiveIntent.getExtras());
               //receiveIntent.getExtras();
//                finish();
//                Uri uri= receiveIntent.getData();
//                File file= new File(uri.getPath());

//                InputStream what =ContentResolver.openOutputStream(receiveIntent.getData());
//                  KmlFileName.setText(file.getName());
//
                try {
                    TimeUnit.SECONDS.sleep(3);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                KmlFileName.setText("KnoxMountain.kml");

//                //??
//                String filename = "output.kml";
//                String fileContents = "";
//                FileOutputStream outputStream; //allow a file to be opened for writing
//                FileInputStream inputStream;
//                try {
//                    inputStream = openFileInput((File) receiveIntent.getData());
//                    outputStream = openFileOutput(filename, Context.MODE_APPEND);
//                    outputStream.write(fileContents.getBytes());
//                    outputStream.close();
//                }
//                catch (Exception e) {
//                    e.printStackTrace();
//                }




                //bundleKML.getSerializable();


            }
        });


        Button Submit = (Button)findViewById(R.id.SubmitButt);
        Submit.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                //save


                finish();
            }
        });



    }
}