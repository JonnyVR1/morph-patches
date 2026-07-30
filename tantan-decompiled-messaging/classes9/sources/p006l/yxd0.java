package p006l;

import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p1.mobile.putong.core.newui.profile.understandme.BusinessWebViewAct;
import l.f30;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class yxd0 extends kxd0 {
    @Override // p006l.kxd0
    /* JADX INFO: renamed from: a */
    public void mo11681a(w2e0 w2e0Var, f30<String, String> f30Var) {
        String str = w2e0Var.m26160f().get("url");
        String str2 = w2e0Var.m26160f().get("title");
        String str3 = w2e0Var.m26160f().get("tpid");
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str3) || !TextUtils.isDigitsOnly(str3)) {
            return;
        }
        w2e0Var.m26156b().startActivity(BusinessWebViewAct.X1(w2e0Var.m26156b(), str2, Long.parseLong(str3), str, "webview_load_type_knowme"));
    }

    @Override // p006l.kxd0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo11682c(w2e0 w2e0Var, f30<String, String> f30Var) {
        return null;
    }
}
