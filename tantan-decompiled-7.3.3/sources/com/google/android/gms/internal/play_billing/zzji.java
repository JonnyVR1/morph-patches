package com.google.android.gms.internal.play_billing;

import p153l.yvx0;

/* JADX INFO: loaded from: classes6.dex */
public final class zzji extends RuntimeException {
    public zzji(yvx0 yvx0Var) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final zzhr zza() {
        return new zzhr(getMessage());
    }
}
