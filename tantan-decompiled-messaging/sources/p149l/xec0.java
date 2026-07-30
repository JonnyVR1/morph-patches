package p149l;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.tantanapp.common.utils.CrashHelper;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes11.dex */
public final class xec0<TResult> extends jei0<TResult> {

    /* JADX INFO: renamed from: a */
    public final Object f192553a = new Object();

    /* JADX INFO: renamed from: b */
    public boolean f192554b;

    /* JADX INFO: renamed from: c */
    public boolean f192555c;

    /* JADX INFO: renamed from: d */
    public TResult f192556d;

    /* JADX INFO: renamed from: e */
    public Exception f192557e;

    /* JADX INFO: renamed from: f */
    public C22306c<TResult> f192558f;

    /* JADX INFO: renamed from: g */
    public List<og50<? super TResult>> f192559g;

    /* JADX INFO: renamed from: h */
    public List<zd50> f192560h;

    /* JADX INFO: renamed from: i */
    public List<gd50> f192561i;

    /* JADX INFO: renamed from: j */
    public List<kd50<TResult>> f192562j;

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ jei0 m208527m(o16 o16Var, xec0 xec0Var) {
        try {
            return (jei0) o16Var.mo137471a(xec0Var);
        } catch (Exception e) {
            CrashHelper.m81296c(e);
            throw f5f.m119489c(e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: n */
    public static /* synthetic */ jei0 m208528n(q5g0 q5g0Var, xec0 xec0Var) {
        try {
            return q5g0Var.then(xec0Var.mo141142g());
        } catch (Exception e) {
            CrashHelper.m81296c(e);
            throw f5f.m119489c(e);
        }
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ Object m208529o(o16 o16Var, xec0 xec0Var) {
        try {
            return o16Var.mo137471a(xec0Var);
        } catch (Exception e) {
            CrashHelper.m81296c(e);
            throw f5f.m119489c(e);
        }
    }

    @Override // p149l.jei0
    @NonNull
    /* JADX INFO: renamed from: a */
    public final jei0<TResult> mo141136a(@NonNull gd50 gd50Var) {
        if (this.f192561i == null) {
            synchronized (this.f192553a) {
                try {
                    if (this.f192561i == null) {
                        this.f192561i = new ArrayList();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (gd50Var == null) {
            CrashHelper.m81296c(new RuntimeException("addOnCanceledListener listener is null"));
            return this;
        }
        synchronized (this.f192553a) {
            this.f192561i.add(gd50Var);
        }
        return this;
    }

    @Override // p149l.jei0
    @NonNull
    /* JADX INFO: renamed from: b */
    public jei0<TResult> mo141137b(@NonNull zd50 zd50Var) {
        if (this.f192560h == null) {
            synchronized (this.f192553a) {
                try {
                    if (this.f192560h == null) {
                        this.f192560h = new ArrayList();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (zd50Var == null) {
            CrashHelper.m81296c(new RuntimeException("addOnFailureListener listener is null"));
            return this;
        }
        synchronized (this.f192553a) {
            this.f192560h.add(zd50Var);
        }
        return this;
    }

    @Override // p149l.jei0
    @NonNull
    /* JADX INFO: renamed from: c */
    public jei0<TResult> mo141138c(@NonNull og50<? super TResult> og50Var) {
        if (this.f192559g == null) {
            synchronized (this.f192553a) {
                try {
                    if (this.f192559g == null) {
                        this.f192559g = new ArrayList();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (og50Var == null) {
            CrashHelper.m81296c(new RuntimeException("addOnSuccessListener listener is null"));
            return this;
        }
        synchronized (this.f192553a) {
            this.f192559g.add(og50Var);
        }
        return this;
    }

    @Override // p149l.jei0
    @NonNull
    /* JADX INFO: renamed from: d */
    public final <TContinuationResult> jei0<TContinuationResult> mo141139d(@NonNull bud0 bud0Var, @NonNull final o16<TResult, TContinuationResult> o16Var) {
        xec0 xec0Var = new xec0();
        xec0Var.m208538x(C22306c.just(this).map(new w9j() { // from class: l.sec0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return xec0.m208529o(o16Var, (xec0) obj);
            }
        }));
        bud0Var.createWorker().mo99201b(new tec0(xec0Var));
        return xec0Var;
    }

    @Override // p149l.jei0
    @NonNull
    /* JADX INFO: renamed from: e */
    public final <TContinuationResult> jei0<TContinuationResult> mo141140e(@NonNull bud0 bud0Var, @NonNull final o16<TResult, jei0<TContinuationResult>> o16Var) {
        xec0 xec0Var = new xec0();
        xec0Var.m208538x(C22306c.just(this).map(new w9j() { // from class: l.wec0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return xec0.m208527m(o16Var, (xec0) obj);
            }
        }).map(new vec0()));
        bud0Var.createWorker().mo99201b(new tec0(xec0Var));
        return xec0Var;
    }

    @Override // p149l.jei0
    @Nullable
    /* JADX INFO: renamed from: f */
    public final Exception mo141141f() {
        Exception exc;
        synchronized (this.f192553a) {
            exc = this.f192557e;
        }
        return exc;
    }

    @Override // p149l.jei0
    /* JADX INFO: renamed from: g */
    public final TResult mo141142g() {
        return m208532r(2147483647L, TimeUnit.MILLISECONDS);
    }

    @Override // p149l.jei0
    /* JADX INFO: renamed from: h */
    public final boolean mo141143h() {
        boolean z;
        synchronized (this.f192553a) {
            z = this.f192554b;
        }
        return z;
    }

    @Override // p149l.jei0
    /* JADX INFO: renamed from: i */
    public final boolean mo141144i() {
        boolean z;
        synchronized (this.f192553a) {
            try {
                z = this.f192554b && !this.f192555c && this.f192557e == null;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // p149l.jei0
    @NonNull
    /* JADX INFO: renamed from: j */
    public final <TContinuationResult> jei0<TContinuationResult> mo141145j(bud0 bud0Var, final q5g0<TResult, TContinuationResult> q5g0Var) {
        xec0 xec0Var = new xec0();
        xec0Var.m208538x(C22306c.just(this).map(new w9j() { // from class: l.uec0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return xec0.m208528n(q5g0Var, (xec0) obj);
            }
        }).map(new vec0()));
        bud0Var.createWorker().mo99201b(new tec0(xec0Var));
        return xec0Var;
    }

    /* JADX INFO: renamed from: q */
    public final void m208531q() {
        if (this.f192555c) {
            throw new CancellationException("Task is already canceled.");
        }
    }

    /* JADX INFO: renamed from: r */
    public TResult m208532r(long j, TimeUnit timeUnit) {
        TResult tresult;
        synchronized (this.f192553a) {
            try {
                m208531q();
                if (!this.f192554b) {
                    this.f192558f.timeout(j, timeUnit).toBlocking().m212773f(mkd0.m154957I(new e30() { // from class: l.pec0
                        @Override // p149l.e30
                        public final void call(Object obj) {
                            this.f148418a.m208533s(obj);
                        }
                    }, new e30() { // from class: l.qec0
                        @Override // p149l.e30
                        public final void call(Object obj) {
                            this.f154004a.m208534t((Throwable) obj);
                        }
                    }, new d30() { // from class: l.rec0
                        @Override // p149l.d30
                        public final void call() {
                            this.f159043a.m208535u();
                        }
                    }));
                }
                Exception exc = this.f192557e;
                if (exc != null) {
                    throw new RuntimeException(exc);
                }
                tresult = this.f192556d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return tresult;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m208533s(Object obj) {
        if (this.f192555c) {
            return;
        }
        this.f192556d = obj;
        List<og50<? super TResult>> list = this.f192559g;
        if (list != null) {
            for (og50<? super TResult> og50Var : list) {
                if (og50Var != null) {
                    og50Var.onSuccess(this.f192556d);
                }
            }
        }
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m208534t(Throwable th) {
        this.f192554b = true;
        if (this.f192555c) {
            return;
        }
        this.f192557e = new Exception(th);
        List<zd50> list = this.f192560h;
        if (list != null) {
            for (zd50 zd50Var : list) {
                if (zd50Var != null) {
                    zd50Var.onFailure(this.f192557e);
                }
            }
        }
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m208535u() {
        List<kd50<TResult>> list;
        this.f192554b = true;
        if (this.f192555c || (list = this.f192562j) == null) {
            return;
        }
        for (kd50<TResult> kd50Var : list) {
            if (kd50Var != null) {
                kd50Var.m145624a(this);
            }
        }
    }

    /* JADX INFO: renamed from: v */
    public void m208536v(Exception exc) {
        synchronized (this.f192553a) {
            this.f192557e = exc;
            this.f192554b = true;
        }
    }

    /* JADX INFO: renamed from: w */
    public void m208537w(TResult tresult) {
        synchronized (this.f192553a) {
            this.f192556d = tresult;
            this.f192554b = true;
        }
    }

    /* JADX INFO: renamed from: x */
    public void m208538x(C22306c<TResult> c22306c) {
        this.f192558f = c22306c;
    }
}
