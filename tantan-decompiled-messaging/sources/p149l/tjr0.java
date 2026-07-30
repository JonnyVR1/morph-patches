package p149l;

/* JADX INFO: loaded from: classes6.dex */
public final class tjr0 implements ckr0 {

    /* JADX INFO: renamed from: a */
    public mhr0 f170794a;

    /* JADX INFO: renamed from: b */
    public hew0 f170795b;

    /* JADX INFO: renamed from: c */
    public m7r0 f170796c;

    public tjr0(String str) {
        ter0 ter0Var = new ter0();
        ter0Var.m188618w(str);
        this.f170794a = ter0Var.m188591D();
    }

    @Override // p149l.ckr0
    /* JADX INFO: renamed from: a */
    public final void mo107427a(hew0 hew0Var, m5r0 m5r0Var, alr0 alr0Var) {
        this.f170795b = hew0Var;
        alr0Var.m97444c();
        m7r0 m7r0VarMo129454i = m5r0Var.mo129454i(alr0Var.m97442a(), 5);
        this.f170796c = m7r0VarMo129454i;
        m7r0VarMo129454i.mo134531d(this.f170794a);
    }

    @Override // p149l.ckr0
    /* JADX INFO: renamed from: b */
    public final void mo107428b(v6w0 v6w0Var) {
        f5v0.m119531b(this.f170795b);
        int i = ggw0.f102568a;
        long jM130707e = this.f170795b.m130707e();
        long jM130708f = this.f170795b.m130708f();
        if (jM130707e == -9223372036854775807L || jM130708f == -9223372036854775807L) {
            return;
        }
        mhr0 mhr0Var = this.f170794a;
        if (jM130708f != mhr0Var.f133896p) {
            ter0 ter0VarM154634b = mhr0Var.m154634b();
            ter0VarM154634b.m188589B(jM130708f);
            mhr0 mhr0VarM188591D = ter0VarM154634b.m188591D();
            this.f170794a = mhr0VarM188591D;
            this.f170796c.mo134531d(mhr0VarM188591D);
        }
        int iM197268q = v6w0Var.m197268q();
        this.f170796c.mo134533f(v6w0Var, iM197268q);
        this.f170796c.mo134530c(jM130707e, 1, iM197268q, 0, null);
    }
}
