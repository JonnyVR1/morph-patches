package com.p000p1.mobile.putong.p004ui.jsbridge.implement;

import androidx.annotation.NonNull;
import com.tantanapp.common.utils.CrashHelper;
import l.qib0;
import org.json.JSONException;
import org.json.JSONObject;
import p009l.boq;
import p009l.ef2;
import p009l.liq;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class LocationBridgeImplementation extends ef2 {
    @liq(key = "getCityInfo")
    public String getCityInfo(@NonNull boq boqVar) {
        if (!qib0.c0.signedIn_()) {
            return "";
        }
        String str = qib0.c0.queryMe().location.region.city;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("cityName", str);
            return jSONObject.toString();
        } catch (JSONException e) {
            CrashHelper.c(e);
            return "";
        }
    }
}
