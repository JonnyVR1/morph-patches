package com.cmic.sso.sdk.p016c.p019c;

import android.os.SystemClock;
import com.cmic.sso.sdk.C1316a;
import com.cmic.sso.sdk.C1333b;
import com.cmic.sso.sdk.auth.AuthnHelper;
import com.cmic.sso.sdk.auth.C1332c;
import com.cmic.sso.sdk.p014a.C1317a;
import com.cmic.sso.sdk.p016c.p017a.C1337a;
import com.cmic.sso.sdk.p016c.p017a.C1339c;
import com.cmic.sso.sdk.p016c.p017a.C1340d;
import com.cmic.sso.sdk.p016c.p018b.C1343b;
import com.cmic.sso.sdk.p016c.p018b.C1346e;
import com.cmic.sso.sdk.p016c.p018b.C1347f;
import com.cmic.sso.sdk.p016c.p018b.C1349h;
import com.cmic.sso.sdk.p016c.p020d.C1356a;
import com.cmic.sso.sdk.p016c.p020d.C1357b;
import com.cmic.sso.sdk.p016c.p020d.InterfaceC1358c;
import com.cmic.sso.sdk.p022e.C1363c;
import com.cmic.sso.sdk.p022e.C1369i;
import com.cmic.sso.sdk.p022e.C1371k;
import com.cmic.sso.sdk.p022e.C1373m;
import com.cmic.sso.sdk.p022e.C1375o;
import com.cmic.sso.sdk.p022e.C1377q;
import com.tencent.open.SocialConstants;
import org.fourthline.cling.model.UserConstants;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.cmic.sso.sdk.c.c.a */
/* JADX INFO: loaded from: classes.dex */
public class C1351a {

    /* JADX INFO: renamed from: a */
    private static C1351a f5636a;

    private C1351a() {
    }

    /* JADX INFO: renamed from: a */
    public void m7162a(C1316a c1316a, InterfaceC1354d interfaceC1354d) {
        C1353c c1353c;
        String strM7261a;
        int iM6971c = c1316a.m6971c("networktype");
        C1349h c1349h = new C1349h();
        c1349h.m7104b("1.0");
        c1349h.m7105c(AuthnHelper.SDK_VERSION);
        c1349h.m7106d(c1316a.m6968b("appid"));
        c1349h.m7107e(c1316a.m6968b("operatortype"));
        c1349h.m7108f(iM6971c + "");
        c1349h.m7109g(C1373m.m7291a());
        c1349h.m7110h(C1373m.m7294b());
        c1349h.m7111i(C1373m.m7295c());
        c1349h.m7112j("0");
        c1349h.m7113k("3.0");
        c1349h.m7114l(C1377q.m7307b());
        c1349h.m7115m(C1375o.m7301a());
        c1349h.m7117o(c1316a.m6968b("apppackage"));
        c1349h.m7118p(c1316a.m6968b("appsign"));
        c1349h.mo7103a(C1371k.m7281b("AID", ""));
        if (c1316a.m6971c("logintype") == 3 || c1316a.m6970b("isRisk", false)) {
            c1349h.m7121s("pre");
        } else {
            c1349h.m7158x(c1316a.m6968b("userCapaid"));
            if (c1316a.m6971c("logintype") == 1) {
                c1349h.m7158x("200");
            } else {
                c1349h.m7158x("50");
            }
            c1349h.m7121s("authz");
        }
        C1377q.m7304a(c1316a, "scripAndTokenForHttps");
        C1317a c1317aM6967b = c1316a.m6967b();
        if (c1316a.m6970b("isCacheScrip", false) || c1316a.m6970b("isGotScrip", false)) {
            c1349h.m7157w(c1316a.m6968b("phonescrip"));
            c1349h.m7116n(c1349h.m7156v(c1316a.m6968b("appkey")));
            c1353c = new C1353c("https://" + c1317aM6967b.m6984a() + "/unisdk/rs/scripAndTokenForHttps", c1349h, "POST", c1316a.m6968b("traceId"));
            c1353c.m7171a("defendEOF", "0");
        } else {
            C1346e c1346e = new C1346e();
            c1346e.m7137a(c1316a.m6964a(C1333b.a.f5549a));
            c1346e.m7139b(c1316a.m6964a(C1333b.a.f5550b));
            c1346e.m7135a(c1349h);
            c1346e.m7136a(false);
            c1316a.m6962a("isCloseIpv4", c1317aM6967b.m6991h());
            c1316a.m6962a("isCloseIpv6", c1317aM6967b.m6992i());
            String str = "https://" + c1317aM6967b.m6985b() + "/unisdk/rs/scripAndTokenForHttps";
            if (c1316a.m6970b("use2048PublicKey", false)) {
                C1363c.m7232a("BaseRequest", "使用2对应的编码");
                c1346e.m7138b("2");
                strM7261a = C1369i.m7258a().m7262b(c1316a.m6964a(C1333b.a.f5549a));
            } else {
                strM7261a = C1369i.m7258a().m7261a(c1316a.m6964a(C1333b.a.f5549a));
            }
            c1346e.m7141c(strM7261a);
            c1353c = new C1352b(str, c1346e, "POST", c1316a.m6968b("traceId"));
            c1353c.m7171a("defendEOF", "1");
            if (iM6971c == 3) {
                c1353c.m7172a(true);
                c1316a.m6962a("doNetworkSwitch", true);
            } else {
                c1353c.m7172a(false);
                c1316a.m6962a("doNetworkSwitch", false);
            }
        }
        c1353c.m7171a("interfaceVersion", "3.0");
        m7161a(c1353c, interfaceC1354d, c1316a);
    }

    /* JADX INFO: renamed from: a */
    public void m7164a(boolean z, C1316a c1316a, InterfaceC1354d interfaceC1354d) {
        C1343b c1343b = new C1343b();
        c1343b.m7126b("1.0");
        c1343b.m7127c("Android");
        c1343b.m7128d(C1371k.m7281b("AID", ""));
        c1343b.m7129e(z ? "1" : "0");
        c1343b.m7130f(AuthnHelper.SDK_VERSION);
        c1343b.m7131g(c1316a.m6968b("appid"));
        c1343b.m7132h(c1343b.m7156v("iYm0HAnkxQtpvN44"));
        m7161a(new C1353c("https://" + c1316a.m6967b().m6986c() + "/client/uniConfig", c1343b, "POST", c1316a.m6968b("traceId")), interfaceC1354d, c1316a);
    }

    /* JADX INFO: renamed from: a */
    public static C1351a m7160a() {
        if (f5636a == null) {
            synchronized (C1351a.class) {
                try {
                    if (f5636a == null) {
                        f5636a = new C1351a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f5636a;
    }

    /* JADX INFO: renamed from: a */
    public void m7163a(JSONObject jSONObject, C1316a c1316a, InterfaceC1354d interfaceC1354d) {
        C1347f c1347f = new C1347f();
        C1347f.a aVar = new C1347f.a();
        C1347f.b bVar = new C1347f.b();
        bVar.m7153e(C1377q.m7307b());
        bVar.m7155f(C1375o.m7301a());
        bVar.m7147b(UserConstants.PRODUCT_TOKEN_VERSION);
        bVar.m7149c(c1316a.m6969b("appid", ""));
        bVar.m7151d(bVar.m7156v(""));
        aVar.m7145a(jSONObject);
        c1347f.m7142a(aVar);
        c1347f.m7143a(bVar);
        m7161a(new C1353c("https://" + c1316a.m6967b().m6987d() + "/log/logReport", c1347f, "POST", c1316a.m6968b("traceId")), interfaceC1354d, c1316a);
    }

    /* JADX INFO: renamed from: a */
    private void m7161a(final C1353c c1353c, final InterfaceC1354d interfaceC1354d, final C1316a c1316a) {
        C1340d c1340d = new C1340d();
        C1339c c1339c = new C1339c();
        C1337a c1337a = new C1337a();
        c1340d.m7095a(c1339c);
        c1339c.m7091a(c1337a);
        c1353c.m7169a(SystemClock.elapsedRealtime());
        c1340d.mo7089a(c1353c, new InterfaceC1358c() { // from class: com.cmic.sso.sdk.c.c.a.1
            @Override // com.cmic.sso.sdk.p016c.p020d.InterfaceC1358c
            /* JADX INFO: renamed from: a */
            public void mo7094a(C1357b c1357b) {
                try {
                    m7165a();
                    JSONObject jSONObject = new JSONObject(c1357b.m7187c());
                    String string = jSONObject.has("resultcode") ? jSONObject.getString("resultcode") : jSONObject.getString("resultCode");
                    C1377q.m7308b(c1316a, string);
                    interfaceC1354d.mo7028a(string, jSONObject.optString(SocialConstants.PARAM_APP_DESC), jSONObject);
                } catch (Exception e) {
                    e.printStackTrace();
                    mo7093a(C1356a.m7182a(102223));
                }
            }

            @Override // com.cmic.sso.sdk.p016c.p020d.InterfaceC1358c
            /* JADX INFO: renamed from: a */
            public void mo7093a(C1356a c1356a) {
                m7165a();
                C1377q.m7308b(c1316a, String.valueOf(c1356a.m7183a()));
                interfaceC1354d.mo7028a(String.valueOf(c1356a.m7183a()), c1356a.m7184b(), C1332c.m7071a(String.valueOf(c1356a.m7183a()), c1356a.m7184b()));
            }

            /* JADX INFO: renamed from: a */
            private void m7165a() {
                if (c1353c.m7168a().contains("uniConfig")) {
                    return;
                }
                C1377q.m7310c(c1316a, String.valueOf(SystemClock.elapsedRealtime() - c1353c.m7179h()));
            }
        }, c1316a);
    }
}
