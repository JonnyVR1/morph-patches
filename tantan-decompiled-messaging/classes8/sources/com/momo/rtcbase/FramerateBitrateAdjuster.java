package com.momo.rtcbase;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
class FramerateBitrateAdjuster extends BaseBitrateAdjuster {
    private static final int INITIAL_FPS = 30;

    @Override // com.momo.rtcbase.BaseBitrateAdjuster, com.momo.rtcbase.BitrateAdjuster
    public int getCodecConfigFramerate() {
        return 30;
    }

    @Override // com.momo.rtcbase.BaseBitrateAdjuster, com.momo.rtcbase.BitrateAdjuster
    public void setTargets(int i, int i2) {
        if (this.targetFps == 0) {
            i2 = 30;
        }
        super.setTargets(i, i2);
        this.targetBitrateBps = (this.targetBitrateBps * 30) / this.targetFps;
    }
}
