package p153l;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.text.TextUtils;
import com.apm.lite.CrashType;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class cyq0 {

    /* JADX INFO: renamed from: b */
    protected static volatile d610 f84399b;

    /* JADX INFO: renamed from: c */
    protected static volatile ConcurrentHashMap<String, d610> f84400c = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: a */
    protected d610 f84401a;

    private cyq0(d610 d610Var) {
        this.f84401a = d610Var;
        vuq0.m202883g(this);
        huq0.m137252e();
        f4r0.m124033h();
    }

    /* JADX INFO: renamed from: a */
    public static Object m113207a() {
        return f84399b;
    }

    /* JADX INFO: renamed from: b */
    public static d610 m113208b(String str) {
        return f84400c.get(str);
    }

    /* JADX INFO: renamed from: h */
    private JSONObject m113209h(boolean z) {
        d610 d610Var;
        puq0 puq0Var;
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.f84401a.f85229d.f85241f == null) {
                Context contextM161022i = n0r0.m161022i();
                PackageInfo packageInfo = contextM161022i.getPackageManager().getPackageInfo(contextM161022i.getPackageName(), 128);
                if (packageInfo != null) {
                    d610.C16462c c16462c = this.f84401a.f85229d;
                    if (c16462c.f85239d == -1) {
                        c16462c.f85239d = packageInfo.versionCode;
                    }
                    if (c16462c.f85240e == null) {
                        c16462c.f85240e = packageInfo.versionName;
                    }
                }
            }
        } catch (Throwable unused) {
        }
        if ((TextUtils.isEmpty(this.f84401a.f85229d.m114354b()) || "0".equals(this.f84401a.f85229d.m114354b())) && (puq0Var = (d610Var = this.f84401a).f85230e) != null) {
            d610Var.f85229d.m114356e(puq0Var.m173901a(), false);
        }
        try {
            jSONObject.put("aid", String.valueOf(this.f84401a.f85229d.f85236a));
            if (z && !TextUtils.isEmpty(this.f84401a.f85229d.f85237b)) {
                jSONObject.put("x-auth-token", this.f84401a.f85229d.f85237b);
            }
            jSONObject.put("update_version_code", this.f84401a.f85229d.f85239d);
            jSONObject.put("version_code", this.f84401a.f85229d.f85239d);
            jSONObject.put("app_version", this.f84401a.f85229d.f85240e);
            jSONObject.put("channel", this.f84401a.f85229d.f85238c);
            jSONObject.put("package", t4r0.m189300d(this.f84401a.f85229d.f85241f));
            jSONObject.put("device_id", this.f84401a.f85229d.m114354b());
            jSONObject.put("user_id", this.f84401a.f85229d.m114355c());
            jSONObject.put("os", "Android");
            jSONObject.put("so_list", t4r0.m189300d(this.f84401a.f85229d.f85242g));
            jSONObject.put("single_upload", m113223p() ? 1 : 0);
        } catch (JSONException unused2) {
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: i */
    public static void m113210i(d610 d610Var) {
        new cyq0(d610Var);
        if (d610Var == null || d610Var.f85229d == null) {
            return;
        }
        f84400c.put(d610Var.f85229d.f85236a, d610Var);
    }

    /* JADX INFO: renamed from: l */
    public static String m113211l(String str) {
        d610 d610Var;
        if (f84399b != null && TextUtils.equals(str, f84399b.f85229d.f85236a)) {
            d610Var = f84399b;
        } else if (f84400c == null || (d610Var = f84400c.get(str)) == null) {
            return null;
        }
        return d610Var.f85229d.f85237b;
    }

    /* JADX INFO: renamed from: m */
    private JSONObject m113212m(CrashType crashType) {
        Map<? extends String, ? extends String> mapM179575a;
        r31 r31Var = this.f84401a.f85226a;
        if (r31Var == null || (mapM179575a = r31Var.m179575a(crashType)) == null) {
            return null;
        }
        return new JSONObject(mapM179575a);
    }

    /* JADX INFO: renamed from: o */
    private JSONObject m113213o(CrashType crashType) {
        return new JSONObject(this.f84401a.f85227b);
    }

    /* JADX INFO: renamed from: q */
    public static String m113214q() {
        if (f84399b == null) {
            return null;
        }
        return f84399b.f85229d.f85236a;
    }

    /* JADX INFO: renamed from: c */
    public JSONArray m113215c(StackTraceElement[] stackTraceElementArr, Throwable th) {
        String[] strArr = this.f84401a.f85229d.f85241f;
        if (strArr == null) {
            return new JSONArray().put(new d6r0.C16466a(0, stackTraceElementArr.length).m114530a());
        }
        if (th == null || stackTraceElementArr == null) {
            return null;
        }
        return d6r0.m114512g(stackTraceElementArr, strArr);
    }

    /* JADX INFO: renamed from: d */
    public JSONArray m113216d(String[] strArr) {
        if (this.f84401a.m114350e().f85241f == null) {
            return new JSONArray().put(new d6r0.C16466a(0, strArr.length).m114530a());
        }
        JSONArray jSONArrayM114513h = d6r0.m114513h(strArr, this.f84401a.f85229d.f85241f);
        try {
            if (t4r0.m189302f(jSONArrayM114513h) && this.f84401a.f85229d.f85246k) {
                String strM122734K = euq0.m122681A().m122734K();
                if (!TextUtils.isEmpty(strM122734K)) {
                    for (String str : this.f84401a.f85229d.f85241f) {
                        if (strM122734K.contains(str)) {
                            return new JSONArray().put(new d6r0.C16466a(0, strArr.length).m114530a());
                        }
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return jSONArrayM114513h;
    }

    /* JADX INFO: renamed from: e */
    public JSONObject m113217e(CrashType crashType) {
        return m113218f(crashType, null);
    }

    /* JADX INFO: renamed from: f */
    public JSONObject m113218f(CrashType crashType, JSONArray jSONArray) {
        return m113219g(crashType, jSONArray, false);
    }

    /* JADX INFO: renamed from: g */
    public JSONObject m113219g(CrashType crashType, JSONArray jSONArray, boolean z) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("header", m113209h(z));
            if (crashType != null) {
                jSONObject.put("custom", m113212m(crashType));
                jSONObject.put("filters", m113213o(crashType));
            }
            jSONObject.put("line_num", jSONArray);
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: j */
    public boolean m113220j(Object obj) {
        return this.f84401a == obj;
    }

    /* JADX INFO: renamed from: k */
    public String m113221k() {
        return this.f84401a.f85229d.f85236a;
    }

    /* JADX INFO: renamed from: n */
    public JSONObject m113222n() {
        return m113209h(true);
    }

    /* JADX INFO: renamed from: p */
    public boolean m113223p() {
        return false;
    }
}
