package p153l;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;

/* JADX INFO: loaded from: classes7.dex */
public class cc00 {
    /* JADX INFO: renamed from: a */
    public static Bitmap m108698a(Bitmap bitmap, int i, int i2, int i3) {
        float f = i;
        float width = (f * 1.0f) / bitmap.getWidth();
        float f2 = i2;
        float height = (1.0f * f2) / bitmap.getHeight();
        Matrix matrix = new Matrix();
        matrix.setScale(width, height);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        bitmapShader.setLocalMatrix(matrix);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setShader(bitmapShader);
        float f3 = i3;
        canvas.drawRoundRect(new RectF(0.0f, 0.0f, f, f2), f3, f3, paint);
        if (!bitmap.isRecycled()) {
            bitmap.recycle();
        }
        return bitmapCreateBitmap;
    }

    /* JADX INFO: renamed from: b */
    public static Bitmap m108699b(String str, int i, int i2, int i3, int i4, int i5) {
        int iMax = Math.max(i, i2);
        float fSqrt = (float) Math.sqrt(iMax * 2 * iMax);
        int i6 = (int) fSqrt;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i6, i6, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        float f = fSqrt / 2.0f;
        canvas.translate(f, f);
        canvas.rotate(-30.0f);
        canvas.drawColor(0);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(i4);
        paint.setAlpha(i5);
        paint.setTextSize(i3);
        Rect rect = new Rect();
        paint.getTextBounds(str, 0, str.length(), rect);
        Rect rect2 = new Rect();
        paint.getTextBounds("你好", 0, 2, rect2);
        int iWidth = rect.width() + rect2.width();
        int iHeight = rect.height();
        int i7 = ((int) f) * (-1);
        int i8 = i7;
        int i9 = 0;
        while (true) {
            float f2 = i8;
            if (f2 >= f) {
                return bitmapCreateBitmap;
            }
            int i10 = i7 - (i9 % 2 == 0 ? iWidth / 2 : 0);
            while (true) {
                float f3 = i10;
                if (f3 < f) {
                    canvas.drawText(str, f3, f2, paint);
                    i10 += iWidth;
                }
            }
            i9++;
            i8 += iHeight * 3;
        }
    }

    /* JADX INFO: renamed from: c */
    public static Bitmap m108700c(Bitmap bitmap, Bitmap bitmap2) {
        if (bitmap == null || bitmap.isRecycled() || bitmap2 == null || bitmap2.isRecycled() || bitmap.getWidth() > bitmap2.getWidth() || bitmap.getHeight() > bitmap2.getHeight()) {
            return null;
        }
        Bitmap bitmapCopy = bitmap.copy(Bitmap.Config.ARGB_8888, true);
        Canvas canvas = new Canvas(bitmapCopy);
        Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
        int width = (bitmap2.getWidth() / 2) - (bitmap.getWidth() / 2);
        if (width < 0) {
            width = 0;
        }
        int height = (bitmap2.getHeight() / 2) - (bitmap.getWidth() / 2);
        canvas.drawBitmap(bitmap2, new Rect(width, height >= 0 ? height : 0, bitmap.getWidth(), bitmap.getHeight()), rect, (Paint) null);
        return bitmapCopy;
    }
}
