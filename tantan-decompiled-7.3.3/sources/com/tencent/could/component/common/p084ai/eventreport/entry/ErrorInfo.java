package com.tencent.could.component.common.p084ai.eventreport.entry;

import com.clevertap.android.sdk.Constants;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public class ErrorInfo {
    public String business = "";
    public String origin = "";
    public String version = "";
    public String deviceInfo = "";
    public String action = "";
    public String stack = "";
    public String token = "";

    public String getAction() {
        return this.action;
    }

    public String getBusiness() {
        return this.business;
    }

    public String getDeviceInfo() {
        return this.deviceInfo;
    }

    public String getOrigin() {
        return this.origin;
    }

    public String getStack() {
        return this.stack;
    }

    public String getToken() {
        return this.token;
    }

    public String getVersion() {
        return this.version;
    }

    public void setAction(String str) {
        this.action = str;
    }

    public void setBusiness(String str) {
        this.business = str;
    }

    public void setDeviceInfo(String str) {
        this.deviceInfo = str;
    }

    public void setOrigin(String str) {
        this.origin = str;
    }

    public void setStack(String str) {
        this.stack = str;
    }

    public void setToken(String str) {
        this.token = str;
    }

    public void setVersion(String str) {
        this.version = str;
    }

    public String toJsonString() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("Business", this.business);
        jSONObject.put("Origin", this.origin);
        jSONObject.put(Constants.CLTAP_APP_VERSION, this.version);
        jSONObject.put("DeviceInfo", this.deviceInfo);
        jSONObject.put("Action", this.action);
        jSONObject.put("Stack", this.stack);
        jSONObject.put("Token", this.token);
        return jSONObject.toString();
    }
}
