package com.google.android.gms.internal.ads;

import p153l.wg3;
import p153l.xhx0;
import p153l.yhx0;

/* JADX INFO: loaded from: classes6.dex */
public enum zzgvz implements xhx0 {
    UNKNOWN_PREFIX(0),
    TINK(1),
    LEGACY(2),
    RAW(3),
    CRUNCHY(4),
    UNRECOGNIZED(-1);

    private static final yhx0 zzg = new yhx0() { // from class: l.aex0
    };
    private final int zzi;

    zzgvz(int i) {
        this.zzi = i;
    }

    public static zzgvz zzb(int i) {
        if (i == 0) {
            return UNKNOWN_PREFIX;
        }
        if (i == 1) {
            return TINK;
        }
        if (i == 2) {
            return LEGACY;
        }
        if (i == 3) {
            return RAW;
        }
        if (i != 4) {
            return null;
        }
        return CRUNCHY;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(zza());
    }

    public final int zza() {
        if (this != UNRECOGNIZED) {
            return this.zzi;
        }
        wg3.m206174a("Can't get the number of an unknown enum value.");
        return 0;
    }
}
