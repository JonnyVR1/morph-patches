package p149l;

import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class gty0 implements zsy0 {

    /* JADX INFO: renamed from: a */
    public final zsy0 f104362a;

    /* JADX INFO: renamed from: b */
    public final long f104363b;

    public gty0(zsy0 zsy0Var, long j) {
        this.f104362a = zsy0Var;
        this.f104363b = j;
    }

    @Override // p149l.zsy0
    /* JADX INFO: renamed from: a */
    public final int mo128011a(long j) {
        return this.f104362a.mo128011a(j - this.f104363b);
    }

    @Override // p149l.zsy0
    /* JADX INFO: renamed from: b */
    public final int mo128012b(f0y0 f0y0Var, ylx0 ylx0Var, int i) {
        int iMo128012b = this.f104362a.mo128012b(f0y0Var, ylx0Var, i);
        if (iMo128012b != -4) {
            return iMo128012b;
        }
        ylx0Var.f198947f += this.f104363b;
        return -4;
    }

    /* JADX INFO: renamed from: c */
    public final zsy0 m128013c() {
        return this.f104362a;
    }

    @Override // p149l.zsy0
    public final void zzd() throws IOException {
        this.f104362a.zzd();
    }

    @Override // p149l.zsy0
    public final boolean zze() {
        return this.f104362a.zze();
    }
}
