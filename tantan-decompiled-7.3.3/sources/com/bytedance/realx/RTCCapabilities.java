package com.bytedance.realx;

import com.bytedance.realx.base.CalledByNative;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class RTCCapabilities {
    private List<String> supportedVideoCodecs;

    @CalledByNative
    public RTCCapabilities(long j) {
        this.supportedVideoCodecs = Arrays.asList(nativeGetSupportedVideoCodecs(j));
    }

    private static native String[] nativeGetSupportedVideoCodecs(long j);

    public List<String> getSupportedVideoCodecs() {
        return this.supportedVideoCodecs;
    }

    public RTCCapabilities(List<String> list) {
        this.supportedVideoCodecs = list;
    }
}
