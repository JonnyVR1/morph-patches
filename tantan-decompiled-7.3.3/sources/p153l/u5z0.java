package p153l;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class u5z0 {

    /* JADX INFO: renamed from: a */
    public final int f177697a;

    /* JADX INFO: renamed from: b */
    public final dfy0[] f177698b;

    /* JADX INFO: renamed from: c */
    public final n5z0[] f177699c;

    /* JADX INFO: renamed from: d */
    public final uhu0 f177700d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public final Object f177701e;

    public u5z0(dfy0[] dfy0VarArr, n5z0[] n5z0VarArr, uhu0 uhu0Var, @Nullable Object obj) {
        this.f177698b = dfy0VarArr;
        this.f177699c = (n5z0[]) n5z0VarArr.clone();
        this.f177700d = uhu0Var;
        this.f177701e = obj;
        this.f177697a = dfy0VarArr.length;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m194639a(@Nullable u5z0 u5z0Var, int i) {
        return u5z0Var != null && mpw0.m159408f(this.f177698b[i], u5z0Var.f177698b[i]) && mpw0.m159408f(this.f177699c[i], u5z0Var.f177699c[i]);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m194640b(int i) {
        return this.f177698b[i] != null;
    }
}
