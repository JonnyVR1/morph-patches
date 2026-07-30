package com.tencent.could.component.common.p079ai.eventreport.entry;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.tencent.could.component.common.p079ai.eventreport.api.EventReportConfig;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class DeviceInfoEntry {
    public String deviceModel;
    public String deviceToken;
    public String osVersion;
    public String packageName;
    public String sdkVersion;

    public DeviceInfoEntry() {
        String str = EventReportConfig.STRING_INIT;
        this.packageName = str;
        this.sdkVersion = str;
        this.osVersion = str;
        this.deviceModel = str;
        this.deviceToken = str;
    }

    public String getDeviceModel() {
        return this.deviceModel;
    }

    public String getDeviceToken() {
        return this.deviceToken;
    }

    public String getOsVersion() {
        return this.osVersion;
    }

    public String getPackageName() {
        return this.packageName;
    }

    public String getSdkVersion() {
        return this.sdkVersion;
    }

    public void setDeviceModel(String str) {
        this.deviceModel = str;
    }

    public void setDeviceToken(String str) {
        this.deviceToken = str;
    }

    public void setOsVersion(String str) {
        this.osVersion = str;
    }

    public void setPackageName(String str) {
        this.packageName = str;
    }

    public void setSdkVersion(String str) {
        this.sdkVersion = str;
    }

    public String toJsonString() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME, this.packageName);
        jSONObject.put("sdkVersion", this.sdkVersion);
        jSONObject.put("osVersion", this.osVersion);
        jSONObject.put("deviceModel", this.deviceModel);
        jSONObject.put("deviceToken", this.deviceToken);
        jSONObject.put("timestamp", System.currentTimeMillis() / 1000);
        return jSONObject.toString();
    }
}
