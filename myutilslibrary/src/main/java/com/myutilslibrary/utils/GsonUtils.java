package com.myutilslibrary.utils;

import com.google.gson.Gson;

/**
 * Created by Administrator on 2017/9/23.
 */

public class GsonUtils {
    public <T> T  getobject(String json,Class<T> tclass){
        return new Gson().fromJson(json,tclass);
    }
}
