package com.p069ss.bytertc.engine.type;

/* JADX INFO: loaded from: classes13.dex */
public enum AudioRecordingErrorCode {
    AUDIO_RECORDING_ERROR_CODE_OK(0),
    AUDIO_RECORDING_ERROR_CODE_NO_PERMISSION(-1),
    AUDIO_RECORDING_ERROR_CODE_NOT_IN_ROOM(-2),
    AUDIO_RECORDING_ERROR_CODE_ALREADY_STARTED(-3),
    AUDIO_RECORDING_ERROR_CODE_NOT_STARTED(-4),
    AUDIO_RECORDING_ERROR_CODE_NOT_SUPPORT(-5),
    AUDIO_RECORDING_ERROR_CODE_OTHER(-6);

    private int value;

    AudioRecordingErrorCode(int i) {
        this.value = i;
    }

    public static AudioRecordingErrorCode fromId(int i) {
        for (AudioRecordingErrorCode audioRecordingErrorCode : values()) {
            if (audioRecordingErrorCode.value() == i) {
                return audioRecordingErrorCode;
            }
        }
        return AUDIO_RECORDING_ERROR_CODE_OTHER;
    }

    public int value() {
        return this.value;
    }
}
