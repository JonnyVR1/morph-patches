package io.agora.rtc2;

import io.agora.base.internal.CalledByNative;

/* JADX INFO: loaded from: classes2.dex */
public interface IH265TranscoderObserver {

    public enum H265TranscodeResult {
        UNKNOWN(-1),
        SUCCESS(0),
        REQUEST_INVALID(1),
        UNAUTHORIZED(2),
        TOKEN_EXPIRED(3),
        FORBIDDEN(4),
        NOT_FOUND(5),
        CONFLICTED(6),
        NOT_SUPPORTED(7),
        TOO_OFTEN(8),
        SERVER_INTERNAL_ERROR(9),
        SERVICE_UNAVAILABLE(10);

        private int value;

        H265TranscodeResult(int i) {
            this.value = i;
        }

        public static H265TranscodeResult fromInt(int i) {
            for (H265TranscodeResult h265TranscodeResult : values()) {
                if (h265TranscodeResult.getValue() == i) {
                    return h265TranscodeResult;
                }
            }
            return null;
        }

        public int getValue() {
            return this.value;
        }
    }

    @CalledByNative
    void onEnableTranscode(int i);

    @CalledByNative
    void onQueryChannel(int i, String str, String str2);

    @CalledByNative
    void onTriggerTranscode(int i);
}
