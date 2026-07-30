package com.google.android.libraries.places.api.net;

import android.graphics.Bitmap;
import p153l.mnd0;

/* JADX INFO: loaded from: classes7.dex */
final class zzd extends FetchPhotoResponse {
    private final Bitmap zza;

    public zzd(Bitmap bitmap) {
        if (bitmap != null) {
            this.zza = bitmap;
        } else {
            mnd0.m159157a("Null bitmap");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof FetchPhotoResponse) {
            return this.zza.equals(((FetchPhotoResponse) obj).getBitmap());
        }
        return false;
    }

    @Override // com.google.android.libraries.places.api.net.FetchPhotoResponse
    public final Bitmap getBitmap() {
        return this.zza;
    }

    public final int hashCode() {
        return this.zza.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "FetchPhotoResponse{bitmap=" + this.zza.toString() + "}";
    }
}
