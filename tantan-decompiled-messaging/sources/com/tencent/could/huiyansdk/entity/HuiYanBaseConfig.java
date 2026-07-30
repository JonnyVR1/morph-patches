package com.tencent.could.huiyansdk.entity;

import com.tencent.could.huiyansdk.enums.HuiYanLiveMode;

/* JADX INFO: loaded from: classes2.dex */
public class HuiYanBaseConfig {
    public String license = "";
    public String licenseStr = "";
    public String modelPath = "";
    public boolean openCheckRiskMode = false;
    public HuiYanLiveMode huiYanLiveMode = HuiYanLiveMode.ACTION_REFLECT_MODE;

    public HuiYanLiveMode getHuiYanLiveMode() {
        return this.huiYanLiveMode;
    }

    public String getLicense() {
        return this.license;
    }

    public String getLicenseStr() {
        return this.licenseStr;
    }

    public String getModelPath() {
        return this.modelPath;
    }

    public boolean isOpenCheckRiskMode() {
        return this.openCheckRiskMode;
    }

    public void setHuiYanLiveMode(HuiYanLiveMode huiYanLiveMode) {
        this.huiYanLiveMode = huiYanLiveMode;
    }

    public void setLicense(String str) {
        this.license = str;
    }

    public void setLicenseStr(String str) {
        this.licenseStr = str;
    }

    public void setModelPath(String str) {
        this.modelPath = str;
    }

    public void setOpenCheckRiskMode(boolean z) {
        this.openCheckRiskMode = z;
    }
}
