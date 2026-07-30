package p153l;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class wri implements mke0 {

    /* JADX INFO: renamed from: a */
    public final xri f190523a;

    /* JADX INFO: renamed from: b */
    public final long f190524b;

    public wri(xri xriVar, long j) {
        this.f190523a = xriVar;
        this.f190524b = j;
    }

    /* JADX INFO: renamed from: a */
    public final oke0 m207600a(long j, long j2) {
        return new oke0((j * 1000000) / ((long) this.f190523a.f195916e), this.f190524b + j2);
    }

    @Override // p153l.mke0
    /* JADX INFO: renamed from: d */
    public mke0.C18640a mo107791d(long j) {
        w11.m204373i(this.f190523a.f195922k);
        xri xriVar = this.f190523a;
        xri.C21431a c21431a = xriVar.f195922k;
        long[] jArr = c21431a.f195924a;
        long[] jArr2 = c21431a.f195925b;
        int iM105141i = bmk0.m105141i(jArr, xriVar.m212836i(j), true, false);
        oke0 oke0VarM207600a = m207600a(iM105141i == -1 ? 0L : jArr[iM105141i], iM105141i != -1 ? jArr2[iM105141i] : 0L);
        if (oke0VarM207600a.f147751a == j || iM105141i == jArr.length - 1) {
            return new mke0.C18640a(oke0VarM207600a);
        }
        int i = iM105141i + 1;
        return new mke0.C18640a(oke0VarM207600a, m207600a(jArr[i], jArr2[i]));
    }

    @Override // p153l.mke0
    /* JADX INFO: renamed from: e */
    public boolean mo107792e() {
        return true;
    }

    @Override // p153l.mke0
    /* JADX INFO: renamed from: i */
    public long mo107793i() {
        return this.f190523a.m212833f();
    }
}
