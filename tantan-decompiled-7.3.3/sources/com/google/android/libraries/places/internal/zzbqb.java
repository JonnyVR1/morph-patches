package com.google.android.libraries.places.internal;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes7.dex */
final class zzbqb extends zzbpz {
    private final AtomicIntegerFieldUpdater zza;

    public /* synthetic */ zzbqb(AtomicIntegerFieldUpdater atomicIntegerFieldUpdater, zzbqa zzbqaVar) {
        super(null);
        this.zza = atomicIntegerFieldUpdater;
    }

    @Override // com.google.android.libraries.places.internal.zzbpz
    public final void zza(zzbqe zzbqeVar, int i) {
        this.zza.set(zzbqeVar, 0);
    }

    @Override // com.google.android.libraries.places.internal.zzbpz
    public final boolean zzb(zzbqe zzbqeVar, int i, int i2) {
        return this.zza.compareAndSet(zzbqeVar, 0, -1);
    }
}
