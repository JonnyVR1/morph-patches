package com.google.android.libraries.places.api.net;

import android.graphics.Bitmap;
import androidx.annotation.RecentlyNonNull;

/* JADX INFO: loaded from: classes7.dex */
public abstract class FetchPhotoResponse {
    @RecentlyNonNull
    public static FetchPhotoResponse newInstance(@RecentlyNonNull Bitmap bitmap) {
        return new zzd(bitmap);
    }

    @RecentlyNonNull
    public abstract Bitmap getBitmap();
}
