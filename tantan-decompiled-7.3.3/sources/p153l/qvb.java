package p153l;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.RectF;

/* JADX INFO: loaded from: classes8.dex */
public class qvb {

    /* JADX INFO: renamed from: a */
    public final Rect f159730a;

    /* JADX INFO: renamed from: b */
    public final Rect f159731b;

    public qvb(Rect rect, Rect rect2) {
        this.f159730a = rect;
        this.f159731b = rect2;
    }

    /* JADX INFO: renamed from: b */
    public static qvb m178254b(RectF rectF, RectF rectF2, RectF rectF3) {
        return new qvb(m178255d(rectF, rectF2), m178255d(rectF, rectF3));
    }

    /* JADX INFO: renamed from: d */
    public static Rect m178255d(RectF rectF, RectF rectF2) {
        float f = rectF.left;
        float f2 = rectF.top;
        return new Rect(Math.round(rectF2.left - f), Math.round(rectF2.top - f2), Math.round(rectF2.right - f), Math.round(rectF2.bottom - f2));
    }

    /* JADX INFO: renamed from: a */
    public Bitmap m178256a(Bitmap bitmap) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, m178257c(bitmap.getWidth(), this.f159731b.left, this.f159730a.width()), m178257c(bitmap.getHeight(), this.f159731b.top, this.f159730a.height()), m178257c(bitmap.getWidth(), this.f159731b.width(), this.f159730a.width()), m178257c(bitmap.getHeight(), this.f159731b.height(), this.f159730a.height()));
        return bitmapCreateBitmap.copy(bitmapCreateBitmap.getConfig() == null ? Bitmap.Config.ARGB_8888 : bitmapCreateBitmap.getConfig(), true);
    }

    /* JADX INFO: renamed from: c */
    public final int m178257c(int i, int i2, float f) {
        return Math.round((i * i2) / f);
    }
}
