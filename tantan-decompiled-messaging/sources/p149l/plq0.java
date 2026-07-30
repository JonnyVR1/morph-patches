package p149l;

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
public final class plq0 {

    /* JADX INFO: renamed from: a */
    private static ConcurrentLinkedQueue<woq0> f150159a = new ConcurrentLinkedQueue<>();

    /* JADX INFO: renamed from: b */
    private static ConcurrentHashMap<Integer, woq0> f150160b = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: l.plq0$a */
    public interface InterfaceC19277a {
        /* JADX INFO: renamed from: a */
        void mo97441a(JSONObject jSONObject);
    }

    /* JADX INFO: renamed from: a */
    public static File m170242a(File file) {
        return new File(file, "all_data.json");
    }

    /* JADX INFO: renamed from: b */
    public static String m170243b(Object obj) {
        for (woq0 woq0Var : f150159a) {
            if (woq0Var != null && woq0Var.m204867j(obj)) {
                return woq0Var.m204868k();
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static JSONArray m170244c() {
        woq0 next;
        JSONArray jSONArray = new JSONArray();
        Iterator<woq0> it = f150159a.iterator();
        while (it.hasNext() && (next = it.next()) != null) {
            jSONArray.put(next.m204869n());
        }
        return jSONArray;
    }

    /* JADX INFO: renamed from: d */
    public static JSONArray m170245d(String str) {
        woq0 next;
        JSONArray jSONArray = new JSONArray();
        String[] strArrSplit = str.split(SignParameters.NEW_LINE);
        Iterator<woq0> it = f150159a.iterator();
        while (it.hasNext() && (next = it.next()) != null) {
            if (iiq0.m136434i(next.m204868k())) {
                JSONArray jSONArrayM204863d = next.m204863d(strArrSplit);
                if (!nvq0.m161753f(jSONArrayM204863d)) {
                    jSONArray.put(next.m204865f(CrashType.ANR, jSONArrayM204863d));
                }
            }
        }
        return jSONArray;
    }

    /* JADX INFO: renamed from: e */
    public static JSONArray m170246e(String str, String str2, JSONArray jSONArray) {
        JSONObject jSONObjectOptJSONObject;
        JSONArray jSONArray2 = new JSONArray();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObjectOptJSONObject2 = jSONArray.optJSONObject(i);
            if (jSONObjectOptJSONObject2 != null && (jSONObjectOptJSONObject = jSONObjectOptJSONObject2.optJSONObject("header")) != null) {
                String strValueOf = String.valueOf(jSONObjectOptJSONObject.opt("aid"));
                if (iiq0.m136436k(strValueOf)) {
                    try {
                        String strM204858l = woq0.m204858l(strValueOf);
                        if (!TextUtils.isEmpty(strM204858l)) {
                            jSONObjectOptJSONObject.put("x-auth-token", strM204858l);
                        }
                    } catch (Throwable unused) {
                    }
                    if (TextUtils.isEmpty(jSONObjectOptJSONObject.optString("package"))) {
                        jSONArray2.put(jSONObjectOptJSONObject2);
                        break;
                    }
                    JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("so_list");
                    if (!nvq0.m161753f(jSONArrayOptJSONArray)) {
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
    public static JSONArray m170247f(Throwable th, Thread thread, File file) {
        woq0 next;
        JSONArray jSONArray = new JSONArray();
        StackTraceElement[] stackTraceElementArrM211377t = xwq0.m211377t(th);
        Iterator<woq0> it = f150159a.iterator();
        while (it.hasNext() && (next = it.next()) != null) {
            if (iiq0.m136432g(next.m204868k())) {
                JSONArray jSONArrayM204862c = next.m204862c(stackTraceElementArrM211377t, th);
                if (!nvq0.m161753f(jSONArrayM204862c)) {
                    jSONArray.put(next.m204865f(CrashType.JAVA, jSONArrayM204862c));
                }
            } else {
                kwq0.m147628a("not enable javaCrash aid: " + next.m204868k());
            }
        }
        if (nvq0.m161753f(jSONArray)) {
            return null;
        }
        if (file != null) {
            try {
                luq0.m151798l(new File(file, "all_data.json"), jSONArray, false);
            } catch (IOException unused) {
            }
        }
        return jSONArray;
    }

    /* JADX INFO: renamed from: g */
    public static void m170248g(woq0 woq0Var) {
        f150159a.add(woq0Var);
        if (woq0Var.m204870p()) {
            f150160b.put(4444, woq0Var);
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m170249h(JSONObject jSONObject, JSONArray jSONArray, InterfaceC19277a interfaceC19277a) {
        JSONObject jSONObjectOptJSONObject;
        kwq0.m147628a("uploadFromFile with allData " + jSONArray);
        JSONArray jSONArray2 = new JSONArray();
        for (int i = 0; i < jSONArray.length() && (jSONObjectOptJSONObject = jSONArray.optJSONObject(i)) != null; i++) {
            if (nvq0.m161748a(jSONObjectOptJSONObject, 0, "header", "single_upload") == 1) {
                JSONObject jSONObject2 = new JSONObject();
                bjq0.m102198u(jSONObject2, jSONObject);
                bjq0.m102198u(jSONObject2, jSONObjectOptJSONObject);
                interfaceC19277a.mo97441a(jSONObject2);
            } else {
                try {
                    String strM204858l = woq0.m204858l(nvq0.m161756i(jSONObjectOptJSONObject, "header", "aid"));
                    if (!TextUtils.isEmpty(strM204858l)) {
                        JSONObject jSONObject3 = (JSONObject) jSONObjectOptJSONObject.remove("header");
                        jSONObject3.put("x-auth-token", strM204858l);
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
        bjq0.m102198u(jSONObject4, jSONObject);
        try {
            jSONObject4.put("all_data", jSONArray2);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        interfaceC19277a.mo97441a(jSONObject4);
    }

    /* JADX INFO: renamed from: i */
    public static JSONArray m170250i() {
        woq0 next;
        JSONArray jSONArray = new JSONArray();
        Iterator<woq0> it = f150159a.iterator();
        while (it.hasNext() && (next = it.next()) != null) {
            jSONArray.put(next.m204864e(null));
        }
        return jSONArray;
    }

    /* JADX INFO: renamed from: j */
    public static int m170251j() {
        return f150159a.size();
    }

    /* JADX INFO: renamed from: k */
    public static List<String> m170252k() {
        woq0 next;
        ArrayList arrayList = new ArrayList();
        Iterator<woq0> it = f150159a.iterator();
        while (it.hasNext() && (next = it.next()) != null) {
            arrayList.add(next.m204868k());
        }
        return arrayList;
    }
}
