package p153l;

import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.remote_config.C13261a;
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

/* JADX INFO: loaded from: classes10.dex */
public class bw5 {

    /* JADX INFO: renamed from: c */
    public static final Map<String, bw5> f78680c = new HashMap();

    /* JADX INFO: renamed from: a */
    public final rw5 f78681a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public jni0<C13261a> f78682b = null;

    /* JADX INFO: renamed from: l.bw5$a */
    public static class C16119a<TResult> implements uo50<TResult>, gm50, nl50 {

        /* JADX INFO: renamed from: a */
        public final CountDownLatch f78683a;

        public C16119a() {
            this.f78683a = new CountDownLatch(1);
        }

        /* JADX INFO: renamed from: a */
        public boolean m106646a(long j, TimeUnit timeUnit) throws InterruptedException {
            return this.f78683a.await(j, timeUnit);
        }

        @Override // p153l.gm50
        public void onFailure(@NonNull Exception exc) {
            this.f78683a.countDown();
        }

        @Override // p153l.uo50
        public void onSuccess(TResult tresult) {
            this.f78683a.countDown();
        }
    }

    public bw5(rw5 rw5Var) {
        this.f78681a = rw5Var;
    }

    /* JADX INFO: renamed from: f */
    public static synchronized bw5 m106636f(rw5 rw5Var) {
        String strM183344b;
        Map<String, bw5> map;
        try {
            strM183344b = rw5Var.m183344b();
            map = f78680c;
            if (!map.containsKey(strM183344b)) {
                map.put(strM183344b, new bw5(rw5Var));
            }
        } catch (Throwable th) {
            throw th;
        }
        return map.get(strM183344b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public final <TResult> TResult m106637a(jni0<TResult> jni0Var, long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        C16119a c16119a;
        synchronized (this) {
            try {
                c16119a = null;
                Object[] objArr = 0;
                if (!jni0Var.mo121513h()) {
                    C16119a c16119a2 = new C16119a();
                    jni0Var.mo121508c(c16119a2);
                    jni0Var.mo121507b(c16119a2);
                    jni0Var.mo121506a(c16119a2);
                    c16119a = c16119a2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Objects.toString(c16119a);
        if (c16119a == null || c16119a.m106646a(j, timeUnit)) {
            if (jni0Var.mo121514i()) {
                return jni0Var.mo121512g();
            }
            throw new ExecutionException(jni0Var.mo121511f());
        }
        if (jni0Var.mo121514i()) {
            return jni0Var.mo121512g();
        }
        throw new TimeoutException("Task await timed out.");
    }

    /* JADX INFO: renamed from: b */
    public void m106638b() {
        synchronized (this) {
            this.f78682b = soi0.m187244e(null);
        }
        this.f78681a.m183343a();
    }

    /* JADX INFO: renamed from: c */
    public synchronized jni0<C13261a> m106639c() {
        try {
            jni0<C13261a> jni0Var = this.f78682b;
            if (jni0Var == null || (jni0Var.mo121513h() && !this.f78682b.mo121514i())) {
                final rw5 rw5Var = this.f78681a;
                Objects.requireNonNull(rw5Var);
                this.f78682b = soi0.m187240a(new Callable() { // from class: l.xv5
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return rw5Var.m183345d();
                    }
                });
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f78682b;
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public C13261a m106640d() {
        return m106641e(Looper.getMainLooper().getThread() == Thread.currentThread() ? 1L : 5L);
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public C13261a m106641e(long j) {
        synchronized (this) {
            try {
                jni0<C13261a> jni0Var = this.f78682b;
                if (jni0Var != null && jni0Var.mo121514i()) {
                    return this.f78682b.mo121512g();
                }
                try {
                    return (C13261a) m106637a(m106639c(), j, TimeUnit.SECONDS);
                } catch (InterruptedException | ExecutionException | TimeoutException e) {
                    CrashHelper.m82479c(e);
                    return null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public String m106642g() {
        return this.f78681a.m183344b();
    }

    /* JADX INFO: renamed from: h */
    public jni0<C13261a> m106643h(C13261a c13261a) {
        return m106644i(c13261a, true);
    }

    /* JADX INFO: renamed from: i */
    public jni0<C13261a> m106644i(C13261a c13261a, boolean z) {
        try {
            this.f78681a.m183346e(c13261a);
            if (z) {
                m106645j(c13261a);
            }
            return soi0.m187244e(c13261a);
        } catch (IOException e) {
            CrashHelper.m82479c(e);
            return soi0.m187243d(e);
        }
    }

    /* JADX INFO: renamed from: j */
    public final synchronized void m106645j(C13261a c13261a) {
        this.f78682b = soi0.m187244e(c13261a);
    }
}
