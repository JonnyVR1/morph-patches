package org.fourthline.cling.support.model;

import p149l.qhg0;

/* JADX INFO: loaded from: classes3.dex */
public enum SeekMode {
    TRACK_NR("TRACK_NR"),
    ABS_TIME("ABS_TIME"),
    REL_TIME("REL_TIME"),
    ABS_COUNT("ABS_COUNT"),
    REL_COUNT("REL_COUNT"),
    CHANNEL_FREQ("CHANNEL_FREQ"),
    TAPE_INDEX("TAPE-INDEX"),
    FRAME("FRAME");

    private String protocolString;

    SeekMode(String str) {
        this.protocolString = str;
    }

    public static SeekMode valueOrExceptionOf(String str) throws IllegalArgumentException {
        for (SeekMode seekMode : values()) {
            if (seekMode.protocolString.equals(str)) {
                return seekMode;
            }
        }
        qhg0.m174539a("Invalid seek mode string: ", str);
        return null;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.protocolString;
    }
}
