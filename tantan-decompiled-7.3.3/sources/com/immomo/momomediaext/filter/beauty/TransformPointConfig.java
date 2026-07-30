package com.immomo.momomediaext.filter.beauty;

/* JADX INFO: loaded from: classes7.dex */
public class TransformPointConfig {
    public int interP1 = -1;
    public int interP2 = -1;
    public float interRatioX = 1.0f;
    public float interRatioY = 1.0f;
    public int transformPoint;

    public TransformPointConfig(int i) {
        this.transformPoint = i;
    }

    public TransformPointConfig interp(int i, int i2) {
        this.interP1 = i;
        this.interP2 = i2;
        return this;
    }

    public TransformPointConfig ratio(float f, float f2) {
        this.interRatioX = f;
        this.interRatioY = f2;
        return this;
    }
}
