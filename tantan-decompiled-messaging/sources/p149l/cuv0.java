package p149l;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class cuv0 implements suv0 {

    /* JADX INFO: renamed from: a */
    public final suv0 f82596a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public jwt0 f82597b;

    public cuv0(suv0 suv0Var) {
        this.f82596a = suv0Var;
    }

    @Override // p149l.suv0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ gnr mo104000a(tuv0 tuv0Var, ruv0 ruv0Var, @Nullable Object obj) {
        return m108813c(tuv0Var, ruv0Var, null);
    }

    @Override // p149l.suv0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final synchronized jwt0 zzd() {
        return this.f82597b;
    }

    /* JADX INFO: renamed from: c */
    public final synchronized gnr m108813c(tuv0 tuv0Var, ruv0 ruv0Var, @Nullable jwt0 jwt0Var) {
        this.f82597b = jwt0Var;
        if (tuv0Var.f172225a == null) {
            return ((buv0) this.f82596a).m104002c(tuv0Var, ruv0Var, jwt0Var);
        }
        trt0 trt0VarZzb = jwt0Var.zzb();
        return trt0VarZzb.m190444i(trt0VarZzb.m190446k(jmw0.m142235h(tuv0Var.f172225a)));
    }
}
