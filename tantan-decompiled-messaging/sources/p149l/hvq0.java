package p149l;

import android.text.TextUtils;
import java.io.File;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class hvq0 {

    /* JADX INFO: renamed from: a */
    protected static JSONObject f109691a = new JSONObject();

    /* JADX INFO: renamed from: a */
    public static void m133199a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            String strM136428c = iiq0.m136428c(jSONObject);
            File file = new File(dwq0.m113905E(hrq0.m132700i()), "apmlite/configCrash/configNative");
            if (strM136428c == null) {
                f109691a = new JSONObject();
                return;
            }
            JSONObject jSONObject2 = new JSONObject(strM136428c);
            f109691a = jSONObject2;
            luq0.m151799m(file, m133205g(jSONObject2), false);
        } catch (JSONException unused) {
        } catch (Throwable th) {
            jnq0.m142383a();
            jnq0.m142384b("NPTH_CATCH", th);
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m133200b(String str, ksq0 ksq0Var) {
        if (f109691a == null) {
            return false;
        }
        if (ksq0Var == null) {
            ksq0Var = new ksq0();
        }
        JSONObject jSONObjectOptJSONObject = f109691a.optJSONObject(str);
        if (jSONObjectOptJSONObject == null || m133201c(jSONObjectOptJSONObject.optJSONArray("disable"), ksq0Var)) {
            return false;
        }
        return m133201c(jSONObjectOptJSONObject.optJSONArray("enable"), ksq0Var);
    }

    /* JADX INFO: renamed from: c */
    private static boolean m133201c(JSONArray jSONArray, ksq0 ksq0Var) {
        if (nvq0.m161753f(jSONArray)) {
            return false;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
            if (jSONObjectOptJSONObject == null) {
                jnq0.m142383a();
                jnq0.m142384b("NPTH_CATCH", new IllegalArgumentException("err config: " + jSONArray));
            } else if (m133203e(jSONObjectOptJSONObject, ksq0Var)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    private static boolean m133202d(JSONObject jSONObject, Object obj) {
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
    private static boolean m133203e(JSONObject jSONObject, ksq0 ksq0Var) {
        Iterator<String> itKeys = jSONObject.keys();
        boolean z = false;
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            if (!TextUtils.isEmpty(next)) {
                if (next.startsWith("header_")) {
                    if (!m133202d(jSONObject.optJSONObject(next), ksq0Var.mo147102b(next.substring(7)))) {
                        kwq0.m147628a("not match ".concat(next));
                        return false;
                    }
                    z = true;
                } else {
                    if (!next.startsWith("java_")) {
                        kwq0.m147628a("no rules match ".concat(next));
                    } else if (!m133202d(jSONObject.optJSONObject(next), ksq0Var.mo143420a(next.substring(5)))) {
                        kwq0.m147628a("not match ".concat(next));
                        return false;
                    }
                    z = true;
                }
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: f */
    private static JSONArray m133204f(JSONArray jSONArray, ksq0 ksq0Var) {
        JSONArray jSONArray2 = new JSONArray();
        if (!nvq0.m161753f(jSONArray)) {
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject == null) {
                    jnq0.m142383a();
                    jnq0.m142384b("NPTH_CATCH", new IllegalArgumentException("err config: " + jSONArray));
                } else if (m133203e(jSONObjectOptJSONObject, ksq0Var)) {
                    jSONArray2.put(jSONObjectOptJSONObject);
                }
            }
        }
        return jSONArray2;
    }

    /* JADX INFO: renamed from: g */
    public static JSONObject m133205g(JSONObject jSONObject) {
        StringBuilder sb;
        Iterator<String> itKeys = jSONObject.keys();
        ksq0 ksq0Var = new ksq0();
        JSONObject jSONObject2 = new JSONObject();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            if (!"configType".equals(next)) {
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(next);
                if (jSONObjectOptJSONObject == null) {
                    jnq0.m142383a();
                    jnq0.m142384b("NPTH_CATCH", new IllegalArgumentException("err config with key: " + next));
                } else {
                    if (m133201c(jSONObjectOptJSONObject.optJSONArray("disable"), ksq0Var)) {
                        sb = new StringBuilder("match diable ");
                    } else {
                        JSONArray jSONArrayM133204f = m133204f(jSONObjectOptJSONObject.optJSONArray("enable"), ksq0Var);
                        if (nvq0.m161753f(jSONArrayM133204f)) {
                            sb = new StringBuilder("not match ");
                        } else {
                            try {
                                jSONObject2.put(next, new JSONObject().put("enable", jSONArrayM133204f));
                            } catch (JSONException unused) {
                            }
                        }
                    }
                    sb.append(next);
                    kwq0.m147628a(sb.toString());
                }
            }
        }
        return jSONObject2;
    }
}
