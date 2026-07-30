package p006l;

import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import l.f30;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class b1e0 extends kxd0 {
    @Override // p006l.kxd0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo11682c(w2e0 w2e0Var, f30<String, String> f30Var) {
        String strReplaceFirst = !TextUtils.isEmpty(w2e0Var.m26161g()) ? w2e0Var.m26161g().replaceFirst("/", "") : "svip";
        return lva.m19043v(w2e0Var.m26156b(), strReplaceFirst, TextUtils.equals("see", strReplaceFirst) ? "p_privilege,assistant_see" : "p_privilege,assistant_guide");
    }
}
