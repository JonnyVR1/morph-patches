package com.p074ss.bytertc.engine.data;

/* JADX INFO: loaded from: classes11.dex */
public enum AggregationOption {
    MIN(0),
    MAX(1),
    MAJORITY(2);

    private int value;

    AggregationOption(int i) {
        this.value = i;
    }

    @Override // java.lang.Enum
    public String toString() {
        if (this == MIN) {
            return "AggregationOptionMin";
        }
        if (this == MAX) {
            return "AggregationOptionMax";
        }
        return this == MAJORITY ? "AggregationOptionMajority" : "AggregationOptionMin";
    }

    public int value() {
        return this.value;
    }
}
