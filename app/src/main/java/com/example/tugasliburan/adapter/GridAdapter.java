package com.example.tugasliburan.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.tugasliburan.R;

public class GridAdapter extends BaseAdapter {

    Context context;

    String []foodName;

    int []image;

    LayoutInflater inflater;

    public GridAdapter(Context context, String[] foodName, int[] image) {
        this.context = context;
        this.foodName = foodName;
        this.image = image;
    }
    @Override
    public int getCount() {
        return foodName.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (inflater == null)
            inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if (convertView == null){
            convertView = inflater.inflate(R.layout.food_rv, null);
        }

        ImageView imageView = convertView.findViewById(R.id.imageFood);
        TextView textView = convertView.findViewById(R.id.textView);

        imageView.setImageResource(image[position]);
        textView.setText(foodName[position]);
        return convertView;
    }
}
