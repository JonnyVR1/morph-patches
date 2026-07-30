package com.google.android.libraries.places.internal;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes7.dex */
final class zzbox {
    private final AtomicLong zza = new AtomicLong();

    public final long zza(long j) {
        return this.zza.addAndGet(j);
    }
}
