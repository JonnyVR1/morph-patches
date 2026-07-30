package com.tencent.connect.auth;

import android.annotation.TargetApi;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import com.cosmos.photon.push.service.PushService;
import com.tencent.connect.common.Constants;
import com.tencent.open.log.SLog;
import com.tencent.open.p105b.C14360b;
import com.tencent.open.utils.C14383a;
import com.tencent.open.utils.C14390h;
import com.tencent.open.utils.C14394l;
import com.tencent.open.utils.C14396n;
import com.tencent.open.web.security.JniInterface;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
public class QQToken {
    public static final int AUTH_QQ = 2;
    public static final int AUTH_QZONE = 3;
    public static final int AUTH_WEB = 1;

    /* JADX INFO: renamed from: g */
    private static SharedPreferences f57064g;

    /* JADX INFO: renamed from: a */
    private String f57065a;

    /* JADX INFO: renamed from: b */
    private String f57066b;

    /* JADX INFO: renamed from: c */
    private String f57067c;

    /* JADX INFO: renamed from: d */
    private int f57068d = 1;

    /* JADX INFO: renamed from: e */
    private long f57069e = -1;

    /* JADX INFO: renamed from: f */
    private C14383a f57070f;

    public QQToken(String str) {
        this.f57065a = str;
        try {
            new Thread() { // from class: com.tencent.connect.auth.QQToken.1
                @Override // java.lang.Thread, java.lang.Runnable
                public void run() {
                    QQToken.this.m82023a(PushService.COMMAND_CREATE);
                }
            }.start();
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    private static synchronized JSONObject m82021a(String str, C14383a c14383a) {
        String strM84376b;
        if (C14390h.m84404a() == null) {
            SLog.m84309i("QQToken", "loadJsonPreference context null");
            return null;
        }
        if (str == null) {
            SLog.m84309i("QQToken", "loadJsonPreference prefKey is null");
            return null;
        }
        String string = m82020a().getString(m82025b(str), "");
        if (TextUtils.isEmpty(string)) {
            if (!JniInterface.isJniOk) {
                C14394l.m84439a(AuthAgent.SECURE_LIB_FILE_NAME, AuthAgent.SECURE_LIB_NAME, 5);
                JniInterface.loadSo();
            }
            if (!JniInterface.isJniOk) {
                SLog.m84309i("QQToken", "loadJsonPreference jni load fail SECURE_LIB_VERSION=5");
                return null;
            }
            String strM82027d = m82027d(str);
            String string2 = m82020a().getString(strM82027d, "");
            try {
                if (TextUtils.isEmpty(string2)) {
                    String strM82026c = m82026c(str);
                    String string3 = m82020a().getString(strM82026c, "");
                    try {
                        if (TextUtils.isEmpty(string3)) {
                            SLog.m84309i("QQToken", "loadJsonPreference oldDesValue null");
                            return null;
                        }
                        try {
                            strM84376b = JniInterface.m84522d1(string3);
                            if (TextUtils.isEmpty(strM84376b)) {
                                SLog.m84309i("QQToken", "loadJsonPreference decodeResult d1 empty");
                                m82020a().edit().remove(strM82026c).apply();
                                return null;
                            }
                            m82024a(str, new JSONObject(strM84376b), c14383a);
                            m82020a().edit().remove(strM82026c).apply();
                        } catch (Exception e) {
                            SLog.m84308e("QQToken", "Catch Exception", e);
                            m82020a().edit().remove(strM82026c).apply();
                            return null;
                        }
                    } catch (Throwable th) {
                        m82020a().edit().remove(strM82026c).apply();
                        throw th;
                    }
                } else {
                    try {
                        strM84376b = JniInterface.m84523d2(string2);
                        m82024a(str, new JSONObject(strM84376b), c14383a);
                        m82020a().edit().remove(strM82027d).apply();
                    } catch (Exception e2) {
                        SLog.m84308e("QQToken", "Catch Exception", e2);
                        m82020a().edit().remove(strM82027d).apply();
                        return null;
                    }
                }
            } catch (Throwable th2) {
                m82020a().edit().remove(strM82027d).apply();
                throw th2;
            }
            throw th;
        }
        strM84376b = c14383a.m84376b(string);
        try {
            JSONObject jSONObject = new JSONObject(strM84376b);
            SLog.m84309i("QQToken", "loadJsonPreference sucess");
            return jSONObject;
        } catch (Exception e3) {
            SLog.m84309i("QQToken", "loadJsonPreference decode " + e3.toString());
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    private static String m82025b(String str) {
        return Base64.encodeToString(C14396n.m84510j(str), 2) + "_aes_google";
    }

    @Deprecated
    /* JADX INFO: renamed from: c */
    private static String m82026c(String str) {
        return Base64.encodeToString(C14396n.m84510j(str), 2);
    }

    @Deprecated
    /* JADX INFO: renamed from: d */
    private static String m82027d(String str) {
        return Base64.encodeToString(C14396n.m84510j(str), 2) + "_spkey";
    }

    public String getAccessToken() {
        return this.f57066b;
    }

    public String getAppId() {
        return this.f57065a;
    }

    public int getAuthSource() {
        return this.f57068d;
    }

    public long getExpireTimeInSecond() {
        return this.f57069e;
    }

    public String getOpenId() {
        return this.f57067c;
    }

    public String getOpenIdWithCache() {
        String openId = getOpenId();
        try {
            if (!TextUtils.isEmpty(openId)) {
                SLog.m84309i("QQToken", "getOpenId from field openId = " + openId + " appId = " + this.f57065a);
                return openId;
            }
            JSONObject jSONObjectLoadSession = loadSession(this.f57065a);
            if (jSONObjectLoadSession != null) {
                openId = jSONObjectLoadSession.getString("openid");
                if (!TextUtils.isEmpty(openId)) {
                    setOpenId(openId);
                }
            }
            SLog.m84309i("QQToken", "getOpenId from Session openId = " + openId + " appId = " + this.f57065a);
            return openId;
        } catch (Exception e) {
            SLog.m84309i("QQToken", "getLocalOpenIdByAppId " + e.toString());
            return openId;
        }
    }

    public boolean isSessionValid() {
        return this.f57066b != null && System.currentTimeMillis() < this.f57069e;
    }

    public JSONObject loadSession(String str) {
        try {
            m82023a("loadSession");
            return m82021a(str, this.f57070f);
        } catch (Exception e) {
            SLog.m84309i("QQToken", "login loadSession" + e.toString());
            return null;
        }
    }

    public void removeSession(String str) {
        SharedPreferences.Editor editorEdit = m82020a().edit();
        editorEdit.remove(m82027d(str));
        editorEdit.remove(m82027d(str));
        editorEdit.remove(m82025b(str));
        editorEdit.apply();
        SLog.m84309i("QQToken", "removeSession sucess");
    }

    public boolean saveSession(JSONObject jSONObject) {
        try {
            m82023a("saveSession");
            return m82024a(this.f57065a, jSONObject, this.f57070f);
        } catch (Exception e) {
            SLog.m84309i("QQToken", "login saveSession" + e.toString());
            return false;
        }
    }

    public void setAccessToken(String str, String str2) throws NumberFormatException {
        this.f57066b = str;
        this.f57069e = 0L;
        if (str2 != null) {
            this.f57069e = System.currentTimeMillis() + (Long.parseLong(str2) * 1000);
        }
    }

    public void setAppId(String str) {
        this.f57065a = str;
    }

    public void setAuthSource(int i) {
        this.f57068d = i;
    }

    public void setOpenId(String str) {
        this.f57067c = str;
        C14360b.m84248a().m84257a(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public synchronized void m82023a(String str) {
        if (this.f57070f == null) {
            SLog.m84309i("QQToken", "initAESUtils " + str);
            this.f57070f = new C14383a(C14390h.m84404a());
            SLog.m84309i("QQToken", "initAESUtils " + str + " end");
        }
    }

    @TargetApi(11)
    /* JADX INFO: renamed from: a */
    private static synchronized SharedPreferences m82020a() {
        try {
            if (f57064g == null) {
                f57064g = C14390h.m84404a().getSharedPreferences("token_info_file", 0);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f57064g;
    }

    /* JADX INFO: renamed from: a */
    private static synchronized boolean m82024a(String str, JSONObject jSONObject, C14383a c14383a) {
        if (C14390h.m84404a() == null) {
            SLog.m84309i("QQToken", "saveJsonPreference context null");
            return false;
        }
        if (str != null && jSONObject != null) {
            try {
                String string = jSONObject.getString("expires_in");
                if (!TextUtils.isEmpty(string)) {
                    jSONObject.put(Constants.PARAM_EXPIRES_TIME, System.currentTimeMillis() + (Long.parseLong(string) * 1000));
                    String strM82025b = m82025b(str);
                    String strM84375a = c14383a.m84375a(jSONObject.toString());
                    if (strM82025b.length() > 6 && strM84375a != null) {
                        m82020a().edit().putString(strM82025b, strM84375a).commit();
                        SLog.m84309i("QQToken", "saveJsonPreference sucess");
                        return true;
                    }
                    SLog.m84309i("QQToken", "saveJsonPreference keyEncode or josnEncode null");
                    return false;
                }
                SLog.m84309i("QQToken", "expires is null");
                return false;
            } catch (Exception e) {
                SLog.m84307e("QQToken", "saveJsonPreference exception:" + e.toString());
                return false;
            }
        }
        SLog.m84309i("QQToken", "saveJsonPreference prefKey or jsonObject null");
        return false;
    }
}
