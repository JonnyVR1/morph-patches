package com.cosmos.photon.push.image;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class BitmapUtil {
    public static int calculateInSampleSize(int i, int i2, int i3, int i4) {
        int i5 = 1;
        if (i2 <= i4 && i <= i3) {
            return 1;
        }
        int i6 = i2 / 2;
        int i7 = i / 2;
        while (i6 / i5 >= i4 && i7 / i5 >= i3) {
            i5 *= 2;
        }
        return i5;
    }

    public static Bitmap createBitmapByView(View view, float f) {
        int width = view.getWidth();
        int height = view.getHeight();
        if (width <= 0 || height <= 0) {
            return null;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap((int) (width / f), (int) (height / f), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.drawColor(-1, PorterDuff.Mode.CLEAR);
        float f2 = 1.0f / f;
        canvas.scale(f2, f2);
        view.draw(canvas);
        canvas.setBitmap(null);
        return bitmapCreateBitmap;
    }

    public static int[] getBitmapInfo(String str) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        return new int[]{options.outWidth, options.outHeight};
    }

    public static Bitmap rotateBitmap(Bitmap bitmap, int i) {
        Matrix matrix = new Matrix();
        matrix.setRotate(i);
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
    }

    public static Bitmap scaleBitmap(Bitmap bitmap, int i, int i2) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        float f = i / width;
        float f2 = i2 / height;
        if (f > 1.0f && f2 > 1.0f) {
            return bitmap;
        }
        if (f > f2) {
            f = f2;
        }
        Matrix matrix = new Matrix();
        matrix.postScale(f, f);
        return Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true);
    }

    public static Bitmap createBitmapByView(View view) {
        return createBitmapByView(view, 1.0f);
    }

    public static Bitmap createBitmapByView(View view, int i, int i2, int i3, int i4) {
        int width = view.getWidth();
        int height = view.getHeight();
        if (width <= 0 || height <= 0 || i <= 0 || i2 <= 0) {
            return null;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.drawColor(-1, PorterDuff.Mode.CLEAR);
        canvas.translate(-i3, -i4);
        view.draw(canvas);
        canvas.setBitmap(null);
        return bitmapCreateBitmap;
    }
}
