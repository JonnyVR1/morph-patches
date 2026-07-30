package com.google.android.libraries.places.internal;

import androidx.annotation.Nullable;
import com.google.android.libraries.places.api.model.LocationBias;
import com.google.android.libraries.places.api.model.LocationRestriction;
import com.google.android.libraries.places.api.model.TypeFilter;
import com.google.android.libraries.places.widget.model.AutocompleteActivityMode;
import p149l.jfd0;

/* JADX INFO: loaded from: classes7.dex */
abstract class zzkk extends zzkt {
    private final AutocompleteActivityMode zza;
    private final zznx zzb;
    private final zzkr zzc;

    @Nullable
    private final String zzd;

    @Nullable
    private final String zze;

    @Nullable
    private final LocationBias zzf;

    @Nullable
    private final LocationRestriction zzg;
    private final zznx zzh;

    @Nullable
    private final TypeFilter zzi;
    private final zznx zzj;
    private final int zzk;
    private final int zzl;

    @Nullable
    private final String zzm;

    public zzkk(AutocompleteActivityMode autocompleteActivityMode, zznx zznxVar, zzkr zzkrVar, @Nullable String str, @Nullable String str2, @Nullable LocationBias locationBias, @Nullable LocationRestriction locationRestriction, zznx zznxVar2, @Nullable TypeFilter typeFilter, zznx zznxVar3, int i, int i2, @Nullable String str3) {
        if (autocompleteActivityMode == null) {
            jfd0.m141176a("Null mode");
            throw null;
        }
        this.zza = autocompleteActivityMode;
        if (zznxVar == null) {
            jfd0.m141176a("Null placeFields");
            throw null;
        }
        this.zzb = zznxVar;
        if (zzkrVar == null) {
            jfd0.m141176a("Null origin");
            throw null;
        }
        this.zzc = zzkrVar;
        this.zzd = str;
        this.zze = str2;
        this.zzf = locationBias;
        this.zzg = locationRestriction;
        if (zznxVar2 == null) {
            jfd0.m141176a("Null countries");
            throw null;
        }
        this.zzh = zznxVar2;
        this.zzi = typeFilter;
        if (zznxVar3 == null) {
            jfd0.m141176a("Null typesFilter");
            throw null;
        }
        this.zzj = zznxVar3;
        this.zzk = i;
        this.zzl = i2;
        this.zzm = str3;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        LocationBias locationBias;
        LocationRestriction locationRestriction;
        TypeFilter typeFilter;
        String str3;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzkt) {
            zzkt zzktVar = (zzkt) obj;
            if (this.zza.equals(zzktVar.zzh()) && this.zzb.equals(zzktVar.zzj()) && this.zzc.equals(zzktVar.zzf()) && ((str = this.zzd) != null ? str.equals(zzktVar.zzm()) : zzktVar.zzm() == null) && ((str2 = this.zze) != null ? str2.equals(zzktVar.zzl()) : zzktVar.zzl() == null) && ((locationBias = this.zzf) != null ? locationBias.equals(zzktVar.zzc()) : zzktVar.zzc() == null) && ((locationRestriction = this.zzg) != null ? locationRestriction.equals(zzktVar.zzd()) : zzktVar.zzd() == null) && this.zzh.equals(zzktVar.zzi()) && ((typeFilter = this.zzi) != null ? typeFilter.equals(zzktVar.zze()) : zzktVar.zze() == null) && this.zzj.equals(zzktVar.zzk()) && this.zzk == zzktVar.zza() && this.zzl == zzktVar.zzb() && ((str3 = this.zzm) != null ? str3.equals(zzktVar.zzn()) : zzktVar.zzn() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((this.zza.hashCode() ^ 1000003) * 1000003) ^ this.zzb.hashCode()) * 1000003) ^ this.zzc.hashCode();
        String str = this.zzd;
        int iHashCode2 = ((iHashCode * 1000003) ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.zze;
        int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        LocationBias locationBias = this.zzf;
        int iHashCode4 = (iHashCode3 ^ (locationBias == null ? 0 : locationBias.hashCode())) * 1000003;
        LocationRestriction locationRestriction = this.zzg;
        int iHashCode5 = (((iHashCode4 ^ (locationRestriction == null ? 0 : locationRestriction.hashCode())) * 1000003) ^ this.zzh.hashCode()) * 1000003;
        TypeFilter typeFilter = this.zzi;
        int iHashCode6 = (((((((iHashCode5 ^ (typeFilter == null ? 0 : typeFilter.hashCode())) * 1000003) ^ this.zzj.hashCode()) * 1000003) ^ this.zzk) * 1000003) ^ this.zzl) * 1000003;
        String str3 = this.zzm;
        return iHashCode6 ^ (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        zznx zznxVar = this.zzj;
        TypeFilter typeFilter = this.zzi;
        zznx zznxVar2 = this.zzh;
        LocationRestriction locationRestriction = this.zzg;
        LocationBias locationBias = this.zzf;
        zzkr zzkrVar = this.zzc;
        zznx zznxVar3 = this.zzb;
        return "AutocompleteOptions{mode=" + this.zza.toString() + ", placeFields=" + zznxVar3.toString() + ", origin=" + zzkrVar.toString() + ", initialQuery=" + this.zzd + ", hint=" + this.zze + ", locationBias=" + String.valueOf(locationBias) + ", locationRestriction=" + String.valueOf(locationRestriction) + ", countries=" + zznxVar2.toString() + ", typeFilter=" + String.valueOf(typeFilter) + ", typesFilter=" + zznxVar.toString() + ", primaryColor=" + this.zzk + ", primaryColorDark=" + this.zzl + ", regionCode=" + this.zzm + "}";
    }

    @Override // com.google.android.libraries.places.internal.zzkt
    public final int zza() {
        return this.zzk;
    }

    @Override // com.google.android.libraries.places.internal.zzkt
    public final int zzb() {
        return this.zzl;
    }

    @Override // com.google.android.libraries.places.internal.zzkt
    @Nullable
    public final LocationBias zzc() {
        return this.zzf;
    }

    @Override // com.google.android.libraries.places.internal.zzkt
    @Nullable
    public final LocationRestriction zzd() {
        return this.zzg;
    }

    @Override // com.google.android.libraries.places.internal.zzkt
    @Nullable
    @Deprecated
    public final TypeFilter zze() {
        return this.zzi;
    }

    @Override // com.google.android.libraries.places.internal.zzkt
    public final zzkr zzf() {
        return this.zzc;
    }

    @Override // com.google.android.libraries.places.internal.zzkt
    public final zzks zzg() {
        return new zzkj(this);
    }

    @Override // com.google.android.libraries.places.internal.zzkt
    public final AutocompleteActivityMode zzh() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.internal.zzkt
    public final zznx zzi() {
        return this.zzh;
    }

    @Override // com.google.android.libraries.places.internal.zzkt
    public final zznx zzj() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.internal.zzkt
    public final zznx zzk() {
        return this.zzj;
    }

    @Override // com.google.android.libraries.places.internal.zzkt
    @Nullable
    public final String zzl() {
        return this.zze;
    }

    @Override // com.google.android.libraries.places.internal.zzkt
    @Nullable
    public final String zzm() {
        return this.zzd;
    }

    @Override // com.google.android.libraries.places.internal.zzkt
    @Nullable
    public final String zzn() {
        return this.zzm;
    }
}
