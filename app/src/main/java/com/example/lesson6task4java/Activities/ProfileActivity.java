package com.example.lesson6task4java.Activities;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import com.example.lesson6task4java.Moduls.User;
import com.example.lesson6task4java.R;

public class ProfileActivity  extends AppCompatActivity {

    private static final String TAG = ProfileActivity.class.toString();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_activity);
        initView();
    }
    void initView(){
        TextView tv_detail = findViewById(R.id.tv_detail);
        User user = (User) getIntent().getSerializableExtra("member");
        Log.d(TAG, user.toString());

        tv_detail.setText(user.toString());
    }
}
