package com.google.android.datatransport.cct.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public abstract class ExternalPrivacyContext {

    public static abstract class Builder {
        @NonNull
        public abstract ExternalPrivacyContext build();

        @NonNull
        public abstract Builder setPrequest(@Nullable ExternalPRequestContext externalPRequestContext);
    }

    @NonNull
    public static Builder builder() {
        return new AutoValue_ExternalPrivacyContext.Builder();
    }

    @Nullable
    public abstract ExternalPRequestContext getPrequest();
}
