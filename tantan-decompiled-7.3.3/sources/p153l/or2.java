package p153l;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public abstract class or2 extends vr4<Boolean, pf60<String, rz4.C19938a>> {
    /* JADX INFO: renamed from: f */
    public abstract boolean mo134680f(String str, @Nullable rz4.C19938a c19938a);

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // p153l.vr4
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final Boolean mo168854b(pf60<String, rz4.C19938a> pf60Var) {
        vr4<R, T> vr4Var;
        boolean zMo134680f = mo134680f(pf60Var.f152156a, pf60Var.f152157b);
        boolean z = zMo134680f || ((vr4Var = this.f185431a) == 0 ? zMo134680f : ((Boolean) vr4Var.mo168854b((T) pf60Var)).booleanValue());
        mo134679e(z);
        return Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: e */
    public void mo134679e(boolean z) {
    }
}
