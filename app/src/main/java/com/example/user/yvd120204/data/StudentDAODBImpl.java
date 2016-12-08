package com.example.user.yvd120204.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import java.util.List;

/**
 * Created by user on 2016/12/2.
 */

public class StudentDAODBImpl implements StudentDAO {
    SQLiteDatabase db;
    MyDBHelper helper;

    public StudentDAODBImpl(Context context)
    {
        helper = new MyDBHelper(context);
        db = helper.getWritableDatabase();
    }

    @Override
    public List<Student> getList() {
        return null;
    }

    @Override
    public void add(Student s) {

    }

    @Override
    public Student getItem(int ID) {
        return null;
    }
    @Override
    public void delete(int ID) {

    }
    @Override
    public void update(Student s) {

    }
}
