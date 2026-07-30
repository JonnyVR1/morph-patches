package com.tencent.could.huiyansdk.operate;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class HuiYanOperateBody extends CloudOperateBody implements Cloneable {

    @SerializedName("ErrorCode")
    public String errorCode = "";

    @SerializedName("ErrorMessage")
    public String errorMessage = "";

    @SerializedName("DeviceModel")
    public String deviceModel = "";

    @SerializedName("DeviceToken")
    public String deviceToken = "";

    @SerializedName("Token")
    public String token = "";

    @SerializedName("NetWorkType")
    public String netWorkType = "";

    @SerializedName("OsVersion")
    public String osVersion = "";

    @SerializedName("SdkName")
    public String sdkName = "";

    @SerializedName("SdkVersion")
    public String sdkVersion = "";

    @SerializedName("PackageName")
    public String packageName = "Android";

    @SerializedName("PackageVersion")
    public String packageVersion = "";

    @SerializedName("Platform")
    public String platform = "Android";

    @SerializedName("TuringVersion")
    public String turingVersion = "";

    @SerializedName("YouTuVersion")
    public String youTuVersion = "";

    public Object clone() {
        return super.clone();
    }

    public String getDeviceModel() {
        return this.deviceModel;
    }

    public String getDeviceToken() {
        return this.deviceToken;
    }

    public String getErrorCode() {
        return this.errorCode;
    }

    public String getErrorMessage() {
        return this.errorMessage;
    }

    public String getNetWorkType() {
        return this.netWorkType;
    }

    public String getOsVersion() {
        return this.osVersion;
    }

    public String getPackageName() {
        return this.packageName;
    }

    public String getPackageVersion() {
        return this.packageVersion;
    }

    public String getPlatform() {
        return this.platform;
    }

    public String getSdkName() {
        return this.sdkName;
    }

    public String getSdkVersion() {
        return this.sdkVersion;
    }

    public String getToken() {
        return this.token;
    }

    public String getTuringVersion() {
        return this.turingVersion;
    }

    public String getYouTuVersion() {
        return this.youTuVersion;
    }

    @Override // com.tencent.could.huiyansdk.operate.CloudOperateBody
    public void initData() {
        this.actions.add(new CloudOperateItem("StartHuiYanSdk"));
        this.actions.add(new CloudOperateItem("StartYTAuthUseTime"));
        this.actions.add(new CloudOperateItem("GetConfigUseTime"));
        this.actions.add(new CloudOperateItem("GetLiveTypeDateUseTime"));
        this.actions.add(new CloudOperateItem("MakePackUseTime"));
        this.actions.add(new CloudOperateItem("GetCompareResultUseTime"));
        this.actions.add(new CloudOperateItem("LocalCheckUseTime"));
        this.actions.add(new CloudOperateItem("GetLiveTypeData"));
        this.actions.add(new CloudOperateItem("StartCamera"));
        this.actions.add(new CloudOperateItem("LocalCheck"));
        this.actions.add(new CloudOperateItem("LocalVideo"));
        this.actions.add(new CloudOperateItem("Compare"));
        this.actions.add(new CloudOperateItem("Crash"));
        this.actions.add(new CloudOperateItem("LocalVideoSize"));
        this.actions.add(new CloudOperateItem("LivenessPackSize"));
        this.actions.add(new CloudOperateItem("SendPackSize"));
        this.actions.add(new CloudOperateItem("YTCatchError"));
        this.actions.add(new CloudOperateItem("UserCancel"));
        this.actions.add(new CloudOperateItem("ShowPrivacyDialog"));
        this.actions.add(new CloudOperateItem("ShowProtocolPage"));
        updateInfo("StartHuiYanSdk", 1, 1L, System.currentTimeMillis());
        updateInfo("Crash", 1, 0L, System.currentTimeMillis());
    }

    @Override // com.tencent.could.huiyansdk.operate.CloudOperateBody
    public void reset() {
        this.errorCode = "";
        this.errorMessage = "";
        this.token = "";
        this.netWorkType = "";
        List<CloudOperateItem> list = this.actions;
        if (list != null) {
            list.clear();
            initData();
        }
    }

    public void setDeviceModel(String str) {
        this.deviceModel = str;
    }

    public void setDeviceToken(String str) {
        this.deviceToken = str;
    }

    public void setErrorCode(String str) {
        this.errorCode = str;
    }

    public void setErrorMessage(String str) {
        this.errorMessage = str;
    }

    public void setNetWorkType(String str) {
        this.netWorkType = str;
    }

    public void setOsVersion(String str) {
        this.osVersion = str;
    }

    public void setPackageName(String str) {
        this.packageName = str;
    }

    public void setPackageVersion(String str) {
        this.packageVersion = str;
    }

    public void setPlatform(String str) {
        this.platform = str;
    }

    public void setSdkName(String str) {
        this.sdkName = str;
    }

    public void setSdkVersion(String str) {
        this.sdkVersion = str;
    }

    public void setToken(String str) {
        this.token = str;
    }

    public void setTuringVersion(String str) {
        this.turingVersion = str;
    }

    public void setYouTuVersion(String str) {
        this.youTuVersion = str;
    }
}
