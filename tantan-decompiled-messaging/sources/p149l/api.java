package p149l;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class api implements hce0 {

    /* JADX INFO: renamed from: a */
    public final bpi f71049a;

    /* JADX INFO: renamed from: b */
    public final long f71050b;

    public api(bpi bpiVar, long j) {
        this.f71049a = bpiVar;
        this.f71050b = j;
    }

    /* JADX INFO: renamed from: a */
    public final jce0 m98120a(long j, long j2) {
        return new jce0((j * 1000000) / ((long) this.f71049a.f76632e), this.f71050b + j2);
    }

    @Override // p149l.hce0
    /* JADX INFO: renamed from: d */
    public hce0.C17274a mo98121d(long j) {
        p11.m167015i(this.f71049a.f76638k);
        bpi bpiVar = this.f71049a;
        bpi.C15925a c15925a = bpiVar.f76638k;
        long[] jArr = c15925a.f76640a;
        long[] jArr2 = c15925a.f76641b;
        int iM197863i = vck0.m197863i(jArr, bpiVar.m103066i(j), true, false);
        jce0 jce0VarM98120a = m98120a(iM197863i == -1 ? 0L : jArr[iM197863i], iM197863i != -1 ? jArr2[iM197863i] : 0L);
        if (jce0VarM98120a.f117295a == j || iM197863i == jArr.length - 1) {
            return new hce0.C17274a(jce0VarM98120a);
        }
        int i = iM197863i + 1;
        return new hce0.C17274a(jce0VarM98120a, m98120a(jArr[i], jArr2[i]));
    }

    @Override // p149l.hce0
    /* JADX INFO: renamed from: e */
    public boolean mo98122e() {
        return true;
    }

    @Override // p149l.hce0
    /* JADX INFO: renamed from: i */
    public long mo98123i() {
        return this.f71049a.m103063f();
    }
}
