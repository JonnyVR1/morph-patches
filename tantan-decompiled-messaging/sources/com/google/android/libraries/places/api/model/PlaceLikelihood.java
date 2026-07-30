package com.google.android.libraries.places.api.model;

import android.os.Parcelable;
import androidx.annotation.FloatRange;
import androidx.annotation.RecentlyNonNull;
import com.google.android.libraries.places.internal.zzmt;
import com.google.android.libraries.places.internal.zzok;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;

/* JADX INFO: loaded from: classes7.dex */
public abstract class PlaceLikelihood implements Parcelable {
    public static final double LIKELIHOOD_MAX_VALUE = 1.0d;
    public static final double LIKELIHOOD_MIN_VALUE = 0.0d;

    @RecentlyNonNull
    public static PlaceLikelihood newInstance(@RecentlyNonNull Place place, @FloatRange(from = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, to = 1.0d) double d) {
        Double dValueOf = Double.valueOf(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
        Double dValueOf2 = Double.valueOf(1.0d);
        zzok zzokVarZzb = zzok.zzb(dValueOf, dValueOf2);
        Double dValueOf3 = Double.valueOf(d);
        zzmt.zzm(zzokVarZzb.zzd(dValueOf3), "Likelihood must not be out-of-range: %s to %s, but was: %s.", dValueOf, dValueOf2, dValueOf3);
        return new zzbm(place, d);
    }

    @FloatRange(from = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, to = 1.0d)
    public abstract double getLikelihood();

    @RecentlyNonNull
    public abstract Place getPlace();
}
