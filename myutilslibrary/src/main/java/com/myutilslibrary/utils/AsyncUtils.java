package com.myutilslibrary.utils;

import android.content.Context;
import android.widget.Toast;

import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;
import com.loopj.android.http.RequestParams;
import com.myutilslibrary.callback.StringCallBack;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by Administrator on 2017/8/10.
 * 异步请求类
 */

public class AsyncUtils {

    //  url 成功 失败
    public static void getAsync(final Context cont, String url,
                                final String sus , final  String failure) {
        try {
            AsyncHttpClient client = new AsyncHttpClient();
            client.get(url, new AsyncHttpResponseHandler() {
                @Override
                public void onSuccess(int statusCode, String content) {
                    JSONObject jsonObject= null;
                    try {
                        jsonObject = new JSONObject(content);
                        String success = jsonObject.getString("success");
                        String data = jsonObject.getString("data");
                        if (success.equals(true)) {
                            Toast.makeText(cont, sus, Toast.LENGTH_SHORT).show();
                        } else {
                            Toast.makeText(cont, data, Toast.LENGTH_SHORT).show();
                        }
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
                @Override
                public void onFailure(Throwable e, String data) {
                    Toast.makeText(cont, failure, Toast.LENGTH_SHORT)
                            .show();
                }
            });

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    // url 参数 成功 失败
    public static void postAsync(final Context cont, String url,RequestParams params,
                                 final String sus ,final  String failure) {
        try {
            AsyncHttpClient client = new AsyncHttpClient();
            client.post(url, params,new AsyncHttpResponseHandler() {
                @Override
                public void onSuccess(int statusCode, String content) {
                    JSONObject jsonObject= null;
                    try {
                        jsonObject = new JSONObject(content);
                        String success = jsonObject.getString("success");
                        String data = jsonObject.getString("data");
                        if (success.equals(true)) {
                            Toast.makeText(cont, sus, Toast.LENGTH_SHORT).show();
                        } else {
                            Toast.makeText(cont, data, Toast.LENGTH_SHORT).show();
                        }
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
                @Override
                public void onFailure(Throwable e, String data) {
                    Toast.makeText(cont, failure, Toast.LENGTH_SHORT)
                            .show();
                }
            });

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    // url  回调
    public static void getAsync( String url, final StringCallBack callBack){
        AsyncHttpClient client=new AsyncHttpClient();
        client.get(url,new AsyncHttpResponseHandler(){
            @Override
            public void onSuccess(int statusCode, String content) {
                super.onSuccess(statusCode, content);
                callBack.getStringdata(content);
            }

            @Override
            public void onFailure(Throwable error, String content) {
                super.onFailure(error, content);
            }
        });

//        new MyApp().getMyApp().getQueue().add(request);
    }
    // url 参数 回调
    public static void postAsync( String url,RequestParams params,
                                         final StringCallBack callBack) {

        AsyncHttpClient client = new AsyncHttpClient();
        client.post(url, params, new AsyncHttpResponseHandler() {
            @Override
            public void onSuccess(int statusCode, String content) {
                callBack.getStringdata(content);
            }

            @Override
            public void onFailure(Throwable e, String data) {
            }
        });
    }
    // url  失败 回调
    public static void getAsyncf(final Context cont, String url, final String failure , final StringCallBack callBack) {
        try {
            AsyncHttpClient client = new AsyncHttpClient();
            client.get(url, new AsyncHttpResponseHandler() {
                @Override
                public void onSuccess(int statusCode, String content) {
                    callBack.getStringdata(content);
                }
                @Override
                public void onFailure(Throwable e, String data) {
                    Toast.makeText(cont, failure, Toast.LENGTH_SHORT)
                            .show();
                }
            });

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    // url  失败 参数 回调
    public static void postAsyncf(final Context cont, String url, RequestParams params, final String failure , final StringCallBack callBack) {
        try {
            AsyncHttpClient client = new AsyncHttpClient();
            client.post(url,params, new AsyncHttpResponseHandler() {
                @Override
                public void onSuccess(int statusCode, String content) {
                    callBack.getStringdata(content);
                }
                @Override
                public void onFailure(Throwable e, String data) {
                    Toast.makeText(cont, failure, Toast.LENGTH_SHORT)
                            .show();
                }
            });

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // url  成功 回调
    public static void getAsyncs(final Context cont, String url, final String sus , final StringCallBack callBack) {
        try {
            AsyncHttpClient client = new AsyncHttpClient();
            client.get(url, new AsyncHttpResponseHandler() {
                @Override
                public void onSuccess(int statusCode, String content) {
                    callBack.getStringdata(content);
                    Toast.makeText(cont, sus, Toast.LENGTH_SHORT)
                            .show();
                }
                @Override
                public void onFailure(Throwable e, String data) {

                }
            });

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    // url  成功 参数 回调
    public static void postAsyncs(final Context cont, String url, RequestParams params, final String sus , final StringCallBack callBack) {
        try {
            AsyncHttpClient client = new AsyncHttpClient();
            client.post(url,params, new AsyncHttpResponseHandler() {
                @Override
                public void onSuccess(int statusCode, String content) {
                    callBack.getStringdata(content);
                    Toast.makeText(cont, sus, Toast.LENGTH_SHORT)
                            .show();
                }
                @Override
                public void onFailure(Throwable e, String data) {

                }
            });

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    // url  成功 失败 回调
    public static void getAsync(final Context cont, String url, final String sus , final String failure, final StringCallBack callBack) {
        try {
            AsyncHttpClient client = new AsyncHttpClient();
            client.get(url, new AsyncHttpResponseHandler() {
                @Override
                public void onSuccess(int statusCode, String content) {
                    callBack.getStringdata(content);
                    Toast.makeText(cont, sus, Toast.LENGTH_SHORT)
                            .show();
                }
                @Override
                public void onFailure(Throwable e, String data) {
                    Toast.makeText(cont, failure, Toast.LENGTH_SHORT)
                            .show();
                }
            });

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    // url 参数 成功 失败 回调
    public static void postAsync(final Context cont, String url, RequestParams params, final String sus , final String failure, final StringCallBack callBack) {
        try {
            AsyncHttpClient client = new AsyncHttpClient();
            client.post(url,params, new AsyncHttpResponseHandler() {
                @Override
                public void onSuccess(int statusCode, String content) {
                    callBack.getStringdata(content);
                    Toast.makeText(cont, sus, Toast.LENGTH_SHORT)
                            .show();
                }
                @Override
                public void onFailure(Throwable e, String data) {
                    Toast.makeText(cont, failure, Toast.LENGTH_SHORT)
                            .show();
                }
            });

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
