package com.google.android.libraries.places.api.model;

import com.google.android.gms.maps.model.LatLng;
import p149l.jfd0;

/* JADX INFO: loaded from: classes7.dex */
abstract class zzac extends RectangularBounds {
    private final LatLng zza;
    private final LatLng zzb;

    public zzac(LatLng latLng, LatLng latLng2) {
        if (latLng == null) {
            jfd0.m141176a("Null southwest");
            throw null;
        }
        this.zza = latLng;
        if (latLng2 != null) {
            this.zzb = latLng2;
        } else {
            jfd0.m141176a("Null northeast");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof RectangularBounds) {
            RectangularBounds rectangularBounds = (RectangularBounds) obj;
            if (this.zza.equals(rectangularBounds.getSouthwest()) && this.zzb.equals(rectangularBounds.getNortheast())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.libraries.places.api.model.RectangularBounds
    public final LatLng getNortheast() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.model.RectangularBounds
    public final LatLng getSouthwest() {
        return this.zza;
    }

    public final int hashCode() {
        int iHashCode = this.zza.hashCode() ^ 1000003;
        return this.zzb.hashCode() ^ (iHashCode * 1000003);
    }

    public final String toString() {
        LatLng latLng = this.zzb;
        return "RectangularBounds{southwest=" + this.zza.toString() + ", northeast=" + latLng.toString() + "}";
    }
}
