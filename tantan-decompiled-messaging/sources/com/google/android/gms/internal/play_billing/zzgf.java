package com.google.android.gms.internal.play_billing;

import p149l.rq3;
import p149l.sq3;

/* JADX INFO: loaded from: classes6.dex */
final class zzgf extends zzgi {
    private final int zzc;

    public zzgf(byte[] bArr, int i, int i2) {
        super(bArr);
        zzgk.zzh(0, i2, bArr.length);
        this.zzc = i2;
    }

    @Override // com.google.android.gms.internal.play_billing.zzgi, com.google.android.gms.internal.play_billing.zzgk
    public final byte zza(int i) {
        int i2 = this.zzc;
        if (((i2 - (i + 1)) | i) >= 0) {
            return ((zzgi) this).zza[i];
        }
        if (i < 0) {
            rq3.m180408a(i);
            return (byte) 0;
        }
        sq3.m185449a(i, i2);
        return (byte) 0;
    }

    @Override // com.google.android.gms.internal.play_billing.zzgi, com.google.android.gms.internal.play_billing.zzgk
    public final byte zzb(int i) {
        return ((zzgi) this).zza[i];
    }

    @Override // com.google.android.gms.internal.play_billing.zzgi
    public final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.play_billing.zzgi, com.google.android.gms.internal.play_billing.zzgk
    public final int zzd() {
        return this.zzc;
    }
}
