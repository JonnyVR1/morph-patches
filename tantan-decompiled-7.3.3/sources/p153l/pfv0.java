package p153l;

import com.google.android.gms.internal.play_billing.C2434t;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public final class pfv0 extends yhv0 {
    /* JADX INFO: renamed from: a */
    public static lqv0 m172156a(Object obj) {
        return new ejv0(obj);
    }

    /* JADX INFO: renamed from: b */
    public static lqv0 m172157b(lqv0 lqv0Var, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        return lqv0Var.isDone() ? lqv0Var : C2434t.m14991B(lqv0Var, 28500L, timeUnit, scheduledExecutorService);
    }

    /* JADX INFO: renamed from: c */
    public static void m172158c(lqv0 lqv0Var, edv0 edv0Var, Executor executor) {
        lqv0Var.mo14948h(new jev0(lqv0Var, edv0Var), executor);
    }
}
