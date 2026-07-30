package com.google.android.libraries.places.internal;

import java.io.EOFException;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import p153l.bqg0;
import p153l.kym;

/* JADX INFO: loaded from: classes7.dex */
final class zzbsl extends zzbeg {
    private final zzbwb zza;

    public zzbsl(zzbwb zzbwbVar) {
        this.zza = zzbwbVar;
    }

    @Override // com.google.android.libraries.places.internal.zzbeg, com.google.android.libraries.places.internal.zzbnv, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws EOFException {
        zzbwb zzbwbVar = this.zza;
        zzbwbVar.zzF(zzbwbVar.zzg());
    }

    @Override // com.google.android.libraries.places.internal.zzbnv
    public final int zze() {
        try {
            return this.zza.zzc() & 255;
        } catch (EOFException e) {
            kym.m151996a(e.getMessage());
            return 0;
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbnv
    public final int zzf() {
        return (int) this.zza.zzg();
    }

    @Override // com.google.android.libraries.places.internal.zzbnv
    public final zzbnv zzg(int i) {
        zzbwb zzbwbVar = new zzbwb();
        zzbwbVar.zzn(this.zza, i);
        return new zzbsl(zzbwbVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbnv
    public final void zzi(ByteBuffer byteBuffer) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.libraries.places.internal.zzbnv
    public final void zzj(OutputStream outputStream, int i) throws IOException {
        this.zza.zzr(outputStream, i);
    }

    @Override // com.google.android.libraries.places.internal.zzbnv
    public final void zzk(byte[] bArr, int i, int i2) {
        while (i2 > 0) {
            int iZzd = this.zza.zzd(bArr, i, i2);
            if (iZzd == -1) {
                bqg0.m105918a("EOF trying to read ", i2, " bytes");
                return;
            } else {
                i2 -= iZzd;
                i += iZzd;
            }
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbnv
    public final void zzl(int i) {
        try {
            this.zza.zzF(i);
        } catch (EOFException e) {
            kym.m151996a(e.getMessage());
        }
    }
}
