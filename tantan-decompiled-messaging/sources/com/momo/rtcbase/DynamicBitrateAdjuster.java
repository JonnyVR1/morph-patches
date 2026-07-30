package com.momo.rtcbase;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;

/* JADX INFO: loaded from: classes8.dex */
class DynamicBitrateAdjuster extends BaseBitrateAdjuster {
    private static final double BITRATE_ADJUSTMENT_MAX_SCALE = 4.0d;
    private static final double BITRATE_ADJUSTMENT_SEC = 3.0d;
    private static final int BITRATE_ADJUSTMENT_STEPS = 20;
    private static final double BITS_PER_BYTE = 8.0d;
    private int bitrateAdjustmentScaleExp;
    private double deviationBytes;
    private double timeSinceLastAdjustmentMs;

    private double getBitrateAdjustmentScale() {
        return Math.pow(BITRATE_ADJUSTMENT_MAX_SCALE, ((double) this.bitrateAdjustmentScaleExp) / 20.0d);
    }

    @Override // com.momo.rtcbase.BaseBitrateAdjuster, com.momo.rtcbase.BitrateAdjuster
    public int getAdjustedBitrateBps() {
        return (int) (((double) this.targetBitrateBps) * getBitrateAdjustmentScale());
    }

    @Override // com.momo.rtcbase.BaseBitrateAdjuster, com.momo.rtcbase.BitrateAdjuster
    public void reportEncodedFrame(int i) {
        int i2 = this.targetFps;
        if (i2 == 0) {
            return;
        }
        int i3 = this.targetBitrateBps;
        double d = this.deviationBytes + (((double) i) - ((((double) i3) / BITS_PER_BYTE) / ((double) i2)));
        this.deviationBytes = d;
        this.timeSinceLastAdjustmentMs += 1000.0d / ((double) i2);
        double d2 = ((double) i3) / BITS_PER_BYTE;
        double d3 = BITRATE_ADJUSTMENT_SEC * d2;
        double dMin = Math.min(d, d3);
        this.deviationBytes = dMin;
        double dMax = Math.max(dMin, -d3);
        this.deviationBytes = dMax;
        if (this.timeSinceLastAdjustmentMs <= 3000.0d) {
            return;
        }
        if (dMax > d2) {
            int i4 = this.bitrateAdjustmentScaleExp - ((int) ((dMax / d2) + 0.5d));
            this.bitrateAdjustmentScaleExp = i4;
            this.bitrateAdjustmentScaleExp = Math.max(i4, -20);
            this.deviationBytes = d2;
        } else {
            double d4 = -d2;
            if (dMax < d4) {
                int i5 = this.bitrateAdjustmentScaleExp + ((int) (((-dMax) / d2) + 0.5d));
                this.bitrateAdjustmentScaleExp = i5;
                this.bitrateAdjustmentScaleExp = Math.min(i5, 20);
                this.deviationBytes = d4;
            }
        }
        this.timeSinceLastAdjustmentMs = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
    }

    @Override // com.momo.rtcbase.BaseBitrateAdjuster, com.momo.rtcbase.BitrateAdjuster
    public void setTargets(int i, int i2) {
        int i3 = this.targetBitrateBps;
        if (i3 > 0 && i < i3) {
            this.deviationBytes = (this.deviationBytes * ((double) i)) / ((double) i3);
        }
        super.setTargets(i, i2);
    }
}
