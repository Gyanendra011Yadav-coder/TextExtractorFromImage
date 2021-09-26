package com.example.textfetchorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;




public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Finding Image By Id
        imageView=findViewById(R.id.imageId);
        //Finding The TextById
        textView=findViewById(R.id.textAfterExtract);

        //Checking, if the Permission of Camera is Granted or not
        if(checkSelfPermission(Manifest.permission.CAMERA)!=
                PackageManager.PERMISSION_GRANTED) {
            //Showig the Error to the user and Making Providing the Acces to The Camera.
                requestPermissions(new String[]{Manifest.permission.CAMERA},404);
        }
    }

    public void doProcess(View view) {
    }
}