package com.momo.xeengine.p049cv.bean;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes8.dex */
@Keep
@Deprecated
public class XEFaceMask {
    private byte[] datas;
    private boolean flipShowX = false;
    private int length;
    private int maskHeight;
    private int maskWidth;
    private float[] warpMat;

    public byte[] getDatas() {
        return this.datas;
    }

    public int getLength() {
        return this.length;
    }

    public int getMaskHeight() {
        return this.maskHeight;
    }

    public int getMaskWidth() {
        return this.maskWidth;
    }

    public float[] getWarpMat() {
        return this.warpMat;
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

    public void setLength(int i) {
        this.length = i;
    }

    public void setMaskHeight(int i) {
        this.maskHeight = i;
    }

    public void setMaskWidth(int i) {
        this.maskWidth = i;
    }

    public void setWarpMat(float[] fArr) {
        this.warpMat = fArr;
    }
}
