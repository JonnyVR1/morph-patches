package com.vivo.push.util;

import android.graphics.Bitmap;
import android.graphics.Matrix;

/* JADX INFO: renamed from: com.vivo.push.util.c */
/* JADX INFO: loaded from: classes2.dex */
public final class C14634c {
    /* JADX INFO: renamed from: a */
    public static Bitmap m84970a(Bitmap bitmap, int i, int i2) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        float f = i / width;
        float f2 = i2 / height;
        try {
            Matrix matrix = new Matrix();
            matrix.postScale(f, f2);
            try {
                return Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true);
            } catch (Exception unused) {
                return bitmap;
            }
        } catch (Exception unused2) {
            return bitmap;
        }
    }
}
