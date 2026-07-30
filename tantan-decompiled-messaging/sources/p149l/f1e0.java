package p149l;

import android.content.Intent;
import androidx.annotation.Nullable;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes9.dex */
public class f1e0 extends kxd0 {
    @Override // p149l.kxd0
    /* JADX INFO: renamed from: a */
    public void mo94421a(w2e0 w2e0Var, f30<String, String> f30Var) {
        if (w2e0Var.m201098f().containsKey("path")) {
            String strM147736b = kxd0.m147736b(w2e0Var.m201098f(), "path");
            if (("privilege/vip".equals(strM147736b) || "privilege/see".equals(strM147736b)) && NullChecker.m81303a(f30Var)) {
                f30Var.call(w2e0Var.m201098f().get("callback"), "permission denied");
            }
        }
    }

    @Override // p149l.kxd0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo94422c(w2e0 w2e0Var, f30<String, String> f30Var) {
        return null;
    }
}
