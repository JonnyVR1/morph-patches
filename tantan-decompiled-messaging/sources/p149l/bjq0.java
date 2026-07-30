package p149l;

import android.support.v4.media.session.PlaybackStateCompat;
import com.apm.lite.nativecrash.NativeImpl;
import com.google.android.libraries.places.api.model.PlaceTypes;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class bjq0 {

    /* JADX INFO: renamed from: a */
    protected JSONObject f75930a;

    /* JADX INFO: renamed from: b */
    protected bnq0 f75931b;

    public bjq0() {
        this.f75930a = new JSONObject();
    }

    /* JADX INFO: renamed from: B */
    public static boolean m102192B(String str) {
        return toq0.m189921c(str) > 350;
    }

    /* JADX INFO: renamed from: k */
    public static void m102193k(JSONObject jSONObject, String str, String str2, String str3) {
        if (jSONObject == null) {
            return;
        }
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(str);
        if (jSONObjectOptJSONObject == null) {
            try {
                jSONObjectOptJSONObject = new JSONObject();
                jSONObject.put(str, jSONObjectOptJSONObject);
            } catch (Throwable unused) {
                return;
            }
        }
        jSONObjectOptJSONObject.put(str2, str3);
    }

    /* JADX INFO: renamed from: l */
    public static void m102194l(JSONObject jSONObject, Throwable th) {
        String str = "npth_err_info";
        if (jSONObject.opt("npth_err_info") != null) {
            for (int i = 0; i < 5; i++) {
                if (jSONObject.opt("npth_err_info" + i) == null) {
                    try {
                        str = "npth_err_info" + i;
                    } catch (Throwable unused) {
                        return;
                    }
                }
            }
            return;
        }
        jSONObject.put(str, xwq0.m211359b(th));
    }

    /* JADX INFO: renamed from: m */
    public static void m102195m(JSONObject jSONObject, Map<? extends String, ? extends String> map) {
        if (map != null) {
            try {
                for (Map.Entry<? extends String, ? extends String> entry : map.entrySet()) {
                    jSONObject.put(entry.getKey(), entry.getValue());
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public static void m102196n(JSONObject jSONObject, JSONObject jSONObject2) {
        String str;
        String str2;
        try {
            jSONObject.put(PlaceTypes.STORAGE, jSONObject2);
        } catch (Throwable unused) {
        }
        long jOptLong = jSONObject2.optLong("inner_free");
        long jOptLong2 = jSONObject2.optLong("sdcard_free");
        long jOptLong3 = jSONObject2.optLong("inner_free_real");
        String str3 = "64M - ";
        if (jOptLong <= 1024) {
            str = "0 - 1K";
        } else if (jOptLong <= 65536) {
            str = "1K - 64K";
        } else if (jOptLong <= PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED) {
            str = "64K - 512K";
        } else if (jOptLong <= PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) {
            str = "512K - 1M";
        } else {
            str = jOptLong <= 67108864 ? "1M - 64M" : "64M - ";
        }
        if (jOptLong3 <= 1024) {
            str2 = "0 - 1K";
        } else if (jOptLong3 <= 65536) {
            str2 = "1K - 64K";
        } else if (jOptLong3 <= PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED) {
            str2 = "64K - 512K";
        } else if (jOptLong3 <= PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) {
            str2 = "512K - 1M";
        } else {
            str2 = jOptLong3 <= 67108864 ? "1M - 64M" : "64M - ";
        }
        if (jOptLong2 <= 1024) {
            str3 = "0 - 1K";
        } else if (jOptLong2 <= 65536) {
            str3 = "1K - 64K";
        } else if (jOptLong2 <= PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED) {
            str3 = "64K - 512K";
        } else if (jOptLong2 <= PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) {
            str3 = "512K - 1M";
        } else if (jOptLong2 <= 67108864) {
            str3 = "1M - 64M";
        }
        m102193k(jSONObject, "filters", "inner_free", str);
        m102193k(jSONObject, "filters", "inner_free_real", str2);
        m102193k(jSONObject, "filters", "sdcard_free", str3);
    }

    /* JADX INFO: renamed from: p */
    public static boolean m102197p(String str) {
        return dwq0.m113926n(str).exists();
    }

    /* JADX INFO: renamed from: u */
    public static void m102198u(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONObject jSONObject3;
        JSONObject jSONObject4;
        if (jSONObject == null || jSONObject2 == null || jSONObject2.length() <= 0) {
            return;
        }
        try {
            Iterator<String> itKeys = jSONObject2.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                Object objOpt = jSONObject.opt(next);
                if (objOpt != null) {
                    if (objOpt instanceof JSONObject) {
                        jSONObject3 = jSONObject.getJSONObject(next);
                        jSONObject4 = jSONObject2.getJSONObject(next);
                    } else if (objOpt instanceof JSONArray) {
                        JSONArray jSONArrayOptJSONArray = jSONObject2.optJSONArray(next);
                        if (jSONArrayOptJSONArray != null) {
                            JSONArray jSONArray = (JSONArray) objOpt;
                            if (jSONArray.length() == 1 && (jSONArray.opt(0) instanceof JSONObject) && (jSONArrayOptJSONArray.opt(0) instanceof JSONObject)) {
                                jSONObject3 = jSONArray.getJSONObject(0);
                                jSONObject4 = jSONArrayOptJSONArray.getJSONObject(0);
                            } else {
                                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                                    jSONArray.put(jSONArrayOptJSONArray.get(i));
                                }
                            }
                        }
                    }
                    m102198u(jSONObject3, jSONObject4);
                }
                jSONObject.put(next, jSONObject2.opt(next));
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: v */
    public static boolean m102199v(String str) {
        return ((long) toq0.m189922d(str)) > hnq0.m131988u();
    }

    /* JADX INFO: renamed from: z */
    public static boolean m102200z(String str) {
        return toq0.m189919a(str) > 960;
    }

    /* JADX INFO: renamed from: A */
    public boolean m102201A() {
        return m102200z(hrq0.m132699h());
    }

    /* JADX INFO: renamed from: C */
    public JSONObject m102202C(String str) {
        Object objOpt = m102206G().opt("data");
        JSONObject jSONObjectOptJSONObject = objOpt instanceof JSONArray ? ((JSONArray) objOpt).optJSONObject(0) : m102206G();
        if (jSONObjectOptJSONObject == null) {
            return new JSONObject();
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject(str);
        if (jSONObjectOptJSONObject2 != null) {
            return jSONObjectOptJSONObject2;
        }
        JSONObject jSONObject = new JSONObject();
        m102217j(str, jSONObject);
        return jSONObject;
    }

    /* JADX INFO: renamed from: D */
    public boolean m102203D() {
        return m102192B(hrq0.m132699h());
    }

    /* JADX INFO: renamed from: E */
    public boolean m102204E() {
        return m102199v(hrq0.m132699h());
    }

    /* JADX INFO: renamed from: F */
    public boolean m102205F() {
        return m102197p(hrq0.m132699h());
    }

    /* JADX INFO: renamed from: G */
    public JSONObject m102206G() {
        return this.f75930a;
    }

    /* JADX INFO: renamed from: H */
    public bnq0 m102207H() {
        if (this.f75931b == null) {
            bnq0 bnq0Var = new bnq0(hrq0.m132700i());
            this.f75931b = bnq0Var;
            m102215h(bnq0Var);
        }
        return this.f75931b;
    }

    /* JADX INFO: renamed from: a */
    public bjq0 m102208a(int i, String str) {
        try {
            this.f75930a.put("miniapp_id", i);
            this.f75930a.put("miniapp_version", str);
            return this;
        } catch (JSONException e) {
            e.printStackTrace();
            return this;
        }
    }

    /* JADX INFO: renamed from: b */
    public bjq0 m102209b(long j) {
        try {
            m102217j("app_start_time", Long.valueOf(j));
            m102217j("app_start_time_readable", new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss", Locale.getDefault()).format(new Date(j)));
            return this;
        } catch (Exception e) {
            e.printStackTrace();
            return this;
        }
    }

    /* JADX INFO: renamed from: c */
    public bjq0 m102210c(String str, String str2) {
        Object objOpt = m102206G().opt("data");
        m102193k(objOpt instanceof JSONArray ? ((JSONArray) objOpt).optJSONObject(0) : m102206G(), "filters", str, str2);
        return this;
    }

    /* JADX INFO: renamed from: d */
    public bjq0 m102211d(String str, JSONArray jSONArray) {
        JSONObject jSONObjectOptJSONObject = m102206G().optJSONObject("custom_long");
        if (jSONObjectOptJSONObject == null) {
            jSONObjectOptJSONObject = new JSONObject();
            m102217j("custom_long", jSONObjectOptJSONObject);
        }
        try {
            jSONObjectOptJSONObject.put(str, jSONArray);
        } catch (JSONException unused) {
        }
        return this;
    }

    /* JADX INFO: renamed from: e */
    public bjq0 m102212e(List<String> list) {
        JSONArray jSONArray = new JSONArray();
        if (list == null || list.isEmpty()) {
            m102217j("patch_info", jSONArray);
            return this;
        }
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next());
        }
        m102217j("patch_info", jSONArray);
        return this;
    }

    /* JADX INFO: renamed from: f */
    public bjq0 m102213f(Map<String, Integer> map) {
        JSONArray jSONArray = new JSONArray();
        if (map != null) {
            try {
                for (String str : map.keySet()) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("package_name", str);
                    jSONObject.put("version_code", map.get(str));
                    jSONArray.put(jSONObject);
                }
            } catch (Exception unused) {
                return this;
            }
        }
        this.f75930a.put("plugin_info", jSONArray);
        return this;
    }

    /* JADX INFO: renamed from: g */
    public bjq0 m102214g(ykq0 ykq0Var) {
        m102217j("activity_trace", ykq0Var.m215206J());
        m102211d("activity_track", ykq0Var.m215208N());
        return this;
    }

    /* JADX INFO: renamed from: h */
    public bjq0 m102215h(bnq0 bnq0Var) {
        m102217j("header", bnq0Var.m102857s());
        this.f75931b = bnq0Var;
        return this;
    }

    /* JADX INFO: renamed from: i */
    public bjq0 m102216i(JSONObject jSONObject) {
        m102217j("header", jSONObject);
        return this;
    }

    /* JADX INFO: renamed from: j */
    public void m102217j(String str, Object obj) {
        try {
            this.f75930a.put(str, obj);
        } catch (Exception e) {
            kwq0.m147634g(e);
        }
    }

    /* JADX INFO: renamed from: o */
    public boolean m102218o() {
        Object objOpt = m102206G().opt("data");
        return !nvq0.m161755h(objOpt instanceof JSONArray ? ((JSONArray) objOpt).optJSONObject(0) : this.f75930a, "logcat");
    }

    /* JADX INFO: renamed from: q */
    public bjq0 m102219q(String str, String str2) {
        Object objOpt = m102206G().opt("data");
        m102193k(objOpt instanceof JSONArray ? ((JSONArray) objOpt).optJSONObject(0) : m102206G(), "custom", str, str2);
        return this;
    }

    /* JADX INFO: renamed from: r */
    public bjq0 m102220r(Map<Integer, String> map) {
        if (map != null && map.size() > 0) {
            JSONObject jSONObject = new JSONObject();
            for (Integer num : map.keySet()) {
                try {
                    jSONObject.put(String.valueOf(num), map.get(num));
                } catch (JSONException e) {
                    kwq0.m147634g(e);
                }
            }
            try {
                this.f75930a.put("sdk_info", jSONObject);
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: s */
    public bjq0 m102221s(JSONObject jSONObject) {
        m102196n(this.f75930a, jSONObject);
        return this;
    }

    /* JADX INFO: renamed from: t */
    public void m102222t() {
        m102210c("has_logcat", String.valueOf(m102218o()));
    }

    /* JADX INFO: renamed from: w */
    public bjq0 m102223w(Map<? extends String, ? extends String> map) {
        if (map != null) {
            JSONObject jSONObjectM102202C = m102202C("filters");
            for (Map.Entry<? extends String, ? extends String> entry : map.entrySet()) {
                try {
                    jSONObjectM102202C.put(entry.getKey(), entry.getValue());
                } catch (JSONException unused) {
                }
            }
            m102217j("filters", jSONObjectM102202C);
        }
        return this;
    }

    /* JADX INFO: renamed from: x */
    public void m102224x() {
        m102210c("is_64_devices", String.valueOf(bnq0.m102836f()));
        m102210c("is_64_runtime", String.valueOf(NativeImpl.m5166n()));
        m102210c("is_x86_devices", String.valueOf(bnq0.m102840j()));
    }

    /* JADX INFO: renamed from: y */
    public void m102225y(JSONObject jSONObject) {
        m102198u(this.f75930a, jSONObject);
    }

    public bjq0(JSONObject jSONObject) {
        this.f75930a = jSONObject;
    }
}
