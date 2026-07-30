package com.facebook.imagepipeline.nativecode;

import android.graphics.Bitmap;
import p153l.ne20;
import p153l.w6e;
import p153l.wn80;

/* JADX INFO: loaded from: classes.dex */
@w6e
public class NativeBlurFilter {
    static {
        ne20.m162815a();
    }

    /* JADX INFO: renamed from: a */
    public static void m8511a(Bitmap bitmap, int i, int i2) {
        wn80.m207182g(bitmap);
        wn80.m207177b(Boolean.valueOf(i > 0));
        wn80.m207177b(Boolean.valueOf(i2 > 0));
        nativeIterativeBoxBlur(bitmap, i, i2);
    }

    @w6e
    private static native void nativeIterativeBoxBlur(Bitmap bitmap, int i, int i2);
}
