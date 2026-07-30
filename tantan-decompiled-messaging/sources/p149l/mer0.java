package p149l;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
public final class mer0 {

    /* JADX INFO: renamed from: a */
    public final ner0 f133481a = new ner0();

    /* JADX INFO: renamed from: b */
    public final v6w0 f133482b = new v6w0(new byte[65025], 0);

    /* JADX INFO: renamed from: c */
    public int f133483c = -1;

    /* JADX INFO: renamed from: d */
    public int f133484d;

    /* JADX INFO: renamed from: e */
    public boolean f133485e;

    /* JADX INFO: renamed from: a */
    public final v6w0 m154306a() {
        return this.f133482b;
    }

    /* JADX INFO: renamed from: b */
    public final ner0 m154307b() {
        return this.f133481a;
    }

    /* JADX INFO: renamed from: c */
    public final void m154308c() {
        this.f133481a.m159121a();
        this.f133482b.m197259h(0);
        this.f133483c = -1;
        this.f133485e = false;
    }

    /* JADX INFO: renamed from: d */
    public final void m154309d() {
        v6w0 v6w0Var = this.f133482b;
        if (v6w0Var.m197264m().length == 65025) {
            return;
        }
        v6w0Var.m197260i(Arrays.copyOf(v6w0Var.m197264m(), Math.max(65025, v6w0Var.m197271t())), this.f133482b.m197271t());
    }

    /* JADX INFO: renamed from: e */
    public final boolean m154310e(k5r0 k5r0Var) throws IOException {
        if (this.f133485e) {
            this.f133485e = false;
            this.f133482b.m197259h(0);
        }
        while (true) {
            if (this.f133485e) {
                return true;
            }
            int i = this.f133483c;
            if (i < 0) {
                if (!this.f133481a.m159123c(k5r0Var, -1L) || !this.f133481a.m159122b(k5r0Var, true)) {
                    return false;
                }
                ner0 ner0Var = this.f133481a;
                int iM154311f = ner0Var.f138648d;
                if ((ner0Var.f138645a & 1) == 1 && this.f133482b.m197271t() == 0) {
                    iM154311f += m154311f(0);
                    i = this.f133484d;
                } else {
                    i = 0;
                }
                if (!n5r0.m157999e(k5r0Var, iM154311f)) {
                    return false;
                }
                this.f133483c = i;
            }
            int iM154311f2 = m154311f(i);
            int i2 = this.f133483c + this.f133484d;
            if (iM154311f2 > 0) {
                v6w0 v6w0Var = this.f133482b;
                v6w0Var.m197256e(v6w0Var.m197271t() + iM154311f2);
                v6w0 v6w0Var2 = this.f133482b;
                if (!n5r0.m157998d(k5r0Var, v6w0Var2.m197264m(), v6w0Var2.m197271t(), iM154311f2)) {
                    return false;
                }
                v6w0 v6w0Var3 = this.f133482b;
                v6w0Var3.m197261j(v6w0Var3.m197271t() + iM154311f2);
                this.f133485e = this.f133481a.f138650f[i2 + (-1)] != 255;
            }
            if (i2 == this.f133481a.f138647c) {
                i2 = -1;
            }
            this.f133483c = i2;
        }
    }

    /* JADX INFO: renamed from: f */
    public final int m154311f(int i) {
        int i2;
        int i3 = 0;
        this.f133484d = 0;
        do {
            int i4 = this.f133484d;
            int i5 = i + i4;
            ner0 ner0Var = this.f133481a;
            if (i5 >= ner0Var.f138647c) {
                break;
            }
            this.f133484d = i4 + 1;
            i2 = ner0Var.f138650f[i5];
            i3 += i2;
        } while (i2 == 255);
        return i3;
    }
}
