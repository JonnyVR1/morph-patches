package p149l;

/* JADX INFO: loaded from: classes6.dex */
public final class ier0 implements oer0 {

    /* JADX INFO: renamed from: a */
    public final i6r0 f112823a;

    /* JADX INFO: renamed from: b */
    public final h6r0 f112824b;

    /* JADX INFO: renamed from: c */
    public long f112825c = -1;

    /* JADX INFO: renamed from: d */
    public long f112826d = -1;

    public ier0(i6r0 i6r0Var, h6r0 h6r0Var) {
        this.f112823a = i6r0Var;
        this.f112824b = h6r0Var;
    }

    @Override // p149l.oer0
    /* JADX INFO: renamed from: a */
    public final void mo116090a(long j) {
        long[] jArr = this.f112824b.f106111a;
        this.f112826d = jArr[ggw0.m126076r(jArr, j, true, true)];
    }

    @Override // p149l.oer0
    /* JADX INFO: renamed from: b */
    public final long mo116091b(k5r0 k5r0Var) {
        long j = this.f112826d;
        if (j < 0) {
            return -1L;
        }
        this.f112826d = -1L;
        return -(j + 2);
    }

    /* JADX INFO: renamed from: c */
    public final void m135716c(long j) {
        this.f112825c = j;
    }

    @Override // p149l.oer0
    public final v6r0 zze() {
        f5v0.m119535f(this.f112825c != -1);
        return new g6r0(this.f112823a, this.f112825c);
    }
}
