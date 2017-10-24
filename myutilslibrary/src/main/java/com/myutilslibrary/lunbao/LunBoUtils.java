package com.myutilslibrary.lunbao;

import android.app.ActionBar;
import android.app.Activity;
import android.os.Handler;
import android.os.Message;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.myutilslibrary.R;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * Created by Administrator on 2017/7/24 0024.
 * 轮播抽取类
 */

public class LunBoUtils {
    int num;
    private Activity activity;
    private LayoutInflater inflater;
    private ViewPager mviewPager;
    /**用于小圆点图片*/
    private List<ImageView> dotViewList;
    /**用于存放轮播效果图片*/
    private List<ImageView> list;
    LinearLayout dotLayout;
    private int currentItem  = 0;//当前页面
    boolean isAutoPlay = true;//是否自动轮播




    private ScheduledExecutorService scheduledExecutorService;

    private Handler handler = new Handler(){

        @Override
        public void handleMessage(Message msg) {
            // TODO Auto-generated method stub
            super.handleMessage(msg);
            if(msg.what == 100){
                mviewPager.setCurrentItem(currentItem);
            }
        }

    };
    //固定布局 参数
    public  void lunBo(Activity act,int number,List<ImageView> Imglist) {
        activity=act;
        inflater = LayoutInflater.from(act);
        mviewPager=act.findViewById(R.id.activity_home_viewpager);
        dotLayout=act.findViewById(R.id.activity_home_dotLayout);
        dotLayout.removeAllViews();
        num=number;
        list=Imglist;
        initView(num,list);
        if (isAutoPlay) {
            startPlay(4);
        }
    }
    //固定布局 参数+时间
    public  void lunBo(Activity act,int number,int time,List<ImageView> Imglist) {
        activity=act;
        inflater = LayoutInflater.from(act);
        mviewPager=act.findViewById(R.id.activity_home_viewpager);
        dotLayout=act.findViewById(R.id.activity_home_dotLayout);
        dotLayout.removeAllViews();
        num=number;
        list=Imglist;
        initView(num,list);
        if (isAutoPlay) {
            startPlay(time);
        }
    }

    //自定义布局参数
    public  void lunBo(Activity act, ViewPager mv, LinearLayout dotLay, int number, List<ImageView> Imglist) {
        activity = act;
        inflater = LayoutInflater.from(act);
        mviewPager = mv;
        dotLayout = dotLay;
        dotLayout.removeAllViews();
        num = number;
        list = Imglist;
        initView(num, list);
        if (isAutoPlay) {
            startPlay(4);
        }
    }
        //自定义布局 时间 参数
        public  void lunBo(Activity act, ViewPager mv, LinearLayout dotLay, int number, int time, List<ImageView> Imglist) {
            activity=act;
            inflater = LayoutInflater.from(act);
            mviewPager=mv;
            dotLayout=dotLay;
            dotLayout.removeAllViews();
            num=number;
            list=Imglist;
            initView(num,list);
            if (isAutoPlay) {
                startPlay(time);
            }
        }

    public void initView(int num,List<ImageView> list) {
        dotViewList = new ArrayList<ImageView>();
        for (int i = 0; i < num; i++) {
            ImageView dotView = new ImageView(activity);
            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(new ActionBar.LayoutParams(
                    ActionBar.LayoutParams.WRAP_CONTENT, android.view.ViewGroup.LayoutParams.WRAP_CONTENT));

            params.leftMargin = 15;//设置小圆点的外边距
            params.rightMargin = 15;

            params.height = 40;//设置小圆点的大小
            params.width = 40;

            if (i == 0) {
                dotView.setBackgroundResource(R.drawable.point_pressed);
            } else {

                dotView.setBackgroundResource(R.drawable.point_unpressed);
            }
            dotLayout.addView(dotView, params);

            dotViewList.add(dotView);
            //上面是动态添加了四个小圆点
        }
        ImagePaperAdapter adapter = new ImagePaperAdapter((ArrayList) list);

        mviewPager.setAdapter(adapter);
        mviewPager.setCurrentItem(0);
        mviewPager.setOnPageChangeListener(new MyPageChangeListener());

    }

    /**
     * 开始轮播图切换
     * @param //activity
     * @param i
     */
    private void startPlay(int i) {
        scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();
        scheduledExecutorService.scheduleAtFixedRate(new SlideShowTask(), 1, i, TimeUnit.SECONDS);
        //根据他的参数说明，第一个参数是执行的任务，第二个参数是第一次执行的间隔，第三个参数是执行任务的周期；
    }

    /**
     * 执行轮播图切换任务
     */
    private class SlideShowTask implements Runnable {

        @Override
        public void run() {
            // TODO Auto-generated method stub
            synchronized (mviewPager) {
                currentItem = (currentItem + 1) % list.size();
                handler.sendEmptyMessage(100);
            }
        }
    }

    /**
     * ViewPager的监听器
     * 当ViewPager中页面的状态发生改变时调用
     */
    private class MyPageChangeListener implements ViewPager.OnPageChangeListener {

        boolean isAutoPlay = false;

        @Override
        public void onPageScrollStateChanged(int arg0) {
            // TODO Auto-generated method stub
            switch (arg0) {
                case 1:// 手势滑动，空闲中
                    isAutoPlay = false;
                    System.out.println(" 手势滑动，空闲中");
                    break;
                case 2:// 界面切换中
                    isAutoPlay = true;
                    System.out.println(" 界面切换中");
                    break;
                case 0:// 滑动结束，即切换完毕或者加载完毕
                    // 当前为最后一张，此时从右向左滑，则切换到第一张
                    if (mviewPager.getCurrentItem() == mviewPager.getAdapter().getCount() - 1 && !isAutoPlay) {
                        mviewPager.setCurrentItem(0);
                        System.out.println(" 滑动到最后一张");
                    }
                    // 当前为第一张，此时从左向右滑，则切换到最后一张
                    else if (mviewPager.getCurrentItem() == 0 && !isAutoPlay) {
                        mviewPager.setCurrentItem(mviewPager.getAdapter().getCount() - 1);
                        System.out.println(" 滑动到第一张");
                    }
                    break;
            }
        }

        @Override
        public void onPageScrolled(int arg0, float arg1, int arg2) {
            // TODO Auto-generated method stub
        }

        @Override
        public void onPageSelected(int pos) {
            // TODO Auto-generated method stub
            //这里面动态改变小圆点的被背景，来实现效果
            currentItem = pos;
            for (int i = 0; i < dotViewList.size(); i++) {
                if (i == pos) {
                    dotViewList.get(pos).setBackgroundResource(R.drawable.point_pressed);
                } else {
                    dotViewList.get(i).setBackgroundResource(R.drawable.point_unpressed);
                }
            }
        }

    }

}
