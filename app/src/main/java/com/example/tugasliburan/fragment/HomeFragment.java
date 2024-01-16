package com.example.tugasliburan.fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.tugasliburan.R;
import com.example.tugasliburan.adapter.AdapterPlace;
import com.example.tugasliburan.adapter.News;

import java.util.ArrayList;

public class HomeFragment extends Fragment {
    private ArrayList<News> itemListArayList;
    private String[] title;
    private int[] image;
    private RecyclerView recyclerView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_home, container, false);
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        dataInitalize();
        
        recyclerView = view.findViewById(R.id.place);
        LinearLayoutManager layoutManager = new LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        AdapterPlace adapterPlace = new AdapterPlace(getActivity(), itemListArayList);
        recyclerView.setAdapter(adapterPlace);
        adapterPlace.notifyDataSetChanged();


    }

    private void dataInitalize() {


        itemListArayList = new ArrayList<News>();

        title = new String[]{
                getString(R.string.place1),
                getString(R.string.place2),
                getString(R.string.place3),
                getString(R.string.place4),
        };
        
        image = new int[]{
                R.drawable.place1,
                R.drawable.place2,
                R.drawable.place3,
                R.drawable.place4,
        };

        for(int i = 0; i < title.length; i++){
            News item = new News(title[i], image[i]);
            itemListArayList.add(item);
        }
    }
}