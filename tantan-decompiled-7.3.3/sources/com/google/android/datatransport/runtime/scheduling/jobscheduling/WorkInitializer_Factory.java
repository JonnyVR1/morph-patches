package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.dagger.internal.DaggerGenerated;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.dagger.internal.QualifierMetadata;
import com.google.android.datatransport.runtime.dagger.internal.ScopeMetadata;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import java.util.concurrent.Executor;
import p153l.i7b0;

/* JADX INFO: loaded from: classes6.dex */
@QualifierMetadata
@ScopeMetadata
@DaggerGenerated
public final class WorkInitializer_Factory implements Factory<WorkInitializer> {
    private final i7b0<Executor> executorProvider;
    private final i7b0<SynchronizationGuard> guardProvider;
    private final i7b0<WorkScheduler> schedulerProvider;
    private final i7b0<EventStore> storeProvider;

    public WorkInitializer_Factory(i7b0<Executor> i7b0Var, i7b0<EventStore> i7b0Var2, i7b0<WorkScheduler> i7b0Var3, i7b0<SynchronizationGuard> i7b0Var4) {
        this.executorProvider = i7b0Var;
        this.storeProvider = i7b0Var2;
        this.schedulerProvider = i7b0Var3;
        this.guardProvider = i7b0Var4;
    }

    public static WorkInitializer_Factory create(i7b0<Executor> i7b0Var, i7b0<EventStore> i7b0Var2, i7b0<WorkScheduler> i7b0Var3, i7b0<SynchronizationGuard> i7b0Var4) {
        return new WorkInitializer_Factory(i7b0Var, i7b0Var2, i7b0Var3, i7b0Var4);
    }

    public static WorkInitializer newInstance(Executor executor, EventStore eventStore, WorkScheduler workScheduler, SynchronizationGuard synchronizationGuard) {
        return new WorkInitializer(executor, eventStore, workScheduler, synchronizationGuard);
    }

    @Override // com.google.android.datatransport.runtime.dagger.internal.Factory, p153l.i7b0
    public WorkInitializer get() {
        return newInstance(this.executorProvider.get(), this.storeProvider.get(), this.schedulerProvider.get(), this.guardProvider.get());
    }
}
