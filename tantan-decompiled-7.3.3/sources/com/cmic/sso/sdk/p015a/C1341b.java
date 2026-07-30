package com.cmic.sso.sdk.p015a;

import android.text.TextUtils;
import com.cmic.sso.sdk.C1339a;
import com.cmic.sso.sdk.auth.AuthnHelper;
import com.cmic.sso.sdk.p017c.p020c.C1374a;
import com.cmic.sso.sdk.p017c.p020c.InterfaceC1377d;
import com.cmic.sso.sdk.p023e.C1386c;
import com.cmic.sso.sdk.p023e.C1394k;
import com.cmic.sso.sdk.p023e.C1397n;
import com.p051p1.mobile.putong.core.data.RegionRuleTag;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.cmic.sso.sdk.a.b */
/* JADX INFO: loaded from: classes.dex */
public class C1341b {

    /* JADX INFO: renamed from: c */
    private static C1341b f5527c;

    /* JADX INFO: renamed from: a */
    private C1340a f5528a;

    /* JADX INFO: renamed from: b */
    private final C1340a f5529b;

    /* JADX INFO: renamed from: d */
    private volatile boolean f5530d = false;

    /* JADX INFO: renamed from: e */
    private a f5531e;

    /* JADX INFO: renamed from: com.cmic.sso.sdk.a.b$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo7084a(C1340a c1340a);
    }

    private C1341b(boolean z) {
        C1340a c1340aM7054a = new C1340a.a().m7054a();
        this.f5529b = c1340aM7054a;
        if (z) {
            this.f5528a = c1340aM7054a;
        } else {
            this.f5528a = m7076d();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m7070a(JSONObject jSONObject) {
        C1394k.a aVarM7334b = C1394k.m7334b("sso_config_xf");
        try {
            if (jSONObject.has("client_valid")) {
                aVarM7334b.m7339a("client_valid", System.currentTimeMillis() + (((long) Integer.parseInt(jSONObject.getString("client_valid"))) * 3600000));
            }
            if (jSONObject.has("Configlist")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("Configlist");
                if (jSONObject2.has("CHANGE_HOST")) {
                    String string = jSONObject2.getString("CHANGE_HOST");
                    if (string.contains("M007")) {
                        String strM7067a = m7067a(string, "M007");
                        if (!TextUtils.isEmpty(strM7067a)) {
                            aVarM7334b.m7340a("logHost", strM7067a);
                        }
                    }
                    if (string.contains("M008")) {
                        String strM7067a2 = m7067a(string, "M008");
                        if (!TextUtils.isEmpty(strM7067a2)) {
                            aVarM7334b.m7340a("https_get_phone_scrip_host", strM7067a2);
                        }
                    }
                    if (string.contains("M009")) {
                        String strM7067a3 = m7067a(string, "M009");
                        if (!TextUtils.isEmpty(strM7067a3)) {
                            aVarM7334b.m7340a("config_host", strM7067a3);
                        }
                    }
                } else {
                    aVarM7334b.m7337a("logHost");
                    aVarM7334b.m7337a("https_get_phone_scrip_host");
                    aVarM7334b.m7337a("config_host");
                }
                m7071a(jSONObject2, "CLOSE_FRIEND_WAPKS", "0", aVarM7334b);
                m7071a(jSONObject2, "CLOSE_LOGS_VERSION", "0", aVarM7334b);
                m7071a(jSONObject2, "CLOSE_IPV4_LIST", "0", aVarM7334b);
                m7071a(jSONObject2, "CLOSE_IPV6_LIST", "0", aVarM7334b);
                m7071a(jSONObject2, "CLOSE_M008_SDKVERSION_LIST", "0", aVarM7334b);
                m7071a(jSONObject2, "CLOSE_M008_APPID_LIST", "0", aVarM7334b);
                if (jSONObject2.has("LOGS_CONTROL")) {
                    String[] strArrSplit = jSONObject2.getString("LOGS_CONTROL").replace("h", "").split("&");
                    if (strArrSplit.length == 2 && !TextUtils.isEmpty(strArrSplit[0]) && !TextUtils.isEmpty(strArrSplit[1])) {
                        try {
                            int i = Integer.parseInt(strArrSplit[0]);
                            int i2 = Integer.parseInt(strArrSplit[1]);
                            aVarM7334b.m7338a("maxFailedLogTimes", i);
                            aVarM7334b.m7338a("pauseTime", i2);
                        } catch (Exception unused) {
                            C1386c.m7286a("UmcConfigHandle", "解析日志上报限制时间次数异常");
                        }
                    }
                } else {
                    aVarM7334b.m7337a("maxFailedLogTimes");
                    aVarM7334b.m7337a("pauseTime");
                }
            }
            aVarM7334b.m7341b();
        } catch (Exception e) {
            C1386c.m7286a("UmcConfigHandle", "配置项异常，配置失效");
            e.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public void m7074b(C1339a c1339a) {
        if (this.f5530d) {
            C1386c.m7286a("UmcConfigHandle", "正在获取配置中...");
        } else {
            this.f5530d = true;
            C1374a.m7214a().m7218a(false, c1339a, new InterfaceC1377d() { // from class: com.cmic.sso.sdk.a.b.1
                @Override // com.cmic.sso.sdk.p017c.p020c.InterfaceC1377d
                /* JADX INFO: renamed from: a */
                public void mo7082a(String str, String str2, JSONObject jSONObject) {
                    try {
                        if ("103000".equals(str)) {
                            C1341b.this.m7070a(jSONObject);
                            C1394k.m7332a("sdk_config_version", AuthnHelper.SDK_VERSION);
                            C1341b c1341b = C1341b.this;
                            c1341b.f5528a = c1341b.m7076d();
                            if (C1341b.this.f5531e != null) {
                                C1341b.this.f5531e.mo7084a(C1341b.this.f5528a);
                            }
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    C1341b.this.f5530d = false;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public C1340a m7076d() {
        return new C1340a.a().m7052a(C1343d.m7095b(this.f5529b.m7038a())).m7058c(C1343d.m7091a(this.f5529b.m7040c())).m7056b(C1343d.m7095b(this.f5529b.m7039b())).m7060d(C1343d.m7097c(this.f5529b.m7041d())).m7061d(C1343d.m7093a(this.f5529b.m7045h())).m7062e(C1343d.m7096b(this.f5529b.m7046i())).m7053a(C1343d.m7100e(this.f5529b.m7042e())).m7057b(C1343d.m7099d(this.f5529b.m7043f())).m7059c(C1343d.m7098c(this.f5529b.m7044g())).m7063f(C1343d.m7101f(this.f5529b.m7047j())).m7051a(C1343d.m7090a(this.f5529b.m7048k())).m7055b(C1343d.m7094b(this.f5529b.m7049l())).m7054a();
    }

    /* JADX INFO: renamed from: c */
    public void m7081c() {
        C1394k.a aVarM7334b = C1394k.m7334b("sso_config_xf");
        aVarM7334b.m7342c();
        aVarM7334b.m7341b();
    }

    /* JADX INFO: renamed from: b */
    public C1340a m7080b() {
        return this.f5528a;
    }

    /* JADX INFO: renamed from: a */
    public void m7078a(a aVar) {
        this.f5531e = aVar;
    }

    /* JADX INFO: renamed from: a */
    public static C1341b m7066a(boolean z) {
        if (f5527c == null) {
            synchronized (C1341b.class) {
                try {
                    if (f5527c == null) {
                        f5527c = new C1341b(z);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f5527c;
    }

    /* JADX INFO: renamed from: a */
    public C1340a m7077a() {
        return this.f5529b;
    }

    /* JADX INFO: renamed from: a */
    private String m7067a(String str, String str2) {
        String str3;
        String[] strArrSplit = str.split("&");
        int length = strArrSplit.length;
        int i = 0;
        while (true) {
            if (i < length) {
                str3 = strArrSplit[i];
                if (str3.contains(str2)) {
                    break;
                }
                i++;
            } else {
                str3 = "";
                break;
            }
        }
        return !TextUtils.isEmpty(str3) ? str3.substring(str3.lastIndexOf("=") + 1) : str3;
    }

    /* JADX INFO: renamed from: a */
    private void m7071a(JSONObject jSONObject, String str, String str2, C1394k.a aVar) {
        if (jSONObject.has(str)) {
            String strOptString = jSONObject.optString(str, str2);
            if (!"CLOSE_FRIEND_WAPKS".equals(str)) {
                if (!"0".equals(strOptString) && !"1".equals(strOptString)) {
                    return;
                }
            } else {
                if (TextUtils.isEmpty(strOptString)) {
                    return;
                }
                if (!strOptString.contains("CU") && !strOptString.contains("CT") && !strOptString.contains(RegionRuleTag.f21236CM)) {
                    return;
                }
            }
            aVar.m7340a(str, jSONObject.optString(str, str2));
            return;
        }
        aVar.m7337a(str);
    }

    /* JADX INFO: renamed from: a */
    public void m7079a(final C1339a c1339a) {
        if (C1343d.m7092a()) {
            C1397n.m7353a(new C1397n.a() { // from class: com.cmic.sso.sdk.a.b.2
                @Override // com.cmic.sso.sdk.p023e.C1397n.a
                /* JADX INFO: renamed from: a */
                public void mo7083a() {
                    C1386c.m7288b("UmcConfigHandle", "开始拉取配置..");
                    C1341b.this.m7074b(c1339a);
                }
            });
        }
    }
}
