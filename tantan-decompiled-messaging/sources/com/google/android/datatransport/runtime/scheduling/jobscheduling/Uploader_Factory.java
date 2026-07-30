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
import p149l.eza0;

/* JADX INFO: loaded from: classes6.dex */
@QualifierMetadata({"com.google.android.datatransport.runtime.time.WallTime", "com.google.android.datatransport.runtime.time.Monotonic"})
@ScopeMetadata
@DaggerGenerated
public final class Uploader_Factory implements Factory<Uploader> {
    private final eza0<BackendRegistry> backendRegistryProvider;
    private final eza0<ClientHealthMetricsStore> clientHealthMetricsStoreProvider;
    private final eza0<Clock> clockProvider;
    private final eza0<Context> contextProvider;
    private final eza0<EventStore> eventStoreProvider;
    private final eza0<Executor> executorProvider;
    private final eza0<SynchronizationGuard> guardProvider;
    private final eza0<Clock> uptimeClockProvider;
    private final eza0<WorkScheduler> workSchedulerProvider;

    public Uploader_Factory(eza0<Context> eza0Var, eza0<BackendRegistry> eza0Var2, eza0<EventStore> eza0Var3, eza0<WorkScheduler> eza0Var4, eza0<Executor> eza0Var5, eza0<SynchronizationGuard> eza0Var6, eza0<Clock> eza0Var7, eza0<Clock> eza0Var8, eza0<ClientHealthMetricsStore> eza0Var9) {
        this.contextProvider = eza0Var;
        this.backendRegistryProvider = eza0Var2;
        this.eventStoreProvider = eza0Var3;
        this.workSchedulerProvider = eza0Var4;
        this.executorProvider = eza0Var5;
        this.guardProvider = eza0Var6;
        this.clockProvider = eza0Var7;
        this.uptimeClockProvider = eza0Var8;
        this.clientHealthMetricsStoreProvider = eza0Var9;
    }

    public static Uploader_Factory create(eza0<Context> eza0Var, eza0<BackendRegistry> eza0Var2, eza0<EventStore> eza0Var3, eza0<WorkScheduler> eza0Var4, eza0<Executor> eza0Var5, eza0<SynchronizationGuard> eza0Var6, eza0<Clock> eza0Var7, eza0<Clock> eza0Var8, eza0<ClientHealthMetricsStore> eza0Var9) {
        return new Uploader_Factory(eza0Var, eza0Var2, eza0Var3, eza0Var4, eza0Var5, eza0Var6, eza0Var7, eza0Var8, eza0Var9);
    }

    public static Uploader newInstance(Context context, BackendRegistry backendRegistry, EventStore eventStore, WorkScheduler workScheduler, Executor executor, SynchronizationGuard synchronizationGuard, Clock clock, Clock clock2, ClientHealthMetricsStore clientHealthMetricsStore) {
        return new Uploader(context, backendRegistry, eventStore, workScheduler, executor, synchronizationGuard, clock, clock2, clientHealthMetricsStore);
    }

    @Override // com.google.android.datatransport.runtime.dagger.internal.Factory, p149l.eza0
    public Uploader get() {
        return newInstance(this.contextProvider.get(), this.backendRegistryProvider.get(), this.eventStoreProvider.get(), this.workSchedulerProvider.get(), this.executorProvider.get(), this.guardProvider.get(), this.clockProvider.get(), this.uptimeClockProvider.get(), this.clientHealthMetricsStoreProvider.get());
    }
}
