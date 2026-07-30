package p006l;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p1.mobile.android.app.Act;
import java.util.Map;
import l.f30;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class lxd0 extends kxd0 {
    /* JADX INFO: renamed from: h */
    private String m19076h(String str, w2e0 w2e0Var) {
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
        super.mo11681a(w2e0Var, f30Var);
    }

    @Override // p006l.kxd0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo11682c(w2e0 w2e0Var, f30<String, String> f30Var) {
        Map<String, String> mapM26160f = w2e0Var.m26160f();
        String str = mapM26160f.get("url");
        boolean zEquals = TextUtils.equals(mapM26160f.get("redirectType"), "browser");
        boolean zEquals2 = TextUtils.equals(mapM26160f.get("isUseMkWebView"), "1");
        boolean zEquals3 = TextUtils.equals(mapM26160f.get("hardwareAccelerated"), "1");
        boolean zEquals4 = TextUtils.equals(mapM26160f.get("hideNavigationBar"), "1");
        String str2 = mapM26160f.get("tracker");
        mapM26160f.remove("isUseMkWebView");
        mapM26160f.remove("hardwareAccelerated");
        mapM26160f.remove("hideNavigationBar");
        mapM26160f.remove("tracker");
        mapM26160f.remove("redirectType");
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String strM19076h = m19076h(str, w2e0Var);
        if (TextUtils.isEmpty(strM19076h)) {
            return null;
        }
        Activity activityD = xdl0.D(w2e0Var.m26156b());
        if (!(activityD instanceof Act) || !m19077e(activityD)) {
            return null;
        }
        Act act = (Act) activityD;
        if (zEquals) {
            m19078f(act, strM19076h);
            return null;
        }
        m19079g(act, strM19076h, str2, zEquals2, zEquals3, zEquals4);
        return null;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m19077e(Activity activity) {
        return (activity == null || activity.isDestroyed() || activity.isFinishing()) ? false : true;
    }

    /* JADX INFO: renamed from: f */
    public final void m19078f(Act act, String str) {
        Intent data = new Intent("android.intent.action.VIEW").setData(Uri.parse(str).buildUpon().build());
        data.addFlags(268435456);
        act.startActivity(data);
    }

    /* JADX INFO: renamed from: g */
    public final void m19079g(Act act, String str, String str2, boolean z, boolean z2, boolean z3) {
        Intent intentM19017A = lva.m19017A(act, "", Uri.parse(str).buildUpon().build().toString(), z3, z2, z);
        intentM19017A.putExtra("extra_custom_data", str2);
        act.startActivity(intentM19017A);
    }
}
