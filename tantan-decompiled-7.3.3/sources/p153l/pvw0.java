package p153l;

import com.google.android.gms.internal.ads.C2267s3;
import com.google.android.gms.internal.ads.C2283u3;
import com.google.android.gms.internal.ads.C2307x3;
import com.google.android.gms.internal.ads.RunnableFutureC2315y3;
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
public final class pvw0 extends rvw0 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static ovw0 m173974a(Iterable iterable) {
        return new ovw0(false, zzgaa.zzj(iterable), null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static ovw0 m173975b(Iterable iterable) {
        int i = zzgaa.zzd;
        iterable.getClass();
        return new ovw0(true, zzgaa.zzj(iterable), null);
    }

    @SafeVarargs
    /* JADX INFO: renamed from: c */
    public static ovw0 m173976c(hpr... hprVarArr) {
        return new ovw0(true, zzgaa.zzk(hprVarArr), null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d */
    public static hpr m173977d(Iterable iterable) {
        return new yuw0(zzgaa.zzj(iterable), true);
    }

    /* JADX INFO: renamed from: e */
    public static hpr m173978e(hpr hprVar, Class cls, eow0 eow0Var, Executor executor) {
        ytw0 ytw0Var = new ytw0(hprVar, cls, eow0Var);
        hprVar.addListener(ytw0Var, C2283u3.m13396c(executor, ytw0Var));
        return ytw0Var;
    }

    /* JADX INFO: renamed from: f */
    public static hpr m173979f(hpr hprVar, Class cls, xuw0 xuw0Var, Executor executor) {
        xtw0 xtw0Var = new xtw0(hprVar, cls, xuw0Var);
        hprVar.addListener(xtw0Var, C2283u3.m13396c(executor, xtw0Var));
        return xtw0Var;
    }

    /* JADX INFO: renamed from: g */
    public static hpr m173980g(Throwable th) {
        th.getClass();
        return new C2267s3(th);
    }

    /* JADX INFO: renamed from: h */
    public static hpr m173981h(Object obj) {
        return obj == null ? svw0.f170875b : new svw0(obj);
    }

    /* JADX INFO: renamed from: i */
    public static hpr m173982i() {
        return svw0.f170875b;
    }

    /* JADX INFO: renamed from: j */
    public static hpr m173983j(Callable callable, Executor executor) {
        RunnableFutureC2315y3 runnableFutureC2315y3 = new RunnableFutureC2315y3(callable);
        executor.execute(runnableFutureC2315y3);
        return runnableFutureC2315y3;
    }

    /* JADX INFO: renamed from: k */
    public static hpr m173984k(wuw0 wuw0Var, Executor executor) {
        RunnableFutureC2315y3 runnableFutureC2315y3 = new RunnableFutureC2315y3(wuw0Var);
        executor.execute(runnableFutureC2315y3);
        return runnableFutureC2315y3;
    }

    @SafeVarargs
    /* JADX INFO: renamed from: l */
    public static hpr m173985l(hpr... hprVarArr) {
        return new yuw0(zzgaa.zzk(hprVarArr), false);
    }

    /* JADX INFO: renamed from: m */
    public static hpr m173986m(hpr hprVar, eow0 eow0Var, Executor executor) {
        nuw0 nuw0Var = new nuw0(hprVar, eow0Var);
        hprVar.addListener(nuw0Var, C2283u3.m13396c(executor, nuw0Var));
        return nuw0Var;
    }

    /* JADX INFO: renamed from: n */
    public static hpr m173987n(hpr hprVar, xuw0 xuw0Var, Executor executor) {
        int i = ouw0.f149216j;
        executor.getClass();
        muw0 muw0Var = new muw0(hprVar, xuw0Var);
        hprVar.addListener(muw0Var, C2283u3.m13396c(executor, muw0Var));
        return muw0Var;
    }

    /* JADX INFO: renamed from: o */
    public static hpr m173988o(hpr hprVar, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        return hprVar.isDone() ? hprVar : C2307x3.m13503E(hprVar, j, timeUnit, scheduledExecutorService);
    }

    /* JADX INFO: renamed from: p */
    public static Object m173989p(Future future) throws ExecutionException {
        if (future.isDone()) {
            return gww0.m132705a(future);
        }
        wtq0.m207906a(epw0.m121873b("Future was expected to be done: %s", future));
        return null;
    }

    /* JADX INFO: renamed from: q */
    public static Object m173990q(Future future) {
        try {
            return gww0.m132705a(future);
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause instanceof Error) {
                throw new zzgec((Error) cause);
            }
            throw new zzgfo(cause);
        }
    }

    /* JADX INFO: renamed from: r */
    public static void m173991r(hpr hprVar, lvw0 lvw0Var, Executor executor) {
        lvw0Var.getClass();
        hprVar.addListener(new mvw0(hprVar, lvw0Var), executor);
    }
}
