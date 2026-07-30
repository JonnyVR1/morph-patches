package com.tencent.could.huiyansdk.entity;

/* JADX INFO: loaded from: classes12.dex */
public class LiveDataCheckResult {
    public boolean isHaveColorData = false;
    public boolean isNoAction = false;

    public boolean isHaveColorData() {
        return this.isHaveColorData;
    }

    public boolean isNoAction() {
        return this.isNoAction;
    }

    public void setHaveColorData(boolean z) {
        this.isHaveColorData = z;
    }

    public void setNoAction(boolean z) {
        this.isNoAction = z;
    }

    public String toString() {
        return "LiveDataCheckResult{isHaveColorData=" + this.isHaveColorData + ", isNoAction=" + this.isNoAction + '}';
    }
}
