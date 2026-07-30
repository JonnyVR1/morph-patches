package com.google.android.libraries.places.api.net;

import androidx.annotation.Nullable;
import com.google.android.libraries.places.api.model.Place;
import java.util.List;
import p153l.gg4;

/* JADX INFO: loaded from: classes7.dex */
final class zzs extends FindCurrentPlaceRequest {
    private final List zza;

    @Nullable
    private final gg4 zzb;

    public /* synthetic */ zzs(List list, gg4 gg4Var, zzr zzrVar) {
        this.zza = list;
        this.zzb = gg4Var;
    }

    public final boolean equals(Object obj) {
        gg4 gg4Var;
        if (obj == this) {
            return true;
        }
        if (obj instanceof FindCurrentPlaceRequest) {
            FindCurrentPlaceRequest findCurrentPlaceRequest = (FindCurrentPlaceRequest) obj;
            if (this.zza.equals(findCurrentPlaceRequest.getPlaceFields()) && ((gg4Var = this.zzb) != null ? gg4Var.equals(findCurrentPlaceRequest.getCancellationToken()) : findCurrentPlaceRequest.getCancellationToken() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.libraries.places.api.net.FindCurrentPlaceRequest, com.google.android.libraries.places.internal.zzjt
    @Nullable
    public final gg4 getCancellationToken() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.net.FindCurrentPlaceRequest
    public final List<Place.Field> getPlaceFields() {
        return this.zza;
    }

    public final int hashCode() {
        int iHashCode = this.zza.hashCode() ^ 1000003;
        gg4 gg4Var = this.zzb;
        return (gg4Var == null ? 0 : gg4Var.hashCode()) ^ (iHashCode * 1000003);
    }

    public final String toString() {
        gg4 gg4Var = this.zzb;
        return "FindCurrentPlaceRequest{placeFields=" + this.zza.toString() + ", cancellationToken=" + String.valueOf(gg4Var) + "}";
    }
}
