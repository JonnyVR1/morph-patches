package p153l;

import com.immomo.medialog.LogLevel;
import com.p051p1.mobile.putong.data.BannerFrequencyType;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class rj20 {
    /* JADX INFO: renamed from: a */
    private static JSONObject m181627a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("log_level", LogLevel.INFO);
        jSONObject.put("log_type", "network_detect");
        jSONObject.put("cctime", System.currentTimeMillis());
        return jSONObject;
    }

    /* JADX INFO: renamed from: b */
    public static void m181628b(boolean z, String str) {
        try {
            JSONObject jSONObjectM181627a = m181627a();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", "CheckerCheck");
            jSONObject.put("success", z);
            jSONObject.put("url", str);
            jSONObjectM181627a.put("body", jSONObject);
            b7y.m102882c().m102897p("v2.mediaTraceLog", jSONObjectM181627a.toString());
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m181629c(yyv yyvVar) {
        try {
            JSONObject jSONObjectM181627a = m181627a();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", "GetPlayUrl");
            jSONObject.put("rst", yyvVar.f202133a);
            jSONObject.put("rstUrl", yyvVar.f202134b);
            jSONObject.put("v4Url", yyvVar.f202135c);
            jSONObject.put("v6Url", yyvVar.f202136d);
            jSONObject.put("failCnt", yyvVar.f202137e);
            jSONObject.put("failSum", yyvVar.f202138f);
            jSONObject.put("noRespCnt", yyvVar.f202139g);
            jSONObject.put("checker", yyvVar.f202140h);
            jSONObject.put("firstTime", yyvVar.f202141i);
            jSONObject.put("enable", yyvVar.f202142j);
            jSONObject.put("enableFst", yyvVar.f202143k);
            jSONObject.put("root", yyvVar.f202144l);
            jSONObject.put("depChecker", yyvVar.f202145m);
            jSONObject.put("failCntLim", yyvVar.f202146n);
            jSONObject.put("failSumLim", yyvVar.f202147o);
            jSONObject.put("noRespLim", yyvVar.f202148p);
            jSONObject.put("retryTime", yyvVar.f202149q);
            jSONObject.put("resetFail", yyvVar.f202150r);
            jSONObject.put("resetNoResp", yyvVar.f202151s);
            jSONObject.put("msg", yyvVar.f202152t);
            jSONObject.put("intervalLim", yyvVar.f202153u);
            jSONObject.put(BannerFrequencyType.interval, yyvVar.f202154v);
            jSONObject.put("timeout", yyvVar.f202155w);
            jSONObjectM181627a.put("body", jSONObject);
            b7y.m102882c().m102897p("v2.mediaTraceLog", jSONObjectM181627a.toString());
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m181630d(yyv yyvVar) {
        try {
            JSONObject jSONObjectM181627a = m181627a();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", "GetPushUrl");
            jSONObject.put("rst", yyvVar.f202133a);
            jSONObject.put("rstUrl", yyvVar.f202134b);
            jSONObject.put("v4Url", yyvVar.f202135c);
            jSONObject.put("v6Url", yyvVar.f202136d);
            jSONObject.put("failSum", yyvVar.f202138f);
            jSONObject.put("checker", yyvVar.f202140h);
            jSONObject.put("firstTime", yyvVar.f202141i);
            jSONObject.put("enable", yyvVar.f202142j);
            jSONObject.put("enableFst", yyvVar.f202143k);
            jSONObject.put("root", yyvVar.f202144l);
            jSONObject.put("failSumLim", yyvVar.f202147o);
            jSONObject.put("msg", yyvVar.f202152t);
            jSONObject.put("intervalLim", yyvVar.f202153u);
            jSONObject.put(BannerFrequencyType.interval, yyvVar.f202154v);
            jSONObject.put("timeout", yyvVar.f202155w);
            jSONObjectM181627a.put("body", jSONObject);
            b7y.m102882c().m102897p("v2.mediaTraceLog", jSONObjectM181627a.toString());
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m181631e(boolean z, String str, boolean z2) {
        try {
            JSONObject jSONObjectM181627a = m181627a();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", "ReportPlayResult");
            jSONObject.put("success", z);
            jSONObject.put("url", str);
            jSONObject.put("cr", z2);
            jSONObjectM181627a.put("body", jSONObject);
            b7y.m102882c().m102897p("v2.mediaTraceLog", jSONObjectM181627a.toString());
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m181632f(boolean z, String str) {
        try {
            JSONObject jSONObjectM181627a = m181627a();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", "ReportPushResult");
            jSONObject.put("success", z);
            jSONObject.put("url", str);
            jSONObjectM181627a.put("body", jSONObject);
            b7y.m102882c().m102897p("v2.mediaTraceLog", jSONObjectM181627a.toString());
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m181633g(boolean z, int i, boolean z2) {
        try {
            JSONObject jSONObjectM181627a = m181627a();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", "Reset");
            jSONObject.put("enable", z);
            jSONObject.put("network", z2);
            jSONObject.put("retry", i);
            jSONObjectM181627a.put("body", jSONObject);
            b7y.m102882c().m102897p("v2.mediaTraceLog", jSONObjectM181627a.toString());
        } catch (Exception unused) {
        }
    }
}
