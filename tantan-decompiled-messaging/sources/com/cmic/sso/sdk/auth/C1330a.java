package com.cmic.sso.sdk.auth;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import com.cmic.sso.sdk.C1316a;
import com.cmic.sso.sdk.C1333b;
import com.cmic.sso.sdk.p016c.p019c.C1351a;
import com.cmic.sso.sdk.p016c.p019c.InterfaceC1354d;
import com.cmic.sso.sdk.p022e.C1361a;
import com.cmic.sso.sdk.p022e.C1363c;
import com.cmic.sso.sdk.p022e.C1364d;
import com.cmic.sso.sdk.p022e.C1365e;
import com.cmic.sso.sdk.p022e.C1368h;
import com.cmic.sso.sdk.p022e.C1371k;
import com.cmic.sso.sdk.p022e.C1372l;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.cmic.sso.sdk.auth.a */
/* JADX INFO: loaded from: classes.dex */
public class C1330a {

    /* JADX INFO: renamed from: c */
    @SuppressLint({"StaticFieldLeak"})
    private static C1330a f5541c;

    /* JADX INFO: renamed from: b */
    private final Context f5543b;

    /* JADX INFO: renamed from: d */
    private final Object f5544d = new Object();

    /* JADX INFO: renamed from: a */
    private final C1351a f5542a = C1351a.m7160a();

    private C1330a(Context context) {
        this.f5543b = context.getApplicationContext();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:29:0x009d  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:32:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:35:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:36:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:38:0x00df  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:41:0x00f0  */
    /* JADX INFO: renamed from: a */
    public void m7062a(C1316a c1316a, InterfaceC1331b interfaceC1331b, String str, String str2, JSONObject jSONObject) {
        String str3;
        String strOptString;
        String strOptString2;
        JSONObject jSONObject2;
        String str4;
        String str5;
        if (!"103000".equals(str)) {
            if (c1316a.m6971c("logintype") == 3) {
                interfaceC1331b.mo7060a(str, "true", c1316a, C1332c.m7073b(str, str2));
                return;
            } else {
                interfaceC1331b.mo7060a(str, str2, c1316a, jSONObject);
                return;
            }
        }
        String strOptString3 = jSONObject.optString("resultdata");
        String string = TextUtils.isEmpty(strOptString3) ? jSONObject.toString() : C1361a.m7223b(c1316a.m6964a(C1333b.a.f5549a), strOptString3, c1316a.m6964a(C1333b.a.f5550b));
        JSONObject jSONObject3 = null;
        String strOptString4 = null;
        try {
            jSONObject2 = new JSONObject(string);
            try {
                strOptString = jSONObject2.optString("phonescrip");
                try {
                    strOptString2 = jSONObject2.optString("securityphone");
                    try {
                        strOptString4 = jSONObject2.optString("openId");
                        if (TextUtils.isEmpty(strOptString4)) {
                            strOptString4 = jSONObject2.optString("pcid");
                        }
                        C1371k.m7278a("securityphone", strOptString2);
                    } catch (JSONException e) {
                        e = e;
                        str3 = strOptString4;
                        jSONObject3 = jSONObject2;
                        e.printStackTrace();
                        String str6 = str3;
                        jSONObject2 = jSONObject3;
                        strOptString4 = str6;
                    }
                } catch (JSONException e2) {
                    e = e2;
                    strOptString2 = null;
                    jSONObject3 = jSONObject2;
                    str3 = strOptString2;
                    e.printStackTrace();
                    String str7 = str3;
                    jSONObject2 = jSONObject3;
                    strOptString4 = str7;
                    str4 = strOptString2;
                    str5 = strOptString;
                    C1363c.m7234b("AuthnBusiness", "securityPhone  = " + str4);
                    c1316a.m6961a("openId", strOptString4);
                    c1316a.m6961a("phonescrip", str5);
                    c1316a.m6961a("securityphone", str4);
                    if (jSONObject2 != null) {
                        C1363c.m7232a("AuthnBusiness", "返回103000，但是数据解析出错");
                        interfaceC1331b.mo7060a(String.valueOf(102223), "数据解析异常", c1316a, C1332c.m7071a(String.valueOf(102223), "数据解析异常"));
                        return;
                    }
                    if (!c1316a.m6970b("isRisk", false)) {
                        C1368h.m7251a(this.f5543b, str5, Long.parseLong(jSONObject2.optString("scripExpiresIn", "0")), c1316a.m6969b("scripKey", ""), c1316a.m6969b("scripType", ""));
                    }
                    if (c1316a.m6971c("logintype") == 3) {
                        interfaceC1331b.mo7060a(str, "true", c1316a, C1332c.m7069a(str4));
                    } else {
                        if (c1316a.m6970b("isRisk", false)) {
                            interfaceC1331b.mo7060a(str, str2, c1316a, jSONObject2);
                            return;
                        }
                        c1316a.m6962a("isRisk", false);
                        c1316a.m6962a("isGotScrip", true);
                        m7066b(c1316a, interfaceC1331b);
                    }
                }
            } catch (JSONException e3) {
                e = e3;
                strOptString = null;
                strOptString2 = null;
            }
        } catch (JSONException e4) {
            e = e4;
            str3 = null;
            strOptString = null;
            strOptString2 = null;
        }
        str4 = strOptString2;
        str5 = strOptString;
        C1363c.m7234b("AuthnBusiness", "securityPhone  = " + str4);
        c1316a.m6961a("openId", strOptString4);
        c1316a.m6961a("phonescrip", str5);
        c1316a.m6961a("securityphone", str4);
        if (jSONObject2 != null) {
            C1363c.m7232a("AuthnBusiness", "返回103000，但是数据解析出错");
            interfaceC1331b.mo7060a(String.valueOf(102223), "数据解析异常", c1316a, C1332c.m7071a(String.valueOf(102223), "数据解析异常"));
            return;
        }
        if (!c1316a.m6970b("isRisk", false)) {
            C1368h.m7251a(this.f5543b, str5, Long.parseLong(jSONObject2.optString("scripExpiresIn", "0")), c1316a.m6969b("scripKey", ""), c1316a.m6969b("scripType", ""));
        }
        if (c1316a.m6971c("logintype") == 3) {
            interfaceC1331b.mo7060a(str, "true", c1316a, C1332c.m7069a(str4));
        } else {
            if (c1316a.m6970b("isRisk", false)) {
                interfaceC1331b.mo7060a(str, str2, c1316a, jSONObject2);
                return;
            }
            c1316a.m6962a("isRisk", false);
            c1316a.m6962a("isGotScrip", true);
            m7066b(c1316a, interfaceC1331b);
        }
    }

    /* JADX INFO: renamed from: b */
    private void m7066b(final C1316a c1316a, final InterfaceC1331b interfaceC1331b) {
        C1363c.m7234b("AuthnBusiness", "getScripAndToken start");
        boolean zM6970b = c1316a.m6970b("isGotScrip", false);
        C1363c.m7234b("AuthnBusiness", "isGotScrip = " + zM6970b);
        if (!zM6970b) {
            m7065b(c1316a);
            if (!c1316a.m6970b("isCacheScrip", false)) {
                m7067c(c1316a);
                if (c1316a.m6971c("networktype") == 3 && c1316a.m6971c("logintype") != 3) {
                    c1316a.m6962a("isRisk", true);
                }
            }
            if (c1316a.m6971c("logintype") == 1) {
                c1316a.m6961a("userCapaid", "200");
            } else if (c1316a.m6971c("logintype") == 0) {
                c1316a.m6961a("userCapaid", "50");
            }
        }
        this.f5542a.m7162a(c1316a, new InterfaceC1354d() { // from class: com.cmic.sso.sdk.auth.a.1
            @Override // com.cmic.sso.sdk.p016c.p019c.InterfaceC1354d
            /* JADX INFO: renamed from: a */
            public void mo7028a(String str, String str2, JSONObject jSONObject) {
                C1330a.this.m7062a(c1316a, interfaceC1331b, str, str2, jSONObject);
            }
        });
    }

    /* JADX INFO: renamed from: c */
    private void m7067c(C1316a c1316a) {
        byte[] bytes = new byte[0];
        if (c1316a.m6970b("use2048PublicKey", false)) {
            C1363c.m7232a("AuthnBusiness", "使用2048公钥对应的对称秘钥生成方式");
            bytes = C1361a.m7222a();
        } else {
            C1363c.m7232a("AuthnBusiness", "使用1024公钥对应的对称秘钥生成方式");
            try {
                bytes = UUID.randomUUID().toString().substring(0, 16).getBytes("utf-8");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        byte[] bArrM7222a = C1361a.m7222a();
        c1316a.m6963a(C1333b.a.f5549a, bytes);
        c1316a.m6963a(C1333b.a.f5550b, bArrM7222a);
        c1316a.m6961a("authType", "3");
    }

    /* JADX INFO: renamed from: b */
    private void m7065b(C1316a c1316a) {
        String packageName = this.f5543b.getPackageName();
        String strM7236a = C1364d.m7236a(C1372l.m7289a(this.f5543b, packageName));
        c1316a.m6961a("apppackage", packageName);
        c1316a.m6961a("appsign", strM7236a);
    }

    /* JADX INFO: renamed from: a */
    public static C1330a m7061a(Context context) {
        if (f5541c == null) {
            synchronized (C1330a.class) {
                try {
                    if (f5541c == null) {
                        f5541c = new C1330a(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f5541c;
    }

    /* JADX INFO: renamed from: a */
    public void m7068a(C1316a c1316a, InterfaceC1331b interfaceC1331b) {
        if (C1365e.m7239a(c1316a.m6968b("traceId"))) {
            return;
        }
        C1363c.m7234b("AuthnBusiness", "LoginCheck method start");
        if (m7064a(c1316a)) {
            C1363c.m7234b("AuthnBusiness", "LoginCheck method start");
            int iM6971c = c1316a.m6971c("logintype");
            if (c1316a.m6970b("isCacheScrip", false)) {
                String strM6969b = c1316a.m6969b("securityphone", "");
                if (iM6971c == 3) {
                    interfaceC1331b.mo7060a("103000", "true", c1316a, C1332c.m7069a(strM6969b));
                    return;
                } else {
                    m7066b(c1316a, interfaceC1331b);
                    return;
                }
            }
            m7066b(c1316a, interfaceC1331b);
            return;
        }
        interfaceC1331b.mo7060a("102103", "无数据网络", c1316a, null);
    }

    /* JADX INFO: renamed from: a */
    private boolean m7064a(C1316a c1316a) {
        boolean zM7254a;
        synchronized (this.f5544d) {
            try {
                zM7254a = C1368h.m7254a(c1316a);
                if (zM7254a) {
                    c1316a.m6961a("securityphone", C1371k.m7281b("securityphone", ""));
                    if (3 != c1316a.m6971c("logintype")) {
                        String strM7249a = C1368h.m7249a(this.f5543b);
                        StringBuilder sb = new StringBuilder("解密phoneScript ");
                        sb.append(!TextUtils.isEmpty(strM7249a));
                        C1363c.m7234b("AuthnBusiness", sb.toString());
                        if (TextUtils.isEmpty(strM7249a)) {
                            zM7254a = false;
                        } else {
                            c1316a.m6961a("phonescrip", strM7249a);
                        }
                        C1368h.m7252a(true, false);
                    }
                }
                c1316a.m6962a("isCacheScrip", zM7254a);
                C1363c.m7234b("AuthnBusiness", "isCachePhoneScrip = " + zM7254a);
            } catch (Throwable th) {
                throw th;
            }
        }
        if (c1316a.m6971c("networktype") == 2) {
            return zM7254a;
        }
        return true;
    }
}
