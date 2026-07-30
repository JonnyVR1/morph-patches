package p153l;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class n0z0 implements n5z0 {

    /* JADX INFO: renamed from: a */
    public final n5z0 f139690a;

    /* JADX INFO: renamed from: b */
    public final t2u0 f139691b;

    public n0z0(n5z0 n5z0Var, t2u0 t2u0Var) {
        this.f139690a = n5z0Var;
        this.f139691b = t2u0Var;
    }

    @Override // p153l.r5z0
    /* JADX INFO: renamed from: e */
    public final int mo161038e(int i) {
        return this.f139690a.mo161038e(i);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0z0)) {
            return false;
        }
        n0z0 n0z0Var = (n0z0) obj;
        return this.f139690a.equals(n0z0Var.f139690a) && this.f139691b.equals(n0z0Var.f139691b);
    }

    public final int hashCode() {
        return ((this.f139691b.hashCode() + 527) * 31) + this.f139690a.hashCode();
    }

    @Override // p153l.r5z0
    public final int zza(int i) {
        return this.f139690a.zza(0);
    }

    @Override // p153l.r5z0
    public final int zzc() {
        return this.f139690a.zzc();
    }

    @Override // p153l.r5z0
    public final sqr0 zzd(int i) {
        return this.f139690a.zzd(i);
    }

    @Override // p153l.r5z0
    public final t2u0 zze() {
        return this.f139691b;
    }
}
