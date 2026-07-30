package p153l;

import android.content.Intent;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8927c;

/* JADX INFO: loaded from: classes9.dex */
public class l9e0 extends o5e0 {
    @Override // p153l.o5e0
    /* JADX INFO: renamed from: a */
    public void mo95798a(abe0 abe0Var, z20<String, String> z20Var) {
        if (abe0Var.m96739b() instanceof Act) {
            Act act = (Act) abe0Var.m96739b();
            String str = abe0Var.m96743f().get("from");
            if (str == null || str.isEmpty()) {
                str = "p_suggest_users_home_view,e_upgrade_ultra_promo_card,click";
            }
            C8927c.m54591L0(act, str, null, null, null, null);
        }
    }

    @Override // p153l.o5e0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo95799c(abe0 abe0Var, z20<String, String> z20Var) {
        return null;
    }
}
