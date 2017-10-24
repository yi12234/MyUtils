package com.myutilslibrary.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Base64;
import android.widget.Toast;

import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;
import com.loopj.android.http.RequestParams;

import java.io.ByteArrayOutputStream;

/**
 * Created by Administrator on 2017/6/29 0029.
 * 发送图片到服务器
 */

public class SendPicutils {
    //参数 图片 地址 参数
    public static void reg(final Context cont, Bitmap photodata, String url,RequestParams params) {
        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();

            //将bitmap一字节流输出 Bitmap.CompressFormat.PNG 压缩格式，100：压缩率，baos：字节流
            photodata.compress(Bitmap.CompressFormat.PNG, 100, baos);
            baos.close();
            byte[] buffer = baos.toByteArray();
            System.out.println("图片的大小：" + buffer.length);

            //将图片的字节流数据加密成base64字符输出
            String photo = Base64.encodeToString(buffer, 0, buffer.length, Base64.DEFAULT);

            AsyncHttpClient client = new AsyncHttpClient();
            client.post(url, params, new AsyncHttpResponseHandler() {
                @Override
                public void onSuccess(int statusCode, String content) {
                   // System.out.println("上传成功：" +content );
                    Toast.makeText(cont, "上传成功!", Toast.LENGTH_SHORT)
                            .show();
                }
                @Override
                public void onFailure(Throwable e, String data) {
                   Toast.makeText(cont, "上传失败!", Toast.LENGTH_SHORT)
                            .show();
                }
            });

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //参数 图片 地址 参数 成功
    public static void regs(final Context cont, Bitmap photodata, String url, RequestParams params, final String sus) {
        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();

            //将bitmap一字节流输出 Bitmap.CompressFormat.PNG 压缩格式，100：压缩率，baos：字节流
            photodata.compress(Bitmap.CompressFormat.PNG, 100, baos);
            baos.close();
            byte[] buffer = baos.toByteArray();
            System.out.println("图片的大小：" + buffer.length);

            //将图片的字节流数据加密成base64字符输出
            String photo = Base64.encodeToString(buffer, 0, buffer.length, Base64.DEFAULT);

            AsyncHttpClient client = new AsyncHttpClient();
            client.post(url, params, new AsyncHttpResponseHandler() {
                @Override
                public void onSuccess(int statusCode, String content) {
                    // System.out.println("上传成功：" +content );
                    Toast.makeText(cont, sus, Toast.LENGTH_SHORT)
                            .show();
                }
                @Override
                public void onFailure(Throwable e, String data) {
//                    Toast.makeText(cont, "上传失败!", Toast.LENGTH_SHORT)
//                            .show();
                }
            });

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //参数 图片 地址 参数 失败
    public static void regf(final Context cont, Bitmap photodata, String url, RequestParams params, final String fail) {
        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();

            //将bitmap一字节流输出 Bitmap.CompressFormat.PNG 压缩格式，100：压缩率，baos：字节流
            photodata.compress(Bitmap.CompressFormat.PNG, 100, baos);
            baos.close();
            byte[] buffer = baos.toByteArray();
            System.out.println("图片的大小：" + buffer.length);

            //将图片的字节流数据加密成base64字符输出
            String photo = Base64.encodeToString(buffer, 0, buffer.length, Base64.DEFAULT);

            AsyncHttpClient client = new AsyncHttpClient();
            client.post(url, params, new AsyncHttpResponseHandler() {
                @Override
                public void onSuccess(int statusCode, String content) {
                    // System.out.println("上传成功：" +content );
//                    Toast.makeText(cont, sus, Toast.LENGTH_SHORT)
//                            .show();
                }
                @Override
                public void onFailure(Throwable e, String data) {
                    Toast.makeText(cont, fail, Toast.LENGTH_SHORT)
                            .show();
                }
            });

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //参数 图片 地址 参数 全部
    public static void reg(final Context cont, Bitmap photodata, String url, RequestParams params, final String sus, final String fail) {
        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();

            //将bitmap一字节流输出 Bitmap.CompressFormat.PNG 压缩格式，100：压缩率，baos：字节流
            photodata.compress(Bitmap.CompressFormat.PNG, 100, baos);
            baos.close();
            byte[] buffer = baos.toByteArray();
            System.out.println("图片的大小：" + buffer.length);

            //将图片的字节流数据加密成base64字符输出
            String photo = Base64.encodeToString(buffer, 0, buffer.length, Base64.DEFAULT);

            AsyncHttpClient client = new AsyncHttpClient();
            client.post(url, params, new AsyncHttpResponseHandler() {
                @Override
                public void onSuccess(int statusCode, String content) {
                    // System.out.println("上传成功：" +content );
                    Toast.makeText(cont, sus, Toast.LENGTH_SHORT)
                           .show();
                }
                @Override
                public void onFailure(Throwable e, String data) {
                    Toast.makeText(cont, fail, Toast.LENGTH_SHORT)
                            .show();
                }
            });

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    //参数 图片 地址 参数
    public static void reg(final Context cont, Bitmap photodata, String url, RequestParams params, final StringCallBack callBack) {
        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();

            //将bitmap一字节流输出 Bitmap.CompressFormat.PNG 压缩格式，100：压缩率，baos：字节流
            photodata.compress(Bitmap.CompressFormat.PNG, 100, baos);
            baos.close();
            byte[] buffer = baos.toByteArray();
            System.out.println("图片的大小：" + buffer.length);

            //将图片的字节流数据加密成base64字符输出
            String photo = Base64.encodeToString(buffer, 0, buffer.length, Base64.DEFAULT);

            AsyncHttpClient client = new AsyncHttpClient();
            client.post(url, params, new AsyncHttpResponseHandler() {
                @Override
                public void onSuccess(int statusCode, String content) {
                    // System.out.println("上传成功：" +content );
                    callBack.getdata(content);
                    Toast.makeText(cont, "上传成功!", Toast.LENGTH_SHORT)
                            .show();
                }
                @Override
                public void onFailure(Throwable e, String data) {
                    Toast.makeText(cont, "上传失败!", Toast.LENGTH_SHORT)
                            .show();
                }
            });

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //参数 图片 地址 参数 成功
    public static void regs(final Context cont, Bitmap photodata, String url, RequestParams params, final String sus, final StringCallBack callBack) {
        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();

            //将bitmap一字节流输出 Bitmap.CompressFormat.PNG 压缩格式，100：压缩率，baos：字节流
            photodata.compress(Bitmap.CompressFormat.PNG, 100, baos);
            baos.close();
            byte[] buffer = baos.toByteArray();
            System.out.println("图片的大小：" + buffer.length);

            //将图片的字节流数据加密成base64字符输出
            String photo = Base64.encodeToString(buffer, 0, buffer.length, Base64.DEFAULT);

            AsyncHttpClient client = new AsyncHttpClient();
            client.post(url, params, new AsyncHttpResponseHandler() {
                @Override
                public void onSuccess(int statusCode, String content) {
                    // System.out.println("上传成功：" +content );
                    callBack.getdata(content);
                    Toast.makeText(cont, sus, Toast.LENGTH_SHORT)
                            .show();
                }
                @Override
                public void onFailure(Throwable e, String data) {
//                    Toast.makeText(cont, "上传失败!", Toast.LENGTH_SHORT)
//                            .show();
                }
            });

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //参数 图片 地址 参数 失败
    public static void regf(final Context cont, Bitmap photodata, String url, RequestParams params, final String fail, final StringCallBack callBack) {
        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();

            //将bitmap一字节流输出 Bitmap.CompressFormat.PNG 压缩格式，100：压缩率，baos：字节流
            photodata.compress(Bitmap.CompressFormat.PNG, 100, baos);
            baos.close();
            byte[] buffer = baos.toByteArray();
            System.out.println("图片的大小：" + buffer.length);

            //将图片的字节流数据加密成base64字符输出
            String photo = Base64.encodeToString(buffer, 0, buffer.length, Base64.DEFAULT);

            AsyncHttpClient client = new AsyncHttpClient();
            client.post(url, params, new AsyncHttpResponseHandler() {
                @Override
                public void onSuccess(int statusCode, String content) {
                    // System.out.println("上传成功：" +content );
//                    Toast.makeText(cont, sus, Toast.LENGTH_SHORT)
//                            .show();
                    callBack.getdata(content);
                }
                @Override
                public void onFailure(Throwable e, String data) {
                    Toast.makeText(cont, fail, Toast.LENGTH_SHORT)
                            .show();
                }
            });

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //参数 图片 地址 参数 全部
    public static void reg(final Context cont, Bitmap photodata, String url, RequestParams params, final String sus, final String fail, final StringCallBack callBack) {
        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();

            //将bitmap一字节流输出 Bitmap.CompressFormat.PNG 压缩格式，100：压缩率，baos：字节流
            photodata.compress(Bitmap.CompressFormat.PNG, 100, baos);
            baos.close();
            byte[] buffer = baos.toByteArray();
            System.out.println("图片的大小：" + buffer.length);

            //将图片的字节流数据加密成base64字符输出
            String photo = Base64.encodeToString(buffer, 0, buffer.length, Base64.DEFAULT);

            AsyncHttpClient client = new AsyncHttpClient();
            client.post(url, params, new AsyncHttpResponseHandler() {
                @Override
                public void onSuccess(int statusCode, String content) {
                    // System.out.println("上传成功：" +content );
                    Toast.makeText(cont, sus, Toast.LENGTH_SHORT)
                            .show();
                    callBack.getdata(content);
                }
                @Override
                public void onFailure(Throwable e, String data) {
                    Toast.makeText(cont, fail, Toast.LENGTH_SHORT)
                            .show();
                }
            });

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public interface StringCallBack {
        void getdata(String data);
    }


}