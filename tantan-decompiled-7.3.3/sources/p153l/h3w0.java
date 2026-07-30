package p153l;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class h3w0 implements y3w0 {

    /* JADX INFO: renamed from: a */
    @Nullable
    public p5u0 f107699a;

    @Override // p153l.y3w0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ hpr mo119326a(z3w0 z3w0Var, x3w0 x3w0Var, @Nullable Object obj) {
        return m133523c(z3w0Var, x3w0Var, null);
    }

    @Override // p153l.y3w0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final synchronized p5u0 zzd() {
        return this.f107699a;
    }

    /* JADX INFO: renamed from: c */
    public final synchronized hpr m133523c(z3w0 z3w0Var, x3w0 x3w0Var, @Nullable p5u0 p5u0Var) {
        z0u0 z0u0VarZzb;
        try {
            if (p5u0Var != null) {
                this.f107699a = p5u0Var;
            } else {
                this.f107699a = (p5u0) x3w0Var.mo184819a(z3w0Var.f202868b).zzh();
            }
            z0u0VarZzb = this.f107699a.zzb();
        } catch (Throwable th) {
            throw th;
        }
        return z0u0VarZzb.m218173i(z0u0VarZzb.m218174j());
    }
}
