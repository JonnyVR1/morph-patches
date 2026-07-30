package p149l;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.core.p053ui.quicklogin.C8821a;
import com.p046p1.mobile.putong.data.NavigationIntent;
import com.p046p1.mobile.putong.data.SchemeKey;
import com.sina.weibo.sdk.constant.WBConstants;
import com.tantanapp.common.utils.NullChecker;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class jxd0 extends kxd0 {
    @Override // p149l.kxd0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo94422c(w2e0 w2e0Var, f30<String, String> f30Var) {
        if (SchemeKey.web.equals(w2e0Var.m201096d())) {
            String strReplaceFirst = TextUtils.isEmpty(w2e0Var.m201099g()) ? "" : w2e0Var.m201099g().replaceFirst("/", "");
            Map<String, String> mapM201098f = w2e0Var.m201098f();
            if (NullChecker.m81303a(mapM201098f) && mapM201098f.containsKey(WBConstants.AUTH_PARAMS_REDIRECT_URL) && "login/oauth".equals(strReplaceFirst)) {
                NavigationIntent navigationIntent = NavigationIntent.get(NavigationIntent.intl_third_pay_quick_login);
                C8821a.INTL_THIRD_QUICK_LOGIN_REDIRECT_URI = Uri.parse(w2e0Var.m201095c()).getQueryParameter(WBConstants.AUTH_PARAMS_REDIRECT_URL);
                return lva.m151855k(w2e0Var.m201094b(), navigationIntent);
            }
        }
        return null;
    }
}
