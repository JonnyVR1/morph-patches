package com.google.android.datatransport.cct.internal;

import androidx.annotation.Nullable;
import java.util.Arrays;
import p149l.qkq0;

/* JADX INFO: loaded from: classes6.dex */
final class AutoValue_LogEvent extends LogEvent {
    private final ComplianceData complianceData;
    private final Integer eventCode;
    private final long eventTimeMs;
    private final long eventUptimeMs;
    private final ExperimentIds experimentIds;
    private final NetworkConnectionInfo networkConnectionInfo;
    private final byte[] sourceExtension;
    private final String sourceExtensionJsonProto3;
    private final long timezoneOffsetSeconds;

    public static final class Builder extends LogEvent.Builder {
        private ComplianceData complianceData;
        private Integer eventCode;
        private Long eventTimeMs;
        private Long eventUptimeMs;
        private ExperimentIds experimentIds;
        private NetworkConnectionInfo networkConnectionInfo;
        private byte[] sourceExtension;
        private String sourceExtensionJsonProto3;
        private Long timezoneOffsetSeconds;

        @Override // com.google.android.datatransport.cct.internal.LogEvent.Builder
        public LogEvent build() {
            String strConcat = this.eventTimeMs == null ? " eventTimeMs" : "";
            if (this.eventUptimeMs == null) {
                strConcat = strConcat.concat(" eventUptimeMs");
            }
            if (this.timezoneOffsetSeconds == null) {
                strConcat = strConcat.concat(" timezoneOffsetSeconds");
            }
            if (strConcat.isEmpty()) {
                return new AutoValue_LogEvent(this.eventTimeMs.longValue(), this.eventCode, this.complianceData, this.eventUptimeMs.longValue(), this.sourceExtension, this.sourceExtensionJsonProto3, this.timezoneOffsetSeconds.longValue(), this.networkConnectionInfo, this.experimentIds);
            }
            qkq0.m175383a("Missing required properties:".concat(strConcat));
            return null;
        }

        @Override // com.google.android.datatransport.cct.internal.LogEvent.Builder
        public LogEvent.Builder setComplianceData(@Nullable ComplianceData complianceData) {
            this.complianceData = complianceData;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.LogEvent.Builder
        public LogEvent.Builder setEventCode(@Nullable Integer num) {
            this.eventCode = num;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.LogEvent.Builder
        public LogEvent.Builder setEventTimeMs(long j) {
            this.eventTimeMs = Long.valueOf(j);
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.LogEvent.Builder
        public LogEvent.Builder setEventUptimeMs(long j) {
            this.eventUptimeMs = Long.valueOf(j);
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.LogEvent.Builder
        public LogEvent.Builder setExperimentIds(@Nullable ExperimentIds experimentIds) {
            this.experimentIds = experimentIds;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.LogEvent.Builder
        public LogEvent.Builder setNetworkConnectionInfo(@Nullable NetworkConnectionInfo networkConnectionInfo) {
            this.networkConnectionInfo = networkConnectionInfo;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.LogEvent.Builder
        public LogEvent.Builder setSourceExtension(@Nullable byte[] bArr) {
            this.sourceExtension = bArr;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.LogEvent.Builder
        public LogEvent.Builder setSourceExtensionJsonProto3(@Nullable String str) {
            this.sourceExtensionJsonProto3 = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.LogEvent.Builder
        public LogEvent.Builder setTimezoneOffsetSeconds(long j) {
            this.timezoneOffsetSeconds = Long.valueOf(j);
            return this;
        }
    }

    private AutoValue_LogEvent(long j, @Nullable Integer num, @Nullable ComplianceData complianceData, long j2, @Nullable byte[] bArr, @Nullable String str, long j3, @Nullable NetworkConnectionInfo networkConnectionInfo, @Nullable ExperimentIds experimentIds) {
        this.eventTimeMs = j;
        this.eventCode = num;
        this.complianceData = complianceData;
        this.eventUptimeMs = j2;
        this.sourceExtension = bArr;
        this.sourceExtensionJsonProto3 = str;
        this.timezoneOffsetSeconds = j3;
        this.networkConnectionInfo = networkConnectionInfo;
        this.experimentIds = experimentIds;
    }

    public boolean equals(Object obj) {
        Integer num;
        ComplianceData complianceData;
        String str;
        NetworkConnectionInfo networkConnectionInfo;
        ExperimentIds experimentIds;
        if (obj == this) {
            return true;
        }
        if (obj instanceof LogEvent) {
            LogEvent logEvent = (LogEvent) obj;
            if (this.eventTimeMs == logEvent.getEventTimeMs() && ((num = this.eventCode) != null ? num.equals(logEvent.getEventCode()) : logEvent.getEventCode() == null) && ((complianceData = this.complianceData) != null ? complianceData.equals(logEvent.getComplianceData()) : logEvent.getComplianceData() == null) && this.eventUptimeMs == logEvent.getEventUptimeMs()) {
                if (Arrays.equals(this.sourceExtension, logEvent instanceof AutoValue_LogEvent ? ((AutoValue_LogEvent) logEvent).sourceExtension : logEvent.getSourceExtension()) && ((str = this.sourceExtensionJsonProto3) != null ? str.equals(logEvent.getSourceExtensionJsonProto3()) : logEvent.getSourceExtensionJsonProto3() == null) && this.timezoneOffsetSeconds == logEvent.getTimezoneOffsetSeconds() && ((networkConnectionInfo = this.networkConnectionInfo) != null ? networkConnectionInfo.equals(logEvent.getNetworkConnectionInfo()) : logEvent.getNetworkConnectionInfo() == null) && ((experimentIds = this.experimentIds) != null ? experimentIds.equals(logEvent.getExperimentIds()) : logEvent.getExperimentIds() == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.datatransport.cct.internal.LogEvent
    @Nullable
    public ComplianceData getComplianceData() {
        return this.complianceData;
    }

    @Override // com.google.android.datatransport.cct.internal.LogEvent
    @Nullable
    public Integer getEventCode() {
        return this.eventCode;
    }

    @Override // com.google.android.datatransport.cct.internal.LogEvent
    public long getEventTimeMs() {
        return this.eventTimeMs;
    }

    @Override // com.google.android.datatransport.cct.internal.LogEvent
    public long getEventUptimeMs() {
        return this.eventUptimeMs;
    }

    @Override // com.google.android.datatransport.cct.internal.LogEvent
    @Nullable
    public ExperimentIds getExperimentIds() {
        return this.experimentIds;
    }

    @Override // com.google.android.datatransport.cct.internal.LogEvent
    @Nullable
    public NetworkConnectionInfo getNetworkConnectionInfo() {
        return this.networkConnectionInfo;
    }

    @Override // com.google.android.datatransport.cct.internal.LogEvent
    @Nullable
    public byte[] getSourceExtension() {
        return this.sourceExtension;
    }

    @Override // com.google.android.datatransport.cct.internal.LogEvent
    @Nullable
    public String getSourceExtensionJsonProto3() {
        return this.sourceExtensionJsonProto3;
    }

    @Override // com.google.android.datatransport.cct.internal.LogEvent
    public long getTimezoneOffsetSeconds() {
        return this.timezoneOffsetSeconds;
    }

    public int hashCode() {
        long j = this.eventTimeMs;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.eventCode;
        int iHashCode = (i ^ (num == null ? 0 : num.hashCode())) * 1000003;
        ComplianceData complianceData = this.complianceData;
        int iHashCode2 = complianceData == null ? 0 : complianceData.hashCode();
        long j2 = this.eventUptimeMs;
        int iHashCode3 = (((((iHashCode ^ iHashCode2) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.sourceExtension)) * 1000003;
        String str = this.sourceExtensionJsonProto3;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        long j3 = this.timezoneOffsetSeconds;
        int i2 = (((iHashCode3 ^ iHashCode4) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003;
        NetworkConnectionInfo networkConnectionInfo = this.networkConnectionInfo;
        int iHashCode5 = (i2 ^ (networkConnectionInfo == null ? 0 : networkConnectionInfo.hashCode())) * 1000003;
        ExperimentIds experimentIds = this.experimentIds;
        return iHashCode5 ^ (experimentIds != null ? experimentIds.hashCode() : 0);
    }

    public String toString() {
        return "LogEvent{eventTimeMs=" + this.eventTimeMs + ", eventCode=" + this.eventCode + ", complianceData=" + this.complianceData + ", eventUptimeMs=" + this.eventUptimeMs + ", sourceExtension=" + Arrays.toString(this.sourceExtension) + ", sourceExtensionJsonProto3=" + this.sourceExtensionJsonProto3 + ", timezoneOffsetSeconds=" + this.timezoneOffsetSeconds + ", networkConnectionInfo=" + this.networkConnectionInfo + ", experimentIds=" + this.experimentIds + "}";
    }
}
