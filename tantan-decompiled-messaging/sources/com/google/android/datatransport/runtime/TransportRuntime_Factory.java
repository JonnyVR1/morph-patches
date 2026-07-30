package com.google.android.datatransport.runtime;

import com.google.android.datatransport.runtime.dagger.internal.DaggerGenerated;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.dagger.internal.QualifierMetadata;
import com.google.android.datatransport.runtime.dagger.internal.ScopeMetadata;
import com.google.android.datatransport.runtime.scheduling.Scheduler;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkInitializer;
import com.google.android.datatransport.runtime.time.Clock;
import p149l.eza0;

/* JADX INFO: loaded from: classes6.dex */
@QualifierMetadata({"com.google.android.datatransport.runtime.time.WallTime", "com.google.android.datatransport.runtime.time.Monotonic"})
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
public final class TransportRuntime_Factory implements Factory<TransportRuntime> {
    private final eza0<Clock> eventClockProvider;
    private final eza0<WorkInitializer> initializerProvider;
    private final eza0<Scheduler> schedulerProvider;
    private final eza0<Uploader> uploaderProvider;
    private final eza0<Clock> uptimeClockProvider;

    public TransportRuntime_Factory(eza0<Clock> eza0Var, eza0<Clock> eza0Var2, eza0<Scheduler> eza0Var3, eza0<Uploader> eza0Var4, eza0<WorkInitializer> eza0Var5) {
        this.eventClockProvider = eza0Var;
        this.uptimeClockProvider = eza0Var2;
        this.schedulerProvider = eza0Var3;
        this.uploaderProvider = eza0Var4;
        this.initializerProvider = eza0Var5;
    }

    public static TransportRuntime_Factory create(eza0<Clock> eza0Var, eza0<Clock> eza0Var2, eza0<Scheduler> eza0Var3, eza0<Uploader> eza0Var4, eza0<WorkInitializer> eza0Var5) {
        return new TransportRuntime_Factory(eza0Var, eza0Var2, eza0Var3, eza0Var4, eza0Var5);
    }

    public static TransportRuntime newInstance(Clock clock, Clock clock2, Scheduler scheduler, Uploader uploader, WorkInitializer workInitializer) {
        return new TransportRuntime(clock, clock2, scheduler, uploader, workInitializer);
    }

    @Override // com.google.android.datatransport.runtime.dagger.internal.Factory, p149l.eza0
    public TransportRuntime get() {
        return newInstance(this.eventClockProvider.get(), this.uptimeClockProvider.get(), this.schedulerProvider.get(), this.uploaderProvider.get(), this.initializerProvider.get());
    }
}
