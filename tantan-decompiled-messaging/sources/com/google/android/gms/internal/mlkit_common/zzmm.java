package com.google.android.gms.internal.mlkit_common;

/* JADX INFO: loaded from: classes6.dex */
public enum zzmm {
    UNKNOWN(0),
    TRANSLATE(1);

    private final int zzd;

    zzmm(int i) {
        this.zzd = i;
    }

    public static zzmm zzb(int i) {
        for (zzmm zzmmVar : values()) {
            if (zzmmVar.zzd == i) {
                return zzmmVar;
            }
        }
        return UNKNOWN;
    }

    public final int zza() {
        return this.zzd;
    }
}
