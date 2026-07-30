package p149l;

import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: loaded from: classes6.dex */
public final class ijr0 implements sir0 {

    /* JADX INFO: renamed from: l */
    public static final float[] f113591l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};

    /* JADX INFO: renamed from: a */
    @Nullable
    public final dlr0 f113592a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public final v6w0 f113593b;

    /* JADX INFO: renamed from: c */
    public final boolean[] f113594c;

    /* JADX INFO: renamed from: d */
    public final gjr0 f113595d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public final sjr0 f113596e;

    /* JADX INFO: renamed from: f */
    public hjr0 f113597f;

    /* JADX INFO: renamed from: g */
    public long f113598g;

    /* JADX INFO: renamed from: h */
    public String f113599h;

    /* JADX INFO: renamed from: i */
    public m7r0 f113600i;

    /* JADX INFO: renamed from: j */
    public boolean f113601j;

    /* JADX INFO: renamed from: k */
    public long f113602k;

    public ijr0(@Nullable dlr0 dlr0Var) {
        this.f113592a = dlr0Var;
        this.f113594c = new boolean[4];
        this.f113595d = new gjr0(128);
        this.f113602k = -9223372036854775807L;
        this.f113596e = new sjr0(178, 128);
        this.f113593b = new v6w0();
    }

    @Override // p149l.sir0
    /* JADX INFO: renamed from: a */
    public final void mo121625a(boolean z) {
        f5v0.m119531b(this.f113597f);
        if (z) {
            this.f113597f.m131403b(this.f113598g, 0, this.f113601j);
            this.f113597f.m131405d();
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0111  */
    /* JADX WARN: Code duplicated, block: B:51:0x0182  */
    @Override // p149l.sir0
    /* JADX INFO: renamed from: b */
    public final void mo121626b(v6w0 v6w0Var) {
        int i;
        int i2;
        f5v0.m119531b(this.f113597f);
        f5v0.m119531b(this.f113600i);
        int iM197270s = v6w0Var.m197270s();
        int iM197271t = v6w0Var.m197271t();
        byte[] bArrM197264m = v6w0Var.m197264m();
        this.f113598g += (long) v6w0Var.m197268q();
        this.f113600i.mo134533f(v6w0Var, v6w0Var.m197268q());
        while (true) {
            int iM176658a = quw0.m176658a(bArrM197264m, iM197270s, iM197271t, this.f113594c);
            if (iM176658a == iM197271t) {
                break;
            }
            int i3 = iM176658a + 3;
            int i4 = v6w0Var.m197264m()[i3] & 255;
            int i5 = iM176658a - iM197270s;
            if (!this.f113601j) {
                if (i5 > 0) {
                    this.f113595d.m126557a(bArrM197264m, iM197270s, iM176658a);
                }
                if (this.f113595d.m126559c(i4, i5 < 0 ? -i5 : 0)) {
                    m7r0 m7r0Var = this.f113600i;
                    gjr0 gjr0Var = this.f113595d;
                    int i6 = gjr0Var.f103099d;
                    String str = this.f113599h;
                    str.getClass();
                    byte[] bArrCopyOf = Arrays.copyOf(gjr0Var.f103100e, gjr0Var.f103098c);
                    x5w0 x5w0Var = new x5w0(bArrCopyOf, bArrCopyOf.length);
                    x5w0Var.m207160n(i6);
                    x5w0Var.m207160n(4);
                    x5w0Var.m207158l();
                    x5w0Var.m207159m(8);
                    if (x5w0Var.m207161o()) {
                        x5w0Var.m207159m(4);
                        x5w0Var.m207159m(3);
                    }
                    int iM207150d = x5w0Var.m207150d(4);
                    float f = 1.0f;
                    if (iM207150d == 15) {
                        int iM207150d2 = x5w0Var.m207150d(8);
                        int iM207150d3 = x5w0Var.m207150d(8);
                        if (iM207150d3 == 0) {
                            svv0.m186111f("H263Reader", "Invalid aspect ratio");
                        } else {
                            f = iM207150d2 / iM207150d3;
                        }
                    } else if (iM207150d < 7) {
                        f = f113591l[iM207150d];
                    } else {
                        svv0.m186111f("H263Reader", "Invalid aspect ratio");
                    }
                    float f2 = f;
                    if (x5w0Var.m207161o()) {
                        x5w0Var.m207159m(2);
                        x5w0Var.m207159m(1);
                        if (x5w0Var.m207161o()) {
                            x5w0Var.m207159m(15);
                            x5w0Var.m207158l();
                            x5w0Var.m207159m(15);
                            x5w0Var.m207158l();
                            x5w0Var.m207159m(15);
                            x5w0Var.m207158l();
                            x5w0Var.m207159m(3);
                            x5w0Var.m207159m(11);
                            x5w0Var.m207158l();
                            x5w0Var.m207159m(15);
                            x5w0Var.m207158l();
                            i2 = 2;
                        } else {
                            i2 = 2;
                        }
                    } else {
                        i2 = 2;
                    }
                    if (x5w0Var.m207150d(i2) != 0) {
                        svv0.m186111f("H263Reader", "Unhandled video object layer shape");
                    }
                    x5w0Var.m207158l();
                    int iM207150d4 = x5w0Var.m207150d(16);
                    x5w0Var.m207158l();
                    if (x5w0Var.m207161o()) {
                        if (iM207150d4 == 0) {
                            svv0.m186111f("H263Reader", "Invalid vop_increment_time_resolution");
                        } else {
                            int i7 = iM207150d4 - 1;
                            int i8 = 0;
                            while (i7 > 0) {
                                i7 >>= 1;
                                i8++;
                            }
                            x5w0Var.m207159m(i8);
                        }
                    }
                    x5w0Var.m207158l();
                    int iM207150d5 = x5w0Var.m207150d(13);
                    x5w0Var.m207158l();
                    int iM207150d6 = x5w0Var.m207150d(13);
                    x5w0Var.m207158l();
                    x5w0Var.m207158l();
                    ter0 ter0Var = new ter0();
                    ter0Var.m188604k(str);
                    ter0Var.m188618w("video/mp4v-es");
                    ter0Var.m188590C(iM207150d5);
                    ter0Var.m188600i(iM207150d6);
                    ter0Var.m188614s(f2);
                    ter0Var.m188606l(Collections.singletonList(bArrCopyOf));
                    m7r0Var.mo134531d(ter0Var.m188591D());
                    this.f113601j = true;
                }
            }
            this.f113597f.m131402a(bArrM197264m, iM197270s, iM176658a);
            sjr0 sjr0Var = this.f113596e;
            if (i5 > 0) {
                sjr0Var.m184548a(bArrM197264m, iM197270s, iM176658a);
                i = 0;
            } else {
                i = -i5;
            }
            if (this.f113596e.m184551d(i)) {
                sjr0 sjr0Var2 = this.f113596e;
                int iM176659b = quw0.m176659b(sjr0Var2.f164902d, sjr0Var2.f164903e);
                v6w0 v6w0Var2 = this.f113593b;
                int i9 = ggw0.f102568a;
                v6w0Var2.m197260i(this.f113596e.f164902d, iM176659b);
                this.f113592a.m112412a(this.f113602k, this.f113593b);
            }
            if (i4 == 178) {
                if (v6w0Var.m197264m()[iM176658a + 2] == 1) {
                    this.f113596e.m184550c(178);
                }
                i4 = 178;
            }
            int i10 = iM197271t - iM176658a;
            this.f113597f.m131403b(this.f113598g - ((long) i10), i10, this.f113601j);
            this.f113597f.m131404c(i4, this.f113602k);
            iM197270s = i3;
            iM197271t = iM197271t;
        }
        if (!this.f113601j) {
            this.f113595d.m126557a(bArrM197264m, iM197270s, iM197271t);
        }
        this.f113597f.m131402a(bArrM197264m, iM197270s, iM197271t);
        this.f113596e.m184548a(bArrM197264m, iM197270s, iM197271t);
    }

    @Override // p149l.sir0
    /* JADX INFO: renamed from: c */
    public final void mo121627c(long j, int i) {
        this.f113602k = j;
    }

    @Override // p149l.sir0
    /* JADX INFO: renamed from: d */
    public final void mo121628d(m5r0 m5r0Var, alr0 alr0Var) {
        alr0Var.m97444c();
        this.f113599h = alr0Var.m97443b();
        m7r0 m7r0VarMo129454i = m5r0Var.mo129454i(alr0Var.m97442a(), 2);
        this.f113600i = m7r0VarMo129454i;
        this.f113597f = new hjr0(m7r0VarMo129454i);
        this.f113592a.m112413b(m5r0Var, alr0Var);
    }

    @Override // p149l.sir0
    public final void zze() {
        quw0.m176663f(this.f113594c);
        this.f113595d.m126558b();
        hjr0 hjr0Var = this.f113597f;
        if (hjr0Var != null) {
            hjr0Var.m131405d();
        }
        this.f113596e.m184549b();
        this.f113598g = 0L;
        this.f113602k = -9223372036854775807L;
    }

    public ijr0() {
        this(null);
    }
}
