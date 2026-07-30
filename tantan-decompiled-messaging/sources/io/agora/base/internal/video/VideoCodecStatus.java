package io.agora.base.internal.video;

import io.agora.base.internal.CalledByNative;

/* JADX INFO: loaded from: classes2.dex */
public enum VideoCodecStatus {
    REQUEST_SLI(2),
    NO_OUTPUT(1),
    OK(0),
    ERROR(-1),
    LEVEL_EXCEEDED(-2),
    MEMORY(-3),
    ERR_PARAMETER(-4),
    ERR_SIZE(-5),
    TIMEOUT(-6),
    UNINITIALIZED(-7),
    ERR_REQUEST_SLI(-12),
    FALLBACK_SOFTWARE(-13),
    TARGET_BITRATE_OVERSHOOT(-14),
    SIMULCAST_PARAMETERS_NOT_SUPPORTED(-15),
    FALLBACK_DEFAULT_PROFILE(-16),
    CODEC_RESET_DECODER(-20),
    ERROR_CODEC_OUTPUT_FAILURE(-22);

    private final int number;

    VideoCodecStatus(int i) {
        this.number = i;
    }

    @CalledByNative
    public int getNumber() {
        return this.number;
    }
}
