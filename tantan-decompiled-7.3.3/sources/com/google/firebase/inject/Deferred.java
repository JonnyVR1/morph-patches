package com.google.firebase.inject;

import androidx.annotation.NonNull;
import com.google.firebase.annotations.DeferredApi;

/* JADX INFO: loaded from: classes7.dex */
public interface Deferred<T> {

    public interface DeferredHandler<T> {
        @DeferredApi
        void handle(Provider<T> provider);
    }

    void whenAvailable(@NonNull DeferredHandler<T> deferredHandler);
}
