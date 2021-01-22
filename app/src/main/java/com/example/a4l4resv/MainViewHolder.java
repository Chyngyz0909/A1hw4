package com.example.a4l4resv;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MainViewHolder extends RecyclerView.ViewHolder {

    TextView textView;
    TextView desc;

    public MainViewHolder(@NonNull View itemView) {
        super(itemView);

        textView = itemView.findViewById(R.id.tv);
        desc = itemView.findViewById(R.id.desc);
    }

    public void onBind(ItemModel model){

        textView.setText(model.title);
        desc.setText(model.description);


    }
}
