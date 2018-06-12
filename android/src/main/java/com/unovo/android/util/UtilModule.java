package com.unovo.android.util;

import android.content.Context;
import android.content.pm.PackageManager;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

/**
 * Created by lianyu02 on 2018/6/12.
 */

public class UtilModule extends ReactContextBaseJavaModule {
    private static ReactApplicationContext context;

    public UtilModule(ReactApplicationContext reactContext) {
        super(reactContext);
        this.context = reactContext;
    }

    @Override
    public String getName() {
        return "Util";
    }

    //读取android版本号
    @ReactMethod
    public void getVerSionCode(Callback cb){
        Context mContext=getReactApplicationContext();

        int versionCode = 1;
        try {
            //获取软件版本号，对应AndroidManifest.xml下android:versionCode
            versionCode = mContext.getPackageManager().
                    getPackageInfo(mContext.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
        cb.invoke(versionCode);
    }
}
