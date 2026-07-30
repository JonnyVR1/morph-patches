package com.p046p1.mobile.putong.p065ui.jsbridge.implement;

import androidx.annotation.NonNull;
import com.tantanapp.common.utils.CrashHelper;
import org.json.JSONException;
import org.json.JSONObject;
import p149l.boq;
import p149l.ef2;
import p149l.liq;
import p149l.qib0;

/* JADX INFO: loaded from: classes11.dex */
public class LocationBridgeImplementation extends ef2 {
    @liq(key = "getCityInfo")
    public String getCityInfo(@NonNull boq boqVar) {
        if (!qib0.f154714c0.signedIn_()) {
            return "";
        }
        String str = qib0.f154714c0.queryMe().location.region.city;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("cityName", str);
            return jSONObject.toString();
        } catch (JSONException e) {
            CrashHelper.m81296c(e);
            return "";
        }
    }
}
