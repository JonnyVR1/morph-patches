package com.cmic.sso.sdk.p022d;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.cmic.sso.sdk.C1339a;
import com.cmic.sso.sdk.p015a.C1340a;
import com.cmic.sso.sdk.p017c.p020c.C1374a;
import com.cmic.sso.sdk.p017c.p020c.InterfaceC1377d;
import com.cmic.sso.sdk.p023e.C1386c;
import com.cmic.sso.sdk.p023e.C1389f;
import com.cmic.sso.sdk.p023e.C1394k;
import com.cmic.sso.sdk.p023e.C1396m;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.cmic.sso.sdk.d.b */
/* JADX INFO: loaded from: classes.dex */
public class C1383b {

    /* JADX INFO: renamed from: a */
    private C1339a f5730a;

    /* JADX INFO: renamed from: a */
    private static void m7271a(C1382a c1382a, C1339a c1339a) {
        if (c1382a == null || c1339a == null) {
            return;
        }
        c1382a.m7246b(c1339a.m7023b("appid", ""));
        c1382a.m7249e(C1396m.m7345a());
        c1382a.m7252h(c1339a.m7023b("interfaceType", ""));
        c1382a.m7251g(c1339a.m7023b("interfaceCode", ""));
        c1382a.m7250f(c1339a.m7023b("interfaceElasped", ""));
        c1382a.m7255k(c1339a.m7022b("timeOut"));
        c1382a.m7263s(c1339a.m7022b("traceId"));
        c1382a.m7257m(c1339a.m7022b("simCardNum"));
        c1382a.m7258n(c1339a.m7022b("operatortype"));
        c1382a.m7259o(c1339a.m7022b("networkOperator"));
        c1382a.m7260p(C1396m.m7348b());
        c1382a.m7261q(C1396m.m7349c());
        c1382a.m7267x(String.valueOf(c1339a.m7019b("networktype", 0)));
        c1382a.m7264t(c1339a.m7022b("starttime"));
        c1382a.m7265u(c1339a.m7022b("endtime"));
        c1382a.m7256l(String.valueOf(c1339a.m7020b("systemEndTime", 0L) - c1339a.m7020b("systemStartTime", 0L)));
        c1382a.m7247c(c1339a.m7022b("imsiState"));
        c1382a.m7268y(C1394k.m7335b("AID", ""));
        c1382a.m7269z(c1339a.m7022b("operatortype"));
        c1382a.m7243A(c1339a.m7022b("scripType"));
        c1382a.m7244B(c1339a.m7022b("networkTypeByAPI"));
        C1386c.m7286a("SendLog", "traceId" + c1339a.m7022b("traceId"));
    }

    /* JADX INFO: renamed from: a */
    public void m7274a(Context context, String str, C1339a c1339a) {
        JSONArray jSONArray;
        String str2 = "";
        try {
            C1382a c1382aM7010a = c1339a.m7010a();
            String strM7297b = C1389f.m7297b(context);
            c1382aM7010a.m7248d(str);
            c1382aM7010a.m7266w(c1339a.m7023b("loginMethod", ""));
            if (c1339a.m7024b("isCacheScrip", false)) {
                c1382aM7010a.m7262r("scrip");
            } else {
                c1382aM7010a.m7262r("pgw");
            }
            c1382aM7010a.m7253i(C1389f.m7296a(context));
            if (!TextUtils.isEmpty(strM7297b)) {
                str2 = strM7297b;
            }
            c1382aM7010a.m7254j(str2);
            m7271a(c1382aM7010a, c1339a);
            if (c1382aM7010a.f5704a.size() > 0) {
                jSONArray = new JSONArray();
                for (Throwable th : c1382aM7010a.f5704a) {
                    StringBuffer stringBuffer = new StringBuffer();
                    JSONObject jSONObject = new JSONObject();
                    for (StackTraceElement stackTraceElement : th.getStackTrace()) {
                        stringBuffer.append(SignParameters.NEW_LINE);
                        stringBuffer.append(stackTraceElement.toString());
                    }
                    jSONObject.put("message", th.toString());
                    jSONObject.put("stack", stringBuffer.toString());
                    jSONArray.put(jSONObject);
                }
                c1382aM7010a.f5704a.clear();
            } else {
                jSONArray = null;
            }
            if (jSONArray != null && jSONArray.length() > 0) {
                c1382aM7010a.m7245a(jSONArray);
            }
            C1386c.m7286a("SendLog", "登录日志");
            m7273a(c1382aM7010a.mo7179b(), c1339a);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: a */
    private void m7273a(JSONObject jSONObject, C1339a c1339a) {
        this.f5730a = c1339a;
        m7272a(jSONObject);
    }

    /* JADX INFO: renamed from: a */
    private void m7272a(JSONObject jSONObject) {
        C1374a.m7214a().m7217a(jSONObject, this.f5730a, new InterfaceC1377d() { // from class: com.cmic.sso.sdk.d.b.1
            @Override // com.cmic.sso.sdk.p017c.p020c.InterfaceC1377d
            /* JADX INFO: renamed from: a */
            public void mo7082a(String str, String str2, JSONObject jSONObject2) {
                C1340a c1340aM7021b = C1383b.this.f5730a.m7021b();
                HashMap map = new HashMap();
                if (str.equals("103000")) {
                    map.put("logFailTimes", 0);
                    map.put("logCloseTime", 0L);
                } else if (c1340aM7021b.m7049l() != 0 && c1340aM7021b.m7048k() != 0) {
                    int iM7324a = C1394k.m7324a("logFailTimes", 0) + 1;
                    if (iM7324a >= c1340aM7021b.m7048k()) {
                        map.put("logFailTimes", 0);
                        map.put("logCloseTime", Long.valueOf(System.currentTimeMillis()));
                    } else {
                        map.put("logFailTimes", Integer.valueOf(iM7324a));
                    }
                }
                C1394k.m7333a(map);
            }
        });
    }
}
