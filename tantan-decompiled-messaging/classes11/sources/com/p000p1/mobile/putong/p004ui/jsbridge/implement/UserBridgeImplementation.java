package com.p000p1.mobile.putong.p004ui.jsbridge.implement;

import androidx.annotation.NonNull;
import com.p1.mobile.putong.ab.IntlCountryCodeController;
import com.p1.mobile.putong.api.ABManager;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.PhoneNumber;
import com.p1.mobile.putong.data.Profile;
import com.p1.mobile.putong.data.Settings;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.CrashHelper;
import l.qib0;
import org.json.JSONException;
import org.json.JSONObject;
import p009l.boq;
import p009l.coq;
import p009l.ef2;
import p009l.i0g0;
import p009l.ipq;
import p009l.liq;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class UserBridgeImplementation extends ef2 {
    /* JADX INFO: renamed from: c */
    public final String m10189c(@NonNull coq coqVar) {
        PhoneNumber phoneNumber;
        if (!qib0.c0.signedIn_()) {
            return "";
        }
        User userQueryMe = qib0.c0.queryMe();
        String str = ((DbObject) userQueryMe).id;
        String str2 = userQueryMe.name;
        String strName = userQueryMe.gender.name();
        Integer num = userQueryMe.age;
        Settings settings = userQueryMe.settings;
        String str3 = (settings == null || (phoneNumber = settings.phoneNumber) == null) ? null : phoneNumber.number;
        String str4 = userQueryMe.fp() == null ? null : ((Media) userQueryMe.fp()).url;
        Profile profile = userQueryMe.profile;
        TEnum tEnum = profile == null ? null : profile.zodiac;
        String strName2 = tEnum == null ? null : tEnum.name();
        String strM16137j0 = tEnum != null ? i0g0.m16137j0(tEnum) : null;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("userId", str);
            jSONObject.put("userName", str2);
            jSONObject.put("gender", strName);
            jSONObject.put("token", coqVar.getToken());
            jSONObject.put("avatarUrl", str4);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("key", strName2);
            jSONObject2.put("value", strM16137j0);
            jSONObject.put("zodiac", jSONObject2);
            jSONObject.put("age", num);
            jSONObject.put("phoneNumber", str3);
            jSONObject.put("country", IntlCountryCodeController.d(qib0.f0));
            return jSONObject.toString();
        } catch (JSONException e) {
            CrashHelper.c(e);
            return "";
        }
    }

    @liq(key = "getAbHeader")
    public String getAbHeader(@NonNull boq boqVar) {
        return ABManager.h();
    }

    @liq(key = "getAuthorizationHeader")
    public String getAuthorizationHeader(@NonNull boq boqVar) {
        return ipq.m16688d(null, null);
    }

    @liq(key = "getUserInfo")
    public String getUserInfo(@NonNull boq boqVar) {
        return m10189c(boqVar);
    }

    @liq(key = "getAuthorizationHeader")
    public String getAuthorizationHeader(@NonNull boq boqVar, String str, String str2) {
        return ipq.m16688d(str, str2);
    }

    @liq(key = "getAuthorizationHeader")
    public String getAuthorizationHeader(@NonNull boq boqVar, String str) {
        return ipq.m16688d(str, null);
    }
}
