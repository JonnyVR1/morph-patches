package com.google.android.libraries.places.api.net;

import androidx.annotation.Nullable;
import com.google.android.libraries.places.api.model.PhotoMetadata;
import p149l.hf4;
import p149l.jfd0;
import p149l.qkq0;

/* JADX INFO: loaded from: classes7.dex */
final class zzi extends FetchResolvedPhotoUriRequest.Builder {
    private Integer zza;
    private Integer zzb;
    private PhotoMetadata zzc;
    private hf4 zzd;

    @Override // com.google.android.libraries.places.api.net.FetchResolvedPhotoUriRequest.Builder
    @Nullable
    public final hf4 getCancellationToken() {
        return this.zzd;
    }

    @Override // com.google.android.libraries.places.api.net.FetchResolvedPhotoUriRequest.Builder
    @Nullable
    public final Integer getMaxHeight() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.net.FetchResolvedPhotoUriRequest.Builder
    @Nullable
    public final Integer getMaxWidth() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.api.net.FetchResolvedPhotoUriRequest.Builder
    public final FetchResolvedPhotoUriRequest.Builder setCancellationToken(@Nullable hf4 hf4Var) {
        this.zzd = hf4Var;
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.FetchResolvedPhotoUriRequest.Builder
    public final FetchResolvedPhotoUriRequest.Builder setMaxHeight(@Nullable Integer num) {
        this.zzb = num;
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.FetchResolvedPhotoUriRequest.Builder
    public final FetchResolvedPhotoUriRequest.Builder setMaxWidth(@Nullable Integer num) {
        this.zza = num;
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.FetchResolvedPhotoUriRequest.Builder
    public final PhotoMetadata zza() {
        PhotoMetadata photoMetadata = this.zzc;
        if (photoMetadata != null) {
            return photoMetadata;
        }
        qkq0.m175383a("Property \"photoMetadata\" has not been set");
        return null;
    }

    public final FetchResolvedPhotoUriRequest.Builder zzb(PhotoMetadata photoMetadata) {
        if (photoMetadata != null) {
            this.zzc = photoMetadata;
            return this;
        }
        jfd0.m141176a("Null photoMetadata");
        return null;
    }

    @Override // com.google.android.libraries.places.api.net.FetchResolvedPhotoUriRequest.Builder
    public final FetchResolvedPhotoUriRequest zzc() {
        PhotoMetadata photoMetadata = this.zzc;
        if (photoMetadata != null) {
            return new zzk(this.zza, this.zzb, photoMetadata, this.zzd, null);
        }
        qkq0.m175383a("Missing required properties: photoMetadata");
        return null;
    }
}
