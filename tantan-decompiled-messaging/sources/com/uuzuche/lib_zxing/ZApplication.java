package com.uuzuche.lib_zxing;

import android.app.Application;
import android.util.DisplayMetrics;
import p149l.i4e;

/* JADX INFO: loaded from: classes2.dex */
public class ZApplication extends Application {
    /* JADX INFO: renamed from: a */
    private void m84689a() {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        i4e.f111431c = displayMetrics.density;
        i4e.f111432d = displayMetrics.densityDpi;
        i4e.f111429a = displayMetrics.widthPixels;
        i4e.f111430b = displayMetrics.heightPixels;
        i4e.f111433e = i4e.m134340a(getApplicationContext(), displayMetrics.widthPixels);
        i4e.f111434f = i4e.m134340a(getApplicationContext(), displayMetrics.heightPixels);
    }

    @Override // android.app.Application
    public void onCreate() {
        super.onCreate();
        m84689a();
    }
}
