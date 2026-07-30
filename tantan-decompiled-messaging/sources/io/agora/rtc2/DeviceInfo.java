package io.agora.rtc2;

import io.agora.base.internal.CalledByNative;

/* JADX INFO: loaded from: classes2.dex */
public class DeviceInfo {
    public boolean isLowLatencyAudioSupported;

    @CalledByNative
    public DeviceInfo(boolean z) {
        this.isLowLatencyAudioSupported = z;
    }
}
