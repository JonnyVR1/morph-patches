package com.p074ss.bytertc.engine.type;

/* JADX INFO: loaded from: classes11.dex */
public enum RecordingFileType {
    AAC(0),
    MP4(1);

    private int value;

    RecordingFileType(int i) {
        this.value = i;
    }

    public static RecordingFileType fromId(int i) {
        for (RecordingFileType recordingFileType : values()) {
            if (recordingFileType.value() == i) {
                return recordingFileType;
            }
        }
        return AAC;
    }

    public int value() {
        return this.value;
    }
}
