package com.example.user.yvd120204;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class EditActivity extends AppCompatActivity {
    EditText ed5, ed6, ed7, ed8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit);
        ed5 = (EditText) findViewById(R.id.editText5);
        ed6 = (EditText) findViewById(R.id.editText6);
        ed7 = (EditText) findViewById(R.id.editText7);
        ed8 = (EditText) findViewById(R.id.editText8);
        Intent it = getIntent();
        ed5.setText(it.getStringExtra("ID"));
        ed6.setText(it.getStringExtra("name"));
        ed7.setText(it.getStringExtra("tel"));
        ed8.setText(it.getStringExtra("addr"));
    }
}
