package com.momo.xeengine.p001cv.bean;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
@Keep
@Deprecated
public class CVSegmentInfo {
    private byte[] datas;
    private boolean flipShowX = false;
    private int height;
    private int length;
    private float[] warpMat;
    private int width;

    public byte[] getDatas() {
        return this.datas;
    }

    public int getHeight() {
        return this.height;
    }

    public int getLength() {
        return this.length;
    }

    public float[] getWarpMat() {
        return this.warpMat;
    }

    public int getWidth() {
        return this.width;
    }

    public boolean isFlipShowX() {
        return this.flipShowX;
    }

    public void setDatas(byte[] bArr) {
        this.datas = bArr;
    }

    public void setFlipShowX(boolean z) {
        this.flipShowX = z;
    }

    public void setHeight(int i) {
        this.height = i;
    }

    public void setLength(int i) {
        this.length = i;
    }

    public void setWarpMat(float[] fArr) {
        this.warpMat = fArr;
    }

    public void setWidth(int i) {
        this.width = i;
    }
}
