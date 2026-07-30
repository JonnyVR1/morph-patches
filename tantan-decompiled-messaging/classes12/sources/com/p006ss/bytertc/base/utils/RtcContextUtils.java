package com.p006ss.bytertc.base.utils;

import android.content.Context;
import com.bytedance.realx.base.CalledByNative;
import com.bytedance.realx.base.ContextUtils;
import l.ig3;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
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
            ig3.a("Application context cannot be null for ContextUtils.initialize.");
        }
    }
}
