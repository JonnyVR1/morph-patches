package com.sina.weibo.sdk.auth;

import android.os.Bundle;
import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class Oauth2AccessToken {
    public static final String KEY_ACCESS_TOKEN = "access_token";
    public static final String KEY_EXPIRES_IN = "expires_in";
    public static final String KEY_PHONE_NUM = "phone_num";
    public static final String KEY_REFRESH_TOKEN = "refresh_token";
    public static final String KEY_UID = "uid";
    Bundle bundle;
    private String mAccessToken;
    private long mExpiresTime;
    private String mPhoneNum;
    private String mRefreshToken;
    private String mUid;

    @Deprecated
    public Oauth2AccessToken(String str) {
        this.mUid = "";
        this.mAccessToken = "";
        this.mRefreshToken = "";
        this.mExpiresTime = 0L;
        this.mPhoneNum = "";
        if (str == null || str.indexOf("{") < 0) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            setUid(jSONObject.optString(KEY_UID));
            setToken(jSONObject.optString(KEY_ACCESS_TOKEN));
            setExpiresIn(jSONObject.optString(KEY_EXPIRES_IN));
            setRefreshToken(jSONObject.optString(KEY_REFRESH_TOKEN));
            setPhoneNum(jSONObject.optString(KEY_PHONE_NUM));
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    private static String getString(Bundle bundle, String str, String str2) {
        String string;
        return (bundle == null || (string = bundle.getString(str)) == null) ? str2 : string;
    }

    public static Oauth2AccessToken parseAccessToken(String str) {
        if (TextUtils.isEmpty(str) || str.indexOf("{") < 0) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            Oauth2AccessToken oauth2AccessToken = new Oauth2AccessToken();
            oauth2AccessToken.setUid(jSONObject.optString(KEY_UID));
            oauth2AccessToken.setToken(jSONObject.optString(KEY_ACCESS_TOKEN));
            oauth2AccessToken.setExpiresIn(jSONObject.optString(KEY_EXPIRES_IN));
            oauth2AccessToken.setRefreshToken(jSONObject.optString(KEY_REFRESH_TOKEN));
            oauth2AccessToken.setPhoneNum(jSONObject.optString(KEY_PHONE_NUM));
            return oauth2AccessToken;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    private void setPhoneNum(String str) {
        this.mPhoneNum = str;
    }

    public Bundle getBundle() {
        return this.bundle;
    }

    public long getExpiresTime() {
        return this.mExpiresTime;
    }

    public String getPhoneNum() {
        return this.mPhoneNum;
    }

    public String getRefreshToken() {
        return this.mRefreshToken;
    }

    public String getToken() {
        return this.mAccessToken;
    }

    public String getUid() {
        return this.mUid;
    }

    public boolean isSessionValid() {
        return !TextUtils.isEmpty(this.mAccessToken);
    }

    public void setBundle(Bundle bundle) {
        this.bundle = bundle;
    }

    public void setExpiresIn(String str) {
        if (TextUtils.isEmpty(str) || str.equals("0")) {
            return;
        }
        setExpiresTime(System.currentTimeMillis() + (Long.parseLong(str) * 1000));
    }

    public void setExpiresTime(long j) {
        this.mExpiresTime = j;
    }

    public void setRefreshToken(String str) {
        this.mRefreshToken = str;
    }

    public void setToken(String str) {
        this.mAccessToken = str;
    }

    public void setUid(String str) {
        this.mUid = str;
    }

    public String toString() {
        return "uid: " + this.mUid + ", access_token: " + this.mAccessToken + ", refresh_token: " + this.mRefreshToken + ", phone_num: " + this.mPhoneNum + ", expires_in: " + Long.toString(this.mExpiresTime);
    }

    public static Oauth2AccessToken parseAccessToken(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        Oauth2AccessToken oauth2AccessToken = new Oauth2AccessToken();
        oauth2AccessToken.setUid(getString(bundle, KEY_UID, ""));
        oauth2AccessToken.setToken(getString(bundle, KEY_ACCESS_TOKEN, ""));
        oauth2AccessToken.setExpiresIn(getString(bundle, KEY_EXPIRES_IN, ""));
        oauth2AccessToken.setRefreshToken(getString(bundle, KEY_REFRESH_TOKEN, ""));
        oauth2AccessToken.setPhoneNum(getString(bundle, KEY_PHONE_NUM, ""));
        oauth2AccessToken.setBundle(bundle);
        return oauth2AccessToken;
    }

    public Oauth2AccessToken() {
        this.mUid = "";
        this.mAccessToken = "";
        this.mRefreshToken = "";
        this.mExpiresTime = 0L;
        this.mPhoneNum = "";
    }

    public Oauth2AccessToken(String str, String str2) {
        this.mUid = "";
        this.mRefreshToken = "";
        this.mExpiresTime = 0L;
        this.mPhoneNum = "";
        this.mAccessToken = str;
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.mExpiresTime = jCurrentTimeMillis;
        if (str2 != null) {
            this.mExpiresTime = jCurrentTimeMillis + (Long.parseLong(str2) * 1000);
        }
    }
}
