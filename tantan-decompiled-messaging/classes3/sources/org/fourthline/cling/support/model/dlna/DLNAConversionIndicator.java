package org.fourthline.cling.support.model.dlna;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public enum DLNAConversionIndicator {
    NONE(0),
    TRANSCODED(1);

    private int code;

    DLNAConversionIndicator(int i) {
        this.code = i;
    }

    public static DLNAConversionIndicator valueOf(int i) {
        for (DLNAConversionIndicator dLNAConversionIndicator : values()) {
            if (dLNAConversionIndicator.getCode() == i) {
                return dLNAConversionIndicator;
            }
        }
        return null;
    }

    public int getCode() {
        return this.code;
    }
}
