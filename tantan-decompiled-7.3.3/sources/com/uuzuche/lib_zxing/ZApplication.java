package com.uuzuche.lib_zxing;

import android.app.Application;
import android.util.DisplayMetrics;
import p153l.w5e;

/* JADX INFO: loaded from: classes2.dex */
public class ZApplication extends Application {
    /* JADX INFO: renamed from: a */
    private void m85860a() {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        w5e.f187498c = displayMetrics.density;
        w5e.f187499d = displayMetrics.densityDpi;
        w5e.f187496a = displayMetrics.widthPixels;
        w5e.f187497b = displayMetrics.heightPixels;
        w5e.f187500e = w5e.m204971a(getApplicationContext(), displayMetrics.widthPixels);
        w5e.f187501f = w5e.m204971a(getApplicationContext(), displayMetrics.heightPixels);
    }

    @Override // android.app.Application
    public void onCreate() {
        super.onCreate();
        m85860a();
    }
}
