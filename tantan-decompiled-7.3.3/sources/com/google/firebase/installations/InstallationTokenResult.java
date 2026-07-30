package com.google.firebase.installations;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes7.dex */
public abstract class InstallationTokenResult {

    public static abstract class Builder {
        @NonNull
        public abstract InstallationTokenResult build();

        @NonNull
        public abstract Builder setToken(@NonNull String str);

        @NonNull
        public abstract Builder setTokenCreationTimestamp(long j);

        @NonNull
        public abstract Builder setTokenExpirationTimestamp(long j);
    }

    @NonNull
    public static Builder builder() {
        return new AutoValue_InstallationTokenResult.Builder();
    }

    @NonNull
    public abstract String getToken();

    @NonNull
    public abstract long getTokenCreationTimestamp();

    @NonNull
    public abstract long getTokenExpirationTimestamp();

    @NonNull
    public abstract Builder toBuilder();
}
