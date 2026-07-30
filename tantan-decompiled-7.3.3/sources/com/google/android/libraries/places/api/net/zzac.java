package com.google.android.libraries.places.api.net;

import androidx.annotation.Nullable;
import com.google.android.libraries.places.api.model.LocationRestriction;
import com.google.android.libraries.places.api.model.Place;
import java.util.List;
import p153l.gg4;
import p153l.mnd0;
import p153l.wtq0;

/* JADX INFO: loaded from: classes7.dex */
final class zzac extends SearchNearbyRequest.Builder {
    private String zza;
    private List zzb;
    private List zzc;
    private List zzd;
    private List zze;
    private Integer zzf;
    private LocationRestriction zzg;
    private List zzh;
    private gg4 zzi;
    private SearchNearbyRequest.RankPreference zzj;

    @Override // com.google.android.libraries.places.api.net.SearchNearbyRequest.Builder
    @Nullable
    public final gg4 getCancellationToken() {
        return this.zzi;
    }

    @Override // com.google.android.libraries.places.api.net.SearchNearbyRequest.Builder
    @Nullable
    public final List<String> getExcludedPrimaryTypes() {
        return this.zze;
    }

    @Override // com.google.android.libraries.places.api.net.SearchNearbyRequest.Builder
    @Nullable
    public final List<String> getExcludedTypes() {
        return this.zzc;
    }

    @Override // com.google.android.libraries.places.api.net.SearchNearbyRequest.Builder
    @Nullable
    public final List<String> getIncludedPrimaryTypes() {
        return this.zzd;
    }

    @Override // com.google.android.libraries.places.api.net.SearchNearbyRequest.Builder
    @Nullable
    public final List<String> getIncludedTypes() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.net.SearchNearbyRequest.Builder
    public final LocationRestriction getLocationRestriction() {
        LocationRestriction locationRestriction = this.zzg;
        if (locationRestriction != null) {
            return locationRestriction;
        }
        wtq0.m207906a("Property \"locationRestriction\" has not been set");
        return null;
    }

    @Override // com.google.android.libraries.places.api.net.SearchNearbyRequest.Builder
    @Nullable
    public final Integer getMaxResultCount() {
        return this.zzf;
    }

    @Override // com.google.android.libraries.places.api.net.SearchNearbyRequest.Builder
    public final List<Place.Field> getPlaceFields() {
        List<Place.Field> list = this.zzh;
        if (list != null) {
            return list;
        }
        wtq0.m207906a("Property \"placeFields\" has not been set");
        return null;
    }

    @Override // com.google.android.libraries.places.api.net.SearchNearbyRequest.Builder
    @Nullable
    public final SearchNearbyRequest.RankPreference getRankPreference() {
        return this.zzj;
    }

    @Override // com.google.android.libraries.places.api.net.SearchNearbyRequest.Builder
    @Nullable
    public final String getRegionCode() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.api.net.SearchNearbyRequest.Builder
    public final SearchNearbyRequest.Builder setCancellationToken(@Nullable gg4 gg4Var) {
        this.zzi = gg4Var;
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.SearchNearbyRequest.Builder
    public final SearchNearbyRequest.Builder setExcludedPrimaryTypes(@Nullable List<String> list) {
        this.zze = list;
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.SearchNearbyRequest.Builder
    public final SearchNearbyRequest.Builder setExcludedTypes(@Nullable List<String> list) {
        this.zzc = list;
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.SearchNearbyRequest.Builder
    public final SearchNearbyRequest.Builder setIncludedPrimaryTypes(@Nullable List<String> list) {
        this.zzd = list;
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.SearchNearbyRequest.Builder
    public final SearchNearbyRequest.Builder setIncludedTypes(@Nullable List<String> list) {
        this.zzb = list;
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.SearchNearbyRequest.Builder
    public final SearchNearbyRequest.Builder setLocationRestriction(LocationRestriction locationRestriction) {
        if (locationRestriction != null) {
            this.zzg = locationRestriction;
            return this;
        }
        mnd0.m159157a("Null locationRestriction");
        return null;
    }

    @Override // com.google.android.libraries.places.api.net.SearchNearbyRequest.Builder
    public final SearchNearbyRequest.Builder setMaxResultCount(@Nullable Integer num) {
        this.zzf = num;
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.SearchNearbyRequest.Builder
    public final SearchNearbyRequest.Builder setPlaceFields(List<Place.Field> list) {
        if (list != null) {
            this.zzh = list;
            return this;
        }
        mnd0.m159157a("Null placeFields");
        return null;
    }

    @Override // com.google.android.libraries.places.api.net.SearchNearbyRequest.Builder
    public final SearchNearbyRequest.Builder setRankPreference(@Nullable SearchNearbyRequest.RankPreference rankPreference) {
        this.zzj = rankPreference;
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.SearchNearbyRequest.Builder
    public final SearchNearbyRequest.Builder setRegionCode(@Nullable String str) {
        this.zza = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.SearchNearbyRequest.Builder
    public final SearchNearbyRequest zza() {
        List list;
        LocationRestriction locationRestriction = this.zzg;
        if (locationRestriction != null && (list = this.zzh) != null) {
            return new zzae(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, locationRestriction, list, this.zzi, this.zzj, null);
        }
        StringBuilder sb = new StringBuilder();
        if (this.zzg == null) {
            sb.append(" locationRestriction");
        }
        if (this.zzh == null) {
            sb.append(" placeFields");
        }
        wtq0.m207906a("Missing required properties:".concat(sb.toString()));
        return null;
    }
}
