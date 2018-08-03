package com.liuchuanzheng.daggertestdemo;

import dagger.Component;

/**
 * @author 刘传政
 * @date 2018/8/3 0003 10:06
 * QQ:1052374416
 * 电话:18501231486
 * 作用:向dagger表明注入到哪去
 * 注意事项:
 */
@Component(modules = UserModule.class)
public interface UserComponent {
    void injectUser(MainActivity activity);
}
