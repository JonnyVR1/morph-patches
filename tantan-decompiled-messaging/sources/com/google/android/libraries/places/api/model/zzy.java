package com.google.android.libraries.places.api.model;

import androidx.annotation.FloatRange;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import p149l.jfd0;

/* JADX INFO: loaded from: classes7.dex */
abstract class zzy extends PlaceLikelihood {
    private final Place zza;
    private final double zzb;

    public zzy(Place place, double d) {
        if (place == null) {
            jfd0.m141176a("Null place");
            throw null;
        }
        this.zza = place;
        this.zzb = d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PlaceLikelihood) {
            PlaceLikelihood placeLikelihood = (PlaceLikelihood) obj;
            if (this.zza.equals(placeLikelihood.getPlace()) && Double.doubleToLongBits(this.zzb) == Double.doubleToLongBits(placeLikelihood.getLikelihood())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.libraries.places.api.model.PlaceLikelihood
    @FloatRange(from = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, to = 1.0d)
    public final double getLikelihood() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.model.PlaceLikelihood
    public final Place getPlace() {
        return this.zza;
    }

    public final int hashCode() {
        int iHashCode = this.zza.hashCode() ^ 1000003;
        return ((int) ((Double.doubleToLongBits(this.zzb) >>> 32) ^ Double.doubleToLongBits(this.zzb))) ^ (iHashCode * 1000003);
    }

    public final String toString() {
        return "PlaceLikelihood{place=" + this.zza.toString() + ", likelihood=" + this.zzb + "}";
    }
}
