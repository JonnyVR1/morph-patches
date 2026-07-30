package com.google.firebase.remoteconfig;

import androidx.annotation.NonNull;
import com.google.firebase.remoteconfig.internal.ConfigFetchHandler;
import p149l.dqi0;

/* JADX INFO: loaded from: classes7.dex */
public class FirebaseRemoteConfigSettings {
    private final long fetchTimeoutInSeconds;
    private final long minimumFetchInterval;

    public static class Builder {
        private long fetchTimeoutInSeconds = 60;
        private long minimumFetchInterval = ConfigFetchHandler.DEFAULT_MINIMUM_FETCH_INTERVAL_IN_SECONDS;

        @NonNull
        public FirebaseRemoteConfigSettings build() {
            return new FirebaseRemoteConfigSettings(this);
        }

        public long getFetchTimeoutInSeconds() {
            return this.fetchTimeoutInSeconds;
        }

        public long getMinimumFetchIntervalInSeconds() {
            return this.minimumFetchInterval;
        }

        @NonNull
        public Builder setFetchTimeoutInSeconds(long j) throws IllegalArgumentException {
            if (j >= 0) {
                this.fetchTimeoutInSeconds = j;
                return this;
            }
            dqi0.m113073a("Fetch connection timeout has to be a non-negative number. %d is an invalid argument", new Object[]{Long.valueOf(j)});
            return null;
        }

        @NonNull
        public Builder setMinimumFetchIntervalInSeconds(long j) {
            if (j >= 0) {
                this.minimumFetchInterval = j;
                return this;
            }
            throw new IllegalArgumentException("Minimum interval between fetches has to be a non-negative number. " + j + " is an invalid argument");
        }
    }

    private FirebaseRemoteConfigSettings(Builder builder) {
        this.fetchTimeoutInSeconds = builder.fetchTimeoutInSeconds;
        this.minimumFetchInterval = builder.minimumFetchInterval;
    }

    public long getFetchTimeoutInSeconds() {
        return this.fetchTimeoutInSeconds;
    }

    public long getMinimumFetchIntervalInSeconds() {
        return this.minimumFetchInterval;
    }

    @NonNull
    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.setFetchTimeoutInSeconds(getFetchTimeoutInSeconds());
        builder.setMinimumFetchIntervalInSeconds(getMinimumFetchIntervalInSeconds());
        return builder;
    }
}
