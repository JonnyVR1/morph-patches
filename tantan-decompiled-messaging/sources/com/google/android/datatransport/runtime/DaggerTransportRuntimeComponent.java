package com.google.android.datatransport.runtime;

import android.content.Context;
import com.google.android.datatransport.runtime.backends.CreationContextFactory_Factory;
import com.google.android.datatransport.runtime.backends.MetadataBackendRegistry_Factory;
import com.google.android.datatransport.runtime.dagger.internal.DaggerGenerated;
import com.google.android.datatransport.runtime.dagger.internal.DoubleCheck;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.dagger.internal.InstanceFactory;
import com.google.android.datatransport.runtime.dagger.internal.Preconditions;
import com.google.android.datatransport.runtime.scheduling.DefaultScheduler;
import com.google.android.datatransport.runtime.scheduling.DefaultScheduler_Factory;
import com.google.android.datatransport.runtime.scheduling.SchedulingConfigModule_ConfigFactory;
import com.google.android.datatransport.runtime.scheduling.SchedulingModule_WorkSchedulerFactory;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader_Factory;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkInitializer;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkInitializer_Factory;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStoreModule_DbNameFactory;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStoreModule_PackageNameFactory;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStoreModule_SchemaVersionFactory;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStoreModule_StoreConfigFactory;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore_Factory;
import com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager_Factory;
import com.google.android.datatransport.runtime.time.TimeModule_EventClockFactory;
import com.google.android.datatransport.runtime.time.TimeModule_UptimeClockFactory;
import java.util.concurrent.Executor;
import p149l.eza0;

/* JADX INFO: loaded from: classes6.dex */
@DaggerGenerated
final class DaggerTransportRuntimeComponent {

    public static final class Builder implements TransportRuntimeComponent.Builder {
        private Context setApplicationContext;

        private Builder() {
        }

        @Override // com.google.android.datatransport.runtime.TransportRuntimeComponent.Builder
        public TransportRuntimeComponent build() {
            Preconditions.checkBuilderRequirement(this.setApplicationContext, Context.class);
            return new TransportRuntimeComponentImpl(this.setApplicationContext);
        }

        @Override // com.google.android.datatransport.runtime.TransportRuntimeComponent.Builder
        public Builder setApplicationContext(Context context) {
            this.setApplicationContext = (Context) Preconditions.checkNotNull(context);
            return this;
        }
    }

    public static final class TransportRuntimeComponentImpl extends TransportRuntimeComponent {
        private eza0<SchedulerConfig> configProvider;
        private eza0 creationContextFactoryProvider;
        private eza0<DefaultScheduler> defaultSchedulerProvider;
        private eza0<Executor> executorProvider;
        private eza0 metadataBackendRegistryProvider;
        private eza0<String> packageNameProvider;
        private eza0<SQLiteEventStore> sQLiteEventStoreProvider;
        private eza0 schemaManagerProvider;
        private eza0<Context> setApplicationContextProvider;
        private final TransportRuntimeComponentImpl transportRuntimeComponentImpl;
        private eza0<TransportRuntime> transportRuntimeProvider;
        private eza0<Uploader> uploaderProvider;
        private eza0<WorkInitializer> workInitializerProvider;
        private eza0<WorkScheduler> workSchedulerProvider;

        private TransportRuntimeComponentImpl(Context context) {
            this.transportRuntimeComponentImpl = this;
            initialize(context);
        }

        private void initialize(Context context) {
            this.executorProvider = DoubleCheck.provider(ExecutionModule_ExecutorFactory.create());
            Factory factoryCreate = InstanceFactory.create(context);
            this.setApplicationContextProvider = factoryCreate;
            CreationContextFactory_Factory creationContextFactory_FactoryCreate = CreationContextFactory_Factory.create(factoryCreate, TimeModule_EventClockFactory.create(), TimeModule_UptimeClockFactory.create());
            this.creationContextFactoryProvider = creationContextFactory_FactoryCreate;
            this.metadataBackendRegistryProvider = DoubleCheck.provider(MetadataBackendRegistry_Factory.create(this.setApplicationContextProvider, creationContextFactory_FactoryCreate));
            this.schemaManagerProvider = SchemaManager_Factory.create(this.setApplicationContextProvider, EventStoreModule_DbNameFactory.create(), EventStoreModule_SchemaVersionFactory.create());
            this.packageNameProvider = DoubleCheck.provider(EventStoreModule_PackageNameFactory.create(this.setApplicationContextProvider));
            this.sQLiteEventStoreProvider = DoubleCheck.provider(SQLiteEventStore_Factory.create(TimeModule_EventClockFactory.create(), TimeModule_UptimeClockFactory.create(), EventStoreModule_StoreConfigFactory.create(), this.schemaManagerProvider, this.packageNameProvider));
            SchedulingConfigModule_ConfigFactory schedulingConfigModule_ConfigFactoryCreate = SchedulingConfigModule_ConfigFactory.create(TimeModule_EventClockFactory.create());
            this.configProvider = schedulingConfigModule_ConfigFactoryCreate;
            SchedulingModule_WorkSchedulerFactory schedulingModule_WorkSchedulerFactoryCreate = SchedulingModule_WorkSchedulerFactory.create(this.setApplicationContextProvider, this.sQLiteEventStoreProvider, schedulingConfigModule_ConfigFactoryCreate, TimeModule_UptimeClockFactory.create());
            this.workSchedulerProvider = schedulingModule_WorkSchedulerFactoryCreate;
            eza0<Executor> eza0Var = this.executorProvider;
            eza0 eza0Var2 = this.metadataBackendRegistryProvider;
            eza0<SQLiteEventStore> eza0Var3 = this.sQLiteEventStoreProvider;
            this.defaultSchedulerProvider = DefaultScheduler_Factory.create(eza0Var, eza0Var2, schedulingModule_WorkSchedulerFactoryCreate, eza0Var3, eza0Var3);
            eza0<Context> eza0Var4 = this.setApplicationContextProvider;
            eza0 eza0Var5 = this.metadataBackendRegistryProvider;
            eza0<SQLiteEventStore> eza0Var6 = this.sQLiteEventStoreProvider;
            this.uploaderProvider = Uploader_Factory.create(eza0Var4, eza0Var5, eza0Var6, this.workSchedulerProvider, this.executorProvider, eza0Var6, TimeModule_EventClockFactory.create(), TimeModule_UptimeClockFactory.create(), this.sQLiteEventStoreProvider);
            eza0<Executor> eza0Var7 = this.executorProvider;
            eza0<SQLiteEventStore> eza0Var8 = this.sQLiteEventStoreProvider;
            this.workInitializerProvider = WorkInitializer_Factory.create(eza0Var7, eza0Var8, this.workSchedulerProvider, eza0Var8);
            this.transportRuntimeProvider = DoubleCheck.provider(TransportRuntime_Factory.create(TimeModule_EventClockFactory.create(), TimeModule_UptimeClockFactory.create(), this.defaultSchedulerProvider, this.uploaderProvider, this.workInitializerProvider));
        }

        @Override // com.google.android.datatransport.runtime.TransportRuntimeComponent
        public EventStore getEventStore() {
            return this.sQLiteEventStoreProvider.get();
        }

        @Override // com.google.android.datatransport.runtime.TransportRuntimeComponent
        public TransportRuntime getTransportRuntime() {
            return this.transportRuntimeProvider.get();
        }
    }

    private DaggerTransportRuntimeComponent() {
    }

    public static TransportRuntimeComponent.Builder builder() {
        return new Builder();
    }
}
