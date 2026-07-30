package com.google.android.libraries.places.api.model;

import androidx.annotation.Nullable;
import p149l.jfd0;
import p149l.qkq0;

/* JADX INFO: loaded from: classes7.dex */
final class zzd extends AuthorAttribution.Builder {
    private String zza;
    private String zzb;
    private String zzc;

    @Override // com.google.android.libraries.places.api.model.AuthorAttribution.Builder
    @Nullable
    public final String getPhotoUri() {
        return this.zzc;
    }

    @Override // com.google.android.libraries.places.api.model.AuthorAttribution.Builder
    @Nullable
    public final String getUri() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.model.AuthorAttribution.Builder
    public final AuthorAttribution.Builder setPhotoUri(@Nullable String str) {
        this.zzc = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.AuthorAttribution.Builder
    public final AuthorAttribution.Builder setUri(@Nullable String str) {
        this.zzb = str;
        return this;
    }

    public final AuthorAttribution.Builder zza(String str) {
        if (str != null) {
            this.zza = str;
            return this;
        }
        jfd0.m141176a("Null name");
        return null;
    }

    @Override // com.google.android.libraries.places.api.model.AuthorAttribution.Builder
    public final AuthorAttribution zzb() {
        String str = this.zza;
        if (str != null) {
            return new zzao(str, this.zzb, this.zzc);
        }
        qkq0.m175383a("Missing required properties: name");
        return null;
    }
}
