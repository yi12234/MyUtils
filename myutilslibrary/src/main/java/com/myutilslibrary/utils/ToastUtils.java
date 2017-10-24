package com.myutilslibrary.utils;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by Administrator on 2017/8/15.
 */

public class ToastUtils {
    private static Context context;
    public ToastUtils(Context content) {
        this.context=content;
    }

    public static void showtoast( String msg){
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();
    }
    public static void longtoast( String msg){
        Toast.makeText(context, msg, Toast.LENGTH_LONG).show();
    }
    public static void showtoast(Context context, String msg){
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();
    }
    public static void longtoast(Context context, String msg){
        Toast.makeText(context, msg, Toast.LENGTH_LONG).show();
    }

}
