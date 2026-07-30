package p153l;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public abstract class dq2 implements drx {

    /* JADX INFO: renamed from: b */
    public final long f90100b;

    /* JADX INFO: renamed from: c */
    public final long f90101c;

    /* JADX INFO: renamed from: d */
    public long f90102d;

    public dq2(long j, long j2) {
        this.f90100b = j;
        this.f90101c = j2;
        m117443f();
    }

    /* JADX INFO: renamed from: c */
    public final void m117440c() {
        long j = this.f90102d;
        if (j < this.f90100b || j > this.f90101c) {
            mor.m159308a();
        }
    }

    /* JADX INFO: renamed from: d */
    public final long m117441d() {
        return this.f90102d;
    }

    /* JADX INFO: renamed from: e */
    public boolean m117442e() {
        return this.f90102d > this.f90101c;
    }

    /* JADX INFO: renamed from: f */
    public void m117443f() {
        this.f90102d = this.f90100b - 1;
    }

    @Override // p153l.drx
    public boolean next() {
        this.f90102d++;
        return !m117442e();
    }
}
