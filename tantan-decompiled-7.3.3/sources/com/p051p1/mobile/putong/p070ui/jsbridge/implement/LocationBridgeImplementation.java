package com.p051p1.mobile.putong.p070ui.jsbridge.implement;

import androidx.annotation.NonNull;
import com.tantanapp.common.utils.CrashHelper;
import org.json.JSONException;
import org.json.JSONObject;
import p153l.aqq;
import p153l.lf2;
import p153l.lkq;
import p153l.uqb0;

/* JADX INFO: loaded from: classes10.dex */
public class LocationBridgeImplementation extends lf2 {
    @lkq(key = "getCityInfo")
    public String getCityInfo(@NonNull aqq aqqVar) {
        if (!uqb0.f180397c0.signedIn_()) {
            return "";
        }
        String str = uqb0.f180397c0.queryMe().location.region.city;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("cityName", str);
            return jSONObject.toString();
        } catch (JSONException e) {
            CrashHelper.m82479c(e);
            return "";
        }
    }
}
