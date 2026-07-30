package p006l;

import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import l.f30;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class p1e0 extends kxd0 {
    @Override // p006l.kxd0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo11682c(w2e0 w2e0Var, f30<String, String> f30Var) {
        if (TextUtils.isEmpty(w2e0Var.m26161g()) || !"recharge".equals(w2e0Var.m26161g().replaceFirst("/", ""))) {
            return null;
        }
        return lva.m19047z(w2e0Var.m26156b());
    }
}
