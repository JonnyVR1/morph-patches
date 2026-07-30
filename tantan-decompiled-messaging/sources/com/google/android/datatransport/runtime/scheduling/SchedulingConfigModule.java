package com.google.android.datatransport.runtime.scheduling;

import com.google.android.datatransport.runtime.dagger.Module;
import com.google.android.datatransport.runtime.dagger.Provides;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import com.google.android.datatransport.runtime.time.Clock;
import com.google.android.datatransport.runtime.time.WallTime;

/* JADX INFO: loaded from: classes6.dex */
@Module
public abstract class SchedulingConfigModule {
    @Provides
    public static SchedulerConfig config(@WallTime Clock clock) {
        return SchedulerConfig.getDefault(clock);
    }
}
