package com.facebook.imagepipeline.nativecode;

import android.graphics.Bitmap;
import p149l.f620;
import p149l.i5e;
import p149l.rf80;

/* JADX INFO: loaded from: classes.dex */
@i5e
public class NativeBlurFilter {
    static {
        f620.m119578a();
    }

    /* JADX INFO: renamed from: a */
    public static void m8457a(Bitmap bitmap, int i, int i2) {
        rf80.m179116g(bitmap);
        rf80.m179111b(Boolean.valueOf(i > 0));
        rf80.m179111b(Boolean.valueOf(i2 > 0));
        nativeIterativeBoxBlur(bitmap, i, i2);
    }

    @i5e
    private static native void nativeIterativeBoxBlur(Bitmap bitmap, int i, int i2);
}
