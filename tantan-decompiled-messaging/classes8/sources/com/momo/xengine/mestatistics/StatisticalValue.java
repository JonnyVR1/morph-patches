package com.momo.xengine.mestatistics;

import l.aag0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
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
            jSONObject.put("name", this.name);
            jSONObject.put("value", this.value);
            String str = this.extend;
            if (str != null) {
                jSONObject.put("extend", str);
            }
            return jSONObject;
        } catch (JSONException e) {
            aag0.a(e);
            return null;
        }
    }
}
