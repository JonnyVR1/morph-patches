package p009l;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.tantanapp.common.utils.CrashHelper;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import l.bud0;
import l.d30;
import l.e30;
import l.f5f;
import l.mkd0;
import l.w9j;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public final class xec0<TResult> extends jei0<TResult> {

    /* JADX INFO: renamed from: a */
    public final Object f22570a = new Object();

    /* JADX INFO: renamed from: b */
    public boolean f22571b;

    /* JADX INFO: renamed from: c */
    public boolean f22572c;

    /* JADX INFO: renamed from: d */
    public TResult f22573d;

    /* JADX INFO: renamed from: e */
    public Exception f22574e;

    /* JADX INFO: renamed from: f */
    public c<TResult> f22575f;

    /* JADX INFO: renamed from: g */
    public List<og50<? super TResult>> f22576g;

    /* JADX INFO: renamed from: h */
    public List<zd50> f22577h;

    /* JADX INFO: renamed from: i */
    public List<gd50> f22578i;

    /* JADX INFO: renamed from: j */
    public List<kd50<TResult>> f22579j;

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ jei0 m24838m(o16 o16Var, xec0 xec0Var) {
        try {
            return (jei0) o16Var.mo16684a(xec0Var);
        } catch (Exception e) {
            CrashHelper.c(e);
            throw f5f.c(e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: n */
    public static /* synthetic */ jei0 m24839n(q5g0 q5g0Var, xec0 xec0Var) {
        try {
            return q5g0Var.then(xec0Var.mo16962g());
        } catch (Exception e) {
            CrashHelper.c(e);
            throw f5f.c(e);
        }
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ Object m24840o(o16 o16Var, xec0 xec0Var) {
        try {
            return o16Var.mo16684a(xec0Var);
        } catch (Exception e) {
            CrashHelper.c(e);
            throw f5f.c(e);
        }
    }

    @Override // p009l.jei0
    @NonNull
    /* JADX INFO: renamed from: a */
    public final jei0<TResult> mo16956a(@NonNull gd50 gd50Var) {
        if (this.f22578i == null) {
            synchronized (this.f22570a) {
                try {
                    if (this.f22578i == null) {
                        this.f22578i = new ArrayList();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (gd50Var == null) {
            CrashHelper.c(new RuntimeException("addOnCanceledListener listener is null"));
            return this;
        }
        synchronized (this.f22570a) {
            this.f22578i.add(gd50Var);
        }
        return this;
    }

    @Override // p009l.jei0
    @NonNull
    /* JADX INFO: renamed from: b */
    public jei0<TResult> mo16957b(@NonNull zd50 zd50Var) {
        if (this.f22577h == null) {
            synchronized (this.f22570a) {
                try {
                    if (this.f22577h == null) {
                        this.f22577h = new ArrayList();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (zd50Var == null) {
            CrashHelper.c(new RuntimeException("addOnFailureListener listener is null"));
            return this;
        }
        synchronized (this.f22570a) {
            this.f22577h.add(zd50Var);
        }
        return this;
    }

    @Override // p009l.jei0
    @NonNull
    /* JADX INFO: renamed from: c */
    public jei0<TResult> mo16958c(@NonNull og50<? super TResult> og50Var) {
        if (this.f22576g == null) {
            synchronized (this.f22570a) {
                try {
                    if (this.f22576g == null) {
                        this.f22576g = new ArrayList();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (og50Var == null) {
            CrashHelper.c(new RuntimeException("addOnSuccessListener listener is null"));
            return this;
        }
        synchronized (this.f22570a) {
            this.f22576g.add(og50Var);
        }
        return this;
    }

    @Override // p009l.jei0
    @NonNull
    /* JADX INFO: renamed from: d */
    public final <TContinuationResult> jei0<TContinuationResult> mo16959d(@NonNull bud0 bud0Var, @NonNull final o16<TResult, TContinuationResult> o16Var) {
        xec0 xec0Var = new xec0();
        xec0Var.m24849x(c.just(this).map(new w9j() { // from class: l.sec0
            public final Object call(Object obj) {
                return xec0.m24840o(o16Var, (xec0) obj);
            }
        }));
        bud0Var.createWorker().b(new tec0(xec0Var));
        return xec0Var;
    }

    @Override // p009l.jei0
    @NonNull
    /* JADX INFO: renamed from: e */
    public final <TContinuationResult> jei0<TContinuationResult> mo16960e(@NonNull bud0 bud0Var, @NonNull final o16<TResult, jei0<TContinuationResult>> o16Var) {
        xec0 xec0Var = new xec0();
        xec0Var.m24849x(c.just(this).map(new w9j() { // from class: l.wec0
            public final Object call(Object obj) {
                return xec0.m24838m(o16Var, (xec0) obj);
            }
        }).map(new vec0()));
        bud0Var.createWorker().b(new tec0(xec0Var));
        return xec0Var;
    }

    @Override // p009l.jei0
    @Nullable
    /* JADX INFO: renamed from: f */
    public final Exception mo16961f() {
        Exception exc;
        synchronized (this.f22570a) {
            exc = this.f22574e;
        }
        return exc;
    }

    @Override // p009l.jei0
    /* JADX INFO: renamed from: g */
    public final TResult mo16962g() {
        return m24843r(2147483647L, TimeUnit.MILLISECONDS);
    }

    @Override // p009l.jei0
    /* JADX INFO: renamed from: h */
    public final boolean mo16963h() {
        boolean z;
        synchronized (this.f22570a) {
            z = this.f22571b;
        }
        return z;
    }

    @Override // p009l.jei0
    /* JADX INFO: renamed from: i */
    public final boolean mo16964i() {
        boolean z;
        synchronized (this.f22570a) {
            try {
                z = this.f22571b && !this.f22572c && this.f22574e == null;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // p009l.jei0
    @NonNull
    /* JADX INFO: renamed from: j */
    public final <TContinuationResult> jei0<TContinuationResult> mo16965j(bud0 bud0Var, final q5g0<TResult, TContinuationResult> q5g0Var) {
        xec0 xec0Var = new xec0();
        xec0Var.m24849x(c.just(this).map(new w9j() { // from class: l.uec0
            public final Object call(Object obj) {
                return xec0.m24839n(q5g0Var, (xec0) obj);
            }
        }).map(new vec0()));
        bud0Var.createWorker().b(new tec0(xec0Var));
        return xec0Var;
    }

    /* JADX INFO: renamed from: q */
    public final void m24842q() {
        if (this.f22572c) {
            throw new CancellationException("Task is already canceled.");
        }
    }

    /* JADX INFO: renamed from: r */
    public TResult m24843r(long j, TimeUnit timeUnit) {
        TResult tresult;
        synchronized (this.f22570a) {
            try {
                m24842q();
                if (!this.f22571b) {
                    this.f22575f.timeout(j, timeUnit).toBlocking().f(mkd0.I(new e30() { // from class: l.pec0
                        public final void call(Object obj) {
                            this.f18508a.m24844s(obj);
                        }
                    }, new e30() { // from class: l.qec0
                        public final void call(Object obj) {
                            this.f19171a.m24845t((Throwable) obj);
                        }
                    }, new d30() { // from class: l.rec0
                        public final void call() {
                            this.f19785a.m24846u();
                        }
                    }));
                }
                Exception exc = this.f22574e;
                if (exc != null) {
                    throw new RuntimeException(exc);
                }
                tresult = this.f22573d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return tresult;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m24844s(Object obj) {
        if (this.f22572c) {
            return;
        }
        this.f22573d = obj;
        List<og50<? super TResult>> list = this.f22576g;
        if (list != null) {
            for (og50<? super TResult> og50Var : list) {
                if (og50Var != null) {
                    og50Var.onSuccess(this.f22573d);
                }
            }
        }
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m24845t(Throwable th) {
        this.f22571b = true;
        if (this.f22572c) {
            return;
        }
        this.f22574e = new Exception(th);
        List<zd50> list = this.f22577h;
        if (list != null) {
            for (zd50 zd50Var : list) {
                if (zd50Var != null) {
                    zd50Var.onFailure(this.f22574e);
                }
            }
        }
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m24846u() {
        List<kd50<TResult>> list;
        this.f22571b = true;
        if (this.f22572c || (list = this.f22579j) == null) {
            return;
        }
        for (kd50<TResult> kd50Var : list) {
            if (kd50Var != null) {
                kd50Var.m17442a(this);
            }
        }
    }

    /* JADX INFO: renamed from: v */
    public void m24847v(Exception exc) {
        synchronized (this.f22570a) {
            this.f22574e = exc;
            this.f22571b = true;
        }
    }

    /* JADX INFO: renamed from: w */
    public void m24848w(TResult tresult) {
        synchronized (this.f22570a) {
            this.f22573d = tresult;
            this.f22571b = true;
        }
    }

    /* JADX INFO: renamed from: x */
    public void m24849x(c<TResult> cVar) {
        this.f22575f = cVar;
    }
}
