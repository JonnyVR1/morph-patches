package p149l;

import com.cosmos.mdlog.MDLog;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
class hiw implements ThreadFactory {

    /* JADX INFO: renamed from: a */
    private static final AtomicInteger f107985a = new AtomicInteger(1);

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        String str = "MK-thread #" + f107985a.getAndIncrement();
        MDLog.m7395i("KThreadFactory", "MKThreadFactory -> newThread : ".concat(str));
        Thread thread = new Thread(runnable, str);
        thread.setPriority(10);
        return thread;
    }
}
