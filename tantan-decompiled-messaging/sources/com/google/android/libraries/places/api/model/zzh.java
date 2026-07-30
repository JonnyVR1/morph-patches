package com.google.android.libraries.places.api.model;

import androidx.annotation.Nullable;
import java.util.List;
import p149l.jfd0;

/* JADX INFO: loaded from: classes7.dex */
abstract class zzh extends AutocompletePrediction {
    private final String zza;

    @Nullable
    private final Integer zzb;
    private final List zzc;
    private final List zzd;
    private final String zze;
    private final String zzf;
    private final String zzg;
    private final List zzh;
    private final List zzi;
    private final List zzj;

    public zzh(String str, @Nullable Integer num, List list, List list2, String str2, String str3, String str4, List list3, List list4, List list5) {
        if (str == null) {
            jfd0.m141176a("Null placeId");
            throw null;
        }
        this.zza = str;
        this.zzb = num;
        if (list == null) {
            jfd0.m141176a("Null placeTypes");
            throw null;
        }
        this.zzc = list;
        if (list2 == null) {
            jfd0.m141176a("Null types");
            throw null;
        }
        this.zzd = list2;
        if (str2 == null) {
            jfd0.m141176a("Null fullText");
            throw null;
        }
        this.zze = str2;
        if (str3 == null) {
            jfd0.m141176a("Null primaryText");
            throw null;
        }
        this.zzf = str3;
        if (str4 == null) {
            jfd0.m141176a("Null secondaryText");
            throw null;
        }
        this.zzg = str4;
        if (list3 == null) {
            jfd0.m141176a("Null fullTextMatchedSubstrings");
            throw null;
        }
        this.zzh = list3;
        if (list4 == null) {
            jfd0.m141176a("Null primaryTextMatchedSubstrings");
            throw null;
        }
        this.zzi = list4;
        if (list5 != null) {
            this.zzj = list5;
        } else {
            jfd0.m141176a("Null secondaryTextMatchedSubstrings");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        Integer num;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AutocompletePrediction) {
            AutocompletePrediction autocompletePrediction = (AutocompletePrediction) obj;
            if (this.zza.equals(autocompletePrediction.getPlaceId()) && ((num = this.zzb) != null ? num.equals(autocompletePrediction.getDistanceMeters()) : autocompletePrediction.getDistanceMeters() == null) && this.zzc.equals(autocompletePrediction.getPlaceTypes()) && this.zzd.equals(autocompletePrediction.getTypes()) && this.zze.equals(autocompletePrediction.zza()) && this.zzf.equals(autocompletePrediction.zzb()) && this.zzg.equals(autocompletePrediction.zzc()) && this.zzh.equals(autocompletePrediction.zzd()) && this.zzi.equals(autocompletePrediction.zze()) && this.zzj.equals(autocompletePrediction.zzf())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.libraries.places.api.model.AutocompletePrediction
    @Nullable
    public Integer getDistanceMeters() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.model.AutocompletePrediction
    public String getPlaceId() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.api.model.AutocompletePrediction
    @Deprecated
    public List<Place.Type> getPlaceTypes() {
        return this.zzc;
    }

    @Override // com.google.android.libraries.places.api.model.AutocompletePrediction
    public List<String> getTypes() {
        return this.zzd;
    }

    public final int hashCode() {
        int iHashCode = this.zza.hashCode() ^ 1000003;
        Integer num = this.zzb;
        return this.zzj.hashCode() ^ (((((((((((((((((iHashCode * 1000003) ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.zzc.hashCode()) * 1000003) ^ this.zzd.hashCode()) * 1000003) ^ this.zze.hashCode()) * 1000003) ^ this.zzf.hashCode()) * 1000003) ^ this.zzg.hashCode()) * 1000003) ^ this.zzh.hashCode()) * 1000003) ^ this.zzi.hashCode()) * 1000003);
    }

    public final String toString() {
        List list = this.zzj;
        List list2 = this.zzi;
        List list3 = this.zzh;
        List list4 = this.zzd;
        return "AutocompletePrediction{placeId=" + this.zza + ", distanceMeters=" + this.zzb + ", placeTypes=" + this.zzc.toString() + ", types=" + list4.toString() + ", fullText=" + this.zze + ", primaryText=" + this.zzf + ", secondaryText=" + this.zzg + ", fullTextMatchedSubstrings=" + list3.toString() + ", primaryTextMatchedSubstrings=" + list2.toString() + ", secondaryTextMatchedSubstrings=" + list.toString() + "}";
    }

    @Override // com.google.android.libraries.places.api.model.AutocompletePrediction
    public final String zza() {
        return this.zze;
    }

    @Override // com.google.android.libraries.places.api.model.AutocompletePrediction
    public final String zzb() {
        return this.zzf;
    }

    @Override // com.google.android.libraries.places.api.model.AutocompletePrediction
    public final String zzc() {
        return this.zzg;
    }

    @Override // com.google.android.libraries.places.api.model.AutocompletePrediction
    public final List zzd() {
        return this.zzh;
    }

    @Override // com.google.android.libraries.places.api.model.AutocompletePrediction
    public final List zze() {
        return this.zzi;
    }

    @Override // com.google.android.libraries.places.api.model.AutocompletePrediction
    public final List zzf() {
        return this.zzj;
    }
}
