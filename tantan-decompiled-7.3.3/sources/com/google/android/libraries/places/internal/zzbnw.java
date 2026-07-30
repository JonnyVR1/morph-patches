package com.google.android.libraries.places.internal;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes7.dex */
final class zzbnw extends InputStream implements zzbav {
    private final zzbnv zza;

    public zzbnw(zzbnv zzbnvVar) {
        zzmt.zzc(zzbnvVar, "buffer");
        this.zza = zzbnvVar;
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        return this.zza.zzf();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.zza.close();
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        this.zza.zzb();
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return this.zza.zzd();
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (this.zza.zzf() == 0) {
            return -1;
        }
        int iMin = Math.min(this.zza.zzf(), i2);
        this.zza.zzk(bArr, i, iMin);
        return iMin;
    }

    @Override // java.io.InputStream
    public final void reset() throws IOException {
        this.zza.zzc();
    }

    @Override // java.io.InputStream
    public final long skip(long j) throws IOException {
        int iMin = (int) Math.min(this.zza.zzf(), j);
        this.zza.zzl(iMin);
        return iMin;
    }

    @Override // java.io.InputStream
    public final int read() {
        if (this.zza.zzf() == 0) {
            return -1;
        }
        return this.zza.zze();
    }
}
