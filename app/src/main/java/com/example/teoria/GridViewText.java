package com.example.teoria;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class GridViewText extends AppCompatActivity {

    public static String EXTRA_TEXT_DETAIL = "com.example.teoria.EXTRA_TEXT_DETAIL";
    private GridView gridView;

    List<String > list = new ArrayList<>();
    ArrayAdapter<String > dataAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view_text);

        gridView = findViewById(R.id.gridView);

        for(int i =0 ; i<20;i++){
            list.add("ExGrid: " + i);
        }


        //adaptador amb les dades a mostrar
        dataAdapter = new ArrayAdapter<>(
                this,
                R.layout.support_simple_spinner_dropdown_item,
                list
        );
        gridView.setAdapter(dataAdapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                Toast.makeText(GridViewText.this,"click: " + position,Toast.LENGTH_SHORT).show();
            }
        });
        gridView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(GridViewText.this,"Long click: " + i,Toast.LENGTH_SHORT).show();

                return false;
            }
        });
    }


}