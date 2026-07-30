package p153l;

import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class t4r0 {
    /* JADX INFO: renamed from: a */
    public static int m189297a(JSONObject jSONObject, int i, String... strArr) {
        JSONObject jSONObjectM189306j = m189306j(jSONObject, strArr);
        if (jSONObjectM189306j == null) {
            return i;
        }
        int iOptInt = jSONObjectM189306j.optInt(strArr[strArr.length - 1], i);
        q5r0.m175513c("JSONUtil", "normal get jsonInt: " + strArr[strArr.length - 1] + " : " + iOptInt);
        return iOptInt;
    }

    /* JADX INFO: renamed from: b */
    public static JSONArray m189298b(int i, int i2, JSONArray jSONArray) {
        int i3 = i2 + i;
        if (jSONArray.length() <= i3) {
            return jSONArray;
        }
        JSONArray jSONArray2 = new JSONArray();
        for (int i4 = 0; i4 < i; i4++) {
            jSONArray2.put(jSONArray.opt(i4));
        }
        while (i < i3) {
            jSONArray2.put(jSONArray.opt(jSONArray.length() - (i3 - i)));
            i++;
        }
        return jSONArray2;
    }

    /* JADX INFO: renamed from: c */
    public static JSONArray m189299c(JSONObject jSONObject, String... strArr) {
        JSONObject jSONObjectM189306j = m189306j(jSONObject, strArr);
        if (jSONObjectM189306j == null) {
            return null;
        }
        JSONArray jSONArrayOptJSONArray = jSONObjectM189306j.optJSONArray(strArr[strArr.length - 1]);
        q5r0.m175513c("ApmConfig", "normal get configArray: " + strArr[strArr.length - 1] + " : " + jSONArrayOptJSONArray);
        return jSONArrayOptJSONArray;
    }

    /* JADX INFO: renamed from: d */
    public static JSONArray m189300d(String[] strArr) {
        if (strArr == null) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        for (String str : strArr) {
            jSONArray.put(str);
        }
        return jSONArray;
    }

    /* JADX INFO: renamed from: e */
    public static void m189301e(JSONObject jSONObject, JSONObject jSONObject2) {
        Iterator<String> itKeys = jSONObject2.keys();
        while (itKeys.hasNext()) {
            try {
                String next = itKeys.next();
                if (!jSONObject.has(next)) {
                    jSONObject.put(next, jSONObject2.opt(next));
                }
            } catch (Throwable unused) {
                return;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public static boolean m189302f(JSONArray jSONArray) {
        return jSONArray == null || jSONArray.length() == 0;
    }

    /* JADX INFO: renamed from: g */
    public static boolean m189303g(JSONObject jSONObject) {
        return jSONObject == null || jSONObject.length() == 0;
    }

    /* JADX INFO: renamed from: h */
    public static boolean m189304h(JSONObject jSONObject, String str) {
        return m189303g(jSONObject) || m189302f(jSONObject.optJSONArray(str));
    }

    /* JADX INFO: renamed from: i */
    public static String m189305i(JSONObject jSONObject, String... strArr) {
        JSONObject jSONObjectM189306j = m189306j(jSONObject, strArr);
        if (jSONObjectM189306j == null) {
            return null;
        }
        String strOptString = jSONObjectM189306j.optString(strArr[strArr.length - 1]);
        q5r0.m175513c("ApmConfig", "normal get configArray: " + strArr[strArr.length - 1] + " : " + strOptString);
        return strOptString;
    }

    /* JADX INFO: renamed from: j */
    public static JSONObject m189306j(JSONObject jSONObject, String... strArr) {
        if (jSONObject == null) {
            q5r0.m175514d("JSONUtil", "err get JsonFromParent: null json", new RuntimeException());
            return null;
        }
        for (int i = 0; i < strArr.length - 1; i++) {
            jSONObject = jSONObject.optJSONObject(strArr[i]);
            if (jSONObject == null) {
                q5r0.m175513c("JSONUtil", "err get json: not found node:" + strArr[i]);
                return null;
            }
        }
        return jSONObject;
    }
}
