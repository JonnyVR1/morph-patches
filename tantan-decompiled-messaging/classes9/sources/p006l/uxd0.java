package p006l;

import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.util.Map;
import l.f30;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class uxd0 extends kxd0 {
    @Override // p006l.kxd0
    /* JADX INFO: renamed from: a */
    public void mo11681a(w2e0 w2e0Var, f30<String, String> f30Var) {
        if (w2e0Var == null || w2e0Var.m26156b() == null) {
            return;
        }
        Map<String, String> mapM26160f = w2e0Var.m26160f();
        String str = mapM26160f.get("uid");
        String str2 = mapM26160f.get("autoSendMsg");
        String str3 = w2e0Var.m26160f().get("appendMsg");
        boolean z = Boolean.parseBoolean(w2e0Var.m26160f().get("showKeyboard"));
        if (TextUtils.isEmpty(str)) {
            return;
        }
        w2e0Var.m26156b().startActivity(lva.m19034m(w2e0Var.m26156b(), 1, str, z, str2, str3));
    }

    @Override // p006l.kxd0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo11682c(w2e0 w2e0Var, f30<String, String> f30Var) {
        return null;
    }
}
