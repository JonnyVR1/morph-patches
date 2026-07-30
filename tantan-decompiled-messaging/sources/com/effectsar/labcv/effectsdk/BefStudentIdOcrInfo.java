package com.effectsar.labcv.effectsdk;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class BefStudentIdOcrInfo {
    private int height;
    private int length = 0;
    private byte[] result;
    private int width;

    /* JADX INFO: renamed from: x */
    private int f5848x;

    /* JADX INFO: renamed from: y */
    private int f5849y;

    public int getHeight() {
        return this.height;
    }

    public int getLength() {
        return this.length;
    }

    public byte[] getResult() {
        return this.result;
    }

    public int getWidth() {
        return this.width;
    }

    public int getX() {
        return this.f5848x;
    }

    public int getY() {
        return this.f5849y;
    }

    public String toString() {
        return "BefStudentIdOcrInfo{width=" + this.width + ", height=" + this.height + ", x=" + this.f5848x + ", y=" + this.f5849y + ", length=" + this.length + ", result=" + Arrays.toString(this.result) + '}';
    }
}
