package com.effectsar.labcv.effectsdk;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class BefAvaBoostInfo {
    float[] beta;
    float[] pose;

    public float[] getBeta() {
        return this.beta;
    }

    public float[] getPose() {
        return this.pose;
    }

    public String toString() {
        return "BefAvaBoostInfo{beta=" + Arrays.toString(this.beta) + ", pose=" + Arrays.toString(this.pose) + '}';
    }
}
