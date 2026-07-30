package io.agora.base.internal.video;

/* JADX INFO: loaded from: classes2.dex */
class FramerateBitrateAdjuster extends BaseBitrateAdjuster {
    private static final int INITIAL_FPS = 30;

    @Override // io.agora.base.internal.video.BaseBitrateAdjuster, io.agora.base.internal.video.BitrateAdjuster
    public int getCodecConfigFramerate() {
        return 30;
    }

    @Override // io.agora.base.internal.video.BaseBitrateAdjuster, io.agora.base.internal.video.BitrateAdjuster
    public void setTargets(int i, int i2) {
        if (this.targetFps == 0) {
            i2 = 30;
        }
        super.setTargets(i, i2);
        this.targetBitrateBps = (this.targetBitrateBps * 30) / this.targetFps;
    }
}
