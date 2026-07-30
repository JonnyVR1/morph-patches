package p153l;

import android.view.View;
import com.p051p1.mobile.putong.live.base.data.BLive;
import com.p051p1.mobile.putong.live.base.data.BLiveAnchor;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p051p1.mobile.putong.live.livingroom.archi.motion.MotionType;
import com.p051p1.mobile.putong.live.livingroom.recreation.multiplayerchat.view.CallWidgetView;
import com.p051p1.mobile.putong.live.livingroom.recreation.multiplayerchat.view.LiveCallView;

/* JADX INFO: loaded from: classes5.dex */
public class rz3 extends i6t<dw40, c44> implements c6m {

    /* JADX INFO: renamed from: i */
    public final CallWidgetView f165481i;

    /* JADX INFO: renamed from: j */
    public final LiveCallView f165482j;

    public rz3(dum dumVar, CallWidgetView callWidgetView, LiveCallView liveCallView) {
        super(dumVar);
        this.f165481i = callWidgetView;
        this.f165482j = liveCallView;
        mo52715C(new c44());
    }

    /* JADX INFO: renamed from: O3 */
    public static /* synthetic */ void m183675O3(Integer num, MotionType motionType) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V3 */
    public /* synthetic */ void m183679V3(vxj0 vxj0Var) {
        ((c44) this.viewModel).m107858l();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        ((c44) this.viewModel).m107860r();
        duringCreated(m213811F2().CallEvent.anchorCallManageDialog().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.iz3
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f117656a.m183679V3((vxj0) obj);
            }
        }));
        duringCreated(m213811F2().CallEvent.updateCallNum().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.jz3
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f123221a.m183682W3((Integer) obj);
            }
        }));
        duringCreated(m213811F2().CallEvent.anchorCall().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.kz3
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f129382a.m183680T3(((Boolean) obj).booleanValue());
            }
        }));
        duringCreated(((dw40) m213810E2()).m118363A2().m122888d()).filter(new qcj() { // from class: l.lz3
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf("obs".equals(((BLive) obj).liveMode));
            }
        }).subscribe(dhw.m115829h(new y20() { // from class: l.mz3
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f139474a.m183683X3((BLive) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: T3 */
    public final void m183680T3(boolean z) {
        if (z) {
            m183687b4(true);
        } else {
            m183687b4(false);
        }
    }

    /* JADX INFO: renamed from: U3 */
    public void m183681U3(boolean z) {
        if (z) {
            m183686a4(true);
        } else if (((Boolean) m138856F3(new b45(4400))).booleanValue()) {
            new th0.C20312a(act()).m191160s(this.f196919f.getString(R$string.f48074f2)).m191150i(R$string.f48096g2).m191157p(n9c0.f140855p0).m191158q(R$string.f48403u2).m191156o(new View.OnClickListener() { // from class: l.nz3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f144404a.m183684Y3(view);
                }
            }).m191145d(n9c0.f140804X0).m191146e(R$string.f47690N1).m191142a().m191141g();
        } else {
            m183686a4(false);
        }
    }

    /* JADX INFO: renamed from: W3 */
    public final /* synthetic */ void m183682W3(Integer num) {
        ((c44) this.viewModel).m107859m(num.intValue());
    }

    /* JADX INFO: renamed from: X3 */
    public final /* synthetic */ void m183683X3(BLive bLive) {
        m183681U3(false);
    }

    /* JADX INFO: renamed from: Y3 */
    public final /* synthetic */ void m183684Y3(View view) {
        m183686a4(false);
    }

    /* JADX INFO: renamed from: Z3 */
    public final /* synthetic */ void m183685Z3(BLiveAnchor bLiveAnchor) {
        m183687b4(bLiveAnchor.liveSetting.callSwitch.f45194on);
    }

    /* JADX INFO: renamed from: a4 */
    public void m183686a4(boolean z) {
        duringCreated(LivingNormalApiProvider.m72487O7(z)).subscribe(dhw.m115826e(new y20() { // from class: l.pz3
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f154718a.m183685Z3((BLiveAnchor) obj);
            }
        }, new y20() { // from class: l.qz3
            @Override // p153l.y20
            public final void call(Object obj) {
                o1j0.m165634h(R$string.f47612J9);
            }
        }));
    }

    /* JADX INFO: renamed from: b4 */
    public final void m183687b4(boolean z) {
        g64.m129083d("anchor setCallSwitch enable:" + z);
        ((c44) this.viewModel).m107857k(z);
        t610 t610Var = new t610(z, MotionType.multi_connect);
        V v2 = this.viewModel;
        if (z) {
            t610Var.m189492b(new z34(((c44) v2).f79667f, this.f165481i, this.f165482j)).m189491a(new z20() { // from class: l.oz3
                @Override // p153l.z20
                public final void call(Object obj, Object obj2) {
                    rz3.m183675O3((Integer) obj, (MotionType) obj2);
                }
            });
        } else {
            ((c44) v2).m107859m(0);
        }
        m213811F2().MotionEvent.motionSwitch().mo199273j(t610Var);
    }
}
