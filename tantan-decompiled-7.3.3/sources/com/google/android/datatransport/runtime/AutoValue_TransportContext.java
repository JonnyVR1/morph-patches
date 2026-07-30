package com.google.android.datatransport.runtime;

import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.google.android.datatransport.Priority;
import java.util.Arrays;
import p153l.mnd0;
import p153l.wtq0;

/* JADX INFO: loaded from: classes6.dex */
final class AutoValue_TransportContext extends TransportContext {
    private final String backendName;
    private final byte[] extras;
    private final Priority priority;

    public static final class Builder extends TransportContext.Builder {
        private String backendName;
        private byte[] extras;
        private Priority priority;

        @Override // com.google.android.datatransport.runtime.TransportContext.Builder
        public TransportContext build() {
            String strConcat = this.backendName == null ? " backendName" : "";
            if (this.priority == null) {
                strConcat = strConcat.concat(" priority");
            }
            if (strConcat.isEmpty()) {
                return new AutoValue_TransportContext(this.backendName, this.extras, this.priority);
            }
            wtq0.m207906a("Missing required properties:".concat(strConcat));
            return null;
        }

        @Override // com.google.android.datatransport.runtime.TransportContext.Builder
        public TransportContext.Builder setBackendName(String str) {
            if (str != null) {
                this.backendName = str;
                return this;
            }
            mnd0.m159157a("Null backendName");
            return null;
        }

        @Override // com.google.android.datatransport.runtime.TransportContext.Builder
        public TransportContext.Builder setExtras(@Nullable byte[] bArr) {
            this.extras = bArr;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.TransportContext.Builder
        public TransportContext.Builder setPriority(Priority priority) {
            if (priority != null) {
                this.priority = priority;
                return this;
            }
            mnd0.m159157a("Null priority");
            return null;
        }
    }

    private AutoValue_TransportContext(String str, @Nullable byte[] bArr, Priority priority) {
        this.backendName = str;
        this.extras = bArr;
        this.priority = priority;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof TransportContext) {
            TransportContext transportContext = (TransportContext) obj;
            if (this.backendName.equals(transportContext.getBackendName())) {
                if (Arrays.equals(this.extras, transportContext instanceof AutoValue_TransportContext ? ((AutoValue_TransportContext) transportContext).extras : transportContext.getExtras()) && this.priority.equals(transportContext.getPriority())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.datatransport.runtime.TransportContext
    public String getBackendName() {
        return this.backendName;
    }

    @Override // com.google.android.datatransport.runtime.TransportContext
    @Nullable
    public byte[] getExtras() {
        return this.extras;
    }

    @Override // com.google.android.datatransport.runtime.TransportContext
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public Priority getPriority() {
        return this.priority;
    }

    public int hashCode() {
        return this.priority.hashCode() ^ ((((this.backendName.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.extras)) * 1000003);
    }
}
