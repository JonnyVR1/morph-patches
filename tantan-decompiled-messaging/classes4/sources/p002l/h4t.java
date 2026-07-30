package p002l;

import android.net.NetworkInfo;
import android.text.TextUtils;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import l.c4g0;
import l.d30;
import l.e30;
import l.ffw;
import l.jo0;
import l.q2f;
import l.s7m;
import l.t100;
import l.ti1;
import l.uep0;
import l.v9j;
import l.w9j;
import l.zj2;
import p002l.ho2;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public abstract class h4t<D extends ho2, V extends s7m> extends wxs<D, V> {

    /* JADX INFO: renamed from: g */
    public HashSet<String> f11874g;

    /* JADX INFO: renamed from: h */
    public final ConcurrentHashMap<Runnable, c4g0> f11875h;

    /* JADX INFO: renamed from: l.h4t$a */
    public static class C0601a<T> {

        /* JADX INFO: renamed from: a */
        public final h4t<?, ?> f11876a;

        /* JADX INFO: renamed from: b */
        public final c<T> f11877b;

        public C0601a(h4t<?, ?> h4tVar, c<T> cVar) {
            this.f11876a = h4tVar;
            this.f11877b = cVar;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m14208a(e30 e30Var, Object obj) {
            try {
                e30Var.call(obj);
            } catch (Exception e) {
                CrashHelper.c(new Throwable("live event handle error " + e));
            }
        }

        /* JADX INFO: renamed from: b */
        public void m14209b(final e30<T> e30Var) {
            this.f11876a.duringCreated(this.f11877b).subscribe(ffw.h(new e30() { // from class: l.g4t
                public final void call(Object obj) {
                    h4t.C0601a.m14208a(e30Var, obj);
                }
            }));
        }
    }

    public h4t(bsm<? extends D> bsmVar) {
        super(bsmVar);
        this.f11874g = new HashSet<>();
        this.f11875h = new ConcurrentHashMap<>();
    }

    /* JADX INFO: renamed from: V2 */
    public static /* synthetic */ c m14171V2(v9j v9jVar, Long l2) {
        return (c) v9jVar.call();
    }

    /* JADX INFO: renamed from: W2 */
    public static /* synthetic */ void m14172W2(d30 d30Var, q2f.b bVar, Object obj) {
        try {
            d30Var.call();
        } catch (Exception unused) {
            CrashHelper.c(new Throwable("live event handle error, event is " + bVar.d()));
        }
    }

    /* JADX INFO: renamed from: X2 */
    public static /* synthetic */ c m14173X2(v9j v9jVar, NetworkInfo networkInfo) {
        return (c) v9jVar.call();
    }

    /* JADX INFO: renamed from: a3 */
    public static /* synthetic */ void m14176a3(e30 e30Var, q2f.b bVar, Object obj) {
        try {
            e30Var.call(obj);
        } catch (Exception unused) {
            CrashHelper.c(new Throwable("live event handle error, event is " + bVar.d()));
        }
    }

    /* JADX INFO: renamed from: e3 */
    public static c<Long> m14179e3(long j, TimeUnit timeUnit) {
        return c.timer(j, timeUnit).observeOn(jo0.a());
    }

    /* JADX INFO: renamed from: B3 */
    public void m14180B3(long j, TimeUnit timeUnit, final Runnable runnable) {
        if (runnable == null) {
            return;
        }
        this.f11875h.put(runnable, o2(m14179e3(j, timeUnit), false).doOnUnsubscribe(new d30() { // from class: l.a4t
            public final void call() {
                this.f7399a.m14198q3(runnable);
            }
        }).doOnTerminate(new d30() { // from class: l.b4t
            public final void call() {
                this.f7984a.m14199r3(runnable);
            }
        }).subscribe(ffw.d(new e30() { // from class: l.c4t
            public final void call(Object obj) {
                this.f8484a.m14200s3(runnable, (Long) obj);
            }
        })));
    }

    /* JADX INFO: renamed from: C3 */
    public <T> void m14181C3(final v9j<c<T>> v9jVar, e30<T> e30Var) {
        duringCreated(ConnectivityReceiver.m()).skip(1).distinctUntilChanged().filter(new w9j() { // from class: l.x3t
            public final Object call(Object obj) {
                NetworkInfo networkInfo = (NetworkInfo) obj;
                return Boolean.valueOf(NullChecker.a(networkInfo) && networkInfo.isConnected());
            }
        }).flatMap(new w9j() { // from class: l.y3t
            public final Object call(Object obj) {
                return h4t.m14173X2(v9jVar, (NetworkInfo) obj);
            }
        }).observeOn(jo0.a()).subscribe(ffw.h(e30Var));
    }

    /* JADX INFO: renamed from: D3 */
    public <T> void m14182D3(int i, final v9j<c<T>> v9jVar, e30<T> e30Var) {
        duringCreated(m25547E2().m14571h2(i, TimeUnit.SECONDS)).onBackpressureLatest().flatMap(new w9j() { // from class: l.f4t
            public final Object call(Object obj) {
                return h4t.m14171V2(v9jVar, (Long) obj);
            }
        }).observeOn(jo0.a()).subscribe(ffw.h(e30Var));
    }

    /* JADX INFO: renamed from: E3 */
    public void m14183E3(Runnable runnable) {
        if (runnable != null && this.f11875h.containsKey(runnable)) {
            this.f11875h.remove(runnable).unsubscribe();
        }
    }

    /* JADX INFO: renamed from: F3 */
    public <T> T m14184F3(zj2<T> zj2Var) {
        m25553M2().k(zj2Var);
        return (T) zj2Var.b();
    }

    /* JADX INFO: renamed from: G3 */
    public void m14185G3(xj2 xj2Var) {
        m25553M2().l(xj2Var);
    }

    /* JADX INFO: renamed from: H3 */
    public <T> c<T> m14186H3(c<T> cVar) {
        return m14187I3(cVar, false);
    }

    /* JADX INFO: renamed from: I3 */
    public <T> c<T> m14187I3(c<T> cVar, final boolean z) {
        int iY2 = y2();
        return (iY2 == 0 || iY2 == -1) ? c.empty() : duringCreated(cVar).onBackpressureLatest().observeOn(jo0.a()).filter(new w9j() { // from class: l.v3t
            public final Object call(Object obj) {
                return this.f20941a.m14201t3(z, obj);
            }
        });
    }

    /* JADX INFO: renamed from: d3 */
    public <T extends zj2<R>, R> void m14188d3(Class<T> cls, final w9j<T, R> w9jVar) {
        o2(m25553M2().e(cls), false).subscribe(ffw.d(new e30() { // from class: l.e4t
            public final void call(Object obj) {
                zj2 zj2Var = (zj2) obj;
                zj2Var.c(w9jVar.call(zj2Var));
            }
        }));
    }

    /* JADX INFO: renamed from: f3 */
    public <T> C0601a<T> m14189f3(q2f.b<T, c<T>> bVar) {
        return new C0601a<>(this, (c) bVar.g());
    }

    /* JADX INFO: renamed from: g3 */
    public <T> void m14190g3(final q2f.b<T, c<T>> bVar, final d30 d30Var) {
        duringCreated((c) bVar.g()).subscribe(ffw.d(new e30() { // from class: l.d4t
            public final void call(Object obj) {
                h4t.m14172W2(d30Var, bVar, obj);
            }
        }));
    }

    /* JADX INFO: renamed from: h3 */
    public <T> void m14191h3(final q2f.b<T, c<T>> bVar, final e30<T> e30Var) {
        duringCreated((c) bVar.g()).subscribe(ffw.d(new e30() { // from class: l.z3t
            public final void call(Object obj) {
                h4t.m14176a3(e30Var, bVar, obj);
            }
        }));
    }

    /* JADX INFO: renamed from: i3 */
    public <T extends xj2> c<T> m14192i3(Class<T> cls, int... iArr) {
        return duringCreated(m25553M2().h(cls, iArr)).observeOn(jo0.a());
    }

    /* JADX INFO: renamed from: j3 */
    public String mo9759j3() {
        return (m25547E2() == null || m25547E2().m14582l0() == null) ? "" : ((DbObject) m25547E2().m14582l0()).id;
    }

    /* JADX INFO: renamed from: k3 */
    public c<NetworkInfo> m14193k3() {
        return ConnectivityReceiver.m().skip(1).filter(new w9j() { // from class: l.w3t
            public final Object call(Object obj) {
                return Boolean.valueOf(ConnectivityReceiver.g());
            }
        });
    }

    public c<com.p1.mobile.android.app.c> lifecycle() {
        return o2(super/*l.bwr*/.lifecycle(), false);
    }

    /* JADX INFO: renamed from: m3 */
    public final String m14194m3() {
        return m14196o3().m27365a();
    }

    /* JADX INFO: renamed from: n */
    public void mo5949n() {
        super.n();
        this.f11875h.clear();
        this.f11874g.clear();
    }

    /* JADX INFO: renamed from: n3 */
    public final String m14195n3() {
        return m14196o3().m27368d();
    }

    /* JADX INFO: renamed from: o3 */
    public final zgt.C0943a m14196o3() {
        return m25547E2().m14505I0();
    }

    /* JADX INFO: renamed from: p3 */
    public void mo14197p3(int i, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        m25548F2().SchemeHandleEvent.handleScheme().j(new x1e0.C0891a(i).m25610e(str).m25608c());
    }

    /* JADX INFO: renamed from: q3 */
    public final /* synthetic */ void m14198q3(Runnable runnable) {
        this.f11875h.remove(runnable);
    }

    /* JADX INFO: renamed from: r3 */
    public final /* synthetic */ void m14199r3(Runnable runnable) {
        this.f11875h.remove(runnable);
    }

    /* JADX INFO: renamed from: s3 */
    public final /* synthetic */ void m14200s3(Runnable runnable, Long l2) {
        m14183E3(runnable);
        runnable.run();
    }

    /* JADX INFO: renamed from: t3 */
    public final /* synthetic */ Boolean m14201t3(boolean z, Object obj) {
        return z ? Boolean.valueOf(!m25550I2().m15305h()) : Boolean.TRUE;
    }

    /* JADX INFO: renamed from: u3 */
    public <T> C0601a<T> m14202u3(w9j<ti1, c<T>> w9jVar) {
        return new C0601a<>(this, (c) w9jVar.call(m25547E2().m14596q1()));
    }

    /* JADX INFO: renamed from: v3 */
    public void m14203v3(String str, int i, int i2) {
        m14205x3(str, i, i2, 80);
    }

    /* JADX INFO: renamed from: w3 */
    public void m14204w3(String str, int i, int i2, int i3) {
        m14206y3(str, i, i2, 80, i3);
    }

    /* JADX INFO: renamed from: x3 */
    public void m14205x3(String str, int i, int i2, int i3) {
        m14206y3(str, i, i2, i3, t100.d(10.0f));
    }

    /* JADX INFO: renamed from: y3 */
    public void m14206y3(String str, int i, int i2, int i3, int i4) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        m25548F2().OpenH5Event.open().j(jp50.m16064c(i2).m16094B(str).m16099t(i3).m16093A(uep0.p(), i).m16098s(i4).m16096q());
    }

    /* JADX INFO: renamed from: z3 */
    public void m14207z3(long j, Runnable runnable) {
        m14180B3(j, TimeUnit.MILLISECONDS, runnable);
    }
}
