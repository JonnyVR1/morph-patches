package com.bytedance.realx.base;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import dalvik.system.BaseDexClassLoader;
import p149l.ig3;

/* JADX INFO: loaded from: classes.dex */
public class ContextUtils {
    private static final String TAG = "ContextUtils";
    private static Context applicationContext;

    @CalledByNative
    public static String getAppLibPath(String str) throws Exception {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            String strFindLibrary = ((BaseDexClassLoader) applicationContext.getClassLoader()).findLibrary(str);
            return strFindLibrary == null ? "" : strFindLibrary;
        } catch (Exception e) {
            RXLogging.m5688e("realx Utils", "getAppLibPath Exception : " + e.getMessage());
            Log.e("realx Utils", "getAppLibPath Exception : " + e.getMessage());
            throw e;
        }
    }

    @CalledByNative
    public static String getAppPath() {
        return applicationContext.getExternalFilesDir("").toString();
    }

    @Deprecated
    public static Context getApplicationContext() {
        return applicationContext;
    }

    @CalledByNative
    public static void initialize(Context context) {
        if (context != null) {
            applicationContext = context;
        } else {
            ig3.m135964a("Application context cannot be null for ContextUtils.initialize.");
        }
    }
}
