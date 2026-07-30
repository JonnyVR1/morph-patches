package p149l;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class buv0 implements suv0 {

    /* JADX INFO: renamed from: a */
    @Nullable
    public jwt0 f77373a;

    @Override // p149l.suv0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ gnr mo104000a(tuv0 tuv0Var, ruv0 ruv0Var, @Nullable Object obj) {
        return m104002c(tuv0Var, ruv0Var, null);
    }

    @Override // p149l.suv0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final synchronized jwt0 zzd() {
        return this.f77373a;
    }

    /* JADX INFO: renamed from: c */
    public final synchronized gnr m104002c(tuv0 tuv0Var, ruv0 ruv0Var, @Nullable jwt0 jwt0Var) {
        trt0 trt0VarZzb;
        try {
            if (jwt0Var != null) {
                this.f77373a = jwt0Var;
            } else {
                this.f77373a = (jwt0) ruv0Var.mo156774a(tuv0Var.f172226b).zzh();
            }
            trt0VarZzb = this.f77373a.zzb();
        } catch (Throwable th) {
            throw th;
        }
        return trt0VarZzb.m190444i(trt0VarZzb.m190445j());
    }
}
