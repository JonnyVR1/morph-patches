package com.google.android.libraries.places.internal;

import p153l.onl;

/* JADX INFO: loaded from: classes7.dex */
public abstract class zzbeg implements zzbnv {
    @Override // com.google.android.libraries.places.internal.zzbnv, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    public final void zza(int i) {
        if (zzf() >= i) {
            return;
        }
        onl.m168333a();
    }

    @Override // com.google.android.libraries.places.internal.zzbnv
    public void zzb() {
    }

    @Override // com.google.android.libraries.places.internal.zzbnv
    public void zzc() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.libraries.places.internal.zzbnv
    public boolean zzd() {
        return false;
    }
}
