package p007l;

import android.annotation.SuppressLint;
import com.p003p1.mobile.android.p004rx.rxthread.FastIoScheduler;
import com.tantanapp.common.network.RunnerProxy;
import com.tantanapp.common.utils.NullChecker;
import java.util.concurrent.atomic.AtomicBoolean;
import l.bud0;
import l.d30;
import l.e30;
import l.jo0;
import l.roj0;
import l.v9j;
import l.w9j;
import rx.c;
import rx.subjects.a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class fgf0<T> {

    /* JADX INFO: renamed from: a */
    public final String f2678a;

    /* JADX INFO: renamed from: b */
    public final RunnerProxy f2679b;

    /* JADX INFO: renamed from: c */
    public a<T> f2680c;

    /* JADX INFO: renamed from: d */
    public final ggi<T> f2681d;

    /* JADX INFO: renamed from: e */
    public final v9j<c<T>> f2682e;

    /* JADX INFO: renamed from: f */
    public AtomicBoolean f2683f;

    /* JADX INFO: renamed from: g */
    public final boolean f2684g;

    public fgf0(RunnerProxy runnerProxy, String str, ggi<T> ggiVar, v9j<c<T>> v9jVar, boolean z) {
        this.f2680c = a.b();
        this.f2683f = new AtomicBoolean(false);
        this.f2679b = runnerProxy;
        this.f2678a = str;
        this.f2681d = ggiVar;
        this.f2682e = v9jVar;
        this.f2684g = z;
    }

    /* JADX INFO: renamed from: A */
    public void m9106A(T t) {
        this.f2681d.m9268p(t);
        this.f2680c.onNext(t);
    }

    /* JADX INFO: renamed from: k */
    public c<T> m9107k() {
        return m9108l(true);
    }

    @SuppressLint({"SubscribeOnError"})
    /* JADX INFO: renamed from: l */
    public c<T> m9108l(final boolean z) {
        return this.f2680c.doOnSubscribe(new d30() { // from class: l.vff0
            public final void call() {
                this.f4973a.m9119w(z);
            }
        }).observeOn(jo0.a());
    }

    /* JADX INFO: renamed from: m */
    public T m9109m() {
        return NullChecker.a(this.f2680c.e()) ? (T) this.f2680c.e() : this.f2681d.m9256b();
    }

    /* JADX INFO: renamed from: n */
    public T m9110n() {
        return (T) this.f2680c.e();
    }

    /* JADX INFO: renamed from: o */
    public void m9111o() {
        this.f2681d.m9257c();
        this.f2680c.onNext((Object) null);
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m9112p(Object obj) {
        this.f2681d.m9268p(obj);
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ c m9114r(ggi.C0551a c0551a) {
        if (c0551a == null && this.f2683f.compareAndSet(false, true)) {
            return ((c) this.f2682e.call()).doOnNext(new e30() { // from class: l.dgf0
                public final void call(Object obj) {
                    this.f2570a.m9112p(obj);
                }
            });
        }
        if (!c0551a.f2778b) {
            e51.m9024G(new Runnable() { // from class: l.egf0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f2622a.m9113q();
                }
            });
        }
        return c.just(c0551a.f2777a);
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ roj0 m9115s(Object obj) {
        this.f2683f.compareAndSet(true, false);
        if (this.f2680c.e() == null) {
            this.f2680c.onNext(obj);
        }
        return roj0.a;
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m9116t(Throwable th) {
        this.f2683f.compareAndSet(true, false);
        if (this.f2684g) {
            this.f2680c.onNext((Object) null);
        }
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ roj0 m9117u(ggi.C0551a c0551a) {
        if (c0551a != null && this.f2680c.e() == null) {
            this.f2680c.onNext(c0551a.f2777a);
        }
        return roj0.a;
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m9118v(Throwable th) {
        if (this.f2684g) {
            this.f2680c.onNext((Object) null);
        }
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m9119w(boolean z) {
        synchronized (this) {
            try {
                if (this.f2680c.e() == null) {
                    RunnerProxy runnerProxy = this.f2679b;
                    String str = this.f2678a;
                    ggi<T> ggiVar = this.f2681d;
                    runnerProxy.now(str, z ? ggiVar.m9263k().flatMap(new w9j() { // from class: l.yff0
                        public final Object call(Object obj) {
                            return this.f5429a.m9114r((ggi.C0551a) obj);
                        }
                    }).subscribeOn(FastIoScheduler.f1329b).observeOn(jo0.a()).map(new w9j() { // from class: l.zff0
                        public final Object call(Object obj) {
                            return this.f5506a.m9115s(obj);
                        }
                    }).doOnError(new e30() { // from class: l.agf0
                        public final void call(Object obj) {
                            this.f1850a.m9116t((Throwable) obj);
                        }
                    }) : ggiVar.m9263k().subscribeOn(FastIoScheduler.f1329b).observeOn(jo0.a()).map(new w9j() { // from class: l.bgf0
                        public final Object call(Object obj) {
                            return this.f2308a.m9117u((ggi.C0551a) obj);
                        }
                    }).doOnError(new e30() { // from class: l.cgf0
                        public final void call(Object obj) {
                            this.f2468a.m9118v((Throwable) obj);
                        }
                    }), true);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m9120x(Object obj) {
        this.f2681d.m9268p(obj);
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ roj0 m9121y(Object obj) {
        this.f2680c.onNext(obj);
        return roj0.a;
    }

    @SuppressLint({"SubscribeOnError"})
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public c<roj0> m9113q() {
        if (this.f2683f.get()) {
            c.just(roj0.a).observeOn(FastIoScheduler.f1329b);
        }
        RunnerProxy runnerProxy = this.f2679b;
        String str = this.f2678a + "_refresh";
        c cVar = (c) this.f2682e.call();
        bud0 bud0Var = FastIoScheduler.f1329b;
        return runnerProxy.now(str, cVar.subscribeOn(bud0Var).observeOn(bud0Var).doOnNext(new e30() { // from class: l.wff0
            public final void call(Object obj) {
                this.f5038a.m9120x(obj);
            }
        }).observeOn(jo0.a()).map(new w9j() { // from class: l.xff0
            public final Object call(Object obj) {
                return this.f5289a.m9121y(obj);
            }
        }), false);
    }

    public fgf0(RunnerProxy runnerProxy, String str, ggi<T> ggiVar, v9j<c<T>> v9jVar) {
        this(runnerProxy, str, ggiVar, v9jVar, false);
    }

    public fgf0(String str, ggi<T> ggiVar, v9j<c<T>> v9jVar) {
        this(new RunnerProxy(), str, ggiVar, v9jVar);
    }
}
