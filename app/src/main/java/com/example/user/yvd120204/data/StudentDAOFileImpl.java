package com.example.user.yvd120204.data;

import android.content.Context;
import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 2016/12/2.
 */

public class StudentDAOFileImpl implements StudentDAO {
    ArrayList<Student> data;
    Context context;

    public StudentDAOFileImpl(Context context)
    {
        this.context = context;
        data = new ArrayList<>();
    }
    @Override
    public List<Student> getList() {
        Gson gson = new Gson();
        String filedata = readData();

        data = gson.fromJson(filedata, new TypeToken<List<Student>>(){}.getType());
        return data;
    }

    @Override
    public void add(Student s) {

    }

    public String readData()
    {
        char[] buffer = new char[1];
        FileReader fr = null;
        StringBuilder sb = new StringBuilder();
        File file = new File(context.getFilesDir() + "/" + "mydata.txt");

        try {
            fr = new FileReader(file);
            while (fr.read(buffer)!= -1) {
                sb.append(new String(buffer));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Log.d("READFILE", sb.toString());
        return sb.toString();
    }
}
