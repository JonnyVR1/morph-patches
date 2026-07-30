package com.google.android.datatransport.cct.internal;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
final class AutoValue_ExternalPrivacyContext extends ExternalPrivacyContext {
    private final ExternalPRequestContext prequest;

    public static final class Builder extends ExternalPrivacyContext.Builder {
        private ExternalPRequestContext prequest;

        @Override // com.google.android.datatransport.cct.internal.ExternalPrivacyContext.Builder
        public ExternalPrivacyContext build() {
            return new AutoValue_ExternalPrivacyContext(this.prequest);
        }

        @Override // com.google.android.datatransport.cct.internal.ExternalPrivacyContext.Builder
        public ExternalPrivacyContext.Builder setPrequest(@Nullable ExternalPRequestContext externalPRequestContext) {
            this.prequest = externalPRequestContext;
            return this;
        }
    }

    private AutoValue_ExternalPrivacyContext(@Nullable ExternalPRequestContext externalPRequestContext) {
        this.prequest = externalPRequestContext;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ExternalPrivacyContext)) {
            return false;
        }
        ExternalPrivacyContext externalPrivacyContext = (ExternalPrivacyContext) obj;
        ExternalPRequestContext externalPRequestContext = this.prequest;
        if (externalPRequestContext == null) {
            return externalPrivacyContext.getPrequest() == null;
        }
        return externalPRequestContext.equals(externalPrivacyContext.getPrequest());
    }

    @Override // com.google.android.datatransport.cct.internal.ExternalPrivacyContext
    @Nullable
    public ExternalPRequestContext getPrequest() {
        return this.prequest;
    }

    public int hashCode() {
        ExternalPRequestContext externalPRequestContext = this.prequest;
        return (externalPRequestContext == null ? 0 : externalPRequestContext.hashCode()) ^ 1000003;
    }

    public String toString() {
        return "ExternalPrivacyContext{prequest=" + this.prequest + "}";
    }
}
