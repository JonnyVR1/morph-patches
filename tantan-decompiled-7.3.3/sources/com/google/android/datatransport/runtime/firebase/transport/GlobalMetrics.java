package com.google.android.datatransport.runtime.firebase.transport;

import com.google.firebase.encoders.annotations.Encodable;
import com.google.firebase.encoders.proto.Protobuf;

/* JADX INFO: loaded from: classes6.dex */
public final class GlobalMetrics {
    private static final GlobalMetrics DEFAULT_INSTANCE = new Builder().build();
    private final StorageMetrics storage_metrics_;

    public static final class Builder {
        private StorageMetrics storage_metrics_ = null;

        public GlobalMetrics build() {
            return new GlobalMetrics(this.storage_metrics_);
        }

        public Builder setStorageMetrics(StorageMetrics storageMetrics) {
            this.storage_metrics_ = storageMetrics;
            return this;
        }
    }

    public GlobalMetrics(StorageMetrics storageMetrics) {
        this.storage_metrics_ = storageMetrics;
    }

    public static GlobalMetrics getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    @Encodable.Ignore
    public StorageMetrics getStorageMetrics() {
        StorageMetrics storageMetrics = this.storage_metrics_;
        return storageMetrics == null ? StorageMetrics.getDefaultInstance() : storageMetrics;
    }

    @Protobuf(tag = 1)
    @Encodable.Field(name = "storageMetrics")
    public StorageMetrics getStorageMetricsInternal() {
        return this.storage_metrics_;
    }
}
