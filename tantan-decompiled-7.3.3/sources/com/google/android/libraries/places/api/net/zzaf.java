package com.google.android.libraries.places.api.net;

import com.google.android.libraries.places.api.model.Place;
import java.util.List;
import p153l.mnd0;

/* JADX INFO: loaded from: classes7.dex */
final class zzaf extends SearchNearbyResponse {
    private final List zza;

    public zzaf(List list) {
        if (list != null) {
            this.zza = list;
        } else {
            mnd0.m159157a("Null places");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SearchNearbyResponse) {
            return this.zza.equals(((SearchNearbyResponse) obj).getPlaces());
        }
        return false;
    }

    @Override // com.google.android.libraries.places.api.net.SearchNearbyResponse
    public final List<Place> getPlaces() {
        return this.zza;
    }

    public final int hashCode() {
        return this.zza.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "SearchNearbyResponse{places=" + this.zza.toString() + "}";
    }
}
