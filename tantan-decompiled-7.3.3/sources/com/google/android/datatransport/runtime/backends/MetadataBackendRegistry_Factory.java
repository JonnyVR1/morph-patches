package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import com.google.android.datatransport.runtime.dagger.internal.DaggerGenerated;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.dagger.internal.QualifierMetadata;
import com.google.android.datatransport.runtime.dagger.internal.ScopeMetadata;
import p153l.i7b0;

/* JADX INFO: loaded from: classes6.dex */
@QualifierMetadata
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
public final class MetadataBackendRegistry_Factory implements Factory<MetadataBackendRegistry> {
    private final i7b0<Context> applicationContextProvider;
    private final i7b0<CreationContextFactory> creationContextFactoryProvider;

    public MetadataBackendRegistry_Factory(i7b0<Context> i7b0Var, i7b0<CreationContextFactory> i7b0Var2) {
        this.applicationContextProvider = i7b0Var;
        this.creationContextFactoryProvider = i7b0Var2;
    }

    public static MetadataBackendRegistry_Factory create(i7b0<Context> i7b0Var, i7b0<CreationContextFactory> i7b0Var2) {
        return new MetadataBackendRegistry_Factory(i7b0Var, i7b0Var2);
    }

    public static MetadataBackendRegistry newInstance(Context context, Object obj) {
        return new MetadataBackendRegistry(context, (CreationContextFactory) obj);
    }

    @Override // com.google.android.datatransport.runtime.dagger.internal.Factory, p153l.i7b0
    public MetadataBackendRegistry get() {
        return newInstance(this.applicationContextProvider.get(), this.creationContextFactoryProvider.get());
    }
}
