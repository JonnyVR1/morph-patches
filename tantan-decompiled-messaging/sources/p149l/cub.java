package p149l;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.RectF;

/* JADX INFO: loaded from: classes8.dex */
public class cub {

    /* JADX INFO: renamed from: a */
    public final Rect f82548a;

    /* JADX INFO: renamed from: b */
    public final Rect f82549b;

    public cub(Rect rect, Rect rect2) {
        this.f82548a = rect;
        this.f82549b = rect2;
    }

    /* JADX INFO: renamed from: b */
    public static cub m108741b(RectF rectF, RectF rectF2, RectF rectF3) {
        return new cub(m108742d(rectF, rectF2), m108742d(rectF, rectF3));
    }

    /* JADX INFO: renamed from: d */
    public static Rect m108742d(RectF rectF, RectF rectF2) {
        float f = rectF.left;
        float f2 = rectF.top;
        return new Rect(Math.round(rectF2.left - f), Math.round(rectF2.top - f2), Math.round(rectF2.right - f), Math.round(rectF2.bottom - f2));
    }

    /* JADX INFO: renamed from: a */
    public Bitmap m108743a(Bitmap bitmap) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, m108744c(bitmap.getWidth(), this.f82549b.left, this.f82548a.width()), m108744c(bitmap.getHeight(), this.f82549b.top, this.f82548a.height()), m108744c(bitmap.getWidth(), this.f82549b.width(), this.f82548a.width()), m108744c(bitmap.getHeight(), this.f82549b.height(), this.f82548a.height()));
        return bitmapCreateBitmap.copy(bitmapCreateBitmap.getConfig() == null ? Bitmap.Config.ARGB_8888 : bitmapCreateBitmap.getConfig(), true);
    }

    /* JADX INFO: renamed from: c */
    public final int m108744c(int i, int i2, float f) {
        return Math.round((i * i2) / f);
    }
}
