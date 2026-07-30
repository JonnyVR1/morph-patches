package com.google.android.datatransport.runtime.backends;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public interface BackendRegistry {
    @Nullable
    TransportBackend get(String str);
}
