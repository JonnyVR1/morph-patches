package p003l;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.RectF;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public abstract class v7m {

    /* JADX INFO: renamed from: a */
    public Context f8224a;

    /* JADX INFO: renamed from: b */
    public int f8225b;

    /* JADX INFO: renamed from: c */
    public int f8226c;

    /* JADX INFO: renamed from: f */
    public u1m f8229f;

    /* JADX INFO: renamed from: h */
    public RectF f8231h;

    /* JADX INFO: renamed from: d */
    public int f8227d = 0;

    /* JADX INFO: renamed from: e */
    public int f8228e = 0;

    /* JADX INFO: renamed from: g */
    public RectF f8230g = new RectF();

    public v7m(Context context) {
        this.f8224a = context;
    }

    /* JADX INFO: renamed from: a */
    public int m8299a(int i) {
        return (int) ((this.f8224a.getResources().getDisplayMetrics().density * i) + 0.5f);
    }

    /* JADX INFO: renamed from: b */
    public Context m8300b() {
        return this.f8224a;
    }

    /* JADX INFO: renamed from: c */
    public int m8301c() {
        return this.f8227d;
    }

    /* JADX INFO: renamed from: d */
    public float m8302d(float f, float f2, int i) {
        return f + (((f2 - f) * i) / 100.0f);
    }

    /* JADX INFO: renamed from: e */
    public int m8303e(int i, int i2, int i3) {
        int iRed = Color.red(i);
        int iGreen = Color.green(i);
        int iBlue = Color.blue(i);
        int iAlpha = Color.alpha(i);
        int iRed2 = Color.red(i2);
        int iGreen2 = Color.green(i2);
        return Color.argb(iAlpha + ((i3 * (Color.alpha(i2) - iAlpha)) / 100), iRed + (((iRed2 - iRed) * i3) / 100), iGreen + (((iGreen2 - iGreen) * i3) / 100), iBlue + (((Color.blue(i2) - iBlue) * i3) / 100));
    }

    /* JADX INFO: renamed from: f */
    public void mo3836f(int i, int i2) {
        this.f8227d = i;
        this.f8228e = i2;
    }

    /* JADX INFO: renamed from: g */
    public abstract void mo3837g(Canvas canvas, int i, int i2);

    /* JADX INFO: renamed from: h */
    public void mo3838h(int i, int i2) {
        this.f8226c = i2;
        this.f8225b = i;
    }

    /* JADX INFO: renamed from: j */
    public void mo4546j(RectF rectF) {
        this.f8231h = rectF;
    }

    /* JADX INFO: renamed from: k */
    public void mo4547k(u1m u1mVar) {
        this.f8229f = u1mVar;
    }

    /* JADX INFO: renamed from: i */
    public void mo4545i() {
    }
}
