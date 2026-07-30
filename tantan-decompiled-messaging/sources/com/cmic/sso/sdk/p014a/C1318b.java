package com.cmic.sso.sdk.p014a;

import android.text.TextUtils;
import com.cmic.sso.sdk.C1316a;
import com.cmic.sso.sdk.auth.AuthnHelper;
import com.cmic.sso.sdk.p016c.p019c.C1351a;
import com.cmic.sso.sdk.p016c.p019c.InterfaceC1354d;
import com.cmic.sso.sdk.p022e.C1363c;
import com.cmic.sso.sdk.p022e.C1371k;
import com.cmic.sso.sdk.p022e.C1374n;
import com.p046p1.mobile.putong.core.data.RegionRuleTag;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.cmic.sso.sdk.a.b */
/* JADX INFO: loaded from: classes.dex */
public class C1318b {

    /* JADX INFO: renamed from: c */
    private static C1318b f5490c;

    /* JADX INFO: renamed from: a */
    private C1317a f5491a;

    /* JADX INFO: renamed from: b */
    private final C1317a f5492b;

    /* JADX INFO: renamed from: d */
    private volatile boolean f5493d = false;

    /* JADX INFO: renamed from: e */
    private a f5494e;

    /* JADX INFO: renamed from: com.cmic.sso.sdk.a.b$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo7030a(C1317a c1317a);
    }

    private C1318b(boolean z) {
        C1317a c1317aM7000a = new C1317a.a().m7000a();
        this.f5492b = c1317aM7000a;
        if (z) {
            this.f5491a = c1317aM7000a;
        } else {
            this.f5491a = m7022d();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m7016a(JSONObject jSONObject) {
        C1371k.a aVarM7280b = C1371k.m7280b("sso_config_xf");
        try {
            if (jSONObject.has("client_valid")) {
                aVarM7280b.m7285a("client_valid", System.currentTimeMillis() + (((long) Integer.parseInt(jSONObject.getString("client_valid"))) * 3600000));
            }
            if (jSONObject.has("Configlist")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("Configlist");
                if (jSONObject2.has("CHANGE_HOST")) {
                    String string = jSONObject2.getString("CHANGE_HOST");
                    if (string.contains("M007")) {
                        String strM7013a = m7013a(string, "M007");
                        if (!TextUtils.isEmpty(strM7013a)) {
                            aVarM7280b.m7286a("logHost", strM7013a);
                        }
                    }
                    if (string.contains("M008")) {
                        String strM7013a2 = m7013a(string, "M008");
                        if (!TextUtils.isEmpty(strM7013a2)) {
                            aVarM7280b.m7286a("https_get_phone_scrip_host", strM7013a2);
                        }
                    }
                    if (string.contains("M009")) {
                        String strM7013a3 = m7013a(string, "M009");
                        if (!TextUtils.isEmpty(strM7013a3)) {
                            aVarM7280b.m7286a("config_host", strM7013a3);
                        }
                    }
                } else {
                    aVarM7280b.m7283a("logHost");
                    aVarM7280b.m7283a("https_get_phone_scrip_host");
                    aVarM7280b.m7283a("config_host");
                }
                m7017a(jSONObject2, "CLOSE_FRIEND_WAPKS", "0", aVarM7280b);
                m7017a(jSONObject2, "CLOSE_LOGS_VERSION", "0", aVarM7280b);
                m7017a(jSONObject2, "CLOSE_IPV4_LIST", "0", aVarM7280b);
                m7017a(jSONObject2, "CLOSE_IPV6_LIST", "0", aVarM7280b);
                m7017a(jSONObject2, "CLOSE_M008_SDKVERSION_LIST", "0", aVarM7280b);
                m7017a(jSONObject2, "CLOSE_M008_APPID_LIST", "0", aVarM7280b);
                if (jSONObject2.has("LOGS_CONTROL")) {
                    String[] strArrSplit = jSONObject2.getString("LOGS_CONTROL").replace("h", "").split("&");
                    if (strArrSplit.length == 2 && !TextUtils.isEmpty(strArrSplit[0]) && !TextUtils.isEmpty(strArrSplit[1])) {
                        try {
                            int i = Integer.parseInt(strArrSplit[0]);
                            int i2 = Integer.parseInt(strArrSplit[1]);
                            aVarM7280b.m7284a("maxFailedLogTimes", i);
                            aVarM7280b.m7284a("pauseTime", i2);
                        } catch (Exception unused) {
                            C1363c.m7232a("UmcConfigHandle", "解析日志上报限制时间次数异常");
                        }
                    }
                } else {
                    aVarM7280b.m7283a("maxFailedLogTimes");
                    aVarM7280b.m7283a("pauseTime");
                }
            }
            aVarM7280b.m7287b();
        } catch (Exception e) {
            C1363c.m7232a("UmcConfigHandle", "配置项异常，配置失效");
            e.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public void m7020b(C1316a c1316a) {
        if (this.f5493d) {
            C1363c.m7232a("UmcConfigHandle", "正在获取配置中...");
        } else {
            this.f5493d = true;
            C1351a.m7160a().m7164a(false, c1316a, new InterfaceC1354d() { // from class: com.cmic.sso.sdk.a.b.1
                @Override // com.cmic.sso.sdk.p016c.p019c.InterfaceC1354d
                /* JADX INFO: renamed from: a */
                public void mo7028a(String str, String str2, JSONObject jSONObject) {
                    try {
                        if ("103000".equals(str)) {
                            C1318b.this.m7016a(jSONObject);
                            C1371k.m7278a("sdk_config_version", AuthnHelper.SDK_VERSION);
                            C1318b c1318b = C1318b.this;
                            c1318b.f5491a = c1318b.m7022d();
                            if (C1318b.this.f5494e != null) {
                                C1318b.this.f5494e.mo7030a(C1318b.this.f5491a);
                            }
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    C1318b.this.f5493d = false;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public C1317a m7022d() {
        return new C1317a.a().m6998a(C1320d.m7041b(this.f5492b.m6984a())).m7004c(C1320d.m7037a(this.f5492b.m6986c())).m7002b(C1320d.m7041b(this.f5492b.m6985b())).m7006d(C1320d.m7043c(this.f5492b.m6987d())).m7007d(C1320d.m7039a(this.f5492b.m6991h())).m7008e(C1320d.m7042b(this.f5492b.m6992i())).m6999a(C1320d.m7046e(this.f5492b.m6988e())).m7003b(C1320d.m7045d(this.f5492b.m6989f())).m7005c(C1320d.m7044c(this.f5492b.m6990g())).m7009f(C1320d.m7047f(this.f5492b.m6993j())).m6997a(C1320d.m7036a(this.f5492b.m6994k())).m7001b(C1320d.m7040b(this.f5492b.m6995l())).m7000a();
    }

    /* JADX INFO: renamed from: c */
    public void m7027c() {
        C1371k.a aVarM7280b = C1371k.m7280b("sso_config_xf");
        aVarM7280b.m7288c();
        aVarM7280b.m7287b();
    }

    /* JADX INFO: renamed from: b */
    public C1317a m7026b() {
        return this.f5491a;
    }

    /* JADX INFO: renamed from: a */
    public void m7024a(a aVar) {
        this.f5494e = aVar;
    }

    /* JADX INFO: renamed from: a */
    public static C1318b m7012a(boolean z) {
        if (f5490c == null) {
            synchronized (C1318b.class) {
                try {
                    if (f5490c == null) {
                        f5490c = new C1318b(z);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f5490c;
    }

    /* JADX INFO: renamed from: a */
    public C1317a m7023a() {
        return this.f5492b;
    }

    /* JADX INFO: renamed from: a */
    private String m7013a(String str, String str2) {
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
    private void m7017a(JSONObject jSONObject, String str, String str2, C1371k.a aVar) {
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
                if (!strOptString.contains("CU") && !strOptString.contains("CT") && !strOptString.contains(RegionRuleTag.f20494CM)) {
                    return;
                }
            }
            aVar.m7286a(str, jSONObject.optString(str, str2));
            return;
        }
        aVar.m7283a(str);
    }

    /* JADX INFO: renamed from: a */
    public void m7025a(final C1316a c1316a) {
        if (C1320d.m7038a()) {
            C1374n.m7299a(new C1374n.a() { // from class: com.cmic.sso.sdk.a.b.2
                @Override // com.cmic.sso.sdk.p022e.C1374n.a
                /* JADX INFO: renamed from: a */
                public void mo7029a() {
                    C1363c.m7234b("UmcConfigHandle", "开始拉取配置..");
                    C1318b.this.m7020b(c1316a);
                }
            });
        }
    }
}
