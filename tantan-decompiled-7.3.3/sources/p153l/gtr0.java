package p153l;

import com.google.android.gms.internal.ads.zzcc;

/* JADX INFO: loaded from: classes6.dex */
public final class gtr0 {

    /* JADX INFO: renamed from: a */
    public final yrr0 f106438a;

    /* JADX INFO: renamed from: b */
    public final nnw0 f106439b;

    /* JADX INFO: renamed from: c */
    public final dfw0 f106440c = new dfw0(new byte[64], 64);

    /* JADX INFO: renamed from: d */
    public boolean f106441d;

    /* JADX INFO: renamed from: e */
    public boolean f106442e;

    /* JADX INFO: renamed from: f */
    public boolean f106443f;

    public gtr0(yrr0 yrr0Var, nnw0 nnw0Var) {
        this.f106438a = yrr0Var;
        this.f106439b = nnw0Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m132256a(bgw0 bgw0Var) throws zzcc {
        long jM163999b;
        char c;
        bgw0Var.m104265g(this.f106440c.f88231a, 0, 3);
        this.f106440c.m115559k(0);
        this.f106440c.m115561m(8);
        this.f106441d = this.f106440c.m115563o();
        this.f106442e = this.f106440c.m115563o();
        this.f106440c.m115561m(6);
        dfw0 dfw0Var = this.f106440c;
        bgw0Var.m104265g(dfw0Var.f88231a, 0, dfw0Var.m115552d(8));
        this.f106440c.m115559k(0);
        if (this.f106441d) {
            this.f106440c.m115561m(4);
            long jM115552d = this.f106440c.m115552d(3);
            this.f106440c.m115561m(1);
            int iM115552d = this.f106440c.m115552d(15) << 15;
            this.f106440c.m115561m(1);
            long jM115552d2 = this.f106440c.m115552d(15);
            this.f106440c.m115561m(1);
            if (this.f106443f || !this.f106442e) {
                c = 30;
            } else {
                this.f106440c.m115561m(4);
                long jM115552d3 = ((long) this.f106440c.m115552d(3)) << 30;
                this.f106440c.m115561m(1);
                int iM115552d2 = this.f106440c.m115552d(15) << 15;
                this.f106440c.m115561m(1);
                long jM115552d4 = this.f106440c.m115552d(15);
                this.f106440c.m115561m(1);
                c = 30;
                this.f106439b.m163999b(jM115552d3 | ((long) iM115552d2) | jM115552d4);
                this.f106443f = true;
            }
            jM163999b = this.f106439b.m163999b((jM115552d << c) | ((long) iM115552d) | jM115552d2);
        } else {
            jM163999b = 0;
        }
        this.f106438a.mo155730c(jM163999b, 4);
        this.f106438a.mo155729b(bgw0Var);
        this.f106438a.mo155728a(false);
    }

    /* JADX INFO: renamed from: b */
    public final void m132257b() {
        this.f106443f = false;
        this.f106438a.zze();
    }
}
