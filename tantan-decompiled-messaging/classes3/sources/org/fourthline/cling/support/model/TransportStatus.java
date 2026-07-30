package org.fourthline.cling.support.model;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public enum TransportStatus {
    OK,
    ERROR_OCCURRED,
    CUSTOM;

    String value = name();

    TransportStatus() {
    }

    public static TransportStatus valueOrCustomOf(String str) {
        try {
            return valueOf(str);
        } catch (IllegalArgumentException unused) {
            return CUSTOM.setValue(str);
        }
    }

    public String getValue() {
        return this.value;
    }

    public TransportStatus setValue(String str) {
        this.value = str;
        return this;
    }
}
