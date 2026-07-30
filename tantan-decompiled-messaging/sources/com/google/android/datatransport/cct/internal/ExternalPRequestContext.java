package com.google.android.datatransport.cct.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public abstract class ExternalPRequestContext {

    public static abstract class Builder {
        @NonNull
        public abstract ExternalPRequestContext build();

        @NonNull
        public abstract Builder setOriginAssociatedProductId(@Nullable Integer num);
    }

    @NonNull
    public static Builder builder() {
        return new AutoValue_ExternalPRequestContext.Builder();
    }

    @Nullable
    public abstract Integer getOriginAssociatedProductId();
}
