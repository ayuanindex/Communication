package com.ayuan.communication;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //获取Fragment管理者
        FragmentManager fragmentManager = getFragmentManager();
        //开启事务
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        //动态替换
        fragmentTransaction.replace(R.id.ll01, new Fragment1(), "f1");
        fragmentTransaction.replace(R.id.ll02, new Fragment2(), "f2");
        //提交
        fragmentTransaction.commit();

    }
}
