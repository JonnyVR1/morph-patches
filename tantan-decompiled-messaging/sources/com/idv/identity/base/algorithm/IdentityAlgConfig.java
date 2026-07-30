package com.idv.identity.base.algorithm;

/* JADX INFO: loaded from: classes7.dex */
public class IdentityAlgConfig {
    public static final int BGR = 2;
    public static final int BGRA = 1;
    public static final String FACE_BLINK_LIVENESS = "faceBlinkLiveness";
    public static final String FACE_FAR_NEAR_LIVENESS = "faceFarNearLiveness";
    public static final String FACE_PHOTINUS_LIVENESS = "PhotinusLiveness";
    public static final int NV21 = 0;
    public static final String OPEN_MOUTH_LIVENESS = "OpenMouthLiveness";
    public static final int RGB = 4;
    public static final int RGBA = 3;
    public static final String SHAKE_HEAD_LIVENESS = "shakeHeadLiveness";
    public int detectImageFormat;
    public String livenessCombinations;
    public float minFarThreshold = 0.15f;
    public float maxFarThreshold = 0.18f;
    public float maxNearThreshold = 0.45f;
    public float minNearThreshold = 0.37f;
    public boolean isOpenQualityCheck = false;
    public boolean isOpenDegrade = false;

    public String toString() {
        return "IdentityAlgConfig{detectImageFormat=" + this.detectImageFormat + ", minFarThreshold=" + this.minFarThreshold + ", maxFarThreshold=" + this.maxFarThreshold + ", maxNearThreshold=" + this.maxNearThreshold + ", minNearThreshold=" + this.minNearThreshold + ", livenessCombinations='" + this.livenessCombinations + "', isOpenQualityCheck=" + this.isOpenQualityCheck + '}';
    }
}
