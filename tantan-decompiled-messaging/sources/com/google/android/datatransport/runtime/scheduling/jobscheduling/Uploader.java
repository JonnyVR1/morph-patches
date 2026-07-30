package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.runtime.EncodedPayload;
import com.google.android.datatransport.runtime.EventInternal;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.backends.BackendRegistry;
import com.google.android.datatransport.runtime.backends.BackendRequest;
import com.google.android.datatransport.runtime.backends.BackendResponse;
import com.google.android.datatransport.runtime.backends.TransportBackend;
import com.google.android.datatransport.runtime.firebase.transport.ClientMetrics;
import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped;
import com.google.android.datatransport.runtime.logging.Logging;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader;
import com.google.android.datatransport.runtime.scheduling.persistence.ClientHealthMetricsStore;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.scheduling.persistence.PersistedEvent;
import com.google.android.datatransport.runtime.synchronization.SynchronizationException;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import com.google.android.datatransport.runtime.time.Clock;
import com.google.android.datatransport.runtime.time.Monotonic;
import com.google.android.datatransport.runtime.time.WallTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes6.dex */
public class Uploader {
    private static final String CLIENT_HEALTH_METRICS_LOG_SOURCE = "GDT_CLIENT_METRICS";
    private static final String LOG_TAG = "Uploader";
    private final BackendRegistry backendRegistry;
    private final ClientHealthMetricsStore clientHealthMetricsStore;
    private final Clock clock;
    private final Context context;
    private final EventStore eventStore;
    private final Executor executor;
    private final SynchronizationGuard guard;
    private final Clock uptimeClock;
    private final WorkScheduler workScheduler;

    public Uploader(Context context, BackendRegistry backendRegistry, EventStore eventStore, WorkScheduler workScheduler, Executor executor, SynchronizationGuard synchronizationGuard, @WallTime Clock clock, @Monotonic Clock clock2, ClientHealthMetricsStore clientHealthMetricsStore) {
        this.context = context;
        this.backendRegistry = backendRegistry;
        this.eventStore = eventStore;
        this.workScheduler = workScheduler;
        this.executor = executor;
        this.guard = synchronizationGuard;
        this.clock = clock;
        this.uptimeClock = clock2;
        this.clientHealthMetricsStore = clientHealthMetricsStore;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ Object m9309b(Uploader uploader, Iterable iterable, TransportContext transportContext, long j) {
        uploader.eventStore.recordFailure(iterable);
        uploader.eventStore.recordNextCallTime(transportContext, uploader.clock.getTime() + j);
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ Object m9310c(Uploader uploader) {
        uploader.clientHealthMetricsStore.resetClientMetrics();
        return null;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ Object m9312e(Uploader uploader, Iterable iterable) {
        uploader.eventStore.recordSuccess(iterable);
        return null;
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ Object m9313f(Uploader uploader, TransportContext transportContext, int i) {
        uploader.workScheduler.schedule(transportContext, i + 1);
        return null;
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ Object m9314g(Uploader uploader, TransportContext transportContext, long j) {
        uploader.eventStore.recordNextCallTime(transportContext, uploader.clock.getTime() + j);
        return null;
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ Object m9315h(Uploader uploader, Map map) {
        uploader.getClass();
        for (Map.Entry entry : map.entrySet()) {
            uploader.clientHealthMetricsStore.recordLogEventDropped(((Integer) entry.getValue()).intValue(), LogEventDropped.Reason.INVALID_PAYLOD, (String) entry.getKey());
        }
        return null;
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m9316i(final Uploader uploader, final TransportContext transportContext, final int i, Runnable runnable) {
        uploader.getClass();
        try {
            SynchronizationGuard synchronizationGuard = uploader.guard;
            final EventStore eventStore = uploader.eventStore;
            Objects.requireNonNull(eventStore);
            synchronizationGuard.runCriticalSection(new SynchronizationGuard.CriticalSection() { // from class: l.ouj0
                @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
                public final Object execute() {
                    return Integer.valueOf(eventStore.cleanUp());
                }
            });
            if (uploader.isNetworkAvailable()) {
                uploader.logAndUpdateState(transportContext, i);
            } else {
                uploader.guard.runCriticalSection(new SynchronizationGuard.CriticalSection() { // from class: l.quj0
                    @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
                    public final Object execute() {
                        return Uploader.m9313f(this.f156514a, transportContext, i);
                    }
                });
            }
        } catch (SynchronizationException unused) {
            uploader.workScheduler.schedule(transportContext, i + 1);
        } finally {
            runnable.run();
        }
    }

    @VisibleForTesting
    public EventInternal createMetricsEvent(TransportBackend transportBackend) {
        SynchronizationGuard synchronizationGuard = this.guard;
        final ClientHealthMetricsStore clientHealthMetricsStore = this.clientHealthMetricsStore;
        Objects.requireNonNull(clientHealthMetricsStore);
        return transportBackend.decorate(EventInternal.builder().setEventMillis(this.clock.getTime()).setUptimeMillis(this.uptimeClock.getTime()).setTransportName(CLIENT_HEALTH_METRICS_LOG_SOURCE).setEncodedPayload(new EncodedPayload(Encoding.m9292of("proto"), ((ClientMetrics) synchronizationGuard.runCriticalSection(new SynchronizationGuard.CriticalSection() { // from class: l.suj0
            @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
            public final Object execute() {
                return clientHealthMetricsStore.loadClientMetrics();
            }
        })).toByteArray())).build());
    }

    public boolean isNetworkAvailable() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public BackendResponse logAndUpdateState(final TransportContext transportContext, int i) {
        BackendResponse backendResponseSend;
        TransportBackend transportBackend = this.backendRegistry.get(transportContext.getBackendName());
        BackendResponse backendResponseM9296ok = BackendResponse.m9296ok(0L);
        final long j = 0;
        while (true) {
            boolean zBooleanValue = ((Boolean) this.guard.runCriticalSection(new SynchronizationGuard.CriticalSection() { // from class: l.tuj0
                @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
                public final Object execute() {
                    return Boolean.valueOf(this.f172182a.eventStore.hasPendingEventsFor(transportContext));
                }
            })).booleanValue();
            SynchronizationGuard synchronizationGuard = this.guard;
            if (!zBooleanValue) {
                final Uploader uploader = this;
                final TransportContext transportContext2 = transportContext;
                synchronizationGuard.runCriticalSection(new SynchronizationGuard.CriticalSection() { // from class: l.puj0
                    @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
                    public final Object execute() {
                        return Uploader.m9314g(this.f151297a, transportContext2, j);
                    }
                });
                return backendResponseM9296ok;
            }
            final Iterable iterable = (Iterable) synchronizationGuard.runCriticalSection(new SynchronizationGuard.CriticalSection() { // from class: l.uuj0
                @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
                public final Object execute() {
                    return this.f178401a.eventStore.loadBatch(transportContext);
                }
            });
            if (!iterable.iterator().hasNext()) {
                return backendResponseM9296ok;
            }
            if (transportBackend == null) {
                Logging.m9298d(LOG_TAG, "Unknown backend for %s, deleting event batch for it...", transportContext);
                backendResponseSend = BackendResponse.fatalError();
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(((PersistedEvent) it.next()).getEvent());
                }
                if (transportContext.shouldUploadClientHealthMetrics()) {
                    arrayList.add(this.createMetricsEvent(transportBackend));
                }
                backendResponseSend = transportBackend.send(BackendRequest.builder().setEvents(arrayList).setExtras(transportContext.getExtras()).build());
            }
            backendResponseM9296ok = backendResponseSend;
            BackendResponse.Status status = backendResponseM9296ok.getStatus();
            BackendResponse.Status status2 = BackendResponse.Status.TRANSIENT_ERROR;
            SynchronizationGuard synchronizationGuard2 = this.guard;
            if (status == status2) {
                final Uploader uploader2 = this;
                final TransportContext transportContext3 = transportContext;
                synchronizationGuard2.runCriticalSection(new SynchronizationGuard.CriticalSection() { // from class: l.vuj0
                    @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
                    public final Object execute() {
                        return Uploader.m9309b(this.f183081a, iterable, transportContext3, j);
                    }
                });
                uploader2.workScheduler.schedule(transportContext3, i + 1, true);
                return backendResponseM9296ok;
            }
            final Uploader uploader3 = this;
            TransportContext transportContext4 = transportContext;
            synchronizationGuard2.runCriticalSection(new SynchronizationGuard.CriticalSection() { // from class: l.wuj0
                @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
                public final Object execute() {
                    return Uploader.m9312e(this.f188137a, iterable);
                }
            });
            if (backendResponseM9296ok.getStatus() == BackendResponse.Status.OK) {
                long jMax = Math.max(j, backendResponseM9296ok.getNextRequestWaitMillis());
                if (transportContext4.shouldUploadClientHealthMetrics()) {
                    uploader3.guard.runCriticalSection(new SynchronizationGuard.CriticalSection() { // from class: l.xuj0
                        @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
                        public final Object execute() {
                            return Uploader.m9310c(this.f194505a);
                        }
                    });
                }
                j = jMax;
            } else if (backendResponseM9296ok.getStatus() == BackendResponse.Status.INVALID_PAYLOAD) {
                final HashMap map = new HashMap();
                Iterator it2 = iterable.iterator();
                while (it2.hasNext()) {
                    String transportName = ((PersistedEvent) it2.next()).getEvent().getTransportName();
                    if (map.containsKey(transportName)) {
                        map.put(transportName, Integer.valueOf(((Integer) map.get(transportName)).intValue() + 1));
                    } else {
                        map.put(transportName, 1);
                    }
                }
                uploader3.guard.runCriticalSection(new SynchronizationGuard.CriticalSection() { // from class: l.yuj0
                    @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
                    public final Object execute() {
                        return Uploader.m9315h(this.f200084a, map);
                    }
                });
            }
            this = uploader3;
            transportContext = transportContext4;
        }
    }

    public void upload(final TransportContext transportContext, final int i, final Runnable runnable) {
        this.executor.execute(new Runnable() { // from class: l.ruj0
            @Override // java.lang.Runnable
            public final void run() {
                Uploader.m9316i(this.f161063a, transportContext, i, runnable);
            }
        });
    }
}
