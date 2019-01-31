package com.liuchuanzheng.daggertestdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import javax.inject.Inject;

/**
 * @author 刘传政
 * 需要关注的问题
 * 1注入什么？           User类的实例
 * 2注入到哪里去？       MainActivity
 * 3注入参数有什么？     无
 * 4参数从哪里找？       没有参数所以暂时略过。
 * 5如何实现注入？        通过dagger自动生成的代码，最终实现user = newUser();
 */
public class MainActivity extends AppCompatActivity {
    /**
     * 表明这是需要要被注入的东西
     */
    @Inject
    public User user;
    @Inject
    public User2 user2;
    @Inject
    public User2 user2_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //触发注入
        DaggerUserComponent.builder().build().injectUser(this);
        user.showName();
        user2.showName();
        //测试单例
        Log.i("daggerDemo","user2:"+user2);
        Log.i("daggerDemo","user2_2:"+user2_2);
        Test test = new Test(this);
    }
}
