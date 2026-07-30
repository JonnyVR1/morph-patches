package com.google.android.libraries.places.api.net;

import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.libraries.places.api.model.LocationBias;
import com.google.android.libraries.places.api.model.LocationRestriction;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.internal.zzjt;
import com.google.android.libraries.places.internal.zzmt;
import com.google.android.libraries.places.internal.zznx;
import com.google.android.libraries.places.internal.zzok;
import java.util.ArrayList;
import java.util.List;
import p149l.hf4;

/* JADX INFO: loaded from: classes7.dex */
public abstract class SearchByTextRequest implements zzjt {

    public static abstract class Builder {
        @RecentlyNonNull
        public SearchByTextRequest build() {
            Double dValueOf = Double.valueOf(5.0d);
            Double dValueOf2 = Double.valueOf(1.0d);
            setPlaceFields(zznx.zzj(getPlaceFields()));
            setPriceLevels(zznx.zzj(getPriceLevels()));
            Double minRating = getMinRating();
            if (minRating != null) {
                zzmt.zzm(minRating.doubleValue() >= 1.0d && minRating.doubleValue() <= 5.0d, "Min rating must not be out of range of %s to %s, but was: %s.", dValueOf2, dValueOf, minRating);
            }
            List<Integer> priceLevels = getPriceLevels();
            if (!priceLevels.isEmpty()) {
                for (Integer num : priceLevels) {
                    zzmt.zzm(zzok.zzb(0, 4).zzd(num), "Price level must not be out of range of %s to %s, but was: %s.", dValueOf2, dValueOf, num);
                }
            }
            return zza();
        }

        @RecentlyNullable
        public abstract hf4 getCancellationToken();

        @RecentlyNullable
        public abstract String getIncludedType();

        @RecentlyNullable
        public abstract LocationBias getLocationBias();

        @RecentlyNullable
        public abstract LocationRestriction getLocationRestriction();

        @RecentlyNullable
        public abstract Integer getMaxResultCount();

        @RecentlyNullable
        public abstract Double getMinRating();

        @RecentlyNonNull
        public abstract List<Place.Field> getPlaceFields();

        @RecentlyNonNull
        public abstract List<Integer> getPriceLevels();

        @RecentlyNullable
        public abstract RankPreference getRankPreference();

        @RecentlyNonNull
        public abstract String getRegionCode();

        @RecentlyNonNull
        public abstract String getTextQuery();

        public abstract boolean isOpenNow();

        public abstract boolean isStrictTypeFiltering();

        @RecentlyNonNull
        public abstract Builder setCancellationToken(@Nullable hf4 hf4Var);

        @RecentlyNonNull
        public abstract Builder setIncludedType(@Nullable String str);

        @RecentlyNonNull
        public abstract Builder setLocationBias(@Nullable LocationBias locationBias);

        @RecentlyNonNull
        public abstract Builder setLocationRestriction(@Nullable LocationRestriction locationRestriction);

        @RecentlyNonNull
        public abstract Builder setMaxResultCount(@Nullable Integer num);

        @RecentlyNonNull
        public abstract Builder setMinRating(@Nullable @FloatRange(from = 1.0d, to = Place.RATING_MAX_VALUE) Double d);

        @RecentlyNonNull
        public abstract Builder setOpenNow(boolean z);

        @RecentlyNonNull
        public abstract Builder setPlaceFields(@RecentlyNonNull List<Place.Field> list);

        @RecentlyNonNull
        public abstract Builder setPriceLevels(@RecentlyNonNull List<Integer> list);

        @RecentlyNonNull
        public abstract Builder setRankPreference(@Nullable RankPreference rankPreference);

        @RecentlyNonNull
        public abstract Builder setRegionCode(@RecentlyNonNull String str);

        @RecentlyNonNull
        public abstract Builder setStrictTypeFiltering(boolean z);

        @RecentlyNonNull
        public abstract Builder setTextQuery(@RecentlyNonNull String str);

        public abstract SearchByTextRequest zza();
    }

    public enum RankPreference {
        DISTANCE,
        RELEVANCE
    }

    @RecentlyNonNull
    public static Builder builder(@RecentlyNonNull String str, @RecentlyNonNull List<Place.Field> list) {
        zzy zzyVar = new zzy();
        zzyVar.setOpenNow(false);
        zzyVar.setPlaceFields(list);
        zzyVar.setPriceLevels(new ArrayList());
        zzyVar.setTextQuery(str);
        zzyVar.setStrictTypeFiltering(false);
        return zzyVar;
    }

    @RecentlyNonNull
    public static SearchByTextRequest newInstance(@RecentlyNonNull String str, @RecentlyNonNull List<Place.Field> list) {
        return builder(str, list).build();
    }

    @RecentlyNullable
    public abstract String getIncludedType();

    @RecentlyNullable
    public abstract LocationBias getLocationBias();

    @RecentlyNullable
    public abstract LocationRestriction getLocationRestriction();

    @RecentlyNullable
    public abstract Integer getMaxResultCount();

    @RecentlyNullable
    @FloatRange(from = 1.0d, to = Place.RATING_MAX_VALUE)
    public abstract Double getMinRating();

    @RecentlyNonNull
    public abstract List<Place.Field> getPlaceFields();

    @IntRange(from = 0, to = 4)
    @RecentlyNonNull
    public abstract List<Integer> getPriceLevels();

    @RecentlyNullable
    public abstract RankPreference getRankPreference();

    @RecentlyNullable
    public abstract String getRegionCode();

    @RecentlyNonNull
    public abstract String getTextQuery();

    public abstract boolean isOpenNow();

    public abstract boolean isStrictTypeFiltering();
}
