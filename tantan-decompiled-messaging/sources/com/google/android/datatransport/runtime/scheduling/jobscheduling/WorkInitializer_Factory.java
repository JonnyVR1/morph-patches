package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.dagger.internal.DaggerGenerated;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.dagger.internal.QualifierMetadata;
import com.google.android.datatransport.runtime.dagger.internal.ScopeMetadata;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import java.util.concurrent.Executor;
import p149l.eza0;

/* JADX INFO: loaded from: classes6.dex */
@QualifierMetadata
@ScopeMetadata
@DaggerGenerated
public final class WorkInitializer_Factory implements Factory<WorkInitializer> {
    private final eza0<Executor> executorProvider;
    private final eza0<SynchronizationGuard> guardProvider;
    private final eza0<WorkScheduler> schedulerProvider;
    private final eza0<EventStore> storeProvider;

    public WorkInitializer_Factory(eza0<Executor> eza0Var, eza0<EventStore> eza0Var2, eza0<WorkScheduler> eza0Var3, eza0<SynchronizationGuard> eza0Var4) {
        this.executorProvider = eza0Var;
        this.storeProvider = eza0Var2;
        this.schedulerProvider = eza0Var3;
        this.guardProvider = eza0Var4;
    }

    public static WorkInitializer_Factory create(eza0<Executor> eza0Var, eza0<EventStore> eza0Var2, eza0<WorkScheduler> eza0Var3, eza0<SynchronizationGuard> eza0Var4) {
        return new WorkInitializer_Factory(eza0Var, eza0Var2, eza0Var3, eza0Var4);
    }

    public static WorkInitializer newInstance(Executor executor, EventStore eventStore, WorkScheduler workScheduler, SynchronizationGuard synchronizationGuard) {
        return new WorkInitializer(executor, eventStore, workScheduler, synchronizationGuard);
    }

    @Override // com.google.android.datatransport.runtime.dagger.internal.Factory, p149l.eza0
    public WorkInitializer get() {
        return newInstance(this.executorProvider.get(), this.storeProvider.get(), this.schedulerProvider.get(), this.guardProvider.get());
    }
}
