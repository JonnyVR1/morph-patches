package com.tencent.connect.auth;

import android.annotation.TargetApi;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import com.cosmos.photon.push.service.PushService;
import com.tencent.connect.common.Constants;
import com.tencent.open.log.SLog;
import com.tencent.open.p110b.C14523b;
import com.tencent.open.utils.C14546a;
import com.tencent.open.utils.C14553h;
import com.tencent.open.utils.C14557l;
import com.tencent.open.utils.C14559n;
import com.tencent.open.web.security.JniInterface;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public class QQToken {
    public static final int AUTH_QQ = 2;
    public static final int AUTH_QZONE = 3;
    public static final int AUTH_WEB = 1;

    /* JADX INFO: renamed from: g */
    private static SharedPreferences f57912g;

    /* JADX INFO: renamed from: a */
    private String f57913a;

    /* JADX INFO: renamed from: b */
    private String f57914b;

    /* JADX INFO: renamed from: c */
    private String f57915c;

    /* JADX INFO: renamed from: d */
    private int f57916d = 1;

    /* JADX INFO: renamed from: e */
    private long f57917e = -1;

    /* JADX INFO: renamed from: f */
    private C14546a f57918f;

    public QQToken(String str) {
        this.f57913a = str;
        try {
            new Thread() { // from class: com.tencent.connect.auth.QQToken.1
                @Override // java.lang.Thread, java.lang.Runnable
                public void run() {
                    QQToken.this.m83206a(PushService.COMMAND_CREATE);
                }
            }.start();
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    private static synchronized JSONObject m83204a(String str, C14546a c14546a) {
        String strM85559b;
        if (C14553h.m85587a() == null) {
            SLog.m85492i("QQToken", "loadJsonPreference context null");
            return null;
        }
        if (str == null) {
            SLog.m85492i("QQToken", "loadJsonPreference prefKey is null");
            return null;
        }
        String string = m83203a().getString(m83208b(str), "");
        if (TextUtils.isEmpty(string)) {
            if (!JniInterface.isJniOk) {
                C14557l.m85622a(AuthAgent.SECURE_LIB_FILE_NAME, AuthAgent.SECURE_LIB_NAME, 5);
                JniInterface.loadSo();
            }
            if (!JniInterface.isJniOk) {
                SLog.m85492i("QQToken", "loadJsonPreference jni load fail SECURE_LIB_VERSION=5");
                return null;
            }
            String strM83210d = m83210d(str);
            String string2 = m83203a().getString(strM83210d, "");
            try {
                if (TextUtils.isEmpty(string2)) {
                    String strM83209c = m83209c(str);
                    String string3 = m83203a().getString(strM83209c, "");
                    try {
                        if (TextUtils.isEmpty(string3)) {
                            SLog.m85492i("QQToken", "loadJsonPreference oldDesValue null");
                            return null;
                        }
                        try {
                            strM85559b = JniInterface.m85705d1(string3);
                            if (TextUtils.isEmpty(strM85559b)) {
                                SLog.m85492i("QQToken", "loadJsonPreference decodeResult d1 empty");
                                m83203a().edit().remove(strM83209c).apply();
                                return null;
                            }
                            m83207a(str, new JSONObject(strM85559b), c14546a);
                            m83203a().edit().remove(strM83209c).apply();
                        } catch (Exception e) {
                            SLog.m85491e("QQToken", "Catch Exception", e);
                            m83203a().edit().remove(strM83209c).apply();
                            return null;
                        }
                    } catch (Throwable th) {
                        m83203a().edit().remove(strM83209c).apply();
                        throw th;
                    }
                } else {
                    try {
                        strM85559b = JniInterface.m85706d2(string2);
                        m83207a(str, new JSONObject(strM85559b), c14546a);
                        m83203a().edit().remove(strM83210d).apply();
                    } catch (Exception e2) {
                        SLog.m85491e("QQToken", "Catch Exception", e2);
                        m83203a().edit().remove(strM83210d).apply();
                        return null;
                    }
                }
            } catch (Throwable th2) {
                m83203a().edit().remove(strM83210d).apply();
                throw th2;
            }
            throw th;
        }
        strM85559b = c14546a.m85559b(string);
        try {
            JSONObject jSONObject = new JSONObject(strM85559b);
            SLog.m85492i("QQToken", "loadJsonPreference sucess");
            return jSONObject;
        } catch (Exception e3) {
            SLog.m85492i("QQToken", "loadJsonPreference decode " + e3.toString());
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    private static String m83208b(String str) {
        return Base64.encodeToString(C14559n.m85693j(str), 2) + "_aes_google";
    }

    @Deprecated
    /* JADX INFO: renamed from: c */
    private static String m83209c(String str) {
        return Base64.encodeToString(C14559n.m85693j(str), 2);
    }

    @Deprecated
    /* JADX INFO: renamed from: d */
    private static String m83210d(String str) {
        return Base64.encodeToString(C14559n.m85693j(str), 2) + "_spkey";
    }

    public String getAccessToken() {
        return this.f57914b;
    }

    public String getAppId() {
        return this.f57913a;
    }

    public int getAuthSource() {
        return this.f57916d;
    }

    public long getExpireTimeInSecond() {
        return this.f57917e;
    }

    public String getOpenId() {
        return this.f57915c;
    }

    public String getOpenIdWithCache() {
        String openId = getOpenId();
        try {
            if (!TextUtils.isEmpty(openId)) {
                SLog.m85492i("QQToken", "getOpenId from field openId = " + openId + " appId = " + this.f57913a);
                return openId;
            }
            JSONObject jSONObjectLoadSession = loadSession(this.f57913a);
            if (jSONObjectLoadSession != null) {
                openId = jSONObjectLoadSession.getString("openid");
                if (!TextUtils.isEmpty(openId)) {
                    setOpenId(openId);
                }
            }
            SLog.m85492i("QQToken", "getOpenId from Session openId = " + openId + " appId = " + this.f57913a);
            return openId;
        } catch (Exception e) {
            SLog.m85492i("QQToken", "getLocalOpenIdByAppId " + e.toString());
            return openId;
        }
    }

    public boolean isSessionValid() {
        return this.f57914b != null && System.currentTimeMillis() < this.f57917e;
    }

    public JSONObject loadSession(String str) {
        try {
            m83206a("loadSession");
            return m83204a(str, this.f57918f);
        } catch (Exception e) {
            SLog.m85492i("QQToken", "login loadSession" + e.toString());
            return null;
        }
    }

    public void removeSession(String str) {
        SharedPreferences.Editor editorEdit = m83203a().edit();
        editorEdit.remove(m83210d(str));
        editorEdit.remove(m83210d(str));
        editorEdit.remove(m83208b(str));
        editorEdit.apply();
        SLog.m85492i("QQToken", "removeSession sucess");
    }

    public boolean saveSession(JSONObject jSONObject) {
        try {
            m83206a("saveSession");
            return m83207a(this.f57913a, jSONObject, this.f57918f);
        } catch (Exception e) {
            SLog.m85492i("QQToken", "login saveSession" + e.toString());
            return false;
        }
    }

    public void setAccessToken(String str, String str2) throws NumberFormatException {
        this.f57914b = str;
        this.f57917e = 0L;
        if (str2 != null) {
            this.f57917e = System.currentTimeMillis() + (Long.parseLong(str2) * 1000);
        }
    }

    public void setAppId(String str) {
        this.f57913a = str;
    }

    public void setAuthSource(int i) {
        this.f57916d = i;
    }

    public void setOpenId(String str) {
        this.f57915c = str;
        C14523b.m85431a().m85440a(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public synchronized void m83206a(String str) {
        if (this.f57918f == null) {
            SLog.m85492i("QQToken", "initAESUtils " + str);
            this.f57918f = new C14546a(C14553h.m85587a());
            SLog.m85492i("QQToken", "initAESUtils " + str + " end");
        }
    }

    @TargetApi(11)
    /* JADX INFO: renamed from: a */
    private static synchronized SharedPreferences m83203a() {
        try {
            if (f57912g == null) {
                f57912g = C14553h.m85587a().getSharedPreferences("token_info_file", 0);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f57912g;
    }

    /* JADX INFO: renamed from: a */
    private static synchronized boolean m83207a(String str, JSONObject jSONObject, C14546a c14546a) {
        if (C14553h.m85587a() == null) {
            SLog.m85492i("QQToken", "saveJsonPreference context null");
            return false;
        }
        if (str != null && jSONObject != null) {
            try {
                String string = jSONObject.getString("expires_in");
                if (!TextUtils.isEmpty(string)) {
                    jSONObject.put(Constants.PARAM_EXPIRES_TIME, System.currentTimeMillis() + (Long.parseLong(string) * 1000));
                    String strM83208b = m83208b(str);
                    String strM85558a = c14546a.m85558a(jSONObject.toString());
                    if (strM83208b.length() > 6 && strM85558a != null) {
                        m83203a().edit().putString(strM83208b, strM85558a).commit();
                        SLog.m85492i("QQToken", "saveJsonPreference sucess");
                        return true;
                    }
                    SLog.m85492i("QQToken", "saveJsonPreference keyEncode or josnEncode null");
                    return false;
                }
                SLog.m85492i("QQToken", "expires is null");
                return false;
            } catch (Exception e) {
                SLog.m85490e("QQToken", "saveJsonPreference exception:" + e.toString());
                return false;
            }
        }
        SLog.m85492i("QQToken", "saveJsonPreference prefKey or jsonObject null");
        return false;
    }
}
