package com.google.android.datatransport;

import androidx.annotation.Nullable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
final class AutoValue_EventContext extends EventContext {
    private final byte[] experimentIdsClear;
    private final byte[] experimentIdsEncrypted;
    private final String pseudonymousId;

    public static final class Builder extends EventContext.Builder {
        private byte[] experimentIdsClear;
        private byte[] experimentIdsEncrypted;
        private String pseudonymousId;

        @Override // com.google.android.datatransport.EventContext.Builder
        public EventContext build() {
            return new AutoValue_EventContext(this.pseudonymousId, this.experimentIdsClear, this.experimentIdsEncrypted);
        }

        @Override // com.google.android.datatransport.EventContext.Builder
        public EventContext.Builder setExperimentIdsClear(byte[] bArr) {
            this.experimentIdsClear = bArr;
            return this;
        }

        @Override // com.google.android.datatransport.EventContext.Builder
        public EventContext.Builder setExperimentIdsEncrypted(byte[] bArr) {
            this.experimentIdsEncrypted = bArr;
            return this;
        }

        @Override // com.google.android.datatransport.EventContext.Builder
        public EventContext.Builder setPseudonymousId(String str) {
            this.pseudonymousId = str;
            return this;
        }
    }

    private AutoValue_EventContext(@Nullable String str, @Nullable byte[] bArr, @Nullable byte[] bArr2) {
        this.pseudonymousId = str;
        this.experimentIdsClear = bArr;
        this.experimentIdsEncrypted = bArr2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof EventContext) {
            EventContext eventContext = (EventContext) obj;
            String str = this.pseudonymousId;
            if (str != null ? str.equals(eventContext.getPseudonymousId()) : eventContext.getPseudonymousId() == null) {
                boolean z = eventContext instanceof AutoValue_EventContext;
                if (Arrays.equals(this.experimentIdsClear, z ? ((AutoValue_EventContext) eventContext).experimentIdsClear : eventContext.getExperimentIdsClear())) {
                    if (Arrays.equals(this.experimentIdsEncrypted, z ? ((AutoValue_EventContext) eventContext).experimentIdsEncrypted : eventContext.getExperimentIdsEncrypted())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.datatransport.EventContext
    @Nullable
    public byte[] getExperimentIdsClear() {
        return this.experimentIdsClear;
    }

    @Override // com.google.android.datatransport.EventContext
    @Nullable
    public byte[] getExperimentIdsEncrypted() {
        return this.experimentIdsEncrypted;
    }

    @Override // com.google.android.datatransport.EventContext
    @Nullable
    public String getPseudonymousId() {
        return this.pseudonymousId;
    }

    public int hashCode() {
        String str = this.pseudonymousId;
        return Arrays.hashCode(this.experimentIdsEncrypted) ^ (((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ Arrays.hashCode(this.experimentIdsClear)) * 1000003);
    }

    public String toString() {
        return "EventContext{pseudonymousId=" + this.pseudonymousId + ", experimentIdsClear=" + Arrays.toString(this.experimentIdsClear) + ", experimentIdsEncrypted=" + Arrays.toString(this.experimentIdsEncrypted) + "}";
    }
}
