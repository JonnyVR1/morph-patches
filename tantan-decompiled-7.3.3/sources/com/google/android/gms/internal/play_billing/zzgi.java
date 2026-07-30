package com.google.android.gms.internal.play_billing;

import java.io.IOException;
import p153l.dpq0;
import p153l.pgx0;
import p153l.srx0;
import p153l.ysw0;

/* JADX INFO: loaded from: classes6.dex */
class zzgi extends zzgh {
    protected final byte[] zza;

    public zzgi(byte[] bArr) {
        super(null);
        bArr.getClass();
        this.zza = bArr;
    }

    @Override // com.google.android.gms.internal.play_billing.zzgk
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzgk) || zzd() != ((zzgk) obj).zzd()) {
            return false;
        }
        if (zzd() == 0) {
            return true;
        }
        if (!(obj instanceof zzgi)) {
            return obj.equals(this);
        }
        zzgi zzgiVar = (zzgi) obj;
        int iZzi = zzi();
        int iZzi2 = zzgiVar.zzi();
        if (iZzi != 0 && iZzi2 != 0 && iZzi != iZzi2) {
            return false;
        }
        int iZzd = zzd();
        if (iZzd > zzgiVar.zzd()) {
            pgx0.m172284a(iZzd, zzd());
            return false;
        }
        if (iZzd > zzgiVar.zzd()) {
            dpq0.m117417a("Ran off end of other: 0, ", iZzd, ", ", zzgiVar.zzd());
            return false;
        }
        byte[] bArr = this.zza;
        byte[] bArr2 = zzgiVar.zza;
        zzgiVar.zzc();
        int i = 0;
        int i2 = 0;
        while (i < iZzd) {
            if (bArr[i] != bArr2[i2]) {
                return false;
            }
            i++;
            i2++;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.play_billing.zzgk
    public byte zza(int i) {
        return this.zza[i];
    }

    @Override // com.google.android.gms.internal.play_billing.zzgk
    public byte zzb(int i) {
        return this.zza[i];
    }

    public int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.play_billing.zzgk
    public int zzd() {
        return this.zza.length;
    }

    @Override // com.google.android.gms.internal.play_billing.zzgk
    public final int zze(int i, int i2, int i3) {
        return srx0.m187641b(i, this.zza, 0, i3);
    }

    @Override // com.google.android.gms.internal.play_billing.zzgk
    public final zzgk zzf(int i, int i2) {
        int iZzh = zzgk.zzh(0, i2, zzd());
        return iZzh == 0 ? zzgk.zzb : new zzgf(this.zza, 0, iZzh);
    }

    @Override // com.google.android.gms.internal.play_billing.zzgk
    public final void zzg(ysw0 ysw0Var) throws IOException {
        ((C2446z) ysw0Var).m15023C(this.zza, 0, zzd());
    }
}
