package p009l;

import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.remote_config.C0500a;
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

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class xu5 {

    /* JADX INFO: renamed from: c */
    public static final Map<String, xu5> f22728c = new HashMap();

    /* JADX INFO: renamed from: a */
    public final mv5 f22729a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public jei0<C0500a> f22730b = null;

    /* JADX INFO: renamed from: l.xu5$a */
    public static class C1315a<TResult> implements og50<TResult>, zd50, gd50 {

        /* JADX INFO: renamed from: a */
        public final CountDownLatch f22731a;

        public C1315a() {
            this.f22731a = new CountDownLatch(1);
        }

        /* JADX INFO: renamed from: a */
        public boolean m25001a(long j, TimeUnit timeUnit) throws InterruptedException {
            return this.f22731a.await(j, timeUnit);
        }

        @Override // p009l.zd50
        public void onFailure(@NonNull Exception exc) {
            this.f22731a.countDown();
        }

        @Override // p009l.og50
        public void onSuccess(TResult tresult) {
            this.f22731a.countDown();
        }
    }

    public xu5(mv5 mv5Var) {
        this.f22729a = mv5Var;
    }

    /* JADX INFO: renamed from: f */
    public static synchronized xu5 m24991f(mv5 mv5Var) {
        String strM18650b;
        Map<String, xu5> map;
        try {
            strM18650b = mv5Var.m18650b();
            map = f22728c;
            if (!map.containsKey(strM18650b)) {
                map.put(strM18650b, new xu5(mv5Var));
            }
        } catch (Throwable th) {
            throw th;
        }
        return map.get(strM18650b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public final <TResult> TResult m24992a(jei0<TResult> jei0Var, long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        C1315a c1315a;
        synchronized (this) {
            try {
                c1315a = null;
                Object[] objArr = 0;
                if (!jei0Var.mo16963h()) {
                    C1315a c1315a2 = new C1315a();
                    jei0Var.mo16958c(c1315a2);
                    jei0Var.mo16957b(c1315a2);
                    jei0Var.mo16956a(c1315a2);
                    c1315a = c1315a2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Objects.toString(c1315a);
        if (c1315a == null || c1315a.m25001a(j, timeUnit)) {
            if (jei0Var.mo16964i()) {
                return jei0Var.mo16962g();
            }
            throw new ExecutionException(jei0Var.mo16961f());
        }
        if (jei0Var.mo16964i()) {
            return jei0Var.mo16962g();
        }
        throw new TimeoutException("Task await timed out.");
    }

    /* JADX INFO: renamed from: b */
    public void m24993b() {
        synchronized (this) {
            this.f22730b = sfi0.m22139e(null);
        }
        this.f22729a.m18649a();
    }

    /* JADX INFO: renamed from: c */
    public synchronized jei0<C0500a> m24994c() {
        try {
            jei0<C0500a> jei0Var = this.f22730b;
            if (jei0Var == null || (jei0Var.mo16963h() && !this.f22730b.mo16964i())) {
                final mv5 mv5Var = this.f22729a;
                Objects.requireNonNull(mv5Var);
                this.f22730b = sfi0.m22135a(new Callable() { // from class: l.tu5
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return mv5Var.m18651d();
                    }
                });
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f22730b;
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public C0500a m24995d() {
        return m24996e(Looper.getMainLooper().getThread() == Thread.currentThread() ? 1L : 5L);
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public C0500a m24996e(long j) {
        synchronized (this) {
            try {
                jei0<C0500a> jei0Var = this.f22730b;
                if (jei0Var != null && jei0Var.mo16964i()) {
                    return this.f22730b.mo16962g();
                }
                try {
                    return (C0500a) m24992a(m24994c(), j, TimeUnit.SECONDS);
                } catch (InterruptedException | ExecutionException | TimeoutException e) {
                    CrashHelper.c(e);
                    return null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public String m24997g() {
        return this.f22729a.m18650b();
    }

    /* JADX INFO: renamed from: h */
    public jei0<C0500a> m24998h(C0500a c0500a) {
        return m24999i(c0500a, true);
    }

    /* JADX INFO: renamed from: i */
    public jei0<C0500a> m24999i(C0500a c0500a, boolean z) {
        try {
            this.f22729a.m18652e(c0500a);
            if (z) {
                m25000j(c0500a);
            }
            return sfi0.m22139e(c0500a);
        } catch (IOException e) {
            CrashHelper.c(e);
            return sfi0.m22138d(e);
        }
    }

    /* JADX INFO: renamed from: j */
    public final synchronized void m25000j(C0500a c0500a) {
        this.f22730b = sfi0.m22139e(c0500a);
    }
}
