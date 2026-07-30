package io.agora.rtc2;

import io.agora.base.internal.CalledByNative;

/* JADX INFO: loaded from: classes2.dex */
public class EncodedVideoTrackOptions {
    public int ccMode = 0;
    public int codecType = 3;
    public int targetBitrate = 6500;

    @CalledByNative
    public int getCcMode() {
        return this.ccMode;
    }

    @CalledByNative
    public int getCodecType() {
        return this.codecType;
    }

    @CalledByNative
    public int getTargetBitrate() {
        return this.targetBitrate;
    }
}
