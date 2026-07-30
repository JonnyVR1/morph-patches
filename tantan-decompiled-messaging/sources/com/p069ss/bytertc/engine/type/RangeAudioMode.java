package com.p069ss.bytertc.engine.type;

/* JADX INFO: loaded from: classes13.dex */
public enum RangeAudioMode {
    RANGE_AUDIO_MODE_UNDEFINED(0),
    RANGE_AUDIO_MODE_TEAM(1),
    RANGE_AUDIO_MODE_WORLD(2);

    private int value;

    RangeAudioMode(int i) {
        this.value = i;
    }

    public int value() {
        return this.value;
    }
}
