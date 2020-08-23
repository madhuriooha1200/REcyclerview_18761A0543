MainActivity.java:
        package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    RecyclerView rv;
    int [] images ={R.drawable.img1, R.drawable.img11,R.drawable.img12,R.drawable.img4,R.drawable.img5,
            R.drawable.img6,R.drawable.img7,R.drawable.img8,R.drawable.ic_launcher_background,
            R.drawable.ic_launcher_foreground,R.drawable.img9,R.drawable.img10};
    String [] versions = {"madhu","rams","jyo","donut","eclair","Froyo","gingerbread","Honeycomb",
            "ic_launcher_background","ic_launcher_foreground","Ramya","Jellubean"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rv = findViewById(R.id.recycler);
        rv.setAdapter(new MyDataAdapter(this,images,versions));
        // rv.setLayoutManager(new LinearLayoutManager(this));
        rv.setLayoutManager(new GridLayoutManager(this,2));
        // rv.setLayoutManager(new StaggeredGridLayoutManager(2,1));
    }
}

