package com.myutilslibrary.utils;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by Administrator on 2017/6/6 0006.
 * shareperferce
 */
public class PrefUtils {
    private static Context ctx;
    private static String name;

    public PrefUtils(Context ctx) {
        PrefUtils.ctx = ctx;
    }

    public PrefUtils(Context ctx, String name) {
        PrefUtils.ctx = ctx;
        PrefUtils.name = name;
    }

    public static boolean getBoolean(Context ctx, String key, boolean defValue) {
        SharedPreferences sp = ctx.getSharedPreferences("config",
                Context.MODE_PRIVATE);
        return sp.getBoolean(key, defValue);
    }

    public static void setBoolean(Context ctx, String key, boolean value) {
        SharedPreferences sp = ctx.getSharedPreferences("config",
                Context.MODE_PRIVATE);
        sp.edit().putBoolean(key, value).commit();
    }

    public static void setString(Context ctx, String key, String value) {
        SharedPreferences sp = ctx.getSharedPreferences("config",
                Context.MODE_PRIVATE);
        sp.edit().putString(key, value).commit();
    }

    public static String getString(Context ctx, String key, String defValue) {
        SharedPreferences sp = ctx.getSharedPreferences("config",
                Context.MODE_PRIVATE);
        return sp.getString(key, defValue);
    }

    public static void setInt(Context ctx, String key, int value) {
        SharedPreferences sp = ctx.getSharedPreferences("config",
                Context.MODE_PRIVATE);
        sp.edit().putInt(key, value).commit();
    }

    public static int getInt(Context ctx, String key, int defValue) {
        SharedPreferences sp = ctx.getSharedPreferences("config",
                Context.MODE_PRIVATE);
        return sp.getInt(key, defValue);
    }





    public static boolean getBoolean( String key, boolean defValue) {
        SharedPreferences sp = ctx.getSharedPreferences(name,
                Context.MODE_PRIVATE);
        return sp.getBoolean(key, defValue);
    }

    public static void setBoolean( String key, boolean value) {
        SharedPreferences sp = ctx.getSharedPreferences(name,
                Context.MODE_PRIVATE);
        sp.edit().putBoolean(key, value).commit();
    }

    public static void setString( String key, String value) {
        SharedPreferences sp = ctx.getSharedPreferences(name,
                Context.MODE_PRIVATE);
        sp.edit().putString(key, value).commit();
    }

    public static String getString(String key, String defValue) {
        SharedPreferences sp = ctx.getSharedPreferences(name,
                Context.MODE_PRIVATE);
        return sp.getString(key, defValue);
    }

    public static void setInt( String key, int value) {
        SharedPreferences sp = ctx.getSharedPreferences(name,
                Context.MODE_PRIVATE);
        sp.edit().putInt(key, value).commit();
    }

    public static int getInt(String key, int defValue) {
        SharedPreferences sp = ctx.getSharedPreferences(name,
                Context.MODE_PRIVATE);
        return sp.getInt(key, defValue);
    }






    public static boolean getBooleanN( String key, boolean defValue) {
        SharedPreferences sp = ctx.getSharedPreferences(name,
                Context.MODE_PRIVATE);
        return sp.getBoolean(key, defValue);
    }

    public static void setBooleanN( String key, boolean value) {
        SharedPreferences sp = ctx.getSharedPreferences(name,
                Context.MODE_PRIVATE);
        sp.edit().putBoolean(key, value).commit();
    }

    public static void setStringN( String key, String value) {
        SharedPreferences sp = ctx.getSharedPreferences(name,
                Context.MODE_PRIVATE);
        sp.edit().putString(key, value).commit();
    }

    public static String getStringN(String key, String defValue) {
        SharedPreferences sp = ctx.getSharedPreferences(name,
                Context.MODE_PRIVATE);
        return sp.getString(key, defValue);
    }

    public static void setIntN( String key, int value) {
        SharedPreferences sp = ctx.getSharedPreferences(name,
                Context.MODE_PRIVATE);
        sp.edit().putInt(key, value).commit();
    }

    public static int getIntN(String key, int defValue) {
        SharedPreferences sp = ctx.getSharedPreferences(name,
                Context.MODE_PRIVATE);
        return sp.getInt(key, defValue);
    }




}


