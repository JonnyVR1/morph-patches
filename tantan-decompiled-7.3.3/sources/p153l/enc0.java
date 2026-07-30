package p153l;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.tantanapp.common.utils.CrashHelper;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes10.dex */
public final class enc0<TResult> extends jni0<TResult> {

    /* JADX INFO: renamed from: a */
    public final Object f94753a = new Object();

    /* JADX INFO: renamed from: b */
    public boolean f94754b;

    /* JADX INFO: renamed from: c */
    public boolean f94755c;

    /* JADX INFO: renamed from: d */
    public TResult f94756d;

    /* JADX INFO: renamed from: e */
    public Exception f94757e;

    /* JADX INFO: renamed from: f */
    public C22421c<TResult> f94758f;

    /* JADX INFO: renamed from: g */
    public List<uo50<? super TResult>> f94759g;

    /* JADX INFO: renamed from: h */
    public List<gm50> f94760h;

    /* JADX INFO: renamed from: i */
    public List<nl50> f94761i;

    /* JADX INFO: renamed from: j */
    public List<rl50<TResult>> f94762j;

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ jni0 m121502m(t26 t26Var, enc0 enc0Var) {
        try {
            return (jni0) t26Var.mo165110a(enc0Var);
        } catch (Exception e) {
            CrashHelper.m82479c(e);
            throw j6f.m143661c(e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: n */
    public static /* synthetic */ jni0 m121503n(ydg0 ydg0Var, enc0 enc0Var) {
        try {
            return ydg0Var.then(enc0Var.mo121512g());
        } catch (Exception e) {
            CrashHelper.m82479c(e);
            throw j6f.m143661c(e);
        }
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ Object m121504o(t26 t26Var, enc0 enc0Var) {
        try {
            return t26Var.mo165110a(enc0Var);
        } catch (Exception e) {
            CrashHelper.m82479c(e);
            throw j6f.m143661c(e);
        }
    }

    @Override // p153l.jni0
    @NonNull
    /* JADX INFO: renamed from: a */
    public final jni0<TResult> mo121506a(@NonNull nl50 nl50Var) {
        if (this.f94761i == null) {
            synchronized (this.f94753a) {
                try {
                    if (this.f94761i == null) {
                        this.f94761i = new ArrayList();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (nl50Var == null) {
            CrashHelper.m82479c(new RuntimeException("addOnCanceledListener listener is null"));
            return this;
        }
        synchronized (this.f94753a) {
            this.f94761i.add(nl50Var);
        }
        return this;
    }

    @Override // p153l.jni0
    @NonNull
    /* JADX INFO: renamed from: b */
    public jni0<TResult> mo121507b(@NonNull gm50 gm50Var) {
        if (this.f94760h == null) {
            synchronized (this.f94753a) {
                try {
                    if (this.f94760h == null) {
                        this.f94760h = new ArrayList();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (gm50Var == null) {
            CrashHelper.m82479c(new RuntimeException("addOnFailureListener listener is null"));
            return this;
        }
        synchronized (this.f94753a) {
            this.f94760h.add(gm50Var);
        }
        return this;
    }

    @Override // p153l.jni0
    @NonNull
    /* JADX INFO: renamed from: c */
    public jni0<TResult> mo121508c(@NonNull uo50<? super TResult> uo50Var) {
        if (this.f94759g == null) {
            synchronized (this.f94753a) {
                try {
                    if (this.f94759g == null) {
                        this.f94759g = new ArrayList();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (uo50Var == null) {
            CrashHelper.m82479c(new RuntimeException("addOnSuccessListener listener is null"));
            return this;
        }
        synchronized (this.f94753a) {
            this.f94759g.add(uo50Var);
        }
        return this;
    }

    @Override // p153l.jni0
    @NonNull
    /* JADX INFO: renamed from: d */
    public final <TContinuationResult> jni0<TContinuationResult> mo121509d(@NonNull f2e0 f2e0Var, @NonNull final t26<TResult, TContinuationResult> t26Var) {
        enc0 enc0Var = new enc0();
        enc0Var.m121523x(C22421c.just(this).map(new qcj() { // from class: l.zmc0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return enc0.m121504o(t26Var, (enc0) obj);
            }
        }));
        f2e0Var.createWorker().mo102836b(new anc0(enc0Var));
        return enc0Var;
    }

    @Override // p153l.jni0
    @NonNull
    /* JADX INFO: renamed from: e */
    public final <TContinuationResult> jni0<TContinuationResult> mo121510e(@NonNull f2e0 f2e0Var, @NonNull final t26<TResult, jni0<TContinuationResult>> t26Var) {
        enc0 enc0Var = new enc0();
        enc0Var.m121523x(C22421c.just(this).map(new qcj() { // from class: l.dnc0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return enc0.m121502m(t26Var, (enc0) obj);
            }
        }).map(new cnc0()));
        f2e0Var.createWorker().mo102836b(new anc0(enc0Var));
        return enc0Var;
    }

    @Override // p153l.jni0
    @Nullable
    /* JADX INFO: renamed from: f */
    public final Exception mo121511f() {
        Exception exc;
        synchronized (this.f94753a) {
            exc = this.f94757e;
        }
        return exc;
    }

    @Override // p153l.jni0
    /* JADX INFO: renamed from: g */
    public final TResult mo121512g() {
        return m121517r(2147483647L, TimeUnit.MILLISECONDS);
    }

    @Override // p153l.jni0
    /* JADX INFO: renamed from: h */
    public final boolean mo121513h() {
        boolean z;
        synchronized (this.f94753a) {
            z = this.f94754b;
        }
        return z;
    }

    @Override // p153l.jni0
    /* JADX INFO: renamed from: i */
    public final boolean mo121514i() {
        boolean z;
        synchronized (this.f94753a) {
            try {
                z = this.f94754b && !this.f94755c && this.f94757e == null;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // p153l.jni0
    @NonNull
    /* JADX INFO: renamed from: j */
    public final <TContinuationResult> jni0<TContinuationResult> mo121515j(f2e0 f2e0Var, final ydg0<TResult, TContinuationResult> ydg0Var) {
        enc0 enc0Var = new enc0();
        enc0Var.m121523x(C22421c.just(this).map(new qcj() { // from class: l.bnc0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return enc0.m121503n(ydg0Var, (enc0) obj);
            }
        }).map(new cnc0()));
        f2e0Var.createWorker().mo102836b(new anc0(enc0Var));
        return enc0Var;
    }

    /* JADX INFO: renamed from: q */
    public final void m121516q() {
        if (this.f94755c) {
            throw new CancellationException("Task is already canceled.");
        }
    }

    /* JADX INFO: renamed from: r */
    public TResult m121517r(long j, TimeUnit timeUnit) {
        TResult tresult;
        synchronized (this.f94753a) {
            try {
                m121516q();
                if (!this.f94754b) {
                    this.f94758f.timeout(j, timeUnit).toBlocking().m165966f(psd0.m173598I(new y20() { // from class: l.wmc0
                        @Override // p153l.y20
                        public final void call(Object obj) {
                            this.f189791a.m121518s(obj);
                        }
                    }, new y20() { // from class: l.xmc0
                        @Override // p153l.y20
                        public final void call(Object obj) {
                            this.f195064a.m121519t((Throwable) obj);
                        }
                    }, new x20() { // from class: l.ymc0
                        @Override // p153l.x20
                        public final void call() {
                            this.f200653a.m121520u();
                        }
                    }));
                }
                Exception exc = this.f94757e;
                if (exc != null) {
                    throw new RuntimeException(exc);
                }
                tresult = this.f94756d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return tresult;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m121518s(Object obj) {
        if (this.f94755c) {
            return;
        }
        this.f94756d = obj;
        List<uo50<? super TResult>> list = this.f94759g;
        if (list != null) {
            for (uo50<? super TResult> uo50Var : list) {
                if (uo50Var != null) {
                    uo50Var.onSuccess(this.f94756d);
                }
            }
        }
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m121519t(Throwable th) {
        this.f94754b = true;
        if (this.f94755c) {
            return;
        }
        this.f94757e = new Exception(th);
        List<gm50> list = this.f94760h;
        if (list != null) {
            for (gm50 gm50Var : list) {
                if (gm50Var != null) {
                    gm50Var.onFailure(this.f94757e);
                }
            }
        }
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m121520u() {
        List<rl50<TResult>> list;
        this.f94754b = true;
        if (this.f94755c || (list = this.f94762j) == null) {
            return;
        }
        for (rl50<TResult> rl50Var : list) {
            if (rl50Var != null) {
                rl50Var.m181916a(this);
            }
        }
    }

    /* JADX INFO: renamed from: v */
    public void m121521v(Exception exc) {
        synchronized (this.f94753a) {
            this.f94757e = exc;
            this.f94754b = true;
        }
    }

    /* JADX INFO: renamed from: w */
    public void m121522w(TResult tresult) {
        synchronized (this.f94753a) {
            this.f94756d = tresult;
            this.f94754b = true;
        }
    }

    /* JADX INFO: renamed from: x */
    public void m121523x(C22421c<TResult> c22421c) {
        this.f94758f = c22421c;
    }
}
