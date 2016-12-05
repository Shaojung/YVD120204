package com.example.user.yvd120204;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.user.yvd120204.data.Student;

public class AddActivity extends AppCompatActivity {
    MyApplication app;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);
        app = (MyApplication) getApplication();

    }
    public void clickAdd(View v)
    {
        EditText ed1, ed2, ed3, ed4;
        ed1 = (EditText) findViewById(R.id.editText);
        ed2 = (EditText) findViewById(R.id.editText2);
        ed3 = (EditText) findViewById(R.id.editText3);
        ed4 = (EditText) findViewById(R.id.editText4);
        app.dao.add(new Student(Integer.valueOf(ed1.getText().toString()),
                ed2.getText().toString(), ed3.getText().toString(),
                ed4.getText().toString()));
        finish();
    }
}
