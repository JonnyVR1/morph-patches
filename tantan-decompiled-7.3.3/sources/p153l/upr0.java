package p153l;

import android.graphics.Bitmap;
import androidx.annotation.Nullable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
public final class upr0 {

    /* JADX INFO: renamed from: a */
    public final bgw0 f180316a = new bgw0();

    /* JADX INFO: renamed from: b */
    public final int[] f180317b = new int[256];

    /* JADX INFO: renamed from: c */
    public boolean f180318c;

    /* JADX INFO: renamed from: d */
    public int f180319d;

    /* JADX INFO: renamed from: e */
    public int f180320e;

    /* JADX INFO: renamed from: f */
    public int f180321f;

    /* JADX INFO: renamed from: g */
    public int f180322g;

    /* JADX INFO: renamed from: h */
    public int f180323h;

    /* JADX INFO: renamed from: i */
    public int f180324i;

    /* JADX INFO: renamed from: b */
    public static /* bridge */ /* synthetic */ void m197184b(upr0 upr0Var, bgw0 bgw0Var, int i) {
        int iM104247D;
        if (i < 4) {
            return;
        }
        bgw0Var.m104270l(3);
        int i2 = i - 4;
        if ((bgw0Var.m104245B() & 128) != 0) {
            if (i2 < 7 || (iM104247D = bgw0Var.m104247D()) < 4) {
                return;
            }
            upr0Var.f180323h = bgw0Var.m104249F();
            upr0Var.f180324i = bgw0Var.m104249F();
            upr0Var.f180316a.m104266h(iM104247D - 4);
            i2 = i - 11;
        }
        bgw0 bgw0Var2 = upr0Var.f180316a;
        int iM104277s = bgw0Var2.m104277s();
        int iM104278t = bgw0Var2.m104278t();
        if (iM104277s >= iM104278t || i2 <= 0) {
            return;
        }
        int iMin = Math.min(i2, iM104278t - iM104277s);
        bgw0Var.m104265g(bgw0Var2.m104271m(), iM104277s, iMin);
        upr0Var.f180316a.m104269k(iM104277s + iMin);
    }

    /* JADX INFO: renamed from: c */
    public static /* bridge */ /* synthetic */ void m197185c(upr0 upr0Var, bgw0 bgw0Var, int i) {
        if (i < 19) {
            return;
        }
        upr0Var.f180319d = bgw0Var.m104249F();
        upr0Var.f180320e = bgw0Var.m104249F();
        bgw0Var.m104270l(11);
        upr0Var.f180321f = bgw0Var.m104249F();
        upr0Var.f180322g = bgw0Var.m104249F();
    }

    /* JADX INFO: renamed from: d */
    public static /* bridge */ /* synthetic */ void m197186d(upr0 upr0Var, bgw0 bgw0Var, int i) {
        if (i % 5 != 2) {
            return;
        }
        bgw0Var.m104270l(2);
        int i2 = 0;
        Arrays.fill(upr0Var.f180317b, 0);
        int i3 = i / 5;
        int i4 = 0;
        while (i4 < i3) {
            int iM104245B = bgw0Var.m104245B();
            int iM104245B2 = bgw0Var.m104245B();
            int iM104245B3 = bgw0Var.m104245B();
            int iM104245B4 = bgw0Var.m104245B();
            int iM104245B5 = bgw0Var.m104245B();
            double d = iM104245B2;
            int[] iArr = upr0Var.f180317b;
            double d2 = iM104245B3 - 128;
            int iMax = Math.max(i2, Math.min((int) ((1.402d * d2) + d), 255)) << 16;
            double d3 = iM104245B4 - 128;
            iArr[iM104245B] = Math.max(0, Math.min((int) (d + (d3 * 1.772d)), 255)) | (iM104245B5 << 24) | iMax | (Math.max(0, Math.min((int) ((d - (0.34414d * d3)) - (d2 * 0.71414d)), 255)) << 8);
            i4++;
            i2 = 0;
        }
        upr0Var.f180318c = true;
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public final u4v0 m197187a() {
        int i;
        if (this.f180319d == 0 || this.f180320e == 0 || this.f180323h == 0 || this.f180324i == 0) {
            return null;
        }
        bgw0 bgw0Var = this.f180316a;
        if (bgw0Var.m104278t() == 0 || bgw0Var.m104277s() != bgw0Var.m104278t() || !this.f180318c) {
            return null;
        }
        bgw0Var.m104269k(0);
        int i2 = this.f180323h * this.f180324i;
        int[] iArr = new int[i2];
        int i3 = 0;
        while (i3 < i2) {
            int iM104245B = this.f180316a.m104245B();
            if (iM104245B != 0) {
                i = i3 + 1;
                iArr[i3] = this.f180317b[iM104245B];
            } else {
                int iM104245B2 = this.f180316a.m104245B();
                if (iM104245B2 != 0) {
                    int iM104245B3 = iM104245B2 & 63;
                    if ((iM104245B2 & 64) != 0) {
                        iM104245B3 = (iM104245B3 << 8) | this.f180316a.m104245B();
                    }
                    i = iM104245B3 + i3;
                    Arrays.fill(iArr, i3, i, (iM104245B2 & 128) == 0 ? 0 : this.f180317b[this.f180316a.m104245B()]);
                }
            }
            i3 = i;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iArr, this.f180323h, this.f180324i, Bitmap.Config.ARGB_8888);
        j2v0 j2v0Var = new j2v0();
        j2v0Var.m143268c(bitmapCreateBitmap);
        j2v0Var.m143273h(this.f180321f / this.f180319d);
        j2v0Var.m143274i(0);
        j2v0Var.m143270e(this.f180322g / this.f180320e, 0);
        j2v0Var.m143271f(0);
        j2v0Var.m143276k(this.f180323h / this.f180319d);
        j2v0Var.m143269d(this.f180324i / this.f180320e);
        return j2v0Var.m143281p();
    }

    /* JADX INFO: renamed from: e */
    public final void m197188e() {
        this.f180319d = 0;
        this.f180320e = 0;
        this.f180321f = 0;
        this.f180322g = 0;
        this.f180323h = 0;
        this.f180324i = 0;
        this.f180316a.m104266h(0);
        this.f180318c = false;
    }
}
