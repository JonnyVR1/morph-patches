package p149l;

import com.google.android.gms.internal.play_billing.C2411t;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public final class j6v0 extends s8v0 {
    /* JADX INFO: renamed from: a */
    public static fhv0 m140056a(Object obj) {
        return new y9v0(obj);
    }

    /* JADX INFO: renamed from: b */
    public static fhv0 m140057b(fhv0 fhv0Var, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        return fhv0Var.isDone() ? fhv0Var : C2411t.m14937B(fhv0Var, 28500L, timeUnit, scheduledExecutorService);
    }

    /* JADX INFO: renamed from: c */
    public static void m140058c(fhv0 fhv0Var, y3v0 y3v0Var, Executor executor) {
        fhv0Var.mo14894h(new d5v0(fhv0Var, y3v0Var), executor);
    }
}
