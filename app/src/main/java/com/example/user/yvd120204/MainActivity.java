package com.example.user.yvd120204;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.user.yvd120204.data.Student;
import com.example.user.yvd120204.data.StudentDAO;
import com.example.user.yvd120204.data.StudentDAODBImpl;
import com.example.user.yvd120204.data.StudentDAOFileImpl;
import com.example.user.yvd120204.data.StudentDAOMemoryImpl;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ArrayList<String> data;
    ListView lv;
    ArrayAdapter<String> adapter;
    MyApplication app;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv = (ListView) findViewById(R.id.listView);
        data = new ArrayList<>();
        app = (MyApplication) getApplication();
        app.dao = new StudentDAODBImpl(MainActivity.this);
        adapter = new ArrayAdapter<String>(MainActivity.this,
                android.R.layout.simple_list_item_1, data);
        lv.setAdapter(adapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                List<Student> lst = app.dao.getList();
                Student s = lst.get(position);
                Intent it = new Intent(MainActivity.this, DetailActivity.class);
                it.putExtra("ID", s.ID);
                startActivity(it);
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        List<Student> lst = app.dao.getList();
        data.clear();
        for (Student s : lst)
        {
            Log.d("DATA", s.toString());
            data.add(s.toString());
        }
        adapter.notifyDataSetChanged();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add("ADD");
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent it = new Intent(MainActivity.this, AddActivity.class);
        startActivity(it);
        return super.onOptionsItemSelected(item);
    }
}
