package com.immomo.momomediaext;

/* JADX INFO: loaded from: classes7.dex */
public enum MomoMediaConstants$MMLiveSimulcastStreamMode {
    NO_SET(-2),
    AUTO_SIMULCAST_STREAM(-1),
    DISABLE_SIMULCAST_STREAM(0),
    ENABLE_SIMULCAST_STREAM(1);

    private int value;

    MomoMediaConstants$MMLiveSimulcastStreamMode(int i) {
        this.value = i;
    }

    public int getValue() {
        return this.value;
    }
}
