package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import com.google.android.datatransport.runtime.dagger.internal.DaggerGenerated;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.dagger.internal.QualifierMetadata;
import com.google.android.datatransport.runtime.dagger.internal.ScopeMetadata;
import p149l.eza0;

/* JADX INFO: loaded from: classes6.dex */
@QualifierMetadata
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
public final class MetadataBackendRegistry_Factory implements Factory<MetadataBackendRegistry> {
    private final eza0<Context> applicationContextProvider;
    private final eza0<CreationContextFactory> creationContextFactoryProvider;

    public MetadataBackendRegistry_Factory(eza0<Context> eza0Var, eza0<CreationContextFactory> eza0Var2) {
        this.applicationContextProvider = eza0Var;
        this.creationContextFactoryProvider = eza0Var2;
    }

    public static MetadataBackendRegistry_Factory create(eza0<Context> eza0Var, eza0<CreationContextFactory> eza0Var2) {
        return new MetadataBackendRegistry_Factory(eza0Var, eza0Var2);
    }

    public static MetadataBackendRegistry newInstance(Context context, Object obj) {
        return new MetadataBackendRegistry(context, (CreationContextFactory) obj);
    }

    @Override // com.google.android.datatransport.runtime.dagger.internal.Factory, p149l.eza0
    public MetadataBackendRegistry get() {
        return newInstance(this.applicationContextProvider.get(), this.creationContextFactoryProvider.get());
    }
}
