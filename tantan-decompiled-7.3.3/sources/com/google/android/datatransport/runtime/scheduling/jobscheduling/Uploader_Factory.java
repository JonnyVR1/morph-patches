package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.Context;
import com.google.android.datatransport.runtime.backends.BackendRegistry;
import com.google.android.datatransport.runtime.dagger.internal.DaggerGenerated;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.dagger.internal.QualifierMetadata;
import com.google.android.datatransport.runtime.dagger.internal.ScopeMetadata;
import com.google.android.datatransport.runtime.scheduling.persistence.ClientHealthMetricsStore;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import com.google.android.datatransport.runtime.time.Clock;
import java.util.concurrent.Executor;
import p153l.i7b0;

/* JADX INFO: loaded from: classes6.dex */
@QualifierMetadata({"com.google.android.datatransport.runtime.time.WallTime", "com.google.android.datatransport.runtime.time.Monotonic"})
@ScopeMetadata
@DaggerGenerated
public final class Uploader_Factory implements Factory<Uploader> {
    private final i7b0<BackendRegistry> backendRegistryProvider;
    private final i7b0<ClientHealthMetricsStore> clientHealthMetricsStoreProvider;
    private final i7b0<Clock> clockProvider;
    private final i7b0<Context> contextProvider;
    private final i7b0<EventStore> eventStoreProvider;
    private final i7b0<Executor> executorProvider;
    private final i7b0<SynchronizationGuard> guardProvider;
    private final i7b0<Clock> uptimeClockProvider;
    private final i7b0<WorkScheduler> workSchedulerProvider;

    public Uploader_Factory(i7b0<Context> i7b0Var, i7b0<BackendRegistry> i7b0Var2, i7b0<EventStore> i7b0Var3, i7b0<WorkScheduler> i7b0Var4, i7b0<Executor> i7b0Var5, i7b0<SynchronizationGuard> i7b0Var6, i7b0<Clock> i7b0Var7, i7b0<Clock> i7b0Var8, i7b0<ClientHealthMetricsStore> i7b0Var9) {
        this.contextProvider = i7b0Var;
        this.backendRegistryProvider = i7b0Var2;
        this.eventStoreProvider = i7b0Var3;
        this.workSchedulerProvider = i7b0Var4;
        this.executorProvider = i7b0Var5;
        this.guardProvider = i7b0Var6;
        this.clockProvider = i7b0Var7;
        this.uptimeClockProvider = i7b0Var8;
        this.clientHealthMetricsStoreProvider = i7b0Var9;
    }

    public static Uploader_Factory create(i7b0<Context> i7b0Var, i7b0<BackendRegistry> i7b0Var2, i7b0<EventStore> i7b0Var3, i7b0<WorkScheduler> i7b0Var4, i7b0<Executor> i7b0Var5, i7b0<SynchronizationGuard> i7b0Var6, i7b0<Clock> i7b0Var7, i7b0<Clock> i7b0Var8, i7b0<ClientHealthMetricsStore> i7b0Var9) {
        return new Uploader_Factory(i7b0Var, i7b0Var2, i7b0Var3, i7b0Var4, i7b0Var5, i7b0Var6, i7b0Var7, i7b0Var8, i7b0Var9);
    }

    public static Uploader newInstance(Context context, BackendRegistry backendRegistry, EventStore eventStore, WorkScheduler workScheduler, Executor executor, SynchronizationGuard synchronizationGuard, Clock clock, Clock clock2, ClientHealthMetricsStore clientHealthMetricsStore) {
        return new Uploader(context, backendRegistry, eventStore, workScheduler, executor, synchronizationGuard, clock, clock2, clientHealthMetricsStore);
    }

    @Override // com.google.android.datatransport.runtime.dagger.internal.Factory, p153l.i7b0
    public Uploader get() {
        return newInstance(this.contextProvider.get(), this.backendRegistryProvider.get(), this.eventStoreProvider.get(), this.workSchedulerProvider.get(), this.executorProvider.get(), this.guardProvider.get(), this.clockProvider.get(), this.uptimeClockProvider.get(), this.clientHealthMetricsStoreProvider.get());
    }
}
