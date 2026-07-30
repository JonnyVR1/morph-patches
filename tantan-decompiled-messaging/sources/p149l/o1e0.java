package p149l;

import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.core.p053ui.wallet.TanTanCoinAct;

/* JADX INFO: loaded from: classes9.dex */
public class o1e0 extends kxd0 {
    @Override // p149l.kxd0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo94422c(w2e0 w2e0Var, f30<String, String> f30Var) {
        String strReplaceFirst = !TextUtils.isEmpty(w2e0Var.m201099g()) ? w2e0Var.m201099g().replaceFirst("/", "") : "vip";
        if ("boost".equals(strReplaceFirst) || "boost/buy".equals(strReplaceFirst)) {
            return TanTanCoinAct.m58077X1(w2e0Var.m201094b());
        }
        if (!nkp.m159982a()) {
            return null;
        }
        String strReplaceFirst2 = TextUtils.isEmpty(w2e0Var.m201099g()) ? "vip" : w2e0Var.m201099g().replaceFirst("/", "");
        return lva.m151868x(w2e0Var.m201094b(), strReplaceFirst2, TextUtils.equals("see", strReplaceFirst2) ? "p_privilege,assistant_see" : "p_privilege,assistant_guide");
    }
}
