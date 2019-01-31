package com.liuchuanzheng.daggertestdemo;

import android.content.Context;

import javax.inject.Inject;

/**
 * @author 刘传政
 * @date 2019/1/31 0031 16:02
 * QQ:1052374416
 * 电话:18501231486
 * 作用:
 * 注意事项:
 */
public class Test {
    @Inject
    Person person;

    public Test(Context context) {
        //先构造前提组件
        AppComponent appComponent = DaggerAppComponent.builder().appModule(new AppModule(context)).build();
        DaggerPersonComponent.builder().appComponent(appComponent).build().inject(this);
    }
}
