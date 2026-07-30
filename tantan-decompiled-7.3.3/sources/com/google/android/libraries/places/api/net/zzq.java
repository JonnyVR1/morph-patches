package com.google.android.libraries.places.api.net;

import androidx.annotation.Nullable;
import java.util.List;
import p153l.gg4;
import p153l.mnd0;
import p153l.wtq0;

/* JADX INFO: loaded from: classes7.dex */
final class zzq extends FindCurrentPlaceRequest.Builder {
    private List zza;
    private gg4 zzb;

    @Override // com.google.android.libraries.places.api.net.FindCurrentPlaceRequest.Builder
    @Nullable
    public final gg4 getCancellationToken() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.net.FindCurrentPlaceRequest.Builder
    public final FindCurrentPlaceRequest.Builder setCancellationToken(@Nullable gg4 gg4Var) {
        this.zzb = gg4Var;
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.FindCurrentPlaceRequest.Builder
    public final FindCurrentPlaceRequest.Builder zza(List list) {
        if (list != null) {
            this.zza = list;
            return this;
        }
        mnd0.m159157a("Null placeFields");
        return null;
    }

    @Override // com.google.android.libraries.places.api.net.FindCurrentPlaceRequest.Builder
    public final FindCurrentPlaceRequest zzb() {
        List list = this.zza;
        if (list != null) {
            return new zzs(list, this.zzb, null);
        }
        wtq0.m207906a("Missing required properties: placeFields");
        return null;
    }
}
