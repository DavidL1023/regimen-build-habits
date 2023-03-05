package com.example.regimen;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class HomeFragment extends Fragment {

    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        //initializers
        ArrayList<Item> itemArrayList = new ArrayList<>();
        Item item = new Item("Test", "Group", "1/1/12");
        itemArrayList.add(item);
        itemArrayList.add(item);
        itemArrayList.add(item);
        itemArrayList.add(item);
        itemArrayList.add(item);
        itemArrayList.add(item);
        itemArrayList.add(item);
        itemArrayList.add(item);
        itemArrayList.add(item);
        itemArrayList.add(item);
        itemArrayList.add(item);
        itemArrayList.add(item);
        itemArrayList.add(item);
        itemArrayList.add(item);

        RecyclerView recyclerView = view.findViewById(R.id.recyclerViewHome);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        ItemRecViewAdapter adapter = new ItemRecViewAdapter(getContext(), itemArrayList);
        recyclerView.setAdapter(adapter);

    }

}