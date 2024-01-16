package com.example.tugasliburan.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tugasliburan.R;

import java.util.ArrayList;

public class AdapterPlace extends RecyclerView.Adapter<AdapterPlace.MyViewHolder> {

    Context context;
    ArrayList<News> itemListArrayList;
    public AdapterPlace(Context context, ArrayList<News> itemListArrayList) {
        this.context = context;
        this.itemListArrayList = itemListArrayList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(context).inflate(R.layout.place_rv, parent, false);

        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        News item = itemListArrayList.get(position);

        holder.textView.setText(item.name);
        holder.imageView.setImageResource(item.image);

    }

    @Override
    public int getItemCount() {
        return itemListArrayList.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        ImageView imageView;
        TextView textView;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imagePlace);
            textView = itemView.findViewById(R.id.namePlace);
        }
    }
}
