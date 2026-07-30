package p006l;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.R$string;
import com.p000p1.mobile.putong.core.api.C0154a;
import com.p1.mobile.putong.core.newui.main.NewMainAct;
import com.p1.mobile.putong.data.NavigationIntent;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Map;
import l.f30;
import l.lsi0;
import l.ukf0;
import l.xaj0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class q1e0 extends kxd0 {
    /* JADX INFO: renamed from: f */
    public static xaj0<String, Map<String, String>, String> m21916f(@NonNull String str) {
        Uri uri = Uri.parse(str);
        String host = uri.getHost();
        String path = uri.getPath();
        if (TextUtils.isEmpty(host)) {
            return null;
        }
        HashMap map = new HashMap();
        for (String str2 : uri.getQueryParameterNames()) {
            map.put(str2, uri.getQueryParameter(str2));
        }
        String fragment = uri.getFragment();
        if (!TextUtils.isEmpty(fragment) && map.containsKey("url")) {
            map.put("url", ((String) map.get("url")) + "#" + fragment);
        }
        return new xaj0<>(host, map, path);
    }

    /* JADX INFO: renamed from: g */
    public static String m21917g(String str, w2e0 w2e0Var) {
        if (w2e0Var.m26160f().containsKey("url_encoded")) {
            String strDecode = URLDecoder.decode((String) ((Map) m21916f(w2e0Var.m26157c()).b).get("url_encoded"));
            if (!TextUtils.isEmpty(strDecode)) {
                return strDecode;
            }
        }
        if (str == null) {
            str = "";
        }
        Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
        for (String str2 : w2e0Var.m26160f().keySet()) {
            if (!"url".equals(str2)) {
                builderBuildUpon.appendQueryParameter(str2, w2e0Var.m26160f().get(str2));
            }
        }
        return builderBuildUpon.build().toString();
    }

    @Override // p006l.kxd0
    /* JADX INFO: renamed from: a */
    public void mo11681a(w2e0 w2e0Var, f30<String, String> f30Var) {
        String str = w2e0Var.m26160f().get("url");
        String str2 = w2e0Var.m26160f().get("title");
        if (str != null && str.contains(C0154a.m3154M(w2e0Var.m26156b().getString(R$string.f2360ao))) && TextUtils.isEmpty(str2)) {
            new ukf0(w2e0Var.m26156b()).a();
        } else {
            super.mo11681a(w2e0Var, f30Var);
        }
    }

    @Override // p006l.kxd0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo11682c(w2e0 w2e0Var, f30<String, String> f30Var) {
        String str;
        boolean zA;
        String str2;
        Intent intentM19017A;
        String string = w2e0Var.m26160f().get("title");
        String strM21917g = m21917g(w2e0Var.m26160f().get("url"), w2e0Var);
        String str3 = w2e0Var.m26160f().get("throughhome");
        String str4 = w2e0Var.m26160f().get("keeporiginpage");
        boolean zEquals = "1".equals(w2e0Var.m26160f().get("hideNavigationBar"));
        boolean zEquals2 = "true".equals(w2e0Var.m26160f().get("hardwareAccelerated"));
        boolean zEquals3 = "1".equals(w2e0Var.m26160f().get("playbackRequiresUserGesture"));
        boolean zEquals4 = "1".equals(w2e0Var.m26160f().get("skipLoading"));
        String str5 = w2e0Var.m26160f().get("webviewColor");
        boolean zEquals5 = "true".equals(w2e0Var.m26160f().get("autofill"));
        Intent intentM19017A2 = null;
        if (TextUtils.isEmpty(strM21917g)) {
            str2 = "webviewColor";
            intentM19017A = intentM19017A2;
        } else {
            try {
                str = strM21917g;
                try {
                    zA = NullChecker.a(Uri.parse(strM21917g).getQueryParameter("_bid"));
                } catch (Exception e) {
                    e = e;
                    CrashHelper.c(e);
                    zA = false;
                }
            } catch (Exception e2) {
                e = e2;
                str = strM21917g;
            }
            if (TextUtils.isEmpty(str3) || !"true".equals(str3)) {
                boolean z = zA;
                String str6 = str;
                if (TextUtils.equals("https://miniprogram.tantanapp.com/view/staticpage/guideUpVersion/index.html", str6) && CoreModule.f1534c.f3538A0.m14310a3()) {
                    lsi0.h(R$string.f2155U);
                    return null;
                }
                if (str6.contains(C0154a.m3154M(w2e0Var.m26156b().getString(R$string.f2360ao))) && TextUtils.isEmpty(string)) {
                    string = CoreModule.f1533b.getResources().getString(R$string.f2329Zn);
                }
                str2 = "webviewColor";
                intentM19017A2 = lva.m19017A(w2e0Var.m26156b(), string, str6, zEquals, zEquals2, z);
                intentM19017A = intentM19017A2;
            } else {
                if (TextUtils.isEmpty(str4) || !"true".equals(str4)) {
                    intentM19017A2 = m21918e(w2e0Var, str, string, zEquals, zEquals2, zA);
                } else if (j2e0.m17246k()) {
                    intentM19017A = lva.m19017A(w2e0Var.m26156b(), string, str, zEquals, zEquals2, zA);
                    intentM19017A.addFlags(268435456);
                    str2 = "webviewColor";
                    str5 = str5;
                } else {
                    intentM19017A2 = m21918e(w2e0Var, str, string, zEquals, zEquals2, zA);
                }
                str2 = "webviewColor";
                intentM19017A = intentM19017A2;
            }
        }
        intentM19017A.putExtra("playbackRequiresUserGesture", zEquals3);
        intentM19017A.putExtra("skipLoading", zEquals4);
        intentM19017A.putExtra(str2, str5);
        intentM19017A.putExtra("hideNotch", "1".equals(w2e0Var.m26160f().get("hideNotch")));
        intentM19017A.putExtra("autofill", zEquals5);
        return intentM19017A;
    }

    /* JADX INFO: renamed from: e */
    public final Intent m21918e(w2e0 w2e0Var, String str, String str2, boolean z, boolean z2, boolean z3) {
        Intent intentI5 = NewMainAct.I5(w2e0Var.m26156b(), NavigationIntent.get("webview"));
        intentI5.putExtra("webview_url", str);
        intentI5.putExtra("webview_title", str2);
        intentI5.putExtra("hideNavigationBar", z);
        intentI5.putExtra("hardwareAccelerated", z2);
        intentI5.putExtra("useMkWebview", z3);
        return intentI5;
    }
}
