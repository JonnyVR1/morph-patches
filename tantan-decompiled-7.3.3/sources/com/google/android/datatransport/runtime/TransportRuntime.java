package com.google.android.datatransport.runtime;

import android.content.Context;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.EventContext;
import com.google.android.datatransport.TransportFactory;
import com.google.android.datatransport.TransportScheduleCallback;
import com.google.android.datatransport.runtime.scheduling.Scheduler;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkInitializer;
import com.google.android.datatransport.runtime.time.Clock;
import com.google.android.datatransport.runtime.time.Monotonic;
import com.google.android.datatransport.runtime.time.WallTime;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Callable;
import p153l.wtq0;

/* JADX INFO: loaded from: classes6.dex */
public class TransportRuntime implements TransportInternal {
    private static volatile TransportRuntimeComponent instance;
    private final Clock eventClock;
    private final Scheduler scheduler;
    private final Uploader uploader;
    private final Clock uptimeClock;

    public TransportRuntime(@WallTime Clock clock, @Monotonic Clock clock2, Scheduler scheduler, Uploader uploader, WorkInitializer workInitializer) {
        this.eventClock = clock;
        this.uptimeClock = clock2;
        this.scheduler = scheduler;
        this.uploader = uploader;
        workInitializer.ensureContextsScheduled();
    }

    private EventInternal convert(SendRequest sendRequest) {
        EventInternal.Builder code = EventInternal.builder().setEventMillis(this.eventClock.getTime()).setUptimeMillis(this.uptimeClock.getTime()).setTransportName(sendRequest.getTransportName()).setEncodedPayload(new EncodedPayload(sendRequest.getEncoding(), sendRequest.getPayload())).setCode(sendRequest.getEvent().getCode());
        if (sendRequest.getEvent().getProductData() != null && sendRequest.getEvent().getProductData().getProductId() != null) {
            code.setProductId(sendRequest.getEvent().getProductData().getProductId());
        }
        if (sendRequest.getEvent().getEventContext() != null) {
            EventContext eventContext = sendRequest.getEvent().getEventContext();
            if (eventContext.getPseudonymousId() != null) {
                code.setPseudonymousId(eventContext.getPseudonymousId());
            }
            if (eventContext.getExperimentIdsClear() != null) {
                code.setExperimentIdsClear(eventContext.getExperimentIdsClear());
            }
            if (eventContext.getExperimentIdsEncrypted() != null) {
                code.setExperimentIdsEncrypted(eventContext.getExperimentIdsEncrypted());
            }
        }
        return code.build();
    }

    public static TransportRuntime getInstance() {
        TransportRuntimeComponent transportRuntimeComponent = instance;
        if (transportRuntimeComponent != null) {
            return transportRuntimeComponent.getTransportRuntime();
        }
        wtq0.m207906a("Not initialized!");
        return null;
    }

    private static Set<Encoding> getSupportedEncodings(Destination destination) {
        return destination instanceof EncodedDestination ? Collections.unmodifiableSet(((EncodedDestination) destination).getSupportedEncodings()) : Collections.singleton(Encoding.m9346of("proto"));
    }

    public static void initialize(Context context) {
        if (instance == null) {
            synchronized (TransportRuntime.class) {
                try {
                    if (instance == null) {
                        instance = DaggerTransportRuntimeComponent.builder().setApplicationContext(context).build();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.TESTS})
    @VisibleForTesting
    public static void withInstance(TransportRuntimeComponent transportRuntimeComponent, Callable<Void> callable) throws Throwable {
        TransportRuntimeComponent transportRuntimeComponent2;
        synchronized (TransportRuntime.class) {
            transportRuntimeComponent2 = instance;
            instance = transportRuntimeComponent;
        }
        try {
            callable.call();
            synchronized (TransportRuntime.class) {
                instance = transportRuntimeComponent2;
            }
        } catch (Throwable th) {
            synchronized (TransportRuntime.class) {
                instance = transportRuntimeComponent2;
                throw th;
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public Uploader getUploader() {
        return this.uploader;
    }

    public TransportFactory newFactory(Destination destination) {
        return new TransportFactoryImpl(getSupportedEncodings(destination), TransportContext.builder().setBackendName(destination.getName()).setExtras(destination.getExtras()).build(), this);
    }

    @Override // com.google.android.datatransport.runtime.TransportInternal
    public void send(SendRequest sendRequest, TransportScheduleCallback transportScheduleCallback) {
        this.scheduler.schedule(sendRequest.getTransportContext().withPriority(sendRequest.getEvent().getPriority()), convert(sendRequest), transportScheduleCallback);
    }

    @Deprecated
    public TransportFactory newFactory(String str) {
        return new TransportFactoryImpl(getSupportedEncodings(null), TransportContext.builder().setBackendName(str).build(), this);
    }
}
