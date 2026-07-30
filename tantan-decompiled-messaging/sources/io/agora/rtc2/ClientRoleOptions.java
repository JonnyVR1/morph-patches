package io.agora.rtc2;

import io.agora.base.internal.CalledByNative;

/* JADX INFO: loaded from: classes2.dex */
public class ClientRoleOptions {
    public int audienceLatencyLevel;

    @CalledByNative
    public int getAudienceLatencyLevel() {
        return this.audienceLatencyLevel;
    }
}
