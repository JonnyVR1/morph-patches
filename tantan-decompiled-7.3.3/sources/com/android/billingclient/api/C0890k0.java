package com.android.billingclient.api;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.android.billingclient.api.k0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0890k0 {
    public C0890k0(JSONObject jSONObject) throws JSONException {
        jSONObject.getString("type");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("balanceThresholds");
        ArrayList arrayList = new ArrayList();
        if (jSONArrayOptJSONArray != null) {
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                arrayList.add(Integer.valueOf(jSONArrayOptJSONArray.getInt(i)));
            }
        }
        new C0879f.d(jSONObject.getJSONArray("pricingPhases"));
    }
}
