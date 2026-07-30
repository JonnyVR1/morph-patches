package com.google.android.libraries.places.api.net;

import androidx.annotation.Nullable;
import com.google.android.libraries.places.api.model.Place;
import p149l.hf4;
import p149l.qkq0;

/* JADX INFO: loaded from: classes7.dex */
final class zzu extends IsOpenRequest.Builder {
    private Place zza;
    private String zzb;
    private long zzc;
    private hf4 zzd;
    private byte zze;

    @Override // com.google.android.libraries.places.api.net.IsOpenRequest.Builder
    @Nullable
    public final hf4 getCancellationToken() {
        return this.zzd;
    }

    @Override // com.google.android.libraries.places.api.net.IsOpenRequest.Builder
    @Nullable
    public final Place getPlace() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.api.net.IsOpenRequest.Builder
    @Nullable
    public final String getPlaceId() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.net.IsOpenRequest.Builder
    public final long getUtcTimeMillis() {
        if (this.zze != 0) {
            return this.zzc;
        }
        qkq0.m175383a("Property \"utcTimeMillis\" has not been set");
        return 0L;
    }

    @Override // com.google.android.libraries.places.api.net.IsOpenRequest.Builder
    public final IsOpenRequest.Builder setCancellationToken(@Nullable hf4 hf4Var) {
        this.zzd = hf4Var;
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.IsOpenRequest.Builder
    public final IsOpenRequest.Builder setPlace(Place place) {
        this.zza = place;
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.IsOpenRequest.Builder
    public final IsOpenRequest.Builder setPlaceId(String str) {
        this.zzb = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.IsOpenRequest.Builder
    public final IsOpenRequest.Builder setUtcTimeMillis(long j) {
        this.zzc = j;
        this.zze = (byte) 1;
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.IsOpenRequest.Builder
    public final IsOpenRequest zza() {
        if (this.zze == 1) {
            return new zzw(this.zza, this.zzb, this.zzc, this.zzd, null);
        }
        qkq0.m175383a("Missing required properties: utcTimeMillis");
        return null;
    }
}
