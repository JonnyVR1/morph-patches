package p149l;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class xrm implements kce0 {

    /* JADX INFO: renamed from: a */
    public final long f194151a;

    /* JADX INFO: renamed from: b */
    public final jzv f194152b;

    /* JADX INFO: renamed from: c */
    public final jzv f194153c;

    /* JADX INFO: renamed from: d */
    public long f194154d;

    public xrm(long j, long j2, long j3) {
        this.f194154d = j;
        this.f194151a = j3;
        jzv jzvVar = new jzv();
        this.f194152b = jzvVar;
        jzv jzvVar2 = new jzv();
        this.f194153c = jzvVar2;
        jzvVar.m143948a(0L);
        jzvVar2.m143948a(j2);
    }

    /* JADX INFO: renamed from: a */
    public boolean m210702a(long j) {
        jzv jzvVar = this.f194152b;
        return j - jzvVar.m143949b(jzvVar.m143950c() - 1) < 100000;
    }

    /* JADX INFO: renamed from: b */
    public void m210703b(long j, long j2) {
        if (m210702a(j)) {
            return;
        }
        this.f194152b.m143948a(j);
        this.f194153c.m143948a(j2);
    }

    @Override // p149l.kce0
    /* JADX INFO: renamed from: c */
    public long mo99379c(long j) {
        return this.f194152b.m143949b(vck0.m197857g(this.f194153c, j, true, true));
    }

    @Override // p149l.hce0
    /* JADX INFO: renamed from: d */
    public hce0.C17274a mo98121d(long j) {
        int iM197857g = vck0.m197857g(this.f194152b, j, true, true);
        jce0 jce0Var = new jce0(this.f194152b.m143949b(iM197857g), this.f194153c.m143949b(iM197857g));
        if (jce0Var.f117295a == j || iM197857g == this.f194152b.m143950c() - 1) {
            return new hce0.C17274a(jce0Var);
        }
        int i = iM197857g + 1;
        return new hce0.C17274a(jce0Var, new jce0(this.f194152b.m143949b(i), this.f194153c.m143949b(i)));
    }

    @Override // p149l.hce0
    /* JADX INFO: renamed from: e */
    public boolean mo98122e() {
        return true;
    }

    /* JADX INFO: renamed from: f */
    public void m210704f(long j) {
        this.f194154d = j;
    }

    @Override // p149l.kce0
    /* JADX INFO: renamed from: g */
    public long mo99380g() {
        return this.f194151a;
    }

    @Override // p149l.hce0
    /* JADX INFO: renamed from: i */
    public long mo98123i() {
        return this.f194154d;
    }
}
