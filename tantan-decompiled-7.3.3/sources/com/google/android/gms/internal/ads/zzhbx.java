package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.Api;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import p153l.hjx0;
import p153l.jgx0;
import p153l.ngx0;
import p153l.skx0;
import p153l.wgx0;
import p153l.wpg0;

/* JADX INFO: loaded from: classes6.dex */
final class zzhbx extends zzgyl {
    static final int[] zza = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Api.BaseClientBuilder.API_PRIORITY_OTHER};
    private final int zzc;
    private final zzgyl zzd;
    private final zzgyl zze;
    private final int zzf;
    private final int zzg;

    private zzhbx(zzgyl zzgylVar, zzgyl zzgylVar2) {
        this.zzd = zzgylVar;
        this.zze = zzgylVar2;
        int iZzd = zzgylVar.zzd();
        this.zzf = iZzd;
        this.zzc = iZzd + zzgylVar2.zzd();
        this.zzg = Math.max(zzgylVar.zzf(), zzgylVar2.zzf()) + 1;
    }

    public static zzgyl zzC(zzgyl zzgylVar, zzgyl zzgylVar2) {
        if (zzgylVar2.zzd() == 0) {
            return zzgylVar;
        }
        if (zzgylVar.zzd() == 0) {
            return zzgylVar2;
        }
        int iZzd = zzgylVar.zzd() + zzgylVar2.zzd();
        if (iZzd < 128) {
            return zzD(zzgylVar, zzgylVar2);
        }
        if (zzgylVar instanceof zzhbx) {
            zzhbx zzhbxVar = (zzhbx) zzgylVar;
            if (zzhbxVar.zze.zzd() + zzgylVar2.zzd() < 128) {
                return new zzhbx(zzhbxVar.zzd, zzD(zzhbxVar.zze, zzgylVar2));
            }
            if (zzhbxVar.zzd.zzf() > zzhbxVar.zze.zzf() && zzhbxVar.zzg > zzgylVar2.zzf()) {
                return new zzhbx(zzhbxVar.zzd, new zzhbx(zzhbxVar.zze, zzgylVar2));
            }
        }
        return iZzd >= zzc(Math.max(zzgylVar.zzf(), zzgylVar2.zzf()) + 1) ? new zzhbx(zzgylVar, zzgylVar2) : C2293v5.m13435a(new C2293v5(null), zzgylVar, zzgylVar2);
    }

    private static zzgyl zzD(zzgyl zzgylVar, zzgyl zzgylVar2) {
        int iZzd = zzgylVar.zzd();
        int iZzd2 = zzgylVar2.zzd();
        byte[] bArr = new byte[iZzd + iZzd2];
        zzgylVar.zzz(bArr, 0, 0, iZzd);
        zzgylVar2.zzz(bArr, 0, iZzd, iZzd2);
        return new zzgyh(bArr);
    }

    public static int zzc(int i) {
        int[] iArr = zza;
        int length = iArr.length;
        return i >= 47 ? Api.BaseClientBuilder.API_PRIORITY_OTHER : iArr[i];
    }

    @Override // com.google.android.gms.internal.ads.zzgyl
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzgyl)) {
            return false;
        }
        zzgyl zzgylVar = (zzgyl) obj;
        if (this.zzc != zzgylVar.zzd()) {
            return false;
        }
        if (this.zzc == 0) {
            return true;
        }
        int iZzr = zzr();
        int iZzr2 = zzgylVar.zzr();
        if (iZzr != 0 && iZzr2 != 0 && iZzr != iZzr2) {
            return false;
        }
        skx0 skx0Var = null;
        C2301w5 c2301w5 = new C2301w5(this, skx0Var);
        zzgyg zzgygVarM13488a = c2301w5.next();
        C2301w5 c2301w6 = new C2301w5(zzgylVar, skx0Var);
        zzgyg zzgygVarM13488a2 = c2301w6.next();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int iZzd = zzgygVarM13488a.zzd() - i;
            int iZzd2 = zzgygVarM13488a2.zzd() - i2;
            int iMin = Math.min(iZzd, iZzd2);
            if (!(i == 0 ? zzgygVarM13488a.zzg(zzgygVarM13488a2, i2, iMin) : zzgygVarM13488a2.zzg(zzgygVarM13488a, i, iMin))) {
                return false;
            }
            i3 += iMin;
            int i4 = this.zzc;
            if (i3 >= i4) {
                if (i3 == i4) {
                    return true;
                }
                wpg0.m207458a();
                return false;
            }
            if (iMin == iZzd) {
                zzgygVarM13488a = c2301w5.next();
                i = 0;
            } else {
                i += iMin;
            }
            if (iMin == iZzd2) {
                zzgygVarM13488a = zzgygVarM13488a;
                zzgygVarM13488a2 = c2301w6.next();
                i2 = 0;
            } else {
                zzgygVarM13488a = zzgygVarM13488a;
                i2 += iMin;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgyl, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new C2285u5(this);
    }

    @Override // com.google.android.gms.internal.ads.zzgyl
    public final byte zza(int i) {
        zzgyl.zzy(i, this.zzc);
        return zzb(i);
    }

    @Override // com.google.android.gms.internal.ads.zzgyl
    public final byte zzb(int i) {
        int i2 = this.zzf;
        return i < i2 ? this.zzd.zzb(i) : this.zze.zzb(i - i2);
    }

    @Override // com.google.android.gms.internal.ads.zzgyl
    public final int zzd() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgyl
    public final void zze(byte[] bArr, int i, int i2, int i3) {
        int i4 = i + i3;
        int i5 = this.zzf;
        if (i4 <= i5) {
            this.zzd.zze(bArr, i, i2, i3);
        } else {
            if (i >= i5) {
                this.zze.zze(bArr, i - i5, i2, i3);
                return;
            }
            int i6 = i5 - i;
            this.zzd.zze(bArr, i, i2, i6);
            this.zze.zze(bArr, 0, i2 + i6, i3 - i6);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgyl
    public final int zzf() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzgyl
    public final boolean zzh() {
        return this.zzc >= zzc(this.zzg);
    }

    @Override // com.google.android.gms.internal.ads.zzgyl
    public final int zzi(int i, int i2, int i3) {
        int i4 = i2 + i3;
        int i5 = this.zzf;
        if (i4 <= i5) {
            return this.zzd.zzi(i, i2, i3);
        }
        if (i2 >= i5) {
            return this.zze.zzi(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return this.zze.zzi(this.zzd.zzi(i, i2, i6), 0, i3 - i6);
    }

    @Override // com.google.android.gms.internal.ads.zzgyl
    public final int zzj(int i, int i2, int i3) {
        int i4 = i2 + i3;
        int i5 = this.zzf;
        if (i4 <= i5) {
            return this.zzd.zzj(i, i2, i3);
        }
        if (i2 >= i5) {
            return this.zze.zzj(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return this.zze.zzj(this.zzd.zzj(i, i2, i6), 0, i3 - i6);
    }

    @Override // com.google.android.gms.internal.ads.zzgyl
    public final zzgyl zzk(int i, int i2) {
        int iZzq = zzgyl.zzq(i, i2, this.zzc);
        if (iZzq == 0) {
            return zzgyl.zzb;
        }
        if (iZzq == this.zzc) {
            return this;
        }
        int i3 = this.zzf;
        if (i2 <= i3) {
            return this.zzd.zzk(i, i2);
        }
        if (i >= i3) {
            return this.zze.zzk(i - i3, i2 - i3);
        }
        zzgyl zzgylVar = this.zzd;
        return new zzhbx(zzgylVar.zzk(i, zzgylVar.zzd()), this.zze.zzk(0, i2 - this.zzf));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzgyl
    public final wgx0 zzl() {
        ArrayList<ByteBuffer> arrayList = new ArrayList();
        Object[] objArr = 0;
        C2301w5 c2301w5 = new C2301w5(this, null);
        while (c2301w5.hasNext()) {
            arrayList.add(c2301w5.next().zzn());
        }
        int i = wgx0.f189068d;
        int i2 = 0;
        int iRemaining = 0;
        for (ByteBuffer byteBuffer : arrayList) {
            iRemaining += byteBuffer.remaining();
            i2 = byteBuffer.hasArray() ? i2 | 1 : byteBuffer.isDirect() ? i2 | 2 : i2 | 4;
        }
        return i2 == 2 ? new C2205k5(arrayList, iRemaining, true, objArr == true ? 1 : 0) : wgx0.m206328g(new hjx0(arrayList), 4096);
    }

    @Override // com.google.android.gms.internal.ads.zzgyl
    public final String zzm(Charset charset) {
        return new String(zzA(), charset);
    }

    @Override // com.google.android.gms.internal.ads.zzgyl
    public final ByteBuffer zzn() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzgyl
    public final void zzo(jgx0 jgx0Var) throws IOException {
        this.zzd.zzo(jgx0Var);
        this.zze.zzo(jgx0Var);
    }

    @Override // com.google.android.gms.internal.ads.zzgyl
    public final boolean zzp() {
        zzgyl zzgylVar = this.zzd;
        zzgyl zzgylVar2 = this.zze;
        return zzgylVar2.zzj(zzgylVar.zzj(0, 0, this.zzf), 0, zzgylVar2.zzd()) == 0;
    }

    @Override // com.google.android.gms.internal.ads.zzgyl
    /* JADX INFO: renamed from: zzs */
    public final ngx0 iterator() {
        return new C2285u5(this);
    }
}
