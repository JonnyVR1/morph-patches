package com.google.android.libraries.places.internal;

import java.io.IOException;
import java.io.OutputStream;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@SourceDebugExtension
final class zzbwj implements zzbwq {

    @NotNull
    private final OutputStream zza;

    @NotNull
    private final zzbwv zzb;

    public zzbwj(@NotNull OutputStream outputStream, @NotNull zzbwv zzbwvVar) {
        outputStream.getClass();
        zzbwvVar.getClass();
        this.zza = outputStream;
        this.zzb = zzbwvVar;
    }

    @Override // com.google.android.libraries.places.internal.zzbwq, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.zza.close();
    }

    @Override // com.google.android.libraries.places.internal.zzbwq, java.io.Flushable
    public final void flush() throws IOException {
        this.zza.flush();
    }

    @NotNull
    public final String toString() {
        return "sink(" + this.zza + ")";
    }

    @Override // com.google.android.libraries.places.internal.zzbwq
    public final void zzn(@NotNull zzbwb zzbwbVar, long j) throws IOException {
        zzbwbVar.getClass();
        zzbvv.zzb(zzbwbVar.zzg(), 0L, j);
        while (j > 0) {
            zzbwv.zzb();
            zzbwn zzbwnVar = zzbwbVar.zza;
            zzbwnVar.getClass();
            int iMin = (int) Math.min(j, zzbwnVar.zzd - zzbwnVar.zzc);
            this.zza.write(zzbwnVar.zzb, zzbwnVar.zzc, iMin);
            zzbwnVar.zzc += iMin;
            long j2 = iMin;
            zzbwbVar.zzE(zzbwbVar.zzg() - j2);
            j -= j2;
            if (zzbwnVar.zzc == zzbwnVar.zzd) {
                zzbwbVar.zza = zzbwnVar.zza();
                zzbwo.zzb(zzbwnVar);
            }
        }
    }
}
