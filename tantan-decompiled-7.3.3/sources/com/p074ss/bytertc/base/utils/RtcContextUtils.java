package com.p074ss.bytertc.base.utils;

import android.content.Context;
import com.bytedance.realx.base.CalledByNative;
import com.bytedance.realx.base.ContextUtils;
import p153l.wg3;

/* JADX INFO: loaded from: classes11.dex */
public class RtcContextUtils {
    private static final String TAG = "ContextUtils";
    private static Context applicationContext;

    public static Context getApplicationContext() {
        return ContextUtils.getApplicationContext();
    }

    @CalledByNative
    public static void initialize(Context context) {
        if (context != null) {
            ContextUtils.initialize(context.getApplicationContext());
        } else {
            wg3.m206174a("Application context cannot be null for ContextUtils.initialize.");
        }
    }
}
