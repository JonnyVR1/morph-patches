package com.cmic.sso.sdk.auth;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import com.cmic.sso.sdk.C1339a;
import com.cmic.sso.sdk.C1358c;
import com.cmic.sso.sdk.p015a.C1340a;
import com.cmic.sso.sdk.p015a.C1342c;
import com.cmic.sso.sdk.p016b.C1357a;
import com.cmic.sso.sdk.p022d.C1382a;
import com.cmic.sso.sdk.p022d.C1383b;
import com.cmic.sso.sdk.p023e.C1385b;
import com.cmic.sso.sdk.p023e.C1386c;
import com.cmic.sso.sdk.p023e.C1388e;
import com.cmic.sso.sdk.p023e.C1391h;
import com.cmic.sso.sdk.p023e.C1393j;
import com.cmic.sso.sdk.p023e.C1394k;
import com.cmic.sso.sdk.p023e.C1396m;
import com.cmic.sso.sdk.p023e.C1397n;
import com.cmic.sso.sdk.p023e.C1398o;
import com.cmic.sso.sdk.p023e.C1400q;
import com.cmic.sso.sdk.p023e.C1401r;
import com.tencent.open.SocialConstants;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class AuthnHelper {
    public static final String SDK_VERSION = "quick_login_android_9.5.5.3";

    /* JADX INFO: renamed from: c */
    @SuppressLint({"StaticFieldLeak"})
    private static AuthnHelper f5540c;

    /* JADX INFO: renamed from: a */
    private final C1353a f5541a;

    /* JADX INFO: renamed from: b */
    private final Context f5542b;

    /* JADX INFO: renamed from: d */
    private long f5543d;

    /* JADX INFO: renamed from: e */
    private final Handler f5544e;

    /* JADX INFO: renamed from: f */
    private String f5545f;

    /* JADX INFO: renamed from: g */
    private final C1358c f5546g;

    /* JADX INFO: renamed from: com.cmic.sso.sdk.auth.AuthnHelper$a */
    public class RunnableC1352a implements Runnable {

        /* JADX INFO: renamed from: b */
        private final C1339a f5577b;

        public RunnableC1352a(C1339a c1339a) {
            this.f5577b = c1339a;
        }

        @Override // java.lang.Runnable
        public void run() {
            JSONObject jSONObjectM7125a = (C1401r.m7368a(AuthnHelper.this.f5542b).m7372a() || !this.f5577b.m7024b("doNetworkSwitch", false)) ? C1355c.m7125a("200023", "登录超时") : C1355c.m7125a("102508", "数据网络切换失败");
            AuthnHelper.this.callBackResult(jSONObjectM7125a.optString("resultCode", "200023"), jSONObjectM7125a.optString(SocialConstants.PARAM_APP_DESC, "登录超时"), this.f5577b, jSONObjectM7125a);
        }
    }

    private AuthnHelper(Context context) {
        this.f5543d = 8000L;
        Context applicationContext = context.getApplicationContext();
        this.f5542b = applicationContext;
        this.f5544e = new Handler(applicationContext.getMainLooper());
        this.f5541a = C1353a.m7115a(applicationContext);
        C1401r.m7368a(applicationContext);
        C1394k.m7330a(applicationContext);
        C1393j.m7318a(applicationContext);
        this.f5546g = new C1358c();
        C1397n.m7353a(new C1397n.a() { // from class: com.cmic.sso.sdk.auth.AuthnHelper.1
            @Override // com.cmic.sso.sdk.p023e.C1397n.a
            /* JADX INFO: renamed from: a */
            public void mo7083a() {
                String strM7335b = C1394k.m7335b("AID", "");
                C1386c.m7288b("AuthnHelper", "aid = " + strM7335b);
                if (TextUtils.isEmpty(strM7335b)) {
                    AuthnHelper.this.m7103a();
                }
                if (C1385b.m7281a(AuthnHelper.this.f5542b, true)) {
                    C1386c.m7288b("AuthnHelper", "生成androidkeystore成功");
                } else {
                    C1386c.m7288b("AuthnHelper", "生成androidkeystore失败");
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public synchronized boolean m7108a(C1339a c1339a, String str, String str2, String str3, int i, TokenListener tokenListener) {
        try {
            C1340a c1340aM7088a = C1342c.m7085a(this.f5542b).m7088a();
            C1386c.m7288b("AuthnHelper", "umcConfigBean = " + c1340aM7088a.toString());
            c1339a.m7011a(c1340aM7088a);
            c1339a.m7016a("use2048PublicKey", "rsa2048".equals(this.f5545f));
            c1339a.m7014a("systemStartTime", SystemClock.elapsedRealtime());
            c1339a.m7015a("starttime", C1398o.m7355a());
            c1339a.m7015a("loginMethod", str3);
            c1339a.m7015a("appkey", str2);
            c1339a.m7015a("appid", str);
            c1339a.m7015a("timeOut", String.valueOf(this.f5543d));
            boolean zM7346a = C1396m.m7346a(this.f5542b);
            C1357a.m7128a().m7131a(this.f5542b, zM7346a);
            String strM7322b = C1393j.m7317a().m7322b();
            String strM7323c = C1393j.m7317a().m7323c();
            String strM7320a = C1393j.m7317a().m7320a(strM7323c);
            C1393j.m7317a().m7321a(c1339a);
            c1339a.m7015a("operator", strM7323c);
            c1339a.m7015a("operatortype", strM7320a);
            c1339a.m7013a("logintype", i);
            C1386c.m7288b("AuthnHelper", "subId = " + strM7322b);
            if (!TextUtils.isEmpty(strM7322b)) {
                C1386c.m7286a("AuthnHelper", "使用subId作为缓存key = " + strM7322b);
                c1339a.m7015a("scripType", "subid");
                c1339a.m7015a("scripKey", strM7322b);
            } else if (!TextUtils.isEmpty(strM7323c)) {
                C1386c.m7286a("AuthnHelper", "使用operator作为缓存key = " + strM7323c);
                c1339a.m7015a("scripType", "operator");
                c1339a.m7015a("scripKey", strM7323c);
            }
            int iM7344a = C1396m.m7344a(this.f5542b, zM7346a, c1339a);
            c1339a.m7013a("networktype", iM7344a);
            if (!zM7346a) {
                c1339a.m7015a("authType", String.valueOf(0));
                callBackResult("200010", "无法识别sim卡或没有sim卡", c1339a, null);
                return false;
            }
            if (tokenListener == null) {
                callBackResult("102203", "listener不能为空", c1339a, null);
                return false;
            }
            if (c1340aM7088a.m7044g()) {
                callBackResult("200082", "服务器繁忙，请稍后重试", c1339a, null);
                return false;
            }
            if (TextUtils.isEmpty(str == null ? "" : str.trim())) {
                callBackResult("102203", "appId 不能为空", c1339a, null);
                return false;
            }
            if (TextUtils.isEmpty(str2 == null ? "" : str2.trim())) {
                callBackResult("102203", "appkey不能为空", c1339a, null);
                return false;
            }
            if (iM7344a == 0) {
                callBackResult("102101", "未检测到网络", c1339a, null);
                return false;
            }
            if ("2".equals(strM7320a) && c1340aM7088a.m7043f()) {
                callBackResult("200082", "服务器繁忙，请稍后重试", c1339a, null);
                return false;
            }
            if (!"3".equals(strM7320a) || !c1340aM7088a.m7042e()) {
                return true;
            }
            callBackResult("200082", "服务器繁忙，请稍后重试", c1339a, null);
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    public static AuthnHelper getInstance(Context context) {
        if (f5540c == null) {
            synchronized (AuthnHelper.class) {
                try {
                    if (f5540c == null) {
                        f5540c = new AuthnHelper(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f5540c;
    }

    public static void setDebugMode(boolean z) {
        C1386c.m7287a(z);
    }

    public void callBackResult(String str, String str2, C1339a c1339a, JSONObject jSONObject) {
        final JSONObject jSONObjectM7126a;
        try {
            String strM7022b = c1339a.m7022b("traceId");
            if (C1388e.m7293a(strM7022b)) {
                return;
            }
            synchronized (this) {
                try {
                    final TokenListener tokenListenerM7295c = C1388e.m7295c(strM7022b);
                    C1388e.m7294b(strM7022b);
                    if (tokenListenerM7295c == null) {
                        return;
                    }
                    c1339a.m7014a("systemEndTime", SystemClock.elapsedRealtime());
                    c1339a.m7015a("endtime", C1398o.m7355a());
                    int iM7025c = c1339a.m7025c("logintype");
                    if (jSONObject == null) {
                        jSONObject = C1355c.m7125a(str, str2);
                    }
                    if (iM7025c == 3) {
                        jSONObjectM7126a = C1355c.m7124a(str, c1339a, jSONObject);
                        this.f5546g.m7138a();
                    } else {
                        jSONObjectM7126a = C1355c.m7126a(str, str2, c1339a, jSONObject);
                    }
                    jSONObjectM7126a.put("scripExpiresIn", String.valueOf(C1391h.m7302a()));
                    this.f5544e.post(new Runnable() { // from class: com.cmic.sso.sdk.auth.AuthnHelper.6
                        @Override // java.lang.Runnable
                        public void run() {
                            tokenListenerM7295c.onGetTokenComplete(jSONObjectM7126a);
                        }
                    });
                    C1342c.m7085a(this.f5542b).m7089a(c1339a);
                    if (!c1339a.m7021b().m7047j() && !C1400q.m7359a(c1339a.m7021b())) {
                        m7104a(this.f5542b, str, c1339a);
                    }
                    if (C1388e.m7292a()) {
                        C1397n.m7353a(new C1397n.a() { // from class: com.cmic.sso.sdk.auth.AuthnHelper.7
                            @Override // com.cmic.sso.sdk.p023e.C1397n.a
                            /* JADX INFO: renamed from: a */
                            public void mo7083a() {
                                SystemClock.sleep(10000L);
                                if (C1388e.m7292a()) {
                                    C1401r.m7368a(AuthnHelper.this.f5542b).m7373b();
                                }
                            }
                        });
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void delScrip() {
        try {
            C1391h.m7306a(true, true);
            C1386c.m7288b("AuthnHelper", "删除scrip");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public JSONObject getNetworkType(Context context) {
        JSONObject jSONObject = new JSONObject();
        try {
            try {
                boolean zM7346a = C1396m.m7346a(this.f5542b);
                C1357a.m7128a().m7131a(context, zM7346a);
                String strM7320a = C1393j.m7317a().m7320a((String) null);
                int iM7344a = C1396m.m7344a(context, zM7346a, new C1339a(1));
                jSONObject.put("operatortype", strM7320a);
                jSONObject.put("networktype", iM7344a + "");
                StringBuilder sb = new StringBuilder("网络类型: ");
                sb.append(iM7344a);
                C1386c.m7288b("AuthnHelper", sb.toString());
                C1386c.m7288b("AuthnHelper", "运营商类型: " + strM7320a);
                return jSONObject;
            } catch (Exception unused) {
                jSONObject.put("errorDes", "发生未知错误");
                return jSONObject;
            }
        } catch (JSONException e) {
            e.printStackTrace();
            return jSONObject;
        }
    }

    public void getPhoneInfo(final String str, final String str2, final TokenListener tokenListener) {
        final C1339a c1339aM7102a = m7102a(tokenListener);
        final RunnableC1352a runnableC1352a = new RunnableC1352a(c1339aM7102a);
        this.f5544e.postDelayed(runnableC1352a, this.f5543d);
        C1397n.m7353a(new C1397n.a(this.f5542b, c1339aM7102a) { // from class: com.cmic.sso.sdk.auth.AuthnHelper.4
            @Override // com.cmic.sso.sdk.p023e.C1397n.a
            /* JADX INFO: renamed from: a */
            public void mo7083a() {
                if (AuthnHelper.this.m7108a(c1339aM7102a, str, str2, "preGetMobile", 3, tokenListener)) {
                    AuthnHelper.this.f5546g.m7139a(AuthnHelper.this.f5543d);
                    AuthnHelper.this.m7105a(c1339aM7102a, runnableC1352a);
                }
            }
        });
    }

    public void loginAuth(final String str, final String str2, final TokenListener tokenListener) {
        final C1339a c1339aM7102a = m7102a(tokenListener);
        final RunnableC1352a runnableC1352a = new RunnableC1352a(c1339aM7102a);
        this.f5544e.postDelayed(runnableC1352a, this.f5543d);
        C1397n.m7353a(new C1397n.a(this.f5542b, c1339aM7102a) { // from class: com.cmic.sso.sdk.auth.AuthnHelper.2
            @Override // com.cmic.sso.sdk.p023e.C1397n.a
            /* JADX INFO: renamed from: a */
            public void mo7083a() {
                if (AuthnHelper.this.m7108a(c1339aM7102a, str, str2, "loginAuth", 1, tokenListener)) {
                    AuthnHelper.this.m7105a(c1339aM7102a, runnableC1352a);
                }
            }
        });
    }

    public void mobileAuth(final String str, final String str2, final TokenListener tokenListener) {
        final C1339a c1339aM7102a = m7102a(tokenListener);
        final RunnableC1352a runnableC1352a = new RunnableC1352a(c1339aM7102a);
        this.f5544e.postDelayed(runnableC1352a, this.f5543d);
        C1397n.m7353a(new C1397n.a(this.f5542b, c1339aM7102a) { // from class: com.cmic.sso.sdk.auth.AuthnHelper.3
            @Override // com.cmic.sso.sdk.p023e.C1397n.a
            /* JADX INFO: renamed from: a */
            public void mo7083a() {
                if (AuthnHelper.this.m7108a(c1339aM7102a, str, str2, "mobileAuth", 0, tokenListener)) {
                    AuthnHelper.this.m7105a(c1339aM7102a, runnableC1352a);
                }
            }
        });
    }

    public void setOverTime(long j) {
        this.f5543d = j;
    }

    public static AuthnHelper getInstance(Context context, String str) {
        if (f5540c == null) {
            synchronized (AuthnHelper.class) {
                try {
                    if (f5540c == null) {
                        f5540c = new AuthnHelper(context, str);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f5540c;
    }

    private AuthnHelper(Context context, String str) {
        this(context);
        this.f5545f = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m7103a() {
        String str = "%" + C1400q.m7361b();
        C1386c.m7288b("AuthnHelper", "generate aid = ".concat(str));
        C1394k.m7332a("AID", str);
    }

    /* JADX INFO: renamed from: a */
    private C1339a m7102a(TokenListener tokenListener) {
        C1339a c1339a = new C1339a(64);
        String strM7363c = C1400q.m7363c();
        c1339a.m7012a(new C1382a());
        c1339a.m7015a("traceId", strM7363c);
        C1386c.m7286a("traceId", strM7363c);
        if (tokenListener != null) {
            C1388e.m7291a(strM7363c, tokenListener);
        }
        return c1339a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m7105a(C1339a c1339a, final RunnableC1352a runnableC1352a) {
        this.f5541a.m7122a(c1339a, new InterfaceC1354b() { // from class: com.cmic.sso.sdk.auth.AuthnHelper.5
            @Override // com.cmic.sso.sdk.auth.InterfaceC1354b
            /* JADX INFO: renamed from: a */
            public void mo7114a(String str, String str2, C1339a c1339a2, JSONObject jSONObject) {
                AuthnHelper.this.f5544e.removeCallbacks(runnableC1352a);
                AuthnHelper.this.callBackResult(str, str2, c1339a2, jSONObject);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    private void m7104a(final Context context, final String str, final C1339a c1339a) {
        C1397n.m7353a(new C1397n.a() { // from class: com.cmic.sso.sdk.auth.AuthnHelper.8
            @Override // com.cmic.sso.sdk.p023e.C1397n.a
            /* JADX INFO: renamed from: a */
            public void mo7083a() {
                if ("200023".equals(str)) {
                    SystemClock.sleep(10000L);
                }
                new C1383b().m7274a(context, str, c1339a);
            }
        });
    }
}
