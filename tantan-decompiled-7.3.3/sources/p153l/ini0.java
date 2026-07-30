package p153l;

import bolts.ExecutorException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public class ini0<TResult> {

    /* JADX INFO: renamed from: i */
    public static final ExecutorService f115956i = b53.m102548a();

    /* JADX INFO: renamed from: j */
    private static final Executor f115957j = b53.m102549b();

    /* JADX INFO: renamed from: k */
    public static final Executor f115958k = vn0.m201897c();

    /* JADX INFO: renamed from: l */
    private static ini0<?> f115959l = new ini0<>((Object) null);

    /* JADX INFO: renamed from: m */
    private static ini0<Boolean> f115960m = new ini0<>(Boolean.TRUE);

    /* JADX INFO: renamed from: n */
    private static ini0<Boolean> f115961n = new ini0<>(Boolean.FALSE);

    /* JADX INFO: renamed from: o */
    private static ini0<?> f115962o = new ini0<>(true);

    /* JADX INFO: renamed from: b */
    private boolean f115964b;

    /* JADX INFO: renamed from: c */
    private boolean f115965c;

    /* JADX INFO: renamed from: d */
    private TResult f115966d;

    /* JADX INFO: renamed from: e */
    private Exception f115967e;

    /* JADX INFO: renamed from: f */
    private boolean f115968f;

    /* JADX INFO: renamed from: g */
    private jyj0 f115969g;

    /* JADX INFO: renamed from: a */
    private final Object f115963a = new Object();

    /* JADX INFO: renamed from: h */
    private List<u26<TResult, Void>> f115970h = new ArrayList();

    /* JADX INFO: renamed from: l.ini0$a */
    public class C17750a implements u26<TResult, Void> {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ tni0 f115971a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ u26 f115972b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ Executor f115973c;

        public C17750a(tni0 tni0Var, u26 u26Var, Executor executor, hg4 hg4Var) {
            this.f115971a = tni0Var;
            this.f115972b = u26Var;
            this.f115973c = executor;
        }

        @Override // p153l.u26
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Void mo8592a(ini0<TResult> ini0Var) {
            ini0.m141134d(this.f115971a, this.f115972b, ini0Var, this.f115973c, null);
            return null;
        }
    }

    /* JADX INFO: renamed from: l.ini0$b */
    public static class RunnableC17751b implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ tni0 f115975a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ u26 f115976b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ ini0 f115977c;

        public RunnableC17751b(hg4 hg4Var, tni0 tni0Var, u26 u26Var, ini0 ini0Var) {
            this.f115975a = tni0Var;
            this.f115976b = u26Var;
            this.f115977c = ini0Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f115975a.m191908d(this.f115976b.mo8592a(this.f115977c));
            } catch (CancellationException unused) {
                this.f115975a.m191906b();
            } catch (Exception e) {
                this.f115975a.m191907c(e);
            }
        }
    }

    /* JADX INFO: renamed from: l.ini0$c */
    public static class RunnableC17752c implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ tni0 f115978a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ Callable f115979b;

        public RunnableC17752c(hg4 hg4Var, tni0 tni0Var, Callable callable) {
            this.f115978a = tni0Var;
            this.f115979b = callable;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f115978a.m191908d(this.f115979b.call());
            } catch (CancellationException unused) {
                this.f115978a.m191906b();
            } catch (Exception e) {
                this.f115978a.m191907c(e);
            }
        }
    }

    /* JADX INFO: renamed from: l.ini0$d */
    public interface InterfaceC17753d {
    }

    private ini0(boolean z) {
        if (z) {
            m141146p();
        } else {
            m141148r(null);
        }
    }

    /* JADX INFO: renamed from: b */
    public static <TResult> ini0<TResult> m141132b(Callable<TResult> callable, Executor executor) {
        return m141133c(callable, executor, null);
    }

    /* JADX INFO: renamed from: c */
    public static <TResult> ini0<TResult> m141133c(Callable<TResult> callable, Executor executor, hg4 hg4Var) {
        tni0 tni0Var = new tni0();
        try {
            executor.execute(new RunnableC17752c(hg4Var, tni0Var, callable));
        } catch (Exception e) {
            tni0Var.m191907c(new ExecutorException(e));
        }
        return tni0Var.m191905a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static <TContinuationResult, TResult> void m141134d(tni0<TContinuationResult> tni0Var, u26<TResult, TContinuationResult> u26Var, ini0<TResult> ini0Var, Executor executor, hg4 hg4Var) {
        try {
            executor.execute(new RunnableC17751b(hg4Var, tni0Var, u26Var, ini0Var));
        } catch (Exception e) {
            tni0Var.m191907c(new ExecutorException(e));
        }
    }

    /* JADX INFO: renamed from: g */
    public static <TResult> ini0<TResult> m141135g(Exception exc) {
        tni0 tni0Var = new tni0();
        tni0Var.m191907c(exc);
        return tni0Var.m191905a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h */
    public static <TResult> ini0<TResult> m141136h(TResult tresult) {
        if (tresult == 0) {
            return (ini0<TResult>) f115959l;
        }
        if (tresult instanceof Boolean) {
            return ((Boolean) tresult).booleanValue() ? (ini0<TResult>) f115960m : (ini0<TResult>) f115961n;
        }
        tni0 tni0Var = new tni0();
        tni0Var.m191908d(tresult);
        return tni0Var.m191905a();
    }

    /* JADX INFO: renamed from: k */
    public static InterfaceC17753d m141137k() {
        return null;
    }

    /* JADX INFO: renamed from: o */
    private void m141138o() {
        synchronized (this.f115963a) {
            Iterator<u26<TResult, Void>> it = this.f115970h.iterator();
            while (it.hasNext()) {
                try {
                    it.next().mo8592a(this);
                } catch (RuntimeException e) {
                    throw e;
                } catch (Exception e2) {
                    throw new RuntimeException(e2);
                }
            }
            this.f115970h = null;
        }
    }

    /* JADX INFO: renamed from: e */
    public <TContinuationResult> ini0<TContinuationResult> m141139e(u26<TResult, TContinuationResult> u26Var) {
        return m141140f(u26Var, f115957j, null);
    }

    /* JADX INFO: renamed from: f */
    public <TContinuationResult> ini0<TContinuationResult> m141140f(u26<TResult, TContinuationResult> u26Var, Executor executor, hg4 hg4Var) {
        boolean zM141144m;
        ini0<TResult> ini0Var;
        u26<TResult, TContinuationResult> u26Var2;
        Executor executor2;
        hg4 hg4Var2;
        tni0 tni0Var = new tni0();
        synchronized (this.f115963a) {
            try {
                zM141144m = m141144m();
                if (zM141144m) {
                    ini0Var = this;
                    u26Var2 = u26Var;
                    executor2 = executor;
                    hg4Var2 = hg4Var;
                } else {
                    ini0Var = this;
                    u26Var2 = u26Var;
                    executor2 = executor;
                    hg4Var2 = hg4Var;
                    this.f115970h.add(ini0Var.new C17750a(tni0Var, u26Var2, executor2, hg4Var2));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zM141144m) {
            m141134d(tni0Var, u26Var2, ini0Var, executor2, hg4Var2);
        }
        return tni0Var.m191905a();
    }

    /* JADX INFO: renamed from: i */
    public Exception m141141i() {
        Exception exc;
        synchronized (this.f115963a) {
            try {
                if (this.f115967e != null) {
                    this.f115968f = true;
                }
                exc = this.f115967e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return exc;
    }

    /* JADX INFO: renamed from: j */
    public TResult m141142j() {
        TResult tresult;
        synchronized (this.f115963a) {
            tresult = this.f115966d;
        }
        return tresult;
    }

    /* JADX INFO: renamed from: l */
    public boolean m141143l() {
        boolean z;
        synchronized (this.f115963a) {
            z = this.f115965c;
        }
        return z;
    }

    /* JADX INFO: renamed from: m */
    public boolean m141144m() {
        boolean z;
        synchronized (this.f115963a) {
            z = this.f115964b;
        }
        return z;
    }

    /* JADX INFO: renamed from: n */
    public boolean m141145n() {
        boolean z;
        synchronized (this.f115963a) {
            z = m141141i() != null;
        }
        return z;
    }

    /* JADX INFO: renamed from: p */
    public boolean m141146p() {
        synchronized (this.f115963a) {
            try {
                if (this.f115964b) {
                    return false;
                }
                this.f115964b = true;
                this.f115965c = true;
                this.f115963a.notifyAll();
                m141138o();
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public boolean m141147q(Exception exc) {
        synchronized (this.f115963a) {
            try {
                if (this.f115964b) {
                    return false;
                }
                this.f115964b = true;
                this.f115967e = exc;
                this.f115968f = false;
                this.f115963a.notifyAll();
                m141138o();
                if (!this.f115968f) {
                    m141137k();
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public boolean m141148r(TResult tresult) {
        synchronized (this.f115963a) {
            try {
                if (this.f115964b) {
                    return false;
                }
                this.f115964b = true;
                this.f115966d = tresult;
                this.f115963a.notifyAll();
                m141138o();
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private ini0(TResult tresult) {
        m141148r(tresult);
    }

    public ini0() {
    }
}
