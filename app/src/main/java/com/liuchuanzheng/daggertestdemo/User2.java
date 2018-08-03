package com.liuchuanzheng.daggertestdemo;

import android.util.Log;

/**
 * @author 刘传政
 * @date 2018/8/3 0003 10:48
 * QQ:1052374416
 * 电话:18501231486
 * 作用:
 * 注意事项:
 */
public class User2 {

    private String user2;

    public User2(String user2) {
        this.user2 = user2;
    }

    public void showName(){
        Log.i("daggerDemo","我的名字是"+user2);
    }
}
