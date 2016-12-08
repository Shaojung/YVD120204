package com.example.user.yvd120204.data;

import android.content.Context;

/**
 * Created by user on 2016/12/8.
 */

public class StudentDAOFactory {
    public static StudentDAO getStudentDAO(Context context, int type)
    {
        switch (type)
        {
            case 0:
                return new StudentDAOMemoryImpl();
            case 1:
                return new StudentDAOFileImpl(context);
            case 2:
                return new StudentDAODBImpl(context);
        }
        return null;
    }
}
