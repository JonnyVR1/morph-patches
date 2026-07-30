package p153l;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class opp0 implements mke0 {

    /* JADX INFO: renamed from: a */
    public final mpp0 f148477a;

    /* JADX INFO: renamed from: b */
    public final int f148478b;

    /* JADX INFO: renamed from: c */
    public final long f148479c;

    /* JADX INFO: renamed from: d */
    public final long f148480d;

    /* JADX INFO: renamed from: e */
    public final long f148481e;

    public opp0(mpp0 mpp0Var, int i, long j, long j2) {
        this.f148477a = mpp0Var;
        this.f148478b = i;
        this.f148479c = j;
        long j3 = (j2 - j) / ((long) mpp0Var.f137939e);
        this.f148480d = j3;
        this.f148481e = m168679a(j3);
    }

    /* JADX INFO: renamed from: a */
    public final long m168679a(long j) {
        return bmk0.m105110W0(j * ((long) this.f148478b), 1000000L, this.f148477a.f137937c);
    }

    @Override // p153l.mke0
    /* JADX INFO: renamed from: d */
    public mke0.C18640a mo107791d(long j) {
        long jM105164r = bmk0.m105164r((((long) this.f148477a.f137937c) * j) / (((long) this.f148478b) * 1000000), 0L, this.f148480d - 1);
        long j2 = this.f148479c + (((long) this.f148477a.f137939e) * jM105164r);
        long jM168679a = m168679a(jM105164r);
        oke0 oke0Var = new oke0(jM168679a, j2);
        if (jM168679a >= j || jM105164r == this.f148480d - 1) {
            return new mke0.C18640a(oke0Var);
        }
        long j3 = jM105164r + 1;
        return new mke0.C18640a(oke0Var, new oke0(m168679a(j3), this.f148479c + (((long) this.f148477a.f137939e) * j3)));
    }

    @Override // p153l.mke0
    /* JADX INFO: renamed from: e */
    public boolean mo107792e() {
        return true;
    }

    @Override // p153l.mke0
    /* JADX INFO: renamed from: i */
    public long mo107793i() {
        return this.f148481e;
    }
}
