package p153l;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class i3w0 implements y3w0 {

    /* JADX INFO: renamed from: a */
    public final y3w0 f112790a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public p5u0 f112791b;

    public i3w0(y3w0 y3w0Var) {
        this.f112790a = y3w0Var;
    }

    @Override // p153l.y3w0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ hpr mo119326a(z3w0 z3w0Var, x3w0 x3w0Var, @Nullable Object obj) {
        return m138346c(z3w0Var, x3w0Var, null);
    }

    @Override // p153l.y3w0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final synchronized p5u0 zzd() {
        return this.f112791b;
    }

    /* JADX INFO: renamed from: c */
    public final synchronized hpr m138346c(z3w0 z3w0Var, x3w0 x3w0Var, @Nullable p5u0 p5u0Var) {
        this.f112791b = p5u0Var;
        if (z3w0Var.f202867a == null) {
            return ((h3w0) this.f112790a).m133523c(z3w0Var, x3w0Var, p5u0Var);
        }
        z0u0 z0u0VarZzb = p5u0Var.zzb();
        return z0u0VarZzb.m218173i(z0u0VarZzb.m218175k(pvw0.m173981h(z3w0Var.f202867a)));
    }
}
