package com.p051p1.mobile.putong.p070ui.jsbridge.implement;

import androidx.annotation.NonNull;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.api.ABManager;
import com.p051p1.mobile.putong.core.data.ProfileLikeCategoryType;
import com.p051p1.mobile.putong.data.PhoneNumber;
import com.p051p1.mobile.putong.data.Profile;
import com.p051p1.mobile.putong.data.ProfileZodiac;
import com.p051p1.mobile.putong.data.SeeTextDynamicParam;
import com.p051p1.mobile.putong.data.Settings;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
import com.tantanapp.common.utils.CrashHelper;
import org.json.JSONException;
import org.json.JSONObject;
import p153l.aqq;
import p153l.bqq;
import p153l.irq;
import p153l.lf2;
import p153l.lkq;
import p153l.q8g0;
import p153l.uqb0;

/* JADX INFO: loaded from: classes10.dex */
public class UserBridgeImplementation extends lf2 {
    /* JADX INFO: renamed from: c */
    public final String m81047c(@NonNull bqq bqqVar) {
        PhoneNumber phoneNumber;
        if (!uqb0.f180397c0.signedIn_()) {
            return "";
        }
        User userQueryMe = uqb0.f180397c0.queryMe();
        String str = userQueryMe.f56859id;
        String str2 = userQueryMe.name;
        String strName = userQueryMe.gender.name();
        Integer num = userQueryMe.age;
        Settings settings = userQueryMe.settings;
        String str3 = (settings == null || (phoneNumber = settings.phoneNumber) == null) ? null : phoneNumber.number;
        String str4 = userQueryMe.m61308fp() == null ? null : userQueryMe.m61308fp().url;
        Profile profile = userQueryMe.profile;
        ProfileZodiac profileZodiac = profile == null ? null : profile.zodiac;
        String strName2 = profileZodiac == null ? null : profileZodiac.name();
        String strM175804j0 = profileZodiac != null ? q8g0.m175804j0(profileZodiac) : null;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("userId", str);
            jSONObject.put("userName", str2);
            jSONObject.put("gender", strName);
            jSONObject.put("token", bqqVar.getToken());
            jSONObject.put("avatarUrl", str4);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(Constants.KEY_KEY, strName2);
            jSONObject2.put("value", strM175804j0);
            jSONObject.put(ProfileLikeCategoryType.zodiac, jSONObject2);
            jSONObject.put(SeeTextDynamicParam.age, num);
            jSONObject.put("phoneNumber", str3);
            jSONObject.put("country", IntlCountryCodeController.m29107d(uqb0.f180400f0));
            return jSONObject.toString();
        } catch (JSONException e) {
            CrashHelper.m82479c(e);
            return "";
        }
    }

    @lkq(key = "getAbHeader")
    public String getAbHeader(@NonNull aqq aqqVar) {
        return ABManager.m30345h();
    }

    @lkq(key = "getAuthorizationHeader")
    public String getAuthorizationHeader(@NonNull aqq aqqVar) {
        return irq.m141843d(null, null);
    }

    @lkq(key = "getUserInfo")
    public String getUserInfo(@NonNull aqq aqqVar) {
        return m81047c(aqqVar);
    }

    @lkq(key = "getAuthorizationHeader")
    public String getAuthorizationHeader(@NonNull aqq aqqVar, String str, String str2) {
        return irq.m141843d(str, str2);
    }

    @lkq(key = "getAuthorizationHeader")
    public String getAuthorizationHeader(@NonNull aqq aqqVar, String str) {
        return irq.m141843d(str, null);
    }
}
