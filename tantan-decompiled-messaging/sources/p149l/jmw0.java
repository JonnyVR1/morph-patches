package p149l;

import com.google.android.gms.internal.ads.C2244s3;
import com.google.android.gms.internal.ads.C2260u3;
import com.google.android.gms.internal.ads.C2284x3;
import com.google.android.gms.internal.ads.RunnableFutureC2292y3;
import com.google.android.gms.internal.ads.zzgaa;
import com.google.android.gms.internal.ads.zzgec;
import com.google.android.gms.internal.ads.zzgfo;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public final class jmw0 extends lmw0 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static imw0 m142228a(Iterable iterable) {
        return new imw0(false, zzgaa.zzj(iterable), null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static imw0 m142229b(Iterable iterable) {
        int i = zzgaa.zzd;
        iterable.getClass();
        return new imw0(true, zzgaa.zzj(iterable), null);
    }

    @SafeVarargs
    /* JADX INFO: renamed from: c */
    public static imw0 m142230c(gnr... gnrVarArr) {
        return new imw0(true, zzgaa.zzk(gnrVarArr), null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d */
    public static gnr m142231d(Iterable iterable) {
        return new slw0(zzgaa.zzj(iterable), true);
    }

    /* JADX INFO: renamed from: e */
    public static gnr m142232e(gnr gnrVar, Class cls, yew0 yew0Var, Executor executor) {
        skw0 skw0Var = new skw0(gnrVar, cls, yew0Var);
        gnrVar.addListener(skw0Var, C2260u3.m13342c(executor, skw0Var));
        return skw0Var;
    }

    /* JADX INFO: renamed from: f */
    public static gnr m142233f(gnr gnrVar, Class cls, rlw0 rlw0Var, Executor executor) {
        rkw0 rkw0Var = new rkw0(gnrVar, cls, rlw0Var);
        gnrVar.addListener(rkw0Var, C2260u3.m13342c(executor, rkw0Var));
        return rkw0Var;
    }

    /* JADX INFO: renamed from: g */
    public static gnr m142234g(Throwable th) {
        th.getClass();
        return new C2244s3(th);
    }

    /* JADX INFO: renamed from: h */
    public static gnr m142235h(Object obj) {
        return obj == null ? mmw0.f134708b : new mmw0(obj);
    }

    /* JADX INFO: renamed from: i */
    public static gnr m142236i() {
        return mmw0.f134708b;
    }

    /* JADX INFO: renamed from: j */
    public static gnr m142237j(Callable callable, Executor executor) {
        RunnableFutureC2292y3 runnableFutureC2292y3 = new RunnableFutureC2292y3(callable);
        executor.execute(runnableFutureC2292y3);
        return runnableFutureC2292y3;
    }

    /* JADX INFO: renamed from: k */
    public static gnr m142238k(qlw0 qlw0Var, Executor executor) {
        RunnableFutureC2292y3 runnableFutureC2292y3 = new RunnableFutureC2292y3(qlw0Var);
        executor.execute(runnableFutureC2292y3);
        return runnableFutureC2292y3;
    }

    @SafeVarargs
    /* JADX INFO: renamed from: l */
    public static gnr m142239l(gnr... gnrVarArr) {
        return new slw0(zzgaa.zzk(gnrVarArr), false);
    }

    /* JADX INFO: renamed from: m */
    public static gnr m142240m(gnr gnrVar, yew0 yew0Var, Executor executor) {
        hlw0 hlw0Var = new hlw0(gnrVar, yew0Var);
        gnrVar.addListener(hlw0Var, C2260u3.m13342c(executor, hlw0Var));
        return hlw0Var;
    }

    /* JADX INFO: renamed from: n */
    public static gnr m142241n(gnr gnrVar, rlw0 rlw0Var, Executor executor) {
        int i = ilw0.f113880j;
        executor.getClass();
        glw0 glw0Var = new glw0(gnrVar, rlw0Var);
        gnrVar.addListener(glw0Var, C2260u3.m13342c(executor, glw0Var));
        return glw0Var;
    }

    /* JADX INFO: renamed from: o */
    public static gnr m142242o(gnr gnrVar, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        return gnrVar.isDone() ? gnrVar : C2284x3.m13449E(gnrVar, j, timeUnit, scheduledExecutorService);
    }

    /* JADX INFO: renamed from: p */
    public static Object m142243p(Future future) throws ExecutionException {
        if (future.isDone()) {
            return anw0.m97816a(future);
        }
        qkq0.m175383a(yfw0.m214594b("Future was expected to be done: %s", future));
        return null;
    }

    /* JADX INFO: renamed from: q */
    public static Object m142244q(Future future) {
        try {
            return anw0.m97816a(future);
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause instanceof Error) {
                throw new zzgec((Error) cause);
            }
            throw new zzgfo(cause);
        }
    }

    /* JADX INFO: renamed from: r */
    public static void m142245r(gnr gnrVar, fmw0 fmw0Var, Executor executor) {
        fmw0Var.getClass();
        gnrVar.addListener(new gmw0(gnrVar, fmw0Var), executor);
    }
}
