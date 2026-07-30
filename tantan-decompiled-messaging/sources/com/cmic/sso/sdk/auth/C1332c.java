package com.cmic.sso.sdk.auth;

import android.text.TextUtils;
import com.cmic.sso.sdk.C1316a;
import com.cmic.sso.sdk.p022e.C1363c;
import com.p046p1.mobile.putong.newui.camera.momosdk.MusicContent;
import com.tencent.open.SocialConstants;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.cmic.sso.sdk.auth.c */
/* JADX INFO: loaded from: classes.dex */
public class C1332c {
    /* JADX INFO: renamed from: a */
    public static JSONObject m7072a(String str, String str2, C1316a c1316a, JSONObject jSONObject) {
        String str3;
        String str4;
        String str5;
        String str6 = "0";
        JSONObject jSONObject2 = new JSONObject();
        try {
            int i = Integer.parseInt(c1316a.m6969b("authType", "0"));
            int iM6971c = c1316a.m6971c("networktype");
            if (i == 3) {
                if (iM6971c == 3) {
                    str4 = "WIFI下网关鉴权";
                    str5 = "1";
                } else {
                    str4 = "网关鉴权";
                    str5 = "2";
                }
                String str7 = str5;
                str3 = str4;
                str6 = str7;
            } else {
                str3 = "其他";
            }
            jSONObject2.put("resultCode", str);
            jSONObject2.put("authType", str6);
            jSONObject2.put("authTypeDes", str3);
            if ("103000".equals(str)) {
                if (1 == c1316a.m6971c("logintype")) {
                    jSONObject2.put("openId", c1316a.m6968b("openId"));
                    jSONObject2.put("securityphone", c1316a.m6968b("securityphone"));
                }
                jSONObject2.put("token", jSONObject.optString("token"));
                jSONObject2.put("tokenExpiresIn", jSONObject.optString("tokenExpiresIn"));
            } else {
                jSONObject2.put(SocialConstants.PARAM_APP_DESC, str2);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        C1363c.m7234b("AuthnResult", "返回参数:" + jSONObject2.toString());
        return jSONObject2;
    }

    /* JADX INFO: renamed from: b */
    public static JSONObject m7073b(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("resultCode", str);
            jSONObject.put(SocialConstants.PARAM_APP_DESC, str2);
            return jSONObject;
        } catch (JSONException e) {
            e.printStackTrace();
            return jSONObject;
        }
    }

    /* JADX INFO: renamed from: a */
    public static JSONObject m7070a(String str, C1316a c1316a, JSONObject jSONObject) {
        String[] strArr = {MusicContent.UNKNOWN_STRING, "移动", "联通", "电信"};
        try {
            String strM6969b = c1316a.m6969b("operatortype", "0");
            if (!"0".equals(strM6969b) && !TextUtils.isEmpty(strM6969b)) {
                jSONObject.put("operatorType", strArr[Integer.parseInt(strM6969b)]);
                return jSONObject;
            }
            if ("103000".equals(str)) {
                jSONObject.put("operatorType", strArr[1]);
                return jSONObject;
            }
            jSONObject.put("operatorType", strArr[0]);
            return jSONObject;
        } catch (Exception e) {
            e.printStackTrace();
            return jSONObject;
        }
    }

    /* JADX INFO: renamed from: a */
    public static JSONObject m7069a(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("resultCode", "103000");
            jSONObject.put(SocialConstants.PARAM_APP_DESC, "true");
            jSONObject.put("securityphone", str);
            return jSONObject;
        } catch (JSONException e) {
            e.printStackTrace();
            return jSONObject;
        }
    }

    /* JADX INFO: renamed from: a */
    public static JSONObject m7071a(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("resultCode", str);
            jSONObject.put(SocialConstants.PARAM_APP_DESC, str2);
            return jSONObject;
        } catch (Exception e) {
            e.printStackTrace();
            return jSONObject;
        }
    }
}
