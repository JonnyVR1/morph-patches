package com.p069ss.bytertc.engine.type;

/* JADX INFO: loaded from: classes13.dex */
public enum HardwareEchoDetectionResult {
    HARDWARE_ECHO_RESULT_CANCELED(0),
    HARDWARE_ECHO_RESULT_UNKNOWN(1),
    HARDWARE_ECHO_RESULT_NORMAL(2),
    HARDWARE_ECHO_RESULT_POOR(3);

    private final int value;

    HardwareEchoDetectionResult(int i) {
        this.value = i;
    }

    public static HardwareEchoDetectionResult fromId(int i) {
        for (HardwareEchoDetectionResult hardwareEchoDetectionResult : values()) {
            if (hardwareEchoDetectionResult.value() == i) {
                return hardwareEchoDetectionResult;
            }
        }
        return HARDWARE_ECHO_RESULT_NORMAL;
    }

    public int value() {
        return this.value;
    }
}
