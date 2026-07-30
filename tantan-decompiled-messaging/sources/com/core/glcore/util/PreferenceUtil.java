package com.core.glcore.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

/* JADX INFO: loaded from: classes.dex */
public class PreferenceUtil {
    private static final String GPU_BENMARK_LEVEL = "gpu_benmark_level";

    public static SharedPreferences getDefault(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context);
    }

    public static SharedPreferences.Editor getEditor(Context context) {
        return getDefault(context).edit();
    }

    public static int getGpuBenmarkLevel(Context context) {
        return getDefault(context).getInt(GPU_BENMARK_LEVEL, 0);
    }

    public static void setGpuBenmarkLevel(Context context, int i) {
        getEditor(context).putInt(GPU_BENMARK_LEVEL, i).commit();
    }
}
