package p153l;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import com.tantanapp.beatles.safety.core.AbsSafetyPolicy;
import com.tantanapp.beatles.safety.exception.ActivityLifecycleException;
import com.tantanapp.beatles.safety.utils.ThrowableUtils;
import com.tencent.could.huiyansdk.overseas.HuiYanOsConfig;

/* JADX INFO: loaded from: classes11.dex */
public class rtb implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: a */
    public final Thread.UncaughtExceptionHandler f164798a = Thread.getDefaultUncaughtExceptionHandler();

    /* JADX INFO: renamed from: b */
    public final j5m<AbsSafetyPolicy> f164799b;

    /* JADX INFO: renamed from: c */
    public final Handler f164800c;

    /* JADX INFO: renamed from: d */
    public Runnable f164801d;

    /* JADX INFO: renamed from: l.rtb$a */
    public class RunnableC19909a implements Runnable {
        public RunnableC19909a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            qtb.m177907a(-1);
        }
    }

    /* JADX INFO: renamed from: l.rtb$b */
    public class C19910b implements Thread.UncaughtExceptionHandler {
        public C19910b() {
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(@NonNull Thread thread, @NonNull Throwable th) {
            rtb.this.m183107g(thread, th);
        }
    }

    public rtb() {
        Handler handler = new Handler();
        this.f164800c = handler;
        this.f164799b = du2.m118053m();
        this.f164801d = new RunnableC19909a();
        pf60<Integer, Integer> pf60VarM124683b = f9r.m124683b();
        if (pf60VarM124683b.f152157b.intValue() > 3) {
            this.f164801d.run();
        } else {
            f9r.m124685d(pf60VarM124683b.f152156a.intValue(), pf60VarM124683b.f152157b.intValue() + 1);
            handler.postDelayed(this.f164801d, HuiYanOsConfig.LONG_CHECK_OVERSEAS_DEFAULT_TIME_OUT);
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m183102b() {
        j5m<AbsSafetyPolicy> j5mVar = this.f164799b;
        return j5mVar != null && j5mVar.mo143544b();
    }

    /* JADX INFO: renamed from: c */
    public final void m183103c(Thread thread, Throwable th) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f164798a;
        if (uncaughtExceptionHandler == null || euj0.m122574b(uncaughtExceptionHandler)) {
            yx0.m217669d();
        } else {
            this.f164798a.uncaughtException(thread, th);
        }
    }

    /* JADX INFO: renamed from: d */
    public void m183104d() {
        Thread.setDefaultUncaughtExceptionHandler(this);
        if (m183102b()) {
            jpj0.m146505d(new C19910b());
        }
    }

    /* JADX INFO: renamed from: e */
    public final boolean m183105e(Thread thread) {
        return thread == Looper.getMainLooper().getThread();
    }

    /* JADX INFO: renamed from: f */
    public final boolean m183106f() {
        return m183102b() && this.f164799b.mo143546d();
    }

    /* JADX INFO: renamed from: g */
    public final void m183107g(Thread thread, Throwable th) {
        g9r.m129601d();
        Runnable runnable = this.f164801d;
        if (runnable != null) {
            this.f164800c.removeCallbacks(runnable);
            this.f164801d = null;
        }
        boolean zM129600c = g9r.m129600c();
        if (zM129600c) {
            f9r.m124682a(-1);
        }
        duj0 duj0VarM118149d = duj0.m118149d();
        boolean zM183105e = m183105e(thread);
        if (duj0VarM118149d.m118150c(th)) {
            duj0VarM118149d.m118157k(thread, th, false);
            m183103c(thread, th);
            return;
        }
        if (duj0VarM118149d.m118151e(thread, th, m183102b())) {
            return;
        }
        if (!zM183105e) {
            duj0VarM118149d.m118157k(thread, th, true);
            return;
        }
        if (zM129600c || ThrowableUtils.m82371c(th) || !m183102b() || ((th instanceof ActivityLifecycleException) && !m183106f())) {
            duj0VarM118149d.m118157k(thread, th, false);
            m183103c(thread, th);
        } else {
            this.f164799b.mo143543a();
            duj0VarM118149d.m118157k(thread, th, true);
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(@NonNull Thread thread, @NonNull Throwable th) {
        if (m183105e(thread) && m183102b()) {
            return;
        }
        m183107g(thread, th);
    }
}
