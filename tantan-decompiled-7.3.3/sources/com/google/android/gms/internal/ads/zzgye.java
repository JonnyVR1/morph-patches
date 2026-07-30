package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes6.dex */
final class zzgye extends zzgyh {
    private final int zzc;
    private final int zzd;

    public zzgye(byte[] bArr, int i, int i2) {
        super(bArr);
        zzgyl.zzq(i, i + i2, bArr.length);
        this.zzc = i;
        this.zzd = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzgyh, com.google.android.gms.internal.ads.zzgyl
    public final byte zza(int i) {
        zzgyl.zzy(i, this.zzd);
        return this.zza[this.zzc + i];
    }

    @Override // com.google.android.gms.internal.ads.zzgyh, com.google.android.gms.internal.ads.zzgyl
    public final byte zzb(int i) {
        return this.zza[this.zzc + i];
    }

    @Override // com.google.android.gms.internal.ads.zzgyh
    public final int zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgyh, com.google.android.gms.internal.ads.zzgyl
    public final int zzd() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzgyh, com.google.android.gms.internal.ads.zzgyl
    public final void zze(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.zza, this.zzc + i, bArr, i2, i3);
    }
}
