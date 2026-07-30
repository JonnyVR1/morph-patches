package p149l;

import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.base.player.LiveRtcPlayErrorView;
import com.tantanapp.common.utils.ConnectivityReceiver;

/* JADX INFO: loaded from: classes4.dex */
public class ufd0 extends h4t<am40, LiveRtcPlayErrorView> {

    /* JADX INFO: renamed from: i */
    public egd0 f176248i;

    public ufd0(bsm bsmVar, LiveRtcPlayErrorView liveRtcPlayErrorView, egd0 egd0Var) {
        super(bsmVar);
        this.f176248i = egd0Var;
        mo51532C(liveRtcPlayErrorView);
    }

    /* JADX INFO: renamed from: J3 */
    public final void m193376J3() {
        String string = !ConnectivityReceiver.m81284g() ? ypv.f199497e.getString(R$string.f46676F9) : null;
        if (ConnectivityReceiver.m81288k()) {
            string = ypv.f199497e.getString(R$string.f46632D9);
        }
        if (string == null) {
            this.f176248i.m116271i4();
        } else {
            m193380N3(string);
            fgd0.m121206a("showErrorText".concat(string));
        }
    }

    /* JADX INFO: renamed from: K3 */
    public void m193377K3() {
        ((LiveRtcPlayErrorView) this.viewModel).m71939d();
    }

    /* JADX INFO: renamed from: L3 */
    public void m193378L3() {
        m193376J3();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: M3 */
    public void m193379M3() {
        if (((am40) m206027E2()).m149820r()) {
            m193376J3();
        }
    }

    /* JADX INFO: renamed from: N3 */
    public void m193380N3(String str) {
        ((LiveRtcPlayErrorView) this.viewModel).m71940f(str);
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
    }
}
