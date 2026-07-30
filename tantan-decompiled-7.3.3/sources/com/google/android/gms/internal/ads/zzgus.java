package com.google.android.gms.internal.ads;

import p153l.wg3;
import p153l.xhx0;
import p153l.yhx0;

/* JADX INFO: loaded from: classes6.dex */
public enum zzgus implements xhx0 {
    UNKNOWN_KEYMATERIAL(0),
    SYMMETRIC(1),
    ASYMMETRIC_PRIVATE(2),
    ASYMMETRIC_PUBLIC(3),
    REMOTE(4),
    UNRECOGNIZED(-1);

    private static final yhx0 zzg = new yhx0() { // from class: l.adx0
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
        wg3.m206174a("Can't get the number of an unknown enum value.");
        return 0;
    }
}
