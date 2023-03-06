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

public class GroupsFragment extends Fragment {

    public GroupsFragment() {
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
        return inflater.inflate(R.layout.fragment_groups, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        //initializers
        ArrayList<Group> itemArrayList = new ArrayList<>();
        Group item = new Group("Group", "Red");
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
        GroupRecViewAdapter adapter = new GroupRecViewAdapter(getContext(), itemArrayList);
        recyclerView.setAdapter(adapter);

    }

}