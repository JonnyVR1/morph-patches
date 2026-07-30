package p006l;

import android.content.Intent;
import androidx.annotation.Nullable;
import com.tantanapp.common.utils.NullChecker;
import l.f30;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class f1e0 extends kxd0 {
    @Override // p006l.kxd0
    /* JADX INFO: renamed from: a */
    public void mo11681a(w2e0 w2e0Var, f30<String, String> f30Var) {
        if (w2e0Var.m26160f().containsKey("path")) {
            String strM18317b = kxd0.m18317b(w2e0Var.m26160f(), "path");
            if (("privilege/vip".equals(strM18317b) || "privilege/see".equals(strM18317b)) && NullChecker.a(f30Var)) {
                f30Var.call(w2e0Var.m26160f().get("callback"), "permission denied");
            }
        }
    }

    @Override // p006l.kxd0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo11682c(w2e0 w2e0Var, f30<String, String> f30Var) {
        return null;
    }
}
