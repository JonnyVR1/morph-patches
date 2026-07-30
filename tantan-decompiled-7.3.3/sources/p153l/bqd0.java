package p153l;

/* JADX INFO: loaded from: classes6.dex */
public final class bqd0 implements aqd0 {

    /* JADX INFO: renamed from: a */
    public final zpd0 f77870a;

    /* JADX INFO: renamed from: b */
    public qfj0 f77871b;

    /* JADX INFO: renamed from: c */
    public long f77872c = -9223372036854775807L;

    /* JADX INFO: renamed from: d */
    public long f77873d = 0;

    /* JADX INFO: renamed from: e */
    public int f77874e = -1;

    public bqd0(zpd0 zpd0Var) {
        this.f77870a = zpd0Var;
    }

    @Override // p153l.aqd0
    /* JADX INFO: renamed from: a */
    public void mo99454a(long j, long j2) {
        this.f77872c = j;
        this.f77873d = j2;
    }

    @Override // p153l.aqd0
    /* JADX INFO: renamed from: b */
    public void mo99455b(ig60 ig60Var, long j, int i, boolean z) {
        int iM207434b;
        w11.m204369e(this.f77871b);
        int i2 = this.f77874e;
        if (i2 != -1 && i != (iM207434b = wpd0.m207434b(i2))) {
            bmk0.m105071D("Received RTP packet with unexpected sequence number. Expected: %d; received: %d.", Integer.valueOf(iM207434b), Integer.valueOf(i));
        }
        long jM111889a = cqd0.m111889a(this.f77873d, j, this.f77872c, this.f77870a.f205454b);
        int iM139811a = ig60Var.m139811a();
        this.f77871b.m176370d(ig60Var, iM139811a);
        this.f77871b.mo11163a(jM111889a, 1, iM139811a, 0, null);
        this.f77874e = i;
    }

    @Override // p153l.aqd0
    /* JADX INFO: renamed from: c */
    public void mo99456c(long j, int i) {
        this.f77872c = j;
    }

    @Override // p153l.aqd0
    /* JADX INFO: renamed from: d */
    public void mo99457d(bsf bsfVar, int i) {
        qfj0 qfj0VarMo11416b = bsfVar.mo11416b(i, 1);
        this.f77871b = qfj0VarMo11416b;
        qfj0VarMo11416b.mo11164b(this.f77870a.f205455c);
    }
}
