package com.example.pokemon;

import android.app.ListActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String[]attraction = {"Generation 1", "Generation 2", "Generation 3", "Generation 4","Generation 5"};

        setListAdapter(new ArrayAdapter<String>(this,R.layout.activity_main,R.id.poke,attraction));

    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        switch (position){
            case 0:
                startActivity(new Intent(MainActivity.this, gen1.class));
                break;
            case 1:
                startActivity(new Intent(MainActivity.this, gen2.class));
                break;
            case 2:
                startActivity(new Intent(MainActivity.this, gen3.class));
                break;
            case 3:
                startActivity(new Intent(MainActivity.this, gen4.class));
                break;
            case 4:
                startActivity(new Intent(MainActivity.this, gen5.class));
                break;
        }
    }
}
