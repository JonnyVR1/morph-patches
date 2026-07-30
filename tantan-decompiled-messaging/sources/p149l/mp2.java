package p149l;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public abstract class mp2 implements gix {

    /* JADX INFO: renamed from: b */
    public final long f135002b;

    /* JADX INFO: renamed from: c */
    public final long f135003c;

    /* JADX INFO: renamed from: d */
    public long f135004d;

    public mp2(long j, long j2) {
        this.f135002b = j;
        this.f135003c = j2;
        m155764f();
    }

    /* JADX INFO: renamed from: c */
    public final void m155761c() {
        long j = this.f135004d;
        if (j < this.f135002b || j > this.f135003c) {
            lmr.m150601a();
        }
    }

    /* JADX INFO: renamed from: d */
    public final long m155762d() {
        return this.f135004d;
    }

    /* JADX INFO: renamed from: e */
    public boolean m155763e() {
        return this.f135004d > this.f135003c;
    }

    /* JADX INFO: renamed from: f */
    public void m155764f() {
        this.f135004d = this.f135002b - 1;
    }

    @Override // p149l.gix
    public boolean next() {
        this.f135004d++;
        return !m155763e();
    }
}
