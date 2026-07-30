package com.google.android.libraries.places.api.net;

import androidx.annotation.Nullable;
import com.google.android.libraries.places.api.model.Place;
import p153l.gg4;

/* JADX INFO: loaded from: classes7.dex */
final class zzw extends IsOpenRequest {

    @Nullable
    private final Place zza;

    @Nullable
    private final String zzb;
    private final long zzc;

    @Nullable
    private final gg4 zzd;

    public /* synthetic */ zzw(Place place, String str, long j, gg4 gg4Var, zzv zzvVar) {
        this.zza = place;
        this.zzb = str;
        this.zzc = j;
        this.zzd = gg4Var;
    }

    public final boolean equals(Object obj) {
        gg4 gg4Var;
        if (obj == this) {
            return true;
        }
        if (obj instanceof IsOpenRequest) {
            IsOpenRequest isOpenRequest = (IsOpenRequest) obj;
            Place place = this.zza;
            if (place != null ? place.equals(isOpenRequest.getPlace()) : isOpenRequest.getPlace() == null) {
                String str = this.zzb;
                if (str != null ? str.equals(isOpenRequest.getPlaceId()) : isOpenRequest.getPlaceId() == null) {
                    if (this.zzc == isOpenRequest.getUtcTimeMillis() && ((gg4Var = this.zzd) != null ? gg4Var.equals(isOpenRequest.getCancellationToken()) : isOpenRequest.getCancellationToken() == null)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.libraries.places.api.net.IsOpenRequest, com.google.android.libraries.places.internal.zzjt
    @Nullable
    public final gg4 getCancellationToken() {
        return this.zzd;
    }

    @Override // com.google.android.libraries.places.api.net.IsOpenRequest
    @Nullable
    public final Place getPlace() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.api.net.IsOpenRequest
    @Nullable
    public final String getPlaceId() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.net.IsOpenRequest
    public final long getUtcTimeMillis() {
        return this.zzc;
    }

    public final int hashCode() {
        Place place = this.zza;
        int iHashCode = place == null ? 0 : place.hashCode();
        String str = this.zzb;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        int i = iHashCode ^ 1000003;
        long j = this.zzc;
        gg4 gg4Var = this.zzd;
        return (((((i * 1000003) ^ iHashCode2) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ (gg4Var != null ? gg4Var.hashCode() : 0);
    }

    public final String toString() {
        gg4 gg4Var = this.zzd;
        return "IsOpenRequest{place=" + String.valueOf(this.zza) + ", placeId=" + this.zzb + ", utcTimeMillis=" + this.zzc + ", cancellationToken=" + String.valueOf(gg4Var) + "}";
    }
}
