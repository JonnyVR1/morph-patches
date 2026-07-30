package p153l;

/* JADX INFO: loaded from: classes6.dex */
public final class zsr0 implements itr0 {

    /* JADX INFO: renamed from: a */
    public sqr0 f205891a;

    /* JADX INFO: renamed from: b */
    public nnw0 f205892b;

    /* JADX INFO: renamed from: c */
    public sgr0 f205893c;

    public zsr0(String str) {
        znr0 znr0Var = new znr0();
        znr0Var.m220672w(str);
        this.f205891a = znr0Var.m220645D();
    }

    @Override // p153l.itr0
    /* JADX INFO: renamed from: a */
    public final void mo100403a(nnw0 nnw0Var, ser0 ser0Var, gur0 gur0Var) {
        this.f205892b = nnw0Var;
        gur0Var.m132386c();
        sgr0 sgr0VarMo101550i = ser0Var.mo101550i(gur0Var.m132384a(), 5);
        this.f205893c = sgr0VarMo101550i;
        sgr0VarMo101550i.mo99373d(this.f205891a);
    }

    @Override // p153l.itr0
    /* JADX INFO: renamed from: b */
    public final void mo100404b(bgw0 bgw0Var) {
        lev0.m153954b(this.f205892b);
        int i = mpw0.f137957a;
        long jM164002e = this.f205892b.m164002e();
        long jM164003f = this.f205892b.m164003f();
        if (jM164002e == -9223372036854775807L || jM164003f == -9223372036854775807L) {
            return;
        }
        sqr0 sqr0Var = this.f205891a;
        if (jM164003f != sqr0Var.f170255p) {
            znr0 znr0VarM187559b = sqr0Var.m187559b();
            znr0VarM187559b.m220643B(jM164003f);
            sqr0 sqr0VarM220645D = znr0VarM187559b.m220645D();
            this.f205891a = sqr0VarM220645D;
            this.f205893c.mo99373d(sqr0VarM220645D);
        }
        int iM104275q = bgw0Var.m104275q();
        this.f205893c.mo99375f(bgw0Var, iM104275q);
        this.f205893c.mo99372c(jM164002e, 1, iM104275q, 0, null);
    }
}
