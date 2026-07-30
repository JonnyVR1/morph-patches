package com.p074ss.bytertc.engine.type;

/* JADX INFO: loaded from: classes11.dex */
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
