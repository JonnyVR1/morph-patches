package com.p069ss.bytertc.engine.type;

/* JADX INFO: loaded from: classes13.dex */
public enum AudioSelectionPriority {
    AUDIO_SELECTION_PRIORITY_NORMAL(0),
    AUDIO_SELECTION_PRIORITY_HIGIH(1);

    private int value;

    AudioSelectionPriority(int i) {
        this.value = i;
    }

    public int value() {
        return this.value;
    }
}
