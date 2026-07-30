package p153l;

import androidx.annotation.IntRange;

/* JADX INFO: loaded from: classes8.dex */
public abstract class fqe0 extends jlb0 implements f3m, d3m {

    /* JADX INFO: renamed from: d */
    public pcj<Boolean> f100279d;

    /* JADX INFO: renamed from: e */
    public int f100280e;

    /* JADX INFO: renamed from: f */
    public z2m f100281f;

    /* JADX INFO: renamed from: g */
    public c3m f100282g;

    /* JADX INFO: renamed from: h */
    public int f100283h = -1;

    @IntRange(from = 0)
    /* JADX INFO: renamed from: A */
    public abstract int mo22133A();

    @Override // p153l.d3m
    /* JADX INFO: renamed from: a */
    public boolean mo21859a() {
        return llb0.m154703c().m154709h(this, false);
    }

    @Override // p153l.f3m
    /* JADX INFO: renamed from: h */
    public boolean mo21866h(al80 al80Var) {
        return llb0.m154703c().m154709h(this, al80Var.m98647j());
    }

    @Override // p153l.a3m
    /* JADX INFO: renamed from: i */
    public void mo21867i(z2m z2mVar) {
        this.f100281f = z2mVar;
    }

    /* JADX INFO: renamed from: t */
    public c3m m126742t() {
        return this.f100282g;
    }

    /* JADX INFO: renamed from: u */
    public int mo22141u() {
        return this.f100283h;
    }

    /* JADX INFO: renamed from: v */
    public int m126743v() {
        return this.f100280e;
    }

    /* JADX INFO: renamed from: w */
    public void m126744w(int i) {
        this.f100280e = i;
    }

    /* JADX INFO: renamed from: x */
    public fqe0 m126745x(c3m c3mVar) {
        this.f100282g = c3mVar;
        return this;
    }

    /* JADX INFO: renamed from: y */
    public void m126746y(int i) {
        this.f100283h = i;
    }

    /* JADX INFO: renamed from: z */
    public void m126747z(pcj<Boolean> pcjVar) {
        this.f100279d = pcjVar;
    }
}
