package com.momo.rtcbase;

import android.content.Context;
import p149l.ig3;

/* JADX INFO: loaded from: classes8.dex */
public class ContextUtils {
    private static final String TAG = "ContextUtils";
    private static Context applicationContext;

    @Deprecated
    public static Context getApplicationContext() {
        return applicationContext;
    }

    public static void initialize(Context context) {
        if (context != null) {
            applicationContext = context;
        } else {
            ig3.m135964a("Application context cannot be null for ContextUtils.initialize.");
        }
    }
}
