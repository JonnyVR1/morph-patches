package com.momo.xeengine.p044cv.bean;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes8.dex */
@Keep
@Deprecated
public class XEFaceSegmentInfo {
    private int channel;
    private int height;
    private byte[] imageData;
    private byte[] maskData;
    private int width;

    public int getChannel() {
        return this.channel;
    }

    public int getHeight() {
        return this.height;
    }

    public byte[] getImageData() {
        return this.imageData;
    }

    public byte[] getMaskData() {
        return this.maskData;
    }

    public int getWidth() {
        return this.width;
    }

    public void setChannel(int i) {
        this.channel = i;
    }

    public void setHeight(int i) {
        this.height = i;
    }

    public void setImageData(byte[] bArr) {
        this.imageData = bArr;
    }

    public void setMaskData(byte[] bArr) {
        this.maskData = bArr;
    }

    public void setWidth(int i) {
        this.width = i;
    }
}
