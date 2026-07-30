package com.effectsar.labcv.effectsdk;

/* JADX INFO: loaded from: classes.dex */
public class BefVideoSRInfo {
    private int destTextureId;
    private int height;
    private int width;

    public int getDestTextureId() {
        return this.destTextureId;
    }

    public int getHeight() {
        return this.height;
    }

    public int getWidth() {
        return this.width;
    }

    public void setDestTextureId(int i) {
        this.destTextureId = i;
    }

    public void setHeight(int i) {
        this.height = i;
    }

    public void setWidth(int i) {
        this.width = i;
    }

    public String toString() {
        return "BefVideoSRInfo{width=" + this.width + ", height=" + this.height + ", destTextureID = " + this.destTextureId + "}";
    }
}
