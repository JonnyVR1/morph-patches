package com.momo.xeengine.utils;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Typeface;
import androidx.annotation.Keep;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
@Keep
public class EmojiUtil {
    public static Bitmap createEmojiBitmap(String str, int i) {
        Bitmap bitmapCreateBitmap = null;
        try {
            bitmapCreateBitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            canvas.drawColor(0, PorterDuff.Mode.CLEAR);
            Paint paint = new Paint(1);
            float f = i;
            paint.setTextSize(0.8f * f);
            paint.setTextAlign(Paint.Align.CENTER);
            paint.setTypeface(Typeface.DEFAULT);
            Rect rect = new Rect();
            paint.getTextBounds(str, 0, str.length(), rect);
            float f2 = f / 2.0f;
            canvas.drawText(str, f2, f2 - rect.exactCenterY(), paint);
            return bitmapCreateBitmap;
        } catch (Exception unused) {
            return bitmapCreateBitmap;
        }
    }
}
