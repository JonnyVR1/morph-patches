package com.google.android.datatransport.cct.internal;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
final class AutoValue_ComplianceData extends ComplianceData {
    private final ExternalPrivacyContext privacyContext;
    private final ComplianceData.ProductIdOrigin productIdOrigin;

    public static final class Builder extends ComplianceData.Builder {
        private ExternalPrivacyContext privacyContext;
        private ComplianceData.ProductIdOrigin productIdOrigin;

        @Override // com.google.android.datatransport.cct.internal.ComplianceData.Builder
        public ComplianceData build() {
            return new AutoValue_ComplianceData(this.privacyContext, this.productIdOrigin);
        }

        @Override // com.google.android.datatransport.cct.internal.ComplianceData.Builder
        public ComplianceData.Builder setPrivacyContext(@Nullable ExternalPrivacyContext externalPrivacyContext) {
            this.privacyContext = externalPrivacyContext;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.ComplianceData.Builder
        public ComplianceData.Builder setProductIdOrigin(@Nullable ComplianceData.ProductIdOrigin productIdOrigin) {
            this.productIdOrigin = productIdOrigin;
            return this;
        }
    }

    private AutoValue_ComplianceData(@Nullable ExternalPrivacyContext externalPrivacyContext, @Nullable ComplianceData.ProductIdOrigin productIdOrigin) {
        this.privacyContext = externalPrivacyContext;
        this.productIdOrigin = productIdOrigin;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ComplianceData) {
            ComplianceData complianceData = (ComplianceData) obj;
            ExternalPrivacyContext externalPrivacyContext = this.privacyContext;
            if (externalPrivacyContext != null ? externalPrivacyContext.equals(complianceData.getPrivacyContext()) : complianceData.getPrivacyContext() == null) {
                ComplianceData.ProductIdOrigin productIdOrigin = this.productIdOrigin;
                if (productIdOrigin != null ? productIdOrigin.equals(complianceData.getProductIdOrigin()) : complianceData.getProductIdOrigin() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.datatransport.cct.internal.ComplianceData
    @Nullable
    public ExternalPrivacyContext getPrivacyContext() {
        return this.privacyContext;
    }

    @Override // com.google.android.datatransport.cct.internal.ComplianceData
    @Nullable
    public ComplianceData.ProductIdOrigin getProductIdOrigin() {
        return this.productIdOrigin;
    }

    public int hashCode() {
        ExternalPrivacyContext externalPrivacyContext = this.privacyContext;
        int iHashCode = ((externalPrivacyContext == null ? 0 : externalPrivacyContext.hashCode()) ^ 1000003) * 1000003;
        ComplianceData.ProductIdOrigin productIdOrigin = this.productIdOrigin;
        return iHashCode ^ (productIdOrigin != null ? productIdOrigin.hashCode() : 0);
    }

    public String toString() {
        return "ComplianceData{privacyContext=" + this.privacyContext + ", productIdOrigin=" + this.productIdOrigin + "}";
    }
}
