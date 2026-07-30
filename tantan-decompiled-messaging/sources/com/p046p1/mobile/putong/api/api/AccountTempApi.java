package com.p046p1.mobile.putong.api.api;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.putong.app.TantanApp;
import com.p046p1.mobile.putong.data.AuthData;
import com.p046p1.mobile.putong.data.RememberUserInfo;
import org.eclipse.jetty.util.security.Constraint;
import p149l.ipd0;
import p149l.ix50;
import p149l.qib0;
import p149l.uqd0;
import p149l.wqd0;
import p149l.xqd0;

/* JADX INFO: loaded from: classes9.dex */
public class AccountTempApi {

    /* JADX INFO: renamed from: i */
    public static final char[] f17142i = "0123456789abcdef".toCharArray();

    /* JADX INFO: renamed from: a */
    public final ipd0 f17143a = TantanApp.f17181d;

    /* JADX INFO: renamed from: b */
    @SuppressLint({"SV_USE_DUP_ID"})
    public final wqd0 f17144b = new wqd0(App.f15369e, "putongMasterUserInfo", true, "putongPref");

    /* JADX INFO: renamed from: c */
    @SuppressLint({"SV_USE_DUP_ID"})
    public final wqd0 f17145c = new wqd0(App.f15369e, "putongSwitchUserInfo", true, "putongPref");

    /* JADX INFO: renamed from: d */
    public final wqd0 f17146d = new wqd0(App.f15369e, "putongLastLoginData", true, "putongPref");

    /* JADX INFO: renamed from: e */
    public uqd0 f17147e = new uqd0("pref_key_signup_profile_path_arr" + qib0.f154714c0.userId(), "");

    /* JADX INFO: renamed from: f */
    public final uqd0 f17148f = new uqd0(App.f15369e, "userStudiesTempData" + qib0.f154714c0.userId(), "");

    /* JADX INFO: renamed from: g */
    public final uqd0 f17149g = new uqd0(App.f15369e, "userBloodTypeTempData" + qib0.f154714c0.userId(), "");

    /* JADX INFO: renamed from: h */
    public final xqd0 f17150h = new xqd0("userSubscriptionSettings" + qib0.f154714c0.userId(), null);

    public enum InactiveType {
        Pause("PAUSE"),
        DeleteImmediately("DELETEIMMEDIATELY"),
        None(Constraint.NONE);

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
    public void m29516a(RememberUserInfo rememberUserInfo) {
        AuthData authData;
        if (rememberUserInfo == null || TextUtils.isEmpty(rememberUserInfo.name) || TextUtils.isEmpty(rememberUserInfo.imgUrl) || (authData = rememberUserInfo.auth) == null || TextUtils.isEmpty(authData.accessToken)) {
            return;
        }
        ix50.m138790b().m138792c(rememberUserInfo);
    }

    /* JADX INFO: renamed from: b */
    public void m29517b(String str, AuthData authData, String str2) {
        RememberUserInfo rememberUserInfo = new RememberUserInfo();
        rememberUserInfo.imgUrl = str;
        rememberUserInfo.auth = authData;
        rememberUserInfo.name = str2;
        m29516a(rememberUserInfo);
    }
}
