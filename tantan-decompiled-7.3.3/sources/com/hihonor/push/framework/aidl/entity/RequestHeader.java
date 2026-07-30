package com.hihonor.push.framework.aidl.entity;

import com.hihonor.push.framework.aidl.IMessageEntity;
import com.hihonor.push.framework.aidl.annotation.Packed;

/* JADX INFO: loaded from: classes7.dex */
public class RequestHeader implements IMessageEntity {

    @Packed
    private String AAID;

    @Packed
    private String appId;

    @Packed
    private String certificateFingerprint;

    @Packed
    private String packageName;

    @Packed
    private String pushToken;

    @Packed
    private int sdkVersion;

    public String getAAID() {
        return this.AAID;
    }

    public String getAppId() {
        return this.appId;
    }

    public String getCertificateFingerprint() {
        return this.certificateFingerprint;
    }

    public String getPackageName() {
        return this.packageName;
    }

    public String getPushToken() {
        return this.pushToken;
    }

    public int getSdkVersion() {
        return this.sdkVersion;
    }

    public void setAAID(String str) {
        this.AAID = str;
    }

    public void setAppId(String str) {
        this.appId = str;
    }

    public void setCertificateFingerprint(String str) {
        this.certificateFingerprint = str;
    }

    public void setPackageName(String str) {
        this.packageName = str;
    }

    public void setPushToken(String str) {
        this.pushToken = str;
    }

    public void setSdkVersion(int i) {
        this.sdkVersion = i;
    }
}
