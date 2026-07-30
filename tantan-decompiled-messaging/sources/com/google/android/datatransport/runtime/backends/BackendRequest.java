package com.google.android.datatransport.runtime.backends;

import androidx.annotation.Nullable;
import com.google.android.datatransport.runtime.EventInternal;

/* JADX INFO: loaded from: classes6.dex */
public abstract class BackendRequest {

    public static abstract class Builder {
        public abstract BackendRequest build();

        public abstract Builder setEvents(Iterable<EventInternal> iterable);

        public abstract Builder setExtras(@Nullable byte[] bArr);
    }

    public static Builder builder() {
        return new AutoValue_BackendRequest.Builder();
    }

    public static BackendRequest create(Iterable<EventInternal> iterable) {
        return builder().setEvents(iterable).build();
    }

    public abstract Iterable<EventInternal> getEvents();

    @Nullable
    public abstract byte[] getExtras();
}
