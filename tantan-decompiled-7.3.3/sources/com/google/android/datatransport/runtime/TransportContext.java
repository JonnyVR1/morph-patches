package com.google.android.datatransport.runtime;

import android.util.Base64;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.google.android.datatransport.Priority;

/* JADX INFO: loaded from: classes6.dex */
public abstract class TransportContext {

    public static abstract class Builder {
        public abstract TransportContext build();

        public abstract Builder setBackendName(String str);

        public abstract Builder setExtras(@Nullable byte[] bArr);

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public abstract Builder setPriority(Priority priority);
    }

    public static Builder builder() {
        return new AutoValue_TransportContext.Builder().setPriority(Priority.DEFAULT);
    }

    public abstract String getBackendName();

    @Nullable
    public abstract byte[] getExtras();

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public abstract Priority getPriority();

    public boolean shouldUploadClientHealthMetrics() {
        return getExtras() != null;
    }

    public final String toString() {
        return String.format("TransportContext(%s, %s, %s)", getBackendName(), getPriority(), getExtras() == null ? "" : Base64.encodeToString(getExtras(), 2));
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public TransportContext withPriority(Priority priority) {
        return builder().setBackendName(getBackendName()).setPriority(priority).setExtras(getExtras()).build();
    }
}
