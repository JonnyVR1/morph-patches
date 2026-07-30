package p153l;

import android.annotation.SuppressLint;
import com.p051p1.mobile.android.p052rx.rxthread.FastIoScheduler;
import com.tantanapp.common.network.RunnerProxy;
import com.tantanapp.common.utils.NullChecker;
import java.util.concurrent.atomic.AtomicBoolean;
import p137rx.C22421c;
import p137rx.subjects.C22507a;

/* JADX INFO: loaded from: classes8.dex */
public class mof0<T> {

    /* JADX INFO: renamed from: a */
    public final String f137818a;

    /* JADX INFO: renamed from: b */
    public final RunnerProxy f137819b;

    /* JADX INFO: renamed from: c */
    public C22507a<T> f137820c;

    /* JADX INFO: renamed from: d */
    public final dji<T> f137821d;

    /* JADX INFO: renamed from: e */
    public final pcj<C22421c<T>> f137822e;

    /* JADX INFO: renamed from: f */
    public AtomicBoolean f137823f;

    /* JADX INFO: renamed from: g */
    public final boolean f137824g;

    public mof0(RunnerProxy runnerProxy, String str, dji<T> djiVar, pcj<C22421c<T>> pcjVar, boolean z) {
        this.f137820c = C22507a.m222758b();
        this.f137823f = new AtomicBoolean(false);
        this.f137819b = runnerProxy;
        this.f137818a = str;
        this.f137821d = djiVar;
        this.f137822e = pcjVar;
        this.f137824g = z;
    }

    /* JADX INFO: renamed from: A */
    public void m159273A(T t) {
        this.f137821d.m116110p(t);
        this.f137820c.onNext(t);
    }

    /* JADX INFO: renamed from: k */
    public C22421c<T> m159274k() {
        return m159275l(true);
    }

    @SuppressLint({"SubscribeOnError"})
    /* JADX INFO: renamed from: l */
    public C22421c<T> m159275l(final boolean z) {
        return this.f137820c.doOnSubscribe(new x20() { // from class: l.cof0
            @Override // p153l.x20
            public final void call() {
                this.f82868a.m159286w(z);
            }
        }).observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: m */
    public T m159276m() {
        return NullChecker.m82486a(this.f137820c.m222761e()) ? this.f137820c.m222761e() : this.f137821d.m116098b();
    }

    /* JADX INFO: renamed from: n */
    public T m159277n() {
        return this.f137820c.m222761e();
    }

    /* JADX INFO: renamed from: o */
    public void m159278o() {
        this.f137821d.m116099c();
        this.f137820c.onNext(null);
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m159279p(Object obj) {
        this.f137821d.m116110p(obj);
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ C22421c m159281r(dji.C16549a c16549a) {
        if (c16549a == null && this.f137823f.compareAndSet(false, true)) {
            return this.f137822e.call().doOnNext(new y20() { // from class: l.kof0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f127726a.m159279p(obj);
                }
            });
        }
        if (!c16549a.f88862b) {
            l51.m152887G(new Runnable() { // from class: l.lof0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f132896a.m159280q();
                }
            });
        }
        return C22421c.just(c16549a.f88861a);
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ uxj0 m159282s(Object obj) {
        this.f137823f.compareAndSet(true, false);
        if (this.f137820c.m222761e() == null) {
            this.f137820c.onNext(obj);
        }
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m159283t(Throwable th) {
        this.f137823f.compareAndSet(true, false);
        if (this.f137824g) {
            this.f137820c.onNext(null);
        }
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ uxj0 m159284u(dji.C16549a c16549a) {
        if (c16549a != null && this.f137820c.m222761e() == null) {
            this.f137820c.onNext(c16549a.f88861a);
        }
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m159285v(Throwable th) {
        if (this.f137824g) {
            this.f137820c.onNext(null);
        }
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m159286w(boolean z) {
        synchronized (this) {
            try {
                if (this.f137820c.m222761e() == null) {
                    RunnerProxy runnerProxy = this.f137819b;
                    String str = this.f137818a;
                    dji<T> djiVar = this.f137821d;
                    runnerProxy.now(str, z ? djiVar.m116105k().flatMap(new qcj() { // from class: l.fof0
                        @Override // p153l.qcj
                        public final Object call(Object obj) {
                            return this.f100055a.m159281r((dji.C16549a) obj);
                        }
                    }).subscribeOn(FastIoScheduler.f16349b).observeOn(fo0.m126432a()).map(new qcj() { // from class: l.gof0
                        @Override // p153l.qcj
                        public final Object call(Object obj) {
                            return this.f105288a.m159282s(obj);
                        }
                    }).doOnError(new y20() { // from class: l.hof0
                        @Override // p153l.y20
                        public final void call(Object obj) {
                            this.f110904a.m159283t((Throwable) obj);
                        }
                    }) : djiVar.m116105k().subscribeOn(FastIoScheduler.f16349b).observeOn(fo0.m126432a()).map(new qcj() { // from class: l.iof0
                        @Override // p153l.qcj
                        public final Object call(Object obj) {
                            return this.f116146a.m159284u((dji.C16549a) obj);
                        }
                    }).doOnError(new y20() { // from class: l.jof0
                        @Override // p153l.y20
                        public final void call(Object obj) {
                            this.f121998a.m159285v((Throwable) obj);
                        }
                    }), true);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m159287x(Object obj) {
        this.f137821d.m116110p(obj);
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ uxj0 m159288y(Object obj) {
        this.f137820c.onNext(obj);
        return uxj0.f181467a;
    }

    @SuppressLint({"SubscribeOnError"})
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public C22421c<uxj0> m159280q() {
        if (this.f137823f.get()) {
            C22421c.just(uxj0.f181467a).observeOn(FastIoScheduler.f16349b);
        }
        RunnerProxy runnerProxy = this.f137819b;
        String str = this.f137818a + "_refresh";
        C22421c<T> c22421cCall = this.f137822e.call();
        f2e0 f2e0Var = FastIoScheduler.f16349b;
        return runnerProxy.now(str, c22421cCall.subscribeOn(f2e0Var).observeOn(f2e0Var).doOnNext(new y20() { // from class: l.dof0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f89922a.m159287x(obj);
            }
        }).observeOn(fo0.m126432a()).map(new qcj() { // from class: l.eof0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f94927a.m159288y(obj);
            }
        }), false);
    }

    public mof0(RunnerProxy runnerProxy, String str, dji<T> djiVar, pcj<C22421c<T>> pcjVar) {
        this(runnerProxy, str, djiVar, pcjVar, false);
    }

    public mof0(String str, dji<T> djiVar, pcj<C22421c<T>> pcjVar) {
        this(new RunnerProxy(), str, djiVar, pcjVar);
    }
}
