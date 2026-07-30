package p009l;

import com.tantanapp.common.utils.CrashHelper;
import l.exc0;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class ox0 {

    /* JADX INFO: renamed from: a */
    public boolean f18271a;

    /* JADX INFO: renamed from: b */
    public String f18272b;

    /* JADX INFO: renamed from: c */
    public String f18273c;

    /* JADX INFO: renamed from: d */
    public String f18274d;

    /* JADX INFO: renamed from: e */
    public boolean f18275e;

    /* JADX INFO: renamed from: f */
    public boolean f18276f;

    /* JADX INFO: renamed from: e */
    public static ox0 m20037e(exc0 exc0Var) {
        try {
            JSONObject jSONObject = new JSONObject(exc0Var.k().string());
            ox0 ox0Var = new ox0();
            ox0Var.f18272b = jSONObject.getString("appVersion");
            ox0Var.f18271a = jSONObject.getBoolean("hasUpdate");
            ox0Var.f18273c = jSONObject.getString("url");
            ox0Var.f18274d = jSONObject.getString("changelog");
            ox0Var.f18275e = jSONObject.getBoolean("goToMarket");
            ox0Var.f18276f = jSONObject.getBoolean("forceDownloadApk");
            return ox0Var;
        } catch (Exception e) {
            CrashHelper.c(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public String m20038a() {
        return this.f18272b;
    }

    /* JADX INFO: renamed from: b */
    public String m20039b() {
        return this.f18274d;
    }

    /* JADX INFO: renamed from: c */
    public String m20040c() {
        return this.f18273c;
    }

    /* JADX INFO: renamed from: d */
    public boolean m20041d() {
        return this.f18271a;
    }
}
