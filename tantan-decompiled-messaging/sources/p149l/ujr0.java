package p149l;

import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzcc;

/* JADX INFO: loaded from: classes6.dex */
public final class ujr0 implements blr0 {

    /* JADX INFO: renamed from: a */
    public final sir0 f176811a;

    /* JADX INFO: renamed from: b */
    public final x5w0 f176812b = new x5w0(new byte[10], 10);

    /* JADX INFO: renamed from: c */
    public int f176813c = 0;

    /* JADX INFO: renamed from: d */
    public int f176814d;

    /* JADX INFO: renamed from: e */
    public hew0 f176815e;

    /* JADX INFO: renamed from: f */
    public boolean f176816f;

    /* JADX INFO: renamed from: g */
    public boolean f176817g;

    /* JADX INFO: renamed from: h */
    public boolean f176818h;

    /* JADX INFO: renamed from: i */
    public int f176819i;

    /* JADX INFO: renamed from: j */
    public int f176820j;

    /* JADX INFO: renamed from: k */
    public boolean f176821k;

    public ujr0(sir0 sir0Var) {
        this.f176811a = sir0Var;
    }

    @Override // p149l.blr0
    /* JADX INFO: renamed from: a */
    public final void mo102558a(hew0 hew0Var, m5r0 m5r0Var, alr0 alr0Var) {
        this.f176815e = hew0Var;
        this.f176811a.mo121628d(m5r0Var, alr0Var);
    }

    @Override // p149l.blr0
    /* JADX INFO: renamed from: b */
    public final void mo102559b(v6w0 v6w0Var, int i) throws zzcc {
        int i2;
        int i3;
        long jM130704b;
        f5v0.m119531b(this.f176815e);
        int i4 = -1;
        int i5 = 2;
        if ((i & 1) != 0) {
            int i6 = this.f176813c;
            if (i6 != 0 && i6 != 1) {
                if (i6 != 2) {
                    int i7 = this.f176820j;
                    if (i7 != -1) {
                        svv0.m186111f("PesReader", "Unexpected start indicator: expected " + i7 + " more bytes");
                    }
                    this.f176811a.mo121625a(v6w0Var.m197271t() == 0);
                } else {
                    svv0.m186111f("PesReader", "Unexpected start indicator reading extended header");
                }
            }
            m194028c(1);
        }
        int i8 = i;
        while (v6w0Var.m197268q() > 0) {
            int i9 = this.f176813c;
            if (i9 == 0) {
                i2 = i5;
                v6w0Var.m197263l(v6w0Var.m197268q());
            } else if (i9 != 1) {
                if (i9 != i5) {
                    int iM197268q = v6w0Var.m197268q();
                    int i10 = this.f176820j;
                    int i11 = i10 == i4 ? 0 : iM197268q - i10;
                    if (i11 > 0) {
                        iM197268q -= i11;
                        v6w0Var.m197261j(v6w0Var.m197270s() + iM197268q);
                    }
                    this.f176811a.mo121626b(v6w0Var);
                    int i12 = this.f176820j;
                    if (i12 != i4) {
                        int i13 = i12 - iM197268q;
                        this.f176820j = i13;
                        if (i13 == 0) {
                            this.f176811a.mo121625a(false);
                            m194028c(1);
                        }
                    }
                } else {
                    if (m194029d(v6w0Var, this.f176812b.f191198a, Math.min(10, this.f176819i)) && m194029d(v6w0Var, null, this.f176819i)) {
                        this.f176812b.m207157k(0);
                        if (this.f176816f) {
                            this.f176812b.m207159m(4);
                            long jM207150d = this.f176812b.m207150d(3);
                            this.f176812b.m207159m(1);
                            int iM207150d = this.f176812b.m207150d(15) << 15;
                            this.f176812b.m207159m(1);
                            long jM207150d2 = this.f176812b.m207150d(15);
                            this.f176812b.m207159m(1);
                            if (!this.f176818h && this.f176817g) {
                                this.f176812b.m207159m(4);
                                long jM207150d3 = ((long) this.f176812b.m207150d(3)) << 30;
                                this.f176812b.m207159m(1);
                                int iM207150d2 = this.f176812b.m207150d(15) << 15;
                                this.f176812b.m207159m(1);
                                long jM207150d4 = this.f176812b.m207150d(15);
                                this.f176812b.m207159m(1);
                                this.f176815e.m130704b(jM207150d3 | ((long) iM207150d2) | jM207150d4);
                                this.f176818h = true;
                            }
                            jM130704b = this.f176815e.m130704b((jM207150d << 30) | ((long) iM207150d) | jM207150d2);
                        } else {
                            jM130704b = -9223372036854775807L;
                        }
                        i8 |= true != this.f176821k ? 0 : 4;
                        this.f176811a.mo121627c(jM130704b, i8);
                        m194028c(3);
                        i4 = -1;
                        i5 = 2;
                    }
                }
                i2 = i5;
            } else if (m194029d(v6w0Var, this.f176812b.f191198a, 9)) {
                this.f176812b.m207157k(0);
                int iM207150d3 = this.f176812b.m207150d(24);
                if (iM207150d3 != 1) {
                    svv0.m186111f("PesReader", "Unexpected start code prefix: " + iM207150d3);
                    i4 = -1;
                    this.f176820j = -1;
                    i3 = 0;
                    i2 = 2;
                } else {
                    this.f176812b.m207159m(8);
                    x5w0 x5w0Var = this.f176812b;
                    int iM207150d4 = x5w0Var.m207150d(16);
                    x5w0Var.m207159m(5);
                    this.f176821k = this.f176812b.m207161o();
                    i2 = 2;
                    this.f176812b.m207159m(2);
                    this.f176816f = this.f176812b.m207161o();
                    this.f176817g = this.f176812b.m207161o();
                    this.f176812b.m207159m(6);
                    int iM207150d5 = this.f176812b.m207150d(8);
                    this.f176819i = iM207150d5;
                    if (iM207150d4 == 0) {
                        this.f176820j = -1;
                        i4 = -1;
                    } else {
                        int i14 = (iM207150d4 - 3) - iM207150d5;
                        this.f176820j = i14;
                        if (i14 < 0) {
                            svv0.m186111f("PesReader", "Found negative packet payload size: " + i14);
                            i4 = -1;
                            this.f176820j = -1;
                        } else {
                            i4 = -1;
                        }
                    }
                    i3 = 2;
                }
                m194028c(i3);
            } else {
                i4 = -1;
                i2 = 2;
            }
            i5 = i2;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m194028c(int i) {
        this.f176813c = i;
        this.f176814d = 0;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m194029d(v6w0 v6w0Var, @Nullable byte[] bArr, int i) {
        int iMin = Math.min(v6w0Var.m197268q(), i - this.f176814d);
        if (iMin <= 0) {
            return true;
        }
        if (bArr == null) {
            v6w0Var.m197263l(iMin);
        } else {
            v6w0Var.m197258g(bArr, this.f176814d, iMin);
        }
        int i2 = this.f176814d + iMin;
        this.f176814d = i2;
        return i2 == i;
    }

    @Override // p149l.blr0
    public final void zzc() {
        this.f176813c = 0;
        this.f176814d = 0;
        this.f176818h = false;
        this.f176811a.zze();
    }
}
