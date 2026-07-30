package com.google.android.libraries.places.api.net;

import com.google.android.libraries.places.api.model.AutocompletePrediction;
import java.util.List;
import p149l.jfd0;

/* JADX INFO: loaded from: classes7.dex */
final class zzp extends FindAutocompletePredictionsResponse {
    private final List zza;

    public zzp(List list) {
        if (list != null) {
            this.zza = list;
        } else {
            jfd0.m141176a("Null autocompletePredictions");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof FindAutocompletePredictionsResponse) {
            return this.zza.equals(((FindAutocompletePredictionsResponse) obj).getAutocompletePredictions());
        }
        return false;
    }

    @Override // com.google.android.libraries.places.api.net.FindAutocompletePredictionsResponse
    public final List<AutocompletePrediction> getAutocompletePredictions() {
        return this.zza;
    }

    public final int hashCode() {
        return this.zza.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "FindAutocompletePredictionsResponse{autocompletePredictions=" + this.zza.toString() + "}";
    }
}
