package p149l;

import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class sry0 implements zsy0 {

    /* JADX INFO: renamed from: a */
    public final int f166150a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ vry0 f166151b;

    public sry0(vry0 vry0Var, int i) {
        this.f166151b = vry0Var;
        this.f166150a = i;
    }

    @Override // p149l.zsy0
    /* JADX INFO: renamed from: a */
    public final int mo128011a(long j) {
        return this.f166151b.m199778J(this.f166150a, j);
    }

    @Override // p149l.zsy0
    /* JADX INFO: renamed from: b */
    public final int mo128012b(f0y0 f0y0Var, ylx0 ylx0Var, int i) {
        return this.f166151b.m199777I(this.f166150a, f0y0Var, ylx0Var, i);
    }

    @Override // p149l.zsy0
    public final void zzd() throws IOException {
        this.f166151b.m199785v(this.f166150a);
    }

    @Override // p149l.zsy0
    public final boolean zze() {
        return this.f166151b.m199787x(this.f166150a);
    }
}
