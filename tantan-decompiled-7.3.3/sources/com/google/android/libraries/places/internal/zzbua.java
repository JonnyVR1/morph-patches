package com.google.android.libraries.places.internal;

import com.google.android.gms.common.api.Api;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes7.dex */
final class zzbua implements zzbts {
    private final zzbwc zza;
    private final zzbwb zzb;
    private final zzbtv zzc;
    private int zzd;
    private boolean zze;

    public zzbua(zzbwc zzbwcVar, boolean z) {
        this.zza = zzbwcVar;
        zzbwb zzbwbVar = new zzbwb();
        this.zzb = zzbwbVar;
        this.zzc = new zzbtv(4096, false, zzbwbVar);
        this.zzd = 16384;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() throws IOException {
        this.zze = true;
        this.zza.close();
    }

    @Override // com.google.android.libraries.places.internal.zzbts
    public final synchronized void zza(zzbue zzbueVar) throws IOException {
        if (this.zze) {
            throw new IOException("closed");
        }
        this.zzd = zzbueVar.zzc(this.zzd);
        zzl(0, 0, (byte) 4, (byte) 1);
        this.zza.flush();
    }

    @Override // com.google.android.libraries.places.internal.zzbts
    public final synchronized void zzb(boolean z, int i, int i2) throws IOException {
        if (this.zze) {
            throw new IOException("closed");
        }
        zzl(0, 8, (byte) 6, z ? (byte) 1 : (byte) 0);
        this.zza.zzw(i);
        this.zza.zzw(i2);
        this.zza.flush();
    }

    @Override // com.google.android.libraries.places.internal.zzbts
    public final synchronized void zzc(int i, zzbtp zzbtpVar) throws IOException {
        if (this.zze) {
            throw new IOException("closed");
        }
        if (zzbtpVar.zzs == -1) {
            throw new IllegalArgumentException();
        }
        zzl(i, 4, (byte) 3, (byte) 0);
        this.zza.zzw(zzbtpVar.zzs);
        this.zza.flush();
    }

    @Override // com.google.android.libraries.places.internal.zzbts
    public final int zzd() {
        return this.zzd;
    }

    @Override // com.google.android.libraries.places.internal.zzbts
    public final synchronized void zze() throws IOException {
        try {
            if (this.zze) {
                throw new IOException("closed");
            }
            Logger logger = zzbub.zza;
            Level level = Level.FINE;
            if (logger.isLoggable(level)) {
                zzbub.zza.logp(level, "io.grpc.okhttp.internal.framed.Http2$Writer", "connectionPreface", String.format(">> CONNECTION %s", zzbub.zzb.zze()));
            }
            zzbwc zzbwcVar = this.zza;
            byte[] bArrZzp = zzbub.zzb.zzp();
            bArrZzp.getClass();
            if (((zzbwk) zzbwcVar).zzc) {
                throw new IllegalStateException("closed");
            }
            zzbwb zzbwbVar = ((zzbwk) zzbwcVar).zzb;
            bArrZzp.getClass();
            zzbwbVar.zzl(bArrZzp, 0, bArrZzp.length);
            ((zzbwk) zzbwcVar).zza();
            this.zza.flush();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbts
    public final synchronized void zzf(boolean z, int i, zzbwb zzbwbVar, int i2) throws IOException {
        if (this.zze) {
            throw new IOException("closed");
        }
        zzl(i, i2, (byte) 0, z ? (byte) 1 : (byte) 0);
        if (i2 > 0) {
            this.zza.zzn(zzbwbVar, i2);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbts
    public final synchronized void zzg() throws IOException {
        if (this.zze) {
            throw new IOException("closed");
        }
        this.zza.flush();
    }

    @Override // com.google.android.libraries.places.internal.zzbts
    public final synchronized void zzh(int i, zzbtp zzbtpVar, byte[] bArr) throws IOException {
        if (this.zze) {
            throw new IOException("closed");
        }
        if (zzbtpVar.zzs == -1) {
            throw zzbub.zzf("errorCode.httpCode == -1", new Object[0]);
        }
        zzl(0, 8, (byte) 7, (byte) 0);
        this.zza.zzw(0);
        this.zza.zzw(zzbtpVar.zzs);
        this.zza.flush();
    }

    @Override // com.google.android.libraries.places.internal.zzbts
    public final synchronized void zzi(zzbue zzbueVar) throws IOException {
        int i;
        try {
            if (this.zze) {
                throw new IOException("closed");
            }
            int i2 = 0;
            zzl(0, zzbueVar.zzd() * 6, (byte) 4, (byte) 0);
            while (i2 < 10) {
                if (zzbueVar.zzf(i2)) {
                    if (i2 == 4) {
                        int i3 = i2;
                        i2 = 3;
                        i = i3;
                    } else {
                        i = 7;
                        if (i2 == 7) {
                            i2 = 4;
                        } else {
                            i = i2;
                        }
                    }
                    zzbwc zzbwcVar = this.zza;
                    if (((zzbwk) zzbwcVar).zzc) {
                        throw new IllegalStateException("closed");
                    }
                    ((zzbwk) zzbwcVar).zzb.zzq(i2);
                    ((zzbwk) zzbwcVar).zza();
                    this.zza.zzw(zzbueVar.zza(i));
                    i2 = i;
                }
                i2++;
            }
            this.zza.flush();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbts
    public final synchronized void zzj(boolean z, boolean z2, int i, int i2, List list) throws IOException {
        if (this.zze) {
            throw new IOException("closed");
        }
        this.zzc.zzb(list);
        long jZzg = this.zzb.zzg();
        int iMin = (int) Math.min(this.zzd, jZzg);
        long j = iMin;
        zzl(i, iMin, (byte) 1, jZzg == j ? (byte) 4 : (byte) 0);
        this.zza.zzn(this.zzb, j);
        if (jZzg > j) {
            long j2 = jZzg - j;
            while (j2 > 0) {
                int iMin2 = (int) Math.min(this.zzd, j2);
                long j3 = iMin2;
                j2 -= j3;
                zzl(i, iMin2, (byte) 9, j2 == 0 ? (byte) 4 : (byte) 0);
                this.zza.zzn(this.zzb, j3);
            }
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbts
    public final synchronized void zzk(int i, long j) throws IOException {
        if (this.zze) {
            throw new IOException("closed");
        }
        if (j == 0) {
            throw zzbub.zzf("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", new Object[]{0L});
        }
        zzl(i, 4, (byte) 8, (byte) 0);
        this.zza.zzw((int) j);
        this.zza.flush();
    }

    public final void zzl(int i, int i2, byte b, byte b2) throws IOException {
        Logger logger = zzbub.zza;
        Level level = Level.FINE;
        if (logger.isLoggable(level)) {
            zzbub.zza.logp(level, "io.grpc.okhttp.internal.framed.Http2$Writer", "frameHeader", zzbty.zza(false, i, i2, b, b2));
        }
        int i3 = this.zzd;
        if (i2 > i3) {
            throw zzbub.zzf("FRAME_SIZE_ERROR length > %d: %d", new Object[]{Integer.valueOf(i3), Integer.valueOf(i2)});
        }
        if ((Integer.MIN_VALUE & i) != 0) {
            throw zzbub.zzf("reserved bit set: %s", new Object[]{Integer.valueOf(i)});
        }
        zzbwc zzbwcVar = this.zza;
        zzbwcVar.zzv((i2 >>> 16) & 255);
        zzbwcVar.zzv((i2 >>> 8) & 255);
        zzbwcVar.zzv(i2 & 255);
        this.zza.zzv(b);
        this.zza.zzv(b2);
        this.zza.zzw(i & Api.BaseClientBuilder.API_PRIORITY_OTHER);
    }
}
