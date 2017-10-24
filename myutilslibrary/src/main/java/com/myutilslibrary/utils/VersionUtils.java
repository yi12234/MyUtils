package com.myutilslibrary.utils;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

/**
 * Created by Administrator on 2017/8/17.
 */

public class VersionUtils {

    //获取版本号：
    public String getversionName(Context context) {
        //包的管理者
        PackageManager pm= context.getPackageManager();
        //1.包名 2指定信息标签。
        try {
            PackageInfo packageInfo = pm.getPackageInfo(context.getPackageName(), 0);
            //获取版本号名称
            String versionName=packageInfo.versionName;
            return versionName;

        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
    public  int getversionCode(Context context) {
        //包的管理者
        PackageManager pm=context.getPackageManager();
        //1.包名 2指定信息标签。
        try {
            PackageInfo packageInfo = pm.getPackageInfo(context.getPackageName(), 0);
            //获取版本号名称
            int  versionCode=packageInfo.versionCode;
            return versionCode;

        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
        return 0;
    }
}
