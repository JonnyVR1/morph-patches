package p007l;

import androidx.annotation.IntRange;
import l.v9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public abstract class aie0 extends fdb0 implements l0m, j0m {

    /* JADX INFO: renamed from: d */
    public v9j<Boolean> f1854d;

    /* JADX INFO: renamed from: e */
    public int f1855e;

    /* JADX INFO: renamed from: f */
    public f0m f1856f;

    /* JADX INFO: renamed from: g */
    public i0m f1857g;

    /* JADX INFO: renamed from: h */
    public int f1858h = -1;

    @IntRange(from = 0)
    /* JADX INFO: renamed from: A */
    public abstract int mo1406A();

    @Override // p007l.j0m
    /* JADX INFO: renamed from: a */
    public boolean mo1131a() {
        return hdb0.m9293c().m9299h(this, false);
    }

    @Override // p007l.l0m
    /* JADX INFO: renamed from: h */
    public boolean mo1138h(uc80 uc80Var) {
        return hdb0.m9293c().m9299h(this, uc80Var.m11209j());
    }

    @Override // p007l.g0m
    /* JADX INFO: renamed from: i */
    public void mo1139i(f0m f0mVar) {
        this.f1856f = f0mVar;
    }

    /* JADX INFO: renamed from: t */
    public i0m m8550t() {
        return this.f1857g;
    }

    /* JADX INFO: renamed from: u */
    public int mo1414u() {
        return this.f1858h;
    }

    /* JADX INFO: renamed from: v */
    public int m8551v() {
        return this.f1855e;
    }

    /* JADX INFO: renamed from: w */
    public void m8552w(int i) {
        this.f1855e = i;
    }

    /* JADX INFO: renamed from: x */
    public aie0 m8553x(i0m i0mVar) {
        this.f1857g = i0mVar;
        return this;
    }

    /* JADX INFO: renamed from: y */
    public void m8554y(int i) {
        this.f1858h = i;
    }

    /* JADX INFO: renamed from: z */
    public void m8555z(v9j<Boolean> v9jVar) {
        this.f1854d = v9jVar;
    }
}
