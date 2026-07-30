package com.google.android.libraries.places.api.net;

import androidx.annotation.Nullable;
import java.util.List;
import p149l.hf4;
import p149l.jfd0;
import p149l.qkq0;

/* JADX INFO: loaded from: classes7.dex */
final class zzq extends FindCurrentPlaceRequest.Builder {
    private List zza;
    private hf4 zzb;

    @Override // com.google.android.libraries.places.api.net.FindCurrentPlaceRequest.Builder
    @Nullable
    public final hf4 getCancellationToken() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.net.FindCurrentPlaceRequest.Builder
    public final FindCurrentPlaceRequest.Builder setCancellationToken(@Nullable hf4 hf4Var) {
        this.zzb = hf4Var;
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.FindCurrentPlaceRequest.Builder
    public final FindCurrentPlaceRequest.Builder zza(List list) {
        if (list != null) {
            this.zza = list;
            return this;
        }
        jfd0.m141176a("Null placeFields");
        return null;
    }

    @Override // com.google.android.libraries.places.api.net.FindCurrentPlaceRequest.Builder
    public final FindCurrentPlaceRequest zzb() {
        List list = this.zza;
        if (list != null) {
            return new zzs(list, this.zzb, null);
        }
        qkq0.m175383a("Missing required properties: placeFields");
        return null;
    }
}
