package com.p074ss.bytertc.engine.type;

/* JADX INFO: loaded from: classes11.dex */
public enum PauseResumeControlMediaType {
    AUDIO(0),
    VIDEO(1),
    AUDIO_AND_VIDEO(2);

    private int value;

    PauseResumeControlMediaType(int i) {
        this.value = i;
    }

    public int value() {
        return this.value;
    }
}
