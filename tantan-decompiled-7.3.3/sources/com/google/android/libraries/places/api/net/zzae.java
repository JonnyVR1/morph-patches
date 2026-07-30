package com.google.android.libraries.places.api.net;

import androidx.annotation.Nullable;
import com.google.android.libraries.places.api.model.LocationRestriction;
import com.google.android.libraries.places.api.model.Place;
import java.util.List;
import p153l.gg4;

/* JADX INFO: loaded from: classes7.dex */
final class zzae extends SearchNearbyRequest {

    @Nullable
    private final String zza;

    @Nullable
    private final List zzb;

    @Nullable
    private final List zzc;

    @Nullable
    private final List zzd;

    @Nullable
    private final List zze;

    @Nullable
    private final Integer zzf;
    private final LocationRestriction zzg;
    private final List zzh;

    @Nullable
    private final gg4 zzi;

    @Nullable
    private final SearchNearbyRequest.RankPreference zzj;

    public /* synthetic */ zzae(String str, List list, List list2, List list3, List list4, Integer num, LocationRestriction locationRestriction, List list5, gg4 gg4Var, SearchNearbyRequest.RankPreference rankPreference, zzad zzadVar) {
        this.zza = str;
        this.zzb = list;
        this.zzc = list2;
        this.zzd = list3;
        this.zze = list4;
        this.zzf = num;
        this.zzg = locationRestriction;
        this.zzh = list5;
        this.zzi = gg4Var;
        this.zzj = rankPreference;
    }

    public final boolean equals(Object obj) {
        gg4 gg4Var;
        SearchNearbyRequest.RankPreference rankPreference;
        if (obj == this) {
            return true;
        }
        if (obj instanceof SearchNearbyRequest) {
            SearchNearbyRequest searchNearbyRequest = (SearchNearbyRequest) obj;
            String str = this.zza;
            if (str != null ? str.equals(searchNearbyRequest.getRegionCode()) : searchNearbyRequest.getRegionCode() == null) {
                List list = this.zzb;
                if (list != null ? list.equals(searchNearbyRequest.getIncludedTypes()) : searchNearbyRequest.getIncludedTypes() == null) {
                    List list2 = this.zzc;
                    if (list2 != null ? list2.equals(searchNearbyRequest.getExcludedTypes()) : searchNearbyRequest.getExcludedTypes() == null) {
                        List list3 = this.zzd;
                        if (list3 != null ? list3.equals(searchNearbyRequest.getIncludedPrimaryTypes()) : searchNearbyRequest.getIncludedPrimaryTypes() == null) {
                            List list4 = this.zze;
                            if (list4 != null ? list4.equals(searchNearbyRequest.getExcludedPrimaryTypes()) : searchNearbyRequest.getExcludedPrimaryTypes() == null) {
                                Integer num = this.zzf;
                                if (num != null ? num.equals(searchNearbyRequest.getMaxResultCount()) : searchNearbyRequest.getMaxResultCount() == null) {
                                    if (this.zzg.equals(searchNearbyRequest.getLocationRestriction()) && this.zzh.equals(searchNearbyRequest.getPlaceFields()) && ((gg4Var = this.zzi) != null ? gg4Var.equals(searchNearbyRequest.getCancellationToken()) : searchNearbyRequest.getCancellationToken() == null) && ((rankPreference = this.zzj) != null ? rankPreference.equals(searchNearbyRequest.getRankPreference()) : searchNearbyRequest.getRankPreference() == null)) {
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

    @Override // com.google.android.libraries.places.api.net.SearchNearbyRequest, com.google.android.libraries.places.internal.zzjt
    @Nullable
    public final gg4 getCancellationToken() {
        return this.zzi;
    }

    @Override // com.google.android.libraries.places.api.net.SearchNearbyRequest
    @Nullable
    public final List<String> getExcludedPrimaryTypes() {
        return this.zze;
    }

    @Override // com.google.android.libraries.places.api.net.SearchNearbyRequest
    @Nullable
    public final List<String> getExcludedTypes() {
        return this.zzc;
    }

    @Override // com.google.android.libraries.places.api.net.SearchNearbyRequest
    @Nullable
    public final List<String> getIncludedPrimaryTypes() {
        return this.zzd;
    }

    @Override // com.google.android.libraries.places.api.net.SearchNearbyRequest
    @Nullable
    public final List<String> getIncludedTypes() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.net.SearchNearbyRequest
    public final LocationRestriction getLocationRestriction() {
        return this.zzg;
    }

    @Override // com.google.android.libraries.places.api.net.SearchNearbyRequest
    @Nullable
    public final Integer getMaxResultCount() {
        return this.zzf;
    }

    @Override // com.google.android.libraries.places.api.net.SearchNearbyRequest
    public final List<Place.Field> getPlaceFields() {
        return this.zzh;
    }

    @Override // com.google.android.libraries.places.api.net.SearchNearbyRequest
    @Nullable
    public final SearchNearbyRequest.RankPreference getRankPreference() {
        return this.zzj;
    }

    @Override // com.google.android.libraries.places.api.net.SearchNearbyRequest
    @Nullable
    public final String getRegionCode() {
        return this.zza;
    }

    public final int hashCode() {
        String str = this.zza;
        int iHashCode = str == null ? 0 : str.hashCode();
        List list = this.zzb;
        int iHashCode2 = list == null ? 0 : list.hashCode();
        int i = iHashCode ^ 1000003;
        List list2 = this.zzc;
        int iHashCode3 = ((((i * 1000003) ^ iHashCode2) * 1000003) ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
        List list3 = this.zzd;
        int iHashCode4 = (iHashCode3 ^ (list3 == null ? 0 : list3.hashCode())) * 1000003;
        List list4 = this.zze;
        int iHashCode5 = (iHashCode4 ^ (list4 == null ? 0 : list4.hashCode())) * 1000003;
        Integer num = this.zzf;
        int iHashCode6 = (((((iHashCode5 ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.zzg.hashCode()) * 1000003) ^ this.zzh.hashCode()) * 1000003;
        gg4 gg4Var = this.zzi;
        int iHashCode7 = (iHashCode6 ^ (gg4Var == null ? 0 : gg4Var.hashCode())) * 1000003;
        SearchNearbyRequest.RankPreference rankPreference = this.zzj;
        return iHashCode7 ^ (rankPreference != null ? rankPreference.hashCode() : 0);
    }

    public final String toString() {
        SearchNearbyRequest.RankPreference rankPreference = this.zzj;
        gg4 gg4Var = this.zzi;
        List list = this.zzh;
        LocationRestriction locationRestriction = this.zzg;
        List list2 = this.zze;
        List list3 = this.zzd;
        List list4 = this.zzc;
        return "SearchNearbyRequest{regionCode=" + this.zza + ", includedTypes=" + String.valueOf(this.zzb) + ", excludedTypes=" + String.valueOf(list4) + ", includedPrimaryTypes=" + String.valueOf(list3) + ", excludedPrimaryTypes=" + String.valueOf(list2) + ", maxResultCount=" + this.zzf + ", locationRestriction=" + locationRestriction.toString() + ", placeFields=" + list.toString() + ", cancellationToken=" + String.valueOf(gg4Var) + ", rankPreference=" + String.valueOf(rankPreference) + "}";
    }
}
