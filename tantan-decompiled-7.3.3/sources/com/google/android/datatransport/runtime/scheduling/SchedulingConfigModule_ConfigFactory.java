package com.google.android.datatransport.runtime.scheduling;

import com.google.android.datatransport.runtime.dagger.internal.DaggerGenerated;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.dagger.internal.Preconditions;
import com.google.android.datatransport.runtime.dagger.internal.QualifierMetadata;
import com.google.android.datatransport.runtime.dagger.internal.ScopeMetadata;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import com.google.android.datatransport.runtime.time.Clock;
import p153l.i7b0;

/* JADX INFO: loaded from: classes6.dex */
@QualifierMetadata({"com.google.android.datatransport.runtime.time.WallTime"})
@ScopeMetadata
@DaggerGenerated
public final class SchedulingConfigModule_ConfigFactory implements Factory<SchedulerConfig> {
    private final i7b0<Clock> clockProvider;

    public SchedulingConfigModule_ConfigFactory(i7b0<Clock> i7b0Var) {
        this.clockProvider = i7b0Var;
    }

    public static SchedulerConfig config(Clock clock) {
        return (SchedulerConfig) Preconditions.checkNotNullFromProvides(SchedulingConfigModule.config(clock));
    }

    public static SchedulingConfigModule_ConfigFactory create(i7b0<Clock> i7b0Var) {
        return new SchedulingConfigModule_ConfigFactory(i7b0Var);
    }

    @Override // com.google.android.datatransport.runtime.dagger.internal.Factory, p153l.i7b0
    public SchedulerConfig get() {
        return config(this.clockProvider.get());
    }
}
