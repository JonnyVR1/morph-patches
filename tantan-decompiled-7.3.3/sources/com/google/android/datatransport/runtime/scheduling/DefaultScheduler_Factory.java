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
import p153l.i7b0;

/* JADX INFO: loaded from: classes6.dex */
@QualifierMetadata
@ScopeMetadata
@DaggerGenerated
public final class DefaultScheduler_Factory implements Factory<DefaultScheduler> {
    private final i7b0<BackendRegistry> backendRegistryProvider;
    private final i7b0<EventStore> eventStoreProvider;
    private final i7b0<Executor> executorProvider;
    private final i7b0<SynchronizationGuard> guardProvider;
    private final i7b0<WorkScheduler> workSchedulerProvider;

    public DefaultScheduler_Factory(i7b0<Executor> i7b0Var, i7b0<BackendRegistry> i7b0Var2, i7b0<WorkScheduler> i7b0Var3, i7b0<EventStore> i7b0Var4, i7b0<SynchronizationGuard> i7b0Var5) {
        this.executorProvider = i7b0Var;
        this.backendRegistryProvider = i7b0Var2;
        this.workSchedulerProvider = i7b0Var3;
        this.eventStoreProvider = i7b0Var4;
        this.guardProvider = i7b0Var5;
    }

    public static DefaultScheduler_Factory create(i7b0<Executor> i7b0Var, i7b0<BackendRegistry> i7b0Var2, i7b0<WorkScheduler> i7b0Var3, i7b0<EventStore> i7b0Var4, i7b0<SynchronizationGuard> i7b0Var5) {
        return new DefaultScheduler_Factory(i7b0Var, i7b0Var2, i7b0Var3, i7b0Var4, i7b0Var5);
    }

    public static DefaultScheduler newInstance(Executor executor, BackendRegistry backendRegistry, WorkScheduler workScheduler, EventStore eventStore, SynchronizationGuard synchronizationGuard) {
        return new DefaultScheduler(executor, backendRegistry, workScheduler, eventStore, synchronizationGuard);
    }

    @Override // com.google.android.datatransport.runtime.dagger.internal.Factory, p153l.i7b0
    public DefaultScheduler get() {
        return newInstance(this.executorProvider.get(), this.backendRegistryProvider.get(), this.workSchedulerProvider.get(), this.eventStoreProvider.get(), this.guardProvider.get());
    }
}
