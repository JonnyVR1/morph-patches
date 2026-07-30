package com.google.android.gms.internal.measurement;

import p153l.qr3;
import p153l.rr3;

/* JADX INFO: loaded from: classes6.dex */
final class zzio extends zziv {
    private final int zzc;
    private final int zzd;

    public zzio(byte[] bArr, int i, int i2) {
        super(bArr);
        zzik.zza(i, i + i2, bArr.length);
        this.zzc = i;
        this.zzd = i2;
    }

    @Override // com.google.android.gms.internal.measurement.zziv, com.google.android.gms.internal.measurement.zzik
    public final byte zza(int i) {
        int iZzb = zzb();
        if (((iZzb - (i + 1)) | i) >= 0) {
            return this.zzb[this.zzc + i];
        }
        if (i < 0) {
            qr3.m177532a(i);
            return (byte) 0;
        }
        rr3.m182687a(i, iZzb);
        return (byte) 0;
    }

    @Override // com.google.android.gms.internal.measurement.zziv, com.google.android.gms.internal.measurement.zzik
    public final byte zzb(int i) {
        return this.zzb[this.zzc + i];
    }

    @Override // com.google.android.gms.internal.measurement.zziv
    public final int zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.measurement.zziv, com.google.android.gms.internal.measurement.zzik
    public final int zzb() {
        return this.zzd;
    }
}
