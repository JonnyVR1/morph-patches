package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes6.dex */
enum zzak {
    UNSET('0'),
    REMOTE_DEFAULT('1'),
    REMOTE_DELEGATION('2'),
    MANIFEST('3'),
    INITIALIZATION('4'),
    API('5'),
    CHILD_ACCOUNT('6'),
    TCF('7'),
    REMOTE_ENFORCED_DEFAULT('8'),
    FAILSAFE('9');

    private final char zzl;

    zzak(char c) {
        this.zzl = c;
    }

    public static zzak zza(char c) {
        for (zzak zzakVar : values()) {
            if (zzakVar.zzl == c) {
                return zzakVar;
            }
        }
        return UNSET;
    }
}
