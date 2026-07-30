package p007l;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.RectF;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class cub {

    /* JADX INFO: renamed from: a */
    public final Rect f2483a;

    /* JADX INFO: renamed from: b */
    public final Rect f2484b;

    public cub(Rect rect, Rect rect2) {
        this.f2483a = rect;
        this.f2484b = rect2;
    }

    /* JADX INFO: renamed from: b */
    public static cub m8802b(RectF rectF, RectF rectF2, RectF rectF3) {
        return new cub(m8803d(rectF, rectF2), m8803d(rectF, rectF3));
    }

    /* JADX INFO: renamed from: d */
    public static Rect m8803d(RectF rectF, RectF rectF2) {
        float f = rectF.left;
        float f2 = rectF.top;
        return new Rect(Math.round(rectF2.left - f), Math.round(rectF2.top - f2), Math.round(rectF2.right - f), Math.round(rectF2.bottom - f2));
    }

    /* JADX INFO: renamed from: a */
    public Bitmap m8804a(Bitmap bitmap) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, m8805c(bitmap.getWidth(), this.f2484b.left, this.f2483a.width()), m8805c(bitmap.getHeight(), this.f2484b.top, this.f2483a.height()), m8805c(bitmap.getWidth(), this.f2484b.width(), this.f2483a.width()), m8805c(bitmap.getHeight(), this.f2484b.height(), this.f2483a.height()));
        return bitmapCreateBitmap.copy(bitmapCreateBitmap.getConfig() == null ? Bitmap.Config.ARGB_8888 : bitmapCreateBitmap.getConfig(), true);
    }

    /* JADX INFO: renamed from: c */
    public final int m8805c(int i, int i2, float f) {
        return Math.round((i * i2) / f);
    }
}
