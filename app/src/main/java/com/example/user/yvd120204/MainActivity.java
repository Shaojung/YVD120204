package com.example.user.yvd120204;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.user.yvd120204.data.Student;
import com.example.user.yvd120204.data.StudentDAO;
import com.example.user.yvd120204.data.StudentDAOMemoryImpl;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        StudentDAO dao = new StudentDAOMemoryImpl();
        dao.add(new Student(1, "Bob", "123", "aa123"));
        dao.add(new Student(2, "Mary", "345", "bb345"));
        List<Student> lst = dao.getList();
        for (Student s : lst)
        {
            Log.d("DATA", s.toString());
        }

    }
}
