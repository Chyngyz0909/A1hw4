package com.example.a4l4resv;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainAdapter extends RecyclerView.Adapter<MainViewHolder> {

    ArrayList<ItemModel> dataList;

    public  MainAdapter(){

        dataList = new ArrayList<>();
//        for (int i=0; i<=20; i++){
//            dataList.add ("Иван"+i);
//            dataList.add("Иванов"+  i);
//        }
    }
    public void addModel(ItemModel text){
        dataList.add(text);
        notifyDataSetChanged();
    }


    @NonNull
    @Override
    public MainViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.item_list,parent,false);
        MainViewHolder mainViewHolder = new MainViewHolder(view);
        return mainViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MainViewHolder holder, int position) {
        holder.onBind(dataList.get(position));

        Log.e("TAG", String.valueOf(dataList.size()));

    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }
}
