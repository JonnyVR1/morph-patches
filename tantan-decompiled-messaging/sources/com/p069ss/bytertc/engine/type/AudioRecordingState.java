package com.p069ss.bytertc.engine.type;

/* JADX INFO: loaded from: classes13.dex */
public enum AudioRecordingState {
    AUDIO_RECORDING_STATE_ERROR(0),
    AUDIO_RECORDING_STATE_PROCESSING(1),
    AUDIO_RECORDING_STATE_SUCCESS(2);

    private int value;

    AudioRecordingState(int i) {
        this.value = i;
    }

    public static AudioRecordingState fromId(int i) {
        for (AudioRecordingState audioRecordingState : values()) {
            if (audioRecordingState.value() == i) {
                return audioRecordingState;
            }
        }
        return AUDIO_RECORDING_STATE_ERROR;
    }

    public int value() {
        return this.value;
    }
}
