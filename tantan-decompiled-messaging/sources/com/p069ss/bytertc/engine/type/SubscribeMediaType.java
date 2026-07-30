package com.p069ss.bytertc.engine.type;

/* JADX INFO: loaded from: classes13.dex */
public enum SubscribeMediaType {
    NONE(0),
    AUDIO_ONLY(1),
    VIDEO_ONLY(2),
    AUDIO_AND_VIDEO(3);

    private int value;

    SubscribeMediaType(int i) {
        this.value = i;
    }

    public int value() {
        return this.value;
    }
}
