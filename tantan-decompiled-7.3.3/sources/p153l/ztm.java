package p153l;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class ztm implements pke0 {

    /* JADX INFO: renamed from: a */
    public final long f206024a;

    /* JADX INFO: renamed from: b */
    public final h1w f206025b;

    /* JADX INFO: renamed from: c */
    public final h1w f206026c;

    /* JADX INFO: renamed from: d */
    public long f206027d;

    public ztm(long j, long j2, long j3) {
        this.f206027d = j;
        this.f206024a = j3;
        h1w h1wVar = new h1w();
        this.f206025b = h1wVar;
        h1w h1wVar2 = new h1w();
        this.f206026c = h1wVar2;
        h1wVar.m133353a(0L);
        h1wVar2.m133353a(j2);
    }

    /* JADX INFO: renamed from: a */
    public boolean m221564a(long j) {
        h1w h1wVar = this.f206025b;
        return j - h1wVar.m133354b(h1wVar.m133355c() - 1) < 100000;
    }

    /* JADX INFO: renamed from: b */
    public void m221565b(long j, long j2) {
        if (m221564a(j)) {
            return;
        }
        this.f206025b.m133353a(j);
        this.f206026c.m133353a(j2);
    }

    @Override // p153l.pke0
    /* JADX INFO: renamed from: c */
    public long mo128052c(long j) {
        return this.f206025b.m133354b(bmk0.m105135g(this.f206026c, j, true, true));
    }

    @Override // p153l.mke0
    /* JADX INFO: renamed from: d */
    public mke0.C18640a mo107791d(long j) {
        int iM105135g = bmk0.m105135g(this.f206025b, j, true, true);
        oke0 oke0Var = new oke0(this.f206025b.m133354b(iM105135g), this.f206026c.m133354b(iM105135g));
        if (oke0Var.f147751a == j || iM105135g == this.f206025b.m133355c() - 1) {
            return new mke0.C18640a(oke0Var);
        }
        int i = iM105135g + 1;
        return new mke0.C18640a(oke0Var, new oke0(this.f206025b.m133354b(i), this.f206026c.m133354b(i)));
    }

    @Override // p153l.mke0
    /* JADX INFO: renamed from: e */
    public boolean mo107792e() {
        return true;
    }

    /* JADX INFO: renamed from: f */
    public void m221566f(long j) {
        this.f206027d = j;
    }

    @Override // p153l.pke0
    /* JADX INFO: renamed from: g */
    public long mo128053g() {
        return this.f206024a;
    }

    @Override // p153l.mke0
    /* JADX INFO: renamed from: i */
    public long mo107793i() {
        return this.f206027d;
    }
}
