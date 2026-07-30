package p149l;

import android.net.NetworkInfo;
import android.text.TextUtils;
import com.p046p1.mobile.android.app.C4319c;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import p133rx.C22306c;
import p149l.ho2;
import p149l.s7m;

/* JADX INFO: loaded from: classes4.dex */
public abstract class h4t<D extends ho2, V extends s7m> extends wxs<D, V> {

    /* JADX INFO: renamed from: g */
    public HashSet<String> f105872g;

    /* JADX INFO: renamed from: h */
    public final ConcurrentHashMap<Runnable, c4g0> f105873h;

    /* JADX INFO: renamed from: l.h4t$a */
    public static class C17224a<T> {

        /* JADX INFO: renamed from: a */
        public final h4t<?, ?> f105874a;

        /* JADX INFO: renamed from: b */
        public final C22306c<T> f105875b;

        public C17224a(h4t<?, ?> h4tVar, C22306c<T> c22306c) {
            this.f105874a = h4tVar;
            this.f105875b = c22306c;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m129321a(e30 e30Var, Object obj) {
            try {
                e30Var.call(obj);
            } catch (Exception e) {
                CrashHelper.m81296c(new Throwable("live event handle error " + e));
            }
        }

        /* JADX INFO: renamed from: b */
        public void m129322b(final e30<T> e30Var) {
            this.f105874a.duringCreated(this.f105875b).subscribe(ffw.m121197h(new e30() { // from class: l.g4t
                @Override // p149l.e30
                public final void call(Object obj) {
                    h4t.C17224a.m129321a(e30Var, obj);
                }
            }));
        }
    }

    public h4t(bsm<? extends D> bsmVar) {
        super(bsmVar);
        this.f105872g = new HashSet<>();
        this.f105873h = new ConcurrentHashMap<>();
    }

    /* JADX INFO: renamed from: V2 */
    public static /* synthetic */ C22306c m129284V2(v9j v9jVar, Long l2) {
        return (C22306c) v9jVar.call();
    }

    /* JADX INFO: renamed from: W2 */
    public static /* synthetic */ void m129285W2(d30 d30Var, q2f.C19395b c19395b, Object obj) {
        try {
            d30Var.call();
        } catch (Exception unused) {
            CrashHelper.m81296c(new Throwable("live event handle error, event is " + c19395b.m172457d()));
        }
    }

    /* JADX INFO: renamed from: X2 */
    public static /* synthetic */ C22306c m129286X2(v9j v9jVar, NetworkInfo networkInfo) {
        return (C22306c) v9jVar.call();
    }

    /* JADX INFO: renamed from: a3 */
    public static /* synthetic */ void m129289a3(e30 e30Var, q2f.C19395b c19395b, Object obj) {
        try {
            e30Var.call(obj);
        } catch (Exception unused) {
            CrashHelper.m81296c(new Throwable("live event handle error, event is " + c19395b.m172457d()));
        }
    }

    /* JADX INFO: renamed from: e3 */
    public static C22306c<Long> m129292e3(long j, TimeUnit timeUnit) {
        return C22306c.timer(j, timeUnit).observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: B3 */
    public void m129293B3(long j, TimeUnit timeUnit, final Runnable runnable) {
        if (runnable == null) {
            return;
        }
        this.f105873h.put(runnable, m104250o2(m129292e3(j, timeUnit), false).doOnUnsubscribe(new d30() { // from class: l.a4t
            @Override // p149l.d30
            public final void call() {
                this.f67556a.m129311q3(runnable);
            }
        }).doOnTerminate(new d30() { // from class: l.b4t
            @Override // p149l.d30
            public final void call() {
                this.f73403a.m129312r3(runnable);
            }
        }).subscribe(ffw.m121193d(new e30() { // from class: l.c4t
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f79293a.m129313s3(runnable, (Long) obj);
            }
        })));
    }

    /* JADX INFO: renamed from: C3 */
    public <T> void m129294C3(final v9j<C22306c<T>> v9jVar, e30<T> e30Var) {
        duringCreated(ConnectivityReceiver.m81290m()).skip(1).distinctUntilChanged().filter(new w9j() { // from class: l.x3t
            @Override // p149l.w9j
            public final Object call(Object obj) {
                NetworkInfo networkInfo = (NetworkInfo) obj;
                return Boolean.valueOf(NullChecker.m81303a(networkInfo) && networkInfo.isConnected());
            }
        }).flatMap(new w9j() { // from class: l.y3t
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return h4t.m129286X2(v9jVar, (NetworkInfo) obj);
            }
        }).observeOn(jo0.m142408a()).subscribe(ffw.m121197h(e30Var));
    }

    /* JADX INFO: renamed from: D3 */
    public <T> void m129295D3(int i, final v9j<C22306c<T>> v9jVar, e30<T> e30Var) {
        duringCreated(m206027E2().m132135h2(i, TimeUnit.SECONDS)).onBackpressureLatest().flatMap(new w9j() { // from class: l.f4t
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return h4t.m129284V2(v9jVar, (Long) obj);
            }
        }).observeOn(jo0.m142408a()).subscribe(ffw.m121197h(e30Var));
    }

    /* JADX INFO: renamed from: E3 */
    public void m129296E3(Runnable runnable) {
        if (runnable != null && this.f105873h.containsKey(runnable)) {
            this.f105873h.remove(runnable).unsubscribe();
        }
    }

    /* JADX INFO: renamed from: F3 */
    public <T> T m129297F3(zj2<T> zj2Var) {
        m206033M2().m211234k(zj2Var);
        return zj2Var.m219082b();
    }

    /* JADX INFO: renamed from: G3 */
    public void m129298G3(xj2 xj2Var) {
        m206033M2().m211235l(xj2Var);
    }

    /* JADX INFO: renamed from: H3 */
    public <T> C22306c<T> m129299H3(C22306c<T> c22306c) {
        return m129300I3(c22306c, false);
    }

    /* JADX INFO: renamed from: I3 */
    public <T> C22306c<T> m129300I3(C22306c<T> c22306c, final boolean z) {
        int iM144511y2 = m144511y2();
        return (iM144511y2 == 0 || iM144511y2 == -1) ? C22306c.empty() : duringCreated(c22306c).onBackpressureLatest().observeOn(jo0.m142408a()).filter(new w9j() { // from class: l.v3t
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f179845a.m129314t3(z, obj);
            }
        });
    }

    /* JADX INFO: renamed from: d3 */
    public <T extends zj2<R>, R> void m129301d3(Class<T> cls, final w9j<T, R> w9jVar) {
        m104250o2(m206033M2().m211228e(cls), false).subscribe(ffw.m121193d(new e30() { // from class: l.e4t
            @Override // p149l.e30
            public final void call(Object obj) {
                zj2 zj2Var = (zj2) obj;
                zj2Var.m219083c(w9jVar.call(zj2Var));
            }
        }));
    }

    /* JADX INFO: renamed from: f3 */
    public <T> C17224a<T> m129302f3(q2f.C19395b<T, C22306c<T>> c19395b) {
        return new C17224a<>(this, c19395b.m172460g());
    }

    /* JADX INFO: renamed from: g3 */
    public <T> void m129303g3(final q2f.C19395b<T, C22306c<T>> c19395b, final d30 d30Var) {
        duringCreated(c19395b.m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.d4t
            @Override // p149l.e30
            public final void call(Object obj) {
                h4t.m129285W2(d30Var, c19395b, obj);
            }
        }));
    }

    /* JADX INFO: renamed from: h3 */
    public <T> void m129304h3(final q2f.C19395b<T, C22306c<T>> c19395b, final e30<T> e30Var) {
        duringCreated(c19395b.m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.z3t
            @Override // p149l.e30
            public final void call(Object obj) {
                h4t.m129289a3(e30Var, c19395b, obj);
            }
        }));
    }

    /* JADX INFO: renamed from: i3 */
    public <T extends xj2> C22306c<T> m129305i3(Class<T> cls, int... iArr) {
        return duringCreated(m206033M2().m211231h(cls, iArr)).observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: j3 */
    public String mo96662j3() {
        return (m206027E2() == null || m206027E2().m132146l0() == null) ? "" : m206027E2().m132146l0().f56011id;
    }

    /* JADX INFO: renamed from: k3 */
    public C22306c<NetworkInfo> m129306k3() {
        return ConnectivityReceiver.m81290m().skip(1).filter(new w9j() { // from class: l.w3t
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(ConnectivityReceiver.m81284g());
            }
        });
    }

    @Override // p149l.bwr, p149l.mcr, p149l.d0e
    public C22306c<C4319c> lifecycle() {
        return m104250o2(super.lifecycle(), false);
    }

    /* JADX INFO: renamed from: m3 */
    public final String m129307m3() {
        return m129309o3().m218714a();
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        super.mo69117n();
        this.f105873h.clear();
        this.f105872g.clear();
    }

    /* JADX INFO: renamed from: n3 */
    public final String m129308n3() {
        return m129309o3().m218717d();
    }

    /* JADX INFO: renamed from: o3 */
    public final zgt.C21695a m129309o3() {
        return m206027E2().m132069I0();
    }

    /* JADX INFO: renamed from: p3 */
    public void mo129310p3(int i, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        m206028F2().SchemeHandleEvent.handleScheme().mo172463j(new x1e0.C21018a(i).m206701e(str).m206699c());
    }

    /* JADX INFO: renamed from: q3 */
    public final /* synthetic */ void m129311q3(Runnable runnable) {
        this.f105873h.remove(runnable);
    }

    /* JADX INFO: renamed from: r3 */
    public final /* synthetic */ void m129312r3(Runnable runnable) {
        this.f105873h.remove(runnable);
    }

    /* JADX INFO: renamed from: s3 */
    public final /* synthetic */ void m129313s3(Runnable runnable, Long l2) {
        m129296E3(runnable);
        runnable.run();
    }

    /* JADX INFO: renamed from: t3 */
    public final /* synthetic */ Boolean m129314t3(boolean z, Object obj) {
        return z ? Boolean.valueOf(!m206030I2().m137801h()) : Boolean.TRUE;
    }

    /* JADX INFO: renamed from: u3 */
    public <T> C17224a<T> m129315u3(w9j<ti1, C22306c<T>> w9jVar) {
        return new C17224a<>(this, w9jVar.call(m206027E2().m132160q1()));
    }

    /* JADX INFO: renamed from: v3 */
    public void m129316v3(String str, int i, int i2) {
        m129318x3(str, i, i2, 80);
    }

    /* JADX INFO: renamed from: w3 */
    public void m129317w3(String str, int i, int i2, int i3) {
        m129319y3(str, i, i2, 80, i3);
    }

    /* JADX INFO: renamed from: x3 */
    public void m129318x3(String str, int i, int i2, int i3) {
        m129319y3(str, i, i2, i3, t100.m186890d(10.0f));
    }

    /* JADX INFO: renamed from: y3 */
    public void m129319y3(String str, int i, int i2, int i3, int i4) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        m206028F2().OpenH5Event.open().mo172463j(jp50.m142568c(i2).m142598B(str).m142603t(i3).m142597A(uep0.m193329p(), i).m142602s(i4).m142600q());
    }

    /* JADX INFO: renamed from: z3 */
    public void m129320z3(long j, Runnable runnable) {
        m129293B3(j, TimeUnit.MILLISECONDS, runnable);
    }
}
