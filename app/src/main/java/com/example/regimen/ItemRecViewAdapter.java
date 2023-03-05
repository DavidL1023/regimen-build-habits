package com.example.regimen;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ItemRecViewAdapter extends RecyclerView.Adapter<ItemRecViewAdapter.ViewHolder>{

    Context context;
    private ArrayList<Item> items = new ArrayList<>();

    public ItemRecViewAdapter(Context context, ArrayList<Item> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item, parent, false);
        return new ViewHolder(view).linkAdapter(this);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Item item = items.get(position);
        holder.itemName.setText(item.getName());
        holder.itemDate.setText(item.getDate());
        holder.itemGroup.setText(item.getGroup());
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{

        //initializers
        TextView itemName;
        TextView itemDate;
        TextView itemGroup;
        private ItemRecViewAdapter adapter;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            //find by id AND set functionality for edit and delete
            itemName = itemView.findViewById(R.id.itemName);
            itemDate = itemView.findViewById(R.id.itemDate);
            itemGroup = itemView.findViewById(R.id.itemGroup);

            itemView.findViewById(R.id.itemDelete).setOnClickListener(view -> {
                adapter.items.remove(getAdapterPosition());
                adapter.notifyItemRemoved(getAdapterPosition());
            });

            itemView.findViewById(R.id.itemEdit).setOnClickListener(view -> {
                //stuff
            });

        }

        public ViewHolder linkAdapter(ItemRecViewAdapter adapter){
            this.adapter = adapter;
            return this;
        }

    }
}
