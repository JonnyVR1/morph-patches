package com.p069ss.bytertc.engine.type;

/* JADX INFO: loaded from: classes13.dex */
public enum RtcMode {
    RTC_MODE_GENERAL(0),
    RTC_MODE_LOCAL_AUDIO(1);

    private int value;

    RtcMode(int i) {
        this.value = i;
    }

    public int value() {
        return this.value;
    }
}
