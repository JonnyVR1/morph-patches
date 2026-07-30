package p153l;

/* JADX INFO: loaded from: classes6.dex */
public final class onr0 implements unr0 {

    /* JADX INFO: renamed from: a */
    public final ofr0 f148120a;

    /* JADX INFO: renamed from: b */
    public final nfr0 f148121b;

    /* JADX INFO: renamed from: c */
    public long f148122c = -1;

    /* JADX INFO: renamed from: d */
    public long f148123d = -1;

    public onr0(ofr0 ofr0Var, nfr0 nfr0Var) {
        this.f148120a = ofr0Var;
        this.f148121b = nfr0Var;
    }

    @Override // p153l.unr0
    /* JADX INFO: renamed from: a */
    public final void mo150675a(long j) {
        long[] jArr = this.f148121b.f141755a;
        this.f148123d = jArr[mpw0.m159420r(jArr, j, true, true)];
    }

    @Override // p153l.unr0
    /* JADX INFO: renamed from: b */
    public final long mo150676b(qer0 qer0Var) {
        long j = this.f148123d;
        if (j < 0) {
            return -1L;
        }
        this.f148123d = -1L;
        return -(j + 2);
    }

    /* JADX INFO: renamed from: c */
    public final void m168348c(long j) {
        this.f148122c = j;
    }

    @Override // p153l.unr0
    public final bgr0 zze() {
        lev0.m153958f(this.f148122c != -1);
        return new mfr0(this.f148120a, this.f148122c);
    }
}
