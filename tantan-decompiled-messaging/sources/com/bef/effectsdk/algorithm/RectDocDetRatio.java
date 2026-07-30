package com.bef.effectsdk.algorithm;

import com.amazing.annotation.EffectKeep;

/* JADX INFO: loaded from: classes.dex */
@EffectKeep
public class RectDocDetRatio {
    private int heightVal;
    private float ratio;
    private int widthVal;

    @EffectKeep
    public RectDocDetRatio(float f, int i, int i2) {
        this.ratio = f;
        this.widthVal = i;
        this.heightVal = i2;
    }

    public int getHeightVal() {
        return this.heightVal;
    }

    public float getRatio() {
        return this.ratio;
    }

    public int getWidthVal() {
        return this.widthVal;
    }
}
