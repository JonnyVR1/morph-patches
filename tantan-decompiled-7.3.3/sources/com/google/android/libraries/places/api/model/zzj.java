package com.google.android.libraries.places.api.model;

/* JADX INFO: loaded from: classes7.dex */
abstract class zzj extends zzby {
    private final int zza;
    private final int zzb;

    public zzj(int i, int i2) {
        this.zza = i;
        this.zzb = i2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzby) {
            zzby zzbyVar = (zzby) obj;
            if (this.zza == zzbyVar.zzb() && this.zzb == zzbyVar.zza()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.zzb ^ ((this.zza ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "SubstringMatch{offset=" + this.zza + ", length=" + this.zzb + "}";
    }

    @Override // com.google.android.libraries.places.api.model.zzby
    public final int zza() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.model.zzby
    public final int zzb() {
        return this.zza;
    }
}
