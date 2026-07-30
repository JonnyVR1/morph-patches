package p149l;

import android.annotation.SuppressLint;
import com.p046p1.mobile.android.p047rx.rxthread.FastIoScheduler;
import com.tantanapp.common.network.RunnerProxy;
import com.tantanapp.common.utils.NullChecker;
import java.util.concurrent.atomic.AtomicBoolean;
import p133rx.C22306c;
import p133rx.subjects.C22392a;

/* JADX INFO: loaded from: classes8.dex */
public class fgf0<T> {

    /* JADX INFO: renamed from: a */
    public final String f97359a;

    /* JADX INFO: renamed from: b */
    public final RunnerProxy f97360b;

    /* JADX INFO: renamed from: c */
    public C22392a<T> f97361c;

    /* JADX INFO: renamed from: d */
    public final ggi<T> f97362d;

    /* JADX INFO: renamed from: e */
    public final v9j<C22306c<T>> f97363e;

    /* JADX INFO: renamed from: f */
    public AtomicBoolean f97364f;

    /* JADX INFO: renamed from: g */
    public final boolean f97365g;

    public fgf0(RunnerProxy runnerProxy, String str, ggi<T> ggiVar, v9j<C22306c<T>> v9jVar, boolean z) {
        this.f97361c = C22392a.m221512b();
        this.f97364f = new AtomicBoolean(false);
        this.f97360b = runnerProxy;
        this.f97359a = str;
        this.f97362d = ggiVar;
        this.f97363e = v9jVar;
        this.f97365g = z;
    }

    /* JADX INFO: renamed from: A */
    public void m121229A(T t) {
        this.f97362d.m125978p(t);
        this.f97361c.onNext(t);
    }

    /* JADX INFO: renamed from: k */
    public C22306c<T> m121230k() {
        return m121231l(true);
    }

    @SuppressLint({"SubscribeOnError"})
    /* JADX INFO: renamed from: l */
    public C22306c<T> m121231l(final boolean z) {
        return this.f97361c.doOnSubscribe(new d30() { // from class: l.vff0
            @Override // p149l.d30
            public final void call() {
                this.f181268a.m121242w(z);
            }
        }).observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: m */
    public T m121232m() {
        return NullChecker.m81303a(this.f97361c.m221515e()) ? this.f97361c.m221515e() : this.f97362d.m125966b();
    }

    /* JADX INFO: renamed from: n */
    public T m121233n() {
        return this.f97361c.m221515e();
    }

    /* JADX INFO: renamed from: o */
    public void m121234o() {
        this.f97362d.m125967c();
        this.f97361c.onNext(null);
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m121235p(Object obj) {
        this.f97362d.m125978p(obj);
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ C22306c m121237r(ggi.C17074a c17074a) {
        if (c17074a == null && this.f97364f.compareAndSet(false, true)) {
            return this.f97363e.call().doOnNext(new e30() { // from class: l.dgf0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f86079a.m121235p(obj);
                }
            });
        }
        if (!c17074a.f102513b) {
            e51.m114742G(new Runnable() { // from class: l.egf0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f90937a.m121236q();
                }
            });
        }
        return C22306c.just(c17074a.f102512a);
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ roj0 m121238s(Object obj) {
        this.f97364f.compareAndSet(true, false);
        if (this.f97361c.m221515e() == null) {
            this.f97361c.onNext(obj);
        }
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m121239t(Throwable th) {
        this.f97364f.compareAndSet(true, false);
        if (this.f97365g) {
            this.f97361c.onNext(null);
        }
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ roj0 m121240u(ggi.C17074a c17074a) {
        if (c17074a != null && this.f97361c.m221515e() == null) {
            this.f97361c.onNext(c17074a.f102512a);
        }
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m121241v(Throwable th) {
        if (this.f97365g) {
            this.f97361c.onNext(null);
        }
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m121242w(boolean z) {
        synchronized (this) {
            try {
                if (this.f97361c.m221515e() == null) {
                    RunnerProxy runnerProxy = this.f97360b;
                    String str = this.f97359a;
                    ggi<T> ggiVar = this.f97362d;
                    runnerProxy.now(str, z ? ggiVar.m125973k().flatMap(new w9j() { // from class: l.yff0
                        @Override // p149l.w9j
                        public final Object call(Object obj) {
                            return this.f198054a.m121237r((ggi.C17074a) obj);
                        }
                    }).subscribeOn(FastIoScheduler.f15630b).observeOn(jo0.m142408a()).map(new w9j() { // from class: l.zff0
                        @Override // p149l.w9j
                        public final Object call(Object obj) {
                            return this.f202937a.m121238s(obj);
                        }
                    }).doOnError(new e30() { // from class: l.agf0
                        @Override // p149l.e30
                        public final void call(Object obj) {
                            this.f69358a.m121239t((Throwable) obj);
                        }
                    }) : ggiVar.m125973k().subscribeOn(FastIoScheduler.f15630b).observeOn(jo0.m142408a()).map(new w9j() { // from class: l.bgf0
                        @Override // p149l.w9j
                        public final Object call(Object obj) {
                            return this.f75429a.m121240u((ggi.C17074a) obj);
                        }
                    }).doOnError(new e30() { // from class: l.cgf0
                        @Override // p149l.e30
                        public final void call(Object obj) {
                            this.f80739a.m121241v((Throwable) obj);
                        }
                    }), true);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m121243x(Object obj) {
        this.f97362d.m125978p(obj);
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ roj0 m121244y(Object obj) {
        this.f97361c.onNext(obj);
        return roj0.f160388a;
    }

    @SuppressLint({"SubscribeOnError"})
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public C22306c<roj0> m121236q() {
        if (this.f97364f.get()) {
            C22306c.just(roj0.f160388a).observeOn(FastIoScheduler.f15630b);
        }
        RunnerProxy runnerProxy = this.f97360b;
        String str = this.f97359a + "_refresh";
        C22306c<T> c22306cCall = this.f97363e.call();
        bud0 bud0Var = FastIoScheduler.f15630b;
        return runnerProxy.now(str, c22306cCall.subscribeOn(bud0Var).observeOn(bud0Var).doOnNext(new e30() { // from class: l.wff0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f186079a.m121243x(obj);
            }
        }).observeOn(jo0.m142408a()).map(new w9j() { // from class: l.xff0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f192686a.m121244y(obj);
            }
        }), false);
    }

    public fgf0(RunnerProxy runnerProxy, String str, ggi<T> ggiVar, v9j<C22306c<T>> v9jVar) {
        this(runnerProxy, str, ggiVar, v9jVar, false);
    }

    public fgf0(String str, ggi<T> ggiVar, v9j<C22306c<T>> v9jVar) {
        this(new RunnerProxy(), str, ggiVar, v9jVar);
    }
}
