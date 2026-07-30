package com.google.android.libraries.places.api.net;

import androidx.annotation.Nullable;
import com.google.android.libraries.places.api.model.AutocompleteSessionToken;
import com.google.android.libraries.places.api.model.Place;
import java.util.List;
import p149l.hf4;

/* JADX INFO: loaded from: classes7.dex */
final class zzg extends FetchPlaceRequest {
    private final String zza;
    private final List zzb;

    @Nullable
    private final AutocompleteSessionToken zzc;

    @Nullable
    private final hf4 zzd;

    @Nullable
    private final String zze;

    public /* synthetic */ zzg(String str, List list, AutocompleteSessionToken autocompleteSessionToken, hf4 hf4Var, String str2, zzf zzfVar) {
        this.zza = str;
        this.zzb = list;
        this.zzc = autocompleteSessionToken;
        this.zzd = hf4Var;
        this.zze = str2;
    }

    public final boolean equals(Object obj) {
        AutocompleteSessionToken autocompleteSessionToken;
        hf4 hf4Var;
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof FetchPlaceRequest) {
            FetchPlaceRequest fetchPlaceRequest = (FetchPlaceRequest) obj;
            if (this.zza.equals(fetchPlaceRequest.getPlaceId()) && this.zzb.equals(fetchPlaceRequest.getPlaceFields()) && ((autocompleteSessionToken = this.zzc) != null ? autocompleteSessionToken.equals(fetchPlaceRequest.getSessionToken()) : fetchPlaceRequest.getSessionToken() == null) && ((hf4Var = this.zzd) != null ? hf4Var.equals(fetchPlaceRequest.getCancellationToken()) : fetchPlaceRequest.getCancellationToken() == null) && ((str = this.zze) != null ? str.equals(fetchPlaceRequest.getRegionCode()) : fetchPlaceRequest.getRegionCode() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.libraries.places.api.net.FetchPlaceRequest, com.google.android.libraries.places.internal.zzjt
    @Nullable
    public final hf4 getCancellationToken() {
        return this.zzd;
    }

    @Override // com.google.android.libraries.places.api.net.FetchPlaceRequest
    public final List<Place.Field> getPlaceFields() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.net.FetchPlaceRequest
    public final String getPlaceId() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.api.net.FetchPlaceRequest
    @Nullable
    public final String getRegionCode() {
        return this.zze;
    }

    @Override // com.google.android.libraries.places.api.net.FetchPlaceRequest
    @Nullable
    public final AutocompleteSessionToken getSessionToken() {
        return this.zzc;
    }

    public final int hashCode() {
        int iHashCode = ((this.zza.hashCode() ^ 1000003) * 1000003) ^ this.zzb.hashCode();
        AutocompleteSessionToken autocompleteSessionToken = this.zzc;
        int iHashCode2 = ((iHashCode * 1000003) ^ (autocompleteSessionToken == null ? 0 : autocompleteSessionToken.hashCode())) * 1000003;
        hf4 hf4Var = this.zzd;
        int iHashCode3 = (iHashCode2 ^ (hf4Var == null ? 0 : hf4Var.hashCode())) * 1000003;
        String str = this.zze;
        return iHashCode3 ^ (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        hf4 hf4Var = this.zzd;
        AutocompleteSessionToken autocompleteSessionToken = this.zzc;
        return "FetchPlaceRequest{placeId=" + this.zza + ", placeFields=" + this.zzb.toString() + ", sessionToken=" + String.valueOf(autocompleteSessionToken) + ", cancellationToken=" + String.valueOf(hf4Var) + ", regionCode=" + this.zze + "}";
    }
}
