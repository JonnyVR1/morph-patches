package p149l;

/* JADX INFO: loaded from: classes6.dex */
public final class bjy0 {

    /* JADX INFO: renamed from: a */
    public final qju0[] f75951a;

    /* JADX INFO: renamed from: b */
    public final lky0 f75952b;

    /* JADX INFO: renamed from: c */
    public final hnu0 f75953c;

    public bjy0(qju0... qju0VarArr) {
        lky0 lky0Var = new lky0();
        hnu0 hnu0Var = new hnu0();
        qju0[] qju0VarArr2 = {lky0Var, hnu0Var};
        this.f75951a = qju0VarArr2;
        System.arraycopy(qju0VarArr, 0, qju0VarArr2, 0, 0);
        this.f75952b = lky0Var;
        this.f75953c = hnu0Var;
    }

    /* JADX INFO: renamed from: a */
    public final long m102244a(long j) {
        return this.f75953c.m132016c(j);
    }

    /* JADX INFO: renamed from: b */
    public final long m102245b() {
        return this.f75952b.m150395i();
    }

    /* JADX INFO: renamed from: c */
    public final c5t0 m102246c(c5t0 c5t0Var) {
        this.f75953c.m132018e(c5t0Var.f79416a);
        this.f75953c.m132017d(c5t0Var.f79417b);
        return c5t0Var;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m102247d(boolean z) {
        this.f75952b.m150396j(z);
        return z;
    }

    /* JADX INFO: renamed from: e */
    public final qju0[] m102248e() {
        return this.f75951a;
    }
}
