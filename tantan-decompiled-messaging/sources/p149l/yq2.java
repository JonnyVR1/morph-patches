package p149l;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public abstract class yq2 extends wq4<Boolean, j760<String, sy4.C20071a>> {
    /* JADX INFO: renamed from: f */
    public abstract boolean mo144562f(String str, @Nullable sy4.C20071a c20071a);

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // p149l.wq4
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final Boolean mo159820b(j760<String, sy4.C20071a> j760Var) {
        wq4<R, T> wq4Var;
        boolean zMo144562f = mo144562f(j760Var.f116564a, j760Var.f116565b);
        boolean z = zMo144562f || ((wq4Var = this.f187639a) == 0 ? zMo144562f : ((Boolean) wq4Var.mo159820b((T) j760Var)).booleanValue());
        mo144561e(z);
        return Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: e */
    public void mo144561e(boolean z) {
    }
}
