package com.momo.xengine.mestatistics;

import com.facebook.AuthenticationTokenClaims;
import org.json.JSONException;
import org.json.JSONObject;
import p153l.iig0;

/* JADX INFO: loaded from: classes8.dex */
public class StatisticalValue {
    private String extend = null;
    private final String name;
    private final ReportType type;
    private final long value;

    public StatisticalValue(ReportType reportType, String str, long j) {
        this.name = str;
        this.value = j;
        this.type = reportType;
    }

    public String getExtend() {
        return this.extend;
    }

    public void setExtend(String str) {
        this.extend = str;
    }

    public JSONObject toJSONObject() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", this.type.getValue());
            jSONObject.put(AuthenticationTokenClaims.JSON_KEY_NAME, this.name);
            jSONObject.put("value", this.value);
            String str = this.extend;
            if (str != null) {
                jSONObject.put("extend", str);
            }
            return jSONObject;
        } catch (JSONException e) {
            iig0.m140070a(e);
            return null;
        }
    }
}
