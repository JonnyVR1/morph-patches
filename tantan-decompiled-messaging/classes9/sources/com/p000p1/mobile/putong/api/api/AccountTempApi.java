package com.p000p1.mobile.putong.api.api;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import com.p000p1.mobile.putong.app.TantanApp;
import com.p1.mobile.android.app.App;
import com.p1.mobile.putong.data.AuthData;
import com.p1.mobile.putong.data.RememberUserInfo;
import com.p1.mobile.putong.data.UserSubscriptionSettings;
import l.ipd0;
import l.ix50;
import l.uqd0;
import l.wqd0;
import l.xqd0;
import p006l.qib0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class AccountTempApi {

    /* JADX INFO: renamed from: i */
    public static final char[] f1131i = "0123456789abcdef".toCharArray();

    /* JADX INFO: renamed from: a */
    public final ipd0 f1132a = TantanApp.f1170d;

    /* JADX INFO: renamed from: b */
    @SuppressLint({"SV_USE_DUP_ID"})
    public final wqd0 f1133b = new wqd0(App.e, "putongMasterUserInfo", true, "putongPref");

    /* JADX INFO: renamed from: c */
    @SuppressLint({"SV_USE_DUP_ID"})
    public final wqd0 f1134c = new wqd0(App.e, "putongSwitchUserInfo", true, "putongPref");

    /* JADX INFO: renamed from: d */
    public final wqd0 f1135d = new wqd0(App.e, "putongLastLoginData", true, "putongPref");

    /* JADX INFO: renamed from: e */
    public uqd0 f1136e = new uqd0("pref_key_signup_profile_path_arr" + qib0.f19805c0.userId(), "");

    /* JADX INFO: renamed from: f */
    public final uqd0 f1137f = new uqd0(App.e, "userStudiesTempData" + qib0.f19805c0.userId(), "");

    /* JADX INFO: renamed from: g */
    public final uqd0 f1138g = new uqd0(App.e, "userBloodTypeTempData" + qib0.f19805c0.userId(), "");

    /* JADX INFO: renamed from: h */
    public final xqd0 f1139h = new xqd0("userSubscriptionSettings" + qib0.f19805c0.userId(), (UserSubscriptionSettings) null);

    public enum InactiveType {
        Pause("PAUSE"),
        DeleteImmediately("DELETEIMMEDIATELY"),
        None("NONE");

        private String name;

        InactiveType(String str) {
            this.name = str;
        }

        public String getName() {
            return this.name;
        }
    }

    public enum SignUpType {
        phone,
        facebook,
        wechat,
        nopassword,
        chinaMobile,
        chinaUnicom,
        basic,
        media,
        nameInfoSaved,
        genderInfoSave,
        birthInfoSaved,
        qq,
        google,
        intlFriendPurposeSaved,
        ethnicitySaved,
        languageSaved,
        cosmos,
        email
    }

    /* JADX INFO: renamed from: a */
    public void m1422a(RememberUserInfo rememberUserInfo) {
        AuthData authData;
        if (rememberUserInfo == null || TextUtils.isEmpty(rememberUserInfo.name) || TextUtils.isEmpty(rememberUserInfo.imgUrl) || (authData = rememberUserInfo.auth) == null || TextUtils.isEmpty(authData.accessToken)) {
            return;
        }
        ix50.b().c(rememberUserInfo);
    }

    /* JADX INFO: renamed from: b */
    public void m1423b(String str, AuthData authData, String str2) {
        RememberUserInfo rememberUserInfo = new RememberUserInfo();
        rememberUserInfo.imgUrl = str;
        rememberUserInfo.auth = authData;
        rememberUserInfo.name = str2;
        m1422a(rememberUserInfo);
    }
}
