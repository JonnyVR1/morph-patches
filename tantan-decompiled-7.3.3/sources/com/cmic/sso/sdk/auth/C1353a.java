package com.cmic.sso.sdk.auth;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import com.cmic.sso.sdk.C1339a;
import com.cmic.sso.sdk.C1356b;
import com.cmic.sso.sdk.p017c.p020c.C1374a;
import com.cmic.sso.sdk.p017c.p020c.InterfaceC1377d;
import com.cmic.sso.sdk.p023e.C1384a;
import com.cmic.sso.sdk.p023e.C1386c;
import com.cmic.sso.sdk.p023e.C1387d;
import com.cmic.sso.sdk.p023e.C1388e;
import com.cmic.sso.sdk.p023e.C1391h;
import com.cmic.sso.sdk.p023e.C1394k;
import com.cmic.sso.sdk.p023e.C1395l;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.cmic.sso.sdk.auth.a */
/* JADX INFO: loaded from: classes.dex */
public class C1353a {

    /* JADX INFO: renamed from: c */
    @SuppressLint({"StaticFieldLeak"})
    private static C1353a f5578c;

    /* JADX INFO: renamed from: b */
    private final Context f5580b;

    /* JADX INFO: renamed from: d */
    private final Object f5581d = new Object();

    /* JADX INFO: renamed from: a */
    private final C1374a f5579a = C1374a.m7214a();

    private C1353a(Context context) {
        this.f5580b = context.getApplicationContext();
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
    public void m7116a(C1339a c1339a, InterfaceC1354b interfaceC1354b, String str, String str2, JSONObject jSONObject) {
        String str3;
        String strOptString;
        String strOptString2;
        JSONObject jSONObject2;
        String str4;
        String str5;
        if (!"103000".equals(str)) {
            if (c1339a.m7025c("logintype") == 3) {
                interfaceC1354b.mo7114a(str, "true", c1339a, C1355c.m7127b(str, str2));
                return;
            } else {
                interfaceC1354b.mo7114a(str, str2, c1339a, jSONObject);
                return;
            }
        }
        String strOptString3 = jSONObject.optString("resultdata");
        String string = TextUtils.isEmpty(strOptString3) ? jSONObject.toString() : C1384a.m7277b(c1339a.m7018a(C1356b.a.f5586a), strOptString3, c1339a.m7018a(C1356b.a.f5587b));
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
                        C1394k.m7332a("securityphone", strOptString2);
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
                    C1386c.m7288b("AuthnBusiness", "securityPhone  = " + str4);
                    c1339a.m7015a("openId", strOptString4);
                    c1339a.m7015a("phonescrip", str5);
                    c1339a.m7015a("securityphone", str4);
                    if (jSONObject2 != null) {
                        C1386c.m7286a("AuthnBusiness", "返回103000，但是数据解析出错");
                        interfaceC1354b.mo7114a(String.valueOf(102223), "数据解析异常", c1339a, C1355c.m7125a(String.valueOf(102223), "数据解析异常"));
                        return;
                    }
                    if (!c1339a.m7024b("isRisk", false)) {
                        C1391h.m7305a(this.f5580b, str5, Long.parseLong(jSONObject2.optString("scripExpiresIn", "0")), c1339a.m7023b("scripKey", ""), c1339a.m7023b("scripType", ""));
                    }
                    if (c1339a.m7025c("logintype") == 3) {
                        interfaceC1354b.mo7114a(str, "true", c1339a, C1355c.m7123a(str4));
                    } else {
                        if (c1339a.m7024b("isRisk", false)) {
                            interfaceC1354b.mo7114a(str, str2, c1339a, jSONObject2);
                            return;
                        }
                        c1339a.m7016a("isRisk", false);
                        c1339a.m7016a("isGotScrip", true);
                        m7120b(c1339a, interfaceC1354b);
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
        C1386c.m7288b("AuthnBusiness", "securityPhone  = " + str4);
        c1339a.m7015a("openId", strOptString4);
        c1339a.m7015a("phonescrip", str5);
        c1339a.m7015a("securityphone", str4);
        if (jSONObject2 != null) {
            C1386c.m7286a("AuthnBusiness", "返回103000，但是数据解析出错");
            interfaceC1354b.mo7114a(String.valueOf(102223), "数据解析异常", c1339a, C1355c.m7125a(String.valueOf(102223), "数据解析异常"));
            return;
        }
        if (!c1339a.m7024b("isRisk", false)) {
            C1391h.m7305a(this.f5580b, str5, Long.parseLong(jSONObject2.optString("scripExpiresIn", "0")), c1339a.m7023b("scripKey", ""), c1339a.m7023b("scripType", ""));
        }
        if (c1339a.m7025c("logintype") == 3) {
            interfaceC1354b.mo7114a(str, "true", c1339a, C1355c.m7123a(str4));
        } else {
            if (c1339a.m7024b("isRisk", false)) {
                interfaceC1354b.mo7114a(str, str2, c1339a, jSONObject2);
                return;
            }
            c1339a.m7016a("isRisk", false);
            c1339a.m7016a("isGotScrip", true);
            m7120b(c1339a, interfaceC1354b);
        }
    }

    /* JADX INFO: renamed from: b */
    private void m7120b(final C1339a c1339a, final InterfaceC1354b interfaceC1354b) {
        C1386c.m7288b("AuthnBusiness", "getScripAndToken start");
        boolean zM7024b = c1339a.m7024b("isGotScrip", false);
        C1386c.m7288b("AuthnBusiness", "isGotScrip = " + zM7024b);
        if (!zM7024b) {
            m7119b(c1339a);
            if (!c1339a.m7024b("isCacheScrip", false)) {
                m7121c(c1339a);
                if (c1339a.m7025c("networktype") == 3 && c1339a.m7025c("logintype") != 3) {
                    c1339a.m7016a("isRisk", true);
                }
            }
            if (c1339a.m7025c("logintype") == 1) {
                c1339a.m7015a("userCapaid", "200");
            } else if (c1339a.m7025c("logintype") == 0) {
                c1339a.m7015a("userCapaid", "50");
            }
        }
        this.f5579a.m7216a(c1339a, new InterfaceC1377d() { // from class: com.cmic.sso.sdk.auth.a.1
            @Override // com.cmic.sso.sdk.p017c.p020c.InterfaceC1377d
            /* JADX INFO: renamed from: a */
            public void mo7082a(String str, String str2, JSONObject jSONObject) {
                C1353a.this.m7116a(c1339a, interfaceC1354b, str, str2, jSONObject);
            }
        });
    }

    /* JADX INFO: renamed from: c */
    private void m7121c(C1339a c1339a) {
        byte[] bytes = new byte[0];
        if (c1339a.m7024b("use2048PublicKey", false)) {
            C1386c.m7286a("AuthnBusiness", "使用2048公钥对应的对称秘钥生成方式");
            bytes = C1384a.m7276a();
        } else {
            C1386c.m7286a("AuthnBusiness", "使用1024公钥对应的对称秘钥生成方式");
            try {
                bytes = UUID.randomUUID().toString().substring(0, 16).getBytes("utf-8");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        byte[] bArrM7276a = C1384a.m7276a();
        c1339a.m7017a(C1356b.a.f5586a, bytes);
        c1339a.m7017a(C1356b.a.f5587b, bArrM7276a);
        c1339a.m7015a("authType", "3");
    }

    /* JADX INFO: renamed from: b */
    private void m7119b(C1339a c1339a) {
        String packageName = this.f5580b.getPackageName();
        String strM7290a = C1387d.m7290a(C1395l.m7343a(this.f5580b, packageName));
        c1339a.m7015a("apppackage", packageName);
        c1339a.m7015a("appsign", strM7290a);
    }

    /* JADX INFO: renamed from: a */
    public static C1353a m7115a(Context context) {
        if (f5578c == null) {
            synchronized (C1353a.class) {
                try {
                    if (f5578c == null) {
                        f5578c = new C1353a(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f5578c;
    }

    /* JADX INFO: renamed from: a */
    public void m7122a(C1339a c1339a, InterfaceC1354b interfaceC1354b) {
        if (C1388e.m7293a(c1339a.m7022b("traceId"))) {
            return;
        }
        C1386c.m7288b("AuthnBusiness", "LoginCheck method start");
        if (m7118a(c1339a)) {
            C1386c.m7288b("AuthnBusiness", "LoginCheck method start");
            int iM7025c = c1339a.m7025c("logintype");
            if (c1339a.m7024b("isCacheScrip", false)) {
                String strM7023b = c1339a.m7023b("securityphone", "");
                if (iM7025c == 3) {
                    interfaceC1354b.mo7114a("103000", "true", c1339a, C1355c.m7123a(strM7023b));
                    return;
                } else {
                    m7120b(c1339a, interfaceC1354b);
                    return;
                }
            }
            m7120b(c1339a, interfaceC1354b);
            return;
        }
        interfaceC1354b.mo7114a("102103", "无数据网络", c1339a, null);
    }

    /* JADX INFO: renamed from: a */
    private boolean m7118a(C1339a c1339a) {
        boolean zM7308a;
        synchronized (this.f5581d) {
            try {
                zM7308a = C1391h.m7308a(c1339a);
                if (zM7308a) {
                    c1339a.m7015a("securityphone", C1394k.m7335b("securityphone", ""));
                    if (3 != c1339a.m7025c("logintype")) {
                        String strM7303a = C1391h.m7303a(this.f5580b);
                        StringBuilder sb = new StringBuilder("解密phoneScript ");
                        sb.append(!TextUtils.isEmpty(strM7303a));
                        C1386c.m7288b("AuthnBusiness", sb.toString());
                        if (TextUtils.isEmpty(strM7303a)) {
                            zM7308a = false;
                        } else {
                            c1339a.m7015a("phonescrip", strM7303a);
                        }
                        C1391h.m7306a(true, false);
                    }
                }
                c1339a.m7016a("isCacheScrip", zM7308a);
                C1386c.m7288b("AuthnBusiness", "isCachePhoneScrip = " + zM7308a);
            } catch (Throwable th) {
                throw th;
            }
        }
        if (c1339a.m7025c("networktype") == 2) {
            return zM7308a;
        }
        return true;
    }
}
