package com.facebook.imagepipeline.nativecode;

import android.graphics.Bitmap;
import p153l.ne20;
import p153l.w6e;
import p153l.wn80;

/* JADX INFO: loaded from: classes.dex */
@w6e
public class NativeRoundingFilter {
    static {
        ne20.m162815a();
    }

    @w6e
    private static native void nativeAddRoundedCornersFilter(Bitmap bitmap, int i, int i2, int i3, int i4);

    @w6e
    private static native void nativeToCircleFastFilter(Bitmap bitmap, boolean z);

    @w6e
    private static native void nativeToCircleFilter(Bitmap bitmap, boolean z);

    @w6e
    private static native void nativeToCircleWithBorderFilter(Bitmap bitmap, int i, int i2, boolean z);

    @w6e
    public static void toCircle(Bitmap bitmap, boolean z) {
        wn80.m207182g(bitmap);
        if (bitmap.getWidth() < 3 || bitmap.getHeight() < 3) {
            return;
        }
        nativeToCircleFilter(bitmap, z);
    }

    @w6e
    public static void toCircleFast(Bitmap bitmap, boolean z) {
        wn80.m207182g(bitmap);
        if (bitmap.getWidth() < 3 || bitmap.getHeight() < 3) {
            return;
        }
        nativeToCircleFastFilter(bitmap, z);
    }
}
