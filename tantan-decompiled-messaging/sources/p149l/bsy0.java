package p149l;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class bsy0 implements qwy0 {

    /* JADX INFO: renamed from: a */
    public long f77147a;

    /* JADX INFO: renamed from: b */
    public long f77148b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public pwy0 f77149c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public bsy0 f77150d;

    public bsy0(long j, int i) {
        m103727c(j, 65536);
    }

    /* JADX INFO: renamed from: a */
    public final int m103725a(long j) {
        long j2 = j - this.f77147a;
        int i = this.f77149c.f151611b;
        return (int) j2;
    }

    /* JADX INFO: renamed from: b */
    public final bsy0 m103726b() {
        this.f77149c = null;
        bsy0 bsy0Var = this.f77150d;
        this.f77150d = null;
        return bsy0Var;
    }

    /* JADX INFO: renamed from: c */
    public final void m103727c(long j, int i) {
        f5v0.m119535f(this.f77149c == null);
        this.f77147a = j;
        this.f77148b = j + 65536;
    }

    @Override // p149l.qwy0
    public final pwy0 zzc() {
        pwy0 pwy0Var = this.f77149c;
        pwy0Var.getClass();
        return pwy0Var;
    }

    @Override // p149l.qwy0
    @Nullable
    public final qwy0 zzd() {
        bsy0 bsy0Var = this.f77150d;
        if (bsy0Var == null || bsy0Var.f77149c == null) {
            return null;
        }
        return bsy0Var;
    }
}
