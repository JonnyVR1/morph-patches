package com.google.android.gms.internal.ads;

import p149l.r8x0;
import p149l.s8x0;

/* JADX INFO: loaded from: classes6.dex */
public enum zzbec implements r8x0 {
    UNSPECIFIED(0),
    CONNECTING(1),
    CONNECTED(2),
    DISCONNECTING(3),
    DISCONNECTED(4),
    SUSPENDED(5);

    private static final s8x0 zzg = new s8x0() { // from class: l.o5s0
    };
    private final int zzi;

    zzbec(int i) {
        this.zzi = i;
    }

    public static zzbec zzb(int i) {
        if (i == 0) {
            return UNSPECIFIED;
        }
        if (i == 1) {
            return CONNECTING;
        }
        if (i == 2) {
            return CONNECTED;
        }
        if (i == 3) {
            return DISCONNECTING;
        }
        if (i == 4) {
            return DISCONNECTED;
        }
        if (i != 5) {
            return null;
        }
        return SUSPENDED;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.zzi);
    }

    public final int zza() {
        return this.zzi;
    }
}
