package com.immomo.momomediaext;

/* JADX INFO: loaded from: classes7.dex */
public enum MomoMediaConstants$MMLiveSimulcastStreamType {
    DEFAULT(-1),
    MMLiveSimulcastStreamTypeHigh(0),
    MMLiveSimulcastStreamTypeLow(1);

    private int value;

    MomoMediaConstants$MMLiveSimulcastStreamType(int i) {
        this.value = i;
    }

    public int getValue() {
        return this.value;
    }
}
