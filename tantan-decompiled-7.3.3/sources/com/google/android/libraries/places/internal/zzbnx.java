package com.google.android.libraries.places.internal;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.InvalidMarkException;

/* JADX INFO: loaded from: classes7.dex */
final class zzbnx extends zzbeg {
    int zza;
    final int zzb;
    final byte[] zzc;
    int zzd = -1;

    public zzbnx(byte[] bArr, int i, int i2) {
        zzmt.zzf(i >= 0, "offset must be >= 0");
        zzmt.zzf(i2 >= 0, "length must be >= 0");
        int i3 = i2 + i;
        zzmt.zzf(i3 <= 0, "offset + length exceeds array boundary");
        this.zzc = bArr;
        this.zza = i;
        this.zzb = i3;
    }

    @Override // com.google.android.libraries.places.internal.zzbeg, com.google.android.libraries.places.internal.zzbnv
    public final void zzb() {
        this.zzd = this.zza;
    }

    @Override // com.google.android.libraries.places.internal.zzbeg, com.google.android.libraries.places.internal.zzbnv
    public final void zzc() {
        int i = this.zzd;
        if (i == -1) {
            throw new InvalidMarkException();
        }
        this.zza = i;
    }

    @Override // com.google.android.libraries.places.internal.zzbeg, com.google.android.libraries.places.internal.zzbnv
    public final boolean zzd() {
        return true;
    }

    @Override // com.google.android.libraries.places.internal.zzbnv
    public final int zze() {
        zza(1);
        int i = this.zza;
        this.zza = i + 1;
        return this.zzc[i] & 255;
    }

    @Override // com.google.android.libraries.places.internal.zzbnv
    public final int zzf() {
        return this.zzb - this.zza;
    }

    @Override // com.google.android.libraries.places.internal.zzbnv
    public final /* bridge */ /* synthetic */ zzbnv zzg(int i) {
        zza(i);
        int i2 = this.zza;
        this.zza = i2 + i;
        return new zzbnx(this.zzc, i2, i);
    }

    @Override // com.google.android.libraries.places.internal.zzbnv
    public final void zzi(ByteBuffer byteBuffer) {
        zzmt.zzc(byteBuffer, "dest");
        int iRemaining = byteBuffer.remaining();
        zza(iRemaining);
        byteBuffer.put(this.zzc, this.zza, iRemaining);
        this.zza += iRemaining;
    }

    @Override // com.google.android.libraries.places.internal.zzbnv
    public final void zzj(OutputStream outputStream, int i) throws IOException {
        zza(i);
        outputStream.write(this.zzc, this.zza, i);
        this.zza += i;
    }

    @Override // com.google.android.libraries.places.internal.zzbnv
    public final void zzk(byte[] bArr, int i, int i2) {
        System.arraycopy(this.zzc, this.zza, bArr, i, i2);
        this.zza += i2;
    }

    @Override // com.google.android.libraries.places.internal.zzbnv
    public final void zzl(int i) {
        zza(i);
        this.zza += i;
    }
}
