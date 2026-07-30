package com.google.firebase.crashlytics.internal.common;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes7.dex */
public interface InstallIdProvider {

    public static abstract class InstallIds {
        public static InstallIds create(String str, FirebaseInstallationId firebaseInstallationId) {
            return new AutoValue_InstallIdProvider_InstallIds(str, firebaseInstallationId.getFid(), firebaseInstallationId.getAuthToken());
        }

        public static InstallIds createWithoutFid(String str) {
            return new AutoValue_InstallIdProvider_InstallIds(str, null, null);
        }

        @NonNull
        public abstract String getCrashlyticsInstallId();

        @Nullable
        public abstract String getFirebaseAuthenticationToken();

        @Nullable
        public abstract String getFirebaseInstallationId();
    }

    InstallIds getInstallIds();
}
