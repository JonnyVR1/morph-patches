package com.google.android.libraries.places.internal;

import p149l.lmr;

/* JADX INFO: loaded from: classes7.dex */
final class zzasa extends zzasc {
    final /* synthetic */ zzask zza;
    private int zzb = 0;
    private final int zzc;

    public zzasa(zzask zzaskVar) {
        this.zza = zzaskVar;
        this.zzc = zzaskVar.zzd();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb < this.zzc;
    }

    @Override // com.google.android.libraries.places.internal.zzase
    public final byte zza() {
        int i = this.zzb;
        if (i < this.zzc) {
            this.zzb = i + 1;
            return this.zza.zzb(i);
        }
        lmr.m150601a();
        return (byte) 0;
    }
}
