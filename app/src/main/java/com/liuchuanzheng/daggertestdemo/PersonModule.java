package com.liuchuanzheng.daggertestdemo;

import android.content.Context;

import dagger.Module;
import dagger.Provides;

/**
 * @author 刘传政
 * @date 2018/8/3 0003 10:49
 * QQ:1052374416
 * 电话:18501231486
 * 作用:
 * 注意事项:
 */
@Module
public class PersonModule {
    @Provides
    static Person providePerson(Context context) {
        return new Person(context);
    }
}
