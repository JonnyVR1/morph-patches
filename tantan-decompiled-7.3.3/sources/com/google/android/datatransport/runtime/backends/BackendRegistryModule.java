package com.google.android.datatransport.runtime.backends;

import com.google.android.datatransport.runtime.dagger.Binds;
import com.google.android.datatransport.runtime.dagger.Module;

/* JADX INFO: loaded from: classes6.dex */
@Module
public abstract class BackendRegistryModule {
    @Binds
    public abstract BackendRegistry backendRegistry(MetadataBackendRegistry metadataBackendRegistry);
}
