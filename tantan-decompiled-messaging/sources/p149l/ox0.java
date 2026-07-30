package p149l;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.tantanapp.common.utils.CrashHelper;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class ox0 {

    /* JADX INFO: renamed from: a */
    public boolean f146104a;

    /* JADX INFO: renamed from: b */
    public String f146105b;

    /* JADX INFO: renamed from: c */
    public String f146106c;

    /* JADX INFO: renamed from: d */
    public String f146107d;

    /* JADX INFO: renamed from: e */
    public boolean f146108e;

    /* JADX INFO: renamed from: f */
    public boolean f146109f;

    /* JADX INFO: renamed from: e */
    public static ox0 m166454e(exc0 exc0Var) {
        try {
            JSONObject jSONObject = new JSONObject(exc0Var.m118606k().string());
            ox0 ox0Var = new ox0();
            ox0Var.f146105b = jSONObject.getString(RemoteConfigConstants.RequestFieldKey.APP_VERSION);
            ox0Var.f146104a = jSONObject.getBoolean("hasUpdate");
            ox0Var.f146106c = jSONObject.getString("url");
            ox0Var.f146107d = jSONObject.getString("changelog");
            ox0Var.f146108e = jSONObject.getBoolean("goToMarket");
            ox0Var.f146109f = jSONObject.getBoolean("forceDownloadApk");
            return ox0Var;
        } catch (Exception e) {
            CrashHelper.m81296c(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public String m166455a() {
        return this.f146105b;
    }

    /* JADX INFO: renamed from: b */
    public String m166456b() {
        return this.f146107d;
    }

    /* JADX INFO: renamed from: c */
    public String m166457c() {
        return this.f146106c;
    }

    /* JADX INFO: renamed from: d */
    public boolean m166458d() {
        return this.f146104a;
    }
}
