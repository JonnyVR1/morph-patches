package com.google.android.gms.internal.play_billing;

import java.io.Serializable;
import p149l.ig3;
import p149l.m5s0;

/* JADX INFO: loaded from: classes6.dex */
public final class zzdh extends zzdi implements Serializable {
    public static final /* synthetic */ int zzc = 0;
    private static final zzdh zzd = new zzdh(zzcd.zzb, zzcb.zzb);
    final zzce zza;
    final zzce zzb;

    private zzdh(zzce zzceVar, zzce zzceVar2) {
        this.zza = zzceVar;
        this.zzb = zzceVar2;
        if (zzceVar.compareTo(zzceVar2) > 0 || zzceVar == zzcb.zzb || zzceVar2 == zzcd.zzb) {
            ig3.m135964a("Invalid range: ".concat(zze(zzceVar, zzceVar2)));
            throw null;
        }
    }

    public static zzdh zza() {
        return zzd;
    }

    private static String zze(zzce zzceVar, zzce zzceVar2) {
        StringBuilder sb = new StringBuilder(16);
        zzceVar.zzc(sb);
        sb.append("..");
        zzceVar2.zzd(sb);
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzdh) {
            zzdh zzdhVar = (zzdh) obj;
            if (this.zza.equals(zzdhVar.zza) && this.zzb.equals(zzdhVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.zza.hashCode() * 31) + this.zzb.hashCode();
    }

    public final String toString() {
        return zze(this.zza, this.zzb);
    }

    public final zzdh zzb(zzdh zzdhVar) {
        int iZza = this.zza.compareTo(zzdhVar.zza);
        int iZza2 = this.zzb.compareTo(zzdhVar.zzb);
        if (iZza >= 0 && iZza2 <= 0) {
            return this;
        }
        if (iZza <= 0 && iZza2 >= 0) {
            return zzdhVar;
        }
        zzce zzceVar = iZza >= 0 ? this.zza : zzdhVar.zza;
        zzce zzceVar2 = iZza2 <= 0 ? this.zzb : zzdhVar.zzb;
        m5s0.m153145d(zzceVar.compareTo(zzceVar2) <= 0, "intersection is undefined for disconnected ranges %s and %s", this, zzdhVar);
        return new zzdh(zzceVar, zzceVar2);
    }

    public final zzdh zzc(zzdh zzdhVar) {
        int iZza = this.zza.compareTo(zzdhVar.zza);
        int iZza2 = this.zzb.compareTo(zzdhVar.zzb);
        if (iZza <= 0 && iZza2 >= 0) {
            return this;
        }
        if (iZza >= 0 && iZza2 <= 0) {
            return zzdhVar;
        }
        zzce zzceVar = iZza <= 0 ? this.zza : zzdhVar.zza;
        if (iZza2 < 0) {
            this = zzdhVar;
        }
        return new zzdh(zzceVar, this.zzb);
    }

    public final boolean zzd() {
        return this.zza.equals(this.zzb);
    }
}
