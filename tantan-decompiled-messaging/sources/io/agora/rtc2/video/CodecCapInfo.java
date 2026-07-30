package io.agora.rtc2.video;

import io.agora.base.internal.CalledByNative;

/* JADX INFO: loaded from: classes2.dex */
public class CodecCapInfo {
    public int codecCapMask;
    public CodecCapLevels codecLevels;
    public int codecType;

    @CalledByNative
    public CodecCapInfo(int i, int i2, CodecCapLevels codecCapLevels) {
        this.codecType = i;
        this.codecCapMask = i2;
        this.codecLevels = codecCapLevels;
    }

    @CalledByNative
    public void SetCodecCapMask(int i) {
        this.codecCapMask = i;
    }

    @CalledByNative
    public void SetCodecType(int i) {
        this.codecType = i;
    }
}
