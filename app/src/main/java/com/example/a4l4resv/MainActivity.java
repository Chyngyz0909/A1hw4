package com.example.a4l4resv;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    MainAdapter adapter;
    Button btn;
    EditText editText1,editText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.btn);


        recyclerView = findViewById(R.id.recycler);
        adapter= new MainAdapter();
        recyclerView.setAdapter(adapter);
        RecyclerView.LayoutManager manager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(manager);
        editText1 = findViewById(R.id.edt);
        editText2 = findViewById(R.id.edt2);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String title = editText1.getText().toString();
                String description = editText2.getText().toString();
                ItemModel model = new ItemModel(title,description);
                editText1.setText("");
                editText2.setText("");
                adapter.addModel(model);
            }
        });


    }
}