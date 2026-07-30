package com.google.android.libraries.places.api.net;

import androidx.annotation.Nullable;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.libraries.places.api.model.AutocompleteSessionToken;
import com.google.android.libraries.places.api.model.LocationBias;
import com.google.android.libraries.places.api.model.LocationRestriction;
import com.google.android.libraries.places.api.model.TypeFilter;
import java.util.List;
import p153l.gg4;

/* JADX INFO: loaded from: classes7.dex */
final class zzo extends FindAutocompletePredictionsRequest {

    @Nullable
    private final String zza;

    @Nullable
    private final LocationBias zzb;

    @Nullable
    private final LocationRestriction zzc;

    @Nullable
    private final LatLng zzd;
    private final List zze;

    @Nullable
    private final AutocompleteSessionToken zzf;

    @Nullable
    private final TypeFilter zzg;
    private final List zzh;

    @Nullable
    private final Integer zzi;

    @Nullable
    private final String zzj;

    @Nullable
    private final gg4 zzk;

    public /* synthetic */ zzo(String str, LocationBias locationBias, LocationRestriction locationRestriction, LatLng latLng, List list, AutocompleteSessionToken autocompleteSessionToken, TypeFilter typeFilter, List list2, Integer num, String str2, gg4 gg4Var, zzn zznVar) {
        this.zza = str;
        this.zzb = locationBias;
        this.zzc = locationRestriction;
        this.zzd = latLng;
        this.zze = list;
        this.zzf = autocompleteSessionToken;
        this.zzg = typeFilter;
        this.zzh = list2;
        this.zzi = num;
        this.zzj = str2;
        this.zzk = gg4Var;
    }

    public final boolean equals(Object obj) {
        AutocompleteSessionToken autocompleteSessionToken;
        TypeFilter typeFilter;
        Integer num;
        String str;
        gg4 gg4Var;
        if (obj == this) {
            return true;
        }
        if (obj instanceof FindAutocompletePredictionsRequest) {
            FindAutocompletePredictionsRequest findAutocompletePredictionsRequest = (FindAutocompletePredictionsRequest) obj;
            String str2 = this.zza;
            if (str2 != null ? str2.equals(findAutocompletePredictionsRequest.getQuery()) : findAutocompletePredictionsRequest.getQuery() == null) {
                LocationBias locationBias = this.zzb;
                if (locationBias != null ? locationBias.equals(findAutocompletePredictionsRequest.getLocationBias()) : findAutocompletePredictionsRequest.getLocationBias() == null) {
                    LocationRestriction locationRestriction = this.zzc;
                    if (locationRestriction != null ? locationRestriction.equals(findAutocompletePredictionsRequest.getLocationRestriction()) : findAutocompletePredictionsRequest.getLocationRestriction() == null) {
                        LatLng latLng = this.zzd;
                        if (latLng != null ? latLng.equals(findAutocompletePredictionsRequest.getOrigin()) : findAutocompletePredictionsRequest.getOrigin() == null) {
                            if (this.zze.equals(findAutocompletePredictionsRequest.getCountries()) && ((autocompleteSessionToken = this.zzf) != null ? autocompleteSessionToken.equals(findAutocompletePredictionsRequest.getSessionToken()) : findAutocompletePredictionsRequest.getSessionToken() == null) && ((typeFilter = this.zzg) != null ? typeFilter.equals(findAutocompletePredictionsRequest.getTypeFilter()) : findAutocompletePredictionsRequest.getTypeFilter() == null) && this.zzh.equals(findAutocompletePredictionsRequest.getTypesFilter()) && ((num = this.zzi) != null ? num.equals(findAutocompletePredictionsRequest.getInputOffset()) : findAutocompletePredictionsRequest.getInputOffset() == null) && ((str = this.zzj) != null ? str.equals(findAutocompletePredictionsRequest.getRegionCode()) : findAutocompletePredictionsRequest.getRegionCode() == null) && ((gg4Var = this.zzk) != null ? gg4Var.equals(findAutocompletePredictionsRequest.getCancellationToken()) : findAutocompletePredictionsRequest.getCancellationToken() == null)) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest, com.google.android.libraries.places.internal.zzjt
    @Nullable
    public final gg4 getCancellationToken() {
        return this.zzk;
    }

    @Override // com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest
    public final List<String> getCountries() {
        return this.zze;
    }

    @Override // com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest
    @Nullable
    public final Integer getInputOffset() {
        return this.zzi;
    }

    @Override // com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest
    @Nullable
    public final LocationBias getLocationBias() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest
    @Nullable
    public final LocationRestriction getLocationRestriction() {
        return this.zzc;
    }

    @Override // com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest
    @Nullable
    public final LatLng getOrigin() {
        return this.zzd;
    }

    @Override // com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest
    @Nullable
    public final String getQuery() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest
    @Nullable
    public final String getRegionCode() {
        return this.zzj;
    }

    @Override // com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest
    @Nullable
    public final AutocompleteSessionToken getSessionToken() {
        return this.zzf;
    }

    @Override // com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest
    @Nullable
    @Deprecated
    public final TypeFilter getTypeFilter() {
        return this.zzg;
    }

    @Override // com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest
    public final List<String> getTypesFilter() {
        return this.zzh;
    }

    public final int hashCode() {
        String str = this.zza;
        int iHashCode = str == null ? 0 : str.hashCode();
        LocationBias locationBias = this.zzb;
        int iHashCode2 = locationBias == null ? 0 : locationBias.hashCode();
        int i = iHashCode ^ 1000003;
        LocationRestriction locationRestriction = this.zzc;
        int iHashCode3 = ((((i * 1000003) ^ iHashCode2) * 1000003) ^ (locationRestriction == null ? 0 : locationRestriction.hashCode())) * 1000003;
        LatLng latLng = this.zzd;
        int iHashCode4 = (((iHashCode3 ^ (latLng == null ? 0 : latLng.hashCode())) * 1000003) ^ this.zze.hashCode()) * 1000003;
        AutocompleteSessionToken autocompleteSessionToken = this.zzf;
        int iHashCode5 = (iHashCode4 ^ (autocompleteSessionToken == null ? 0 : autocompleteSessionToken.hashCode())) * 1000003;
        TypeFilter typeFilter = this.zzg;
        int iHashCode6 = (((iHashCode5 ^ (typeFilter == null ? 0 : typeFilter.hashCode())) * 1000003) ^ this.zzh.hashCode()) * 1000003;
        Integer num = this.zzi;
        int iHashCode7 = (iHashCode6 ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str2 = this.zzj;
        int iHashCode8 = (iHashCode7 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        gg4 gg4Var = this.zzk;
        return iHashCode8 ^ (gg4Var != null ? gg4Var.hashCode() : 0);
    }

    public final String toString() {
        gg4 gg4Var = this.zzk;
        List list = this.zzh;
        TypeFilter typeFilter = this.zzg;
        AutocompleteSessionToken autocompleteSessionToken = this.zzf;
        List list2 = this.zze;
        LatLng latLng = this.zzd;
        LocationRestriction locationRestriction = this.zzc;
        return "FindAutocompletePredictionsRequest{query=" + this.zza + ", locationBias=" + String.valueOf(this.zzb) + ", locationRestriction=" + String.valueOf(locationRestriction) + ", origin=" + String.valueOf(latLng) + ", countries=" + list2.toString() + ", sessionToken=" + String.valueOf(autocompleteSessionToken) + ", typeFilter=" + String.valueOf(typeFilter) + ", typesFilter=" + list.toString() + ", inputOffset=" + this.zzi + ", regionCode=" + this.zzj + ", cancellationToken=" + String.valueOf(gg4Var) + "}";
    }
}
