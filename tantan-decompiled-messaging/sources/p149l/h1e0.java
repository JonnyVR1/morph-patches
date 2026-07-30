package p149l;

import android.content.Intent;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8764c;

/* JADX INFO: loaded from: classes9.dex */
public class h1e0 extends kxd0 {
    @Override // p149l.kxd0
    /* JADX INFO: renamed from: a */
    public void mo94421a(w2e0 w2e0Var, f30<String, String> f30Var) {
        if (w2e0Var.m201094b() instanceof Act) {
            Act act = (Act) w2e0Var.m201094b();
            String str = w2e0Var.m201098f().get("from");
            if (str == null || str.isEmpty()) {
                str = "p_suggest_users_home_view,e_upgrade_ultra_promo_card,click";
            }
            C8764c.m53408L0(act, str, null, null, null, null);
        }
    }

    @Override // p149l.kxd0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo94422c(w2e0 w2e0Var, f30<String, String> f30Var) {
        return null;
    }
}
