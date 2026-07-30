package p006l;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.p004ui.quicklogin.C0257a;
import com.p1.mobile.putong.data.NavigationIntent;
import com.tantanapp.common.utils.NullChecker;
import java.util.Map;
import l.f30;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class jxd0 extends kxd0 {
    @Override // p006l.kxd0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo11682c(w2e0 w2e0Var, f30<String, String> f30Var) {
        if ("web".equals(w2e0Var.m26158d())) {
            String strReplaceFirst = TextUtils.isEmpty(w2e0Var.m26161g()) ? "" : w2e0Var.m26161g().replaceFirst("/", "");
            Map<String, String> mapM26160f = w2e0Var.m26160f();
            if (NullChecker.a(mapM26160f) && mapM26160f.containsKey("redirect_uri") && "login/oauth".equals(strReplaceFirst)) {
                NavigationIntent navigationIntent = NavigationIntent.get("intl_third_pay_quick_login");
                C0257a.INTL_THIRD_QUICK_LOGIN_REDIRECT_URI = Uri.parse(w2e0Var.m26157c()).getQueryParameter("redirect_uri");
                return lva.m19032k(w2e0Var.m26156b(), navigationIntent);
            }
        }
        return null;
    }
}
