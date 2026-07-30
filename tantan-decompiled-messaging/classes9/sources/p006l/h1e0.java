package p006l;

import android.content.Intent;
import androidx.annotation.Nullable;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.ui.purchase.c;
import l.d30;
import l.e30;
import l.f30;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class h1e0 extends kxd0 {
    @Override // p006l.kxd0
    /* JADX INFO: renamed from: a */
    public void mo11681a(w2e0 w2e0Var, f30<String, String> f30Var) {
        if (w2e0Var.m26156b() instanceof Act) {
            Act actM26156b = w2e0Var.m26156b();
            String str = w2e0Var.m26160f().get("from");
            if (str == null || str.isEmpty()) {
                str = "p_suggest_users_home_view,e_upgrade_ultra_promo_card,click";
            }
            c.L0(actM26156b, str, (e30) null, (d30) null, (d30) null, (Privilege) null);
        }
    }

    @Override // p006l.kxd0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo11682c(w2e0 w2e0Var, f30<String, String> f30Var) {
        return null;
    }
}
