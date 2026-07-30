package com.p074ss.bytertc.engine.live;

/* JADX INFO: loaded from: classes11.dex */
public enum MixedStreamVideoType {
    MIXED_STREAM_VIDEO_TYPE_MAIN(0),
    MIXED_STREAM_VIDEO_TYPE_SCREEN(1);

    private int videoType;

    MixedStreamVideoType(int i) {
        this.videoType = i;
    }

    public int getValue() {
        return this.videoType;
    }
}
