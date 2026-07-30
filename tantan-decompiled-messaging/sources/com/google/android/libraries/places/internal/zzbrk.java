package com.google.android.libraries.places.internal;

import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes7.dex */
final class zzbrk implements zzbts {
    private static final Logger zza = Logger.getLogger(zzbsf.class.getName());
    private final zzbrj zzb;
    private final zzbts zzc;
    private final zzbsi zzd = new zzbsi(Level.FINE, zzbsf.class);

    public zzbrk(zzbrj zzbrjVar, zzbts zzbtsVar) {
        this.zzb = zzbrjVar;
        this.zzc = zzbtsVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            this.zzc.close();
        } catch (IOException e) {
            zza.logp(e.getClass().equals(IOException.class) ? Level.FINE : Level.INFO, "io.grpc.okhttp.ExceptionHandlingFrameWriter", "close", "Failed closing connection", (Throwable) e);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbts
    public final void zza(zzbue zzbueVar) {
        this.zzd.zzi(2);
        try {
            this.zzc.zza(zzbueVar);
        } catch (IOException e) {
            this.zzb.zzb(e);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbts
    public final void zzb(boolean z, int i, int i2) {
        long j = (((long) i) << 32) | (((long) i2) & 4294967295L);
        zzbsi zzbsiVar = this.zzd;
        if (z) {
            zzbsiVar.zze(2, j);
        } else {
            zzbsiVar.zzd(2, j);
        }
        try {
            this.zzc.zzb(z, i, i2);
        } catch (IOException e) {
            this.zzb.zzb(e);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbts
    public final void zzc(int i, zzbtp zzbtpVar) {
        this.zzd.zzg(2, i, zzbtpVar);
        try {
            this.zzc.zzc(i, zzbtpVar);
        } catch (IOException e) {
            this.zzb.zzb(e);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbts
    public final int zzd() {
        return this.zzc.zzd();
    }

    @Override // com.google.android.libraries.places.internal.zzbts
    public final void zze() {
        try {
            this.zzc.zze();
        } catch (IOException e) {
            this.zzb.zzb(e);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbts
    public final void zzf(boolean z, int i, zzbwb zzbwbVar, int i2) {
        this.zzd.zza(2, i, zzbwbVar, i2, z);
        try {
            this.zzc.zzf(z, i, zzbwbVar, i2);
        } catch (IOException e) {
            this.zzb.zzb(e);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbts
    public final void zzg() {
        try {
            this.zzc.zzg();
        } catch (IOException e) {
            this.zzb.zzb(e);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbts
    public final void zzh(int i, zzbtp zzbtpVar, byte[] bArr) {
        zzbwe zzbweVar = zzbwf.zza;
        this.zzd.zzb(2, 0, zzbtpVar, zzbwe.zzb(bArr));
        try {
            this.zzc.zzh(0, zzbtpVar, bArr);
            this.zzc.zzg();
        } catch (IOException e) {
            this.zzb.zzb(e);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbts
    public final void zzi(zzbue zzbueVar) {
        this.zzd.zzh(2, zzbueVar);
        try {
            this.zzc.zzi(zzbueVar);
        } catch (IOException e) {
            this.zzb.zzb(e);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbts
    public final void zzj(boolean z, boolean z2, int i, int i2, List list) {
        try {
            this.zzc.zzj(false, false, i, 0, list);
        } catch (IOException e) {
            this.zzb.zzb(e);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbts
    public final void zzk(int i, long j) {
        this.zzd.zzj(2, i, j);
        try {
            this.zzc.zzk(i, j);
        } catch (IOException e) {
            this.zzb.zzb(e);
        }
    }
}
