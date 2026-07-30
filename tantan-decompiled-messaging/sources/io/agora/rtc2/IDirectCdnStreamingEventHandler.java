package io.agora.rtc2;

import io.agora.base.internal.CalledByNative;

/* JADX INFO: loaded from: classes2.dex */
public interface IDirectCdnStreamingEventHandler {
    @CalledByNative
    void onDirectCdnStreamingStateChanged(DirectCdnStreamingState directCdnStreamingState, DirectCdnStreamingReason directCdnStreamingReason, String str);

    @CalledByNative
    void onDirectCdnStreamingStats(DirectCdnStreamingStats directCdnStreamingStats);
}
