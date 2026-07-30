package p149l;

import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes9.dex */
public class b1e0 extends kxd0 {
    @Override // p149l.kxd0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo94422c(w2e0 w2e0Var, f30<String, String> f30Var) {
        String strReplaceFirst = !TextUtils.isEmpty(w2e0Var.m201099g()) ? w2e0Var.m201099g().replaceFirst("/", "") : "svip";
        return lva.m151866v(w2e0Var.m201094b(), strReplaceFirst, TextUtils.equals("see", strReplaceFirst) ? "p_privilege,assistant_see" : "p_privilege,assistant_guide");
    }
}
