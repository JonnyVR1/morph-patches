package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import p153l.gjx0;
import p153l.jgx0;
import p153l.ogx0;
import p153l.pgx0;
import p153l.wgx0;

/* JADX INFO: loaded from: classes6.dex */
class zzgyh extends zzgyg {
    protected final byte[] zza;

    public zzgyh(byte[] bArr) {
        bArr.getClass();
        this.zza = bArr;
    }

    @Override // com.google.android.gms.internal.ads.zzgyl
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzgyl) || zzd() != ((zzgyl) obj).zzd()) {
            return false;
        }
        if (zzd() == 0) {
            return true;
        }
        if (!(obj instanceof zzgyh)) {
            return obj.equals(this);
        }
        zzgyh zzgyhVar = (zzgyh) obj;
        int iZzr = zzr();
        int iZzr2 = zzgyhVar.zzr();
        if (iZzr == 0 || iZzr2 == 0 || iZzr == iZzr2) {
            return zzg(zzgyhVar, 0, zzd());
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzgyl
    public byte zza(int i) {
        return this.zza[i];
    }

    @Override // com.google.android.gms.internal.ads.zzgyl
    public byte zzb(int i) {
        return this.zza[i];
    }

    public int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzgyl
    public int zzd() {
        return this.zza.length;
    }

    @Override // com.google.android.gms.internal.ads.zzgyl
    public void zze(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.zza, i, bArr, i2, i3);
    }

    @Override // com.google.android.gms.internal.ads.zzgyg
    public final boolean zzg(zzgyl zzgylVar, int i, int i2) {
        if (i2 > zzgylVar.zzd()) {
            pgx0.m172284a(i2, zzd());
            return false;
        }
        int i3 = i + i2;
        if (i3 > zzgylVar.zzd()) {
            ogx0.m167668a(i, i2, zzgylVar.zzd());
            return false;
        }
        if (!(zzgylVar instanceof zzgyh)) {
            return zzgylVar.zzk(i, i3).equals(zzk(0, i2));
        }
        zzgyh zzgyhVar = (zzgyh) zzgylVar;
        byte[] bArr = this.zza;
        byte[] bArr2 = zzgyhVar.zza;
        int iZzc = zzc() + i2;
        int iZzc2 = zzc();
        int iZzc3 = zzgyhVar.zzc() + i;
        while (iZzc2 < iZzc) {
            if (bArr[iZzc2] != bArr2[iZzc3]) {
                return false;
            }
            iZzc2++;
            iZzc3++;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzgyl
    public final int zzi(int i, int i2, int i3) {
        return gjx0.m130563b(i, this.zza, zzc() + i2, i3);
    }

    @Override // com.google.android.gms.internal.ads.zzgyl
    public final int zzj(int i, int i2, int i3) {
        int iZzc = zzc() + i2;
        return C2317y5.m13552f(i, this.zza, iZzc, i3 + iZzc);
    }

    @Override // com.google.android.gms.internal.ads.zzgyl
    public final zzgyl zzk(int i, int i2) {
        int iZzq = zzgyl.zzq(i, i2, zzd());
        return iZzq == 0 ? zzgyl.zzb : new zzgye(this.zza, zzc() + i, iZzq);
    }

    @Override // com.google.android.gms.internal.ads.zzgyl
    public final wgx0 zzl() {
        return wgx0.m206329h(this.zza, zzc(), zzd(), true);
    }

    @Override // com.google.android.gms.internal.ads.zzgyl
    public final String zzm(Charset charset) {
        return new String(this.zza, zzc(), zzd(), charset);
    }

    @Override // com.google.android.gms.internal.ads.zzgyl
    public final ByteBuffer zzn() {
        return ByteBuffer.wrap(this.zza, zzc(), zzd()).asReadOnlyBuffer();
    }

    @Override // com.google.android.gms.internal.ads.zzgyl
    public final void zzo(jgx0 jgx0Var) throws IOException {
        jgx0Var.mo12965a(this.zza, zzc(), zzd());
    }

    @Override // com.google.android.gms.internal.ads.zzgyl
    public final boolean zzp() {
        int iZzc = zzc();
        return C2317y5.m13556j(this.zza, iZzc, zzd() + iZzc);
    }
}
