package com.google.android.libraries.places.api.net;

import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import com.google.android.libraries.places.api.model.LocationBias;
import com.google.android.libraries.places.api.model.LocationRestriction;
import com.google.android.libraries.places.api.model.Place;
import java.util.List;
import p153l.gg4;

/* JADX INFO: loaded from: classes7.dex */
final class zzaa extends SearchByTextRequest {

    @Nullable
    private final gg4 zza;

    @Nullable
    private final String zzb;

    @Nullable
    private final LocationBias zzc;

    @Nullable
    private final LocationRestriction zzd;

    @Nullable
    private final Integer zze;

    @Nullable
    private final Double zzf;
    private final boolean zzg;
    private final List zzh;
    private final List zzi;

    @Nullable
    private final SearchByTextRequest.RankPreference zzj;

    @Nullable
    private final String zzk;
    private final boolean zzl;
    private final String zzm;

    public /* synthetic */ zzaa(gg4 gg4Var, String str, LocationBias locationBias, LocationRestriction locationRestriction, Integer num, Double d, boolean z, List list, List list2, SearchByTextRequest.RankPreference rankPreference, String str2, boolean z2, String str3, zzz zzzVar) {
        this.zza = gg4Var;
        this.zzb = str;
        this.zzc = locationBias;
        this.zzd = locationRestriction;
        this.zze = num;
        this.zzf = d;
        this.zzg = z;
        this.zzh = list;
        this.zzi = list2;
        this.zzj = rankPreference;
        this.zzk = str2;
        this.zzl = z2;
        this.zzm = str3;
    }

    public final boolean equals(Object obj) {
        SearchByTextRequest.RankPreference rankPreference;
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof SearchByTextRequest) {
            SearchByTextRequest searchByTextRequest = (SearchByTextRequest) obj;
            gg4 gg4Var = this.zza;
            if (gg4Var != null ? gg4Var.equals(searchByTextRequest.getCancellationToken()) : searchByTextRequest.getCancellationToken() == null) {
                String str2 = this.zzb;
                if (str2 != null ? str2.equals(searchByTextRequest.getIncludedType()) : searchByTextRequest.getIncludedType() == null) {
                    LocationBias locationBias = this.zzc;
                    if (locationBias != null ? locationBias.equals(searchByTextRequest.getLocationBias()) : searchByTextRequest.getLocationBias() == null) {
                        LocationRestriction locationRestriction = this.zzd;
                        if (locationRestriction != null ? locationRestriction.equals(searchByTextRequest.getLocationRestriction()) : searchByTextRequest.getLocationRestriction() == null) {
                            Integer num = this.zze;
                            if (num != null ? num.equals(searchByTextRequest.getMaxResultCount()) : searchByTextRequest.getMaxResultCount() == null) {
                                Double d = this.zzf;
                                if (d != null ? d.equals(searchByTextRequest.getMinRating()) : searchByTextRequest.getMinRating() == null) {
                                    if (this.zzg == searchByTextRequest.isOpenNow() && this.zzh.equals(searchByTextRequest.getPlaceFields()) && this.zzi.equals(searchByTextRequest.getPriceLevels()) && ((rankPreference = this.zzj) != null ? rankPreference.equals(searchByTextRequest.getRankPreference()) : searchByTextRequest.getRankPreference() == null) && ((str = this.zzk) != null ? str.equals(searchByTextRequest.getRegionCode()) : searchByTextRequest.getRegionCode() == null) && this.zzl == searchByTextRequest.isStrictTypeFiltering() && this.zzm.equals(searchByTextRequest.getTextQuery())) {
                                        return true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.libraries.places.internal.zzjt
    @Nullable
    public final gg4 getCancellationToken() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest
    @Nullable
    public final String getIncludedType() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest
    @Nullable
    public final LocationBias getLocationBias() {
        return this.zzc;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest
    @Nullable
    public final LocationRestriction getLocationRestriction() {
        return this.zzd;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest
    @Nullable
    public final Integer getMaxResultCount() {
        return this.zze;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest
    @Nullable
    @FloatRange(from = 1.0d, to = Place.RATING_MAX_VALUE)
    public final Double getMinRating() {
        return this.zzf;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest
    public final List<Place.Field> getPlaceFields() {
        return this.zzh;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest
    @IntRange(from = 0, to = 4)
    public final List<Integer> getPriceLevels() {
        return this.zzi;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest
    @Nullable
    public final SearchByTextRequest.RankPreference getRankPreference() {
        return this.zzj;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest
    @Nullable
    public final String getRegionCode() {
        return this.zzk;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest
    public final String getTextQuery() {
        return this.zzm;
    }

    public final int hashCode() {
        gg4 gg4Var = this.zza;
        int iHashCode = gg4Var == null ? 0 : gg4Var.hashCode();
        String str = this.zzb;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        int i = iHashCode ^ 1000003;
        LocationBias locationBias = this.zzc;
        int iHashCode3 = ((((i * 1000003) ^ iHashCode2) * 1000003) ^ (locationBias == null ? 0 : locationBias.hashCode())) * 1000003;
        LocationRestriction locationRestriction = this.zzd;
        int iHashCode4 = (iHashCode3 ^ (locationRestriction == null ? 0 : locationRestriction.hashCode())) * 1000003;
        Integer num = this.zze;
        int iHashCode5 = (iHashCode4 ^ (num == null ? 0 : num.hashCode())) * 1000003;
        Double d = this.zzf;
        int iHashCode6 = (((((((iHashCode5 ^ (d == null ? 0 : d.hashCode())) * 1000003) ^ (true != this.zzg ? 1237 : 1231)) * 1000003) ^ this.zzh.hashCode()) * 1000003) ^ this.zzi.hashCode()) * 1000003;
        SearchByTextRequest.RankPreference rankPreference = this.zzj;
        int iHashCode7 = (iHashCode6 ^ (rankPreference == null ? 0 : rankPreference.hashCode())) * 1000003;
        String str2 = this.zzk;
        return this.zzm.hashCode() ^ ((((iHashCode7 ^ (str2 != null ? str2.hashCode() : 0)) * 1000003) ^ (true != this.zzl ? 1237 : 1231)) * 1000003);
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest
    public final boolean isOpenNow() {
        return this.zzg;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest
    public final boolean isStrictTypeFiltering() {
        return this.zzl;
    }

    public final String toString() {
        SearchByTextRequest.RankPreference rankPreference = this.zzj;
        List list = this.zzi;
        List list2 = this.zzh;
        LocationRestriction locationRestriction = this.zzd;
        LocationBias locationBias = this.zzc;
        return "SearchByTextRequest{cancellationToken=" + String.valueOf(this.zza) + ", includedType=" + this.zzb + ", locationBias=" + String.valueOf(locationBias) + ", locationRestriction=" + String.valueOf(locationRestriction) + ", maxResultCount=" + this.zze + ", minRating=" + this.zzf + ", openNow=" + this.zzg + ", placeFields=" + list2.toString() + ", priceLevels=" + list.toString() + ", rankPreference=" + String.valueOf(rankPreference) + ", regionCode=" + this.zzk + ", strictTypeFiltering=" + this.zzl + ", textQuery=" + this.zzm + "}";
    }
}
