package p153l;

import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.core.p058ui.wallet.TanTanCoinAct;

/* JADX INFO: loaded from: classes9.dex */
public class s9e0 extends o5e0 {
    @Override // p153l.o5e0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo95799c(abe0 abe0Var, z20<String, String> z20Var) {
        String strReplaceFirst = !TextUtils.isEmpty(abe0Var.m96744g()) ? abe0Var.m96744g().replaceFirst("/", "") : "vip";
        if ("boost".equals(strReplaceFirst) || "boost/buy".equals(strReplaceFirst)) {
            return TanTanCoinAct.m59260Y1(abe0Var.m96739b());
        }
        if (!nmp.m163832a()) {
            return null;
        }
        String strReplaceFirst2 = TextUtils.isEmpty(abe0Var.m96744g()) ? "vip" : abe0Var.m96744g().replaceFirst("/", "");
        return xwa.m213329x(abe0Var.m96739b(), strReplaceFirst2, TextUtils.equals("see", strReplaceFirst2) ? "p_privilege,assistant_see" : "p_privilege,assistant_guide");
    }
}
