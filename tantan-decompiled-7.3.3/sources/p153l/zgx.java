package p153l;

import android.graphics.Color;

/* JADX INFO: loaded from: classes3.dex */
public class zgx {

    /* JADX INFO: renamed from: a */
    public int f204361a;

    /* JADX INFO: renamed from: b */
    public int f204362b;

    /* JADX INFO: renamed from: c */
    public int f204363c;

    /* JADX INFO: renamed from: d */
    public int f204364d;

    /* JADX INFO: renamed from: a */
    public void m219677a() {
        this.f204364d = m219678b(this.f204363c);
    }

    /* JADX INFO: renamed from: b */
    public final int m219678b(int i) {
        if (i < 0) {
            i = 0;
        } else if (i > 100) {
            i = 100;
        }
        int iRed = Color.red(this.f204361a);
        int iGreen = Color.green(this.f204361a);
        int iBlue = Color.blue(this.f204361a);
        int iAlpha = Color.alpha(this.f204361a);
        return Color.argb(iAlpha + ((i * (Color.alpha(this.f204362b) - iAlpha)) / 100), iRed + (((Color.red(this.f204362b) - iRed) * i) / 100), iGreen + (((Color.green(this.f204362b) - iGreen) * i) / 100), iBlue + (((Color.blue(this.f204362b) - iBlue) * i) / 100));
    }

    /* JADX INFO: renamed from: c */
    public int m219679c() {
        return this.f204364d;
    }

    /* JADX INFO: renamed from: d */
    public void m219680d(int i, int i2) {
        this.f204361a = i;
        this.f204362b = i2;
        m219677a();
    }

    /* JADX INFO: renamed from: e */
    public void m219681e(int i, int i2, int i3) {
        this.f204361a = i2;
        this.f204362b = i3;
        this.f204363c = i;
        m219677a();
    }
}
