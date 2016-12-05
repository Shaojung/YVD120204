package com.example.user.yvd120204;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.user.yvd120204.data.Student;

public class DetailActivity extends AppCompatActivity {
    TextView tv1, tv2, tv3, tv4;
    MyApplication app;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        tv1 = (TextView) findViewById(R.id.textView);
        tv2 = (TextView) findViewById(R.id.textView2);
        tv3 = (TextView) findViewById(R.id.textView3);
        tv4 = (TextView) findViewById(R.id.textView4);
        app = (MyApplication) getApplication();
        int ID = getIntent().getIntExtra("ID", 0);
        Student s = app.dao.getItem(ID);
        tv1.setText(String.valueOf(s.ID));
        tv2.setText(s.name);
        tv3.setText(s.tel);
        tv4.setText(s.addr);


    }
}
