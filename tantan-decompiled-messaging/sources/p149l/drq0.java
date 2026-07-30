package p149l;

import androidx.core.app.NotificationCompat;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class drq0 {

    /* JADX INFO: renamed from: e */
    private static HashMap<String, drq0> f87658e = new HashMap<>();

    /* JADX INFO: renamed from: a */
    private JSONObject f87659a = null;

    /* JADX INFO: renamed from: b */
    private JSONObject f87660b = null;

    /* JADX INFO: renamed from: c */
    private boolean f87661c = false;

    /* JADX INFO: renamed from: d */
    private String f87662d;

    public drq0(JSONObject jSONObject, String str) {
        this.f87662d = str;
        m113320c(jSONObject);
        f87658e.put(this.f87662d, this);
        kwq0.m147628a("after update aid " + str);
    }

    /* JADX INFO: renamed from: b */
    public static void m113319b(String str, JSONObject jSONObject) {
        drq0 drq0Var = f87658e.get(str);
        if (drq0Var != null) {
            drq0Var.m113320c(jSONObject);
        } else {
            new drq0(jSONObject, str);
        }
    }

    /* JADX INFO: renamed from: c */
    private void m113320c(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject;
        this.f87659a = jSONObject;
        if (jSONObject == null || (jSONObjectOptJSONObject = jSONObject.optJSONObject("error_module")) == null) {
            return;
        }
        this.f87661c = jSONObjectOptJSONObject.optInt("switcher") == 1 && jSONObjectOptJSONObject.optInt("err_sampling_rate") == 1;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m113321d(String str) {
        return f87658e.get(str) != null;
    }

    /* JADX INFO: renamed from: e */
    public static JSONObject m113322e(String str) {
        drq0 drq0Var = f87658e.get(str);
        if (drq0Var != null) {
            return drq0Var.m113328a();
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public static long m113323g(String str) {
        drq0 drq0Var = f87658e.get(str);
        if (drq0Var == null) {
            return 3600000L;
        }
        try {
            return Long.decode(nvq0.m161756i(drq0Var.m113328a(), "over_all", "get_settings_interval")).longValue() * 1000;
        } catch (Throwable unused) {
            return 3600000L;
        }
    }

    /* JADX INFO: renamed from: j */
    public static boolean m113324j(String str) {
        drq0 drq0Var = f87658e.get(str);
        return drq0Var != null && drq0Var.m113329f() && drq0Var.m113332k();
    }

    /* JADX INFO: renamed from: l */
    public static boolean m113325l(String str) {
        drq0 drq0Var = f87658e.get(str);
        return drq0Var != null && drq0Var.m113330h() && drq0Var.m113332k();
    }

    /* JADX INFO: renamed from: m */
    public static boolean m113326m(String str) {
        drq0 drq0Var = f87658e.get(str);
        return drq0Var != null && drq0Var.m113331i() && drq0Var.m113332k();
    }

    /* JADX INFO: renamed from: n */
    public static boolean m113327n(String str) {
        drq0 drq0Var = f87658e.get(str);
        return drq0Var == null || drq0Var.m113332k();
    }

    /* JADX INFO: renamed from: a */
    public JSONObject m113328a() {
        return this.f87659a;
    }

    /* JADX INFO: renamed from: f */
    public boolean m113329f() {
        JSONObject jSONObject = this.f87659a;
        return jSONObject != null && 1 == nvq0.m161748a(jSONObject, 0, "crash_module", "switcher");
    }

    /* JADX INFO: renamed from: h */
    public boolean m113330h() {
        JSONObject jSONObject = this.f87659a;
        return jSONObject != null && 1 == nvq0.m161748a(jSONObject, 0, "crash_module", "switcher");
    }

    /* JADX INFO: renamed from: i */
    public boolean m113331i() {
        JSONObject jSONObject = this.f87659a;
        return jSONObject != null && 1 == nvq0.m161748a(jSONObject, 0, "crash_module", "switcher");
    }

    /* JADX INFO: renamed from: k */
    public boolean m113332k() {
        try {
            JSONObject jSONObject = this.f87659a;
            return jSONObject == null || jSONObject.optInt(NotificationCompat.CATEGORY_STATUS) == 0;
        } catch (Throwable unused) {
        }
    }
}
