package com.p074ss.bytertc.engine.type;

/* JADX INFO: loaded from: classes11.dex */
public enum RecordingType {
    RECORD_AUDIO_ONLY(0),
    RECORD_VIDEO_ONLY(1),
    RECORD_VIDEO_AND_AUDIO(2);

    private int value;

    RecordingType(int i) {
        this.value = i;
    }

    public static RecordingType fromId(int i) {
        for (RecordingType recordingType : values()) {
            if (recordingType.value() == i) {
                return recordingType;
            }
        }
        return null;
    }

    public int value() {
        return this.value;
    }
}
