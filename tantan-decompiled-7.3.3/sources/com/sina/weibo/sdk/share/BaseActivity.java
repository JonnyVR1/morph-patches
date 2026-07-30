package com.sina.weibo.sdk.share;

import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Bundle;
import com.sina.weibo.sdk.utils.LogUtil;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes11.dex */
public class BaseActivity extends Activity {
    private static final String TAG = "BaseActivity";

    private boolean fixOrientation() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mActivityInfo");
            declaredField.setAccessible(true);
            ((ActivityInfo) declaredField.get(this)).screenOrientation = -1;
            declaredField.setAccessible(false);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    private boolean isTranslucentOrFloating() {
        Exception e;
        boolean zBooleanValue;
        try {
            TypedArray typedArrayObtainStyledAttributes = obtainStyledAttributes((int[]) Class.forName("com.android.internal.R$styleable").getField("Window").get(null));
            Method method = ActivityInfo.class.getMethod("isTranslucentOrFloating", TypedArray.class);
            method.setAccessible(true);
            zBooleanValue = ((Boolean) method.invoke(null, typedArrayObtainStyledAttributes)).booleanValue();
            try {
                method.setAccessible(false);
                return zBooleanValue;
            } catch (Exception e2) {
                e = e2;
                e.printStackTrace();
                return zBooleanValue;
            }
        } catch (Exception e3) {
            e = e3;
            zBooleanValue = false;
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        if (Build.VERSION.SDK_INT == 26 && isTranslucentOrFloating()) {
            LogUtil.m81663i(TAG, "onCreate fixOrientation when Oreo, result = " + fixOrientation());
        }
        super.onCreate(bundle);
    }

    @Override // android.app.Activity
    public void setRequestedOrientation(int i) {
        if (Build.VERSION.SDK_INT == 26 && isTranslucentOrFloating()) {
            LogUtil.m81663i(TAG, "avoid calling setRequestedOrientation when Oreo.");
        } else {
            super.setRequestedOrientation(i);
        }
    }
}
