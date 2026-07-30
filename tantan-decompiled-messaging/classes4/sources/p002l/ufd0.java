package p002l;

import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p000p1.mobile.putong.live.livingroom.base.player.LiveRtcPlayErrorView;
import com.tantanapp.common.utils.ConnectivityReceiver;
import l.bwr;
import l.ypv;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ufd0 extends h4t<am40, LiveRtcPlayErrorView> {

    /* JADX INFO: renamed from: i */
    public egd0 f20610i;

    public ufd0(bsm bsmVar, LiveRtcPlayErrorView liveRtcPlayErrorView, egd0 egd0Var) {
        super(bsmVar);
        this.f20610i = egd0Var;
        C(liveRtcPlayErrorView);
    }

    /* JADX INFO: renamed from: J3 */
    public final void m23440J3() {
        String string = !ConnectivityReceiver.g() ? ypv.e.getString(R$string.f2718F9) : null;
        if (ConnectivityReceiver.k()) {
            string = ypv.e.getString(R$string.f2674D9);
        }
        if (string == null) {
            this.f20610i.m12506i4();
        } else {
            m23444N3(string);
            fgd0.m13158a("showErrorText".concat(string));
        }
    }

    /* JADX INFO: renamed from: K3 */
    public void m23441K3() {
        ((LiveRtcPlayErrorView) ((bwr) this).viewModel).m5323d();
    }

    /* JADX INFO: renamed from: L3 */
    public void m23442L3() {
        m23440J3();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: M3 */
    public void m23443M3() {
        if (((am40) m25547E2()).m17241r()) {
            m23440J3();
        }
    }

    /* JADX INFO: renamed from: N3 */
    public void m23444N3(String str) {
        ((LiveRtcPlayErrorView) ((bwr) this).viewModel).m5324f(str);
    }

    /* JADX INFO: renamed from: t */
    public void m23445t() {
        super.t();
    }
}
