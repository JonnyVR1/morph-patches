package p149l;

import androidx.annotation.IntRange;

/* JADX INFO: loaded from: classes8.dex */
public abstract class aie0 extends fdb0 implements l0m, j0m {

    /* JADX INFO: renamed from: d */
    public v9j<Boolean> f69975d;

    /* JADX INFO: renamed from: e */
    public int f69976e;

    /* JADX INFO: renamed from: f */
    public f0m f69977f;

    /* JADX INFO: renamed from: g */
    public i0m f69978g;

    /* JADX INFO: renamed from: h */
    public int f69979h = -1;

    @IntRange(from = 0)
    /* JADX INFO: renamed from: A */
    public abstract int mo21134A();

    @Override // p149l.j0m
    /* JADX INFO: renamed from: a */
    public boolean mo20860a() {
        return hdb0.m130575c().m130581h(this, false);
    }

    @Override // p149l.l0m
    /* JADX INFO: renamed from: h */
    public boolean mo20867h(uc80 uc80Var) {
        return hdb0.m130575c().m130581h(this, uc80Var.m193001j());
    }

    @Override // p149l.g0m
    /* JADX INFO: renamed from: i */
    public void mo20868i(f0m f0mVar) {
        this.f69977f = f0mVar;
    }

    /* JADX INFO: renamed from: t */
    public i0m m96805t() {
        return this.f69978g;
    }

    /* JADX INFO: renamed from: u */
    public int mo21142u() {
        return this.f69979h;
    }

    /* JADX INFO: renamed from: v */
    public int m96806v() {
        return this.f69976e;
    }

    /* JADX INFO: renamed from: w */
    public void m96807w(int i) {
        this.f69976e = i;
    }

    /* JADX INFO: renamed from: x */
    public aie0 m96808x(i0m i0mVar) {
        this.f69978g = i0mVar;
        return this;
    }

    /* JADX INFO: renamed from: y */
    public void m96809y(int i) {
        this.f69979h = i;
    }

    /* JADX INFO: renamed from: z */
    public void m96810z(v9j<Boolean> v9jVar) {
        this.f69975d = v9jVar;
    }
}
