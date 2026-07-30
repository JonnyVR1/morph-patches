package p149l;

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
public class woq0 {

    /* JADX INFO: renamed from: b */
    protected static volatile tx00 f187460b;

    /* JADX INFO: renamed from: c */
    protected static volatile ConcurrentHashMap<String, tx00> f187461c = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: a */
    protected tx00 f187462a;

    private woq0(tx00 tx00Var) {
        this.f187462a = tx00Var;
        plq0.m170248g(this);
        blq0.m102557e();
        zuq0.m220246h();
    }

    /* JADX INFO: renamed from: a */
    public static Object m204854a() {
        return f187460b;
    }

    /* JADX INFO: renamed from: b */
    public static tx00 m204855b(String str) {
        return f187461c.get(str);
    }

    /* JADX INFO: renamed from: h */
    private JSONObject m204856h(boolean z) {
        tx00 tx00Var;
        jlq0 jlq0Var;
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.f187462a.f172446d.f172458f == null) {
                Context contextM132700i = hrq0.m132700i();
                PackageInfo packageInfo = contextM132700i.getPackageManager().getPackageInfo(contextM132700i.getPackageName(), 128);
                if (packageInfo != null) {
                    tx00.C20306c c20306c = this.f187462a.f172446d;
                    if (c20306c.f172456d == -1) {
                        c20306c.f172456d = packageInfo.versionCode;
                    }
                    if (c20306c.f172457e == null) {
                        c20306c.f172457e = packageInfo.versionName;
                    }
                }
            }
        } catch (Throwable unused) {
        }
        if ((TextUtils.isEmpty(this.f187462a.f172446d.m190928b()) || "0".equals(this.f187462a.f172446d.m190928b())) && (jlq0Var = (tx00Var = this.f187462a).f172447e) != null) {
            tx00Var.f172446d.m190930e(jlq0Var.m142105a(), false);
        }
        try {
            jSONObject.put("aid", String.valueOf(this.f187462a.f172446d.f172453a));
            if (z && !TextUtils.isEmpty(this.f187462a.f172446d.f172454b)) {
                jSONObject.put("x-auth-token", this.f187462a.f172446d.f172454b);
            }
            jSONObject.put("update_version_code", this.f187462a.f172446d.f172456d);
            jSONObject.put("version_code", this.f187462a.f172446d.f172456d);
            jSONObject.put("app_version", this.f187462a.f172446d.f172457e);
            jSONObject.put("channel", this.f187462a.f172446d.f172455c);
            jSONObject.put("package", nvq0.m161751d(this.f187462a.f172446d.f172458f));
            jSONObject.put("device_id", this.f187462a.f172446d.m190928b());
            jSONObject.put("user_id", this.f187462a.f172446d.m190929c());
            jSONObject.put("os", "Android");
            jSONObject.put("so_list", nvq0.m161751d(this.f187462a.f172446d.f172459g));
            jSONObject.put("single_upload", m204870p() ? 1 : 0);
        } catch (JSONException unused2) {
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: i */
    public static void m204857i(tx00 tx00Var) {
        new woq0(tx00Var);
        if (tx00Var == null || tx00Var.f172446d == null) {
            return;
        }
        f187461c.put(tx00Var.f172446d.f172453a, tx00Var);
    }

    /* JADX INFO: renamed from: l */
    public static String m204858l(String str) {
        tx00 tx00Var;
        if (f187460b != null && TextUtils.equals(str, f187460b.f172446d.f172453a)) {
            tx00Var = f187460b;
        } else if (f187461c == null || (tx00Var = f187461c.get(str)) == null) {
            return null;
        }
        return tx00Var.f172446d.f172454b;
    }

    /* JADX INFO: renamed from: m */
    private JSONObject m204859m(CrashType crashType) {
        Map<? extends String, ? extends String> mapM144362a;
        k31 k31Var = this.f187462a.f172443a;
        if (k31Var == null || (mapM144362a = k31Var.m144362a(crashType)) == null) {
            return null;
        }
        return new JSONObject(mapM144362a);
    }

    /* JADX INFO: renamed from: o */
    private JSONObject m204860o(CrashType crashType) {
        return new JSONObject(this.f187462a.f172444b);
    }

    /* JADX INFO: renamed from: q */
    public static String m204861q() {
        if (f187460b == null) {
            return null;
        }
        return f187460b.f172446d.f172453a;
    }

    /* JADX INFO: renamed from: c */
    public JSONArray m204862c(StackTraceElement[] stackTraceElementArr, Throwable th) {
        String[] strArr = this.f187462a.f172446d.f172458f;
        if (strArr == null) {
            return new JSONArray().put(new xwq0.C21250a(0, stackTraceElementArr.length).m211382a());
        }
        if (th == null || stackTraceElementArr == null) {
            return null;
        }
        return xwq0.m211364g(stackTraceElementArr, strArr);
    }

    /* JADX INFO: renamed from: d */
    public JSONArray m204863d(String[] strArr) {
        if (this.f187462a.m190924e().f172458f == null) {
            return new JSONArray().put(new xwq0.C21250a(0, strArr.length).m211382a());
        }
        JSONArray jSONArrayM211365h = xwq0.m211365h(strArr, this.f187462a.f172446d.f172458f);
        try {
            if (nvq0.m161753f(jSONArrayM211365h) && this.f187462a.f172446d.f172463k) {
                String strM215207K = ykq0.m215154A().m215207K();
                if (!TextUtils.isEmpty(strM215207K)) {
                    for (String str : this.f187462a.f172446d.f172458f) {
                        if (strM215207K.contains(str)) {
                            return new JSONArray().put(new xwq0.C21250a(0, strArr.length).m211382a());
                        }
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return jSONArrayM211365h;
    }

    /* JADX INFO: renamed from: e */
    public JSONObject m204864e(CrashType crashType) {
        return m204865f(crashType, null);
    }

    /* JADX INFO: renamed from: f */
    public JSONObject m204865f(CrashType crashType, JSONArray jSONArray) {
        return m204866g(crashType, jSONArray, false);
    }

    /* JADX INFO: renamed from: g */
    public JSONObject m204866g(CrashType crashType, JSONArray jSONArray, boolean z) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("header", m204856h(z));
            if (crashType != null) {
                jSONObject.put("custom", m204859m(crashType));
                jSONObject.put("filters", m204860o(crashType));
            }
            jSONObject.put("line_num", jSONArray);
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: j */
    public boolean m204867j(Object obj) {
        return this.f187462a == obj;
    }

    /* JADX INFO: renamed from: k */
    public String m204868k() {
        return this.f187462a.f172446d.f172453a;
    }

    /* JADX INFO: renamed from: n */
    public JSONObject m204869n() {
        return m204856h(true);
    }

    /* JADX INFO: renamed from: p */
    public boolean m204870p() {
        return false;
    }
}
