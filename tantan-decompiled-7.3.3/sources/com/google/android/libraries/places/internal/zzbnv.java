package com.google.android.libraries.places.internal;

import java.io.Closeable;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes7.dex */
public interface zzbnv extends Closeable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    void zzb();

    void zzc();

    boolean zzd();

    int zze();

    int zzf();

    zzbnv zzg(int i);

    void zzi(ByteBuffer byteBuffer);

    void zzj(OutputStream outputStream, int i) throws IOException;

    void zzk(byte[] bArr, int i, int i2);

    void zzl(int i);
}
