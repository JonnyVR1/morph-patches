package com.google.android.gms.internal.ads;

import p149l.zax0;

/* JADX INFO: loaded from: classes6.dex */
public final class zzhco extends RuntimeException {
    public zzhco(zax0 zax0Var) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final zzhag zza() {
        return new zzhag(getMessage());
    }
}
