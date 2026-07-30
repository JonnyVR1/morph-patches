package com.google.android.libraries.places.internal;

import p153l.qr3;
import p153l.rr3;

/* JADX INFO: loaded from: classes7.dex */
final class zzasd extends zzash {
    private final int zzc;

    public zzasd(byte[] bArr, int i, int i2) {
        super(bArr);
        zzask.zzj(0, i2, bArr.length);
        this.zzc = i2;
    }

    @Override // com.google.android.libraries.places.internal.zzash, com.google.android.libraries.places.internal.zzask
    public final byte zza(int i) {
        int i2 = this.zzc;
        if (((i2 - (i + 1)) | i) >= 0) {
            return this.zza[i];
        }
        if (i < 0) {
            qr3.m177532a(i);
            return (byte) 0;
        }
        rr3.m182687a(i, i2);
        return (byte) 0;
    }

    @Override // com.google.android.libraries.places.internal.zzash, com.google.android.libraries.places.internal.zzask
    public final byte zzb(int i) {
        return this.zza[i];
    }

    @Override // com.google.android.libraries.places.internal.zzash
    public final int zzc() {
        return 0;
    }

    @Override // com.google.android.libraries.places.internal.zzash, com.google.android.libraries.places.internal.zzask
    public final int zzd() {
        return this.zzc;
    }
}
