package p149l;

import android.os.Bundle;
import android.util.Pair;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.RunnableC4733c0;
import com.p046p1.mobile.putong.core.data.HideAndSeekInfoEnv;
import com.p046p1.mobile.putong.core.data.HideAndSeekPushEnv;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.location.Location;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class snn extends jq2<gon> implements RunnableC4733c0.c {

    /* JADX INFO: renamed from: a */
    public boolean f165475a;

    /* JADX INFO: renamed from: b */
    public u9o f165476b;

    /* JADX INFO: renamed from: c */
    public final String f165477c;

    /* JADX INFO: renamed from: d */
    public Location f165478d;

    /* JADX INFO: renamed from: e */
    public boolean f165479e;

    /* JADX INFO: renamed from: f */
    public boolean f165480f;

    /* JADX INFO: renamed from: g */
    public long f165481g;

    /* JADX INFO: renamed from: h */
    public long f165482h;

    /* JADX INFO: renamed from: i */
    public int f165483i;

    public snn(mcr mcrVar, Act act) {
        super(mcrVar);
        this.f165477c = "hide_and_seek_timer";
        this.f165481g = 1L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I0 */
    public /* synthetic */ void m185132I0(Bundle bundle) {
        act().setConvertActivityFromTranslucentEnable(false);
        ((gon) this.viewModel).m127270r();
        ((gon) this.viewModel).m127263i(new C19997a());
        m185161x0();
    }

    /* JADX INFO: renamed from: h0 */
    public static /* synthetic */ Boolean m185136h0(Pair pair) {
        return (Boolean) pair.first;
    }

    /* JADX INFO: renamed from: C0 */
    public final /* synthetic */ void m185150C0(HideAndSeekPushEnv hideAndSeekPushEnv) {
        if (NullChecker.m81303a(hideAndSeekPushEnv.data) && TEnum.equals(hideAndSeekPushEnv.data.gameStage, "end")) {
            m185163z0();
        } else {
            ((gon) this.viewModel).m127264j(hideAndSeekPushEnv.data);
        }
    }

    /* JADX INFO: renamed from: D0 */
    public final /* synthetic */ void m185151D0() {
        this.f165479e = true;
    }

    /* JADX INFO: renamed from: E0 */
    public final /* synthetic */ void m185152E0() {
        this.f165480f = true;
    }

    /* JADX INFO: renamed from: F0 */
    public final /* synthetic */ void m185153F0() {
        this.f165481g = 2L;
        m185159O0(Long.valueOf(this.f165482h));
    }

    /* JADX INFO: renamed from: G0 */
    public final /* synthetic */ void m185154G0() {
        this.f165481g = 3L;
        m185159O0(Long.valueOf(this.f165482h));
    }

    /* JADX INFO: renamed from: H0 */
    public final /* synthetic */ void m185155H0(HideAndSeekInfoEnv hideAndSeekInfoEnv) {
        ((gon) this.viewModel).m127276z(hideAndSeekInfoEnv.data);
    }

    /* JADX INFO: renamed from: J0 */
    public final /* synthetic */ void m185156J0() {
        ((gon) this.viewModel).m127274x();
    }

    /* JADX INFO: renamed from: L0 */
    public final /* synthetic */ void m185157L0(Pair pair) {
        Location location = (Location) pair.second;
        this.f165478d = location;
        ((gon) this.viewModel).m127265k(location);
    }

    /* JADX INFO: renamed from: N0 */
    public void m185158N0() {
        if (this.f165476b != null) {
            return;
        }
        this.f165476b = new u9o();
        duringCreated(mkd0.m154984r(((gon) this.viewModel).m127269p().mo35926E3().map(new w9j() { // from class: l.enn
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.TRUE;
            }
        }), this.f165476b.m192585i(), new x9j() { // from class: l.fnn
            @Override // p149l.x9j
            public final Object call(Object obj, Object obj2) {
                return new Pair((Boolean) obj, (Location) obj2);
            }
        })).filter(new w9j() { // from class: l.gnn
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return snn.m185136h0((Pair) obj);
            }
        }).subscribe(mkd0.m154956H(new e30() { // from class: l.hnn
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f108642a.m185157L0((Pair) obj);
            }
        }, new e30() { // from class: l.inn
            @Override // p149l.e30
            public final void call(Object obj) {
                ((Throwable) obj).getMessage();
            }
        }));
        this.f165476b.m192587k();
    }

    /* JADX INFO: renamed from: O0 */
    public void m185159O0(Long l2) {
        if (l2.longValue() < mqi0.m155944o()) {
            return;
        }
        this.f165482h = l2.longValue();
        m185158N0();
        CoreModule.f17545c.f19685t1.m31516u("hide_and_seek_timer");
        RunnableC4733c0.a aVar = new RunnableC4733c0.a();
        aVar.m31523g("hide_and_seek_timer").m31517a(true).m31524h(1L).m31522f(l2.longValue()).m31520d(this);
        CoreModule.f17545c.f19685t1.m31513r(aVar);
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        creates(new e30() { // from class: l.dnn
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f87085a.m185132I0((Bundle) obj);
            }
        }, new d30() { // from class: l.jnn
            @Override // p149l.d30
            public final void call() {
                this.f118872a.m185156J0();
            }
        });
    }

    @Override // p149l.q0m
    public void destroy() {
        u9o u9oVar = this.f165476b;
        if (u9oVar != null) {
            u9oVar.m192590n();
        }
        CoreModule.f17545c.f19685t1.m31516u("hide_and_seek_timer");
    }

    @Override // com.p046p1.mobile.putong.core.api.RunnableC4733c0.c
    /* JADX INFO: renamed from: u */
    public void mo31527u(String str, long j, long j2, long j3, long j4) {
        u9o u9oVar;
        if (j3 - mqi0.m155944o() <= 500) {
            m185163z0();
            return;
        }
        Location location = this.f165478d;
        if (location != null) {
            this.f165483i = 0;
            duringCreated(CoreModule.f17545c.f19638d2.m181933n3(Double.toString(location.m78833x()), Double.toString(this.f165478d.m78831u()))).subscribe(mkd0.m154956H(new e30() { // from class: l.knn
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f123898a.m185150C0((HideAndSeekPushEnv) obj);
                }
            }, new e30() { // from class: l.lnn
                @Override // p149l.e30
                public final void call(Object obj) {
                    ((Throwable) obj).getMessage();
                }
            }));
            return;
        }
        int i = this.f165483i + 1;
        this.f165483i = i;
        if (i <= 5 || (u9oVar = this.f165476b) == null) {
            return;
        }
        u9oVar.m192589m();
    }

    /* JADX INFO: renamed from: u0 */
    public List<j760<String, d30>> m185160u0() {
        return vwb.m200324f0(vwb.m200311Y("玩家随机移动", new d30() { // from class: l.mnn
            @Override // p149l.d30
            public final void call() {
                this.f134768a.m185151D0();
            }
        }), vwb.m200311Y("地理偏移修正", new d30() { // from class: l.nnn
            @Override // p149l.d30
            public final void call() {
                this.f139737a.m185152E0();
            }
        }), vwb.m200311Y("刷新时间2s", new d30() { // from class: l.onn
            @Override // p149l.d30
            public final void call() {
                this.f144806a.m185153F0();
            }
        }), vwb.m200311Y("刷新时间3s", new d30() { // from class: l.pnn
            @Override // p149l.d30
            public final void call() {
                this.f150406a.m185154G0();
            }
        }));
    }

    /* JADX INFO: renamed from: x0 */
    public final void m185161x0() {
        duringCreated(CoreModule.f17545c.f19638d2.m181932m3()).subscribe(mkd0.m154956H(new e30() { // from class: l.qnn
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f155484a.m185155H0((HideAndSeekInfoEnv) obj);
            }
        }, new e30() { // from class: l.rnn
            @Override // p149l.e30
            public final void call(Object obj) {
                ((Throwable) obj).getMessage();
            }
        }));
    }

    /* JADX INFO: renamed from: y0 */
    public Location m185162y0() {
        return this.f165478d;
    }

    /* JADX INFO: renamed from: z0 */
    public void m185163z0() {
        m185161x0();
        CoreModule.f17545c.f19685t1.m31516u("hide_and_seek_timer");
        u9o u9oVar = this.f165476b;
        if (u9oVar != null) {
            u9oVar.m192590n();
        }
    }

    /* JADX INFO: renamed from: A0 */
    public void m185149A0() {
    }

    /* JADX INFO: renamed from: l.snn$a */
    public class C19997a implements pvl.InterfaceC19345a {
        public C19997a() {
        }

        @Override // p149l.pvl.InterfaceC19345a
        /* JADX INFO: renamed from: a */
        public void mo171677a() {
            ((gon) snn.this.viewModel).m127260A();
        }

        @Override // p149l.pvl.InterfaceC19345a
        /* JADX INFO: renamed from: b */
        public void mo171678b(boolean z) {
            snn snnVar = snn.this;
            snnVar.f165475a = true;
            ((gon) snnVar.viewModel).m127260A();
        }

        @Override // p149l.pvl.InterfaceC19345a
        /* JADX INFO: renamed from: d */
        public void mo171680d(double d, double d2, float f, boolean z) {
            snn.this.f165475a = false;
        }

        @Override // p149l.pvl.InterfaceC19345a
        /* JADX INFO: renamed from: c */
        public void mo171679c(pvl.InterfaceC19346b interfaceC19346b) {
        }
    }
}
