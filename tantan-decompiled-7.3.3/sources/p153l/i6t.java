package p153l;

import android.net.NetworkInfo;
import android.text.TextUtils;
import com.p051p1.mobile.android.app.C4470c;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import p137rx.C22421c;
import p153l.iam;
import p153l.oo2;

/* JADX INFO: loaded from: classes4.dex */
public abstract class i6t<D extends oo2, V extends iam> extends xzs<D, V> {

    /* JADX INFO: renamed from: g */
    public HashSet<String> f113183g;

    /* JADX INFO: renamed from: h */
    public final ConcurrentHashMap<Runnable, kcg0> f113184h;

    /* JADX INFO: renamed from: l.i6t$a */
    public static class C17657a<T> {

        /* JADX INFO: renamed from: a */
        public final i6t<?, ?> f113185a;

        /* JADX INFO: renamed from: b */
        public final C22421c<T> f113186b;

        public C17657a(i6t<?, ?> i6tVar, C22421c<T> c22421c) {
            this.f113185a = i6tVar;
            this.f113186b = c22421c;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m138880a(y20 y20Var, Object obj) {
            try {
                y20Var.call(obj);
            } catch (Exception e) {
                CrashHelper.m82479c(new Throwable("live event handle error " + e));
            }
        }

        /* JADX INFO: renamed from: b */
        public void m138881b(final y20<T> y20Var) {
            this.f113185a.duringCreated(this.f113186b).subscribe(dhw.m115829h(new y20() { // from class: l.h6t
                @Override // p153l.y20
                public final void call(Object obj) {
                    i6t.C17657a.m138880a(y20Var, obj);
                }
            }));
        }
    }

    public i6t(dum<? extends D> dumVar) {
        super(dumVar);
        this.f113183g = new HashSet<>();
        this.f113184h = new ConcurrentHashMap<>();
    }

    /* JADX INFO: renamed from: V2 */
    public static /* synthetic */ C22421c m138843V2(pcj pcjVar, Long l2) {
        return (C22421c) pcjVar.call();
    }

    /* JADX INFO: renamed from: W2 */
    public static /* synthetic */ void m138844W2(x20 x20Var, v3f.C20734b c20734b, Object obj) {
        try {
            x20Var.call();
        } catch (Exception unused) {
            CrashHelper.m82479c(new Throwable("live event handle error, event is " + c20734b.m199267d()));
        }
    }

    /* JADX INFO: renamed from: X2 */
    public static /* synthetic */ C22421c m138845X2(pcj pcjVar, NetworkInfo networkInfo) {
        return (C22421c) pcjVar.call();
    }

    /* JADX INFO: renamed from: a3 */
    public static /* synthetic */ void m138848a3(y20 y20Var, v3f.C20734b c20734b, Object obj) {
        try {
            y20Var.call(obj);
        } catch (Exception unused) {
            CrashHelper.m82479c(new Throwable("live event handle error, event is " + c20734b.m199267d()));
        }
    }

    /* JADX INFO: renamed from: e3 */
    public static C22421c<Long> m138851e3(long j, TimeUnit timeUnit) {
        return C22421c.timer(j, timeUnit).observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: B3 */
    public void m138852B3(long j, TimeUnit timeUnit, final Runnable runnable) {
        if (runnable == null) {
            return;
        }
        this.f113184h.put(runnable, m113231o2(m138851e3(j, timeUnit), false).doOnUnsubscribe(new x20() { // from class: l.b6t
            @Override // p153l.x20
            public final void call() {
                this.f75205a.m138870q3(runnable);
            }
        }).doOnTerminate(new x20() { // from class: l.c6t
            @Override // p153l.x20
            public final void call() {
                this.f79992a.m138871r3(runnable);
            }
        }).subscribe(dhw.m115825d(new y20() { // from class: l.d6t
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f85406a.m138872s3(runnable, (Long) obj);
            }
        })));
    }

    /* JADX INFO: renamed from: C3 */
    public <T> void m138853C3(final pcj<C22421c<T>> pcjVar, y20<T> y20Var) {
        duringCreated(ConnectivityReceiver.m82473m()).skip(1).distinctUntilChanged().filter(new qcj() { // from class: l.y5t
            @Override // p153l.qcj
            public final Object call(Object obj) {
                NetworkInfo networkInfo = (NetworkInfo) obj;
                return Boolean.valueOf(NullChecker.m82486a(networkInfo) && networkInfo.isConnected());
            }
        }).flatMap(new qcj() { // from class: l.z5t
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return i6t.m138845X2(pcjVar, (NetworkInfo) obj);
            }
        }).observeOn(fo0.m126432a()).subscribe(dhw.m115829h(y20Var));
    }

    /* JADX INFO: renamed from: D3 */
    public <T> void m138854D3(int i, final pcj<C22421c<T>> pcjVar, y20<T> y20Var) {
        duringCreated(m213810E2().m168521h2(i, TimeUnit.SECONDS)).onBackpressureLatest().flatMap(new qcj() { // from class: l.g6t
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return i6t.m138843V2(pcjVar, (Long) obj);
            }
        }).observeOn(fo0.m126432a()).subscribe(dhw.m115829h(y20Var));
    }

    /* JADX INFO: renamed from: E3 */
    public void m138855E3(Runnable runnable) {
        if (runnable != null && this.f113184h.containsKey(runnable)) {
            this.f113184h.remove(runnable).unsubscribe();
        }
    }

    /* JADX INFO: renamed from: F3 */
    public <T> T m138856F3(hk2<T> hk2Var) {
        m213816M2().m194450k(hk2Var);
        return hk2Var.m135608b();
    }

    /* JADX INFO: renamed from: G3 */
    public void m138857G3(fk2 fk2Var) {
        m213816M2().m194451l(fk2Var);
    }

    /* JADX INFO: renamed from: H3 */
    public <T> C22421c<T> m138858H3(C22421c<T> c22421c) {
        return m138859I3(c22421c, false);
    }

    /* JADX INFO: renamed from: I3 */
    public <T> C22421c<T> m138859I3(C22421c<T> c22421c, final boolean z) {
        int iM153102y2 = m153102y2();
        return (iM153102y2 == 0 || iM153102y2 == -1) ? C22421c.empty() : duringCreated(c22421c).onBackpressureLatest().observeOn(fo0.m126432a()).filter(new qcj() { // from class: l.w5t
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f187553a.m138873t3(z, obj);
            }
        });
    }

    /* JADX INFO: renamed from: d3 */
    public <T extends hk2<R>, R> void m138860d3(Class<T> cls, final qcj<T, R> qcjVar) {
        m113231o2(m213816M2().m194444e(cls), false).subscribe(dhw.m115825d(new y20() { // from class: l.f6t
            @Override // p153l.y20
            public final void call(Object obj) {
                hk2 hk2Var = (hk2) obj;
                hk2Var.m135609c(qcjVar.call(hk2Var));
            }
        }));
    }

    /* JADX INFO: renamed from: f3 */
    public <T> C17657a<T> m138861f3(v3f.C20734b<T, C22421c<T>> c20734b) {
        return new C17657a<>(this, c20734b.m199270g());
    }

    /* JADX INFO: renamed from: g3 */
    public <T> void m138862g3(final v3f.C20734b<T, C22421c<T>> c20734b, final x20 x20Var) {
        duringCreated(c20734b.m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.e6t
            @Override // p153l.y20
            public final void call(Object obj) {
                i6t.m138844W2(x20Var, c20734b, obj);
            }
        }));
    }

    /* JADX INFO: renamed from: h3 */
    public <T> void m138863h3(final v3f.C20734b<T, C22421c<T>> c20734b, final y20<T> y20Var) {
        duringCreated(c20734b.m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.a6t
            @Override // p153l.y20
            public final void call(Object obj) {
                i6t.m138848a3(y20Var, c20734b, obj);
            }
        }));
    }

    /* JADX INFO: renamed from: i3 */
    public <T extends fk2> C22421c<T> m138864i3(Class<T> cls, int... iArr) {
        return duringCreated(m213816M2().m194447h(cls, iArr)).observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: j3 */
    public String mo104749j3() {
        return (m213810E2() == null || m213810E2().m168532l0() == null) ? "" : m213810E2().m168532l0().f56859id;
    }

    /* JADX INFO: renamed from: k3 */
    public C22421c<NetworkInfo> m138865k3() {
        return ConnectivityReceiver.m82473m().skip(1).filter(new qcj() { // from class: l.x5t
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(ConnectivityReceiver.m82467g());
            }
        });
    }

    @Override // p153l.cyr, p153l.ner, p153l.r1e
    public C22421c<C4470c> lifecycle() {
        return m113231o2(super.lifecycle(), false);
    }

    /* JADX INFO: renamed from: m3 */
    public final String m138866m3() {
        return m138868o3().m98478a();
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: n */
    public void mo70300n() {
        super.mo70300n();
        this.f113184h.clear();
        this.f113183g.clear();
    }

    /* JADX INFO: renamed from: n3 */
    public final String m138867n3() {
        return m138868o3().m98481d();
    }

    /* JADX INFO: renamed from: o3 */
    public final ajt.C15728a m138868o3() {
        return m213810E2().m168458I0();
    }

    /* JADX INFO: renamed from: p3 */
    public void mo138869p3(int i, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        m213811F2().SchemeHandleEvent.handleScheme().mo199273j(new bae0.C15953a(i).m103154e(str).m103152c());
    }

    /* JADX INFO: renamed from: q3 */
    public final /* synthetic */ void m138870q3(Runnable runnable) {
        this.f113184h.remove(runnable);
    }

    /* JADX INFO: renamed from: r3 */
    public final /* synthetic */ void m138871r3(Runnable runnable) {
        this.f113184h.remove(runnable);
    }

    /* JADX INFO: renamed from: s3 */
    public final /* synthetic */ void m138872s3(Runnable runnable, Long l2) {
        m138855E3(runnable);
        runnable.run();
    }

    /* JADX INFO: renamed from: t3 */
    public final /* synthetic */ Boolean m138873t3(boolean z, Object obj) {
        return z ? Boolean.valueOf(!m213813I2().m146882h()) : Boolean.TRUE;
    }

    /* JADX INFO: renamed from: u3 */
    public <T> C17657a<T> m138874u3(qcj<aj1, C22421c<T>> qcjVar) {
        return new C17657a<>(this, qcjVar.call(m213810E2().m168545q1()));
    }

    /* JADX INFO: renamed from: v3 */
    public void m138875v3(String str, int i, int i2) {
        m138877x3(str, i, i2, 80);
    }

    /* JADX INFO: renamed from: w3 */
    public void m138876w3(String str, int i, int i2, int i3) {
        m138878y3(str, i, i2, 80, i3);
    }

    /* JADX INFO: renamed from: x3 */
    public void m138877x3(String str, int i, int i2, int i3) {
        m138878y3(str, i, i2, i3, qa00.m175859d(10.0f));
    }

    /* JADX INFO: renamed from: y3 */
    public void m138878y3(String str, int i, int i2, int i3, int i4) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        m213811F2().OpenH5Event.open().mo199273j(px50.m174112c(i2).m174141B(str).m174146t(i3).m174140A(ynp0.m216939p(), i).m174145s(i4).m174143q());
    }

    /* JADX INFO: renamed from: z3 */
    public void m138879z3(long j, Runnable runnable) {
        m138852B3(j, TimeUnit.MILLISECONDS, runnable);
    }
}
