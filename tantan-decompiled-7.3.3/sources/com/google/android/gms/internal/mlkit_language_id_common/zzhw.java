package com.google.android.gms.internal.mlkit_language_id_common;

import p153l.vnr0;

/* JADX INFO: loaded from: classes6.dex */
public enum zzhw implements vnr0 {
    TYPE_UNKNOWN(0),
    TYPE_THIN(1),
    TYPE_THICK(2),
    TYPE_GMV(3);

    private final int zzf;

    zzhw(int i) {
        this.zzf = i;
    }

    @Override // p153l.vnr0
    public final int zza() {
        return this.zzf;
    }
}
