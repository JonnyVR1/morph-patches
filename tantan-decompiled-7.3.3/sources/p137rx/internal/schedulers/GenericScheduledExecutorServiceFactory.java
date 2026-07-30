package p137rx.internal.schedulers;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import p137rx.internal.util.RxThreadFactory;
import p153l.hrd0;
import p153l.pcj;

/* JADX INFO: loaded from: classes3.dex */
enum GenericScheduledExecutorServiceFactory {
    ;

    static final String THREAD_NAME_PREFIX = "RxScheduledExecutorPool-";
    static final RxThreadFactory THREAD_FACTORY = new RxThreadFactory(THREAD_NAME_PREFIX);

    public static ScheduledExecutorService create() {
        pcj<? extends ScheduledExecutorService> pcjVarM136783a = hrd0.m136783a();
        return pcjVarM136783a == null ? createDefault() : pcjVarM136783a.call();
    }

    public static ScheduledExecutorService createDefault() {
        return Executors.newScheduledThreadPool(1, threadFactory());
    }

    public static ThreadFactory threadFactory() {
        return THREAD_FACTORY;
    }
}
