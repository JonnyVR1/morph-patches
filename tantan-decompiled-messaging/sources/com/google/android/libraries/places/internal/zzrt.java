package com.google.android.libraries.places.internal;

import java.io.Closeable;
import p149l.y9g0;

/* JADX INFO: loaded from: classes7.dex */
public final class zzrt implements Closeable {
    private static final ThreadLocal zza = new zzrs();
    private int zzb = 0;

    public static int zza() {
        return ((zzrt) zza.get()).zzb;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i = this.zzb;
        if (i > 0) {
            this.zzb = i - 1;
        } else {
            y9g0.m213537a("Mismatched calls to RecursionDepth (possible error in core library)");
        }
    }
}
