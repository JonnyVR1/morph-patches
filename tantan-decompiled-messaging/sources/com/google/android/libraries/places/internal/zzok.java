package com.google.android.libraries.places.internal;

import java.io.Serializable;
import p149l.ig3;

/* JADX INFO: loaded from: classes7.dex */
public final class zzok extends zzol implements Serializable {
    public static final /* synthetic */ int zzc = 0;
    private static final zzok zzd = new zzok(zznn.zzb, zznl.zzb);
    final zznp zza;
    final zznp zzb;

    private zzok(zznp zznpVar, zznp zznpVar2) {
        this.zza = zznpVar;
        this.zzb = zznpVar2;
        if (zznpVar.compareTo(zznpVar2) > 0 || zznpVar == zznl.zzb || zznpVar2 == zznn.zzb) {
            ig3.m135964a("Invalid range: ".concat(zze(zznpVar, zznpVar2)));
            throw null;
        }
    }

    public static zzok zza(Comparable comparable) {
        return new zzok(new zzno(comparable), zznl.zzb);
    }

    public static zzok zzb(Comparable comparable, Comparable comparable2) {
        return new zzok(new zzno(comparable), new zznm(comparable2));
    }

    public static zzok zzc(Comparable comparable, Comparable comparable2) {
        return new zzok(new zzno(comparable), new zzno(comparable2));
    }

    private static String zze(zznp zznpVar, zznp zznpVar2) {
        StringBuilder sb = new StringBuilder(16);
        zznpVar.zzc(sb);
        sb.append("..");
        zznpVar2.zzd(sb);
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzok) {
            zzok zzokVar = (zzok) obj;
            if (this.zza.equals(zzokVar.zza) && this.zzb.equals(zzokVar.zzb)) {
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

    public final boolean zzd(Comparable comparable) {
        comparable.getClass();
        return this.zza.zze(comparable) && !this.zzb.zze(comparable);
    }
}
