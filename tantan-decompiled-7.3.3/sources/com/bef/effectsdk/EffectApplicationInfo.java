package com.bef.effectsdk;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public class EffectApplicationInfo {
    private static Context appContext;

    public static Context getAppContext() {
        return appContext;
    }

    private static native int nativeSetHomeDir(String str);

    private static void onSetAppContext() {
        Context context = appContext;
        if (context != null) {
            nativeSetHomeDir(context.getFilesDir().getAbsolutePath());
        }
    }

    public static void setAppContext(Context context) {
        appContext = context;
        onSetAppContext();
    }
}
