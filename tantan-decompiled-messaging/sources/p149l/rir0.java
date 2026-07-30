package p149l;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class rir0 implements sir0 {

    /* JADX INFO: renamed from: a */
    public final List f159583a;

    /* JADX INFO: renamed from: b */
    public final m7r0[] f159584b;

    /* JADX INFO: renamed from: c */
    public boolean f159585c;

    /* JADX INFO: renamed from: d */
    public int f159586d;

    /* JADX INFO: renamed from: e */
    public int f159587e;

    /* JADX INFO: renamed from: f */
    public long f159588f = -9223372036854775807L;

    public rir0(List list) {
        this.f159583a = list;
        this.f159584b = new m7r0[list.size()];
    }

    @Override // p149l.sir0
    /* JADX INFO: renamed from: a */
    public final void mo121625a(boolean z) {
        if (this.f159585c) {
            f5v0.m119535f(this.f159588f != -9223372036854775807L);
            for (m7r0 m7r0Var : this.f159584b) {
                m7r0Var.mo134530c(this.f159588f, 1, this.f159587e, 0, null);
            }
            this.f159585c = false;
        }
    }

    @Override // p149l.sir0
    /* JADX INFO: renamed from: b */
    public final void mo121626b(v6w0 v6w0Var) {
        if (this.f159585c) {
            if (this.f159586d != 2 || m179532e(v6w0Var, 32)) {
                if (this.f159586d != 1 || m179532e(v6w0Var, 0)) {
                    int iM197270s = v6w0Var.m197270s();
                    int iM197268q = v6w0Var.m197268q();
                    for (m7r0 m7r0Var : this.f159584b) {
                        v6w0Var.m197262k(iM197270s);
                        m7r0Var.mo134533f(v6w0Var, iM197268q);
                    }
                    this.f159587e += iM197268q;
                }
            }
        }
    }

    @Override // p149l.sir0
    /* JADX INFO: renamed from: c */
    public final void mo121627c(long j, int i) {
        if ((i & 4) == 0) {
            return;
        }
        this.f159585c = true;
        this.f159588f = j;
        this.f159587e = 0;
        this.f159586d = 2;
    }

    @Override // p149l.sir0
    /* JADX INFO: renamed from: d */
    public final void mo121628d(m5r0 m5r0Var, alr0 alr0Var) {
        for (int i = 0; i < this.f159584b.length; i++) {
            xkr0 xkr0Var = (xkr0) this.f159583a.get(i);
            alr0Var.m97444c();
            m7r0 m7r0VarMo129454i = m5r0Var.mo129454i(alr0Var.m97442a(), 3);
            ter0 ter0Var = new ter0();
            ter0Var.m188604k(alr0Var.m97443b());
            ter0Var.m188618w("application/dvbsubs");
            ter0Var.m188606l(Collections.singletonList(xkr0Var.f193347b));
            ter0Var.m188609n(xkr0Var.f193346a);
            m7r0VarMo129454i.mo134531d(ter0Var.m188591D());
            this.f159584b[i] = m7r0VarMo129454i;
        }
    }

    /* JADX INFO: renamed from: e */
    public final boolean m179532e(v6w0 v6w0Var, int i) {
        if (v6w0Var.m197268q() == 0) {
            return false;
        }
        if (v6w0Var.m197238B() != i) {
            this.f159585c = false;
        }
        this.f159586d--;
        return this.f159585c;
    }

    @Override // p149l.sir0
    public final void zze() {
        this.f159585c = false;
        this.f159588f = -9223372036854775807L;
    }
}
