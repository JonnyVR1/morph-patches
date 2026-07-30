package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes7.dex */
public final class zzazf {
    private final zzaze zza;
    private final zzbdo zzb;

    private zzazf(zzaze zzazeVar, zzbdo zzbdoVar) {
        zzmt.zzc(zzazeVar, "state is null");
        this.zza = zzazeVar;
        zzmt.zzc(zzbdoVar, "status is null");
        this.zzb = zzbdoVar;
    }

    public static zzazf zzb(zzaze zzazeVar) {
        zzmt.zzf(zzazeVar != zzaze.TRANSIENT_FAILURE, "state is TRANSIENT_ERROR. Use forError() instead");
        return new zzazf(zzazeVar, zzbdo.zza);
    }

    public static zzazf zzc(zzbdo zzbdoVar) {
        zzmt.zzf(!zzbdoVar.zzl(), "The error status must not be OK");
        return new zzazf(zzaze.TRANSIENT_FAILURE, zzbdoVar);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzazf)) {
            return false;
        }
        zzazf zzazfVar = (zzazf) obj;
        return this.zza.equals(zzazfVar.zza) && this.zzb.equals(zzazfVar.zzb);
    }

    public final int hashCode() {
        return this.zza.hashCode() ^ this.zzb.hashCode();
    }

    public final String toString() {
        zzbdo zzbdoVar = this.zzb;
        boolean zZzl = zzbdoVar.zzl();
        zzaze zzazeVar = this.zza;
        if (zZzl) {
            return zzazeVar.toString();
        }
        return zzazeVar.toString() + "(" + zzbdoVar.toString() + ")";
    }

    public final zzaze zza() {
        return this.zza;
    }

    public final zzbdo zzd() {
        return this.zzb;
    }
}
