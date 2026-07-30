package p149l;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class lxd0 extends kxd0 {
    /* JADX INFO: renamed from: h */
    private String m152058h(String str, w2e0 w2e0Var) {
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
        super.mo94421a(w2e0Var, f30Var);
    }

    @Override // p149l.kxd0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo94422c(w2e0 w2e0Var, f30<String, String> f30Var) {
        Map<String, String> mapM201098f = w2e0Var.m201098f();
        String str = mapM201098f.get("url");
        boolean zEquals = TextUtils.equals(mapM201098f.get("redirectType"), "browser");
        boolean zEquals2 = TextUtils.equals(mapM201098f.get("isUseMkWebView"), "1");
        boolean zEquals3 = TextUtils.equals(mapM201098f.get("hardwareAccelerated"), "1");
        boolean zEquals4 = TextUtils.equals(mapM201098f.get("hideNavigationBar"), "1");
        String str2 = mapM201098f.get("tracker");
        mapM201098f.remove("isUseMkWebView");
        mapM201098f.remove("hardwareAccelerated");
        mapM201098f.remove("hideNavigationBar");
        mapM201098f.remove("tracker");
        mapM201098f.remove("redirectType");
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String strM152058h = m152058h(str, w2e0Var);
        if (TextUtils.isEmpty(strM152058h)) {
            return null;
        }
        Activity activityM208326D = xdl0.m208326D(w2e0Var.m201094b());
        if (!(activityM208326D instanceof Act) || !m152059e(activityM208326D)) {
            return null;
        }
        Act act = (Act) activityM208326D;
        if (zEquals) {
            m152060f(act, strM152058h);
            return null;
        }
        m152061g(act, strM152058h, str2, zEquals2, zEquals3, zEquals4);
        return null;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m152059e(Activity activity) {
        return (activity == null || activity.isDestroyed() || activity.isFinishing()) ? false : true;
    }

    /* JADX INFO: renamed from: f */
    public final void m152060f(Act act, String str) {
        Intent data = new Intent("android.intent.action.VIEW").setData(Uri.parse(str).buildUpon().build());
        data.addFlags(268435456);
        act.startActivity(data);
    }

    /* JADX INFO: renamed from: g */
    public final void m152061g(Act act, String str, String str2, boolean z, boolean z2, boolean z3) {
        Intent intentM151840A = lva.m151840A(act, "", Uri.parse(str).buildUpon().build().toString(), z3, z2, z);
        intentM151840A.putExtra("extra_custom_data", str2);
        act.startActivity(intentM151840A);
    }
}
