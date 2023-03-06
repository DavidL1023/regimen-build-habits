package com.example.regimen;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class GroupRecViewAdapter extends RecyclerView.Adapter<GroupRecViewAdapter.ViewHolder>{

    Context context;
    private ArrayList<Group> groups = new ArrayList<>();

    public GroupRecViewAdapter(Context context, ArrayList<Group> groups) {
        this.context = context;
        this.groups = groups;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.group, parent, false);
        return new ViewHolder(view).linkAdapter(this);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Group group = groups.get(position);
        holder.groupName.setText(group.getName());
    }

    @Override
    public int getItemCount() { return groups.size(); }

    public static class ViewHolder extends RecyclerView.ViewHolder{

        //initializers
        TextView groupName;
        private GroupRecViewAdapter adapter;

        public ViewHolder(@NonNull View groupView) {
            super(groupView);

            //find by id AND set functionality for edit and delete
            groupName = groupView.findViewById(R.id.groupName);

            groupView.findViewById(R.id.groupDelete).setOnClickListener(view -> {
                adapter.groups.remove(getAdapterPosition());
                adapter.notifyItemRemoved(getAdapterPosition());
            });


        }

        public ViewHolder linkAdapter(GroupRecViewAdapter adapter){
            this.adapter = adapter;
            return this;
        }

    }
}
