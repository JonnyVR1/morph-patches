package p149l;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import com.tantanapp.beatles.safety.core.AbsSafetyPolicy;
import com.tantanapp.beatles.safety.exception.ActivityLifecycleException;
import com.tantanapp.beatles.safety.utils.ThrowableUtils;
import com.tencent.could.huiyansdk.overseas.HuiYanOsConfig;

/* JADX INFO: loaded from: classes13.dex */
public class dsb implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: a */
    public final Thread.UncaughtExceptionHandler f87743a = Thread.getDefaultUncaughtExceptionHandler();

    /* JADX INFO: renamed from: b */
    public final q2m<AbsSafetyPolicy> f87744b;

    /* JADX INFO: renamed from: c */
    public final Handler f87745c;

    /* JADX INFO: renamed from: d */
    public Runnable f87746d;

    /* JADX INFO: renamed from: l.dsb$a */
    public class RunnableC16460a implements Runnable {
        public RunnableC16460a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            csb.m108487a(-1);
        }
    }

    /* JADX INFO: renamed from: l.dsb$b */
    public class C16461b implements Thread.UncaughtExceptionHandler {
        public C16461b() {
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(@NonNull Thread thread, @NonNull Throwable th) {
            dsb.this.m113461g(thread, th);
        }
    }

    public dsb() {
        Handler handler = new Handler();
        this.f87745c = handler;
        this.f87744b = nt2.m160822m();
        this.f87746d = new RunnableC16460a();
        j760<Integer, Integer> j760VarM115206b = e7r.m115206b();
        if (j760VarM115206b.f116565b.intValue() > 3) {
            this.f87746d.run();
        } else {
            e7r.m115208d(j760VarM115206b.f116564a.intValue(), j760VarM115206b.f116565b.intValue() + 1);
            handler.postDelayed(this.f87746d, HuiYanOsConfig.LONG_CHECK_OVERSEAS_DEFAULT_TIME_OUT);
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m113456b() {
        q2m<AbsSafetyPolicy> q2mVar = this.f87744b;
        return q2mVar != null && q2mVar.mo155669b();
    }

    /* JADX INFO: renamed from: c */
    public final void m113457c(Thread thread, Throwable th) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f87743a;
        if (uncaughtExceptionHandler == null || blj0.m102543b(uncaughtExceptionHandler)) {
            rx0.m181467d();
        } else {
            this.f87743a.uncaughtException(thread, th);
        }
    }

    /* JADX INFO: renamed from: d */
    public void m113458d() {
        Thread.setDefaultUncaughtExceptionHandler(this);
        if (m113456b()) {
            hgj0.m130831d(new C16461b());
        }
    }

    /* JADX INFO: renamed from: e */
    public final boolean m113459e(Thread thread) {
        return thread == Looper.getMainLooper().getThread();
    }

    /* JADX INFO: renamed from: f */
    public final boolean m113460f() {
        return m113456b() && this.f87744b.mo155671d();
    }

    /* JADX INFO: renamed from: g */
    public final void m113461g(Thread thread, Throwable th) {
        f7r.m119820d();
        Runnable runnable = this.f87746d;
        if (runnable != null) {
            this.f87745c.removeCallbacks(runnable);
            this.f87746d = null;
        }
        boolean zM119819c = f7r.m119819c();
        if (zM119819c) {
            e7r.m115205a(-1);
        }
        alj0 alj0VarM97291d = alj0.m97291d();
        boolean zM113459e = m113459e(thread);
        if (alj0VarM97291d.m97292c(th)) {
            alj0VarM97291d.m97299k(thread, th, false);
            m113457c(thread, th);
            return;
        }
        if (alj0VarM97291d.m97293e(thread, th, m113456b())) {
            return;
        }
        if (!zM113459e) {
            alj0VarM97291d.m97299k(thread, th, true);
            return;
        }
        if (zM119819c || ThrowableUtils.m81188c(th) || !m113456b() || ((th instanceof ActivityLifecycleException) && !m113460f())) {
            alj0VarM97291d.m97299k(thread, th, false);
            m113457c(thread, th);
        } else {
            this.f87744b.mo155668a();
            alj0VarM97291d.m97299k(thread, th, true);
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(@NonNull Thread thread, @NonNull Throwable th) {
        if (m113459e(thread) && m113456b()) {
            return;
        }
        m113461g(thread, th);
    }
}
