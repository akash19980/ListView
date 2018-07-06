package com.example.lenovo.listview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        imageView=(ImageView)findViewById(R.id.imageView2);
        Intent intent=getIntent();
        Toast.makeText(this, intent.getIntExtra("Imageid",0)+"", Toast.LENGTH_SHORT).show();
        imageView.setImageResource(intent.getIntExtra("Imageid",0));

    }

}

