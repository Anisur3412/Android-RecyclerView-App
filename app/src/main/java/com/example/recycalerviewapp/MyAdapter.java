package com.example.recycalerviewapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;


public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

final List<ModelClass> nameList;

    public MyAdapter(List<ModelClass> nameList) {
        this.nameList = nameList;
    }

    @NonNull
    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_design,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        int imageId = nameList.get(position).getImgss();
        String name =  nameList.get(position).getTextView();
        String desc =  nameList.get(position).getTextView2();
        holder.setData(imageId,name,desc);

    }

    @Override
    public int getItemCount() {
        return nameList.size();
    }


    public static class ViewHolder extends RecyclerView.ViewHolder {
        final ImageView imageView;
        final TextView names,descr;


        public  ViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.imageView2);
            names = itemView.findViewById(R.id.textView2);
            descr = itemView.findViewById(R.id.textView3);
        }

        public void setData(int imageId, String name, String desc) {
            imageView.setImageResource(imageId);
            names.setText(name);
            descr.setText(desc);
        }
    }
}
