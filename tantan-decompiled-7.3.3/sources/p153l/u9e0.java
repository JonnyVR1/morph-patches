package p153l;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.api.C4879a;
import com.p051p1.mobile.putong.core.newui.main.NewMainAct;
import com.p051p1.mobile.putong.data.NavigationIntent;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class u9e0 extends o5e0 {
    /* JADX INFO: renamed from: f */
    public static bkj0<String, Map<String, String>, String> m195089f(@NonNull String str) {
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
        return new bkj0<>(host, map, path);
    }

    /* JADX INFO: renamed from: g */
    public static String m195090g(String str, abe0 abe0Var) {
        if (abe0Var.m96743f().containsKey("url_encoded")) {
            String strDecode = URLDecoder.decode(m195089f(abe0Var.m96740c()).f77082b.get("url_encoded"));
            if (!TextUtils.isEmpty(strDecode)) {
                return strDecode;
            }
        }
        if (str == null) {
            str = "";
        }
        Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
        for (String str2 : abe0Var.m96743f().keySet()) {
            if (!"url".equals(str2)) {
                builderBuildUpon.appendQueryParameter(str2, abe0Var.m96743f().get(str2));
            }
        }
        return builderBuildUpon.build().toString();
    }

    @Override // p153l.o5e0
    /* JADX INFO: renamed from: a */
    public void mo95798a(abe0 abe0Var, z20<String, String> z20Var) {
        String str = abe0Var.m96743f().get("url");
        String str2 = abe0Var.m96743f().get("title");
        if (str != null && str.contains(C4879a.m32227M(abe0Var.m96739b().getString(R$string.f19811xo))) && TextUtils.isEmpty(str2)) {
            new dtf0(abe0Var.m96739b()).m117853a();
        } else {
            super.mo95798a(abe0Var, z20Var);
        }
    }

    @Override // p153l.o5e0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo95799c(abe0 abe0Var, z20<String, String> z20Var) {
        String str;
        boolean zM82486a;
        String str2;
        Intent intentM213301A;
        String string = abe0Var.m96743f().get("title");
        String strM195090g = m195090g(abe0Var.m96743f().get("url"), abe0Var);
        String str3 = abe0Var.m96743f().get("throughhome");
        String str4 = abe0Var.m96743f().get("keeporiginpage");
        boolean zEquals = "1".equals(abe0Var.m96743f().get("hideNavigationBar"));
        boolean zEquals2 = "true".equals(abe0Var.m96743f().get("hardwareAccelerated"));
        boolean zEquals3 = "1".equals(abe0Var.m96743f().get("playbackRequiresUserGesture"));
        boolean zEquals4 = "1".equals(abe0Var.m96743f().get("skipLoading"));
        String str5 = abe0Var.m96743f().get("webviewColor");
        boolean zEquals5 = "true".equals(abe0Var.m96743f().get("autofill"));
        Intent intentM213301A2 = null;
        if (TextUtils.isEmpty(strM195090g)) {
            str2 = "webviewColor";
            intentM213301A = intentM213301A2;
        } else {
            try {
                str = strM195090g;
                try {
                    zM82486a = NullChecker.m82486a(Uri.parse(strM195090g).getQueryParameter("_bid"));
                } catch (Exception e) {
                    e = e;
                    CrashHelper.m82479c(e);
                    zM82486a = false;
                }
            } catch (Exception e2) {
                e = e2;
                str = strM195090g;
            }
            if (TextUtils.isEmpty(str3) || !"true".equals(str3)) {
                boolean z = zM82486a;
                String str6 = str;
                if (TextUtils.equals("https://miniprogram.tantanapp.com/view/staticpage/guideUpVersion/index.html", str6) && CoreModule.f18264c.f20291A0.m132933a3()) {
                    o1j0.m165634h(R$string.f18896U);
                    return null;
                }
                if (str6.contains(C4879a.m32227M(abe0Var.m96739b().getString(R$string.f19811xo))) && TextUtils.isEmpty(string)) {
                    string = CoreModule.f18263b.getResources().getString(R$string.f19780wo);
                }
                str2 = "webviewColor";
                intentM213301A2 = xwa.m213301A(abe0Var.m96739b(), string, str6, zEquals, zEquals2, z);
                intentM213301A = intentM213301A2;
            } else {
                if (TextUtils.isEmpty(str4) || !"true".equals(str4)) {
                    intentM213301A2 = m195091e(abe0Var, str, string, zEquals, zEquals2, zM82486a);
                } else if (nae0.m162081k()) {
                    intentM213301A = xwa.m213301A(abe0Var.m96739b(), string, str, zEquals, zEquals2, zM82486a);
                    intentM213301A.addFlags(SQLiteDatabase.CREATE_IF_NECESSARY);
                    str2 = "webviewColor";
                    str5 = str5;
                } else {
                    intentM213301A2 = m195091e(abe0Var, str, string, zEquals, zEquals2, zM82486a);
                }
                str2 = "webviewColor";
                intentM213301A = intentM213301A2;
            }
        }
        intentM213301A.putExtra("playbackRequiresUserGesture", zEquals3);
        intentM213301A.putExtra("skipLoading", zEquals4);
        intentM213301A.putExtra(str2, str5);
        intentM213301A.putExtra("hideNotch", "1".equals(abe0Var.m96743f().get("hideNotch")));
        intentM213301A.putExtra("autofill", zEquals5);
        return intentM213301A;
    }

    /* JADX INFO: renamed from: e */
    public final Intent m195091e(abe0 abe0Var, String str, String str2, boolean z, boolean z2, boolean z3) {
        Intent intentM40697M5 = NewMainAct.m40697M5(abe0Var.m96739b(), NavigationIntent.get("webview"));
        intentM40697M5.putExtra("webview_url", str);
        intentM40697M5.putExtra("webview_title", str2);
        intentM40697M5.putExtra("hideNavigationBar", z);
        intentM40697M5.putExtra("hardwareAccelerated", z2);
        intentM40697M5.putExtra("useMkWebview", z3);
        return intentM40697M5;
    }
}
