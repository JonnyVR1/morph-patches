package p153l;

import com.p051p1.mobile.putong.live.base.data.BLiveVoice;
import p137rx.C22421c;
import p153l.rwn0;

/* JADX INFO: loaded from: classes5.dex */
public class b2m0<D extends rwn0> extends y8s<D, q1m0> {
    public b2m0(dum<D> dumVar) {
        super(dumVar);
        mo52715C(new q1m0(dumVar.f90815a, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a4 */
    public /* synthetic */ void m102211a4(vxj0 vxj0Var) {
        ((q1m0) this.viewModel).mo73021p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b4 */
    public /* synthetic */ C22421c m102212b4(uxj0 uxj0Var) {
        return m213810E2().m183417S3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d4 */
    public /* synthetic */ void m102213d4(Throwable th) {
        ((q1m0) this.viewModel).m174924L();
    }

    private void init() {
        m214779N3(m213810E2().m168537m2().onErrorReturn(new qcj() { // from class: l.s1m0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return uxj0.f181467a;
            }
        }).flatMap(new qcj() { // from class: l.t1m0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f171687a.m102212b4((uxj0) obj);
            }
        })).filter(new qcj() { // from class: l.u1m0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                p7o0 p7o0Var = (p7o0) obj;
                return Boolean.valueOf((p7o0Var == null || jyb.m147479J(p7o0Var.f150952a)) ? false : true);
            }
        }).subscribe(dhw.m115826e(new y20() { // from class: l.v1m0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f181988a.m102214c4((p7o0) obj);
            }
        }, new y20() { // from class: l.w1m0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f186824a.m102213d4((Throwable) obj);
            }
        }));
        m214779N3(m213810E2().m183417S3()).subscribe(dhw.m115826e(new y20() { // from class: l.x1m0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f192083a.m102215e4((p7o0) obj);
            }
        }, new y20() { // from class: l.y1m0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f197116a.m102216f4((Throwable) obj);
            }
        }));
    }

    @Override // p153l.y8s
    /* JADX INFO: renamed from: P3 */
    public void mo96837P3() {
        super.mo96837P3();
        init();
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        duringCreated((C22421c) m213811F2().MemberEvent.dismiss().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.z1m0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f202577a.m102211a4((vxj0) obj);
            }
        }));
        duringCreated((C22421c) m213811F2().MemberEvent.show().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.a2m0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f68012a.m102219i4(((Integer) obj).intValue());
            }
        }));
    }

    /* JADX INFO: renamed from: c4 */
    public final /* synthetic */ void m102214c4(p7o0 p7o0Var) {
        ((q1m0) this.viewModel).m174925P(p7o0Var.f150952a);
    }

    /* JADX INFO: renamed from: e4 */
    public final /* synthetic */ void m102215e4(p7o0 p7o0Var) {
        ((q1m0) this.viewModel).m174925P(p7o0Var.f150952a);
    }

    /* JADX INFO: renamed from: f4 */
    public final /* synthetic */ void m102216f4(Throwable th) {
        ((q1m0) this.viewModel).m174924L();
    }

    /* JADX INFO: renamed from: g4 */
    public void m102217g4() {
        BLiveVoice bLiveVoiceMo183435j = m213810E2().mo183435j();
        if (bLiveVoiceMo183435j == null) {
            return;
        }
        m213810E2().m183395D3(bLiveVoiceMo183435j.room.f45267id);
    }

    /* JADX INFO: renamed from: h4 */
    public void m102218h4() {
        BLiveVoice bLiveVoiceMo183435j = m213810E2().mo183435j();
        if (bLiveVoiceMo183435j == null) {
            return;
        }
        m213810E2().m168540n2();
        m213810E2().mo118371N1(bLiveVoiceMo183435j.room.f45267id);
    }

    /* JADX INFO: renamed from: i4 */
    public void m102219i4(int i) {
        ((q1m0) this.viewModel).m174926Q();
        m102218h4();
    }
}
