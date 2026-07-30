package p006l;

import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.p004ui.wallet.TanTanCoinAct;
import l.f30;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class o1e0 extends kxd0 {
    @Override // p006l.kxd0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo11682c(w2e0 w2e0Var, f30<String, String> f30Var) {
        String strReplaceFirst = !TextUtils.isEmpty(w2e0Var.m26161g()) ? w2e0Var.m26161g().replaceFirst("/", "") : "vip";
        if ("boost".equals(strReplaceFirst) || "boost/buy".equals(strReplaceFirst)) {
            return TanTanCoinAct.m11602X1(w2e0Var.m26156b());
        }
        if (!nkp.m20155a()) {
            return null;
        }
        String strReplaceFirst2 = TextUtils.isEmpty(w2e0Var.m26161g()) ? "vip" : w2e0Var.m26161g().replaceFirst("/", "");
        return lva.m19045x(w2e0Var.m26156b(), strReplaceFirst2, TextUtils.equals("see", strReplaceFirst2) ? "p_privilege,assistant_see" : "p_privilege,assistant_guide");
    }
}
