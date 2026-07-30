package p003l;

import android.graphics.Color;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class aex {

    /* JADX INFO: renamed from: a */
    public int f2173a;

    /* JADX INFO: renamed from: b */
    public int f2174b;

    /* JADX INFO: renamed from: c */
    public int f2175c;

    /* JADX INFO: renamed from: d */
    public int f2176d;

    /* JADX INFO: renamed from: a */
    public void m2842a() {
        this.f2176d = m2843b(this.f2175c);
    }

    /* JADX INFO: renamed from: b */
    public final int m2843b(int i) {
        if (i < 0) {
            i = 0;
        } else if (i > 100) {
            i = 100;
        }
        int iRed = Color.red(this.f2173a);
        int iGreen = Color.green(this.f2173a);
        int iBlue = Color.blue(this.f2173a);
        int iAlpha = Color.alpha(this.f2173a);
        return Color.argb(iAlpha + ((i * (Color.alpha(this.f2174b) - iAlpha)) / 100), iRed + (((Color.red(this.f2174b) - iRed) * i) / 100), iGreen + (((Color.green(this.f2174b) - iGreen) * i) / 100), iBlue + (((Color.blue(this.f2174b) - iBlue) * i) / 100));
    }

    /* JADX INFO: renamed from: c */
    public int m2844c() {
        return this.f2176d;
    }

    /* JADX INFO: renamed from: d */
    public void m2845d(int i, int i2) {
        this.f2173a = i;
        this.f2174b = i2;
        m2842a();
    }

    /* JADX INFO: renamed from: e */
    public void m2846e(int i, int i2, int i3) {
        this.f2173a = i2;
        this.f2174b = i3;
        this.f2175c = i;
        m2842a();
    }
}
