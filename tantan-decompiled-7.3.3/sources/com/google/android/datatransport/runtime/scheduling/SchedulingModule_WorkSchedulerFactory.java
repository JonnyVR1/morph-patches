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
import p153l.i7b0;

/* JADX INFO: loaded from: classes6.dex */
@QualifierMetadata({"com.google.android.datatransport.runtime.time.Monotonic"})
@ScopeMetadata
@DaggerGenerated
public final class SchedulingModule_WorkSchedulerFactory implements Factory<WorkScheduler> {
    private final i7b0<Clock> clockProvider;
    private final i7b0<SchedulerConfig> configProvider;
    private final i7b0<Context> contextProvider;
    private final i7b0<EventStore> eventStoreProvider;

    public SchedulingModule_WorkSchedulerFactory(i7b0<Context> i7b0Var, i7b0<EventStore> i7b0Var2, i7b0<SchedulerConfig> i7b0Var3, i7b0<Clock> i7b0Var4) {
        this.contextProvider = i7b0Var;
        this.eventStoreProvider = i7b0Var2;
        this.configProvider = i7b0Var3;
        this.clockProvider = i7b0Var4;
    }

    public static SchedulingModule_WorkSchedulerFactory create(i7b0<Context> i7b0Var, i7b0<EventStore> i7b0Var2, i7b0<SchedulerConfig> i7b0Var3, i7b0<Clock> i7b0Var4) {
        return new SchedulingModule_WorkSchedulerFactory(i7b0Var, i7b0Var2, i7b0Var3, i7b0Var4);
    }

    public static WorkScheduler workScheduler(Context context, EventStore eventStore, SchedulerConfig schedulerConfig, Clock clock) {
        return (WorkScheduler) Preconditions.checkNotNullFromProvides(SchedulingModule.workScheduler(context, eventStore, schedulerConfig, clock));
    }

    @Override // com.google.android.datatransport.runtime.dagger.internal.Factory, p153l.i7b0
    public WorkScheduler get() {
        return workScheduler(this.contextProvider.get(), this.eventStoreProvider.get(), this.configProvider.get(), this.clockProvider.get());
    }
}
