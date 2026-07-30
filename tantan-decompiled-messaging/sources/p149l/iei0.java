package p149l;

import bolts.ExecutorException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public class iei0<TResult> {

    /* JADX INFO: renamed from: i */
    public static final ExecutorService f112783i = l43.m148420a();

    /* JADX INFO: renamed from: j */
    private static final Executor f112784j = l43.m148421b();

    /* JADX INFO: renamed from: k */
    public static final Executor f112785k = zn0.m219391c();

    /* JADX INFO: renamed from: l */
    private static iei0<?> f112786l = new iei0<>((Object) null);

    /* JADX INFO: renamed from: m */
    private static iei0<Boolean> f112787m = new iei0<>(Boolean.TRUE);

    /* JADX INFO: renamed from: n */
    private static iei0<Boolean> f112788n = new iei0<>(Boolean.FALSE);

    /* JADX INFO: renamed from: o */
    private static iei0<?> f112789o = new iei0<>(true);

    /* JADX INFO: renamed from: b */
    private boolean f112791b;

    /* JADX INFO: renamed from: c */
    private boolean f112792c;

    /* JADX INFO: renamed from: d */
    private TResult f112793d;

    /* JADX INFO: renamed from: e */
    private Exception f112794e;

    /* JADX INFO: renamed from: f */
    private boolean f112795f;

    /* JADX INFO: renamed from: g */
    private gpj0 f112796g;

    /* JADX INFO: renamed from: a */
    private final Object f112790a = new Object();

    /* JADX INFO: renamed from: h */
    private List<p16<TResult, Void>> f112797h = new ArrayList();

    /* JADX INFO: renamed from: l.iei0$a */
    public class C17533a implements p16<TResult, Void> {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ tei0 f112798a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ p16 f112799b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ Executor f112800c;

        public C17533a(tei0 tei0Var, p16 p16Var, Executor executor, if4 if4Var) {
            this.f112798a = tei0Var;
            this.f112799b = p16Var;
            this.f112800c = executor;
        }

        @Override // p149l.p16
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Void mo8538a(iei0<TResult> iei0Var) {
            iei0.m135692d(this.f112798a, this.f112799b, iei0Var, this.f112800c, null);
            return null;
        }
    }

    /* JADX INFO: renamed from: l.iei0$b */
    public static class RunnableC17534b implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ tei0 f112802a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ p16 f112803b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ iei0 f112804c;

        public RunnableC17534b(if4 if4Var, tei0 tei0Var, p16 p16Var, iei0 iei0Var) {
            this.f112802a = tei0Var;
            this.f112803b = p16Var;
            this.f112804c = iei0Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f112802a.m188504d(this.f112803b.mo8538a(this.f112804c));
            } catch (CancellationException unused) {
                this.f112802a.m188502b();
            } catch (Exception e) {
                this.f112802a.m188503c(e);
            }
        }
    }

    /* JADX INFO: renamed from: l.iei0$c */
    public static class RunnableC17535c implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ tei0 f112805a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ Callable f112806b;

        public RunnableC17535c(if4 if4Var, tei0 tei0Var, Callable callable) {
            this.f112805a = tei0Var;
            this.f112806b = callable;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f112805a.m188504d(this.f112806b.call());
            } catch (CancellationException unused) {
                this.f112805a.m188502b();
            } catch (Exception e) {
                this.f112805a.m188503c(e);
            }
        }
    }

    /* JADX INFO: renamed from: l.iei0$d */
    public interface InterfaceC17536d {
    }

    private iei0(boolean z) {
        if (z) {
            m135704p();
        } else {
            m135706r(null);
        }
    }

    /* JADX INFO: renamed from: b */
    public static <TResult> iei0<TResult> m135690b(Callable<TResult> callable, Executor executor) {
        return m135691c(callable, executor, null);
    }

    /* JADX INFO: renamed from: c */
    public static <TResult> iei0<TResult> m135691c(Callable<TResult> callable, Executor executor, if4 if4Var) {
        tei0 tei0Var = new tei0();
        try {
            executor.execute(new RunnableC17535c(if4Var, tei0Var, callable));
        } catch (Exception e) {
            tei0Var.m188503c(new ExecutorException(e));
        }
        return tei0Var.m188501a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static <TContinuationResult, TResult> void m135692d(tei0<TContinuationResult> tei0Var, p16<TResult, TContinuationResult> p16Var, iei0<TResult> iei0Var, Executor executor, if4 if4Var) {
        try {
            executor.execute(new RunnableC17534b(if4Var, tei0Var, p16Var, iei0Var));
        } catch (Exception e) {
            tei0Var.m188503c(new ExecutorException(e));
        }
    }

    /* JADX INFO: renamed from: g */
    public static <TResult> iei0<TResult> m135693g(Exception exc) {
        tei0 tei0Var = new tei0();
        tei0Var.m188503c(exc);
        return tei0Var.m188501a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h */
    public static <TResult> iei0<TResult> m135694h(TResult tresult) {
        if (tresult == 0) {
            return (iei0<TResult>) f112786l;
        }
        if (tresult instanceof Boolean) {
            return ((Boolean) tresult).booleanValue() ? (iei0<TResult>) f112787m : (iei0<TResult>) f112788n;
        }
        tei0 tei0Var = new tei0();
        tei0Var.m188504d(tresult);
        return tei0Var.m188501a();
    }

    /* JADX INFO: renamed from: k */
    public static InterfaceC17536d m135695k() {
        return null;
    }

    /* JADX INFO: renamed from: o */
    private void m135696o() {
        synchronized (this.f112790a) {
            Iterator<p16<TResult, Void>> it = this.f112797h.iterator();
            while (it.hasNext()) {
                try {
                    it.next().mo8538a(this);
                } catch (RuntimeException e) {
                    throw e;
                } catch (Exception e2) {
                    throw new RuntimeException(e2);
                }
            }
            this.f112797h = null;
        }
    }

    /* JADX INFO: renamed from: e */
    public <TContinuationResult> iei0<TContinuationResult> m135697e(p16<TResult, TContinuationResult> p16Var) {
        return m135698f(p16Var, f112784j, null);
    }

    /* JADX INFO: renamed from: f */
    public <TContinuationResult> iei0<TContinuationResult> m135698f(p16<TResult, TContinuationResult> p16Var, Executor executor, if4 if4Var) {
        boolean zM135702m;
        iei0<TResult> iei0Var;
        p16<TResult, TContinuationResult> p16Var2;
        Executor executor2;
        if4 if4Var2;
        tei0 tei0Var = new tei0();
        synchronized (this.f112790a) {
            try {
                zM135702m = m135702m();
                if (zM135702m) {
                    iei0Var = this;
                    p16Var2 = p16Var;
                    executor2 = executor;
                    if4Var2 = if4Var;
                } else {
                    iei0Var = this;
                    p16Var2 = p16Var;
                    executor2 = executor;
                    if4Var2 = if4Var;
                    this.f112797h.add(iei0Var.new C17533a(tei0Var, p16Var2, executor2, if4Var2));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zM135702m) {
            m135692d(tei0Var, p16Var2, iei0Var, executor2, if4Var2);
        }
        return tei0Var.m188501a();
    }

    /* JADX INFO: renamed from: i */
    public Exception m135699i() {
        Exception exc;
        synchronized (this.f112790a) {
            try {
                if (this.f112794e != null) {
                    this.f112795f = true;
                }
                exc = this.f112794e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return exc;
    }

    /* JADX INFO: renamed from: j */
    public TResult m135700j() {
        TResult tresult;
        synchronized (this.f112790a) {
            tresult = this.f112793d;
        }
        return tresult;
    }

    /* JADX INFO: renamed from: l */
    public boolean m135701l() {
        boolean z;
        synchronized (this.f112790a) {
            z = this.f112792c;
        }
        return z;
    }

    /* JADX INFO: renamed from: m */
    public boolean m135702m() {
        boolean z;
        synchronized (this.f112790a) {
            z = this.f112791b;
        }
        return z;
    }

    /* JADX INFO: renamed from: n */
    public boolean m135703n() {
        boolean z;
        synchronized (this.f112790a) {
            z = m135699i() != null;
        }
        return z;
    }

    /* JADX INFO: renamed from: p */
    public boolean m135704p() {
        synchronized (this.f112790a) {
            try {
                if (this.f112791b) {
                    return false;
                }
                this.f112791b = true;
                this.f112792c = true;
                this.f112790a.notifyAll();
                m135696o();
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public boolean m135705q(Exception exc) {
        synchronized (this.f112790a) {
            try {
                if (this.f112791b) {
                    return false;
                }
                this.f112791b = true;
                this.f112794e = exc;
                this.f112795f = false;
                this.f112790a.notifyAll();
                m135696o();
                if (!this.f112795f) {
                    m135695k();
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public boolean m135706r(TResult tresult) {
        synchronized (this.f112790a) {
            try {
                if (this.f112791b) {
                    return false;
                }
                this.f112791b = true;
                this.f112793d = tresult;
                this.f112790a.notifyAll();
                m135696o();
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private iei0(TResult tresult) {
        m135706r(tresult);
    }

    public iei0() {
    }
}
