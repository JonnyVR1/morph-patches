package com.cmic.sso.sdk.p017c.p020c;

import android.os.SystemClock;
import com.cmic.sso.sdk.C1339a;
import com.cmic.sso.sdk.C1356b;
import com.cmic.sso.sdk.auth.AuthnHelper;
import com.cmic.sso.sdk.auth.C1355c;
import com.cmic.sso.sdk.p015a.C1340a;
import com.cmic.sso.sdk.p017c.p018a.C1360a;
import com.cmic.sso.sdk.p017c.p018a.C1362c;
import com.cmic.sso.sdk.p017c.p018a.C1363d;
import com.cmic.sso.sdk.p017c.p019b.C1366b;
import com.cmic.sso.sdk.p017c.p019b.C1369e;
import com.cmic.sso.sdk.p017c.p019b.C1370f;
import com.cmic.sso.sdk.p017c.p019b.C1372h;
import com.cmic.sso.sdk.p017c.p021d.C1379a;
import com.cmic.sso.sdk.p017c.p021d.C1380b;
import com.cmic.sso.sdk.p017c.p021d.InterfaceC1381c;
import com.cmic.sso.sdk.p023e.C1386c;
import com.cmic.sso.sdk.p023e.C1392i;
import com.cmic.sso.sdk.p023e.C1394k;
import com.cmic.sso.sdk.p023e.C1396m;
import com.cmic.sso.sdk.p023e.C1398o;
import com.cmic.sso.sdk.p023e.C1400q;
import com.tencent.open.SocialConstants;
import org.fourthline.cling.model.UserConstants;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.cmic.sso.sdk.c.c.a */
/* JADX INFO: loaded from: classes.dex */
public class C1374a {

    /* JADX INFO: renamed from: a */
    private static C1374a f5673a;

    private C1374a() {
    }

    /* JADX INFO: renamed from: a */
    public void m7216a(C1339a c1339a, InterfaceC1377d interfaceC1377d) {
        C1376c c1376c;
        String strM7315a;
        int iM7025c = c1339a.m7025c("networktype");
        C1372h c1372h = new C1372h();
        c1372h.m7158b("1.0");
        c1372h.m7159c(AuthnHelper.SDK_VERSION);
        c1372h.m7160d(c1339a.m7022b("appid"));
        c1372h.m7161e(c1339a.m7022b("operatortype"));
        c1372h.m7162f(iM7025c + "");
        c1372h.m7163g(C1396m.m7345a());
        c1372h.m7164h(C1396m.m7348b());
        c1372h.m7165i(C1396m.m7349c());
        c1372h.m7166j("0");
        c1372h.m7167k("3.0");
        c1372h.m7168l(C1400q.m7361b());
        c1372h.m7169m(C1398o.m7355a());
        c1372h.m7171o(c1339a.m7022b("apppackage"));
        c1372h.m7172p(c1339a.m7022b("appsign"));
        c1372h.mo7157a(C1394k.m7335b("AID", ""));
        if (c1339a.m7025c("logintype") == 3 || c1339a.m7024b("isRisk", false)) {
            c1372h.m7175s("pre");
        } else {
            c1372h.m7212x(c1339a.m7022b("userCapaid"));
            if (c1339a.m7025c("logintype") == 1) {
                c1372h.m7212x("200");
            } else {
                c1372h.m7212x("50");
            }
            c1372h.m7175s("authz");
        }
        C1400q.m7358a(c1339a, "scripAndTokenForHttps");
        C1340a c1340aM7021b = c1339a.m7021b();
        if (c1339a.m7024b("isCacheScrip", false) || c1339a.m7024b("isGotScrip", false)) {
            c1372h.m7211w(c1339a.m7022b("phonescrip"));
            c1372h.m7170n(c1372h.m7210v(c1339a.m7022b("appkey")));
            c1376c = new C1376c("https://" + c1340aM7021b.m7038a() + "/unisdk/rs/scripAndTokenForHttps", c1372h, "POST", c1339a.m7022b("traceId"));
            c1376c.m7225a("defendEOF", "0");
        } else {
            C1369e c1369e = new C1369e();
            c1369e.m7191a(c1339a.m7018a(C1356b.a.f5586a));
            c1369e.m7193b(c1339a.m7018a(C1356b.a.f5587b));
            c1369e.m7189a(c1372h);
            c1369e.m7190a(false);
            c1339a.m7016a("isCloseIpv4", c1340aM7021b.m7045h());
            c1339a.m7016a("isCloseIpv6", c1340aM7021b.m7046i());
            String str = "https://" + c1340aM7021b.m7039b() + "/unisdk/rs/scripAndTokenForHttps";
            if (c1339a.m7024b("use2048PublicKey", false)) {
                C1386c.m7286a("BaseRequest", "使用2对应的编码");
                c1369e.m7192b("2");
                strM7315a = C1392i.m7312a().m7316b(c1339a.m7018a(C1356b.a.f5586a));
            } else {
                strM7315a = C1392i.m7312a().m7315a(c1339a.m7018a(C1356b.a.f5586a));
            }
            c1369e.m7195c(strM7315a);
            c1376c = new C1375b(str, c1369e, "POST", c1339a.m7022b("traceId"));
            c1376c.m7225a("defendEOF", "1");
            if (iM7025c == 3) {
                c1376c.m7226a(true);
                c1339a.m7016a("doNetworkSwitch", true);
            } else {
                c1376c.m7226a(false);
                c1339a.m7016a("doNetworkSwitch", false);
            }
        }
        c1376c.m7225a("interfaceVersion", "3.0");
        m7215a(c1376c, interfaceC1377d, c1339a);
    }

    /* JADX INFO: renamed from: a */
    public void m7218a(boolean z, C1339a c1339a, InterfaceC1377d interfaceC1377d) {
        C1366b c1366b = new C1366b();
        c1366b.m7180b("1.0");
        c1366b.m7181c("Android");
        c1366b.m7182d(C1394k.m7335b("AID", ""));
        c1366b.m7183e(z ? "1" : "0");
        c1366b.m7184f(AuthnHelper.SDK_VERSION);
        c1366b.m7185g(c1339a.m7022b("appid"));
        c1366b.m7186h(c1366b.m7210v("iYm0HAnkxQtpvN44"));
        m7215a(new C1376c("https://" + c1339a.m7021b().m7040c() + "/client/uniConfig", c1366b, "POST", c1339a.m7022b("traceId")), interfaceC1377d, c1339a);
    }

    /* JADX INFO: renamed from: a */
    public static C1374a m7214a() {
        if (f5673a == null) {
            synchronized (C1374a.class) {
                try {
                    if (f5673a == null) {
                        f5673a = new C1374a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f5673a;
    }

    /* JADX INFO: renamed from: a */
    public void m7217a(JSONObject jSONObject, C1339a c1339a, InterfaceC1377d interfaceC1377d) {
        C1370f c1370f = new C1370f();
        C1370f.a aVar = new C1370f.a();
        C1370f.b bVar = new C1370f.b();
        bVar.m7207e(C1400q.m7361b());
        bVar.m7209f(C1398o.m7355a());
        bVar.m7201b(UserConstants.PRODUCT_TOKEN_VERSION);
        bVar.m7203c(c1339a.m7023b("appid", ""));
        bVar.m7205d(bVar.m7210v(""));
        aVar.m7199a(jSONObject);
        c1370f.m7196a(aVar);
        c1370f.m7197a(bVar);
        m7215a(new C1376c("https://" + c1339a.m7021b().m7041d() + "/log/logReport", c1370f, "POST", c1339a.m7022b("traceId")), interfaceC1377d, c1339a);
    }

    /* JADX INFO: renamed from: a */
    private void m7215a(final C1376c c1376c, final InterfaceC1377d interfaceC1377d, final C1339a c1339a) {
        C1363d c1363d = new C1363d();
        C1362c c1362c = new C1362c();
        C1360a c1360a = new C1360a();
        c1363d.m7149a(c1362c);
        c1362c.m7145a(c1360a);
        c1376c.m7223a(SystemClock.elapsedRealtime());
        c1363d.mo7143a(c1376c, new InterfaceC1381c() { // from class: com.cmic.sso.sdk.c.c.a.1
            @Override // com.cmic.sso.sdk.p017c.p021d.InterfaceC1381c
            /* JADX INFO: renamed from: a */
            public void mo7148a(C1380b c1380b) {
                try {
                    m7219a();
                    JSONObject jSONObject = new JSONObject(c1380b.m7241c());
                    String string = jSONObject.has("resultcode") ? jSONObject.getString("resultcode") : jSONObject.getString("resultCode");
                    C1400q.m7362b(c1339a, string);
                    interfaceC1377d.mo7082a(string, jSONObject.optString(SocialConstants.PARAM_APP_DESC), jSONObject);
                } catch (Exception e) {
                    e.printStackTrace();
                    mo7147a(C1379a.m7236a(102223));
                }
            }

            @Override // com.cmic.sso.sdk.p017c.p021d.InterfaceC1381c
            /* JADX INFO: renamed from: a */
            public void mo7147a(C1379a c1379a) {
                m7219a();
                C1400q.m7362b(c1339a, String.valueOf(c1379a.m7237a()));
                interfaceC1377d.mo7082a(String.valueOf(c1379a.m7237a()), c1379a.m7238b(), C1355c.m7125a(String.valueOf(c1379a.m7237a()), c1379a.m7238b()));
            }

            /* JADX INFO: renamed from: a */
            private void m7219a() {
                if (c1376c.m7222a().contains("uniConfig")) {
                    return;
                }
                C1400q.m7364c(c1339a, String.valueOf(SystemClock.elapsedRealtime() - c1376c.m7233h()));
            }
        }, c1339a);
    }
}
