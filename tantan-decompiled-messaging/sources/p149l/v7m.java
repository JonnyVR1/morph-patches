package p149l;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.RectF;

/* JADX INFO: loaded from: classes3.dex */
public abstract class v7m {

    /* JADX INFO: renamed from: a */
    public Context f180397a;

    /* JADX INFO: renamed from: b */
    public int f180398b;

    /* JADX INFO: renamed from: c */
    public int f180399c;

    /* JADX INFO: renamed from: f */
    public u1m f180402f;

    /* JADX INFO: renamed from: h */
    public RectF f180404h;

    /* JADX INFO: renamed from: d */
    public int f180400d = 0;

    /* JADX INFO: renamed from: e */
    public int f180401e = 0;

    /* JADX INFO: renamed from: g */
    public RectF f180403g = new RectF();

    public v7m(Context context) {
        this.f180397a = context;
    }

    /* JADX INFO: renamed from: a */
    public int m197377a(int i) {
        return (int) ((this.f180397a.getResources().getDisplayMetrics().density * i) + 0.5f);
    }

    /* JADX INFO: renamed from: b */
    public Context m197378b() {
        return this.f180397a;
    }

    /* JADX INFO: renamed from: c */
    public int m197379c() {
        return this.f180400d;
    }

    /* JADX INFO: renamed from: d */
    public float m197380d(float f, float f2, int i) {
        return f + (((f2 - f) * i) / 100.0f);
    }

    /* JADX INFO: renamed from: e */
    public int m197381e(int i, int i2, int i3) {
        int iRed = Color.red(i);
        int iGreen = Color.green(i);
        int iBlue = Color.blue(i);
        int iAlpha = Color.alpha(i);
        int iRed2 = Color.red(i2);
        int iGreen2 = Color.green(i2);
        return Color.argb(iAlpha + ((i3 * (Color.alpha(i2) - iAlpha)) / 100), iRed + (((iRed2 - iRed) * i3) / 100), iGreen + (((iGreen2 - iGreen) * i3) / 100), iBlue + (((Color.blue(i2) - iBlue) * i3) / 100));
    }

    /* JADX INFO: renamed from: f */
    public void mo116668f(int i, int i2) {
        this.f180400d = i;
        this.f180401e = i2;
    }

    /* JADX INFO: renamed from: g */
    public abstract void mo116669g(Canvas canvas, int i, int i2);

    /* JADX INFO: renamed from: h */
    public void mo116670h(int i, int i2) {
        this.f180399c = i2;
        this.f180398b = i;
    }

    /* JADX INFO: renamed from: j */
    public void mo126278j(RectF rectF) {
        this.f180404h = rectF;
    }

    /* JADX INFO: renamed from: k */
    public void mo126279k(u1m u1mVar) {
        this.f180402f = u1mVar;
    }

    /* JADX INFO: renamed from: i */
    public void mo126277i() {
    }
}
