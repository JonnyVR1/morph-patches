package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import p149l.aax0;
import p149l.d7x0;
import p149l.i7x0;
import p149l.j7x0;
import p149l.q7x0;

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
            j7x0.m140122a(i2, zzd());
            return false;
        }
        int i3 = i + i2;
        if (i3 > zzgylVar.zzd()) {
            i7x0.m134926a(i, i2, zzgylVar.zzd());
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
        return aax0.m95574b(i, this.zza, zzc() + i2, i3);
    }

    @Override // com.google.android.gms.internal.ads.zzgyl
    public final int zzj(int i, int i2, int i3) {
        int iZzc = zzc() + i2;
        return C2294y5.m13498f(i, this.zza, iZzc, i3 + iZzc);
    }

    @Override // com.google.android.gms.internal.ads.zzgyl
    public final zzgyl zzk(int i, int i2) {
        int iZzq = zzgyl.zzq(i, i2, zzd());
        return iZzq == 0 ? zzgyl.zzb : new zzgye(this.zza, zzc() + i, iZzq);
    }

    @Override // com.google.android.gms.internal.ads.zzgyl
    public final q7x0 zzl() {
        return q7x0.m173315h(this.zza, zzc(), zzd(), true);
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
    public final void zzo(d7x0 d7x0Var) throws IOException {
        d7x0Var.mo12911a(this.zza, zzc(), zzd());
    }

    @Override // com.google.android.gms.internal.ads.zzgyl
    public final boolean zzp() {
        int iZzc = zzc();
        return C2294y5.m13502j(this.zza, iZzc, zzd() + iZzc);
    }
}
