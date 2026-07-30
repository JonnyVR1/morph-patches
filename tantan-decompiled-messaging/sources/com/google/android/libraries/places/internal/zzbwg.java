package com.google.android.libraries.places.internal;

import java.io.IOException;
import java.io.InputStream;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@SourceDebugExtension
final class zzbwg implements zzbws {

    @NotNull
    private final InputStream zza;

    @NotNull
    private final zzbwv zzb;

    public zzbwg(@NotNull InputStream inputStream, @NotNull zzbwv zzbwvVar) {
        inputStream.getClass();
        zzbwvVar.getClass();
        this.zza = inputStream;
        this.zzb = zzbwvVar;
    }

    @Override // com.google.android.libraries.places.internal.zzbws, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.zza.close();
    }

    @NotNull
    public final String toString() {
        return "source(" + this.zza + ")";
    }

    @Override // com.google.android.libraries.places.internal.zzbws
    public final long zza(@NotNull zzbwb zzbwbVar, long j) throws IOException {
        zzbwbVar.getClass();
        try {
            zzbwv.zzb();
            zzbwn zzbwnVarZzB = zzbwbVar.zzB(1);
            int i = this.zza.read(zzbwnVarZzB.zzb, zzbwnVarZzB.zzd, (int) Math.min(j, 8192 - zzbwnVarZzB.zzd));
            if (i != -1) {
                zzbwnVarZzB.zzd += i;
                long j2 = i;
                zzbwbVar.zzE(zzbwbVar.zzg() + j2);
                return j2;
            }
            if (zzbwnVarZzB.zzc != zzbwnVarZzB.zzd) {
                return -1L;
            }
            zzbwbVar.zza = zzbwnVarZzB.zza();
            zzbwo.zzb(zzbwnVarZzB);
            return -1L;
        } catch (AssertionError e) {
            if (zzbwi.zza(e)) {
                throw new IOException(e);
            }
            throw e;
        }
    }
}
