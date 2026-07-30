package io.agora.rtc2.internal;

import io.agora.base.internal.CalledByNative;

/* JADX INFO: loaded from: classes2.dex */
public class AgoraExtension {
    private long nativeProvider;
    private String vendor;

    public AgoraExtension(String str, long j) {
        this.vendor = str;
        this.nativeProvider = j;
    }

    @CalledByNative
    public long getNativeProvider() {
        return this.nativeProvider;
    }

    @CalledByNative
    public String getVendor() {
        return this.vendor;
    }
}
