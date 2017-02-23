package com.example.recyclerview0220;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.List;

/**
 * Created by 李志军 on 2017/2/20.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder>{

   private List<Dog> dogList;

    public MyAdapter(List<Dog> dogList){
        this.dogList = dogList;
    }

    static class ViewHolder extends RecyclerView.ViewHolder{
        ImageView dogImg;

        public ViewHolder(View itemView) {
            super(itemView);
            dogImg = (ImageView) itemView.findViewById(R.id.dogImg);

        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.dog_item,parent,false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Dog dog = dogList.get(position);
        holder.dogImg.setImageResource(dog.imgId);
    }

    @Override
    public int getItemCount() {
        return dogList.size();
    }


}
