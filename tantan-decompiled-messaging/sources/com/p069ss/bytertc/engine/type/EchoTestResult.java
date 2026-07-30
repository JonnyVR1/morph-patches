package com.p069ss.bytertc.engine.type;

/* JADX INFO: loaded from: classes13.dex */
public enum EchoTestResult {
    ECHO_TEST_SUCCESS(0),
    ECHO_TEST_TIMEOUT(1),
    ECHO_TEST_INTERVAL_SHORT(2),
    ECHO_TEST_AUDIO_DEVICE_ERROR(3),
    ECHO_TEST_VIDEO_DEVICE_ERROR(4),
    ECHO_TEST_AUDIO_RECEIVE_ERROR(5),
    ECHO_TEST_VIDEO_RECEIVE_ERROR(6),
    ECHO_TEST_INTERNAL_ERROR(7);

    private final int value;

    EchoTestResult(int i) {
        this.value = i;
    }

    public static EchoTestResult fromId(int i) {
        for (EchoTestResult echoTestResult : values()) {
            if (echoTestResult.value() == i) {
                return echoTestResult;
            }
        }
        return ECHO_TEST_SUCCESS;
    }

    public int value() {
        return this.value;
    }
}
