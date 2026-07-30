package com.facebook.imagepipeline.nativecode;

import android.graphics.Bitmap;
import p149l.i5e;
import p149l.rf80;
import p149l.thm;

/* JADX INFO: loaded from: classes.dex */
@i5e
public class Bitmaps {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f6460a = 0;

    static {
        thm.m188923a();
    }

    @i5e
    public static void copyBitmap(Bitmap bitmap, Bitmap bitmap2) {
        rf80.m179111b(Boolean.valueOf(bitmap2.getConfig() == bitmap.getConfig()));
        rf80.m179111b(Boolean.valueOf(bitmap.isMutable()));
        rf80.m179111b(Boolean.valueOf(bitmap.getWidth() == bitmap2.getWidth()));
        rf80.m179111b(Boolean.valueOf(bitmap.getHeight() == bitmap2.getHeight()));
        nativeCopyBitmap(bitmap, bitmap.getRowBytes(), bitmap2, bitmap2.getRowBytes(), bitmap.getHeight());
    }

    @i5e
    private static native void nativeCopyBitmap(Bitmap bitmap, int i, Bitmap bitmap2, int i2, int i3);
}
