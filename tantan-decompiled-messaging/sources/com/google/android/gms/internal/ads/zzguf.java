package com.google.android.gms.internal.ads;

import p149l.ig3;
import p149l.r8x0;
import p149l.s8x0;

/* JADX INFO: loaded from: classes6.dex */
public enum zzguf implements r8x0 {
    UNKNOWN_HASH(0),
    SHA1(1),
    SHA384(2),
    SHA256(3),
    SHA512(4),
    SHA224(5),
    UNRECOGNIZED(-1);

    private static final s8x0 zzh = new s8x0() { // from class: l.l3x0
    };
    private final int zzj;

    zzguf(int i) {
        this.zzj = i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(zza());
    }

    public final int zza() {
        if (this != UNRECOGNIZED) {
            return this.zzj;
        }
        ig3.m135964a("Can't get the number of an unknown enum value.");
        return 0;
    }
}
