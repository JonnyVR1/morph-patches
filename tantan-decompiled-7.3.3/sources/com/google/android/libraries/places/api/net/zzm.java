package com.google.android.libraries.places.api.net;

import androidx.annotation.Nullable;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.libraries.places.api.model.AutocompleteSessionToken;
import com.google.android.libraries.places.api.model.LocationBias;
import com.google.android.libraries.places.api.model.LocationRestriction;
import com.google.android.libraries.places.api.model.TypeFilter;
import java.util.List;
import p153l.gg4;
import p153l.mnd0;
import p153l.wtq0;

/* JADX INFO: loaded from: classes7.dex */
final class zzm extends FindAutocompletePredictionsRequest.Builder {
    private String zza;
    private LocationBias zzb;
    private LocationRestriction zzc;
    private LatLng zzd;
    private List zze;
    private AutocompleteSessionToken zzf;
    private TypeFilter zzg;
    private List zzh;
    private Integer zzi;
    private String zzj;
    private gg4 zzk;

    @Override // com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest.Builder
    @Nullable
    public final gg4 getCancellationToken() {
        return this.zzk;
    }

    @Override // com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest.Builder
    public final List<String> getCountries() {
        List<String> list = this.zze;
        if (list != null) {
            return list;
        }
        wtq0.m207906a("Property \"countries\" has not been set");
        return null;
    }

    @Override // com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest.Builder
    @Nullable
    public final Integer getInputOffset() {
        return this.zzi;
    }

    @Override // com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest.Builder
    @Nullable
    public final LocationBias getLocationBias() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest.Builder
    @Nullable
    public final LocationRestriction getLocationRestriction() {
        return this.zzc;
    }

    @Override // com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest.Builder
    @Nullable
    public final LatLng getOrigin() {
        return this.zzd;
    }

    @Override // com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest.Builder
    @Nullable
    public final String getQuery() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest.Builder
    @Nullable
    public final String getRegionCode() {
        return this.zzj;
    }

    @Override // com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest.Builder
    @Nullable
    public final AutocompleteSessionToken getSessionToken() {
        return this.zzf;
    }

    @Override // com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest.Builder
    @Nullable
    public final TypeFilter getTypeFilter() {
        return this.zzg;
    }

    @Override // com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest.Builder
    public final List<String> getTypesFilter() {
        List<String> list = this.zzh;
        if (list != null) {
            return list;
        }
        wtq0.m207906a("Property \"typesFilter\" has not been set");
        return null;
    }

    @Override // com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest.Builder
    public final FindAutocompletePredictionsRequest.Builder setCancellationToken(@Nullable gg4 gg4Var) {
        this.zzk = gg4Var;
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest.Builder
    public final FindAutocompletePredictionsRequest.Builder setCountries(List<String> list) {
        if (list != null) {
            this.zze = list;
            return this;
        }
        mnd0.m159157a("Null countries");
        return null;
    }

    @Override // com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest.Builder
    public final FindAutocompletePredictionsRequest.Builder setInputOffset(@Nullable Integer num) {
        this.zzi = num;
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest.Builder
    public final FindAutocompletePredictionsRequest.Builder setLocationBias(@Nullable LocationBias locationBias) {
        this.zzb = locationBias;
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest.Builder
    public final FindAutocompletePredictionsRequest.Builder setLocationRestriction(@Nullable LocationRestriction locationRestriction) {
        this.zzc = locationRestriction;
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest.Builder
    public final FindAutocompletePredictionsRequest.Builder setOrigin(@Nullable LatLng latLng) {
        this.zzd = latLng;
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest.Builder
    public final FindAutocompletePredictionsRequest.Builder setQuery(@Nullable String str) {
        this.zza = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest.Builder
    public final FindAutocompletePredictionsRequest.Builder setRegionCode(@Nullable String str) {
        this.zzj = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest.Builder
    public final FindAutocompletePredictionsRequest.Builder setSessionToken(@Nullable AutocompleteSessionToken autocompleteSessionToken) {
        this.zzf = autocompleteSessionToken;
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest.Builder
    public final FindAutocompletePredictionsRequest.Builder setTypeFilter(@Nullable TypeFilter typeFilter) {
        this.zzg = typeFilter;
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest.Builder
    public final FindAutocompletePredictionsRequest.Builder setTypesFilter(List<String> list) {
        if (list != null) {
            this.zzh = list;
            return this;
        }
        mnd0.m159157a("Null typesFilter");
        return null;
    }

    @Override // com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest.Builder
    public final FindAutocompletePredictionsRequest zza() {
        List list;
        List list2 = this.zze;
        if (list2 != null && (list = this.zzh) != null) {
            return new zzo(this.zza, this.zzb, this.zzc, this.zzd, list2, this.zzf, this.zzg, list, this.zzi, this.zzj, this.zzk, null);
        }
        StringBuilder sb = new StringBuilder();
        if (this.zze == null) {
            sb.append(" countries");
        }
        if (this.zzh == null) {
            sb.append(" typesFilter");
        }
        wtq0.m207906a("Missing required properties:".concat(sb.toString()));
        return null;
    }
}
