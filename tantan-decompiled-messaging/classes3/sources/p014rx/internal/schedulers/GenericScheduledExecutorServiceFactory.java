package p014rx.internal.schedulers;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import p003l.ejd0;
import p003l.v9j;
import p014rx.internal.util.RxThreadFactory;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
enum GenericScheduledExecutorServiceFactory {
    ;

    static final String THREAD_NAME_PREFIX = "RxScheduledExecutorPool-";
    static final RxThreadFactory THREAD_FACTORY = new RxThreadFactory(THREAD_NAME_PREFIX);

    public static ScheduledExecutorService create() {
        v9j<? extends ScheduledExecutorService> v9jVarM3855a = ejd0.m3855a();
        return v9jVarM3855a == null ? createDefault() : v9jVarM3855a.call();
    }

    public static ScheduledExecutorService createDefault() {
        return Executors.newScheduledThreadPool(1, threadFactory());
    }

    public static ThreadFactory threadFactory() {
        return THREAD_FACTORY;
    }
}
