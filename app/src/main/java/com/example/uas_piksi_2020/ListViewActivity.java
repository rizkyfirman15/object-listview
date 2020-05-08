package com.example.uas_piksi_2020;

/**
 * Created by rizkyfirman15 on 2019-11-16
 */
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class ListViewActivity extends AppCompatActivity {
    private ArrayList<Users> users = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        ListView listView = findViewById(R.id.list_item);
        UsersAdapter usersAdapter = new UsersAdapter(this);
        listView.setAdapter(usersAdapter);
        users.clear();
        users.add(new Users("Khaidir Fahram", "2019-04-09 20:48:48", R.drawable.users1));
        users.add(new Users("Rades Tuta Hadiyasa", "2019-04-20 15:41:11", R.drawable.users2));
        users.add(new Users("Muhammad Anas", "2019-04-20 15:46:49", R.drawable.users3));
        users.add(new Users("Ahmad Rafli Ardiansyah", "2019-11-30 13:38:23", R.drawable.users4));
        users.add(new Users("Windah Agustina Siburian", "2019-12-13 20:23:52", R.drawable.users5));
        users.add(new Users("Sanadi Sr", "2019-12-14 14:25:20", R.drawable.users6));
        users.add(new Users("Siti Sofiyah", "2019-11-27 16:20:06", R.drawable.users7));
        usersAdapter.setData(users);
        usersAdapter.notifyDataSetChanged();
    }
}
