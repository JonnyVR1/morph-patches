package com.google.android.libraries.places.internal;

import java.io.OutputStream;

/* JADX INFO: loaded from: classes7.dex */
final class zzbmu extends OutputStream {
    final /* synthetic */ zzbmw zza;

    public /* synthetic */ zzbmu(zzbmw zzbmwVar, zzbmt zzbmtVar) {
        this.zza = zzbmwVar;
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        this.zza.zzk(new byte[]{(byte) i}, 0, 1);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        this.zza.zzk(bArr, i, i2);
    }
}
