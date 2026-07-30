package com.google.android.libraries.places.api.model;

import com.google.android.gms.maps.model.LatLng;
import p153l.mnd0;
import p153l.wtq0;

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
        mnd0.m159157a("Null northeast");
        return null;
    }

    public final zzcj zzb(LatLng latLng) {
        if (latLng != null) {
            this.zza = latLng;
            return this;
        }
        mnd0.m159157a("Null southwest");
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
        wtq0.m207906a("Missing required properties:".concat(sb.toString()));
        return null;
    }
}
