package com.google.android.datatransport.runtime;

import com.google.android.datatransport.runtime.dagger.internal.DaggerGenerated;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.dagger.internal.QualifierMetadata;
import com.google.android.datatransport.runtime.dagger.internal.ScopeMetadata;
import com.google.android.datatransport.runtime.scheduling.Scheduler;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkInitializer;
import com.google.android.datatransport.runtime.time.Clock;
import p153l.i7b0;

/* JADX INFO: loaded from: classes6.dex */
@QualifierMetadata({"com.google.android.datatransport.runtime.time.WallTime", "com.google.android.datatransport.runtime.time.Monotonic"})
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
public final class TransportRuntime_Factory implements Factory<TransportRuntime> {
    private final i7b0<Clock> eventClockProvider;
    private final i7b0<WorkInitializer> initializerProvider;
    private final i7b0<Scheduler> schedulerProvider;
    private final i7b0<Uploader> uploaderProvider;
    private final i7b0<Clock> uptimeClockProvider;

    public TransportRuntime_Factory(i7b0<Clock> i7b0Var, i7b0<Clock> i7b0Var2, i7b0<Scheduler> i7b0Var3, i7b0<Uploader> i7b0Var4, i7b0<WorkInitializer> i7b0Var5) {
        this.eventClockProvider = i7b0Var;
        this.uptimeClockProvider = i7b0Var2;
        this.schedulerProvider = i7b0Var3;
        this.uploaderProvider = i7b0Var4;
        this.initializerProvider = i7b0Var5;
    }

    public static TransportRuntime_Factory create(i7b0<Clock> i7b0Var, i7b0<Clock> i7b0Var2, i7b0<Scheduler> i7b0Var3, i7b0<Uploader> i7b0Var4, i7b0<WorkInitializer> i7b0Var5) {
        return new TransportRuntime_Factory(i7b0Var, i7b0Var2, i7b0Var3, i7b0Var4, i7b0Var5);
    }

    public static TransportRuntime newInstance(Clock clock, Clock clock2, Scheduler scheduler, Uploader uploader, WorkInitializer workInitializer) {
        return new TransportRuntime(clock, clock2, scheduler, uploader, workInitializer);
    }

    @Override // com.google.android.datatransport.runtime.dagger.internal.Factory, p153l.i7b0
    public TransportRuntime get() {
        return newInstance(this.eventClockProvider.get(), this.uptimeClockProvider.get(), this.schedulerProvider.get(), this.uploaderProvider.get(), this.initializerProvider.get());
    }
}
