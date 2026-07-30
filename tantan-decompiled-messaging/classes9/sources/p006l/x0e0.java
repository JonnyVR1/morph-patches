package p006l;

import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import l.f30;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class x0e0 extends kxd0 {
    @Override // p006l.kxd0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo11682c(w2e0 w2e0Var, f30<String, String> f30Var) {
        if (TextUtils.isEmpty(w2e0Var.m26160f().get("identifier")) || TextUtils.isEmpty(w2e0Var.m26160f().get("id"))) {
            return null;
        }
        Intent intentM19030i = lva.m19030i(w2e0Var.m26156b(), w2e0Var.m26157c());
        intentM19030i.putExtra("oms_id", w2e0Var.m26160f().get("id"));
        intentM19030i.putExtra("oms_identifier", w2e0Var.m26160f().get("identifier"));
        return intentM19030i;
    }

    @Override // p006l.kxd0
    /* JADX INFO: renamed from: a */
    public void mo11681a(w2e0 w2e0Var, f30<String, String> f30Var) {
    }
}
