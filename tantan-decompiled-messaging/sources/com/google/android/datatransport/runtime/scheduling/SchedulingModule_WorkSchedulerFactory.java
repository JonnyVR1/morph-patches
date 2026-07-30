package com.google.android.datatransport.runtime.scheduling;

import android.content.Context;
import com.google.android.datatransport.runtime.dagger.internal.DaggerGenerated;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.dagger.internal.Preconditions;
import com.google.android.datatransport.runtime.dagger.internal.QualifierMetadata;
import com.google.android.datatransport.runtime.dagger.internal.ScopeMetadata;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.time.Clock;
import p149l.eza0;

/* JADX INFO: loaded from: classes6.dex */
@QualifierMetadata({"com.google.android.datatransport.runtime.time.Monotonic"})
@ScopeMetadata
@DaggerGenerated
public final class SchedulingModule_WorkSchedulerFactory implements Factory<WorkScheduler> {
    private final eza0<Clock> clockProvider;
    private final eza0<SchedulerConfig> configProvider;
    private final eza0<Context> contextProvider;
    private final eza0<EventStore> eventStoreProvider;

    public SchedulingModule_WorkSchedulerFactory(eza0<Context> eza0Var, eza0<EventStore> eza0Var2, eza0<SchedulerConfig> eza0Var3, eza0<Clock> eza0Var4) {
        this.contextProvider = eza0Var;
        this.eventStoreProvider = eza0Var2;
        this.configProvider = eza0Var3;
        this.clockProvider = eza0Var4;
    }

    public static SchedulingModule_WorkSchedulerFactory create(eza0<Context> eza0Var, eza0<EventStore> eza0Var2, eza0<SchedulerConfig> eza0Var3, eza0<Clock> eza0Var4) {
        return new SchedulingModule_WorkSchedulerFactory(eza0Var, eza0Var2, eza0Var3, eza0Var4);
    }

    public static WorkScheduler workScheduler(Context context, EventStore eventStore, SchedulerConfig schedulerConfig, Clock clock) {
        return (WorkScheduler) Preconditions.checkNotNullFromProvides(SchedulingModule.workScheduler(context, eventStore, schedulerConfig, clock));
    }

    @Override // com.google.android.datatransport.runtime.dagger.internal.Factory, p149l.eza0
    public WorkScheduler get() {
        return workScheduler(this.contextProvider.get(), this.eventStoreProvider.get(), this.configProvider.get(), this.clockProvider.get());
    }
}
