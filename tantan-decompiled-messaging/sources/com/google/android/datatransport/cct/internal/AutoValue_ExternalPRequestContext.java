package com.google.android.datatransport.cct.internal;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
final class AutoValue_ExternalPRequestContext extends ExternalPRequestContext {
    private final Integer originAssociatedProductId;

    public static final class Builder extends ExternalPRequestContext.Builder {
        private Integer originAssociatedProductId;

        @Override // com.google.android.datatransport.cct.internal.ExternalPRequestContext.Builder
        public ExternalPRequestContext build() {
            return new AutoValue_ExternalPRequestContext(this.originAssociatedProductId);
        }

        @Override // com.google.android.datatransport.cct.internal.ExternalPRequestContext.Builder
        public ExternalPRequestContext.Builder setOriginAssociatedProductId(@Nullable Integer num) {
            this.originAssociatedProductId = num;
            return this;
        }
    }

    private AutoValue_ExternalPRequestContext(@Nullable Integer num) {
        this.originAssociatedProductId = num;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ExternalPRequestContext)) {
            return false;
        }
        ExternalPRequestContext externalPRequestContext = (ExternalPRequestContext) obj;
        Integer num = this.originAssociatedProductId;
        if (num == null) {
            return externalPRequestContext.getOriginAssociatedProductId() == null;
        }
        return num.equals(externalPRequestContext.getOriginAssociatedProductId());
    }

    @Override // com.google.android.datatransport.cct.internal.ExternalPRequestContext
    @Nullable
    public Integer getOriginAssociatedProductId() {
        return this.originAssociatedProductId;
    }

    public int hashCode() {
        Integer num = this.originAssociatedProductId;
        return (num == null ? 0 : num.hashCode()) ^ 1000003;
    }

    public String toString() {
        return "ExternalPRequestContext{originAssociatedProductId=" + this.originAssociatedProductId + "}";
    }
}
