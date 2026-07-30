package com.p074ss.bytertc.engine.live;

/* JADX INFO: loaded from: classes11.dex */
public enum MixedStreamMediaType {
    MIXED_STREAM_MEDIA_TYPE_AUDIO_AND_VIDEO(0),
    MIXED_STREAM_MEDIA_TYPE_AUDIO_ONLY(1),
    MIXED_STREAM_MEDIA_TYPE_VIDEO_ONLY(2);

    private int contentControlType;

    MixedStreamMediaType(int i) {
        this.contentControlType = i;
    }

    public int getValue() {
        return this.contentControlType;
    }
}
