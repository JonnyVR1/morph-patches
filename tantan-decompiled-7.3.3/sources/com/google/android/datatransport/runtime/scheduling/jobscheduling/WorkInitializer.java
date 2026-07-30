package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkInitializer;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes6.dex */
public class WorkInitializer {
    private final Executor executor;
    private final SynchronizationGuard guard;
    private final WorkScheduler scheduler;
    private final EventStore store;

    public WorkInitializer(Executor executor, EventStore eventStore, WorkScheduler workScheduler, SynchronizationGuard synchronizationGuard) {
        this.executor = executor;
        this.store = eventStore;
        this.scheduler = workScheduler;
        this.guard = synchronizationGuard;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Object m9371a(WorkInitializer workInitializer) {
        Iterator<TransportContext> it = workInitializer.store.loadActiveContexts().iterator();
        while (it.hasNext()) {
            workInitializer.scheduler.schedule(it.next(), 1);
        }
        return null;
    }

    public void ensureContextsScheduled() {
        this.executor.execute(new Runnable() { // from class: l.qiq0
            @Override // java.lang.Runnable
            public final void run() {
                WorkInitializer workInitializer = this.f157857a;
                workInitializer.guard.runCriticalSection(new SynchronizationGuard.CriticalSection() { // from class: l.riq0
                    @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
                    public final Object execute() {
                        return WorkInitializer.m9371a(workInitializer);
                    }
                });
            }
        });
    }
}
