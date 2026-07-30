package com.p069ss.bytertc.engine.type;

/* JADX INFO: loaded from: classes13.dex */
public enum RecordingState {
    RECORDING_STATE_ERROE(0),
    RECORDING_STATE_PROCESSING(1),
    RECORDING_STATE_SUCCESS(2);

    private int value;

    RecordingState(int i) {
        this.value = i;
    }

    public static RecordingState fromId(int i) {
        for (RecordingState recordingState : values()) {
            if (recordingState.value() == i) {
                return recordingState;
            }
        }
        return RECORDING_STATE_ERROE;
    }

    public int value() {
        return this.value;
    }
}
