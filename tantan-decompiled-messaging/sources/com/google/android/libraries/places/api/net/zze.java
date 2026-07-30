package com.google.android.libraries.places.api.net;

import androidx.annotation.Nullable;
import com.google.android.libraries.places.api.model.AutocompleteSessionToken;
import java.util.List;
import p149l.hf4;
import p149l.jfd0;
import p149l.qkq0;

/* JADX INFO: loaded from: classes7.dex */
final class zze extends FetchPlaceRequest.Builder {
    private String zza;
    private List zzb;
    private AutocompleteSessionToken zzc;
    private hf4 zzd;
    private String zze;

    @Override // com.google.android.libraries.places.api.net.FetchPlaceRequest.Builder
    @Nullable
    public final hf4 getCancellationToken() {
        return this.zzd;
    }

    @Override // com.google.android.libraries.places.api.net.FetchPlaceRequest.Builder
    @Nullable
    public final String getRegionCode() {
        return this.zze;
    }

    @Override // com.google.android.libraries.places.api.net.FetchPlaceRequest.Builder
    @Nullable
    public final AutocompleteSessionToken getSessionToken() {
        return this.zzc;
    }

    @Override // com.google.android.libraries.places.api.net.FetchPlaceRequest.Builder
    public final FetchPlaceRequest.Builder setCancellationToken(@Nullable hf4 hf4Var) {
        this.zzd = hf4Var;
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.FetchPlaceRequest.Builder
    public final FetchPlaceRequest.Builder setRegionCode(@Nullable String str) {
        this.zze = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.FetchPlaceRequest.Builder
    public final FetchPlaceRequest.Builder setSessionToken(@Nullable AutocompleteSessionToken autocompleteSessionToken) {
        this.zzc = autocompleteSessionToken;
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.FetchPlaceRequest.Builder
    public final FetchPlaceRequest.Builder zza(List list) {
        if (list != null) {
            this.zzb = list;
            return this;
        }
        jfd0.m141176a("Null placeFields");
        return null;
    }

    public final FetchPlaceRequest.Builder zzb(String str) {
        if (str != null) {
            this.zza = str;
            return this;
        }
        jfd0.m141176a("Null placeId");
        return null;
    }

    @Override // com.google.android.libraries.places.api.net.FetchPlaceRequest.Builder
    public final FetchPlaceRequest zzc() {
        List list;
        String str = this.zza;
        if (str != null && (list = this.zzb) != null) {
            return new zzg(str, list, this.zzc, this.zzd, this.zze, null);
        }
        StringBuilder sb = new StringBuilder();
        if (this.zza == null) {
            sb.append(" placeId");
        }
        if (this.zzb == null) {
            sb.append(" placeFields");
        }
        qkq0.m175383a("Missing required properties:".concat(sb.toString()));
        return null;
    }
}
