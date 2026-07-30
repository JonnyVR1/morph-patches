package p153l;

import android.text.TextUtils;
import java.io.File;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class n4r0 {

    /* JADX INFO: renamed from: a */
    protected static JSONObject f140252a = new JSONObject();

    /* JADX INFO: renamed from: a */
    public static void m161582a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            String strM164506c = nrq0.m164506c(jSONObject);
            File file = new File(j5r0.m143557E(n0r0.m161022i()), "apmlite/configCrash/configNative");
            if (strM164506c == null) {
                f140252a = new JSONObject();
                return;
            }
            JSONObject jSONObject2 = new JSONObject(strM164506c);
            f140252a = jSONObject2;
            r3r0.m179687m(file, m161588g(jSONObject2), false);
        } catch (JSONException unused) {
        } catch (Throwable th) {
            pwq0.m174074a();
            pwq0.m174075b("NPTH_CATCH", th);
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m161583b(String str, q1r0 q1r0Var) {
        if (f140252a == null) {
            return false;
        }
        if (q1r0Var == null) {
            q1r0Var = new q1r0();
        }
        JSONObject jSONObjectOptJSONObject = f140252a.optJSONObject(str);
        if (jSONObjectOptJSONObject == null || m161584c(jSONObjectOptJSONObject.optJSONArray("disable"), q1r0Var)) {
            return false;
        }
        return m161584c(jSONObjectOptJSONObject.optJSONArray("enable"), q1r0Var);
    }

    /* JADX INFO: renamed from: c */
    private static boolean m161584c(JSONArray jSONArray, q1r0 q1r0Var) {
        if (t4r0.m189302f(jSONArray)) {
            return false;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
            if (jSONObjectOptJSONObject == null) {
                pwq0.m174074a();
                pwq0.m174075b("NPTH_CATCH", new IllegalArgumentException("err config: " + jSONArray));
            } else if (m161586e(jSONObjectOptJSONObject, q1r0Var)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    private static boolean m161585d(JSONObject jSONObject, Object obj) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("values");
        if (jSONArrayOptJSONArray.length() == 0) {
            return false;
        }
        String strOptString = jSONObject.optString("op");
        String strValueOf = String.valueOf(obj);
        if (strOptString.equals("=")) {
            return strValueOf.equals(String.valueOf(jSONArrayOptJSONArray.opt(0)));
        }
        if (strOptString.equals("in")) {
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                if (String.valueOf(jSONArrayOptJSONArray.opt(i)).equals(strValueOf)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    private static boolean m161586e(JSONObject jSONObject, q1r0 q1r0Var) {
        Iterator<String> itKeys = jSONObject.keys();
        boolean z = false;
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            if (!TextUtils.isEmpty(next)) {
                if (next.startsWith("header_")) {
                    if (!m161585d(jSONObject.optJSONObject(next), q1r0Var.mo174928b(next.substring(7)))) {
                        q5r0.m175511a("not match ".concat(next));
                        return false;
                    }
                    z = true;
                } else {
                    if (!next.startsWith("java_")) {
                        q5r0.m175511a("no rules match ".concat(next));
                    } else if (!m161585d(jSONObject.optJSONObject(next), q1r0Var.mo169541a(next.substring(5)))) {
                        q5r0.m175511a("not match ".concat(next));
                        return false;
                    }
                    z = true;
                }
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: f */
    private static JSONArray m161587f(JSONArray jSONArray, q1r0 q1r0Var) {
        JSONArray jSONArray2 = new JSONArray();
        if (!t4r0.m189302f(jSONArray)) {
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject == null) {
                    pwq0.m174074a();
                    pwq0.m174075b("NPTH_CATCH", new IllegalArgumentException("err config: " + jSONArray));
                } else if (m161586e(jSONObjectOptJSONObject, q1r0Var)) {
                    jSONArray2.put(jSONObjectOptJSONObject);
                }
            }
        }
        return jSONArray2;
    }

    /* JADX INFO: renamed from: g */
    public static JSONObject m161588g(JSONObject jSONObject) {
        StringBuilder sb;
        Iterator<String> itKeys = jSONObject.keys();
        q1r0 q1r0Var = new q1r0();
        JSONObject jSONObject2 = new JSONObject();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            if (!"configType".equals(next)) {
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(next);
                if (jSONObjectOptJSONObject == null) {
                    pwq0.m174074a();
                    pwq0.m174075b("NPTH_CATCH", new IllegalArgumentException("err config with key: " + next));
                } else {
                    if (m161584c(jSONObjectOptJSONObject.optJSONArray("disable"), q1r0Var)) {
                        sb = new StringBuilder("match diable ");
                    } else {
                        JSONArray jSONArrayM161587f = m161587f(jSONObjectOptJSONObject.optJSONArray("enable"), q1r0Var);
                        if (t4r0.m189302f(jSONArrayM161587f)) {
                            sb = new StringBuilder("not match ");
                        } else {
                            try {
                                jSONObject2.put(next, new JSONObject().put("enable", jSONArrayM161587f));
                            } catch (JSONException unused) {
                            }
                        }
                    }
                    sb.append(next);
                    q5r0.m175511a(sb.toString());
                }
            }
        }
        return jSONObject2;
    }
}
