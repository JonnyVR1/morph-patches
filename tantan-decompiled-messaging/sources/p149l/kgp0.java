package p149l;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class kgp0 implements hce0 {

    /* JADX INFO: renamed from: a */
    public final igp0 f123052a;

    /* JADX INFO: renamed from: b */
    public final int f123053b;

    /* JADX INFO: renamed from: c */
    public final long f123054c;

    /* JADX INFO: renamed from: d */
    public final long f123055d;

    /* JADX INFO: renamed from: e */
    public final long f123056e;

    public kgp0(igp0 igp0Var, int i, long j, long j2) {
        this.f123052a = igp0Var;
        this.f123053b = i;
        this.f123054c = j;
        long j3 = (j2 - j) / ((long) igp0Var.f113148e);
        this.f123055d = j3;
        this.f123056e = m145897a(j3);
    }

    /* JADX INFO: renamed from: a */
    public final long m145897a(long j) {
        return vck0.m197832W0(j * ((long) this.f123053b), 1000000L, this.f123052a.f113146c);
    }

    @Override // p149l.hce0
    /* JADX INFO: renamed from: d */
    public hce0.C17274a mo98121d(long j) {
        long jM197886r = vck0.m197886r((((long) this.f123052a.f113146c) * j) / (((long) this.f123053b) * 1000000), 0L, this.f123055d - 1);
        long j2 = this.f123054c + (((long) this.f123052a.f113148e) * jM197886r);
        long jM145897a = m145897a(jM197886r);
        jce0 jce0Var = new jce0(jM145897a, j2);
        if (jM145897a >= j || jM197886r == this.f123055d - 1) {
            return new hce0.C17274a(jce0Var);
        }
        long j3 = jM197886r + 1;
        return new hce0.C17274a(jce0Var, new jce0(m145897a(j3), this.f123054c + (((long) this.f123052a.f113148e) * j3)));
    }

    @Override // p149l.hce0
    /* JADX INFO: renamed from: e */
    public boolean mo98122e() {
        return true;
    }

    @Override // p149l.hce0
    /* JADX INFO: renamed from: i */
    public long mo98123i() {
        return this.f123056e;
    }
}
