package com.google.android.libraries.places.internal;

import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p153l.mlk0;
import p153l.wtq0;

/* JADX INFO: loaded from: classes7.dex */
@SourceDebugExtension
public final class zzbwl implements zzbwd {

    @JvmField
    @NotNull
    public final zzbws zza;

    @JvmField
    @NotNull
    public final zzbwb zzb;

    @JvmField
    public boolean zzc;

    public zzbwl(@NotNull zzbws zzbwsVar) {
        zzbwsVar.getClass();
        this.zza = zzbwsVar;
        this.zzb = new zzbwb();
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable, com.google.android.libraries.places.internal.zzbws
    public final void close() throws IOException {
        if (this.zzc) {
            return;
        }
        this.zzc = true;
        this.zza.close();
        zzbwb zzbwbVar = this.zzb;
        zzbwbVar.zzF(zzbwbVar.zzg());
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.zzc;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(@NotNull ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        zzbwb zzbwbVar = this.zzb;
        if (zzbwbVar.zzg() == 0 && this.zza.zza(zzbwbVar, 8192L) == -1) {
            return -1;
        }
        return this.zzb.read(byteBuffer);
    }

    @NotNull
    public final String toString() {
        return "buffer(" + this.zza + ")";
    }

    @Override // com.google.android.libraries.places.internal.zzbwd
    public final void zzD(long j) throws EOFException {
        zzbwb zzbwbVar;
        if (j < 0) {
            mlk0.m158922a("byteCount < 0: ", j);
            return;
        }
        if (this.zzc) {
            wtq0.m207906a("closed");
            return;
        }
        do {
            zzbwbVar = this.zzb;
            if (zzbwbVar.zzg() >= j) {
                return;
            }
        } while (this.zza.zza(zzbwbVar, 8192L) != -1);
        throw new EOFException(null);
    }

    @Override // com.google.android.libraries.places.internal.zzbwd
    public final void zzF(long j) throws EOFException {
        if (this.zzc) {
            wtq0.m207906a("closed");
            return;
        }
        while (j > 0) {
            zzbwb zzbwbVar = this.zzb;
            if (zzbwbVar.zzg() == 0 && this.zza.zza(zzbwbVar, 8192L) == -1) {
                throw new EOFException(null);
            }
            long jMin = Math.min(j, this.zzb.zzg());
            this.zzb.zzF(jMin);
            j -= jMin;
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbws
    public final long zza(@NotNull zzbwb zzbwbVar, long j) {
        zzbwbVar.getClass();
        if (j < 0) {
            mlk0.m158922a("byteCount < 0: ", j);
            return 0L;
        }
        if (this.zzc) {
            wtq0.m207906a("closed");
            return 0L;
        }
        zzbwb zzbwbVar2 = this.zzb;
        if (zzbwbVar2.zzg() == 0 && this.zza.zza(zzbwbVar2, 8192L) == -1) {
            return -1L;
        }
        return this.zzb.zza(zzbwbVar, Math.min(j, this.zzb.zzg()));
    }

    @Override // com.google.android.libraries.places.internal.zzbwd
    public final byte zzc() throws EOFException {
        zzD(1L);
        return this.zzb.zzc();
    }

    @Override // com.google.android.libraries.places.internal.zzbwd
    public final int zze() throws EOFException {
        zzD(4L);
        return this.zzb.zze();
    }

    @Override // com.google.android.libraries.places.internal.zzbwd
    @NotNull
    public final zzbwf zzy(long j) throws EOFException {
        zzD(j);
        return this.zzb.zzy(j);
    }
}
