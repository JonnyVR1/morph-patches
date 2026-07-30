package com.google.android.libraries.places.api.model;

import android.os.Parcelable;
import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.libraries.places.internal.zzmt;

/* JADX INFO: loaded from: classes7.dex */
public abstract class PhotoMetadata implements Parcelable {

    public static abstract class Builder {
        @RecentlyNonNull
        public PhotoMetadata build() {
            PhotoMetadata photoMetadataZzc = zzc();
            int width = photoMetadataZzc.getWidth();
            zzmt.zzq(width >= 0, "Width must not be < 0, but was: %s.", width);
            int height = photoMetadataZzc.getHeight();
            zzmt.zzq(height >= 0, "Height must not be < 0, but was: %s.", height);
            zzmt.zzp(!photoMetadataZzc.zzb().isEmpty(), "PhotoReference must not be null or empty.");
            return photoMetadataZzc;
        }

        @RecentlyNonNull
        public abstract String getAttributions();

        @RecentlyNullable
        public abstract AuthorAttributions getAuthorAttributions();

        @IntRange(from = 0)
        public abstract int getHeight();

        @IntRange(from = 0)
        public abstract int getWidth();

        @RecentlyNonNull
        public abstract Builder setAttributions(@RecentlyNonNull String str);

        @RecentlyNonNull
        public abstract Builder setAuthorAttributions(@Nullable AuthorAttributions authorAttributions);

        @RecentlyNonNull
        public abstract Builder setHeight(@IntRange(from = 0) int i);

        @RecentlyNonNull
        public abstract Builder setWidth(@IntRange(from = 0) int i);

        @RecentlyNonNull
        public abstract Builder zza(@Nullable String str);

        public abstract PhotoMetadata zzc();
    }

    @RecentlyNonNull
    public static Builder builder(@RecentlyNonNull String str) {
        zzu zzuVar = new zzu();
        zzuVar.zzb(str);
        zzuVar.setWidth(0);
        zzuVar.setHeight(0);
        zzuVar.setAttributions("");
        return zzuVar;
    }

    @RecentlyNonNull
    public abstract String getAttributions();

    @RecentlyNullable
    public abstract AuthorAttributions getAuthorAttributions();

    @IntRange(from = 0)
    public abstract int getHeight();

    @IntRange(from = 0)
    public abstract int getWidth();

    @RecentlyNullable
    public abstract String zza();

    @RecentlyNonNull
    public abstract String zzb();
}
