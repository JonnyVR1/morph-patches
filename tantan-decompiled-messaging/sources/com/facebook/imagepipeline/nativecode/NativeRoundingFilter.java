package com.facebook.imagepipeline.nativecode;

import android.graphics.Bitmap;
import p149l.f620;
import p149l.i5e;
import p149l.rf80;

/* JADX INFO: loaded from: classes.dex */
@i5e
public class NativeRoundingFilter {
    static {
        f620.m119578a();
    }

    @i5e
    private static native void nativeAddRoundedCornersFilter(Bitmap bitmap, int i, int i2, int i3, int i4);

    @i5e
    private static native void nativeToCircleFastFilter(Bitmap bitmap, boolean z);

    @i5e
    private static native void nativeToCircleFilter(Bitmap bitmap, boolean z);

    @i5e
    private static native void nativeToCircleWithBorderFilter(Bitmap bitmap, int i, int i2, boolean z);

    @i5e
    public static void toCircle(Bitmap bitmap, boolean z) {
        rf80.m179116g(bitmap);
        if (bitmap.getWidth() < 3 || bitmap.getHeight() < 3) {
            return;
        }
        nativeToCircleFilter(bitmap, z);
    }

    @i5e
    public static void toCircleFast(Bitmap bitmap, boolean z) {
        rf80.m179116g(bitmap);
        if (bitmap.getWidth() < 3 || bitmap.getHeight() < 3) {
            return;
        }
        nativeToCircleFastFilter(bitmap, z);
    }
}
