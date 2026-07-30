package p149l;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes6.dex */
public final class xqv0 {
    /* JADX INFO: renamed from: a */
    public static liv0 m210616a(ExecutorService executorService) {
        if (executorService instanceof liv0) {
            return (liv0) executorService;
        }
        return executorService instanceof ScheduledExecutorService ? new rpv0((ScheduledExecutorService) executorService) : new xkv0(executorService);
    }

    /* JADX INFO: renamed from: b */
    public static rjv0 m210617b(ScheduledExecutorService scheduledExecutorService) {
        return scheduledExecutorService instanceof rjv0 ? (rjv0) scheduledExecutorService : new rpv0(scheduledExecutorService);
    }
}
