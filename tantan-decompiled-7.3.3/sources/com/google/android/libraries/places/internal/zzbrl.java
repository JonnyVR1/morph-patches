package com.google.android.libraries.places.internal;

import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
class zzbrl implements zzbts {
    private final zzbts zza;

    public zzbrl(zzbts zzbtsVar) {
        this.zza = zzbtsVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.zza.close();
    }

    @Override // com.google.android.libraries.places.internal.zzbts
    public void zza(zzbue zzbueVar) throws IOException {
        this.zza.zza(zzbueVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbts
    public void zzb(boolean z, int i, int i2) throws IOException {
        this.zza.zzb(z, i, i2);
    }

    @Override // com.google.android.libraries.places.internal.zzbts
    public void zzc(int i, zzbtp zzbtpVar) throws IOException {
        this.zza.zzc(i, zzbtpVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbts
    public final int zzd() {
        return this.zza.zzd();
    }

    @Override // com.google.android.libraries.places.internal.zzbts
    public final void zze() throws IOException {
        this.zza.zze();
    }

    @Override // com.google.android.libraries.places.internal.zzbts
    public final void zzf(boolean z, int i, zzbwb zzbwbVar, int i2) throws IOException {
        this.zza.zzf(z, i, zzbwbVar, i2);
    }

    @Override // com.google.android.libraries.places.internal.zzbts
    public final void zzg() throws IOException {
        this.zza.zzg();
    }

    @Override // com.google.android.libraries.places.internal.zzbts
    public final void zzh(int i, zzbtp zzbtpVar, byte[] bArr) throws IOException {
        this.zza.zzh(0, zzbtpVar, bArr);
    }

    @Override // com.google.android.libraries.places.internal.zzbts
    public final void zzi(zzbue zzbueVar) throws IOException {
        this.zza.zzi(zzbueVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbts
    public final void zzj(boolean z, boolean z2, int i, int i2, List list) throws IOException {
        this.zza.zzj(false, false, i, 0, list);
    }

    @Override // com.google.android.libraries.places.internal.zzbts
    public final void zzk(int i, long j) throws IOException {
        this.zza.zzk(i, j);
    }
}
