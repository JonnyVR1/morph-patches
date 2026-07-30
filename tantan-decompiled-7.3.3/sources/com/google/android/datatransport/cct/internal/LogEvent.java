package com.google.android.datatransport.cct.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public abstract class LogEvent {

    public static abstract class Builder {
        @NonNull
        public abstract LogEvent build();

        @NonNull
        public abstract Builder setComplianceData(@Nullable ComplianceData complianceData);

        @NonNull
        public abstract Builder setEventCode(@Nullable Integer num);

        @NonNull
        public abstract Builder setEventTimeMs(long j);

        @NonNull
        public abstract Builder setEventUptimeMs(long j);

        @NonNull
        public abstract Builder setExperimentIds(@Nullable ExperimentIds experimentIds);

        @NonNull
        public abstract Builder setNetworkConnectionInfo(@Nullable NetworkConnectionInfo networkConnectionInfo);

        @NonNull
        public abstract Builder setSourceExtension(@Nullable byte[] bArr);

        @NonNull
        public abstract Builder setSourceExtensionJsonProto3(@Nullable String str);

        @NonNull
        public abstract Builder setTimezoneOffsetSeconds(long j);
    }

    private static Builder builder() {
        return new AutoValue_LogEvent.Builder();
    }

    @NonNull
    public static Builder jsonBuilder(@NonNull String str) {
        return builder().setSourceExtensionJsonProto3(str);
    }

    @NonNull
    public static Builder protoBuilder(@NonNull byte[] bArr) {
        return builder().setSourceExtension(bArr);
    }

    @Nullable
    public abstract ComplianceData getComplianceData();

    @Nullable
    public abstract Integer getEventCode();

    public abstract long getEventTimeMs();

    public abstract long getEventUptimeMs();

    @Nullable
    public abstract ExperimentIds getExperimentIds();

    @Nullable
    public abstract NetworkConnectionInfo getNetworkConnectionInfo();

    @Nullable
    public abstract byte[] getSourceExtension();

    @Nullable
    public abstract String getSourceExtensionJsonProto3();

    public abstract long getTimezoneOffsetSeconds();
}
