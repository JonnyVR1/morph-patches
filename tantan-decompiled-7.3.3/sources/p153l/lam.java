package p153l;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.RectF;

/* JADX INFO: loaded from: classes4.dex */
public abstract class lam {

    /* JADX INFO: renamed from: a */
    public Context f130710a;

    /* JADX INFO: renamed from: b */
    public int f130711b;

    /* JADX INFO: renamed from: c */
    public int f130712c;

    /* JADX INFO: renamed from: f */
    public n4m f130715f;

    /* JADX INFO: renamed from: h */
    public RectF f130717h;

    /* JADX INFO: renamed from: d */
    public int f130713d = 0;

    /* JADX INFO: renamed from: e */
    public int f130714e = 0;

    /* JADX INFO: renamed from: g */
    public RectF f130716g = new RectF();

    public lam(Context context) {
        this.f130710a = context;
    }

    /* JADX INFO: renamed from: a */
    public int m153506a(int i) {
        return (int) ((this.f130710a.getResources().getDisplayMetrics().density * i) + 0.5f);
    }

    /* JADX INFO: renamed from: b */
    public Context m153507b() {
        return this.f130710a;
    }

    /* JADX INFO: renamed from: c */
    public int m153508c() {
        return this.f130713d;
    }

    /* JADX INFO: renamed from: d */
    public float m153509d(float f, float f2, int i) {
        return f + (((f2 - f) * i) / 100.0f);
    }

    /* JADX INFO: renamed from: e */
    public int m153510e(int i, int i2, int i3) {
        int iRed = Color.red(i);
        int iGreen = Color.green(i);
        int iBlue = Color.blue(i);
        int iAlpha = Color.alpha(i);
        int iRed2 = Color.red(i2);
        int iGreen2 = Color.green(i2);
        return Color.argb(iAlpha + ((i3 * (Color.alpha(i2) - iAlpha)) / 100), iRed + (((iRed2 - iRed) * i3) / 100), iGreen + (((iGreen2 - iGreen) * i3) / 100), iBlue + (((Color.blue(i2) - iBlue) * i3) / 100));
    }

    /* JADX INFO: renamed from: f */
    public void mo153511f(int i, int i2) {
        this.f130713d = i;
        this.f130714e = i2;
    }

    /* JADX INFO: renamed from: g */
    public abstract void mo153512g(Canvas canvas, int i, int i2);

    /* JADX INFO: renamed from: h */
    public void mo153513h(int i, int i2) {
        this.f130712c = i2;
        this.f130711b = i;
    }

    /* JADX INFO: renamed from: j */
    public void mo153515j(RectF rectF) {
        this.f130717h = rectF;
    }

    /* JADX INFO: renamed from: k */
    public void mo153516k(n4m n4mVar) {
        this.f130715f = n4mVar;
    }

    /* JADX INFO: renamed from: i */
    public void mo153514i() {
    }
}
