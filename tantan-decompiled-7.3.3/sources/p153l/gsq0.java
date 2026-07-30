package p153l;

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
public class gsq0 {

    /* JADX INFO: renamed from: a */
    protected JSONObject f106323a;

    /* JADX INFO: renamed from: b */
    protected hwq0 f106324b;

    public gsq0() {
        this.f106323a = new JSONObject();
    }

    /* JADX INFO: renamed from: B */
    public static boolean m132111B(String str) {
        return zxq0.m222066c(str) > 350;
    }

    /* JADX INFO: renamed from: k */
    public static void m132112k(JSONObject jSONObject, String str, String str2, String str3) {
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
    public static void m132113l(JSONObject jSONObject, Throwable th) {
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
        jSONObject.put(str, d6r0.m114507b(th));
    }

    /* JADX INFO: renamed from: m */
    public static void m132114m(JSONObject jSONObject, Map<? extends String, ? extends String> map) {
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
    public static void m132115n(JSONObject jSONObject, JSONObject jSONObject2) {
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
        m132112k(jSONObject, "filters", "inner_free", str);
        m132112k(jSONObject, "filters", "inner_free_real", str2);
        m132112k(jSONObject, "filters", "sdcard_free", str3);
    }

    /* JADX INFO: renamed from: p */
    public static boolean m132116p(String str) {
        return j5r0.m143578n(str).exists();
    }

    /* JADX INFO: renamed from: u */
    public static void m132117u(JSONObject jSONObject, JSONObject jSONObject2) {
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
                    m132117u(jSONObject3, jSONObject4);
                }
                jSONObject.put(next, jSONObject2.opt(next));
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: v */
    public static boolean m132118v(String str) {
        return ((long) zxq0.m222067d(str)) > nwq0.m165017u();
    }

    /* JADX INFO: renamed from: z */
    public static boolean m132119z(String str) {
        return zxq0.m222064a(str) > 960;
    }

    /* JADX INFO: renamed from: A */
    public boolean m132120A() {
        return m132119z(n0r0.m161021h());
    }

    /* JADX INFO: renamed from: C */
    public JSONObject m132121C(String str) {
        Object objOpt = m132125G().opt("data");
        JSONObject jSONObjectOptJSONObject = objOpt instanceof JSONArray ? ((JSONArray) objOpt).optJSONObject(0) : m132125G();
        if (jSONObjectOptJSONObject == null) {
            return new JSONObject();
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject(str);
        if (jSONObjectOptJSONObject2 != null) {
            return jSONObjectOptJSONObject2;
        }
        JSONObject jSONObject = new JSONObject();
        m132136j(str, jSONObject);
        return jSONObject;
    }

    /* JADX INFO: renamed from: D */
    public boolean m132122D() {
        return m132111B(n0r0.m161021h());
    }

    /* JADX INFO: renamed from: E */
    public boolean m132123E() {
        return m132118v(n0r0.m161021h());
    }

    /* JADX INFO: renamed from: F */
    public boolean m132124F() {
        return m132116p(n0r0.m161021h());
    }

    /* JADX INFO: renamed from: G */
    public JSONObject m132125G() {
        return this.f106323a;
    }

    /* JADX INFO: renamed from: H */
    public hwq0 m132126H() {
        if (this.f106324b == null) {
            hwq0 hwq0Var = new hwq0(n0r0.m161022i());
            this.f106324b = hwq0Var;
            m132134h(hwq0Var);
        }
        return this.f106324b;
    }

    /* JADX INFO: renamed from: a */
    public gsq0 m132127a(int i, String str) {
        try {
            this.f106323a.put("miniapp_id", i);
            this.f106323a.put("miniapp_version", str);
            return this;
        } catch (JSONException e) {
            e.printStackTrace();
            return this;
        }
    }

    /* JADX INFO: renamed from: b */
    public gsq0 m132128b(long j) {
        try {
            m132136j("app_start_time", Long.valueOf(j));
            m132136j("app_start_time_readable", new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss", Locale.getDefault()).format(new Date(j)));
            return this;
        } catch (Exception e) {
            e.printStackTrace();
            return this;
        }
    }

    /* JADX INFO: renamed from: c */
    public gsq0 m132129c(String str, String str2) {
        Object objOpt = m132125G().opt("data");
        m132112k(objOpt instanceof JSONArray ? ((JSONArray) objOpt).optJSONObject(0) : m132125G(), "filters", str, str2);
        return this;
    }

    /* JADX INFO: renamed from: d */
    public gsq0 m132130d(String str, JSONArray jSONArray) {
        JSONObject jSONObjectOptJSONObject = m132125G().optJSONObject("custom_long");
        if (jSONObjectOptJSONObject == null) {
            jSONObjectOptJSONObject = new JSONObject();
            m132136j("custom_long", jSONObjectOptJSONObject);
        }
        try {
            jSONObjectOptJSONObject.put(str, jSONArray);
        } catch (JSONException unused) {
        }
        return this;
    }

    /* JADX INFO: renamed from: e */
    public gsq0 m132131e(List<String> list) {
        JSONArray jSONArray = new JSONArray();
        if (list == null || list.isEmpty()) {
            m132136j("patch_info", jSONArray);
            return this;
        }
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next());
        }
        m132136j("patch_info", jSONArray);
        return this;
    }

    /* JADX INFO: renamed from: f */
    public gsq0 m132132f(Map<String, Integer> map) {
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
        this.f106323a.put("plugin_info", jSONArray);
        return this;
    }

    /* JADX INFO: renamed from: g */
    public gsq0 m132133g(euq0 euq0Var) {
        m132136j("activity_trace", euq0Var.m122733J());
        m132130d("activity_track", euq0Var.m122735N());
        return this;
    }

    /* JADX INFO: renamed from: h */
    public gsq0 m132134h(hwq0 hwq0Var) {
        m132136j("header", hwq0Var.m137501s());
        this.f106324b = hwq0Var;
        return this;
    }

    /* JADX INFO: renamed from: i */
    public gsq0 m132135i(JSONObject jSONObject) {
        m132136j("header", jSONObject);
        return this;
    }

    /* JADX INFO: renamed from: j */
    public void m132136j(String str, Object obj) {
        try {
            this.f106323a.put(str, obj);
        } catch (Exception e) {
            q5r0.m175517g(e);
        }
    }

    /* JADX INFO: renamed from: o */
    public boolean m132137o() {
        Object objOpt = m132125G().opt("data");
        return !t4r0.m189304h(objOpt instanceof JSONArray ? ((JSONArray) objOpt).optJSONObject(0) : this.f106323a, "logcat");
    }

    /* JADX INFO: renamed from: q */
    public gsq0 m132138q(String str, String str2) {
        Object objOpt = m132125G().opt("data");
        m132112k(objOpt instanceof JSONArray ? ((JSONArray) objOpt).optJSONObject(0) : m132125G(), "custom", str, str2);
        return this;
    }

    /* JADX INFO: renamed from: r */
    public gsq0 m132139r(Map<Integer, String> map) {
        if (map != null && map.size() > 0) {
            JSONObject jSONObject = new JSONObject();
            for (Integer num : map.keySet()) {
                try {
                    jSONObject.put(String.valueOf(num), map.get(num));
                } catch (JSONException e) {
                    q5r0.m175517g(e);
                }
            }
            try {
                this.f106323a.put("sdk_info", jSONObject);
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: s */
    public gsq0 m132140s(JSONObject jSONObject) {
        m132115n(this.f106323a, jSONObject);
        return this;
    }

    /* JADX INFO: renamed from: t */
    public void m132141t() {
        m132129c("has_logcat", String.valueOf(m132137o()));
    }

    /* JADX INFO: renamed from: w */
    public gsq0 m132142w(Map<? extends String, ? extends String> map) {
        if (map != null) {
            JSONObject jSONObjectM132121C = m132121C("filters");
            for (Map.Entry<? extends String, ? extends String> entry : map.entrySet()) {
                try {
                    jSONObjectM132121C.put(entry.getKey(), entry.getValue());
                } catch (JSONException unused) {
                }
            }
            m132136j("filters", jSONObjectM132121C);
        }
        return this;
    }

    /* JADX INFO: renamed from: x */
    public void m132143x() {
        m132129c("is_64_devices", String.valueOf(hwq0.m137480f()));
        m132129c("is_64_runtime", String.valueOf(NativeImpl.m5176n()));
        m132129c("is_x86_devices", String.valueOf(hwq0.m137484j()));
    }

    /* JADX INFO: renamed from: y */
    public void m132144y(JSONObject jSONObject) {
        m132117u(this.f106323a, jSONObject);
    }

    public gsq0(JSONObject jSONObject) {
        this.f106323a = jSONObject;
    }
}
