package p133rx.internal.schedulers;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import p133rx.internal.util.RxThreadFactory;
import p149l.ejd0;
import p149l.v9j;

/* JADX INFO: loaded from: classes3.dex */
enum GenericScheduledExecutorServiceFactory {
    ;

    static final String THREAD_NAME_PREFIX = "RxScheduledExecutorPool-";
    static final RxThreadFactory THREAD_FACTORY = new RxThreadFactory(THREAD_NAME_PREFIX);

    public static ScheduledExecutorService create() {
        v9j<? extends ScheduledExecutorService> v9jVarM116784a = ejd0.m116784a();
        return v9jVarM116784a == null ? createDefault() : v9jVarM116784a.call();
    }

    public static ScheduledExecutorService createDefault() {
        return Executors.newScheduledThreadPool(1, threadFactory());
    }

    public static ThreadFactory threadFactory() {
        return THREAD_FACTORY;
    }
}
