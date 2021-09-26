package com.example.textfetchorapp;

import androidx.appcompat.app.AppCompatActivity;
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
    }

    public void doProcess(View view) {
    }
}