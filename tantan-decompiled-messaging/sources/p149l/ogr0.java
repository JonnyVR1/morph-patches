package p149l;

import android.graphics.Bitmap;
import androidx.annotation.Nullable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
public final class ogr0 {

    /* JADX INFO: renamed from: a */
    public final v6w0 f143900a = new v6w0();

    /* JADX INFO: renamed from: b */
    public final int[] f143901b = new int[256];

    /* JADX INFO: renamed from: c */
    public boolean f143902c;

    /* JADX INFO: renamed from: d */
    public int f143903d;

    /* JADX INFO: renamed from: e */
    public int f143904e;

    /* JADX INFO: renamed from: f */
    public int f143905f;

    /* JADX INFO: renamed from: g */
    public int f143906g;

    /* JADX INFO: renamed from: h */
    public int f143907h;

    /* JADX INFO: renamed from: i */
    public int f143908i;

    /* JADX INFO: renamed from: b */
    public static /* bridge */ /* synthetic */ void m164274b(ogr0 ogr0Var, v6w0 v6w0Var, int i) {
        int iM197240D;
        if (i < 4) {
            return;
        }
        v6w0Var.m197263l(3);
        int i2 = i - 4;
        if ((v6w0Var.m197238B() & 128) != 0) {
            if (i2 < 7 || (iM197240D = v6w0Var.m197240D()) < 4) {
                return;
            }
            ogr0Var.f143907h = v6w0Var.m197242F();
            ogr0Var.f143908i = v6w0Var.m197242F();
            ogr0Var.f143900a.m197259h(iM197240D - 4);
            i2 = i - 11;
        }
        v6w0 v6w0Var2 = ogr0Var.f143900a;
        int iM197270s = v6w0Var2.m197270s();
        int iM197271t = v6w0Var2.m197271t();
        if (iM197270s >= iM197271t || i2 <= 0) {
            return;
        }
        int iMin = Math.min(i2, iM197271t - iM197270s);
        v6w0Var.m197258g(v6w0Var2.m197264m(), iM197270s, iMin);
        ogr0Var.f143900a.m197262k(iM197270s + iMin);
    }

    /* JADX INFO: renamed from: c */
    public static /* bridge */ /* synthetic */ void m164275c(ogr0 ogr0Var, v6w0 v6w0Var, int i) {
        if (i < 19) {
            return;
        }
        ogr0Var.f143903d = v6w0Var.m197242F();
        ogr0Var.f143904e = v6w0Var.m197242F();
        v6w0Var.m197263l(11);
        ogr0Var.f143905f = v6w0Var.m197242F();
        ogr0Var.f143906g = v6w0Var.m197242F();
    }

    /* JADX INFO: renamed from: d */
    public static /* bridge */ /* synthetic */ void m164276d(ogr0 ogr0Var, v6w0 v6w0Var, int i) {
        if (i % 5 != 2) {
            return;
        }
        v6w0Var.m197263l(2);
        int i2 = 0;
        Arrays.fill(ogr0Var.f143901b, 0);
        int i3 = i / 5;
        int i4 = 0;
        while (i4 < i3) {
            int iM197238B = v6w0Var.m197238B();
            int iM197238B2 = v6w0Var.m197238B();
            int iM197238B3 = v6w0Var.m197238B();
            int iM197238B4 = v6w0Var.m197238B();
            int iM197238B5 = v6w0Var.m197238B();
            double d = iM197238B2;
            int[] iArr = ogr0Var.f143901b;
            double d2 = iM197238B3 - 128;
            int iMax = Math.max(i2, Math.min((int) ((1.402d * d2) + d), 255)) << 16;
            double d3 = iM197238B4 - 128;
            iArr[iM197238B] = Math.max(0, Math.min((int) (d + (d3 * 1.772d)), 255)) | (iM197238B5 << 24) | iMax | (Math.max(0, Math.min((int) ((d - (0.34414d * d3)) - (d2 * 0.71414d)), 255)) << 8);
            i4++;
            i2 = 0;
        }
        ogr0Var.f143902c = true;
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public final ovu0 m164277a() {
        int i;
        if (this.f143903d == 0 || this.f143904e == 0 || this.f143907h == 0 || this.f143908i == 0) {
            return null;
        }
        v6w0 v6w0Var = this.f143900a;
        if (v6w0Var.m197271t() == 0 || v6w0Var.m197270s() != v6w0Var.m197271t() || !this.f143902c) {
            return null;
        }
        v6w0Var.m197262k(0);
        int i2 = this.f143907h * this.f143908i;
        int[] iArr = new int[i2];
        int i3 = 0;
        while (i3 < i2) {
            int iM197238B = this.f143900a.m197238B();
            if (iM197238B != 0) {
                i = i3 + 1;
                iArr[i3] = this.f143901b[iM197238B];
            } else {
                int iM197238B2 = this.f143900a.m197238B();
                if (iM197238B2 != 0) {
                    int iM197238B3 = iM197238B2 & 63;
                    if ((iM197238B2 & 64) != 0) {
                        iM197238B3 = (iM197238B3 << 8) | this.f143900a.m197238B();
                    }
                    i = iM197238B3 + i3;
                    Arrays.fill(iArr, i3, i, (iM197238B2 & 128) == 0 ? 0 : this.f143901b[this.f143900a.m197238B()]);
                }
            }
            i3 = i;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iArr, this.f143907h, this.f143908i, Bitmap.Config.ARGB_8888);
        dtu0 dtu0Var = new dtu0();
        dtu0Var.m113585c(bitmapCreateBitmap);
        dtu0Var.m113590h(this.f143905f / this.f143903d);
        dtu0Var.m113591i(0);
        dtu0Var.m113587e(this.f143906g / this.f143904e, 0);
        dtu0Var.m113588f(0);
        dtu0Var.m113593k(this.f143907h / this.f143903d);
        dtu0Var.m113586d(this.f143908i / this.f143904e);
        return dtu0Var.m113598p();
    }

    /* JADX INFO: renamed from: e */
    public final void m164278e() {
        this.f143903d = 0;
        this.f143904e = 0;
        this.f143905f = 0;
        this.f143906g = 0;
        this.f143907h = 0;
        this.f143908i = 0;
        this.f143900a.m197259h(0);
        this.f143902c = false;
    }
}
