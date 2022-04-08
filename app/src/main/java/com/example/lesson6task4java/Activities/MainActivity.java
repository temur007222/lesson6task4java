package com.example.lesson6task4java.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Context;
import android.os.Bundle;
import com.example.lesson6task4java.Adapters.RecyclerAdapter;
import com.example.lesson6task4java.Moduls.User;
import com.example.lesson6task4java.R;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    Context context;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();

        List<User> users = prepareUserList();
        refreshAdapter((ArrayList<User>) users);
    }

    public void initView() {
        context = this;
        recyclerView =findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new GridLayoutManager(context, 1));

    }

    public void refreshAdapter(ArrayList<User> users) {
        RecyclerAdapter adapter = new RecyclerAdapter(context, users);
        recyclerView.setAdapter(adapter);
        recyclerView.setNestedScrollingEnabled(false);
    }

    public List<User> prepareUserList() {
        List<User> users = new ArrayList<>();
        users.add(new User( "Button "));
        return users;
    }
}