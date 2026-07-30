package com.bef.effectsdk.algorithm;

import com.amazing.annotation.EffectKeep;

/* JADX INFO: loaded from: classes.dex */
@EffectKeep
public class RectDocDetTargetArea {
    private float bottomLeftX;
    private float bottomLeftY;
    private float bottomRightX;
    private float bottomRightY;
    private float topLeftX;
    private float topLeftY;
    private float topRightX;
    private float topRightY;

    @EffectKeep
    public RectDocDetTargetArea(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        this.topLeftX = f;
        this.topLeftY = f2;
        this.topRightX = f3;
        this.topRightY = f4;
        this.bottomLeftX = f5;
        this.bottomLeftY = f6;
        this.bottomRightX = f7;
        this.bottomRightY = f8;
    }

    public float getBottomLeftX() {
        return this.bottomLeftX;
    }

    public float getBottomLeftY() {
        return this.bottomLeftY;
    }

    public float getBottomRightX() {
        return this.bottomRightX;
    }

    public float getBottomRightY() {
        return this.bottomRightY;
    }

    public float getTopLeftX() {
        return this.topLeftX;
    }

    public float getTopLeftY() {
        return this.topLeftY;
    }

    public float getTopRightX() {
        return this.topRightX;
    }

    public float getTopRightY() {
        return this.topRightY;
    }
}
