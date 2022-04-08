package com.example.lesson6task4java.Adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.example.lesson6task4java.Activities.ProfileActivity;
import com.example.lesson6task4java.Moduls.User;
import com.example.lesson6task4java.R;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.UserViewHolder> {

    Context context;
    ArrayList<User> users;

    public RecyclerAdapter(Context context, ArrayList<User> user){
        this.context = context;
        this.users = user;
    }

    @Override
    public int getItemCount() { return users.size(); }

    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new UserViewHolder(LayoutInflater.from(context).inflate(R.layout.item_member_list, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull UserViewHolder holder, int position) {
        User user = users.get(position);

        if (holder instanceof UserViewHolder) {
            TextView tv_lastname = ((UserViewHolder) holder).tv_lastName;
            tv_lastname.setText(user.getLastname());
        }
        holder.tv_lastName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                User user1 = new User("temur");
                Intent intent = new Intent(context, ProfileActivity.class);
                intent.putExtra("member", user1);
                context.startActivity(intent);
            }
        });
    }

    static public class UserViewHolder extends RecyclerView.ViewHolder {
        public View view;
        public TextView tv_lastName;

        public UserViewHolder(@NonNull View userView) {
            super(userView);
            this.view = userView;

            tv_lastName = view.findViewById(R.id.tv_lastName);
        }
    }
}
