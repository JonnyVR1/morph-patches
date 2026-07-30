package p149l;

import android.graphics.Color;

/* JADX INFO: loaded from: classes3.dex */
public class aex {

    /* JADX INFO: renamed from: a */
    public int f69128a;

    /* JADX INFO: renamed from: b */
    public int f69129b;

    /* JADX INFO: renamed from: c */
    public int f69130c;

    /* JADX INFO: renamed from: d */
    public int f69131d;

    /* JADX INFO: renamed from: a */
    public void m96147a() {
        this.f69131d = m96148b(this.f69130c);
    }

    /* JADX INFO: renamed from: b */
    public final int m96148b(int i) {
        if (i < 0) {
            i = 0;
        } else if (i > 100) {
            i = 100;
        }
        int iRed = Color.red(this.f69128a);
        int iGreen = Color.green(this.f69128a);
        int iBlue = Color.blue(this.f69128a);
        int iAlpha = Color.alpha(this.f69128a);
        return Color.argb(iAlpha + ((i * (Color.alpha(this.f69129b) - iAlpha)) / 100), iRed + (((Color.red(this.f69129b) - iRed) * i) / 100), iGreen + (((Color.green(this.f69129b) - iGreen) * i) / 100), iBlue + (((Color.blue(this.f69129b) - iBlue) * i) / 100));
    }

    /* JADX INFO: renamed from: c */
    public int m96149c() {
        return this.f69131d;
    }

    /* JADX INFO: renamed from: d */
    public void m96150d(int i, int i2) {
        this.f69128a = i;
        this.f69129b = i2;
        m96147a();
    }

    /* JADX INFO: renamed from: e */
    public void m96151e(int i, int i2, int i3) {
        this.f69128a = i2;
        this.f69129b = i3;
        this.f69130c = i;
        m96147a();
    }
}
