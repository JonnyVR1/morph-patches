package com.google.android.libraries.places.api.net;

import androidx.annotation.Nullable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.libraries.places.api.model.CircularBounds;
import com.google.android.libraries.places.api.model.LocationRestriction;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.internal.zzjt;
import com.google.android.libraries.places.internal.zzmt;
import com.google.android.libraries.places.internal.zznx;
import java.util.List;
import p153l.gg4;

/* JADX INFO: loaded from: classes7.dex */
public abstract class SearchNearbyRequest implements zzjt {

    public static abstract class Builder {
        @RecentlyNonNull
        public SearchNearbyRequest build() {
            List<Place.Field> placeFields = getPlaceFields();
            boolean z = getLocationRestriction() instanceof CircularBounds;
            List<String> includedTypes = getIncludedTypes();
            List<String> excludedTypes = getExcludedTypes();
            List<String> includedPrimaryTypes = getIncludedPrimaryTypes();
            List<String> excludedPrimaryTypes = getExcludedPrimaryTypes();
            zzmt.zzf(z, "LocationRestriction must be of type CircularBounds.");
            setPlaceFields(zznx.zzj(placeFields));
            if (includedTypes != null) {
                setIncludedTypes(zznx.zzj(includedTypes));
            }
            if (excludedTypes != null) {
                setExcludedTypes(zznx.zzj(excludedTypes));
            }
            if (includedPrimaryTypes != null) {
                setIncludedPrimaryTypes(zznx.zzj(includedPrimaryTypes));
            }
            if (excludedPrimaryTypes != null) {
                setExcludedPrimaryTypes(zznx.zzj(excludedPrimaryTypes));
            }
            return zza();
        }

        @RecentlyNullable
        public abstract gg4 getCancellationToken();

        @RecentlyNullable
        public abstract List<String> getExcludedPrimaryTypes();

        @RecentlyNullable
        public abstract List<String> getExcludedTypes();

        @RecentlyNullable
        public abstract List<String> getIncludedPrimaryTypes();

        @RecentlyNullable
        public abstract List<String> getIncludedTypes();

        @RecentlyNonNull
        public abstract LocationRestriction getLocationRestriction();

        @RecentlyNullable
        public abstract Integer getMaxResultCount();

        @RecentlyNonNull
        public abstract List<Place.Field> getPlaceFields();

        @RecentlyNullable
        public abstract RankPreference getRankPreference();

        @RecentlyNullable
        public abstract String getRegionCode();

        @RecentlyNonNull
        public abstract Builder setCancellationToken(@Nullable gg4 gg4Var);

        @RecentlyNonNull
        public abstract Builder setExcludedPrimaryTypes(@Nullable List<String> list);

        @RecentlyNonNull
        public abstract Builder setExcludedTypes(@Nullable List<String> list);

        @RecentlyNonNull
        public abstract Builder setIncludedPrimaryTypes(@Nullable List<String> list);

        @RecentlyNonNull
        public abstract Builder setIncludedTypes(@Nullable List<String> list);

        @RecentlyNonNull
        public abstract Builder setLocationRestriction(@RecentlyNonNull LocationRestriction locationRestriction);

        @RecentlyNonNull
        public abstract Builder setMaxResultCount(@Nullable Integer num);

        @RecentlyNonNull
        public abstract Builder setPlaceFields(@RecentlyNonNull List<Place.Field> list);

        @RecentlyNonNull
        public abstract Builder setRankPreference(@Nullable RankPreference rankPreference);

        @RecentlyNonNull
        public abstract Builder setRegionCode(@Nullable String str);

        public abstract SearchNearbyRequest zza();
    }

    public enum RankPreference {
        DISTANCE,
        POPULARITY
    }

    @RecentlyNonNull
    public static Builder builder(@RecentlyNonNull LocationRestriction locationRestriction, @RecentlyNonNull List<Place.Field> list) {
        zzac zzacVar = new zzac();
        zzacVar.setLocationRestriction(locationRestriction);
        zzacVar.setPlaceFields(list);
        return zzacVar;
    }

    @RecentlyNonNull
    public static SearchNearbyRequest newInstance(@RecentlyNonNull LocationRestriction locationRestriction, @RecentlyNonNull List<Place.Field> list) {
        return builder(locationRestriction, list).build();
    }

    @Override // com.google.android.libraries.places.internal.zzjt
    @RecentlyNullable
    public abstract gg4 getCancellationToken();

    @RecentlyNullable
    public abstract List<String> getExcludedPrimaryTypes();

    @RecentlyNullable
    public abstract List<String> getExcludedTypes();

    @RecentlyNullable
    public abstract List<String> getIncludedPrimaryTypes();

    @RecentlyNullable
    public abstract List<String> getIncludedTypes();

    @RecentlyNonNull
    public abstract LocationRestriction getLocationRestriction();

    @RecentlyNullable
    public abstract Integer getMaxResultCount();

    @RecentlyNonNull
    public abstract List<Place.Field> getPlaceFields();

    @RecentlyNullable
    public abstract RankPreference getRankPreference();

    @RecentlyNullable
    public abstract String getRegionCode();
}
