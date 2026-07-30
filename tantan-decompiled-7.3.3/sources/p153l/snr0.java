package p153l;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
public final class snr0 {

    /* JADX INFO: renamed from: a */
    public final tnr0 f169752a = new tnr0();

    /* JADX INFO: renamed from: b */
    public final bgw0 f169753b = new bgw0(new byte[65025], 0);

    /* JADX INFO: renamed from: c */
    public int f169754c = -1;

    /* JADX INFO: renamed from: d */
    public int f169755d;

    /* JADX INFO: renamed from: e */
    public boolean f169756e;

    /* JADX INFO: renamed from: a */
    public final bgw0 m186994a() {
        return this.f169753b;
    }

    /* JADX INFO: renamed from: b */
    public final tnr0 m186995b() {
        return this.f169752a;
    }

    /* JADX INFO: renamed from: c */
    public final void m186996c() {
        this.f169752a.m191961a();
        this.f169753b.m104266h(0);
        this.f169754c = -1;
        this.f169756e = false;
    }

    /* JADX INFO: renamed from: d */
    public final void m186997d() {
        bgw0 bgw0Var = this.f169753b;
        if (bgw0Var.m104271m().length == 65025) {
            return;
        }
        bgw0Var.m104267i(Arrays.copyOf(bgw0Var.m104271m(), Math.max(65025, bgw0Var.m104278t())), this.f169753b.m104278t());
    }

    /* JADX INFO: renamed from: e */
    public final boolean m186998e(qer0 qer0Var) throws IOException {
        if (this.f169756e) {
            this.f169756e = false;
            this.f169753b.m104266h(0);
        }
        while (true) {
            if (this.f169756e) {
                return true;
            }
            int i = this.f169754c;
            if (i < 0) {
                if (!this.f169752a.m191963c(qer0Var, -1L) || !this.f169752a.m191962b(qer0Var, true)) {
                    return false;
                }
                tnr0 tnr0Var = this.f169752a;
                int iM186999f = tnr0Var.f175312d;
                if ((tnr0Var.f175309a & 1) == 1 && this.f169753b.m104278t() == 0) {
                    iM186999f += m186999f(0);
                    i = this.f169755d;
                } else {
                    i = 0;
                }
                if (!ter0.m190895e(qer0Var, iM186999f)) {
                    return false;
                }
                this.f169754c = i;
            }
            int iM186999f2 = m186999f(i);
            int i2 = this.f169754c + this.f169755d;
            if (iM186999f2 > 0) {
                bgw0 bgw0Var = this.f169753b;
                bgw0Var.m104263e(bgw0Var.m104278t() + iM186999f2);
                bgw0 bgw0Var2 = this.f169753b;
                if (!ter0.m190894d(qer0Var, bgw0Var2.m104271m(), bgw0Var2.m104278t(), iM186999f2)) {
                    return false;
                }
                bgw0 bgw0Var3 = this.f169753b;
                bgw0Var3.m104268j(bgw0Var3.m104278t() + iM186999f2);
                this.f169756e = this.f169752a.f175314f[i2 + (-1)] != 255;
            }
            if (i2 == this.f169752a.f175311c) {
                i2 = -1;
            }
            this.f169754c = i2;
        }
    }

    /* JADX INFO: renamed from: f */
    public final int m186999f(int i) {
        int i2;
        int i3 = 0;
        this.f169755d = 0;
        do {
            int i4 = this.f169755d;
            int i5 = i + i4;
            tnr0 tnr0Var = this.f169752a;
            if (i5 >= tnr0Var.f175311c) {
                break;
            }
            this.f169755d = i4 + 1;
            i2 = tnr0Var.f175314f[i5];
            i3 += i2;
        } while (i2 == 255);
        return i3;
    }
}
