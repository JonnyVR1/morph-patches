package com.google.android.datatransport.runtime;

import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Map;
import p149l.jfd0;
import p149l.qkq0;

/* JADX INFO: loaded from: classes6.dex */
final class AutoValue_EventInternal extends EventInternal {
    private final Map<String, String> autoMetadata;
    private final Integer code;
    private final EncodedPayload encodedPayload;
    private final long eventMillis;
    private final byte[] experimentIdsClear;
    private final byte[] experimentIdsEncrypted;
    private final Integer productId;
    private final String pseudonymousId;
    private final String transportName;
    private final long uptimeMillis;

    public static final class Builder extends EventInternal.Builder {
        private Map<String, String> autoMetadata;
        private Integer code;
        private EncodedPayload encodedPayload;
        private Long eventMillis;
        private byte[] experimentIdsClear;
        private byte[] experimentIdsEncrypted;
        private Integer productId;
        private String pseudonymousId;
        private String transportName;
        private Long uptimeMillis;

        @Override // com.google.android.datatransport.runtime.EventInternal.Builder
        public EventInternal build() {
            String strConcat = this.transportName == null ? " transportName" : "";
            if (this.encodedPayload == null) {
                strConcat = strConcat.concat(" encodedPayload");
            }
            if (this.eventMillis == null) {
                strConcat = strConcat.concat(" eventMillis");
            }
            if (this.uptimeMillis == null) {
                strConcat = strConcat.concat(" uptimeMillis");
            }
            if (this.autoMetadata == null) {
                strConcat = strConcat.concat(" autoMetadata");
            }
            if (strConcat.isEmpty()) {
                return new AutoValue_EventInternal(this.transportName, this.code, this.encodedPayload, this.eventMillis.longValue(), this.uptimeMillis.longValue(), this.autoMetadata, this.productId, this.pseudonymousId, this.experimentIdsClear, this.experimentIdsEncrypted);
            }
            qkq0.m175383a("Missing required properties:".concat(strConcat));
            return null;
        }

        @Override // com.google.android.datatransport.runtime.EventInternal.Builder
        public Map<String, String> getAutoMetadata() {
            Map<String, String> map = this.autoMetadata;
            if (map != null) {
                return map;
            }
            qkq0.m175383a("Property \"autoMetadata\" has not been set");
            return null;
        }

        @Override // com.google.android.datatransport.runtime.EventInternal.Builder
        public EventInternal.Builder setAutoMetadata(Map<String, String> map) {
            if (map != null) {
                this.autoMetadata = map;
                return this;
            }
            jfd0.m141176a("Null autoMetadata");
            return null;
        }

        @Override // com.google.android.datatransport.runtime.EventInternal.Builder
        public EventInternal.Builder setCode(Integer num) {
            this.code = num;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.EventInternal.Builder
        public EventInternal.Builder setEncodedPayload(EncodedPayload encodedPayload) {
            if (encodedPayload != null) {
                this.encodedPayload = encodedPayload;
                return this;
            }
            jfd0.m141176a("Null encodedPayload");
            return null;
        }

        @Override // com.google.android.datatransport.runtime.EventInternal.Builder
        public EventInternal.Builder setEventMillis(long j) {
            this.eventMillis = Long.valueOf(j);
            return this;
        }

        @Override // com.google.android.datatransport.runtime.EventInternal.Builder
        public EventInternal.Builder setExperimentIdsClear(byte[] bArr) {
            this.experimentIdsClear = bArr;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.EventInternal.Builder
        public EventInternal.Builder setExperimentIdsEncrypted(byte[] bArr) {
            this.experimentIdsEncrypted = bArr;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.EventInternal.Builder
        public EventInternal.Builder setProductId(Integer num) {
            this.productId = num;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.EventInternal.Builder
        public EventInternal.Builder setPseudonymousId(String str) {
            this.pseudonymousId = str;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.EventInternal.Builder
        public EventInternal.Builder setTransportName(String str) {
            if (str != null) {
                this.transportName = str;
                return this;
            }
            jfd0.m141176a("Null transportName");
            return null;
        }

        @Override // com.google.android.datatransport.runtime.EventInternal.Builder
        public EventInternal.Builder setUptimeMillis(long j) {
            this.uptimeMillis = Long.valueOf(j);
            return this;
        }
    }

    private AutoValue_EventInternal(String str, @Nullable Integer num, EncodedPayload encodedPayload, long j, long j2, Map<String, String> map, @Nullable Integer num2, @Nullable String str2, @Nullable byte[] bArr, @Nullable byte[] bArr2) {
        this.transportName = str;
        this.code = num;
        this.encodedPayload = encodedPayload;
        this.eventMillis = j;
        this.uptimeMillis = j2;
        this.autoMetadata = map;
        this.productId = num2;
        this.pseudonymousId = str2;
        this.experimentIdsClear = bArr;
        this.experimentIdsEncrypted = bArr2;
    }

    public boolean equals(Object obj) {
        Integer num;
        Integer num2;
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof EventInternal) {
            EventInternal eventInternal = (EventInternal) obj;
            if (this.transportName.equals(eventInternal.getTransportName()) && ((num = this.code) != null ? num.equals(eventInternal.getCode()) : eventInternal.getCode() == null) && this.encodedPayload.equals(eventInternal.getEncodedPayload()) && this.eventMillis == eventInternal.getEventMillis() && this.uptimeMillis == eventInternal.getUptimeMillis() && this.autoMetadata.equals(eventInternal.getAutoMetadata()) && ((num2 = this.productId) != null ? num2.equals(eventInternal.getProductId()) : eventInternal.getProductId() == null) && ((str = this.pseudonymousId) != null ? str.equals(eventInternal.getPseudonymousId()) : eventInternal.getPseudonymousId() == null)) {
                boolean z = eventInternal instanceof AutoValue_EventInternal;
                if (Arrays.equals(this.experimentIdsClear, z ? ((AutoValue_EventInternal) eventInternal).experimentIdsClear : eventInternal.getExperimentIdsClear())) {
                    if (Arrays.equals(this.experimentIdsEncrypted, z ? ((AutoValue_EventInternal) eventInternal).experimentIdsEncrypted : eventInternal.getExperimentIdsEncrypted())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.datatransport.runtime.EventInternal
    public Map<String, String> getAutoMetadata() {
        return this.autoMetadata;
    }

    @Override // com.google.android.datatransport.runtime.EventInternal
    @Nullable
    public Integer getCode() {
        return this.code;
    }

    @Override // com.google.android.datatransport.runtime.EventInternal
    public EncodedPayload getEncodedPayload() {
        return this.encodedPayload;
    }

    @Override // com.google.android.datatransport.runtime.EventInternal
    public long getEventMillis() {
        return this.eventMillis;
    }

    @Override // com.google.android.datatransport.runtime.EventInternal
    @Nullable
    public byte[] getExperimentIdsClear() {
        return this.experimentIdsClear;
    }

    @Override // com.google.android.datatransport.runtime.EventInternal
    @Nullable
    public byte[] getExperimentIdsEncrypted() {
        return this.experimentIdsEncrypted;
    }

    @Override // com.google.android.datatransport.runtime.EventInternal
    @Nullable
    public Integer getProductId() {
        return this.productId;
    }

    @Override // com.google.android.datatransport.runtime.EventInternal
    @Nullable
    public String getPseudonymousId() {
        return this.pseudonymousId;
    }

    @Override // com.google.android.datatransport.runtime.EventInternal
    public String getTransportName() {
        return this.transportName;
    }

    @Override // com.google.android.datatransport.runtime.EventInternal
    public long getUptimeMillis() {
        return this.uptimeMillis;
    }

    public int hashCode() {
        int iHashCode = (this.transportName.hashCode() ^ 1000003) * 1000003;
        Integer num = this.code;
        int iHashCode2 = (((iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.encodedPayload.hashCode()) * 1000003;
        long j = this.eventMillis;
        int i = (iHashCode2 ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.uptimeMillis;
        int iHashCode3 = (((i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.autoMetadata.hashCode()) * 1000003;
        Integer num2 = this.productId;
        int iHashCode4 = (iHashCode3 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
        String str = this.pseudonymousId;
        return Arrays.hashCode(this.experimentIdsEncrypted) ^ ((((iHashCode4 ^ (str != null ? str.hashCode() : 0)) * 1000003) ^ Arrays.hashCode(this.experimentIdsClear)) * 1000003);
    }

    public String toString() {
        return "EventInternal{transportName=" + this.transportName + ", code=" + this.code + ", encodedPayload=" + this.encodedPayload + ", eventMillis=" + this.eventMillis + ", uptimeMillis=" + this.uptimeMillis + ", autoMetadata=" + this.autoMetadata + ", productId=" + this.productId + ", pseudonymousId=" + this.pseudonymousId + ", experimentIdsClear=" + Arrays.toString(this.experimentIdsClear) + ", experimentIdsEncrypted=" + Arrays.toString(this.experimentIdsEncrypted) + "}";
    }
}
