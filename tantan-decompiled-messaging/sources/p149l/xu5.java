package p149l;

import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.remote_config.C13098a;
import com.tantanapp.common.utils.CrashHelper;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes11.dex */
public class xu5 {

    /* JADX INFO: renamed from: c */
    public static final Map<String, xu5> f194472c = new HashMap();

    /* JADX INFO: renamed from: a */
    public final mv5 f194473a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public jei0<C13098a> f194474b = null;

    /* JADX INFO: renamed from: l.xu5$a */
    public static class C21220a<TResult> implements og50<TResult>, zd50, gd50 {

        /* JADX INFO: renamed from: a */
        public final CountDownLatch f194475a;

        public C21220a() {
            this.f194475a = new CountDownLatch(1);
        }

        /* JADX INFO: renamed from: a */
        public boolean m211090a(long j, TimeUnit timeUnit) throws InterruptedException {
            return this.f194475a.await(j, timeUnit);
        }

        @Override // p149l.zd50
        public void onFailure(@NonNull Exception exc) {
            this.f194475a.countDown();
        }

        @Override // p149l.og50
        public void onSuccess(TResult tresult) {
            this.f194475a.countDown();
        }
    }

    public xu5(mv5 mv5Var) {
        this.f194473a = mv5Var;
    }

    /* JADX INFO: renamed from: f */
    public static synchronized xu5 m211080f(mv5 mv5Var) {
        String strM156472b;
        Map<String, xu5> map;
        try {
            strM156472b = mv5Var.m156472b();
            map = f194472c;
            if (!map.containsKey(strM156472b)) {
                map.put(strM156472b, new xu5(mv5Var));
            }
        } catch (Throwable th) {
            throw th;
        }
        return map.get(strM156472b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public final <TResult> TResult m211081a(jei0<TResult> jei0Var, long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        C21220a c21220a;
        synchronized (this) {
            try {
                c21220a = null;
                Object[] objArr = 0;
                if (!jei0Var.mo141143h()) {
                    C21220a c21220a2 = new C21220a();
                    jei0Var.mo141138c(c21220a2);
                    jei0Var.mo141137b(c21220a2);
                    jei0Var.mo141136a(c21220a2);
                    c21220a = c21220a2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Objects.toString(c21220a);
        if (c21220a == null || c21220a.m211090a(j, timeUnit)) {
            if (jei0Var.mo141144i()) {
                return jei0Var.mo141142g();
            }
            throw new ExecutionException(jei0Var.mo141141f());
        }
        if (jei0Var.mo141144i()) {
            return jei0Var.mo141142g();
        }
        throw new TimeoutException("Task await timed out.");
    }

    /* JADX INFO: renamed from: b */
    public void m211082b() {
        synchronized (this) {
            this.f194474b = sfi0.m183933e(null);
        }
        this.f194473a.m156471a();
    }

    /* JADX INFO: renamed from: c */
    public synchronized jei0<C13098a> m211083c() {
        try {
            jei0<C13098a> jei0Var = this.f194474b;
            if (jei0Var == null || (jei0Var.mo141143h() && !this.f194474b.mo141144i())) {
                final mv5 mv5Var = this.f194473a;
                Objects.requireNonNull(mv5Var);
                this.f194474b = sfi0.m183929a(new Callable() { // from class: l.tu5
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return mv5Var.m156473d();
                    }
                });
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f194474b;
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public C13098a m211084d() {
        return m211085e(Looper.getMainLooper().getThread() == Thread.currentThread() ? 1L : 5L);
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public C13098a m211085e(long j) {
        synchronized (this) {
            try {
                jei0<C13098a> jei0Var = this.f194474b;
                if (jei0Var != null && jei0Var.mo141144i()) {
                    return this.f194474b.mo141142g();
                }
                try {
                    return (C13098a) m211081a(m211083c(), j, TimeUnit.SECONDS);
                } catch (InterruptedException | ExecutionException | TimeoutException e) {
                    CrashHelper.m81296c(e);
                    return null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public String m211086g() {
        return this.f194473a.m156472b();
    }

    /* JADX INFO: renamed from: h */
    public jei0<C13098a> m211087h(C13098a c13098a) {
        return m211088i(c13098a, true);
    }

    /* JADX INFO: renamed from: i */
    public jei0<C13098a> m211088i(C13098a c13098a, boolean z) {
        try {
            this.f194473a.m156474e(c13098a);
            if (z) {
                m211089j(c13098a);
            }
            return sfi0.m183933e(c13098a);
        } catch (IOException e) {
            CrashHelper.m81296c(e);
            return sfi0.m183932d(e);
        }
    }

    /* JADX INFO: renamed from: j */
    public final synchronized void m211089j(C13098a c13098a) {
        this.f194474b = sfi0.m183933e(c13098a);
    }
}
