package p153l;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class h1z0 implements w5z0 {

    /* JADX INFO: renamed from: a */
    public long f107508a;

    /* JADX INFO: renamed from: b */
    public long f107509b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public v5z0 f107510c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public h1z0 f107511d;

    public h1z0(long j, int i) {
        m133359c(j, 65536);
    }

    /* JADX INFO: renamed from: a */
    public final int m133357a(long j) {
        long j2 = j - this.f107508a;
        int i = this.f107510c.f182591b;
        return (int) j2;
    }

    /* JADX INFO: renamed from: b */
    public final h1z0 m133358b() {
        this.f107510c = null;
        h1z0 h1z0Var = this.f107511d;
        this.f107511d = null;
        return h1z0Var;
    }

    /* JADX INFO: renamed from: c */
    public final void m133359c(long j, int i) {
        lev0.m153958f(this.f107510c == null);
        this.f107508a = j;
        this.f107509b = j + 65536;
    }

    @Override // p153l.w5z0
    public final v5z0 zzc() {
        v5z0 v5z0Var = this.f107510c;
        v5z0Var.getClass();
        return v5z0Var;
    }

    @Override // p153l.w5z0
    @Nullable
    public final w5z0 zzd() {
        h1z0 h1z0Var = this.f107511d;
        if (h1z0Var == null || h1z0Var.f107510c == null) {
            return null;
        }
        return h1z0Var;
    }
}
