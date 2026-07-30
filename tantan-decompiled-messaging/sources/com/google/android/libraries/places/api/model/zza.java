package com.google.android.libraries.places.api.model;

import androidx.annotation.Nullable;
import java.util.List;
import p149l.jfd0;
import p149l.qkq0;

/* JADX INFO: loaded from: classes7.dex */
final class zza extends AddressComponent.Builder {
    private String zza;
    private String zzb;
    private List zzc;

    @Override // com.google.android.libraries.places.api.model.AddressComponent.Builder
    @Nullable
    public final String getShortName() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.model.AddressComponent.Builder
    public final AddressComponent.Builder setShortName(@Nullable String str) {
        this.zzb = str;
        return this;
    }

    public final AddressComponent.Builder zza(String str) {
        if (str != null) {
            this.zza = str;
            return this;
        }
        jfd0.m141176a("Null name");
        return null;
    }

    @Override // com.google.android.libraries.places.api.model.AddressComponent.Builder
    public final AddressComponent.Builder zzb(List list) {
        if (list != null) {
            this.zzc = list;
            return this;
        }
        jfd0.m141176a("Null types");
        return null;
    }

    @Override // com.google.android.libraries.places.api.model.AddressComponent.Builder
    public final AddressComponent zzc() {
        List list;
        String str = this.zza;
        if (str != null && (list = this.zzc) != null) {
            return new zzak(str, this.zzb, list);
        }
        StringBuilder sb = new StringBuilder();
        if (this.zza == null) {
            sb.append(" name");
        }
        if (this.zzc == null) {
            sb.append(" types");
        }
        qkq0.m175383a("Missing required properties:".concat(sb.toString()));
        return null;
    }
}
