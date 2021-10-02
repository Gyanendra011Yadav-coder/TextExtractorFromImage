package com.example.textfetchorapp;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.provider.MediaStore;
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
        //Code to Open The Camera=> By Creating An Intent Object
        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        //This function Will Be Taking the Result from the intent and will be passing to process further.
        startActivityForResult(intent,404);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable  Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Bundle bundle = data.getExtras();
        //Now we will be Extracting the Image Using Bundles and will e be storing it to the Bitmap.
        Bitmap bitmap=(Bitmap) bundle.get("data");
        //seting the image in the imageView
        imageView.setImageBitmap(bitmap);
        //process the image to extract the Text


    }
}