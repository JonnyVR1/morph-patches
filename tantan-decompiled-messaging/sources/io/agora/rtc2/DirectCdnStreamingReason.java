package io.agora.rtc2;

import io.agora.base.internal.CalledByNative;

/* JADX INFO: loaded from: classes2.dex */
public enum DirectCdnStreamingReason {
    OK(0),
    FAILED(1),
    AUDIO_PUBLICATION(2),
    VIDEO_PUBLICATION(3),
    NET_CONNECT(4),
    BAD_NAME(5);

    private int value;

    DirectCdnStreamingReason(int i) {
        this.value = i;
    }

    @CalledByNative
    public static DirectCdnStreamingReason fromInt(int i) {
        for (DirectCdnStreamingReason directCdnStreamingReason : values()) {
            if (directCdnStreamingReason.getValue() == i) {
                return directCdnStreamingReason;
            }
        }
        return FAILED;
    }

    public int getValue() {
        return this.value;
    }
}
