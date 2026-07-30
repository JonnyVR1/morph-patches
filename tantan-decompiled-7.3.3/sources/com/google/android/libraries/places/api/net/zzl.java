package com.google.android.libraries.places.api.net;

import android.net.Uri;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes7.dex */
final class zzl extends FetchResolvedPhotoUriResponse {

    @Nullable
    private final Uri zza;

    public zzl(@Nullable Uri uri) {
        this.zza = uri;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FetchResolvedPhotoUriResponse)) {
            return false;
        }
        FetchResolvedPhotoUriResponse fetchResolvedPhotoUriResponse = (FetchResolvedPhotoUriResponse) obj;
        Uri uri = this.zza;
        if (uri == null) {
            return fetchResolvedPhotoUriResponse.getUri() == null;
        }
        return uri.equals(fetchResolvedPhotoUriResponse.getUri());
    }

    @Override // com.google.android.libraries.places.api.net.FetchResolvedPhotoUriResponse
    @Nullable
    public final Uri getUri() {
        return this.zza;
    }

    public final int hashCode() {
        Uri uri = this.zza;
        return (uri == null ? 0 : uri.hashCode()) ^ 1000003;
    }

    public final String toString() {
        return "FetchResolvedPhotoUriResponse{uri=" + String.valueOf(this.zza) + "}";
    }
}
