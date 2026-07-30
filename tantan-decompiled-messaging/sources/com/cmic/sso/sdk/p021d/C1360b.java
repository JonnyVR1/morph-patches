package com.cmic.sso.sdk.p021d;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.cmic.sso.sdk.C1316a;
import com.cmic.sso.sdk.p014a.C1317a;
import com.cmic.sso.sdk.p016c.p019c.C1351a;
import com.cmic.sso.sdk.p016c.p019c.InterfaceC1354d;
import com.cmic.sso.sdk.p022e.C1363c;
import com.cmic.sso.sdk.p022e.C1366f;
import com.cmic.sso.sdk.p022e.C1371k;
import com.cmic.sso.sdk.p022e.C1373m;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.cmic.sso.sdk.d.b */
/* JADX INFO: loaded from: classes.dex */
public class C1360b {

    /* JADX INFO: renamed from: a */
    private C1316a f5693a;

    /* JADX INFO: renamed from: a */
    private static void m7217a(C1359a c1359a, C1316a c1316a) {
        if (c1359a == null || c1316a == null) {
            return;
        }
        c1359a.m7192b(c1316a.m6969b("appid", ""));
        c1359a.m7195e(C1373m.m7291a());
        c1359a.m7198h(c1316a.m6969b("interfaceType", ""));
        c1359a.m7197g(c1316a.m6969b("interfaceCode", ""));
        c1359a.m7196f(c1316a.m6969b("interfaceElasped", ""));
        c1359a.m7201k(c1316a.m6968b("timeOut"));
        c1359a.m7209s(c1316a.m6968b("traceId"));
        c1359a.m7203m(c1316a.m6968b("simCardNum"));
        c1359a.m7204n(c1316a.m6968b("operatortype"));
        c1359a.m7205o(c1316a.m6968b("networkOperator"));
        c1359a.m7206p(C1373m.m7294b());
        c1359a.m7207q(C1373m.m7295c());
        c1359a.m7213x(String.valueOf(c1316a.m6965b("networktype", 0)));
        c1359a.m7210t(c1316a.m6968b("starttime"));
        c1359a.m7211u(c1316a.m6968b("endtime"));
        c1359a.m7202l(String.valueOf(c1316a.m6966b("systemEndTime", 0L) - c1316a.m6966b("systemStartTime", 0L)));
        c1359a.m7193c(c1316a.m6968b("imsiState"));
        c1359a.m7214y(C1371k.m7281b("AID", ""));
        c1359a.m7215z(c1316a.m6968b("operatortype"));
        c1359a.m7189A(c1316a.m6968b("scripType"));
        c1359a.m7190B(c1316a.m6968b("networkTypeByAPI"));
        C1363c.m7232a("SendLog", "traceId" + c1316a.m6968b("traceId"));
    }

    /* JADX INFO: renamed from: a */
    public void m7220a(Context context, String str, C1316a c1316a) {
        JSONArray jSONArray;
        String str2 = "";
        try {
            C1359a c1359aM6956a = c1316a.m6956a();
            String strM7243b = C1366f.m7243b(context);
            c1359aM6956a.m7194d(str);
            c1359aM6956a.m7212w(c1316a.m6969b("loginMethod", ""));
            if (c1316a.m6970b("isCacheScrip", false)) {
                c1359aM6956a.m7208r("scrip");
            } else {
                c1359aM6956a.m7208r("pgw");
            }
            c1359aM6956a.m7199i(C1366f.m7242a(context));
            if (!TextUtils.isEmpty(strM7243b)) {
                str2 = strM7243b;
            }
            c1359aM6956a.m7200j(str2);
            m7217a(c1359aM6956a, c1316a);
            if (c1359aM6956a.f5667a.size() > 0) {
                jSONArray = new JSONArray();
                for (Throwable th : c1359aM6956a.f5667a) {
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
                c1359aM6956a.f5667a.clear();
            } else {
                jSONArray = null;
            }
            if (jSONArray != null && jSONArray.length() > 0) {
                c1359aM6956a.m7191a(jSONArray);
            }
            C1363c.m7232a("SendLog", "登录日志");
            m7219a(c1359aM6956a.mo7125b(), c1316a);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: a */
    private void m7219a(JSONObject jSONObject, C1316a c1316a) {
        this.f5693a = c1316a;
        m7218a(jSONObject);
    }

    /* JADX INFO: renamed from: a */
    private void m7218a(JSONObject jSONObject) {
        C1351a.m7160a().m7163a(jSONObject, this.f5693a, new InterfaceC1354d() { // from class: com.cmic.sso.sdk.d.b.1
            @Override // com.cmic.sso.sdk.p016c.p019c.InterfaceC1354d
            /* JADX INFO: renamed from: a */
            public void mo7028a(String str, String str2, JSONObject jSONObject2) {
                C1317a c1317aM6967b = C1360b.this.f5693a.m6967b();
                HashMap map = new HashMap();
                if (str.equals("103000")) {
                    map.put("logFailTimes", 0);
                    map.put("logCloseTime", 0L);
                } else if (c1317aM6967b.m6995l() != 0 && c1317aM6967b.m6994k() != 0) {
                    int iM7270a = C1371k.m7270a("logFailTimes", 0) + 1;
                    if (iM7270a >= c1317aM6967b.m6994k()) {
                        map.put("logFailTimes", 0);
                        map.put("logCloseTime", Long.valueOf(System.currentTimeMillis()));
                    } else {
                        map.put("logFailTimes", Integer.valueOf(iM7270a));
                    }
                }
                C1371k.m7279a(map);
            }
        });
    }
}
