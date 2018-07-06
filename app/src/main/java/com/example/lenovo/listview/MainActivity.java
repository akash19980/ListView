package com.example.lenovo.listview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    int images[]={R.drawable.download1,R.drawable.download2,R.drawable.download3,R.drawable.download4,R.drawable.download5,R.drawable.download6};
    String arr[]={"Fnatic","NAVI","Optic Gaming","SK Gaming","Mouseeports","SpaceSoldiers"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=(ListView)findViewById(R.id.listview);
        ArrayList<HashMap<String ,String>>arraylist =new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
            HashMap<String, String>hashmap=new HashMap<>();
            hashmap.put("names",arr[i]);
            hashmap.put("images",images[i]+"");
            arraylist.add(hashmap);
           Log.d("val",arr[i]);
        }
        String[] from ={"names","images"};
        int[] to = {R.id.textView,R.id.imageView};
        SimpleAdapter simpleAdapter=new SimpleAdapter(this,arraylist,R.layout.textimage,from,to);
        listView.setAdapter(simpleAdapter);
  listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
      @Override
      public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
          Intent second=new Intent(MainActivity.this,Main2Activity.class);
          second.putExtra("Imageid",images[i]);
          startActivity(second);
      }
  });

    }

}
