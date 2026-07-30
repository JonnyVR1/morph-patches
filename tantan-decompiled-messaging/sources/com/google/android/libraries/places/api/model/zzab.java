package com.google.android.libraries.places.api.model;

import com.google.android.gms.maps.model.LatLng;
import p149l.jfd0;
import p149l.qkq0;

/* JADX INFO: loaded from: classes7.dex */
final class zzab extends zzcj {
    private LatLng zza;
    private LatLng zzb;

    @Override // com.google.android.libraries.places.api.model.zzcj
    public final zzcj zza(LatLng latLng) {
        if (latLng != null) {
            this.zzb = latLng;
            return this;
        }
        jfd0.m141176a("Null northeast");
        return null;
    }

    public final zzcj zzb(LatLng latLng) {
        if (latLng != null) {
            this.zza = latLng;
            return this;
        }
        jfd0.m141176a("Null southwest");
        return null;
    }

    @Override // com.google.android.libraries.places.api.model.zzcj
    public final RectangularBounds zzc() {
        LatLng latLng;
        LatLng latLng2 = this.zza;
        if (latLng2 != null && (latLng = this.zzb) != null) {
            return new zzbq(latLng2, latLng);
        }
        StringBuilder sb = new StringBuilder();
        if (this.zza == null) {
            sb.append(" southwest");
        }
        if (this.zzb == null) {
            sb.append(" northeast");
        }
        qkq0.m175383a("Missing required properties:".concat(sb.toString()));
        return null;
    }
}
