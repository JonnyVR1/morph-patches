package com.google.android.libraries.places.internal;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.eclipse.jetty.http.HttpTokens;
import p149l.juq0;
import p149l.qkq0;
import p149l.rhg0;

/* JADX INFO: loaded from: classes7.dex */
final class zzbtu {
    zzbtt[] zza;
    int zzb;
    private final zzbwd zzf;
    private final List zze = new ArrayList();
    int zzc = 0;
    int zzd = 0;
    private int zzg = 4096;
    private int zzh = 4096;

    public zzbtu(int i, int i2, zzbws zzbwsVar) {
        zzbtt[] zzbttVarArr = new zzbtt[8];
        this.zza = zzbttVarArr;
        this.zzb = zzbttVarArr.length - 1;
        this.zzf = zzbwh.zzb(zzbwsVar);
    }

    private final int zzf(int i) {
        return this.zzb + 1 + i;
    }

    private final int zzg(int i) {
        int i2;
        int i3 = 0;
        if (i > 0) {
            int length = this.zza.length;
            while (true) {
                length--;
                i2 = this.zzb;
                if (length < i2 || i <= 0) {
                    break;
                }
                int i4 = this.zza[length].zzj;
                i -= i4;
                this.zzd -= i4;
                this.zzc--;
                i3++;
            }
            zzbtt[] zzbttVarArr = this.zza;
            int i5 = i2 + 1;
            System.arraycopy(zzbttVarArr, i5, zzbttVarArr, i5 + i3, this.zzc);
            this.zzb += i3;
        }
        return i3;
    }

    private final int zzh() throws IOException {
        return this.zzf.zzc() & 255;
    }

    private final zzbwf zzi(int i) throws IOException {
        if (zzm(i)) {
            return zzbtw.zzb[i].zzh;
        }
        int length = zzbtw.zzb.length;
        int iZzf = zzf(i - 61);
        if (iZzf >= 0) {
            zzbtt[] zzbttVarArr = this.zza;
            if (iZzf < zzbttVarArr.length) {
                return zzbttVarArr[iZzf].zzh;
            }
        }
        juq0.m143339a("Header index too large ", i + 1);
        return null;
    }

    private final void zzj() {
        int i = this.zzh;
        int i2 = this.zzd;
        if (i < i2) {
            if (i == 0) {
                zzk();
            } else {
                zzg(i2 - i);
            }
        }
    }

    private final void zzk() {
        Arrays.fill(this.zza, (Object) null);
        this.zzb = this.zza.length - 1;
        this.zzc = 0;
        this.zzd = 0;
    }

    private final void zzl(int i, zzbtt zzbttVar) {
        this.zze.add(zzbttVar);
        int i2 = zzbttVar.zzj;
        int i3 = this.zzh;
        if (i2 > i3) {
            zzk();
            return;
        }
        zzg((this.zzd + i2) - i3);
        int i4 = this.zzc + 1;
        zzbtt[] zzbttVarArr = this.zza;
        int length = zzbttVarArr.length;
        if (i4 > length) {
            zzbtt[] zzbttVarArr2 = new zzbtt[length + length];
            System.arraycopy(zzbttVarArr, 0, zzbttVarArr2, length, length);
            this.zzb = this.zza.length - 1;
            this.zza = zzbttVarArr2;
        }
        int i5 = this.zzb;
        this.zzb = i5 - 1;
        this.zza[i5] = zzbttVar;
        this.zzc++;
        this.zzd += i2;
    }

    private static final boolean zzm(int i) {
        if (i < 0) {
            return false;
        }
        int length = zzbtw.zzb.length;
        return i <= 60;
    }

    public final int zza(int i, int i2) throws IOException {
        int i3 = i & i2;
        if (i3 < i2) {
            return i3;
        }
        int i4 = 0;
        while (true) {
            int iZzh = zzh();
            if ((iZzh & 128) == 0) {
                return i2 + (iZzh << i4);
            }
            i2 += (iZzh & 127) << i4;
            i4 += 7;
        }
    }

    public final List zzb() {
        ArrayList arrayList = new ArrayList(this.zze);
        this.zze.clear();
        return arrayList;
    }

    public final zzbwf zzc() throws IOException {
        int iZzh = zzh();
        int i = iZzh & 128;
        long jZza = zza(iZzh, 127);
        zzbwd zzbwdVar = this.zzf;
        if (i != 128) {
            return zzbwdVar.zzy(jZza);
        }
        zzbud zzbudVarZza = zzbud.zza();
        zzbwl zzbwlVar = (zzbwl) zzbwdVar;
        zzbwlVar.zzD(jZza);
        byte[] bArrZzb = zzbudVarZza.zzb(zzbwlVar.zzb.zzH(jZza));
        zzbwe zzbweVar = zzbwf.zza;
        return zzbwe.zzb(bArrZzb);
    }

    public final void zzd(int i) {
        this.zzg = i;
        this.zzh = i;
        zzj();
    }

    public final void zze() throws IOException {
        while (true) {
            zzbwl zzbwlVar = (zzbwl) this.zzf;
            if (zzbwlVar.zzc) {
                qkq0.m175383a("closed");
                return;
            }
            zzbwb zzbwbVar = zzbwlVar.zzb;
            if (zzbwbVar.zzG() && zzbwlVar.zza.zza(zzbwbVar, 8192L) == -1) {
                return;
            }
            byte bZzc = this.zzf.zzc();
            int i = bZzc & 255;
            if (i == 128) {
                rhg0.m179353a("index == 0");
                return;
            }
            if ((bZzc & 128) == 128) {
                int iZza = zza(i, 127);
                int i2 = iZza - 1;
                if (!zzm(i2)) {
                    int length = zzbtw.zzb.length;
                    int iZzf = zzf(iZza - 62);
                    if (iZzf >= 0) {
                        zzbtt[] zzbttVarArr = this.zza;
                        if (iZzf <= zzbttVarArr.length - 1) {
                            this.zze.add(zzbttVarArr[iZzf]);
                        }
                    }
                    juq0.m143339a("Header index too large ", iZza);
                    return;
                }
                this.zze.add(zzbtw.zzb[i2]);
            } else if (i == 64) {
                zzbwf zzbwfVarZzc = zzc();
                zzbtw.zzc(zzbwfVarZzc);
                zzl(-1, new zzbtt(zzbwfVarZzc, zzc()));
            } else if ((bZzc & 64) == 64) {
                zzl(-1, new zzbtt(zzi(zza(i, 63) - 1), zzc()));
            } else if ((bZzc & HttpTokens.SPACE) == 32) {
                int iZza2 = zza(i, 31);
                this.zzh = iZza2;
                if (iZza2 < 0 || iZza2 > this.zzg) {
                    juq0.m143339a("Invalid dynamic table size update ", iZza2);
                    return;
                }
                zzj();
            } else if (i == 16 || i == 0) {
                zzbwf zzbwfVarZzc2 = zzc();
                zzbtw.zzc(zzbwfVarZzc2);
                this.zze.add(new zzbtt(zzbwfVarZzc2, zzc()));
            } else {
                this.zze.add(new zzbtt(zzi(zza(i, 15) - 1), zzc()));
            }
        }
    }
}
