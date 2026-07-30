package p153l;

import android.text.TextUtils;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.apm.lite.CrashType;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class vuq0 {

    /* JADX INFO: renamed from: a */
    private static ConcurrentLinkedQueue<cyq0> f185839a = new ConcurrentLinkedQueue<>();

    /* JADX INFO: renamed from: b */
    private static ConcurrentHashMap<Integer, cyq0> f185840b = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: l.vuq0$a */
    public interface InterfaceC20938a {
        /* JADX INFO: renamed from: a */
        void mo131857a(JSONObject jSONObject);
    }

    /* JADX INFO: renamed from: a */
    public static File m202877a(File file) {
        return new File(file, "all_data.json");
    }

    /* JADX INFO: renamed from: b */
    public static String m202878b(Object obj) {
        for (cyq0 cyq0Var : f185839a) {
            if (cyq0Var != null && cyq0Var.m113220j(obj)) {
                return cyq0Var.m113221k();
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static JSONArray m202879c() {
        cyq0 next;
        JSONArray jSONArray = new JSONArray();
        Iterator<cyq0> it = f185839a.iterator();
        while (it.hasNext() && (next = it.next()) != null) {
            jSONArray.put(next.m113222n());
        }
        return jSONArray;
    }

    /* JADX INFO: renamed from: d */
    public static JSONArray m202880d(String str) {
        cyq0 next;
        JSONArray jSONArray = new JSONArray();
        String[] strArrSplit = str.split(SignParameters.NEW_LINE);
        Iterator<cyq0> it = f185839a.iterator();
        while (it.hasNext() && (next = it.next()) != null) {
            if (nrq0.m164512i(next.m113221k())) {
                JSONArray jSONArrayM113216d = next.m113216d(strArrSplit);
                if (!t4r0.m189302f(jSONArrayM113216d)) {
                    jSONArray.put(next.m113218f(CrashType.ANR, jSONArrayM113216d));
                }
            }
        }
        return jSONArray;
    }

    /* JADX INFO: renamed from: e */
    public static JSONArray m202881e(String str, String str2, JSONArray jSONArray) {
        JSONObject jSONObjectOptJSONObject;
        JSONArray jSONArray2 = new JSONArray();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObjectOptJSONObject2 = jSONArray.optJSONObject(i);
            if (jSONObjectOptJSONObject2 != null && (jSONObjectOptJSONObject = jSONObjectOptJSONObject2.optJSONObject("header")) != null) {
                String strValueOf = String.valueOf(jSONObjectOptJSONObject.opt("aid"));
                if (nrq0.m164514k(strValueOf)) {
                    try {
                        String strM113211l = cyq0.m113211l(strValueOf);
                        if (!TextUtils.isEmpty(strM113211l)) {
                            jSONObjectOptJSONObject.put("x-auth-token", strM113211l);
                        }
                    } catch (Throwable unused) {
                    }
                    if (TextUtils.isEmpty(jSONObjectOptJSONObject.optString("package"))) {
                        jSONArray2.put(jSONObjectOptJSONObject2);
                        break;
                    }
                    JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("so_list");
                    if (!t4r0.m189302f(jSONArrayOptJSONArray)) {
                        for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                            if (str.contains(jSONArrayOptJSONArray.optString(i2))) {
                                jSONArray2.put(jSONObjectOptJSONObject2);
                                break;
                                break;
                            }
                        }
                    }
                }
            }
        }
        return jSONArray2;
    }

    /* JADX INFO: renamed from: f */
    public static JSONArray m202882f(Throwable th, Thread thread, File file) {
        cyq0 next;
        JSONArray jSONArray = new JSONArray();
        StackTraceElement[] stackTraceElementArrM114525t = d6r0.m114525t(th);
        Iterator<cyq0> it = f185839a.iterator();
        while (it.hasNext() && (next = it.next()) != null) {
            if (nrq0.m164510g(next.m113221k())) {
                JSONArray jSONArrayM113215c = next.m113215c(stackTraceElementArrM114525t, th);
                if (!t4r0.m189302f(jSONArrayM113215c)) {
                    jSONArray.put(next.m113218f(CrashType.JAVA, jSONArrayM113215c));
                }
            } else {
                q5r0.m175511a("not enable javaCrash aid: " + next.m113221k());
            }
        }
        if (t4r0.m189302f(jSONArray)) {
            return null;
        }
        if (file != null) {
            try {
                r3r0.m179686l(new File(file, "all_data.json"), jSONArray, false);
            } catch (IOException unused) {
            }
        }
        return jSONArray;
    }

    /* JADX INFO: renamed from: g */
    public static void m202883g(cyq0 cyq0Var) {
        f185839a.add(cyq0Var);
        if (cyq0Var.m113223p()) {
            f185840b.put(4444, cyq0Var);
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m202884h(JSONObject jSONObject, JSONArray jSONArray, InterfaceC20938a interfaceC20938a) {
        JSONObject jSONObjectOptJSONObject;
        q5r0.m175511a("uploadFromFile with allData " + jSONArray);
        JSONArray jSONArray2 = new JSONArray();
        for (int i = 0; i < jSONArray.length() && (jSONObjectOptJSONObject = jSONArray.optJSONObject(i)) != null; i++) {
            if (t4r0.m189297a(jSONObjectOptJSONObject, 0, "header", "single_upload") == 1) {
                JSONObject jSONObject2 = new JSONObject();
                gsq0.m132117u(jSONObject2, jSONObject);
                gsq0.m132117u(jSONObject2, jSONObjectOptJSONObject);
                interfaceC20938a.mo131857a(jSONObject2);
            } else {
                try {
                    String strM113211l = cyq0.m113211l(t4r0.m189305i(jSONObjectOptJSONObject, "header", "aid"));
                    if (!TextUtils.isEmpty(strM113211l)) {
                        JSONObject jSONObject3 = (JSONObject) jSONObjectOptJSONObject.remove("header");
                        jSONObject3.put("x-auth-token", strM113211l);
                        jSONObjectOptJSONObject.put("header", jSONObject3);
                    }
                } catch (Throwable unused) {
                }
                jSONArray2.put(jSONObjectOptJSONObject);
            }
        }
        if (jSONArray2.length() == 0) {
            return;
        }
        JSONObject jSONObject4 = new JSONObject();
        gsq0.m132117u(jSONObject4, jSONObject);
        try {
            jSONObject4.put("all_data", jSONArray2);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        interfaceC20938a.mo131857a(jSONObject4);
    }

    /* JADX INFO: renamed from: i */
    public static JSONArray m202885i() {
        cyq0 next;
        JSONArray jSONArray = new JSONArray();
        Iterator<cyq0> it = f185839a.iterator();
        while (it.hasNext() && (next = it.next()) != null) {
            jSONArray.put(next.m113217e(null));
        }
        return jSONArray;
    }

    /* JADX INFO: renamed from: j */
    public static int m202886j() {
        return f185839a.size();
    }

    /* JADX INFO: renamed from: k */
    public static List<String> m202887k() {
        cyq0 next;
        ArrayList arrayList = new ArrayList();
        Iterator<cyq0> it = f185839a.iterator();
        while (it.hasNext() && (next = it.next()) != null) {
            arrayList.add(next.m113221k());
        }
        return arrayList;
    }
}
