package com.facebook.imagepipeline.nativecode;

import android.graphics.Bitmap;
import p153l.w6e;
import p153l.wjm;
import p153l.wn80;

/* JADX INFO: loaded from: classes.dex */
@w6e
public class Bitmaps {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f6497a = 0;

    static {
        wjm.m206712a();
    }

    @w6e
    public static void copyBitmap(Bitmap bitmap, Bitmap bitmap2) {
        wn80.m207177b(Boolean.valueOf(bitmap2.getConfig() == bitmap.getConfig()));
        wn80.m207177b(Boolean.valueOf(bitmap.isMutable()));
        wn80.m207177b(Boolean.valueOf(bitmap.getWidth() == bitmap2.getWidth()));
        wn80.m207177b(Boolean.valueOf(bitmap.getHeight() == bitmap2.getHeight()));
        nativeCopyBitmap(bitmap, bitmap.getRowBytes(), bitmap2, bitmap2.getRowBytes(), bitmap.getHeight());
    }

    @w6e
    private static native void nativeCopyBitmap(Bitmap bitmap, int i, Bitmap bitmap2, int i2, int i3);
}
