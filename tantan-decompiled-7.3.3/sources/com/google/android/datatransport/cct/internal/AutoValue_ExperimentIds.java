package com.google.android.datatransport.cct.internal;

import androidx.annotation.Nullable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
final class AutoValue_ExperimentIds extends ExperimentIds {
    private final byte[] clearBlob;
    private final byte[] encryptedBlob;

    public static final class Builder extends ExperimentIds.Builder {
        private byte[] clearBlob;
        private byte[] encryptedBlob;

        @Override // com.google.android.datatransport.cct.internal.ExperimentIds.Builder
        public ExperimentIds build() {
            return new AutoValue_ExperimentIds(this.clearBlob, this.encryptedBlob);
        }

        @Override // com.google.android.datatransport.cct.internal.ExperimentIds.Builder
        public ExperimentIds.Builder setClearBlob(@Nullable byte[] bArr) {
            this.clearBlob = bArr;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.ExperimentIds.Builder
        public ExperimentIds.Builder setEncryptedBlob(@Nullable byte[] bArr) {
            this.encryptedBlob = bArr;
            return this;
        }
    }

    private AutoValue_ExperimentIds(@Nullable byte[] bArr, @Nullable byte[] bArr2) {
        this.clearBlob = bArr;
        this.encryptedBlob = bArr2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ExperimentIds) {
            ExperimentIds experimentIds = (ExperimentIds) obj;
            boolean z = experimentIds instanceof AutoValue_ExperimentIds;
            if (Arrays.equals(this.clearBlob, z ? ((AutoValue_ExperimentIds) experimentIds).clearBlob : experimentIds.getClearBlob())) {
                if (Arrays.equals(this.encryptedBlob, z ? ((AutoValue_ExperimentIds) experimentIds).encryptedBlob : experimentIds.getEncryptedBlob())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.datatransport.cct.internal.ExperimentIds
    @Nullable
    public byte[] getClearBlob() {
        return this.clearBlob;
    }

    @Override // com.google.android.datatransport.cct.internal.ExperimentIds
    @Nullable
    public byte[] getEncryptedBlob() {
        return this.encryptedBlob;
    }

    public int hashCode() {
        return Arrays.hashCode(this.encryptedBlob) ^ ((Arrays.hashCode(this.clearBlob) ^ 1000003) * 1000003);
    }

    public String toString() {
        return "ExperimentIds{clearBlob=" + Arrays.toString(this.clearBlob) + ", encryptedBlob=" + Arrays.toString(this.encryptedBlob) + "}";
    }
}
