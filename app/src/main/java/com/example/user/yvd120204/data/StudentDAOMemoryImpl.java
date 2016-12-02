package com.example.user.yvd120204.data;

import android.support.annotation.ArrayRes;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 2016/12/2.
 */

public class StudentDAOMemoryImpl implements StudentDAO {
    ArrayList<Student> data;
    public StudentDAOMemoryImpl()
    {
        data = new ArrayList<>();
    }

    @Override
    public List<Student> getList() {
        return data;
    }

    @Override
    public void add(Student s) {
        data.add(s);
    }
}
