package p149l;

import com.immomo.medialog.LogLevel;
import com.p046p1.mobile.putong.data.BannerFrequencyType;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class ib20 {
    /* JADX INFO: renamed from: a */
    private static JSONObject m135240a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("log_level", LogLevel.INFO);
        jSONObject.put("log_type", "network_detect");
        jSONObject.put("cctime", System.currentTimeMillis());
        return jSONObject;
    }

    /* JADX INFO: renamed from: b */
    public static void m135241b(boolean z, String str) {
        try {
            JSONObject jSONObjectM135240a = m135240a();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", "CheckerCheck");
            jSONObject.put("success", z);
            jSONObject.put("url", str);
            jSONObjectM135240a.put("body", jSONObject);
            eyx.m118802c().m118817p("v2.mediaTraceLog", jSONObjectM135240a.toString());
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m135242c(zwv zwvVar) {
        try {
            JSONObject jSONObjectM135240a = m135240a();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", "GetPlayUrl");
            jSONObject.put("rst", zwvVar.f205267a);
            jSONObject.put("rstUrl", zwvVar.f205268b);
            jSONObject.put("v4Url", zwvVar.f205269c);
            jSONObject.put("v6Url", zwvVar.f205270d);
            jSONObject.put("failCnt", zwvVar.f205271e);
            jSONObject.put("failSum", zwvVar.f205272f);
            jSONObject.put("noRespCnt", zwvVar.f205273g);
            jSONObject.put("checker", zwvVar.f205274h);
            jSONObject.put("firstTime", zwvVar.f205275i);
            jSONObject.put("enable", zwvVar.f205276j);
            jSONObject.put("enableFst", zwvVar.f205277k);
            jSONObject.put("root", zwvVar.f205278l);
            jSONObject.put("depChecker", zwvVar.f205279m);
            jSONObject.put("failCntLim", zwvVar.f205280n);
            jSONObject.put("failSumLim", zwvVar.f205281o);
            jSONObject.put("noRespLim", zwvVar.f205282p);
            jSONObject.put("retryTime", zwvVar.f205283q);
            jSONObject.put("resetFail", zwvVar.f205284r);
            jSONObject.put("resetNoResp", zwvVar.f205285s);
            jSONObject.put("msg", zwvVar.f205286t);
            jSONObject.put("intervalLim", zwvVar.f205287u);
            jSONObject.put(BannerFrequencyType.interval, zwvVar.f205288v);
            jSONObject.put("timeout", zwvVar.f205289w);
            jSONObjectM135240a.put("body", jSONObject);
            eyx.m118802c().m118817p("v2.mediaTraceLog", jSONObjectM135240a.toString());
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m135243d(zwv zwvVar) {
        try {
            JSONObject jSONObjectM135240a = m135240a();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", "GetPushUrl");
            jSONObject.put("rst", zwvVar.f205267a);
            jSONObject.put("rstUrl", zwvVar.f205268b);
            jSONObject.put("v4Url", zwvVar.f205269c);
            jSONObject.put("v6Url", zwvVar.f205270d);
            jSONObject.put("failSum", zwvVar.f205272f);
            jSONObject.put("checker", zwvVar.f205274h);
            jSONObject.put("firstTime", zwvVar.f205275i);
            jSONObject.put("enable", zwvVar.f205276j);
            jSONObject.put("enableFst", zwvVar.f205277k);
            jSONObject.put("root", zwvVar.f205278l);
            jSONObject.put("failSumLim", zwvVar.f205281o);
            jSONObject.put("msg", zwvVar.f205286t);
            jSONObject.put("intervalLim", zwvVar.f205287u);
            jSONObject.put(BannerFrequencyType.interval, zwvVar.f205288v);
            jSONObject.put("timeout", zwvVar.f205289w);
            jSONObjectM135240a.put("body", jSONObject);
            eyx.m118802c().m118817p("v2.mediaTraceLog", jSONObjectM135240a.toString());
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m135244e(boolean z, String str, boolean z2) {
        try {
            JSONObject jSONObjectM135240a = m135240a();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", "ReportPlayResult");
            jSONObject.put("success", z);
            jSONObject.put("url", str);
            jSONObject.put("cr", z2);
            jSONObjectM135240a.put("body", jSONObject);
            eyx.m118802c().m118817p("v2.mediaTraceLog", jSONObjectM135240a.toString());
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m135245f(boolean z, String str) {
        try {
            JSONObject jSONObjectM135240a = m135240a();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", "ReportPushResult");
            jSONObject.put("success", z);
            jSONObject.put("url", str);
            jSONObjectM135240a.put("body", jSONObject);
            eyx.m118802c().m118817p("v2.mediaTraceLog", jSONObjectM135240a.toString());
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m135246g(boolean z, int i, boolean z2) {
        try {
            JSONObject jSONObjectM135240a = m135240a();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", "Reset");
            jSONObject.put("enable", z);
            jSONObject.put("network", z2);
            jSONObject.put("retry", i);
            jSONObjectM135240a.put("body", jSONObject);
            eyx.m118802c().m118817p("v2.mediaTraceLog", jSONObjectM135240a.toString());
        } catch (Exception unused) {
        }
    }
}
