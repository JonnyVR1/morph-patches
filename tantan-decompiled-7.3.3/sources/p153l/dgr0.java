package p153l;

import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class dgr0 implements per0 {

    /* JADX INFO: renamed from: a */
    public final int f88364a;

    /* JADX INFO: renamed from: b */
    public final int f88365b;

    /* JADX INFO: renamed from: c */
    public final String f88366c;

    /* JADX INFO: renamed from: d */
    public int f88367d;

    /* JADX INFO: renamed from: e */
    public int f88368e;

    /* JADX INFO: renamed from: f */
    public ser0 f88369f;

    /* JADX INFO: renamed from: g */
    public sgr0 f88370g;

    public dgr0(int i, int i2, String str) {
        this.f88364a = i;
        this.f88365b = i2;
        this.f88366c = str;
    }

    @Override // p153l.per0
    /* JADX INFO: renamed from: c */
    public final void mo97906c(long j, long j2) {
        if (j == 0 || this.f88368e == 1) {
            this.f88368e = 1;
            this.f88367d = 0;
        }
    }

    @Override // p153l.per0
    /* JADX INFO: renamed from: d */
    public final boolean mo97907d(qer0 qer0Var) throws IOException {
        lev0.m153958f((this.f88364a == -1 || this.f88365b == -1) ? false : true);
        bgw0 bgw0Var = new bgw0(this.f88365b);
        ((fer0) qer0Var).mo125313c(bgw0Var.m104271m(), 0, this.f88365b, false);
        return bgw0Var.m104249F() == this.f88364a;
    }

    @Override // p153l.per0
    /* JADX INFO: renamed from: e */
    public final void mo97908e(ser0 ser0Var) {
        this.f88369f = ser0Var;
        sgr0 sgr0VarMo101550i = ser0Var.mo101550i(1024, 4);
        this.f88370g = sgr0VarMo101550i;
        znr0 znr0Var = new znr0();
        znr0Var.m220647b(this.f88366c);
        sgr0VarMo101550i.mo99373d(znr0Var.m220645D());
        this.f88369f.mo101544c();
        this.f88369f.mo101551j(new egr0(-9223372036854775807L));
        this.f88368e = 1;
    }

    @Override // p153l.per0
    /* JADX INFO: renamed from: f */
    public final int mo97909f(qer0 qer0Var, yfr0 yfr0Var) throws IOException {
        int i = this.f88368e;
        if (i != 1) {
            if (i == 2) {
                return -1;
            }
            wpg0.m207458a();
            return 0;
        }
        sgr0 sgr0Var = this.f88370g;
        sgr0Var.getClass();
        int iM125514a = fgr0.m125514a(sgr0Var, qer0Var, 1024, true);
        if (iM125514a == -1) {
            this.f88368e = 2;
            this.f88370g.mo99372c(0L, 1, this.f88367d, 0, null);
            this.f88367d = 0;
        } else {
            this.f88367d += iM125514a;
        }
        return 0;
    }
}
