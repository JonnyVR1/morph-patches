package p153l;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.tantanapp.common.utils.CrashHelper;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class vx0 {

    /* JADX INFO: renamed from: a */
    public boolean f186216a;

    /* JADX INFO: renamed from: b */
    public String f186217b;

    /* JADX INFO: renamed from: c */
    public String f186218c;

    /* JADX INFO: renamed from: d */
    public String f186219d;

    /* JADX INFO: renamed from: e */
    public boolean f186220e;

    /* JADX INFO: renamed from: f */
    public boolean f186221f;

    /* JADX INFO: renamed from: e */
    public static vx0 m203824e(i5d0 i5d0Var) {
        try {
            JSONObject jSONObject = new JSONObject(i5d0Var.m138670k().string());
            vx0 vx0Var = new vx0();
            vx0Var.f186217b = jSONObject.getString(RemoteConfigConstants.RequestFieldKey.APP_VERSION);
            vx0Var.f186216a = jSONObject.getBoolean("hasUpdate");
            vx0Var.f186218c = jSONObject.getString("url");
            vx0Var.f186219d = jSONObject.getString("changelog");
            vx0Var.f186220e = jSONObject.getBoolean("goToMarket");
            vx0Var.f186221f = jSONObject.getBoolean("forceDownloadApk");
            return vx0Var;
        } catch (Exception e) {
            CrashHelper.m82479c(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public String m203825a() {
        return this.f186217b;
    }

    /* JADX INFO: renamed from: b */
    public String m203826b() {
        return this.f186219d;
    }

    /* JADX INFO: renamed from: c */
    public String m203827c() {
        return this.f186218c;
    }

    /* JADX INFO: renamed from: d */
    public boolean m203828d() {
        return this.f186216a;
    }
}
