package p153l;

import android.os.Bundle;
import android.util.Pair;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.RunnableC4884c0;
import com.p051p1.mobile.putong.core.data.HideAndSeekInfoEnv;
import com.p051p1.mobile.putong.core.data.HideAndSeekPushEnv;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.location.Location;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class spn extends ar2<gqn> implements RunnableC4884c0.c {

    /* JADX INFO: renamed from: a */
    public boolean f170062a;

    /* JADX INFO: renamed from: b */
    public ubo f170063b;

    /* JADX INFO: renamed from: c */
    public final String f170064c;

    /* JADX INFO: renamed from: d */
    public Location f170065d;

    /* JADX INFO: renamed from: e */
    public boolean f170066e;

    /* JADX INFO: renamed from: f */
    public boolean f170067f;

    /* JADX INFO: renamed from: g */
    public long f170068g;

    /* JADX INFO: renamed from: h */
    public long f170069h;

    /* JADX INFO: renamed from: i */
    public int f170070i;

    public spn(ner nerVar, Act act) {
        super(nerVar);
        this.f170064c = "hide_and_seek_timer";
        this.f170068g = 1L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I0 */
    public /* synthetic */ void m187401I0(Bundle bundle) {
        act().setConvertActivityFromTranslucentEnable(false);
        ((gqn) this.viewModel).m131394r();
        ((gqn) this.viewModel).m131387i(new C20129a());
        m187430x0();
    }

    /* JADX INFO: renamed from: h0 */
    public static /* synthetic */ Boolean m187405h0(Pair pair) {
        return (Boolean) pair.first;
    }

    /* JADX INFO: renamed from: C0 */
    public final /* synthetic */ void m187419C0(HideAndSeekPushEnv hideAndSeekPushEnv) {
        if (NullChecker.m82486a(hideAndSeekPushEnv.data) && TEnum.equals(hideAndSeekPushEnv.data.gameStage, "end")) {
            m187432z0();
        } else {
            ((gqn) this.viewModel).m131388j(hideAndSeekPushEnv.data);
        }
    }

    /* JADX INFO: renamed from: D0 */
    public final /* synthetic */ void m187420D0() {
        this.f170066e = true;
    }

    /* JADX INFO: renamed from: E0 */
    public final /* synthetic */ void m187421E0() {
        this.f170067f = true;
    }

    /* JADX INFO: renamed from: F0 */
    public final /* synthetic */ void m187422F0() {
        this.f170068g = 2L;
        m187428O0(Long.valueOf(this.f170069h));
    }

    /* JADX INFO: renamed from: G0 */
    public final /* synthetic */ void m187423G0() {
        this.f170068g = 3L;
        m187428O0(Long.valueOf(this.f170069h));
    }

    /* JADX INFO: renamed from: H0 */
    public final /* synthetic */ void m187424H0(HideAndSeekInfoEnv hideAndSeekInfoEnv) {
        ((gqn) this.viewModel).m131400z(hideAndSeekInfoEnv.data);
    }

    /* JADX INFO: renamed from: J0 */
    public final /* synthetic */ void m187425J0() {
        ((gqn) this.viewModel).m131398x();
    }

    /* JADX INFO: renamed from: L0 */
    public final /* synthetic */ void m187426L0(Pair pair) {
        Location location = (Location) pair.second;
        this.f170065d = location;
        ((gqn) this.viewModel).m131389k(location);
    }

    /* JADX INFO: renamed from: N0 */
    public void m187427N0() {
        if (this.f170063b != null) {
            return;
        }
        this.f170063b = new ubo();
        duringCreated(psd0.m173625r(((gqn) this.viewModel).m131393p().mo36929E3().map(new qcj() { // from class: l.epn
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.TRUE;
            }
        }), this.f170063b.m195253i(), new rcj() { // from class: l.fpn
            @Override // p153l.rcj
            public final Object call(Object obj, Object obj2) {
                return new Pair((Boolean) obj, (Location) obj2);
            }
        })).filter(new qcj() { // from class: l.gpn
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return spn.m187405h0((Pair) obj);
            }
        }).subscribe(psd0.m173597H(new y20() { // from class: l.hpn
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f111032a.m187426L0((Pair) obj);
            }
        }, new y20() { // from class: l.ipn
            @Override // p153l.y20
            public final void call(Object obj) {
                ((Throwable) obj).getMessage();
            }
        }));
        this.f170063b.m195255k();
    }

    /* JADX INFO: renamed from: O0 */
    public void m187428O0(Long l2) {
        if (l2.longValue() < pzi0.m174454o()) {
            return;
        }
        this.f170069h = l2.longValue();
        m187427N0();
        CoreModule.f18264c.f20427t1.m32519u("hide_and_seek_timer");
        RunnableC4884c0.a aVar = new RunnableC4884c0.a();
        aVar.m32526g("hide_and_seek_timer").m32520a(true).m32527h(1L).m32525f(l2.longValue()).m32523d(this);
        CoreModule.f18264c.f20427t1.m32516r(aVar);
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        creates(new y20() { // from class: l.dpn
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f90075a.m187401I0((Bundle) obj);
            }
        }, new x20() { // from class: l.jpn
            @Override // p153l.x20
            public final void call() {
                this.f122123a.m187425J0();
            }
        });
    }

    @Override // p153l.k3m
    public void destroy() {
        ubo uboVar = this.f170063b;
        if (uboVar != null) {
            uboVar.m195258n();
        }
        CoreModule.f18264c.f20427t1.m32519u("hide_and_seek_timer");
    }

    @Override // com.p051p1.mobile.putong.core.api.RunnableC4884c0.c
    /* JADX INFO: renamed from: u */
    public void mo32530u(String str, long j, long j2, long j3, long j4) {
        ubo uboVar;
        if (j3 - pzi0.m174454o() <= 500) {
            m187432z0();
            return;
        }
        Location location = this.f170065d;
        if (location != null) {
            this.f170070i = 0;
            duringCreated(CoreModule.f18264c.f20380d2.m95789n3(Double.toString(location.m80016x()), Double.toString(this.f170065d.m80014u()))).subscribe(psd0.m173597H(new y20() { // from class: l.kpn
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f127899a.m187419C0((HideAndSeekPushEnv) obj);
                }
            }, new y20() { // from class: l.lpn
                @Override // p153l.y20
                public final void call(Object obj) {
                    ((Throwable) obj).getMessage();
                }
            }));
            return;
        }
        int i = this.f170070i + 1;
        this.f170070i = i;
        if (i <= 5 || (uboVar = this.f170063b) == null) {
            return;
        }
        uboVar.m195257m();
    }

    /* JADX INFO: renamed from: u0 */
    public List<pf60<String, x20>> m187429u0() {
        return jyb.m147507f0(jyb.m147494Y("玩家随机移动", new x20() { // from class: l.mpn
            @Override // p153l.x20
            public final void call() {
                this.f137932a.m187420D0();
            }
        }), jyb.m147494Y("地理偏移修正", new x20() { // from class: l.npn
            @Override // p153l.x20
            public final void call() {
                this.f143110a.m187421E0();
            }
        }), jyb.m147494Y("刷新时间2s", new x20() { // from class: l.opn
            @Override // p153l.x20
            public final void call() {
                this.f148473a.m187422F0();
            }
        }), jyb.m147494Y("刷新时间3s", new x20() { // from class: l.ppn
            @Override // p153l.x20
            public final void call() {
                this.f153572a.m187423G0();
            }
        }));
    }

    /* JADX INFO: renamed from: x0 */
    public final void m187430x0() {
        duringCreated(CoreModule.f18264c.f20380d2.m95788m3()).subscribe(psd0.m173597H(new y20() { // from class: l.qpn
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f158887a.m187424H0((HideAndSeekInfoEnv) obj);
            }
        }, new y20() { // from class: l.rpn
            @Override // p153l.y20
            public final void call(Object obj) {
                ((Throwable) obj).getMessage();
            }
        }));
    }

    /* JADX INFO: renamed from: y0 */
    public Location m187431y0() {
        return this.f170065d;
    }

    /* JADX INFO: renamed from: z0 */
    public void m187432z0() {
        m187430x0();
        CoreModule.f18264c.f20427t1.m32519u("hide_and_seek_timer");
        ubo uboVar = this.f170063b;
        if (uboVar != null) {
            uboVar.m195258n();
        }
    }

    /* JADX INFO: renamed from: A0 */
    public void m187418A0() {
    }

    /* JADX INFO: renamed from: l.spn$a */
    public class C20129a implements hyl.InterfaceC17599a {
        public C20129a() {
        }

        @Override // p153l.hyl.InterfaceC17599a
        /* JADX INFO: renamed from: a */
        public void mo137751a() {
            ((gqn) spn.this.viewModel).m131384A();
        }

        @Override // p153l.hyl.InterfaceC17599a
        /* JADX INFO: renamed from: b */
        public void mo137752b(boolean z) {
            spn spnVar = spn.this;
            spnVar.f170062a = true;
            ((gqn) spnVar.viewModel).m131384A();
        }

        @Override // p153l.hyl.InterfaceC17599a
        /* JADX INFO: renamed from: d */
        public void mo137754d(double d, double d2, float f, boolean z) {
            spn.this.f170062a = false;
        }

        @Override // p153l.hyl.InterfaceC17599a
        /* JADX INFO: renamed from: c */
        public void mo137753c(hyl.InterfaceC17600b interfaceC17600b) {
        }
    }
}
