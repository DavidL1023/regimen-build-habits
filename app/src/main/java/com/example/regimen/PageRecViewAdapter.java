package com.example.regimen;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class PageRecViewAdapter extends RecyclerView.Adapter<PageRecViewAdapter.ViewHolder>{

    Context context;
    private ArrayList<Page> pages = new ArrayList<>();

    public PageRecViewAdapter(Context context, ArrayList<Page> pages) {
        this.context = context;
        this.pages = pages;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.page, parent, false);
        return new ViewHolder(view).linkAdapter(this);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Page page = pages.get(position);
        holder.pageTitle.setText(page.getTitle());
    }

    @Override
    public int getItemCount() {
        return pages.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{

        //initializers
        TextView pageTitle;
        private PageRecViewAdapter adapter;

        public ViewHolder(@NonNull View pageView) {
            super(pageView);

            //find by id AND set functionality for edit and delete
            pageTitle = pageView.findViewById(R.id.pageName);

            itemView.findViewById(R.id.pageDelete).setOnClickListener(view -> {
                adapter.pages.remove(getAdapterPosition());
                adapter.notifyItemRemoved(getAdapterPosition());
            });


        }

        public ViewHolder linkAdapter(PageRecViewAdapter adapter){
            this.adapter = adapter;
            return this;
        }

    }
}
