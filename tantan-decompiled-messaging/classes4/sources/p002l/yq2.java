package p002l;

import androidx.annotation.Nullable;
import l.j760;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public abstract class yq2 extends wq4<Boolean, j760<String, sy4.C0832a>> {
    /* JADX INFO: renamed from: f */
    public abstract boolean mo16500f(String str, @Nullable sy4.C0832a c0832a);

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // p002l.wq4
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final Boolean mo18825b(j760<String, sy4.C0832a> j760Var) {
        wq4<R, T> wq4Var;
        boolean zMo16500f = mo16500f((String) j760Var.a, (sy4.C0832a) j760Var.b);
        boolean z = zMo16500f || ((wq4Var = this.f21908a) == 0 ? zMo16500f : ((Boolean) wq4Var.mo18825b((T) j760Var)).booleanValue());
        mo16499e(z);
        return Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: e */
    public void mo16499e(boolean z) {
    }
}
