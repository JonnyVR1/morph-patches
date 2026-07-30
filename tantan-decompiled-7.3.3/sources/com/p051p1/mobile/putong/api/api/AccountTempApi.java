package com.p051p1.mobile.putong.api.api;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.putong.app.TantanApp;
import com.p051p1.mobile.putong.data.AuthData;
import com.p051p1.mobile.putong.data.RememberUserInfo;
import org.eclipse.jetty.util.security.Constraint;
import p153l.kxd0;
import p153l.o560;
import p153l.uqb0;
import p153l.wyd0;
import p153l.yyd0;
import p153l.zyd0;

/* JADX INFO: loaded from: classes9.dex */
public class AccountTempApi {

    /* JADX INFO: renamed from: i */
    public static final char[] f17861i = "0123456789abcdef".toCharArray();

    /* JADX INFO: renamed from: a */
    public final kxd0 f17862a = TantanApp.f17900d;

    /* JADX INFO: renamed from: b */
    @SuppressLint({"SV_USE_DUP_ID"})
    public final yyd0 f17863b = new yyd0(App.f16088e, "putongMasterUserInfo", true, "putongPref");

    /* JADX INFO: renamed from: c */
    @SuppressLint({"SV_USE_DUP_ID"})
    public final yyd0 f17864c = new yyd0(App.f16088e, "putongSwitchUserInfo", true, "putongPref");

    /* JADX INFO: renamed from: d */
    public final yyd0 f17865d = new yyd0(App.f16088e, "putongLastLoginData", true, "putongPref");

    /* JADX INFO: renamed from: e */
    public wyd0 f17866e = new wyd0("pref_key_signup_profile_path_arr" + uqb0.f180397c0.userId(), "");

    /* JADX INFO: renamed from: f */
    public final wyd0 f17867f = new wyd0(App.f16088e, "userStudiesTempData" + uqb0.f180397c0.userId(), "");

    /* JADX INFO: renamed from: g */
    public final wyd0 f17868g = new wyd0(App.f16088e, "userBloodTypeTempData" + uqb0.f180397c0.userId(), "");

    /* JADX INFO: renamed from: h */
    public final zyd0 f17869h = new zyd0("userSubscriptionSettings" + uqb0.f180397c0.userId(), null);

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
    public void m30514a(RememberUserInfo rememberUserInfo) {
        AuthData authData;
        if (rememberUserInfo == null || TextUtils.isEmpty(rememberUserInfo.name) || TextUtils.isEmpty(rememberUserInfo.imgUrl) || (authData = rememberUserInfo.auth) == null || TextUtils.isEmpty(authData.accessToken)) {
            return;
        }
        o560.m166092b().m166094c(rememberUserInfo);
    }

    /* JADX INFO: renamed from: b */
    public void m30515b(String str, AuthData authData, String str2) {
        RememberUserInfo rememberUserInfo = new RememberUserInfo();
        rememberUserInfo.imgUrl = str;
        rememberUserInfo.auth = authData;
        rememberUserInfo.name = str2;
        m30514a(rememberUserInfo);
    }
}
