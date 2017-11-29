package com.bobo.dbtest;

import android.app.Application;
import android.content.Context;

/**
 * Created by zzb on 2017/11/29.
 */

public class BaseApplication extends Application {


    private static BaseApplication mApplication;

    /**
     * 获取Context
     * @return 返回Context的对象
     */
    public static Context getContext(){
        return mApplication.getApplicationContext();
    }


    @Override
    public void onCreate() {
        super.onCreate();
    }



}
