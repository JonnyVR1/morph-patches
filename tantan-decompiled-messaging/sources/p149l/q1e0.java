package p149l;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.api.C4728a;
import com.p046p1.mobile.putong.core.newui.main.NewMainAct;
import com.p046p1.mobile.putong.data.NavigationIntent;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class q1e0 extends kxd0 {
    /* JADX INFO: renamed from: f */
    public static xaj0<String, Map<String, String>, String> m172393f(@NonNull String str) {
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
    public static String m172394g(String str, w2e0 w2e0Var) {
        if (w2e0Var.m201098f().containsKey("url_encoded")) {
            String strDecode = URLDecoder.decode(m172393f(w2e0Var.m201095c()).f191752b.get("url_encoded"));
            if (!TextUtils.isEmpty(strDecode)) {
                return strDecode;
            }
        }
        if (str == null) {
            str = "";
        }
        Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
        for (String str2 : w2e0Var.m201098f().keySet()) {
            if (!"url".equals(str2)) {
                builderBuildUpon.appendQueryParameter(str2, w2e0Var.m201098f().get(str2));
            }
        }
        return builderBuildUpon.build().toString();
    }

    @Override // p149l.kxd0
    /* JADX INFO: renamed from: a */
    public void mo94421a(w2e0 w2e0Var, f30<String, String> f30Var) {
        String str = w2e0Var.m201098f().get("url");
        String str2 = w2e0Var.m201098f().get("title");
        if (str != null && str.contains(C4728a.m31224M(w2e0Var.m201094b().getString(R$string.f18371ao))) && TextUtils.isEmpty(str2)) {
            new ukf0(w2e0Var.m201094b()).m194154a();
        } else {
            super.mo94421a(w2e0Var, f30Var);
        }
    }

    @Override // p149l.kxd0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo94422c(w2e0 w2e0Var, f30<String, String> f30Var) {
        String str;
        boolean zM81303a;
        String str2;
        Intent intentM151840A;
        String string = w2e0Var.m201098f().get("title");
        String strM172394g = m172394g(w2e0Var.m201098f().get("url"), w2e0Var);
        String str3 = w2e0Var.m201098f().get("throughhome");
        String str4 = w2e0Var.m201098f().get("keeporiginpage");
        boolean zEquals = "1".equals(w2e0Var.m201098f().get("hideNavigationBar"));
        boolean zEquals2 = "true".equals(w2e0Var.m201098f().get("hardwareAccelerated"));
        boolean zEquals3 = "1".equals(w2e0Var.m201098f().get("playbackRequiresUserGesture"));
        boolean zEquals4 = "1".equals(w2e0Var.m201098f().get("skipLoading"));
        String str5 = w2e0Var.m201098f().get("webviewColor");
        boolean zEquals5 = "true".equals(w2e0Var.m201098f().get("autofill"));
        Intent intentM151840A2 = null;
        if (TextUtils.isEmpty(strM172394g)) {
            str2 = "webviewColor";
            intentM151840A = intentM151840A2;
        } else {
            try {
                str = strM172394g;
                try {
                    zM81303a = NullChecker.m81303a(Uri.parse(strM172394g).getQueryParameter("_bid"));
                } catch (Exception e) {
                    e = e;
                    CrashHelper.m81296c(e);
                    zM81303a = false;
                }
            } catch (Exception e2) {
                e = e2;
                str = strM172394g;
            }
            if (TextUtils.isEmpty(str3) || !"true".equals(str3)) {
                boolean z = zM81303a;
                String str6 = str;
                if (TextUtils.equals("https://miniprogram.tantanapp.com/view/staticpage/guideUpVersion/index.html", str6) && CoreModule.f17545c.f19549A0.m113988a3()) {
                    lsi0.m151578h(R$string.f18166U);
                    return null;
                }
                if (str6.contains(C4728a.m31224M(w2e0Var.m201094b().getString(R$string.f18371ao))) && TextUtils.isEmpty(string)) {
                    string = CoreModule.f17544b.getResources().getString(R$string.f18340Zn);
                }
                str2 = "webviewColor";
                intentM151840A2 = lva.m151840A(w2e0Var.m201094b(), string, str6, zEquals, zEquals2, z);
                intentM151840A = intentM151840A2;
            } else {
                if (TextUtils.isEmpty(str4) || !"true".equals(str4)) {
                    intentM151840A2 = m172395e(w2e0Var, str, string, zEquals, zEquals2, zM81303a);
                } else if (j2e0.m139444k()) {
                    intentM151840A = lva.m151840A(w2e0Var.m201094b(), string, str, zEquals, zEquals2, zM81303a);
                    intentM151840A.addFlags(268435456);
                    str2 = "webviewColor";
                    str5 = str5;
                } else {
                    intentM151840A2 = m172395e(w2e0Var, str, string, zEquals, zEquals2, zM81303a);
                }
                str2 = "webviewColor";
                intentM151840A = intentM151840A2;
            }
        }
        intentM151840A.putExtra("playbackRequiresUserGesture", zEquals3);
        intentM151840A.putExtra("skipLoading", zEquals4);
        intentM151840A.putExtra(str2, str5);
        intentM151840A.putExtra("hideNotch", "1".equals(w2e0Var.m201098f().get("hideNotch")));
        intentM151840A.putExtra("autofill", zEquals5);
        return intentM151840A;
    }

    /* JADX INFO: renamed from: e */
    public final Intent m172395e(w2e0 w2e0Var, String str, String str2, boolean z, boolean z2, boolean z3) {
        Intent intentM39685I5 = NewMainAct.m39685I5(w2e0Var.m201094b(), NavigationIntent.get("webview"));
        intentM39685I5.putExtra("webview_url", str);
        intentM39685I5.putExtra("webview_title", str2);
        intentM39685I5.putExtra("hideNavigationBar", z);
        intentM39685I5.putExtra("hardwareAccelerated", z2);
        intentM39685I5.putExtra("useMkWebview", z3);
        return intentM39685I5;
    }
}
