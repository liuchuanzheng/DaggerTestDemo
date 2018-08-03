package com.liuchuanzheng.daggertestdemo;

import android.util.Log;

import javax.inject.Inject;

/**
 * @author 刘传政
 * @date 2018/8/3 0003 9:56
 * QQ:1052374416
 * 电话:18501231486
 * 作用:这是想被注入的类
 * 注意事项:
 */
public class User {
    /**
     * 写在构造方法上表明此类会被dagger自动实例化注入到别的类。至于注入到哪还不确定。
     */
    @Inject
    public User() {
    }
    public void showName(){
        Log.i("daggerDemo","我的名字是小明");
    }
}
