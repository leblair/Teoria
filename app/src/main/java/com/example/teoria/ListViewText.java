package com.example.teoria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class ListViewText extends AppCompatActivity {
    public static String EXTRA_TEXT_DETAIL = "com.example.teoria.EXTRA_TEXT_DETAIL";
    private ListView listView;

List<String > list = new ArrayList<>();
ArrayAdapter<String > dataAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_text);

        listView = findViewById(R.id.listView);

        for(int i =0 ; i<20;i++){
            list.add("Ex: " + i);
        }


        //adaptador amb les dades a mostrar
        dataAdapter = new ArrayAdapter<>(
                this,
                R.layout.support_simple_spinner_dropdown_item,
                list
        );
        listView.setAdapter(dataAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                Toast.makeText(ListViewText.this,"click: " + position,Toast.LENGTH_SHORT).show();
            }
        });
        listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(ListViewText.this,"Long click: " + i,Toast.LENGTH_SHORT).show();

                return false;
            }
        });
    }

    private class CustomAdapter extends BaseAdapter{
    private Context context;
    private List < Item> items;

        public CustomAdapter(Context context, List<Item> items) {
            this.context = context;
            this.items = items;
        }

        @Override
        public int getCount() {
            return items.size();
        }

        @Override
        public Object getItem(int i) {
            return items.get(i);
        }

        @Override
        public long getItemId(int i) {
            return i;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {

            View myView = getLayoutInflater().inflate(R.layout.row_data4,null);
            TextView title = view.findViewById(R.id.textTitle);
            TextView subtitle = view.findViewById(R.id.textSubtitle);
            TextView price = view.findViewById(R.id.textFrom);

            title.setText(items.get(i).getItemName());
            image.setImageResource(items.get(i).getImageName());
            return null;
        }
    }
}