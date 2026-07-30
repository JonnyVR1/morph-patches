package com.p069ss.bytertc.engine.data;

/* JADX INFO: loaded from: classes13.dex */
public enum SEICountPerFrame {
    SEI_COUNT_PER_FRAME_SINGLE(0),
    SEI_COUNT_PER_FRAME_MULTI(1);

    private int value;

    SEICountPerFrame(int i) {
        this.value = i;
    }

    public static SEICountPerFrame fromId(int i) {
        for (SEICountPerFrame sEICountPerFrame : values()) {
            if (sEICountPerFrame.value() == i) {
                return sEICountPerFrame;
            }
        }
        return null;
    }

    public int value() {
        return this.value;
    }
}
