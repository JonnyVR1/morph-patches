package p153l;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class n4c implements l4c {

    /* JADX INFO: renamed from: a */
    public final r45 f140218a;

    /* JADX INFO: renamed from: b */
    public final long f140219b;

    public n4c(r45 r45Var, long j) {
        this.f140218a = r45Var;
        this.f140219b = j;
    }

    @Override // p153l.l4c
    /* JADX INFO: renamed from: c */
    public long mo152751c(long j) {
        return this.f140218a.f161146e[(int) j] - this.f140219b;
    }

    @Override // p153l.l4c
    /* JADX INFO: renamed from: d */
    public long mo152752d(long j, long j2) {
        return this.f140218a.f161145d[(int) j];
    }

    @Override // p153l.l4c
    /* JADX INFO: renamed from: e */
    public long mo152753e(long j, long j2) {
        return 0L;
    }

    @Override // p153l.l4c
    /* JADX INFO: renamed from: f */
    public long mo152754f(long j, long j2) {
        return -9223372036854775807L;
    }

    @Override // p153l.l4c
    /* JADX INFO: renamed from: g */
    public long mo152755g(long j, long j2) {
        return this.f140218a.m179740a(j + this.f140219b);
    }

    @Override // p153l.l4c
    /* JADX INFO: renamed from: h */
    public long mo152756h(long j) {
        return this.f140218a.f161142a;
    }

    @Override // p153l.l4c
    /* JADX INFO: renamed from: i */
    public long mo152757i() {
        return 0L;
    }

    @Override // p153l.l4c
    /* JADX INFO: renamed from: j */
    public mkc0 mo152758j(long j) {
        r45 r45Var = this.f140218a;
        int i = (int) j;
        return new mkc0(null, r45Var.f161144c[i], r45Var.f161143b[i]);
    }

    @Override // p153l.l4c
    /* JADX INFO: renamed from: k */
    public boolean mo152759k() {
        return true;
    }

    @Override // p153l.l4c
    /* JADX INFO: renamed from: l */
    public long mo152760l(long j, long j2) {
        return this.f140218a.f161142a;
    }
}
