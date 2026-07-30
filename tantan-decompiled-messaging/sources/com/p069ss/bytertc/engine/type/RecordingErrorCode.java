package com.p069ss.bytertc.engine.type;

/* JADX INFO: loaded from: classes13.dex */
public enum RecordingErrorCode {
    RECORDING_ERROR_CODE_OK(0),
    RECORDING_ERROR_CODE_NO_PERMISSION(-1),
    RECORDING_ERROR_CODE_NOT_SUPPORT(-2),
    RECORDING_ERROR_CODE_NO_OTHER(-3);

    private int value;

    RecordingErrorCode(int i) {
        this.value = i;
    }

    public static RecordingErrorCode fromId(int i) {
        for (RecordingErrorCode recordingErrorCode : values()) {
            if (recordingErrorCode.value() == i) {
                return recordingErrorCode;
            }
        }
        return RECORDING_ERROR_CODE_OK;
    }

    public int value() {
        return this.value;
    }
}
