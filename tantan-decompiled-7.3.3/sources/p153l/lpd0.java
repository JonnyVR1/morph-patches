package p153l;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class lpd0 implements aqd0 {

    /* JADX INFO: renamed from: a */
    public final zpd0 f133034a;

    /* JADX INFO: renamed from: b */
    public final hg60 f133035b = new hg60();

    /* JADX INFO: renamed from: c */
    public final int f133036c;

    /* JADX INFO: renamed from: d */
    public final int f133037d;

    /* JADX INFO: renamed from: e */
    public final int f133038e;

    /* JADX INFO: renamed from: f */
    public final int f133039f;

    /* JADX INFO: renamed from: g */
    public long f133040g;

    /* JADX INFO: renamed from: h */
    public qfj0 f133041h;

    /* JADX INFO: renamed from: i */
    public long f133042i;

    public lpd0(zpd0 zpd0Var) {
        this.f133034a = zpd0Var;
        this.f133036c = zpd0Var.f205454b;
        String str = (String) w11.m204369e(zpd0Var.f205456d.get("mode"));
        if (i11.m138047a(str, "AAC-hbr")) {
            this.f133037d = 13;
            this.f133038e = 3;
        } else {
            if (!i11.m138047a(str, "AAC-lbr")) {
                pr3.m173429a("AAC mode not supported");
                throw null;
            }
            this.f133037d = 6;
            this.f133038e = 2;
        }
        this.f133039f = this.f133038e + this.f133037d;
    }

    /* JADX INFO: renamed from: e */
    public static void m155178e(qfj0 qfj0Var, long j, int i) {
        qfj0Var.mo11163a(j, 1, i, 0, null);
    }

    @Override // p153l.aqd0
    /* JADX INFO: renamed from: a */
    public void mo99454a(long j, long j2) {
        this.f133040g = j;
        this.f133042i = j2;
    }

    @Override // p153l.aqd0
    /* JADX INFO: renamed from: b */
    public void mo99455b(ig60 ig60Var, long j, int i, boolean z) {
        w11.m204369e(this.f133041h);
        short sM139791D = ig60Var.m139791D();
        int i2 = sM139791D / this.f133039f;
        long jM111889a = cqd0.m111889a(this.f133042i, j, this.f133040g, this.f133036c);
        this.f133035b.m134910m(ig60Var);
        if (i2 == 1) {
            int iM134905h = this.f133035b.m134905h(this.f133037d);
            this.f133035b.m134915r(this.f133038e);
            this.f133041h.m176370d(ig60Var, ig60Var.m139811a());
            if (z) {
                m155178e(this.f133041h, jM111889a, iM134905h);
                return;
            }
            return;
        }
        ig60Var.m139809V((sM139791D + 7) / 8);
        for (int i3 = 0; i3 < i2; i3++) {
            int iM134905h2 = this.f133035b.m134905h(this.f133037d);
            this.f133035b.m134915r(this.f133038e);
            this.f133041h.m176370d(ig60Var, iM134905h2);
            m155178e(this.f133041h, jM111889a, iM134905h2);
            jM111889a += bmk0.m105110W0(i2, 1000000L, this.f133036c);
        }
    }

    @Override // p153l.aqd0
    /* JADX INFO: renamed from: c */
    public void mo99456c(long j, int i) {
        this.f133040g = j;
    }

    @Override // p153l.aqd0
    /* JADX INFO: renamed from: d */
    public void mo99457d(bsf bsfVar, int i) {
        qfj0 qfj0VarMo11416b = bsfVar.mo11416b(i, 1);
        this.f133041h = qfj0VarMo11416b;
        qfj0VarMo11416b.mo11164b(this.f133034a.f205455c);
    }
}
