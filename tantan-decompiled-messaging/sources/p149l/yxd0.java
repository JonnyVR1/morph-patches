package p149l;

import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.core.data.KnowMyselfShareParams;
import com.p046p1.mobile.putong.core.newui.profile.understandme.BusinessWebViewAct;

/* JADX INFO: loaded from: classes9.dex */
public class yxd0 extends kxd0 {
    @Override // p149l.kxd0
    /* JADX INFO: renamed from: a */
    public void mo94421a(w2e0 w2e0Var, f30<String, String> f30Var) {
        String str = w2e0Var.m201098f().get("url");
        String str2 = w2e0Var.m201098f().get("title");
        String str3 = w2e0Var.m201098f().get(KnowMyselfShareParams.PARAMS_TPID);
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str3) || !TextUtils.isDigitsOnly(str3)) {
            return;
        }
        w2e0Var.m201094b().startActivity(BusinessWebViewAct.m43532X1(w2e0Var.m201094b(), str2, Long.parseLong(str3), str, "webview_load_type_knowme"));
    }

    @Override // p149l.kxd0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo94422c(w2e0 w2e0Var, f30<String, String> f30Var) {
        return null;
    }
}
