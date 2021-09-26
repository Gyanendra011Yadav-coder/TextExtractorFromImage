package com.example.textfetchorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;


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
        if(checkSelfPermission(Manifest.permission.CAMERA)!=
                PackageManager.PERMISSION_GRANTED) {

        }
    }

    public void doProcess(View view) {
    }
}