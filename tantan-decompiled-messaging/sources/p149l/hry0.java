package p149l;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class hry0 implements hwy0 {

    /* JADX INFO: renamed from: a */
    public final hwy0 f109279a;

    /* JADX INFO: renamed from: b */
    public final ntt0 f109280b;

    public hry0(hwy0 hwy0Var, ntt0 ntt0Var) {
        this.f109279a = hwy0Var;
        this.f109280b = ntt0Var;
    }

    @Override // p149l.lwy0
    /* JADX INFO: renamed from: e */
    public final int mo132765e(int i) {
        return this.f109279a.mo132765e(i);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hry0)) {
            return false;
        }
        hry0 hry0Var = (hry0) obj;
        return this.f109279a.equals(hry0Var.f109279a) && this.f109280b.equals(hry0Var.f109280b);
    }

    public final int hashCode() {
        return ((this.f109280b.hashCode() + 527) * 31) + this.f109279a.hashCode();
    }

    @Override // p149l.lwy0
    public final int zza(int i) {
        return this.f109279a.zza(0);
    }

    @Override // p149l.lwy0
    public final int zzc() {
        return this.f109279a.zzc();
    }

    @Override // p149l.lwy0
    public final mhr0 zzd(int i) {
        return this.f109279a.zzd(i);
    }

    @Override // p149l.lwy0
    public final ntt0 zze() {
        return this.f109280b;
    }
}
