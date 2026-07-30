package p006l;

import android.content.Intent;
import androidx.annotation.Nullable;
import com.p1.mobile.android.app.Act;
import java.util.Map;
import l.f30;
import l.tz00;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class j0e0 extends kxd0 {
    @Override // p006l.kxd0
    /* JADX INFO: renamed from: a */
    public void mo11681a(w2e0 w2e0Var, f30<String, String> f30Var) {
        if (w2e0Var == null || w2e0Var.m26156b() == null || !(w2e0Var.m26156b() instanceof Act)) {
            return;
        }
        Act actM26156b = w2e0Var.m26156b();
        Map<String, String> mapM26160f = w2e0Var.m26160f();
        tz00.l(actM26156b, mapM26160f.get("uid"), mapM26160f.get("msg"), false, (Runnable) null);
    }

    @Override // p006l.kxd0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo11682c(w2e0 w2e0Var, f30<String, String> f30Var) {
        return null;
    }
}
