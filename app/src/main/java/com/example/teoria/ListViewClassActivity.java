package com.example.teoria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class ListViewClassActivity extends AppCompatActivity {
    Item2 item1 = new Item2(R.drawable.,"Title 1","Sub",1);
    Item2 item2 = new Item2(R.drawable.,"Title 2","Sub",1);
    Item2 item3 = new Item2(R.drawable.,"Title 3","Sub",1);
    Item2 item4 = new Item2(R.drawable.,"Title 4","Sub",1);
    Item2 item5 = new Item2(R.drawable.,"Title 5","Sub",1);
    Item2 item6 = new Item2(R.drawable.,"Title 6","Sub",1);
    Item2 item7 = new Item2(R.drawable.,"Title 7","Sub",1);
    Item2 item8 = new Item2(R.drawable.,"Title 8","Sub",1);
    Item2 item9 = new Item2(R.drawable.,"Title 9","Sub",1);
    Item2 item10 = new Item2(R.drawable.,"Title 10","Sub",1);
    Item2 item11 = new Item2(R.drawable.,"Title 11","Sub",1);
    Item2 item12 = new Item2(R.drawable.,"Title 12","Sub",1);

    List<Item> item2List = new ArrayList<>();
    CustomAdapter customAdapter = new CustomAdapter(ListViewClassActivity.this,item2List);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_class);
    }

    private class CustomAdapter extends BaseAdapter {
        private Context context;
        private List< Item2> items;

        public CustomAdapter(Context context, List<Item2> items) {
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
            View viewclass = getLayoutInflater().inflate(R.layout.list_class_row,null);
            TextView textRow = view.findViewById(R.id.textRow);
            TextView textSubtitle = view.findViewById(R.id.textSubtitle);
            TextView textFrom = view.findViewById(R.id.textFrom);
            ImageView imageRow  = view.findViewById(R.id.imageRow);

            //textRow.setText(items.get(position).getItemName());
            textRow.setText(items.get(i).getItemName());
            imageRow.setImageResource(items.get(position));
            title.setText(items.get(i).getItemName());
            image.setImageResource(items.get(i).getImageName());
            return null;
        }
    }
}