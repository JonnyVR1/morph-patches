package com.google.android.libraries.places.api.model;

import com.google.android.gms.maps.model.LatLng;
import p149l.jfd0;

/* JADX INFO: loaded from: classes7.dex */
abstract class zzl extends CircularBounds {
    private final LatLng zza;
    private final double zzb;

    public zzl(LatLng latLng, double d) {
        if (latLng == null) {
            jfd0.m141176a("Null center");
            throw null;
        }
        this.zza = latLng;
        this.zzb = d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CircularBounds) {
            CircularBounds circularBounds = (CircularBounds) obj;
            if (this.zza.equals(circularBounds.getCenter()) && Double.doubleToLongBits(this.zzb) == Double.doubleToLongBits(circularBounds.getRadius())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.libraries.places.api.model.CircularBounds
    public final LatLng getCenter() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.api.model.CircularBounds
    public final double getRadius() {
        return this.zzb;
    }

    public final int hashCode() {
        int iHashCode = this.zza.hashCode() ^ 1000003;
        return ((int) ((Double.doubleToLongBits(this.zzb) >>> 32) ^ Double.doubleToLongBits(this.zzb))) ^ (iHashCode * 1000003);
    }

    public final String toString() {
        return "CircularBounds{center=" + this.zza.toString() + ", radius=" + this.zzb + "}";
    }
}
