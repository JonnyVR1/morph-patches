package com.google.android.libraries.places.api.net;

import com.google.android.libraries.places.api.model.PlaceLikelihood;
import java.util.List;
import p149l.jfd0;

/* JADX INFO: loaded from: classes7.dex */
final class zzt extends FindCurrentPlaceResponse {
    private final List zza;

    public zzt(List list) {
        if (list != null) {
            this.zza = list;
        } else {
            jfd0.m141176a("Null placeLikelihoods");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof FindCurrentPlaceResponse) {
            return this.zza.equals(((FindCurrentPlaceResponse) obj).getPlaceLikelihoods());
        }
        return false;
    }

    @Override // com.google.android.libraries.places.api.net.FindCurrentPlaceResponse
    public final List<PlaceLikelihood> getPlaceLikelihoods() {
        return this.zza;
    }

    public final int hashCode() {
        return this.zza.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "FindCurrentPlaceResponse{placeLikelihoods=" + this.zza.toString() + "}";
    }
}
