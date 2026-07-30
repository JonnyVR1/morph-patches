package p153l;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes6.dex */
public final class d0w0 {
    /* JADX INFO: renamed from: a */
    public static rrv0 m113472a(ExecutorService executorService) {
        if (executorService instanceof rrv0) {
            return (rrv0) executorService;
        }
        return executorService instanceof ScheduledExecutorService ? new xyv0((ScheduledExecutorService) executorService) : new duv0(executorService);
    }

    /* JADX INFO: renamed from: b */
    public static xsv0 m113473b(ScheduledExecutorService scheduledExecutorService) {
        return scheduledExecutorService instanceof xsv0 ? (xsv0) scheduledExecutorService : new xyv0(scheduledExecutorService);
    }
}
