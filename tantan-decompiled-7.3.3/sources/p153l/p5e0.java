package p153l;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class p5e0 extends o5e0 {
    /* JADX INFO: renamed from: h */
    private String m170623h(String str, abe0 abe0Var) {
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
        super.mo95798a(abe0Var, z20Var);
    }

    @Override // p153l.o5e0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo95799c(abe0 abe0Var, z20<String, String> z20Var) {
        Map<String, String> mapM96743f = abe0Var.m96743f();
        String str = mapM96743f.get("url");
        boolean zEquals = TextUtils.equals(mapM96743f.get("redirectType"), "browser");
        boolean zEquals2 = TextUtils.equals(mapM96743f.get("isUseMkWebView"), "1");
        boolean zEquals3 = TextUtils.equals(mapM96743f.get("hardwareAccelerated"), "1");
        boolean zEquals4 = TextUtils.equals(mapM96743f.get("hideNavigationBar"), "1");
        String str2 = mapM96743f.get("tracker");
        mapM96743f.remove("isUseMkWebView");
        mapM96743f.remove("hardwareAccelerated");
        mapM96743f.remove("hideNavigationBar");
        mapM96743f.remove("tracker");
        mapM96743f.remove("redirectType");
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String strM170623h = m170623h(str, abe0Var);
        if (TextUtils.isEmpty(strM170623h)) {
            return null;
        }
        Activity activityM105506D = bnl0.m105506D(abe0Var.m96739b());
        if (!(activityM105506D instanceof Act) || !m170624e(activityM105506D)) {
            return null;
        }
        Act act = (Act) activityM105506D;
        if (zEquals) {
            m170625f(act, strM170623h);
            return null;
        }
        m170626g(act, strM170623h, str2, zEquals2, zEquals3, zEquals4);
        return null;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m170624e(Activity activity) {
        return (activity == null || activity.isDestroyed() || activity.isFinishing()) ? false : true;
    }

    /* JADX INFO: renamed from: f */
    public final void m170625f(Act act, String str) {
        Intent data = new Intent("android.intent.action.VIEW").setData(Uri.parse(str).buildUpon().build());
        data.addFlags(SQLiteDatabase.CREATE_IF_NECESSARY);
        act.startActivity(data);
    }

    /* JADX INFO: renamed from: g */
    public final void m170626g(Act act, String str, String str2, boolean z, boolean z2, boolean z3) {
        Intent intentM213301A = xwa.m213301A(act, "", Uri.parse(str).buildUpon().build().toString(), z3, z2, z);
        intentM213301A.putExtra("extra_custom_data", str2);
        act.startActivity(intentM213301A);
    }
}
