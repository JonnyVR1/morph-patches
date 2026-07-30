package p153l;

import androidx.core.app.NotificationCompat;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class j0r0 {

    /* JADX INFO: renamed from: e */
    private static HashMap<String, j0r0> f117841e = new HashMap<>();

    /* JADX INFO: renamed from: a */
    private JSONObject f117842a = null;

    /* JADX INFO: renamed from: b */
    private JSONObject f117843b = null;

    /* JADX INFO: renamed from: c */
    private boolean f117844c = false;

    /* JADX INFO: renamed from: d */
    private String f117845d;

    public j0r0(JSONObject jSONObject, String str) {
        this.f117845d = str;
        m142989c(jSONObject);
        f117841e.put(this.f117845d, this);
        q5r0.m175511a("after update aid " + str);
    }

    /* JADX INFO: renamed from: b */
    public static void m142988b(String str, JSONObject jSONObject) {
        j0r0 j0r0Var = f117841e.get(str);
        if (j0r0Var != null) {
            j0r0Var.m142989c(jSONObject);
        } else {
            new j0r0(jSONObject, str);
        }
    }

    /* JADX INFO: renamed from: c */
    private void m142989c(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject;
        this.f117842a = jSONObject;
        if (jSONObject == null || (jSONObjectOptJSONObject = jSONObject.optJSONObject("error_module")) == null) {
            return;
        }
        this.f117844c = jSONObjectOptJSONObject.optInt("switcher") == 1 && jSONObjectOptJSONObject.optInt("err_sampling_rate") == 1;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m142990d(String str) {
        return f117841e.get(str) != null;
    }

    /* JADX INFO: renamed from: e */
    public static JSONObject m142991e(String str) {
        j0r0 j0r0Var = f117841e.get(str);
        if (j0r0Var != null) {
            return j0r0Var.m142997a();
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public static long m142992g(String str) {
        j0r0 j0r0Var = f117841e.get(str);
        if (j0r0Var == null) {
            return 3600000L;
        }
        try {
            return Long.decode(t4r0.m189305i(j0r0Var.m142997a(), "over_all", "get_settings_interval")).longValue() * 1000;
        } catch (Throwable unused) {
            return 3600000L;
        }
    }

    /* JADX INFO: renamed from: j */
    public static boolean m142993j(String str) {
        j0r0 j0r0Var = f117841e.get(str);
        return j0r0Var != null && j0r0Var.m142998f() && j0r0Var.m143001k();
    }

    /* JADX INFO: renamed from: l */
    public static boolean m142994l(String str) {
        j0r0 j0r0Var = f117841e.get(str);
        return j0r0Var != null && j0r0Var.m142999h() && j0r0Var.m143001k();
    }

    /* JADX INFO: renamed from: m */
    public static boolean m142995m(String str) {
        j0r0 j0r0Var = f117841e.get(str);
        return j0r0Var != null && j0r0Var.m143000i() && j0r0Var.m143001k();
    }

    /* JADX INFO: renamed from: n */
    public static boolean m142996n(String str) {
        j0r0 j0r0Var = f117841e.get(str);
        return j0r0Var == null || j0r0Var.m143001k();
    }

    /* JADX INFO: renamed from: a */
    public JSONObject m142997a() {
        return this.f117842a;
    }

    /* JADX INFO: renamed from: f */
    public boolean m142998f() {
        JSONObject jSONObject = this.f117842a;
        return jSONObject != null && 1 == t4r0.m189297a(jSONObject, 0, "crash_module", "switcher");
    }

    /* JADX INFO: renamed from: h */
    public boolean m142999h() {
        JSONObject jSONObject = this.f117842a;
        return jSONObject != null && 1 == t4r0.m189297a(jSONObject, 0, "crash_module", "switcher");
    }

    /* JADX INFO: renamed from: i */
    public boolean m143000i() {
        JSONObject jSONObject = this.f117842a;
        return jSONObject != null && 1 == t4r0.m189297a(jSONObject, 0, "crash_module", "switcher");
    }

    /* JADX INFO: renamed from: k */
    public boolean m143001k() {
        try {
            JSONObject jSONObject = this.f117842a;
            return jSONObject == null || jSONObject.optInt(NotificationCompat.CATEGORY_STATUS) == 0;
        } catch (Throwable unused) {
        }
    }
}
