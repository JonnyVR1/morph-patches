package com.google.firebase.crashlytics.internal.settings;

/* JADX INFO: loaded from: classes7.dex */
public class Settings {
    public final int cacheDuration;
    public final long expiresAtMillis;
    public final FeatureFlagData featureFlagData;
    public final double onDemandBackoffBase;
    public final int onDemandBackoffStepDurationSeconds;
    public final double onDemandUploadRatePerMinute;
    public final SessionData sessionData;
    public final int settingsVersion;

    public static class FeatureFlagData {
        public final boolean collectAnrs;
        public final boolean collectBuildIds;
        public final boolean collectReports;

        public FeatureFlagData(boolean z, boolean z2, boolean z3) {
            this.collectReports = z;
            this.collectAnrs = z2;
            this.collectBuildIds = z3;
        }
    }

    public static class SessionData {
        public final int maxCompleteSessionsCount;
        public final int maxCustomExceptionEvents;

        public SessionData(int i, int i2) {
            this.maxCustomExceptionEvents = i;
            this.maxCompleteSessionsCount = i2;
        }
    }

    public Settings(long j, SessionData sessionData, FeatureFlagData featureFlagData, int i, int i2, double d, double d2, int i3) {
        this.expiresAtMillis = j;
        this.sessionData = sessionData;
        this.featureFlagData = featureFlagData;
        this.settingsVersion = i;
        this.cacheDuration = i2;
        this.onDemandUploadRatePerMinute = d;
        this.onDemandBackoffBase = d2;
        this.onDemandBackoffStepDurationSeconds = i3;
    }

    public boolean isExpired(long j) {
        return this.expiresAtMillis < j;
    }
}
