package p149l;

/* JADX INFO: loaded from: classes6.dex */
public final class g6r0 implements v6r0 {

    /* JADX INFO: renamed from: a */
    public final i6r0 f101302a;

    /* JADX INFO: renamed from: b */
    public final long f101303b;

    public g6r0(i6r0 i6r0Var, long j) {
        this.f101302a = i6r0Var;
        this.f101303b = j;
    }

    @Override // p149l.v6r0
    /* JADX INFO: renamed from: a */
    public final t6r0 mo124628a(long j) {
        f5v0.m119531b(this.f101302a.f111769k);
        i6r0 i6r0Var = this.f101302a;
        h6r0 h6r0Var = i6r0Var.f111769k;
        long[] jArr = h6r0Var.f106111a;
        long[] jArr2 = h6r0Var.f106112b;
        int iM126076r = ggw0.m126076r(jArr, i6r0Var.m134637b(j), true, false);
        w6r0 w6r0VarM124629c = m124629c(iM126076r == -1 ? 0L : jArr[iM126076r], iM126076r != -1 ? jArr2[iM126076r] : 0L);
        if (w6r0VarM124629c.f184990a == j || iM126076r == jArr.length - 1) {
            return new t6r0(w6r0VarM124629c, w6r0VarM124629c);
        }
        int i = iM126076r + 1;
        return new t6r0(w6r0VarM124629c, m124629c(jArr[i], jArr2[i]));
    }

    /* JADX INFO: renamed from: c */
    public final w6r0 m124629c(long j, long j2) {
        return new w6r0((j * 1000000) / ((long) this.f101302a.f111763e), this.f101303b + j2);
    }

    @Override // p149l.v6r0
    public final long zza() {
        return this.f101302a.m134636a();
    }

    @Override // p149l.v6r0
    public final boolean zzh() {
        return true;
    }
}
