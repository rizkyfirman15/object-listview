package com.example.uas_piksi_2020;

/**
 * Created by rizkyfirman15 on 2019-11-16
 */
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class UsersAdapter extends BaseAdapter {

    private final Context context;
    private ArrayList<Users> users;

    public void setData(ArrayList<Users> news) {
        this.users = news;
    }

    public UsersAdapter(Context context) {
        this.context = context;
        this.users = new ArrayList<>();
    }

    @Override
    public int getCount() {
        return users.size();
    }

    @Override
    public Object getItem(int i) {
        return users.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = LayoutInflater.from(context).inflate(R.layout.users_item, viewGroup,
                    false);
        }
        ViewHolder viewHolder = new ViewHolder(view);
        Users users = (Users) getItem(i);
        viewHolder.bind(users);
        return view;
    }

    private class ViewHolder {
        private TextView tvTitle;
        private TextView tvDate;
        private ImageView imgUsers;

        ViewHolder(View view) {
            tvTitle = view.findViewById(R.id.tvTitle);
            tvDate = view.findViewById(R.id.tvDate);
            imgUsers = view.findViewById(R.id.imgUsers);
        }

        void bind(Users users) {
            tvTitle.setText(users.getTitle());
            tvDate.setText(users.getDate());
            imgUsers.setImageResource(users.getPhoto());
        }
    }
}
