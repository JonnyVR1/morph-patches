package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class zzzj extends IOException {
    public zzzj(Throwable th) {
        super("Unexpected " + th.getClass().getSimpleName() + (th.getMessage() != null ? ": ".concat(String.valueOf(th.getMessage())) : ""), th);
    }
}
