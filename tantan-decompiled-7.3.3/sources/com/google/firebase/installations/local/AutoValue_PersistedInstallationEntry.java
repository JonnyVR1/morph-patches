package com.google.firebase.installations.local;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p153l.mnd0;
import p153l.wtq0;

/* JADX INFO: loaded from: classes7.dex */
final class AutoValue_PersistedInstallationEntry extends PersistedInstallationEntry {
    private final String authToken;
    private final long expiresInSecs;
    private final String firebaseInstallationId;
    private final String fisError;
    private final String refreshToken;
    private final PersistedInstallation.RegistrationStatus registrationStatus;
    private final long tokenCreationEpochInSecs;

    private AutoValue_PersistedInstallationEntry(@Nullable String str, PersistedInstallation.RegistrationStatus registrationStatus, @Nullable String str2, @Nullable String str3, long j, long j2, @Nullable String str4) {
        this.firebaseInstallationId = str;
        this.registrationStatus = registrationStatus;
        this.authToken = str2;
        this.refreshToken = str3;
        this.expiresInSecs = j;
        this.tokenCreationEpochInSecs = j2;
        this.fisError = str4;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        if (obj == this) {
            return true;
        }
        if (obj instanceof PersistedInstallationEntry) {
            PersistedInstallationEntry persistedInstallationEntry = (PersistedInstallationEntry) obj;
            String str4 = this.firebaseInstallationId;
            if (str4 != null ? str4.equals(persistedInstallationEntry.getFirebaseInstallationId()) : persistedInstallationEntry.getFirebaseInstallationId() == null) {
                if (this.registrationStatus.equals(persistedInstallationEntry.getRegistrationStatus()) && ((str = this.authToken) != null ? str.equals(persistedInstallationEntry.getAuthToken()) : persistedInstallationEntry.getAuthToken() == null) && ((str2 = this.refreshToken) != null ? str2.equals(persistedInstallationEntry.getRefreshToken()) : persistedInstallationEntry.getRefreshToken() == null) && this.expiresInSecs == persistedInstallationEntry.getExpiresInSecs() && this.tokenCreationEpochInSecs == persistedInstallationEntry.getTokenCreationEpochInSecs() && ((str3 = this.fisError) != null ? str3.equals(persistedInstallationEntry.getFisError()) : persistedInstallationEntry.getFisError() == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.firebase.installations.local.PersistedInstallationEntry
    @Nullable
    public String getAuthToken() {
        return this.authToken;
    }

    @Override // com.google.firebase.installations.local.PersistedInstallationEntry
    public long getExpiresInSecs() {
        return this.expiresInSecs;
    }

    @Override // com.google.firebase.installations.local.PersistedInstallationEntry
    @Nullable
    public String getFirebaseInstallationId() {
        return this.firebaseInstallationId;
    }

    @Override // com.google.firebase.installations.local.PersistedInstallationEntry
    @Nullable
    public String getFisError() {
        return this.fisError;
    }

    @Override // com.google.firebase.installations.local.PersistedInstallationEntry
    @Nullable
    public String getRefreshToken() {
        return this.refreshToken;
    }

    @Override // com.google.firebase.installations.local.PersistedInstallationEntry
    @NonNull
    public PersistedInstallation.RegistrationStatus getRegistrationStatus() {
        return this.registrationStatus;
    }

    @Override // com.google.firebase.installations.local.PersistedInstallationEntry
    public long getTokenCreationEpochInSecs() {
        return this.tokenCreationEpochInSecs;
    }

    public int hashCode() {
        String str = this.firebaseInstallationId;
        int iHashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.registrationStatus.hashCode()) * 1000003;
        String str2 = this.authToken;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.refreshToken;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        long j = this.expiresInSecs;
        int i = (iHashCode3 ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.tokenCreationEpochInSecs;
        int i2 = (i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        String str4 = this.fisError;
        return i2 ^ (str4 != null ? str4.hashCode() : 0);
    }

    @Override // com.google.firebase.installations.local.PersistedInstallationEntry
    public PersistedInstallationEntry.Builder toBuilder() {
        return new Builder(this);
    }

    public String toString() {
        return "PersistedInstallationEntry{firebaseInstallationId=" + this.firebaseInstallationId + ", registrationStatus=" + this.registrationStatus + ", authToken=" + this.authToken + ", refreshToken=" + this.refreshToken + ", expiresInSecs=" + this.expiresInSecs + ", tokenCreationEpochInSecs=" + this.tokenCreationEpochInSecs + ", fisError=" + this.fisError + "}";
    }

    public static final class Builder extends PersistedInstallationEntry.Builder {
        private String authToken;
        private Long expiresInSecs;
        private String firebaseInstallationId;
        private String fisError;
        private String refreshToken;
        private PersistedInstallation.RegistrationStatus registrationStatus;
        private Long tokenCreationEpochInSecs;

        private Builder(PersistedInstallationEntry persistedInstallationEntry) {
            this.firebaseInstallationId = persistedInstallationEntry.getFirebaseInstallationId();
            this.registrationStatus = persistedInstallationEntry.getRegistrationStatus();
            this.authToken = persistedInstallationEntry.getAuthToken();
            this.refreshToken = persistedInstallationEntry.getRefreshToken();
            this.expiresInSecs = Long.valueOf(persistedInstallationEntry.getExpiresInSecs());
            this.tokenCreationEpochInSecs = Long.valueOf(persistedInstallationEntry.getTokenCreationEpochInSecs());
            this.fisError = persistedInstallationEntry.getFisError();
        }

        @Override // com.google.firebase.installations.local.PersistedInstallationEntry.Builder
        public PersistedInstallationEntry build() {
            String strConcat = this.registrationStatus == null ? " registrationStatus" : "";
            if (this.expiresInSecs == null) {
                strConcat = strConcat.concat(" expiresInSecs");
            }
            if (this.tokenCreationEpochInSecs == null) {
                strConcat = strConcat.concat(" tokenCreationEpochInSecs");
            }
            if (strConcat.isEmpty()) {
                return new AutoValue_PersistedInstallationEntry(this.firebaseInstallationId, this.registrationStatus, this.authToken, this.refreshToken, this.expiresInSecs.longValue(), this.tokenCreationEpochInSecs.longValue(), this.fisError);
            }
            wtq0.m207906a("Missing required properties:".concat(strConcat));
            return null;
        }

        @Override // com.google.firebase.installations.local.PersistedInstallationEntry.Builder
        public PersistedInstallationEntry.Builder setAuthToken(@Nullable String str) {
            this.authToken = str;
            return this;
        }

        @Override // com.google.firebase.installations.local.PersistedInstallationEntry.Builder
        public PersistedInstallationEntry.Builder setExpiresInSecs(long j) {
            this.expiresInSecs = Long.valueOf(j);
            return this;
        }

        @Override // com.google.firebase.installations.local.PersistedInstallationEntry.Builder
        public PersistedInstallationEntry.Builder setFirebaseInstallationId(String str) {
            this.firebaseInstallationId = str;
            return this;
        }

        @Override // com.google.firebase.installations.local.PersistedInstallationEntry.Builder
        public PersistedInstallationEntry.Builder setFisError(@Nullable String str) {
            this.fisError = str;
            return this;
        }

        @Override // com.google.firebase.installations.local.PersistedInstallationEntry.Builder
        public PersistedInstallationEntry.Builder setRefreshToken(@Nullable String str) {
            this.refreshToken = str;
            return this;
        }

        @Override // com.google.firebase.installations.local.PersistedInstallationEntry.Builder
        public PersistedInstallationEntry.Builder setRegistrationStatus(PersistedInstallation.RegistrationStatus registrationStatus) {
            if (registrationStatus != null) {
                this.registrationStatus = registrationStatus;
                return this;
            }
            mnd0.m159157a("Null registrationStatus");
            return null;
        }

        @Override // com.google.firebase.installations.local.PersistedInstallationEntry.Builder
        public PersistedInstallationEntry.Builder setTokenCreationEpochInSecs(long j) {
            this.tokenCreationEpochInSecs = Long.valueOf(j);
            return this;
        }

        public Builder() {
        }
    }
}
