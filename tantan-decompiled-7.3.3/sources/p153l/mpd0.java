package p153l;

/* JADX INFO: loaded from: classes6.dex */
public final class mpd0 implements aqd0 {

    /* JADX INFO: renamed from: a */
    public final zpd0 f137905a;

    /* JADX INFO: renamed from: c */
    public qfj0 f137907c;

    /* JADX INFO: renamed from: d */
    public int f137908d;

    /* JADX INFO: renamed from: f */
    public long f137910f;

    /* JADX INFO: renamed from: g */
    public long f137911g;

    /* JADX INFO: renamed from: b */
    public final hg60 f137906b = new hg60();

    /* JADX INFO: renamed from: e */
    public long f137909e = -9223372036854775807L;

    public mpd0(zpd0 zpd0Var) {
        this.f137905a = zpd0Var;
    }

    @Override // p153l.aqd0
    /* JADX INFO: renamed from: a */
    public void mo99454a(long j, long j2) {
        this.f137909e = j;
        this.f137911g = j2;
    }

    @Override // p153l.aqd0
    /* JADX INFO: renamed from: b */
    public void mo99455b(ig60 ig60Var, long j, int i, boolean z) {
        int iM139795H = ig60Var.m139795H() & 3;
        int iM139795H2 = ig60Var.m139795H() & 255;
        long jM111889a = cqd0.m111889a(this.f137911g, j, this.f137909e, this.f137905a.f205454b);
        if (iM139795H == 0) {
            m159356e();
            if (iM139795H2 == 1) {
                m159360i(ig60Var, jM111889a);
                return;
            } else {
                m159359h(ig60Var, iM139795H2, jM111889a);
                return;
            }
        }
        if (iM139795H == 1 || iM139795H == 2) {
            m159356e();
        } else if (iM139795H != 3) {
            wg3.m206174a(String.valueOf(iM139795H));
            return;
        }
        m159358g(ig60Var, z, iM139795H, jM111889a);
    }

    @Override // p153l.aqd0
    /* JADX INFO: renamed from: c */
    public void mo99456c(long j, int i) {
        w11.m204371g(this.f137909e == -9223372036854775807L);
        this.f137909e = j;
    }

    @Override // p153l.aqd0
    /* JADX INFO: renamed from: d */
    public void mo99457d(bsf bsfVar, int i) {
        qfj0 qfj0VarMo11416b = bsfVar.mo11416b(i, 1);
        this.f137907c = qfj0VarMo11416b;
        qfj0VarMo11416b.mo11164b(this.f137905a.f205455c);
    }

    /* JADX INFO: renamed from: e */
    public final void m159356e() {
        if (this.f137908d > 0) {
            m159357f();
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m159357f() {
        ((qfj0) bmk0.m105144j(this.f137907c)).mo11163a(this.f137910f, 1, this.f137908d, 0, null);
        this.f137908d = 0;
    }

    /* JADX INFO: renamed from: g */
    public final void m159358g(ig60 ig60Var, boolean z, int i, long j) {
        int iM139811a = ig60Var.m139811a();
        ((qfj0) w11.m204369e(this.f137907c)).m176370d(ig60Var, iM139811a);
        this.f137908d += iM139811a;
        this.f137910f = j;
        if (z && i == 3) {
            m159357f();
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m159359h(ig60 ig60Var, int i, long j) {
        this.f137906b.m134911n(ig60Var.m139815e());
        this.f137906b.m134916s(2);
        long j2 = j;
        for (int i2 = 0; i2 < i; i2++) {
            C21775z8.b bVarM218932f = C21775z8.m218932f(this.f137906b);
            ((qfj0) w11.m204369e(this.f137907c)).m176370d(ig60Var, bVarM218932f.f203294e);
            ((qfj0) bmk0.m105144j(this.f137907c)).mo11163a(j2, 1, bVarM218932f.f203294e, 0, null);
            j2 += ((long) (bVarM218932f.f203295f / bVarM218932f.f203292c)) * 1000000;
            this.f137906b.m134916s(bVarM218932f.f203294e);
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m159360i(ig60 ig60Var, long j) {
        int iM139811a = ig60Var.m139811a();
        ((qfj0) w11.m204369e(this.f137907c)).m176370d(ig60Var, iM139811a);
        ((qfj0) bmk0.m105144j(this.f137907c)).mo11163a(j, 1, iM139811a, 0, null);
    }
}
