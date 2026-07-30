package com.momo.xengine.media;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes8.dex */
public class SharePreferenceUtils {
    private Context context = null;

    /* JADX INFO: renamed from: sp */
    private SharedPreferences f14747sp = null;

    public int getInt(String str) {
        return this.f14747sp.getInt(str, 0);
    }

    public void init(Context context) {
        if (context != null) {
            this.context = context;
            this.f14747sp = context.getSharedPreferences("xom.momo.xengine.media", 0);
        }
    }

    public void putInt(String str, int i) {
        SharedPreferences sharedPreferences = this.f14747sp;
        if (sharedPreferences != null) {
            sharedPreferences.edit().putInt(str, i).commit();
        }
    }
}
