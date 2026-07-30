package com.google.android.gms.internal.ads;

import p149l.ig3;
import p149l.r8x0;
import p149l.s8x0;

/* JADX INFO: loaded from: classes6.dex */
public enum zzgus implements r8x0 {
    UNKNOWN_KEYMATERIAL(0),
    SYMMETRIC(1),
    ASYMMETRIC_PRIVATE(2),
    ASYMMETRIC_PUBLIC(3),
    REMOTE(4),
    UNRECOGNIZED(-1);

    private static final s8x0 zzg = new s8x0() { // from class: l.u3x0
    };
    private final int zzi;

    zzgus(int i) {
        this.zzi = i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(zza());
    }

    public final int zza() {
        if (this != UNRECOGNIZED) {
            return this.zzi;
        }
        ig3.m135964a("Can't get the number of an unknown enum value.");
        return 0;
    }
}
