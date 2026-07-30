package com.momo.xeengine.lightningrender;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
@Keep
public class StickerModel {
    private String assetPath;
    private String businessType;
    private long duration = -1;
    private String stickerId;
    private int userFlag;

    public String getAssetPath() {
        return this.assetPath;
    }

    public String getBusinessType() {
        return this.businessType;
    }

    public long getDuration() {
        return this.duration;
    }

    public String getStickerId() {
        return this.stickerId;
    }

    public int getUserFlag() {
        return this.userFlag;
    }

    public void setAssetPath(String str) {
        this.assetPath = str;
    }

    public void setBusinessType(String str) {
        this.businessType = str;
    }

    public void setDuration(long j) {
        this.duration = j;
    }

    public void setStickerId(String str) {
        this.stickerId = str;
    }

    public void setUserFlag(int i) {
        this.userFlag = i;
    }
}
