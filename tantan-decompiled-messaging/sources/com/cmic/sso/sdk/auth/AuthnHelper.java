package com.cmic.sso.sdk.auth;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import com.cmic.sso.sdk.C1316a;
import com.cmic.sso.sdk.C1335c;
import com.cmic.sso.sdk.p014a.C1317a;
import com.cmic.sso.sdk.p014a.C1319c;
import com.cmic.sso.sdk.p015b.C1334a;
import com.cmic.sso.sdk.p021d.C1359a;
import com.cmic.sso.sdk.p021d.C1360b;
import com.cmic.sso.sdk.p022e.C1362b;
import com.cmic.sso.sdk.p022e.C1363c;
import com.cmic.sso.sdk.p022e.C1365e;
import com.cmic.sso.sdk.p022e.C1368h;
import com.cmic.sso.sdk.p022e.C1370j;
import com.cmic.sso.sdk.p022e.C1371k;
import com.cmic.sso.sdk.p022e.C1373m;
import com.cmic.sso.sdk.p022e.C1374n;
import com.cmic.sso.sdk.p022e.C1375o;
import com.cmic.sso.sdk.p022e.C1377q;
import com.cmic.sso.sdk.p022e.C1378r;
import com.tencent.open.SocialConstants;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class AuthnHelper {
    public static final String SDK_VERSION = "quick_login_android_9.5.5.3";

    /* JADX INFO: renamed from: c */
    @SuppressLint({"StaticFieldLeak"})
    private static AuthnHelper f5503c;

    /* JADX INFO: renamed from: a */
    private final C1330a f5504a;

    /* JADX INFO: renamed from: b */
    private final Context f5505b;

    /* JADX INFO: renamed from: d */
    private long f5506d;

    /* JADX INFO: renamed from: e */
    private final Handler f5507e;

    /* JADX INFO: renamed from: f */
    private String f5508f;

    /* JADX INFO: renamed from: g */
    private final C1335c f5509g;

    /* JADX INFO: renamed from: com.cmic.sso.sdk.auth.AuthnHelper$a */
    public class RunnableC1329a implements Runnable {

        /* JADX INFO: renamed from: b */
        private final C1316a f5540b;

        public RunnableC1329a(C1316a c1316a) {
            this.f5540b = c1316a;
        }

        @Override // java.lang.Runnable
        public void run() {
            JSONObject jSONObjectM7071a = (C1378r.m7314a(AuthnHelper.this.f5505b).m7318a() || !this.f5540b.m6970b("doNetworkSwitch", false)) ? C1332c.m7071a("200023", "登录超时") : C1332c.m7071a("102508", "数据网络切换失败");
            AuthnHelper.this.callBackResult(jSONObjectM7071a.optString("resultCode", "200023"), jSONObjectM7071a.optString(SocialConstants.PARAM_APP_DESC, "登录超时"), this.f5540b, jSONObjectM7071a);
        }
    }

    private AuthnHelper(Context context) {
        this.f5506d = 8000L;
        Context applicationContext = context.getApplicationContext();
        this.f5505b = applicationContext;
        this.f5507e = new Handler(applicationContext.getMainLooper());
        this.f5504a = C1330a.m7061a(applicationContext);
        C1378r.m7314a(applicationContext);
        C1371k.m7276a(applicationContext);
        C1370j.m7264a(applicationContext);
        this.f5509g = new C1335c();
        C1374n.m7299a(new C1374n.a() { // from class: com.cmic.sso.sdk.auth.AuthnHelper.1
            @Override // com.cmic.sso.sdk.p022e.C1374n.a
            /* JADX INFO: renamed from: a */
            public void mo7029a() {
                String strM7281b = C1371k.m7281b("AID", "");
                C1363c.m7234b("AuthnHelper", "aid = " + strM7281b);
                if (TextUtils.isEmpty(strM7281b)) {
                    AuthnHelper.this.m7049a();
                }
                if (C1362b.m7227a(AuthnHelper.this.f5505b, true)) {
                    C1363c.m7234b("AuthnHelper", "生成androidkeystore成功");
                } else {
                    C1363c.m7234b("AuthnHelper", "生成androidkeystore失败");
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public synchronized boolean m7054a(C1316a c1316a, String str, String str2, String str3, int i, TokenListener tokenListener) {
        try {
            C1317a c1317aM7034a = C1319c.m7031a(this.f5505b).m7034a();
            C1363c.m7234b("AuthnHelper", "umcConfigBean = " + c1317aM7034a.toString());
            c1316a.m6957a(c1317aM7034a);
            c1316a.m6962a("use2048PublicKey", "rsa2048".equals(this.f5508f));
            c1316a.m6960a("systemStartTime", SystemClock.elapsedRealtime());
            c1316a.m6961a("starttime", C1375o.m7301a());
            c1316a.m6961a("loginMethod", str3);
            c1316a.m6961a("appkey", str2);
            c1316a.m6961a("appid", str);
            c1316a.m6961a("timeOut", String.valueOf(this.f5506d));
            boolean zM7292a = C1373m.m7292a(this.f5505b);
            C1334a.m7074a().m7077a(this.f5505b, zM7292a);
            String strM7268b = C1370j.m7263a().m7268b();
            String strM7269c = C1370j.m7263a().m7269c();
            String strM7266a = C1370j.m7263a().m7266a(strM7269c);
            C1370j.m7263a().m7267a(c1316a);
            c1316a.m6961a("operator", strM7269c);
            c1316a.m6961a("operatortype", strM7266a);
            c1316a.m6959a("logintype", i);
            C1363c.m7234b("AuthnHelper", "subId = " + strM7268b);
            if (!TextUtils.isEmpty(strM7268b)) {
                C1363c.m7232a("AuthnHelper", "使用subId作为缓存key = " + strM7268b);
                c1316a.m6961a("scripType", "subid");
                c1316a.m6961a("scripKey", strM7268b);
            } else if (!TextUtils.isEmpty(strM7269c)) {
                C1363c.m7232a("AuthnHelper", "使用operator作为缓存key = " + strM7269c);
                c1316a.m6961a("scripType", "operator");
                c1316a.m6961a("scripKey", strM7269c);
            }
            int iM7290a = C1373m.m7290a(this.f5505b, zM7292a, c1316a);
            c1316a.m6959a("networktype", iM7290a);
            if (!zM7292a) {
                c1316a.m6961a("authType", String.valueOf(0));
                callBackResult("200010", "无法识别sim卡或没有sim卡", c1316a, null);
                return false;
            }
            if (tokenListener == null) {
                callBackResult("102203", "listener不能为空", c1316a, null);
                return false;
            }
            if (c1317aM7034a.m6990g()) {
                callBackResult("200082", "服务器繁忙，请稍后重试", c1316a, null);
                return false;
            }
            if (TextUtils.isEmpty(str == null ? "" : str.trim())) {
                callBackResult("102203", "appId 不能为空", c1316a, null);
                return false;
            }
            if (TextUtils.isEmpty(str2 == null ? "" : str2.trim())) {
                callBackResult("102203", "appkey不能为空", c1316a, null);
                return false;
            }
            if (iM7290a == 0) {
                callBackResult("102101", "未检测到网络", c1316a, null);
                return false;
            }
            if ("2".equals(strM7266a) && c1317aM7034a.m6989f()) {
                callBackResult("200082", "服务器繁忙，请稍后重试", c1316a, null);
                return false;
            }
            if (!"3".equals(strM7266a) || !c1317aM7034a.m6988e()) {
                return true;
            }
            callBackResult("200082", "服务器繁忙，请稍后重试", c1316a, null);
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    public static AuthnHelper getInstance(Context context) {
        if (f5503c == null) {
            synchronized (AuthnHelper.class) {
                try {
                    if (f5503c == null) {
                        f5503c = new AuthnHelper(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f5503c;
    }

    public static void setDebugMode(boolean z) {
        C1363c.m7233a(z);
    }

    public void callBackResult(String str, String str2, C1316a c1316a, JSONObject jSONObject) {
        final JSONObject jSONObjectM7072a;
        try {
            String strM6968b = c1316a.m6968b("traceId");
            if (C1365e.m7239a(strM6968b)) {
                return;
            }
            synchronized (this) {
                try {
                    final TokenListener tokenListenerM7241c = C1365e.m7241c(strM6968b);
                    C1365e.m7240b(strM6968b);
                    if (tokenListenerM7241c == null) {
                        return;
                    }
                    c1316a.m6960a("systemEndTime", SystemClock.elapsedRealtime());
                    c1316a.m6961a("endtime", C1375o.m7301a());
                    int iM6971c = c1316a.m6971c("logintype");
                    if (jSONObject == null) {
                        jSONObject = C1332c.m7071a(str, str2);
                    }
                    if (iM6971c == 3) {
                        jSONObjectM7072a = C1332c.m7070a(str, c1316a, jSONObject);
                        this.f5509g.m7084a();
                    } else {
                        jSONObjectM7072a = C1332c.m7072a(str, str2, c1316a, jSONObject);
                    }
                    jSONObjectM7072a.put("scripExpiresIn", String.valueOf(C1368h.m7248a()));
                    this.f5507e.post(new Runnable() { // from class: com.cmic.sso.sdk.auth.AuthnHelper.6
                        @Override // java.lang.Runnable
                        public void run() {
                            tokenListenerM7241c.onGetTokenComplete(jSONObjectM7072a);
                        }
                    });
                    C1319c.m7031a(this.f5505b).m7035a(c1316a);
                    if (!c1316a.m6967b().m6993j() && !C1377q.m7305a(c1316a.m6967b())) {
                        m7050a(this.f5505b, str, c1316a);
                    }
                    if (C1365e.m7238a()) {
                        C1374n.m7299a(new C1374n.a() { // from class: com.cmic.sso.sdk.auth.AuthnHelper.7
                            @Override // com.cmic.sso.sdk.p022e.C1374n.a
                            /* JADX INFO: renamed from: a */
                            public void mo7029a() {
                                SystemClock.sleep(10000L);
                                if (C1365e.m7238a()) {
                                    C1378r.m7314a(AuthnHelper.this.f5505b).m7319b();
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
            C1368h.m7252a(true, true);
            C1363c.m7234b("AuthnHelper", "删除scrip");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public JSONObject getNetworkType(Context context) {
        JSONObject jSONObject = new JSONObject();
        try {
            try {
                boolean zM7292a = C1373m.m7292a(this.f5505b);
                C1334a.m7074a().m7077a(context, zM7292a);
                String strM7266a = C1370j.m7263a().m7266a((String) null);
                int iM7290a = C1373m.m7290a(context, zM7292a, new C1316a(1));
                jSONObject.put("operatortype", strM7266a);
                jSONObject.put("networktype", iM7290a + "");
                StringBuilder sb = new StringBuilder("网络类型: ");
                sb.append(iM7290a);
                C1363c.m7234b("AuthnHelper", sb.toString());
                C1363c.m7234b("AuthnHelper", "运营商类型: " + strM7266a);
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
        final C1316a c1316aM7048a = m7048a(tokenListener);
        final RunnableC1329a runnableC1329a = new RunnableC1329a(c1316aM7048a);
        this.f5507e.postDelayed(runnableC1329a, this.f5506d);
        C1374n.m7299a(new C1374n.a(this.f5505b, c1316aM7048a) { // from class: com.cmic.sso.sdk.auth.AuthnHelper.4
            @Override // com.cmic.sso.sdk.p022e.C1374n.a
            /* JADX INFO: renamed from: a */
            public void mo7029a() {
                if (AuthnHelper.this.m7054a(c1316aM7048a, str, str2, "preGetMobile", 3, tokenListener)) {
                    AuthnHelper.this.f5509g.m7085a(AuthnHelper.this.f5506d);
                    AuthnHelper.this.m7051a(c1316aM7048a, runnableC1329a);
                }
            }
        });
    }

    public void loginAuth(final String str, final String str2, final TokenListener tokenListener) {
        final C1316a c1316aM7048a = m7048a(tokenListener);
        final RunnableC1329a runnableC1329a = new RunnableC1329a(c1316aM7048a);
        this.f5507e.postDelayed(runnableC1329a, this.f5506d);
        C1374n.m7299a(new C1374n.a(this.f5505b, c1316aM7048a) { // from class: com.cmic.sso.sdk.auth.AuthnHelper.2
            @Override // com.cmic.sso.sdk.p022e.C1374n.a
            /* JADX INFO: renamed from: a */
            public void mo7029a() {
                if (AuthnHelper.this.m7054a(c1316aM7048a, str, str2, "loginAuth", 1, tokenListener)) {
                    AuthnHelper.this.m7051a(c1316aM7048a, runnableC1329a);
                }
            }
        });
    }

    public void mobileAuth(final String str, final String str2, final TokenListener tokenListener) {
        final C1316a c1316aM7048a = m7048a(tokenListener);
        final RunnableC1329a runnableC1329a = new RunnableC1329a(c1316aM7048a);
        this.f5507e.postDelayed(runnableC1329a, this.f5506d);
        C1374n.m7299a(new C1374n.a(this.f5505b, c1316aM7048a) { // from class: com.cmic.sso.sdk.auth.AuthnHelper.3
            @Override // com.cmic.sso.sdk.p022e.C1374n.a
            /* JADX INFO: renamed from: a */
            public void mo7029a() {
                if (AuthnHelper.this.m7054a(c1316aM7048a, str, str2, "mobileAuth", 0, tokenListener)) {
                    AuthnHelper.this.m7051a(c1316aM7048a, runnableC1329a);
                }
            }
        });
    }

    public void setOverTime(long j) {
        this.f5506d = j;
    }

    public static AuthnHelper getInstance(Context context, String str) {
        if (f5503c == null) {
            synchronized (AuthnHelper.class) {
                try {
                    if (f5503c == null) {
                        f5503c = new AuthnHelper(context, str);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f5503c;
    }

    private AuthnHelper(Context context, String str) {
        this(context);
        this.f5508f = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m7049a() {
        String str = "%" + C1377q.m7307b();
        C1363c.m7234b("AuthnHelper", "generate aid = ".concat(str));
        C1371k.m7278a("AID", str);
    }

    /* JADX INFO: renamed from: a */
    private C1316a m7048a(TokenListener tokenListener) {
        C1316a c1316a = new C1316a(64);
        String strM7309c = C1377q.m7309c();
        c1316a.m6958a(new C1359a());
        c1316a.m6961a("traceId", strM7309c);
        C1363c.m7232a("traceId", strM7309c);
        if (tokenListener != null) {
            C1365e.m7237a(strM7309c, tokenListener);
        }
        return c1316a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m7051a(C1316a c1316a, final RunnableC1329a runnableC1329a) {
        this.f5504a.m7068a(c1316a, new InterfaceC1331b() { // from class: com.cmic.sso.sdk.auth.AuthnHelper.5
            @Override // com.cmic.sso.sdk.auth.InterfaceC1331b
            /* JADX INFO: renamed from: a */
            public void mo7060a(String str, String str2, C1316a c1316a2, JSONObject jSONObject) {
                AuthnHelper.this.f5507e.removeCallbacks(runnableC1329a);
                AuthnHelper.this.callBackResult(str, str2, c1316a2, jSONObject);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    private void m7050a(final Context context, final String str, final C1316a c1316a) {
        C1374n.m7299a(new C1374n.a() { // from class: com.cmic.sso.sdk.auth.AuthnHelper.8
            @Override // com.cmic.sso.sdk.p022e.C1374n.a
            /* JADX INFO: renamed from: a */
            public void mo7029a() {
                if ("200023".equals(str)) {
                    SystemClock.sleep(10000L);
                }
                new C1360b().m7220a(context, str, c1316a);
            }
        });
    }
}
