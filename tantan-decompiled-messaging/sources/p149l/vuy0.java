package p149l;

/* JADX INFO: loaded from: classes6.dex */
public final class vuy0 extends bwy0 implements Comparable {

    /* JADX INFO: renamed from: e */
    public final int f183139e;

    /* JADX INFO: renamed from: f */
    public final int f183140f;

    public vuy0(int i, ntt0 ntt0Var, int i2, bvy0 bvy0Var, int i3) {
        super(i, ntt0Var, i2);
        this.f183139e = fwy0.m123585t(i3, bvy0Var.f77538v0) ? 1 : 0;
        this.f183140f = this.f77721d.m154633a();
    }

    @Override // p149l.bwy0
    /* JADX INFO: renamed from: a */
    public final int mo104256a() {
        return this.f183139e;
    }

    @Override // p149l.bwy0
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ boolean mo104257b(bwy0 bwy0Var) {
        return false;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final int compareTo(vuy0 vuy0Var) {
        return Integer.compare(this.f183140f, vuy0Var.f183140f);
    }
}
