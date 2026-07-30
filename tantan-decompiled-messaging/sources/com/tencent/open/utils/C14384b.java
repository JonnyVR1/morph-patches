package com.tencent.open.utils;

import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.content.res.TypedArray;
import android.os.Build;
import com.tencent.open.log.SLog;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: com.tencent.open.utils.b */
/* JADX INFO: loaded from: classes2.dex */
public class C14384b {
    /* JADX INFO: renamed from: a */
    public static void m84377a(Activity activity) {
        if (Build.VERSION.SDK_INT == 26 && m84379c(activity)) {
            SLog.m84309i("ActivityFixUtils", "onCreate fixOrientation when Oreo, result = " + m84380d(activity));
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m84378b(Activity activity) {
        if (Build.VERSION.SDK_INT != 26 || !m84379c(activity)) {
            return false;
        }
        SLog.m84309i("ActivityFixUtils", "avoid calling setRequestedOrientation when Oreo.");
        return true;
    }

    /* JADX INFO: renamed from: c */
    private static boolean m84379c(Activity activity) {
        Throwable th;
        boolean zBooleanValue;
        try {
            TypedArray typedArrayObtainStyledAttributes = activity.obtainStyledAttributes((int[]) Class.forName("com.android.internal.R$styleable").getField("Window").get(null));
            Method method = ActivityInfo.class.getMethod("isTranslucentOrFloating", TypedArray.class);
            method.setAccessible(true);
            zBooleanValue = ((Boolean) method.invoke(null, typedArrayObtainStyledAttributes)).booleanValue();
            try {
                method.setAccessible(false);
                return zBooleanValue;
            } catch (Throwable th2) {
                th = th2;
                SLog.m84308e("ActivityFixUtils", "isTranslucentOrFloating exception", th);
                return zBooleanValue;
            }
        } catch (Throwable th3) {
            th = th3;
            zBooleanValue = false;
        }
    }

    /* JADX INFO: renamed from: d */
    private static boolean m84380d(Activity activity) {
        try {
            Field declaredField = Activity.class.getDeclaredField("mActivityInfo");
            declaredField.setAccessible(true);
            ((ActivityInfo) declaredField.get(activity)).screenOrientation = -1;
            declaredField.setAccessible(false);
            return true;
        } catch (Throwable th) {
            SLog.m84308e("ActivityFixUtils", "fixOrientation exception", th);
            return false;
        }
    }
}
