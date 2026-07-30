package p153l;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.core.p058ui.quicklogin.C8984a;
import com.p051p1.mobile.putong.data.NavigationIntent;
import com.p051p1.mobile.putong.data.SchemeKey;
import com.sina.weibo.sdk.constant.WBConstants;
import com.tantanapp.common.utils.NullChecker;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class n5e0 extends o5e0 {
    @Override // p153l.o5e0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo95799c(abe0 abe0Var, z20<String, String> z20Var) {
        if (SchemeKey.web.equals(abe0Var.m96741d())) {
            String strReplaceFirst = TextUtils.isEmpty(abe0Var.m96744g()) ? "" : abe0Var.m96744g().replaceFirst("/", "");
            Map<String, String> mapM96743f = abe0Var.m96743f();
            if (NullChecker.m82486a(mapM96743f) && mapM96743f.containsKey(WBConstants.AUTH_PARAMS_REDIRECT_URL) && "login/oauth".equals(strReplaceFirst)) {
                NavigationIntent navigationIntent = NavigationIntent.get(NavigationIntent.intl_third_pay_quick_login);
                C8984a.INTL_THIRD_QUICK_LOGIN_REDIRECT_URI = Uri.parse(abe0Var.m96740c()).getQueryParameter(WBConstants.AUTH_PARAMS_REDIRECT_URL);
                return xwa.m213316k(abe0Var.m96739b(), navigationIntent);
            }
        }
        return null;
    }
}
