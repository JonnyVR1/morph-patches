package com.google.android.libraries.places.api.net;

import androidx.annotation.Nullable;
import com.google.android.libraries.places.api.model.LocationBias;
import com.google.android.libraries.places.api.model.LocationRestriction;
import com.google.android.libraries.places.api.model.Place;
import java.util.List;
import p149l.hf4;
import p149l.jfd0;
import p149l.qkq0;

/* JADX INFO: loaded from: classes7.dex */
final class zzy extends SearchByTextRequest.Builder {
    private hf4 zza;
    private String zzb;
    private LocationBias zzc;
    private LocationRestriction zzd;
    private Integer zze;
    private Double zzf;
    private boolean zzg;
    private List zzh;
    private List zzi;
    private SearchByTextRequest.RankPreference zzj;
    private String zzk;
    private boolean zzl;
    private String zzm;
    private byte zzn;

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest.Builder
    @Nullable
    public final hf4 getCancellationToken() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest.Builder
    @Nullable
    public final String getIncludedType() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest.Builder
    @Nullable
    public final LocationBias getLocationBias() {
        return this.zzc;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest.Builder
    @Nullable
    public final LocationRestriction getLocationRestriction() {
        return this.zzd;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest.Builder
    @Nullable
    public final Integer getMaxResultCount() {
        return this.zze;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest.Builder
    @Nullable
    public final Double getMinRating() {
        return this.zzf;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest.Builder
    public final List<Place.Field> getPlaceFields() {
        List<Place.Field> list = this.zzh;
        if (list != null) {
            return list;
        }
        qkq0.m175383a("Property \"placeFields\" has not been set");
        return null;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest.Builder
    public final List<Integer> getPriceLevels() {
        List<Integer> list = this.zzi;
        if (list != null) {
            return list;
        }
        qkq0.m175383a("Property \"priceLevels\" has not been set");
        return null;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest.Builder
    @Nullable
    public final SearchByTextRequest.RankPreference getRankPreference() {
        return this.zzj;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest.Builder
    @Nullable
    public final String getRegionCode() {
        return this.zzk;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest.Builder
    public final String getTextQuery() {
        String str = this.zzm;
        if (str != null) {
            return str;
        }
        qkq0.m175383a("Property \"textQuery\" has not been set");
        return null;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest.Builder
    public final boolean isOpenNow() {
        if ((this.zzn & 1) != 0) {
            return this.zzg;
        }
        qkq0.m175383a("Property \"openNow\" has not been set");
        return false;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest.Builder
    public final boolean isStrictTypeFiltering() {
        if ((this.zzn & 2) != 0) {
            return this.zzl;
        }
        qkq0.m175383a("Property \"strictTypeFiltering\" has not been set");
        return false;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest.Builder
    public final SearchByTextRequest.Builder setCancellationToken(@Nullable hf4 hf4Var) {
        this.zza = hf4Var;
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest.Builder
    public final SearchByTextRequest.Builder setIncludedType(@Nullable String str) {
        this.zzb = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest.Builder
    public final SearchByTextRequest.Builder setLocationBias(@Nullable LocationBias locationBias) {
        this.zzc = locationBias;
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest.Builder
    public final SearchByTextRequest.Builder setLocationRestriction(@Nullable LocationRestriction locationRestriction) {
        this.zzd = locationRestriction;
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest.Builder
    public final SearchByTextRequest.Builder setMaxResultCount(@Nullable Integer num) {
        this.zze = num;
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest.Builder
    public final SearchByTextRequest.Builder setMinRating(@Nullable Double d) {
        this.zzf = d;
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest.Builder
    public final SearchByTextRequest.Builder setOpenNow(boolean z) {
        this.zzg = z;
        this.zzn = (byte) (this.zzn | 1);
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest.Builder
    public final SearchByTextRequest.Builder setPlaceFields(List<Place.Field> list) {
        if (list != null) {
            this.zzh = list;
            return this;
        }
        jfd0.m141176a("Null placeFields");
        return null;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest.Builder
    public final SearchByTextRequest.Builder setPriceLevels(List<Integer> list) {
        if (list != null) {
            this.zzi = list;
            return this;
        }
        jfd0.m141176a("Null priceLevels");
        return null;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest.Builder
    public final SearchByTextRequest.Builder setRankPreference(@Nullable SearchByTextRequest.RankPreference rankPreference) {
        this.zzj = rankPreference;
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest.Builder
    public final SearchByTextRequest.Builder setRegionCode(String str) {
        this.zzk = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest.Builder
    public final SearchByTextRequest.Builder setStrictTypeFiltering(boolean z) {
        this.zzl = z;
        this.zzn = (byte) (this.zzn | 2);
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest.Builder
    public final SearchByTextRequest.Builder setTextQuery(String str) {
        if (str != null) {
            this.zzm = str;
            return this;
        }
        jfd0.m141176a("Null textQuery");
        return null;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextRequest.Builder
    public final SearchByTextRequest zza() {
        List list;
        List list2;
        String str;
        if (this.zzn == 3 && (list = this.zzh) != null && (list2 = this.zzi) != null && (str = this.zzm) != null) {
            return new zzaa(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, list, list2, this.zzj, this.zzk, this.zzl, str, null);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.zzn & 1) == 0) {
            sb.append(" openNow");
        }
        if (this.zzh == null) {
            sb.append(" placeFields");
        }
        if (this.zzi == null) {
            sb.append(" priceLevels");
        }
        if ((this.zzn & 2) == 0) {
            sb.append(" strictTypeFiltering");
        }
        if (this.zzm == null) {
            sb.append(" textQuery");
        }
        qkq0.m175383a("Missing required properties:".concat(sb.toString()));
        return null;
    }
}
