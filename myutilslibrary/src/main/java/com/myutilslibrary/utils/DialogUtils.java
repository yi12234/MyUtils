package com.myutilslibrary.utils;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;

import java.util.List;


/**
 * Created by Administrator on 2017/8/15.
 */

public class DialogUtils {

    private static AlertDialog.Builder builder;


    /**
     *    //三个参数 确定-1 取消-2 忽略-3
     */
    public static void showdialog3(final Context context, String title, String message, int id, Boolean tf,final IdialogListener3 listener3){

        //先得到构造器
        builder = new AlertDialog.Builder(context);
        builder.setCancelable(tf);
        builder.setTitle(title); //设置标题
        builder.setMessage(message); //设置内容
        builder.setIcon(id);//设置图标，图片id即可
        builder.setPositiveButton("确定", new DialogInterface.OnClickListener() { //设置确定按钮
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss(); //关闭dialog
                // Toast.makeText(context, "确认" + which, Toast.LENGTH_SHORT).show();
                listener3.PositiveButton();
            }
        });
        builder.setNegativeButton("取消", new DialogInterface.OnClickListener() { //设置取消按钮
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
                //Toast.makeText(context, "取消" + which, Toast.LENGTH_SHORT).show();
                listener3.NegativeButton();
            }
        });

        builder.setNeutralButton("忽略", new DialogInterface.OnClickListener() {//设置忽略按钮
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
                //Toast.makeText(context, "忽略" + which, Toast.LENGTH_SHORT).show();
                listener3.NeutralButton();
            }
        });
        //参数都设置完成了，创建并显示出来
        builder.create().show();
    }
    /**
     *    //两个参数 确定-1 取消-3
     */

    public static void showdialog2(final Context context, String title, String message, int id,Boolean tf, final IdialogListener2 listener2){

        builder=new AlertDialog.Builder(context);  //先得到构造器
        builder.setCancelable(tf);
        builder.setTitle(title); //设置标题
        builder.setMessage(message); //设置内容
        builder.setIcon(id);//设置图标，图片id即可
        builder.setPositiveButton("确定", new DialogInterface.OnClickListener() { //设置确定按钮
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss(); //关闭dialog
                // Toast.makeText(context, "确认" + which, Toast.LENGTH_SHORT).show();
                listener2.PositiveButton();
            }
        });
        builder.setNeutralButton("取消", new DialogInterface.OnClickListener() {//设置忽略按钮
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
                // Toast.makeText(context, "取消" + which, Toast.LENGTH_SHORT).show();
                listener2.NegativeButton();
            }
        });
        //参数都设置完成了，创建并显示出来
        builder.create().show();
    }
    /**
     *
     */
    //一个参数 确定-1
    public static void showdialog1(final Context context, String title, String message, int id, Boolean tf,final IdialogListener1 listener1){

        builder=new AlertDialog.Builder(context);  //先得到构造器
        builder.setCancelable(tf);
        builder.setTitle(title); //设置标题
        builder.setMessage(message); //设置内容
        builder.setIcon(id);//设置图标，图片id即可
        builder.setPositiveButton("确定", new DialogInterface.OnClickListener() { //设置确定按钮
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss(); //关闭dialog
                //Toast.makeText(context, "确认" + which, Toast.LENGTH_SHORT).show();
                listener1.PositiveButton();
            }
        });
        //参数都设置完成了，创建并显示出来
        builder.create().show();
    }
    /**
     *  //列表 String items = new String[]{"1", "2", "3"};
     *
     *   if (items[data].equals("1")){
     ToastUtils.showtoast(MainActivity.this,"123456");
     }
     *
     *          记得按钮判断
     */


    //数组   三个参数 确定-1 取消-2 忽略-3
    public static void dialogArry3(final Context context, String title, int id, Boolean tf,final String items[],
                                   final IdialogListenerlist3 listenerlist){

        //dialog参数设置
        builder=new AlertDialog.Builder(context);  //先得到构造器
        builder.setCancelable(tf);
        builder.setTitle(title); //设置标题
        //builder.setMessage(message); //设置内容
        builder.setIcon(id);//设置图标，图片id即可
        //设置列表显示，注意设置了列表显示就不要设置builder.setMessage()了，否则列表不起作用。
        builder.setItems(items,new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
                //Toast.makeText(context, items[which], Toast.LENGTH_SHORT).show();
                listenerlist.getdata(items[which]);
            }
        });
        builder.setPositiveButton("确定", new DialogInterface.OnClickListener() { //设置确定按钮
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss(); //关闭dialog
                // Toast.makeText(context, "确认" + which, Toast.LENGTH_SHORT).show();
                listenerlist.PositiveButton();
            }
        });
        builder.setNegativeButton("取消", new DialogInterface.OnClickListener() { //设置取消按钮
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
                //Toast.makeText(context, "取消" + which, Toast.LENGTH_SHORT).show();
                listenerlist.NegativeButton();
            }
        });

        builder.setNeutralButton("忽略", new DialogInterface.OnClickListener() {//设置忽略按钮
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
                //Toast.makeText(context, "忽略" + which, Toast.LENGTH_SHORT).show();
                listenerlist.NeutralButton();
            }
        });
        builder.create().show();
    }



    /**
     *   //数组   两个参数 确定-1 取消-2
     *
     */

    public static void dialogArry2(final Context context, String title, int id, Boolean tf,final String items[],
                                   final IdialogListenerlist2 listenerlist2){

        //dialog参数设置
        builder=new AlertDialog.Builder(context);  //先得到构造器
        builder.setCancelable(tf);
        builder.setTitle(title); //设置标题
        //builder.setMessage(message); //设置内容
        builder.setIcon(id);//设置图标，图片id即可
        //设置列表显示，注意设置了列表显示就不要设置builder.setMessage()了，否则列表不起作用。
        builder.setItems(items,new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
                //Toast.makeText(context, items[which], Toast.LENGTH_SHORT).show();
                listenerlist2.getdata(items[which]);
            }
        });
        builder.setPositiveButton("确定",new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
                //Toast.makeText(context, "确定", Toast.LENGTH_SHORT).show();
                listenerlist2.PositiveButton();
            }
        });
        builder.setNegativeButton("取消", new DialogInterface.OnClickListener() { //设置取消按钮
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
                //Toast.makeText(context, "取消" + which, Toast.LENGTH_SHORT).show();
                listenerlist2.NegativeButton();
            }
        });
        builder.create().show();
    }
    /**
     *
     *  //数组 一个参数 确定-1
     *
     * */
    public static void dialogArry1(final Context context, String title, int id, Boolean tf,final String items[],
                                   final IdialogListenerlist1 listenerlist1){

        //dialog参数设置
        builder=new AlertDialog.Builder(context);  //先得到构造器
        builder.setCancelable(tf);
        builder.setTitle(title); //设置标题
        //builder.setMessage(message); //设置内容
        builder.setIcon(id);//设置图标，图片id即可
        //设置列表显示，注意设置了列表显示就不要设置builder.setMessage()了，否则列表不起作用。
        builder.setItems(items,new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
                //Toast.makeText(context, items[which], Toast.LENGTH_SHORT).show();
                listenerlist1.getdata(items[which]);
            }
        });
        builder.setPositiveButton("确定",new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
                //Toast.makeText(context, "确定", Toast.LENGTH_SHORT).show();
                listenerlist1.PositiveButton();
            }
        });
        builder.create().show();
    }
    /**
     //集合   三个参数 确定-1 取消-2 忽略-3
     */
    public static void dialogList3(final Context context, String title, int id, Boolean tf, final List<String> list,
                                   final IdialogListenerlist3 listenerlist3){

        //dialog参数设置
        builder=new AlertDialog.Builder(context);  //先得到构造器
        builder.setCancelable(tf);
        builder.setTitle(title); //设置标题
        //builder.setMessage(message); //设置内容
        builder.setIcon(id);//设置图标，图片id即可
        //设置列表显示，注意设置了列表显示就不要设置builder.setMessage()了，否则列表不起作用。
        final String[] array = list.toArray(new String[list.size()]);
        builder.setItems(array,new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
                //Toast.makeText(context, items[which], Toast.LENGTH_SHORT).show();

                listenerlist3.getdata(array[which]);
            }
        });
        builder.setPositiveButton("确定",new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
                //Toast.makeText(context, "确定", Toast.LENGTH_SHORT).show();
                listenerlist3.PositiveButton();
            }
        });
        builder.setNegativeButton("取消", new DialogInterface.OnClickListener() { //设置取消按钮
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
                //Toast.makeText(context, "取消" + which, Toast.LENGTH_SHORT).show();
                listenerlist3.NegativeButton();
            }
        });

        builder.setNeutralButton("忽略", new DialogInterface.OnClickListener() {//设置忽略按钮
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
                //Toast.makeText(context, "忽略" + which, Toast.LENGTH_SHORT).show();
                listenerlist3.NeutralButton();
            }
        });
        builder.create().show();
    }
    /**
     //集合   两个参数 确定-1 取消-2
     */
    public static void dialogList2(final Context context, String title, int id, Boolean tf, final List<String> list,
                                   final IdialogListenerlist2 listenerlist2){

        //dialog参数设置
        builder=new AlertDialog.Builder(context);  //先得到构造器
        builder.setCancelable(tf);
        builder.setTitle(title); //设置标题
        //builder.setMessage(message); //设置内容
        builder.setIcon(id);//设置图标，图片id即可
        //设置列表显示，注意设置了列表显示就不要设置builder.setMessage()了，否则列表不起作用。
        final String[] array = list.toArray(new String[list.size()]);
        builder.setItems(array,new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
                //Toast.makeText(context, items[which], Toast.LENGTH_SHORT).show();
                listenerlist2.getdata(array[which]);
            }
        });
        builder.setPositiveButton("确定",new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
                //Toast.makeText(context, "确定", Toast.LENGTH_SHORT).show();
                listenerlist2.PositiveButton();
            }
        });
        builder.setNegativeButton("取消", new DialogInterface.OnClickListener() { //设置取消按钮
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
                //Toast.makeText(context, "取消" + which, Toast.LENGTH_SHORT).show();
                listenerlist2.NegativeButton();
            }
        });


        builder.create().show();
    }

    /**
     //集合   一个参数 确定-1
     */
    public static void dialogList1(final Context context, String title, int id, Boolean tf, final List<String> list,
                                   final IdialogListenerlist1 listenerlist1){

        //dialog参数设置
        builder=new AlertDialog.Builder(context);  //先得到构造器
        builder.setCancelable(tf);
        builder.setTitle(title); //设置标题
        //builder.setMessage(message); //设置内容
        builder.setIcon(id);//设置图标，图片id即可
        //设置列表显示，注意设置了列表显示就不要设置builder.setMessage()了，否则列表不起作用。
        final String[] array = list.toArray(new String[list.size()]);
        builder.setItems(array,new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
                //Toast.makeText(context, items[which], Toast.LENGTH_SHORT).show();
                listenerlist1.getdata(array[which]);
            }
        });
        builder.setPositiveButton("确定",new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
                //Toast.makeText(context, "确定", Toast.LENGTH_SHORT).show();
                listenerlist1.PositiveButton();
            }
        });
        builder.create().show();
    }



    /**
     //三个参数 确定-1 取消-2 忽略-3  确定 取消 忽略*/
    public static void showdialog3(final Context context, String title, String message,
                                   int id, Boolean tf, String PositiveButton,String NegativeButton,String NeutralButton,
                                   final IdialogListener3 listener3){
        //先得到构造器
        builder = new AlertDialog.Builder(context);
        builder.setCancelable(tf);
        builder.setTitle(title); //设置标题
        builder.setMessage(message); //设置内容
        builder.setIcon(id);//设置图标，图片id即可
        builder.setPositiveButton(PositiveButton, new DialogInterface.OnClickListener() { //设置确定按钮
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss(); //关闭dialog
                // Toast.makeText(context, "确认" + which, Toast.LENGTH_SHORT).show();
                listener3.PositiveButton();
            }
        });
        builder.setNegativeButton(NegativeButton, new DialogInterface.OnClickListener() { //设置取消按钮
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
                //Toast.makeText(context, "取消" + which, Toast.LENGTH_SHORT).show();
                listener3.NegativeButton();
            }
        });

        builder.setNeutralButton(NeutralButton, new DialogInterface.OnClickListener() {//设置忽略按钮
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
                //Toast.makeText(context, "忽略" + which, Toast.LENGTH_SHORT).show();
                listener3.NeutralButton();
            }
        });
        //参数都设置完成了，创建并显示出来
        builder.create().show();
    }



    /**
     //两个参数 确定-1 取消-3
     */
    public static void showdialog2(final Context context, String title, String message,
                                   int id,Boolean tf, String PositiveButton,String NegativeButton,
                                   final IdialogListener2 listener2){

        builder=new AlertDialog.Builder(context);  //先得到构造器
        builder.setCancelable(tf);
        builder.setTitle(title); //设置标题
        builder.setMessage(message); //设置内容
        builder.setIcon(id);//设置图标，图片id即可
        builder.setPositiveButton(PositiveButton, new DialogInterface.OnClickListener() { //设置确定按钮
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss(); //关闭dialog
                // Toast.makeText(context, "确认" + which, Toast.LENGTH_SHORT).show();
                listener2.PositiveButton();
            }
        });
        builder.setNeutralButton(NegativeButton, new DialogInterface.OnClickListener() {//设置忽略按钮
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
                // Toast.makeText(context, "取消" + which, Toast.LENGTH_SHORT).show();
                listener2.NegativeButton();
            }
        });
        //参数都设置完成了，创建并显示出来
        builder.create().show();
    }


    /**
     //一个参数 确定-1
     */
    public static void showdialog1(final Context context, String title, String message, int id, Boolean tf,
                                   String PositiveButton,final IdialogListener1 listener1){
        builder=new AlertDialog.Builder(context);  //先得到构造器
        builder.setCancelable(tf);
        builder.setTitle(title); //设置标题
        builder.setMessage(message); //设置内容
        builder.setIcon(id);//设置图标，图片id即可
        builder.setPositiveButton(PositiveButton, new DialogInterface.OnClickListener() { //设置确定按钮
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss(); //关闭dialog
                //Toast.makeText(context, "确认" + which, Toast.LENGTH_SHORT).show();
                listener1.PositiveButton();
            }
        });
        //参数都设置完成了，创建并显示出来
        builder.create().show();
    }

    //列表 String items = new String[]{"1", "2", "3"};
    /*
    * if (items[data].equals("1")){
                    ToastUtils.showtoast(MainActivity.this,"123456");
                }
    */
    /**
     //数组   三个参数 确定-1 取消-2 忽略-3
     */

    public static void dialogArry3(final Context context, String title
            ,int id, Boolean tf,final String items[],
                                   String PositiveButton,String NegativeButton,String NeutralButton
            ,final IdialogListenerlist3 listenerlist3){
        //dialog参数设置
        builder=new AlertDialog.Builder(context);  //先得到构造器
        builder.setCancelable(tf);
        builder.setTitle(title); //设置标题
        //builder.setMessage(message); //设置内容
        builder.setIcon(id);//设置图标，图片id即可
        //设置列表显示，注意设置了列表显示就不要设置builder.setMessage()了，否则列表不起作用。
        builder.setItems(items,new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
                //Toast.makeText(context, items[which], Toast.LENGTH_SHORT).show();
                listenerlist3.getdata(items[which]);
            }
        });
        builder.setPositiveButton(PositiveButton,new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
                //Toast.makeText(context, "确定", Toast.LENGTH_SHORT).show();
                listenerlist3.PositiveButton();
            }
        });
        builder.setNegativeButton(NegativeButton, new DialogInterface.OnClickListener() { //设置取消按钮
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
                //Toast.makeText(context, "取消" + which, Toast.LENGTH_SHORT).show();
                listenerlist3.NegativeButton();
            }
        });

        builder.setNeutralButton(NeutralButton, new DialogInterface.OnClickListener() {//设置忽略按钮
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
                //Toast.makeText(context, "忽略" + which, Toast.LENGTH_SHORT).show();
                listenerlist3.NeutralButton();
            }
        });
        builder.create().show();
    }
    /**
     //数组   两个参数 确定-1 取消-2
     */

    public static void dialogArry2(final Context context, String title
            ,int id, Boolean tf,final String items[],
                                   String PositiveButton,String NegativeButton,
                                   final IdialogListenerlist2 listenerlist2){
        //dialog参数设置
        builder=new AlertDialog.Builder(context);  //先得到构造器
        builder.setCancelable(tf);
        builder.setTitle(title); //设置标题
        //builder.setMessage(message); //设置内容
        builder.setIcon(id);//设置图标，图片id即可
        //设置列表显示，注意设置了列表显示就不要设置builder.setMessage()了，否则列表不起作用。
        builder.setItems(items,new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
                //Toast.makeText(context, items[which], Toast.LENGTH_SHORT).show();
                listenerlist2.getdata(items[which]);
            }
        });
        builder.setPositiveButton(PositiveButton,new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
                //Toast.makeText(context, "确定", Toast.LENGTH_SHORT).show();
                listenerlist2.PositiveButton();
            }
        });
        builder.setNegativeButton(NegativeButton, new DialogInterface.OnClickListener() { //设置取消按钮
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
                //Toast.makeText(context, "取消" + which, Toast.LENGTH_SHORT).show();
                listenerlist2.NegativeButton();
            }
        });
        builder.create().show();
    }
    /**
     //数组   一个参数 确定-1
     */

    public static void dialogArry1(final Context context, String title
            ,int id, Boolean tf,final String items[],
                                   String PositiveButton, final IdialogListenerlist1 listenerlist1){
        //dialog参数设置
        builder=new AlertDialog.Builder(context);  //先得到构造器
        builder.setCancelable(tf);
        builder.setTitle(title); //设置标题
        //builder.setMessage(message); //设置内容
        builder.setIcon(id);//设置图标，图片id即可
        //设置列表显示，注意设置了列表显示就不要设置builder.setMessage()了，否则列表不起作用。
        builder.setItems(items,new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
                //Toast.makeText(context, items[which], Toast.LENGTH_SHORT).show();
                listenerlist1.getdata(items[which]);
            }
        });
        builder.setPositiveButton(PositiveButton,new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
                //Toast.makeText(context, "确定", Toast.LENGTH_SHORT).show();
                listenerlist1.PositiveButton();
            }
        });
        builder.create().show();
    }


    /**
     //集合   三个参数 确定-1 取消-2 忽略-3
     */

    public static void dialogList3(final Context context, String title, int id, Boolean tf, final List<String> list,
                                   String PositiveButton,String NegativeButton,String NeutralButton,
                                   final IdialogListenerlist3 listenerlist3){
        //dialog参数设置
        builder=new AlertDialog.Builder(context);  //先得到构造器
        builder.setCancelable(tf);
        builder.setTitle(title); //设置标题
        //builder.setMessage(message); //设置内容
        builder.setIcon(id);//设置图标，图片id即可
        //设置列表显示，注意设置了列表显示就不要设置builder.setMessage()了，否则列表不起作用。
        final String[] array = list.toArray(new String[list.size()]);
        builder.setItems(array,new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
                //Toast.makeText(context, items[which], Toast.LENGTH_SHORT).show();
                listenerlist3.getdata(array[which]);
            }
        });
        builder.setPositiveButton(PositiveButton,new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
                //Toast.makeText(context, "确定", Toast.LENGTH_SHORT).show();
                listenerlist3.PositiveButton();
            }
        });
        builder.setNegativeButton(NegativeButton, new DialogInterface.OnClickListener() { //设置取消按钮
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
                //Toast.makeText(context, "取消" + which, Toast.LENGTH_SHORT).show();
                listenerlist3.NegativeButton();
            }
        });

        builder.setNeutralButton(NeutralButton, new DialogInterface.OnClickListener() {//设置忽略按钮
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
                //Toast.makeText(context, "忽略" + which, Toast.LENGTH_SHORT).show();
                listenerlist3.NeutralButton();
            }
        });
        builder.create().show();
    }

    /**
     //集合   两个参数 确定-1 取消-2
     */

    public static void dialogList2(final Context context, String title, int id, Boolean tf, final List<String> list,
                                   String PositiveButton,String NegativeButton,final IdialogListenerlist2 listener2){
        //dialog参数设置
        builder=new AlertDialog.Builder(context);  //先得到构造器
        builder.setCancelable(tf);
        builder.setTitle(title); //设置标题
        //builder.setMessage(message); //设置内容
        builder.setIcon(id);//设置图标，图片id即可
        //设置列表显示，注意设置了列表显示就不要设置builder.setMessage()了，否则列表不起作用。
        final String[] array = list.toArray(new String[list.size()]);
        builder.setItems(array,new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
                //Toast.makeText(context, items[which], Toast.LENGTH_SHORT).show();
                listener2.getdata(array[which]);
            }
        });
        builder.setPositiveButton(PositiveButton,new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
                //Toast.makeText(context, "确定", Toast.LENGTH_SHORT).show();
                listener2.PositiveButton();
            }
        });
        builder.setNegativeButton(NegativeButton, new DialogInterface.OnClickListener() { //设置取消按钮
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
                //Toast.makeText(context, "取消" + which, Toast.LENGTH_SHORT).show();
                listener2.NegativeButton();
            }
        });


        builder.create().show();
    }
    /**
     //集合   一个参数 确定-1
     */
    public static void dialogList1(final Context context, String title, int id, Boolean tf, final List<String> list,
                                   String PositiveButton, final IdialogListenerlist1 listenerlist1){
        //dialog参数设置
        builder=new AlertDialog.Builder(context);  //先得到构造器
        builder.setCancelable(tf);
        builder.setTitle(title); //设置标题
        //builder.setMessage(message); //设置内容
        builder.setIcon(id);//设置图标，图片id即可
        //设置列表显示，注意设置了列表显示就不要设置builder.setMessage()了，否则列表不起作用。
        final String[] array = list.toArray(new String[list.size()]);
        builder.setItems(array,new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
                //Toast.makeText(context, items[which], Toast.LENGTH_SHORT).show();
                listenerlist1.getdata(array[which]);
            }
        });
        builder.setPositiveButton(PositiveButton,new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
                //Toast.makeText(context, "确定", Toast.LENGTH_SHORT).show();
                listenerlist1.PositiveButton();
            }
        });
        builder.create().show();
    }

    /**
     * 撤销对话框
     * */
    public  static void cancel(){
        Dialog dialog = builder.show();
        dialog.dismiss();
    }
    public interface IdialogListener3 {
         void PositiveButton();
         void NegativeButton();
         void NeutralButton();
    }
    public interface IdialogListener2 {
         void PositiveButton();
         void NegativeButton();
    }
    public interface IdialogListener1 {
         void PositiveButton();
    }
    public interface IdialogListenerlist3 {
         void PositiveButton();
         void NegativeButton();
         void NeutralButton();
         void getdata(String data);
    }
    public interface IdialogListenerlist2 {
         void PositiveButton();
         void NegativeButton();
         void getdata(String data);
    }
    public interface IdialogListenerlist1 {
         void PositiveButton();
         void getdata(String data);
    }



}
