package com.google.android.libraries.places.internal;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
final class zzbtv {
    zzbtt[] zza;
    int zzb;
    private final zzbwb zzc;
    private int zzd;
    private int zze;

    public zzbtv(int i, boolean z, zzbwb zzbwbVar) {
        zzbtt[] zzbttVarArr = new zzbtt[8];
        this.zza = zzbttVarArr;
        this.zzd = zzbttVarArr.length - 1;
        this.zzc = zzbwbVar;
    }

    private final void zzd(zzbtt zzbttVar) {
        int i;
        int i2 = zzbttVar.zzj;
        if (i2 > 4096) {
            Arrays.fill(this.zza, (Object) null);
            this.zzd = this.zza.length - 1;
            this.zzb = 0;
            this.zze = 0;
            return;
        }
        int i3 = (this.zze + i2) - 4096;
        if (i3 > 0) {
            int length = this.zza.length - 1;
            int i4 = 0;
            while (true) {
                i = this.zzd;
                if (length < i || i3 <= 0) {
                    break;
                }
                int i5 = this.zza[length].zzj;
                i3 -= i5;
                this.zze -= i5;
                this.zzb--;
                i4++;
                length--;
            }
            zzbtt[] zzbttVarArr = this.zza;
            int i6 = i + 1;
            System.arraycopy(zzbttVarArr, i6, zzbttVarArr, i6 + i4, this.zzb);
            this.zzd += i4;
        }
        int i7 = this.zzb + 1;
        zzbtt[] zzbttVarArr2 = this.zza;
        int length2 = zzbttVarArr2.length;
        if (i7 > length2) {
            zzbtt[] zzbttVarArr3 = new zzbtt[length2 + length2];
            System.arraycopy(zzbttVarArr2, 0, zzbttVarArr3, length2, length2);
            this.zzd = this.zza.length - 1;
            this.zza = zzbttVarArr3;
        }
        int i8 = this.zzd;
        this.zzd = i8 - 1;
        this.zza[i8] = zzbttVar;
        this.zzb++;
        this.zze += i2;
    }

    public final void zza(zzbwf zzbwfVar) throws IOException {
        zzc(zzbwfVar.zzc(), 127, 0);
        this.zzc.zzk(zzbwfVar);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0053  */
    public final void zzb(List list) throws IOException {
        int i;
        int i2;
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            zzbtt zzbttVar = (zzbtt) list.get(i3);
            zzbwf zzbwfVarZzg = zzbttVar.zzh.zzg();
            zzbwf zzbwfVar = zzbttVar.zzi;
            Integer num = (Integer) zzbtw.zzc.get(zzbwfVarZzg);
            if (num != null) {
                int iIntValue = num.intValue();
                i2 = iIntValue + 1;
                if (i2 < 2 || i2 > 7) {
                    i = i2;
                    i2 = -1;
                } else if (zzbtw.zzb[iIntValue].zzi.equals(zzbwfVar)) {
                    i = i2;
                } else if (zzbtw.zzb[i2].zzi.equals(zzbwfVar)) {
                    i2 = iIntValue + 2;
                    i = i2;
                } else {
                    i = i2;
                    i2 = -1;
                }
            } else {
                i = -1;
                i2 = -1;
            }
            if (i2 == -1) {
                int i4 = this.zzd;
                while (true) {
                    i4++;
                    zzbtt[] zzbttVarArr = this.zza;
                    if (i4 >= zzbttVarArr.length) {
                        i2 = -1;
                        break;
                    }
                    if (zzbttVarArr[i4].zzh.equals(zzbwfVarZzg)) {
                        if (this.zza[i4].zzi.equals(zzbwfVar)) {
                            int i5 = i4 - this.zzd;
                            int length = zzbtw.zzb.length;
                            i2 = i5 + 61;
                            break;
                        } else if (i == -1) {
                            int i6 = i4 - this.zzd;
                            int length2 = zzbtw.zzb.length;
                            i = i6 + 61;
                        }
                    }
                }
            }
            if (i2 != -1) {
                zzc(i2, 127, 128);
            } else if (i == -1) {
                this.zzc.zzm(64);
                zza(zzbwfVarZzg);
                zza(zzbwfVar);
                zzd(zzbttVar);
            } else if (!zzbwfVarZzg.zzm(zzbtw.zza) || zzbtt.zze.equals(zzbwfVarZzg)) {
                zzc(i, 63, 64);
                zza(zzbwfVar);
                zzd(zzbttVar);
            } else {
                zzc(i, 15, 0);
                zza(zzbwfVar);
            }
        }
    }

    public final void zzc(int i, int i2, int i3) throws IOException {
        zzbwb zzbwbVar = this.zzc;
        if (i < i2) {
            zzbwbVar.zzm(i3 | i);
            return;
        }
        zzbwbVar.zzm(i3 | i2);
        int i4 = i - i2;
        while (true) {
            zzbwb zzbwbVar2 = this.zzc;
            if (i4 < 128) {
                zzbwbVar2.zzm(i4);
                return;
            } else {
                zzbwbVar2.zzm(128 | (i4 & 127));
                i4 >>>= 7;
            }
        }
    }
}
