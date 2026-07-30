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
    public static /* synthetic */ Object m9363b(Uploader uploader, Iterable iterable, TransportContext transportContext, long j) {
        uploader.eventStore.recordFailure(iterable);
        uploader.eventStore.recordNextCallTime(transportContext, uploader.clock.getTime() + j);
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ Object m9364c(Uploader uploader) {
        uploader.clientHealthMetricsStore.resetClientMetrics();
        return null;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ Object m9366e(Uploader uploader, Iterable iterable) {
        uploader.eventStore.recordSuccess(iterable);
        return null;
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ Object m9367f(Uploader uploader, TransportContext transportContext, int i) {
        uploader.workScheduler.schedule(transportContext, i + 1);
        return null;
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ Object m9368g(Uploader uploader, TransportContext transportContext, long j) {
        uploader.eventStore.recordNextCallTime(transportContext, uploader.clock.getTime() + j);
        return null;
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ Object m9369h(Uploader uploader, Map map) {
        uploader.getClass();
        for (Map.Entry entry : map.entrySet()) {
            uploader.clientHealthMetricsStore.recordLogEventDropped(((Integer) entry.getValue()).intValue(), LogEventDropped.Reason.INVALID_PAYLOD, (String) entry.getKey());
        }
        return null;
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m9370i(final Uploader uploader, final TransportContext transportContext, final int i, Runnable runnable) {
        uploader.getClass();
        try {
            SynchronizationGuard synchronizationGuard = uploader.guard;
            final EventStore eventStore = uploader.eventStore;
            Objects.requireNonNull(eventStore);
            synchronizationGuard.runCriticalSection(new SynchronizationGuard.CriticalSection() { // from class: l.r3k0
                @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
                public final Object execute() {
                    return Integer.valueOf(eventStore.cleanUp());
                }
            });
            if (uploader.isNetworkAvailable()) {
                uploader.logAndUpdateState(transportContext, i);
            } else {
                uploader.guard.runCriticalSection(new SynchronizationGuard.CriticalSection() { // from class: l.t3k0
                    @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
                    public final Object execute() {
                        return Uploader.m9367f(this.f171929a, transportContext, i);
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
        return transportBackend.decorate(EventInternal.builder().setEventMillis(this.clock.getTime()).setUptimeMillis(this.uptimeClock.getTime()).setTransportName(CLIENT_HEALTH_METRICS_LOG_SOURCE).setEncodedPayload(new EncodedPayload(Encoding.m9346of("proto"), ((ClientMetrics) synchronizationGuard.runCriticalSection(new SynchronizationGuard.CriticalSection() { // from class: l.v3k0
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
        BackendResponse backendResponseM9350ok = BackendResponse.m9350ok(0L);
        final long j = 0;
        while (true) {
            boolean zBooleanValue = ((Boolean) this.guard.runCriticalSection(new SynchronizationGuard.CriticalSection() { // from class: l.w3k0
                @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
                public final Object execute() {
                    return Boolean.valueOf(this.f187145a.eventStore.hasPendingEventsFor(transportContext));
                }
            })).booleanValue();
            SynchronizationGuard synchronizationGuard = this.guard;
            if (!zBooleanValue) {
                final Uploader uploader = this;
                final TransportContext transportContext2 = transportContext;
                synchronizationGuard.runCriticalSection(new SynchronizationGuard.CriticalSection() { // from class: l.s3k0
                    @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
                    public final Object execute() {
                        return Uploader.m9368g(this.f166017a, transportContext2, j);
                    }
                });
                return backendResponseM9350ok;
            }
            final Iterable iterable = (Iterable) synchronizationGuard.runCriticalSection(new SynchronizationGuard.CriticalSection() { // from class: l.x3k0
                @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
                public final Object execute() {
                    return this.f192280a.eventStore.loadBatch(transportContext);
                }
            });
            if (!iterable.iterator().hasNext()) {
                return backendResponseM9350ok;
            }
            if (transportBackend == null) {
                Logging.m9352d(LOG_TAG, "Unknown backend for %s, deleting event batch for it...", transportContext);
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
            backendResponseM9350ok = backendResponseSend;
            BackendResponse.Status status = backendResponseM9350ok.getStatus();
            BackendResponse.Status status2 = BackendResponse.Status.TRANSIENT_ERROR;
            SynchronizationGuard synchronizationGuard2 = this.guard;
            if (status == status2) {
                final Uploader uploader2 = this;
                final TransportContext transportContext3 = transportContext;
                synchronizationGuard2.runCriticalSection(new SynchronizationGuard.CriticalSection() { // from class: l.y3k0
                    @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
                    public final Object execute() {
                        return Uploader.m9363b(this.f197366a, iterable, transportContext3, j);
                    }
                });
                uploader2.workScheduler.schedule(transportContext3, i + 1, true);
                return backendResponseM9350ok;
            }
            final Uploader uploader3 = this;
            TransportContext transportContext4 = transportContext;
            synchronizationGuard2.runCriticalSection(new SynchronizationGuard.CriticalSection() { // from class: l.z3k0
                @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
                public final Object execute() {
                    return Uploader.m9366e(this.f202836a, iterable);
                }
            });
            if (backendResponseM9350ok.getStatus() == BackendResponse.Status.OK) {
                long jMax = Math.max(j, backendResponseM9350ok.getNextRequestWaitMillis());
                if (transportContext4.shouldUploadClientHealthMetrics()) {
                    uploader3.guard.runCriticalSection(new SynchronizationGuard.CriticalSection() { // from class: l.a4k0
                        @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
                        public final Object execute() {
                            return Uploader.m9364c(this.f68427a);
                        }
                    });
                }
                j = jMax;
            } else if (backendResponseM9350ok.getStatus() == BackendResponse.Status.INVALID_PAYLOAD) {
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
                uploader3.guard.runCriticalSection(new SynchronizationGuard.CriticalSection() { // from class: l.b4k0
                    @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
                    public final Object execute() {
                        return Uploader.m9369h(this.f74934a, map);
                    }
                });
            }
            this = uploader3;
            transportContext = transportContext4;
        }
    }

    public void upload(final TransportContext transportContext, final int i, final Runnable runnable) {
        this.executor.execute(new Runnable() { // from class: l.u3k0
            @Override // java.lang.Runnable
            public final void run() {
                Uploader.m9370i(this.f177348a, transportContext, i, runnable);
            }
        });
    }
}
