package com.google.android.libraries.places.internal;

import com.google.android.gms.common.api.Api;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes7.dex */
final class zzbtx implements zzbws {
    int zza;
    byte zzb;
    int zzc;
    int zzd;
    short zze;
    private final zzbwd zzf;

    public zzbtx(zzbwd zzbwdVar) {
        this.zzf = zzbwdVar;
    }

    @Override // com.google.android.libraries.places.internal.zzbws, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
    }

    @Override // com.google.android.libraries.places.internal.zzbws
    public final long zza(zzbwb zzbwbVar, long j) throws IOException {
        int i;
        int iZze;
        do {
            int i2 = this.zzd;
            zzbwd zzbwdVar = this.zzf;
            if (i2 == 0) {
                zzbwdVar.zzF(this.zze);
                this.zze = (short) 0;
                if ((this.zzb & 4) == 0) {
                    i = this.zzc;
                    int iZzb = zzbub.zzb(this.zzf);
                    this.zzd = iZzb;
                    this.zza = iZzb;
                    int iZzc = this.zzf.zzc() & 255;
                    this.zzb = (byte) (this.zzf.zzc() & 255);
                    Logger logger = zzbub.zza;
                    Level level = Level.FINE;
                    byte b = (byte) iZzc;
                    if (logger.isLoggable(level)) {
                        zzbub.zza.logp(level, "io.grpc.okhttp.internal.framed.Http2$ContinuationSource", "readContinuationHeader", zzbty.zza(true, this.zzc, this.zza, b, this.zzb));
                    }
                    iZze = this.zzf.zze() & Api.BaseClientBuilder.API_PRIORITY_OTHER;
                    this.zzc = iZze;
                    if (b != 9) {
                        throw zzbub.zzi("%s != TYPE_CONTINUATION", Byte.valueOf(b));
                    }
                }
            } else {
                long jZza = zzbwdVar.zza(zzbwbVar, Math.min(8192L, i2));
                if (jZza != -1) {
                    this.zzd -= (int) jZza;
                    return jZza;
                }
            }
            return -1L;
        } while (iZze == i);
        throw zzbub.zzi("TYPE_CONTINUATION streamId changed", new Object[0]);
    }
}
