package com.p074ss.bytertc.engine.data;

import com.p074ss.bytertc.engine.type.RecordingFileType;

/* JADX INFO: loaded from: classes11.dex */
public class RecordingConfig {
    public String dirPath;
    public RecordingFileType recordingFileType;

    public RecordingConfig(String str, RecordingFileType recordingFileType) {
        RecordingFileType recordingFileType2 = RecordingFileType.AAC;
        this.dirPath = str;
        this.recordingFileType = recordingFileType;
    }

    public RecordingConfig() {
        this.recordingFileType = RecordingFileType.MP4;
    }
}
