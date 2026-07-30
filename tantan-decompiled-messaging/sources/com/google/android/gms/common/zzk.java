package com.google.android.gms.common;

import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
final class zzk extends zzj {
    private final byte[] zza;

    public zzk(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.zza = bArr;
    }

    @Override // com.google.android.gms.common.zzj
    public final byte[] zzf() {
        return this.zza;
    }
}
