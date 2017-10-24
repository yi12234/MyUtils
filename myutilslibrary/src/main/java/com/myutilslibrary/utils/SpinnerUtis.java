package com.myutilslibrary.utils;

import android.content.Context;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.myutilslibrary.callback.StringCallBack;

import java.util.List;

/**
 * Created by Administrator on 2017/8/23.
 */

public class SpinnerUtis {
    private Spinner spinner;
    private List<String> list;
    private Context contex;
    public void spinnerutis(Context context, Spinner spinner, List<String> list, StringCallBack callback){
        this.contex=context;
        this.spinner=spinner;
        this.list=list;
        pay(context,callback);
    }
    //设置方式
    private void pay(Context context, final StringCallBack callback) {

        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(context,android.R.layout.simple_list_item_1, android.R.id.text1, list);
        spinner.setAdapter(adapter);
        spinner.setSelection(0, true);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String data = (String)spinner.getItemAtPosition(position);//从spinner中获取被选择的数据
                callback.getStringdata(data);
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // TODO Auto-generated method stub
            }
        });
    }


}

