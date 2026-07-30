package com.google.android.datatransport.runtime.scheduling;

import com.google.android.datatransport.runtime.backends.BackendRegistry;
import com.google.android.datatransport.runtime.dagger.internal.DaggerGenerated;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.dagger.internal.QualifierMetadata;
import com.google.android.datatransport.runtime.dagger.internal.ScopeMetadata;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import java.util.concurrent.Executor;
import p149l.eza0;

/* JADX INFO: loaded from: classes6.dex */
@QualifierMetadata
@ScopeMetadata
@DaggerGenerated
public final class DefaultScheduler_Factory implements Factory<DefaultScheduler> {
    private final eza0<BackendRegistry> backendRegistryProvider;
    private final eza0<EventStore> eventStoreProvider;
    private final eza0<Executor> executorProvider;
    private final eza0<SynchronizationGuard> guardProvider;
    private final eza0<WorkScheduler> workSchedulerProvider;

    public DefaultScheduler_Factory(eza0<Executor> eza0Var, eza0<BackendRegistry> eza0Var2, eza0<WorkScheduler> eza0Var3, eza0<EventStore> eza0Var4, eza0<SynchronizationGuard> eza0Var5) {
        this.executorProvider = eza0Var;
        this.backendRegistryProvider = eza0Var2;
        this.workSchedulerProvider = eza0Var3;
        this.eventStoreProvider = eza0Var4;
        this.guardProvider = eza0Var5;
    }

    public static DefaultScheduler_Factory create(eza0<Executor> eza0Var, eza0<BackendRegistry> eza0Var2, eza0<WorkScheduler> eza0Var3, eza0<EventStore> eza0Var4, eza0<SynchronizationGuard> eza0Var5) {
        return new DefaultScheduler_Factory(eza0Var, eza0Var2, eza0Var3, eza0Var4, eza0Var5);
    }

    public static DefaultScheduler newInstance(Executor executor, BackendRegistry backendRegistry, WorkScheduler workScheduler, EventStore eventStore, SynchronizationGuard synchronizationGuard) {
        return new DefaultScheduler(executor, backendRegistry, workScheduler, eventStore, synchronizationGuard);
    }

    @Override // com.google.android.datatransport.runtime.dagger.internal.Factory, p149l.eza0
    public DefaultScheduler get() {
        return newInstance(this.executorProvider.get(), this.backendRegistryProvider.get(), this.workSchedulerProvider.get(), this.eventStoreProvider.get(), this.guardProvider.get());
    }
}
