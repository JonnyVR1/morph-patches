package com.momo.xengine.media;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes8.dex */
public class SharePreferenceUtils {
    private Context context = null;

    /* JADX INFO: renamed from: sp */
    private SharedPreferences f15466sp = null;

    public int getInt(String str) {
        return this.f15466sp.getInt(str, 0);
    }

    public void init(Context context) {
        if (context != null) {
            this.context = context;
            this.f15466sp = context.getSharedPreferences("xom.momo.xengine.media", 0);
        }
    }

    public void putInt(String str, int i) {
        SharedPreferences sharedPreferences = this.f15466sp;
        if (sharedPreferences != null) {
            sharedPreferences.edit().putInt(str, i).commit();
        }
    }
}
