package com.google.android.datatransport.cct.internal;

import android.util.SparseArray;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public abstract class ComplianceData {

    public static abstract class Builder {
        @NonNull
        public abstract ComplianceData build();

        @NonNull
        public abstract Builder setPrivacyContext(@Nullable ExternalPrivacyContext externalPrivacyContext);

        @NonNull
        public abstract Builder setProductIdOrigin(@Nullable ProductIdOrigin productIdOrigin);
    }

    public enum ProductIdOrigin {
        NOT_SET(0),
        EVENT_OVERRIDE(5);

        private static final SparseArray<ProductIdOrigin> valueMap;
        private final int value;

        static {
            ProductIdOrigin productIdOrigin = NOT_SET;
            ProductIdOrigin productIdOrigin2 = EVENT_OVERRIDE;
            SparseArray<ProductIdOrigin> sparseArray = new SparseArray<>();
            valueMap = sparseArray;
            sparseArray.put(0, productIdOrigin);
            sparseArray.put(5, productIdOrigin2);
        }

        ProductIdOrigin(int i) {
            this.value = i;
        }

        @Nullable
        public static ProductIdOrigin forNumber(int i) {
            return valueMap.get(i);
        }

        public int getValue() {
            return this.value;
        }
    }

    @NonNull
    public static Builder builder() {
        return new AutoValue_ComplianceData.Builder();
    }

    @Nullable
    public abstract ExternalPrivacyContext getPrivacyContext();

    @Nullable
    public abstract ProductIdOrigin getProductIdOrigin();
}
