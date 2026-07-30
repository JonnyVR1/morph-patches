package com.effectsar.labcv.effectsdk;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class BefAvatarInfo {
    float[] affineMat;
    float[] alpha;
    float[] beta;
    int faceId;
    float[] landmarks;

    /* JADX INFO: renamed from: mv */
    float[] f5850mv;
    float[] mvp;
    float[] rot;
    int success;

    public float[] getAffineMat() {
        return this.affineMat;
    }

    public float[] getAlpha() {
        return this.alpha;
    }

    public float[] getBeta() {
        return this.beta;
    }

    public int getFaceId() {
        return this.faceId;
    }

    public float[] getLandmarks() {
        return this.landmarks;
    }

    public float[] getMv() {
        return this.f5850mv;
    }

    public float[] getMvp() {
        return this.mvp;
    }

    public float[] getRot() {
        return this.rot;
    }

    public int isSuccess() {
        return this.success;
    }

    public String toString() {
        return "BefAvatarInfo{success=" + this.success + ", faceId=" + this.faceId + ", affineMat=" + Arrays.toString(this.affineMat) + ", alpha=" + Arrays.toString(this.alpha) + ", beta=" + Arrays.toString(this.beta) + '}';
    }
}
