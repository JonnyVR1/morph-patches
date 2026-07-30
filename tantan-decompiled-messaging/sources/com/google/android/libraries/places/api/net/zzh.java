package com.google.android.libraries.places.api.net;

import com.google.android.libraries.places.api.model.Place;
import p149l.jfd0;

/* JADX INFO: loaded from: classes7.dex */
final class zzh extends FetchPlaceResponse {
    private final Place zza;

    public zzh(Place place) {
        if (place != null) {
            this.zza = place;
        } else {
            jfd0.m141176a("Null place");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof FetchPlaceResponse) {
            return this.zza.equals(((FetchPlaceResponse) obj).getPlace());
        }
        return false;
    }

    @Override // com.google.android.libraries.places.api.net.FetchPlaceResponse
    public final Place getPlace() {
        return this.zza;
    }

    public final int hashCode() {
        return this.zza.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "FetchPlaceResponse{place=" + this.zza.toString() + "}";
    }
}
