package com.google.android.libraries.places.api.net;

import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.libraries.places.api.model.PhotoMetadata;
import com.google.android.libraries.places.internal.zzjt;
import p149l.hf4;

/* JADX INFO: loaded from: classes7.dex */
public abstract class FetchPhotoRequest implements zzjt {

    public static abstract class Builder {
        @RecentlyNonNull
        public FetchPhotoRequest build() {
            PhotoMetadata photoMetadataZza = zza();
            if (getMaxWidth() == null && getMaxHeight() == null) {
                int width = photoMetadataZza.getWidth();
                if (width > 0) {
                    setMaxWidth(Integer.valueOf(width));
                }
                int height = photoMetadataZza.getHeight();
                if (height > 0) {
                    setMaxHeight(Integer.valueOf(height));
                }
            }
            return zzc();
        }

        @RecentlyNullable
        public abstract hf4 getCancellationToken();

        @RecentlyNullable
        public abstract Integer getMaxHeight();

        @RecentlyNullable
        public abstract Integer getMaxWidth();

        @RecentlyNonNull
        public abstract Builder setCancellationToken(@Nullable hf4 hf4Var);

        @RecentlyNonNull
        public abstract Builder setMaxHeight(@IntRange(from = 1, to = 1600) @Nullable Integer num);

        @RecentlyNonNull
        public abstract Builder setMaxWidth(@IntRange(from = 1, to = 1600) @Nullable Integer num);

        @Nullable
        public abstract PhotoMetadata zza();

        public abstract FetchPhotoRequest zzc();
    }

    @RecentlyNonNull
    public static Builder builder(@RecentlyNonNull PhotoMetadata photoMetadata) {
        zza zzaVar = new zza();
        zzaVar.zzb(photoMetadata);
        return zzaVar;
    }

    @RecentlyNonNull
    public static FetchPhotoRequest newInstance(@RecentlyNonNull PhotoMetadata photoMetadata) {
        return builder(photoMetadata).build();
    }

    @Override // com.google.android.libraries.places.internal.zzjt
    @RecentlyNullable
    public abstract hf4 getCancellationToken();

    @IntRange(from = 1, to = 1600)
    @RecentlyNullable
    public abstract Integer getMaxHeight();

    @IntRange(from = 1, to = 1600)
    @RecentlyNullable
    public abstract Integer getMaxWidth();

    @RecentlyNonNull
    public abstract PhotoMetadata getPhotoMetadata();
}
