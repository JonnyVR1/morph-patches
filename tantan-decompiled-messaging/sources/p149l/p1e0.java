package p149l;

import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes9.dex */
public class p1e0 extends kxd0 {
    @Override // p149l.kxd0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo94422c(w2e0 w2e0Var, f30<String, String> f30Var) {
        if (TextUtils.isEmpty(w2e0Var.m201099g()) || !"recharge".equals(w2e0Var.m201099g().replaceFirst("/", ""))) {
            return null;
        }
        return lva.m151870z(w2e0Var.m201094b());
    }
}
