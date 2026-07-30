package com.momo.rtcbase;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
class BaseBitrateAdjuster implements BitrateAdjuster {
    protected int targetBitrateBps;
    protected int targetFps;

    @Override // com.momo.rtcbase.BitrateAdjuster
    public int getAdjustedBitrateBps() {
        return this.targetBitrateBps;
    }

    @Override // com.momo.rtcbase.BitrateAdjuster
    public int getCodecConfigFramerate() {
        return this.targetFps;
    }

    @Override // com.momo.rtcbase.BitrateAdjuster
    public void reportEncodedFrame(int i) {
    }

    @Override // com.momo.rtcbase.BitrateAdjuster
    public void setTargets(int i, int i2) {
        this.targetBitrateBps = i;
        this.targetFps = i2;
    }
}
