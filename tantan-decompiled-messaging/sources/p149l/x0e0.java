package p149l;

import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes9.dex */
public class x0e0 extends kxd0 {
    @Override // p149l.kxd0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo94422c(w2e0 w2e0Var, f30<String, String> f30Var) {
        if (TextUtils.isEmpty(w2e0Var.m201098f().get("identifier")) || TextUtils.isEmpty(w2e0Var.m201098f().get("id"))) {
            return null;
        }
        Intent intentM151853i = lva.m151853i(w2e0Var.m201094b(), w2e0Var.m201095c());
        intentM151853i.putExtra("oms_id", w2e0Var.m201098f().get("id"));
        intentM151853i.putExtra("oms_identifier", w2e0Var.m201098f().get("identifier"));
        return intentM151853i;
    }

    @Override // p149l.kxd0
    /* JADX INFO: renamed from: a */
    public void mo94421a(w2e0 w2e0Var, f30<String, String> f30Var) {
    }
}
