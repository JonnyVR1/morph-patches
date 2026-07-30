package p153l;

import java.util.concurrent.ConcurrentLinkedQueue;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class nrq0 {

    /* JADX INFO: renamed from: a */
    private static ConcurrentLinkedQueue<Object> f143424a = new ConcurrentLinkedQueue<>();

    /* JADX INFO: renamed from: a */
    public static int m164504a(int i, String... strArr) {
        return t4r0.m189297a(m164507d(), i, strArr);
    }

    /* JADX INFO: renamed from: b */
    public static int m164505b(String... strArr) {
        return t4r0.m189297a(m164507d(), -1, strArr);
    }

    /* JADX INFO: renamed from: c */
    public static String m164506c(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject;
        if (jSONObject == null || (jSONObjectOptJSONObject = jSONObject.optJSONObject("exception_modules")) == null) {
            return null;
        }
        return jSONObjectOptJSONObject.optString("npth");
    }

    /* JADX INFO: renamed from: d */
    public static JSONObject m164507d() {
        return j0r0.m142991e(n0r0.m161015b().m100921g());
    }

    /* JADX INFO: renamed from: e */
    public static JSONObject m164508e(JSONArray jSONArray, String str) {
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
    public static void m164509f(JSONArray jSONArray, boolean z) {
        if (jSONArray == null) {
            return;
        }
        q5r0.m175513c("apmconfig", "fromnet " + z + " : " + jSONArray);
        if (z) {
            f4r0.m124034i();
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                String next = jSONObjectOptJSONObject.keys().next();
                JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject(next);
                q5r0.m175511a("update config " + next + " : " + jSONObjectOptJSONObject2);
                j0r0.m142988b(next, jSONObjectOptJSONObject2);
                if (z) {
                    f4r0.m124026a(next);
                }
            } catch (Throwable unused) {
            }
        }
        n4r0.m161582a(m164508e(jSONArray, String.valueOf(n0r0.m161015b().m100921g())));
        if (z) {
            f4r0.m124027b(false, jSONArray);
        }
    }

    /* JADX INFO: renamed from: g */
    public static boolean m164510g(String str) {
        if (!j0r0.m142990d(str)) {
            krq0.m151112b();
        }
        return j0r0.m142993j(str);
    }

    /* JADX INFO: renamed from: h */
    public static boolean m164511h() {
        return s4r0.m184579h();
    }

    /* JADX INFO: renamed from: i */
    public static boolean m164512i(String str) {
        if (!j0r0.m142990d(str)) {
            krq0.m151112b();
        }
        return j0r0.m142995m(str);
    }

    /* JADX INFO: renamed from: j */
    public static JSONArray m164513j() {
        return t4r0.m189299c(m164507d(), "custom_event_settings", "npth_simple_setting", "max_utm_thread_ignore");
    }

    /* JADX INFO: renamed from: k */
    public static boolean m164514k(String str) {
        if (!j0r0.m142990d(str)) {
            krq0.m151112b();
        }
        return j0r0.m142994l(str);
    }

    /* JADX INFO: renamed from: l */
    public static boolean m164515l() {
        return m164505b("custom_event_settings", "npth_simple_setting", "disable_looper_monitor") == 1;
    }

    /* JADX INFO: renamed from: m */
    public static boolean m164516m() {
        return m164505b("custom_event_settings", "npth_simple_setting", "anr_with_traces_txt") == 1;
    }

    /* JADX INFO: renamed from: n */
    public static boolean m164517n() {
        return m164505b("custom_event_settings", "npth_simple_setting", "upload_crash_crash") == 1;
    }

    /* JADX INFO: renamed from: o */
    public static boolean m164518o() {
        return m164505b("custom_event_settings", "npth_simple_setting", "enable_killed_anr") == 1;
    }

    /* JADX INFO: renamed from: p */
    public static boolean m164519p() {
        return m164505b("custom_event_settings", "npth_simple_setting", "enable_anr_all_process_trace") == 1;
    }
}
