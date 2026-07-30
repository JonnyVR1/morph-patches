package com.google.android.datatransport.runtime.scheduling.persistence;

import com.google.android.datatransport.runtime.dagger.internal.DaggerGenerated;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.dagger.internal.Preconditions;
import com.google.android.datatransport.runtime.dagger.internal.QualifierMetadata;
import com.google.android.datatransport.runtime.dagger.internal.ScopeMetadata;

/* JADX INFO: loaded from: classes6.dex */
@QualifierMetadata
@ScopeMetadata
@DaggerGenerated
public final class EventStoreModule_StoreConfigFactory implements Factory<EventStoreConfig> {

    public static final class InstanceHolder {
        private static final EventStoreModule_StoreConfigFactory INSTANCE = new EventStoreModule_StoreConfigFactory();

        private InstanceHolder() {
        }
    }

    public static EventStoreModule_StoreConfigFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static EventStoreConfig storeConfig() {
        return (EventStoreConfig) Preconditions.checkNotNullFromProvides(EventStoreModule.storeConfig());
    }

    @Override // com.google.android.datatransport.runtime.dagger.internal.Factory, p153l.i7b0
    public EventStoreConfig get() {
        return storeConfig();
    }
}
