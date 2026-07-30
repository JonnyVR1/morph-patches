package com.p046p1.mobile.putong.p065ui.jsbridge.implement;

import androidx.annotation.NonNull;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.api.ABManager;
import com.p046p1.mobile.putong.core.data.ProfileLikeCategoryType;
import com.p046p1.mobile.putong.data.PhoneNumber;
import com.p046p1.mobile.putong.data.Profile;
import com.p046p1.mobile.putong.data.ProfileZodiac;
import com.p046p1.mobile.putong.data.SeeTextDynamicParam;
import com.p046p1.mobile.putong.data.Settings;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;
import com.tantanapp.common.utils.CrashHelper;
import org.json.JSONException;
import org.json.JSONObject;
import p149l.boq;
import p149l.coq;
import p149l.ef2;
import p149l.i0g0;
import p149l.ipq;
import p149l.liq;
import p149l.qib0;

/* JADX INFO: loaded from: classes11.dex */
public class UserBridgeImplementation extends ef2 {
    /* JADX INFO: renamed from: c */
    public final String m79864c(@NonNull coq coqVar) {
        PhoneNumber phoneNumber;
        if (!qib0.f154714c0.signedIn_()) {
            return "";
        }
        User userQueryMe = qib0.f154714c0.queryMe();
        String str = userQueryMe.f56011id;
        String str2 = userQueryMe.name;
        String strName = userQueryMe.gender.name();
        Integer num = userQueryMe.age;
        Settings settings = userQueryMe.settings;
        String str3 = (settings == null || (phoneNumber = settings.phoneNumber) == null) ? null : phoneNumber.number;
        String str4 = userQueryMe.m60124fp() == null ? null : userQueryMe.m60124fp().url;
        Profile profile = userQueryMe.profile;
        ProfileZodiac profileZodiac = profile == null ? null : profile.zodiac;
        String strName2 = profileZodiac == null ? null : profileZodiac.name();
        String strM133869j0 = profileZodiac != null ? i0g0.m133869j0(profileZodiac) : null;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("userId", str);
            jSONObject.put("userName", str2);
            jSONObject.put("gender", strName);
            jSONObject.put("token", coqVar.getToken());
            jSONObject.put("avatarUrl", str4);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(Constants.KEY_KEY, strName2);
            jSONObject2.put("value", strM133869j0);
            jSONObject.put(ProfileLikeCategoryType.zodiac, jSONObject2);
            jSONObject.put(SeeTextDynamicParam.age, num);
            jSONObject.put("phoneNumber", str3);
            jSONObject.put("country", IntlCountryCodeController.m28108d(qib0.f154717f0));
            return jSONObject.toString();
        } catch (JSONException e) {
            CrashHelper.m81296c(e);
            return "";
        }
    }

    @liq(key = "getAbHeader")
    public String getAbHeader(@NonNull boq boqVar) {
        return ABManager.m29347h();
    }

    @liq(key = "getAuthorizationHeader")
    public String getAuthorizationHeader(@NonNull boq boqVar) {
        return ipq.m137568d(null, null);
    }

    @liq(key = "getUserInfo")
    public String getUserInfo(@NonNull boq boqVar) {
        return m79864c(boqVar);
    }

    @liq(key = "getAuthorizationHeader")
    public String getAuthorizationHeader(@NonNull boq boqVar, String str, String str2) {
        return ipq.m137568d(str, str2);
    }

    @liq(key = "getAuthorizationHeader")
    public String getAuthorizationHeader(@NonNull boq boqVar, String str) {
        return ipq.m137568d(str, null);
    }
}
