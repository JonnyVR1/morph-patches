package p153l;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class xrr0 implements yrr0 {

    /* JADX INFO: renamed from: a */
    public final List f195955a;

    /* JADX INFO: renamed from: b */
    public final sgr0[] f195956b;

    /* JADX INFO: renamed from: c */
    public boolean f195957c;

    /* JADX INFO: renamed from: d */
    public int f195958d;

    /* JADX INFO: renamed from: e */
    public int f195959e;

    /* JADX INFO: renamed from: f */
    public long f195960f = -9223372036854775807L;

    public xrr0(List list) {
        this.f195955a = list;
        this.f195956b = new sgr0[list.size()];
    }

    @Override // p153l.yrr0
    /* JADX INFO: renamed from: a */
    public final void mo155728a(boolean z) {
        if (this.f195957c) {
            lev0.m153958f(this.f195960f != -9223372036854775807L);
            for (sgr0 sgr0Var : this.f195956b) {
                sgr0Var.mo99372c(this.f195960f, 1, this.f195959e, 0, null);
            }
            this.f195957c = false;
        }
    }

    @Override // p153l.yrr0
    /* JADX INFO: renamed from: b */
    public final void mo155729b(bgw0 bgw0Var) {
        if (this.f195957c) {
            if (this.f195958d != 2 || m212851e(bgw0Var, 32)) {
                if (this.f195958d != 1 || m212851e(bgw0Var, 0)) {
                    int iM104277s = bgw0Var.m104277s();
                    int iM104275q = bgw0Var.m104275q();
                    for (sgr0 sgr0Var : this.f195956b) {
                        bgw0Var.m104269k(iM104277s);
                        sgr0Var.mo99375f(bgw0Var, iM104275q);
                    }
                    this.f195959e += iM104275q;
                }
            }
        }
    }

    @Override // p153l.yrr0
    /* JADX INFO: renamed from: c */
    public final void mo155730c(long j, int i) {
        if ((i & 4) == 0) {
            return;
        }
        this.f195957c = true;
        this.f195960f = j;
        this.f195959e = 0;
        this.f195958d = 2;
    }

    @Override // p153l.yrr0
    /* JADX INFO: renamed from: d */
    public final void mo155731d(ser0 ser0Var, gur0 gur0Var) {
        for (int i = 0; i < this.f195956b.length; i++) {
            dur0 dur0Var = (dur0) this.f195955a.get(i);
            gur0Var.m132386c();
            sgr0 sgr0VarMo101550i = ser0Var.mo101550i(gur0Var.m132384a(), 3);
            znr0 znr0Var = new znr0();
            znr0Var.m220658k(gur0Var.m132385b());
            znr0Var.m220672w("application/dvbsubs");
            znr0Var.m220660l(Collections.singletonList(dur0Var.f90846b));
            znr0Var.m220663n(dur0Var.f90845a);
            sgr0VarMo101550i.mo99373d(znr0Var.m220645D());
            this.f195956b[i] = sgr0VarMo101550i;
        }
    }

    /* JADX INFO: renamed from: e */
    public final boolean m212851e(bgw0 bgw0Var, int i) {
        if (bgw0Var.m104275q() == 0) {
            return false;
        }
        if (bgw0Var.m104245B() != i) {
            this.f195957c = false;
        }
        this.f195958d--;
        return this.f195957c;
    }

    @Override // p153l.yrr0
    public final void zze() {
        this.f195957c = false;
        this.f195960f = -9223372036854775807L;
    }
}
