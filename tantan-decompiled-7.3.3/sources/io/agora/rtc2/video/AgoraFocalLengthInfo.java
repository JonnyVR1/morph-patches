package io.agora.rtc2.video;

import io.agora.base.internal.CalledByNative;

/* JADX INFO: loaded from: classes2.dex */
public class AgoraFocalLengthInfo {
    public int cameraDirection;
    public int focalLengthType;

    @CalledByNative
    public AgoraFocalLengthInfo(int i, int i2) {
        this.cameraDirection = i;
        this.focalLengthType = i2;
    }

    public String toString() {
        return "AgoraFocalLengthInfo{cameraDirection=" + this.cameraDirection + ", focalLengthType=" + this.focalLengthType + '}';
    }
}
