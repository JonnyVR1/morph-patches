package com.google.android.libraries.places.internal;

import java.io.Closeable;
import p153l.gig0;

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
            gig0.m130323a("Mismatched calls to RecursionDepth (possible error in core library)");
        }
    }
}
