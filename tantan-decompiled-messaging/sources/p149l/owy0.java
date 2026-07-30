package p149l;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class owy0 {

    /* JADX INFO: renamed from: a */
    public final int f146093a;

    /* JADX INFO: renamed from: b */
    public final x5y0[] f146094b;

    /* JADX INFO: renamed from: c */
    public final hwy0[] f146095c;

    /* JADX INFO: renamed from: d */
    public final o8u0 f146096d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public final Object f146097e;

    public owy0(x5y0[] x5y0VarArr, hwy0[] hwy0VarArr, o8u0 o8u0Var, @Nullable Object obj) {
        this.f146094b = x5y0VarArr;
        this.f146095c = (hwy0[]) hwy0VarArr.clone();
        this.f146096d = o8u0Var;
        this.f146097e = obj;
        this.f146093a = x5y0VarArr.length;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m166452a(@Nullable owy0 owy0Var, int i) {
        return owy0Var != null && ggw0.m126064f(this.f146094b[i], owy0Var.f146094b[i]) && ggw0.m126064f(this.f146095c[i], owy0Var.f146095c[i]);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m166453b(int i) {
        return this.f146094b[i] != null;
    }
}
