package com.myutilslibrary.utils;

import android.content.Context;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.myutilslibrary.utils.viewutils.GlideCircleTransform;
import com.myutilslibrary.utils.viewutils.GlideRoundTransform;
import com.myutilslibrary.utils.viewutils.PicassoCircleTransform;
import com.myutilslibrary.utils.viewutils.PicassoRoundTransform;
import com.squareup.picasso.Picasso;

/**
 * Created by Administrator on 2017/9/22.
 */

public class PicUtils {
    //picasso
    //最简
    public static void  pic(Context context, String url, ImageView iv){
        Picasso.with(context).load(url).into(iv);
    }
    //加载
    public static void  piclod(Context context,String url,int lodadpic,ImageView iv){
        Picasso.with(context).load(url).placeholder(lodadpic).into(iv);
    }
    //失败
    public static void  picfail(Context context,String url,int failure,ImageView iv){
        Picasso.with(context).load(url).error(failure).into(iv);
    }
    //加载 失败
    public static void  piclodfail(Context context,String url,int lodadpic,int failure,ImageView iv){
        Picasso.with(context).load(url).placeholder(lodadpic).error(failure).into(iv);
    }
    //大小
    public static void  picsize(Context context,String url,ImageView iv,int w,int h){
        Picasso.with(context).load(url).resize(w,h).into(iv);
    }
    //加载 大小
    public static void  piclodsize(Context context,String url,int lodadpic,ImageView iv,int w,int h){
        Picasso.with(context).load(url).placeholder(lodadpic).resize(w,h).into(iv);
    }
    //加载 大小 失败
    public static void  piclodfailsize(Context context,String url,int lodadpic,int failure,ImageView iv,int w,int h){
        Picasso.with(context).load(url).placeholder(lodadpic).resize(w,h).error(failure).into(iv);
    }
    //圆角
    public static void  piccon(Context context,String url,ImageView iv,int w,int h){
        Picasso.with(context).load(url).resize(w,h).centerCrop().into(iv);
    }
    //加载 圆角
    public static void  picconlod(Context context,String url,int lodadpic,ImageView iv,int w,int h){
        Picasso.with(context).load(url).placeholder(lodadpic).transform(new PicassoRoundTransform()).centerCrop().into(iv);
    }
    //加载 圆角 失败
    public static void  picconlodfail(Context context,String url,int lodadpic,int failure,ImageView iv,int w,int h){
        Picasso.with(context).load(url).placeholder(lodadpic).resize(w,h).transform(new PicassoRoundTransform()).error(failure).into(iv);
    }
    //圆形
    public static void picCircle(Context context,String url,ImageView iv){
        Picasso.with(context).load(url).transform(new PicassoCircleTransform()).into(iv);
    }
    //加载 圆形
    public static void  picCirlod(Context context,String url,int lodadpic,ImageView iv){
        Picasso.with(context).load(url).placeholder(lodadpic).transform(new PicassoCircleTransform()).into(iv);
    }
    //加载 圆形 失败
    public static void  picCirlodfail(Context context,String url,int lodadpic,int failure,ImageView iv){
        Picasso.with(context).load(url).placeholder(lodadpic).transform(new PicassoCircleTransform()).error(failure).into(iv);
    }





    //glide
    //最简
    public static void  glide(Context context, String url, ImageView iv){
        Glide.with(context).load(url).into(iv);
    }
    //加载
    public static void  glidelod(Context context,String url,int lodadpic,ImageView iv){
        Glide.with(context).load(url).placeholder(lodadpic).into(iv);
    }
    //失败
    public static void  glidefail(Context context,String url,int failure,ImageView iv){
        Glide.with(context).load(url).error(failure).into(iv);
    }
    //圆角
    public static void  glidecon(Context context,String url,int rounddp,ImageView iv){
        Glide.with(context).load(url).transform(new GlideRoundTransform(context,rounddp)).into(iv);
    }
    //加载 失败
    public static void  glidelodfail(Context context,String url,int lodadpic,int failure,ImageView iv){
        Glide.with(context).load(url).placeholder(lodadpic).error(failure).into(iv);
    }
    //加载 圆角
    public static void  glideconlod(Context context,String url,int lodadpic,int rounddp,ImageView iv){
        Glide.with(context).load(url).placeholder(lodadpic).transform(new GlideRoundTransform(context,rounddp)).into(iv);
    }
    //加载 圆角 失败
    public static void  glideconlodfail(Context context,String url,int lodadpic,int rounddp,int failure,ImageView iv){
        Glide.with(context).load(url).placeholder(lodadpic).transform(new GlideRoundTransform(context,rounddp)).error(failure).into(iv);
    }
    //圆形
    public static void glideCirle(Context context,String url,ImageView iv){
        Glide.with(context).load(url).transform(new GlideCircleTransform(context)).into(iv);
    }
    //加载 圆形
    public static void glidelodCirle(Context context,String url,int lodadpic,ImageView iv){
        Glide.with(context).load(url).placeholder(lodadpic).transform(new GlideCircleTransform(context)).into(iv);
    }
    //加载 圆形
    public static void glidelodfailCirle(Context context,String url,int lodadpic,int failure,ImageView iv){
        Glide.with(context).load(url).placeholder(lodadpic).transform(new GlideCircleTransform(context)).error(failure).into(iv);
    }



    //使用centerCrop是利用图片图填充ImageView设置的大小，如果ImageView的Height是match_parent则图片就会被拉伸填充
    public static void glidecenterCrop(Context context,String url,ImageView iv) {
        Glide.with(context).load(url).centerCrop().into(iv);
    }
    public static void glidecenterCrop(Context context,String url,int lodadpic,ImageView iv) {
        Glide.with(context).load(url).placeholder(lodadpic).centerCrop().into(iv);
    }
    public static void glidecenterCrop(Context context,String url,int lodadpic,int failure,ImageView iv) {
        Glide.with(context).load(url).placeholder(lodadpic).error(failure).centerCrop().into(iv);
    }


    //使用fitCenter即缩放图像让图像都测量出来等于或小于 ImageView 的边界范围,该图像将会完全显示，但可能不会填满整个ImageView。
    public static void glidefitCenter(Context context,String url,ImageView iv) {
        Glide.with(context).load(url).fitCenter().into(iv);
    }
    public static void glidefitCenter(Context context,String url,int lodadpic,ImageView iv) {
        Glide.with(context).load(url).placeholder(lodadpic).fitCenter().into(iv);
    }
    public static void glidefitCenter(Context context,String url,int lodadpic,int failure,ImageView iv) {
        Glide.with(context).load(url).placeholder(lodadpic).error(failure).fitCenter().into(iv);
    }

    //加载动画
    public static void glidegif(Context context,String url,ImageView iv) {
        Glide.with(context).load(url).asGif().into(iv);
    }

}
