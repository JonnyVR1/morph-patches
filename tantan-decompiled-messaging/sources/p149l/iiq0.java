package p149l;

import java.util.concurrent.ConcurrentLinkedQueue;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class iiq0 {

    /* JADX INFO: renamed from: a */
    private static ConcurrentLinkedQueue<Object> f113425a = new ConcurrentLinkedQueue<>();

    /* JADX INFO: renamed from: a */
    public static int m136426a(int i, String... strArr) {
        return nvq0.m161748a(m136429d(), i, strArr);
    }

    /* JADX INFO: renamed from: b */
    public static int m136427b(String... strArr) {
        return nvq0.m161748a(m136429d(), -1, strArr);
    }

    /* JADX INFO: renamed from: c */
    public static String m136428c(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject;
        if (jSONObject == null || (jSONObjectOptJSONObject = jSONObject.optJSONObject("exception_modules")) == null) {
            return null;
        }
        return jSONObjectOptJSONObject.optString("npth");
    }

    /* JADX INFO: renamed from: d */
    public static JSONObject m136429d() {
        return drq0.m113322e(hrq0.m132693b().m194564g());
    }

    /* JADX INFO: renamed from: e */
    public static JSONObject m136430e(JSONArray jSONArray, String str) {
        if (jSONArray != null && jSONArray.length() != 0) {
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i).optJSONObject(str);
                if (jSONObjectOptJSONObject != null) {
                    return jSONObjectOptJSONObject;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public static void m136431f(JSONArray jSONArray, boolean z) {
        if (jSONArray == null) {
            return;
        }
        kwq0.m147630c("apmconfig", "fromnet " + z + " : " + jSONArray);
        if (z) {
            zuq0.m220247i();
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                String next = jSONObjectOptJSONObject.keys().next();
                JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject(next);
                kwq0.m147628a("update config " + next + " : " + jSONObjectOptJSONObject2);
                drq0.m113319b(next, jSONObjectOptJSONObject2);
                if (z) {
                    zuq0.m220239a(next);
                }
            } catch (Throwable unused) {
            }
        }
        hvq0.m133199a(m136430e(jSONArray, String.valueOf(hrq0.m132693b().m194564g())));
        if (z) {
            zuq0.m220240b(false, jSONArray);
        }
    }

    /* JADX INFO: renamed from: g */
    public static boolean m136432g(String str) {
        if (!drq0.m113321d(str)) {
            fiq0.m121556b();
        }
        return drq0.m113324j(str);
    }

    /* JADX INFO: renamed from: h */
    public static boolean m136433h() {
        return mvq0.m156585h();
    }

    /* JADX INFO: renamed from: i */
    public static boolean m136434i(String str) {
        if (!drq0.m113321d(str)) {
            fiq0.m121556b();
        }
        return drq0.m113326m(str);
    }

    /* JADX INFO: renamed from: j */
    public static JSONArray m136435j() {
        return nvq0.m161750c(m136429d(), "custom_event_settings", "npth_simple_setting", "max_utm_thread_ignore");
    }

    /* JADX INFO: renamed from: k */
    public static boolean m136436k(String str) {
        if (!drq0.m113321d(str)) {
            fiq0.m121556b();
        }
        return drq0.m113325l(str);
    }

    /* JADX INFO: renamed from: l */
    public static boolean m136437l() {
        return m136427b("custom_event_settings", "npth_simple_setting", "disable_looper_monitor") == 1;
    }

    /* JADX INFO: renamed from: m */
    public static boolean m136438m() {
        return m136427b("custom_event_settings", "npth_simple_setting", "anr_with_traces_txt") == 1;
    }

    /* JADX INFO: renamed from: n */
    public static boolean m136439n() {
        return m136427b("custom_event_settings", "npth_simple_setting", "upload_crash_crash") == 1;
    }

    /* JADX INFO: renamed from: o */
    public static boolean m136440o() {
        return m136427b("custom_event_settings", "npth_simple_setting", "enable_killed_anr") == 1;
    }

    /* JADX INFO: renamed from: p */
    public static boolean m136441p() {
        return m136427b("custom_event_settings", "npth_simple_setting", "enable_anr_all_process_trace") == 1;
    }
}
