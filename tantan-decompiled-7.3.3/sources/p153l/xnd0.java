package p153l;

import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.base.player.LiveRtcPlayErrorView;
import com.tantanapp.common.utils.ConnectivityReceiver;

/* JADX INFO: loaded from: classes4.dex */
public class xnd0 extends i6t<ou40, LiveRtcPlayErrorView> {

    /* JADX INFO: renamed from: i */
    public hod0 f195377i;

    public xnd0(dum dumVar, LiveRtcPlayErrorView liveRtcPlayErrorView, hod0 hod0Var) {
        super(dumVar);
        this.f195377i = hod0Var;
        mo52715C(liveRtcPlayErrorView);
    }

    /* JADX INFO: renamed from: J3 */
    public final void m212142J3() {
        String string = !ConnectivityReceiver.m82467g() ? zrv.f205803e.getString(R$string.f47524F9) : null;
        if (ConnectivityReceiver.m82471k()) {
            string = zrv.f205803e.getString(R$string.f47480D9);
        }
        if (string == null) {
            this.f195377i.m136411i4();
        } else {
            m212146N3(string);
            iod0.m141294a("showErrorText".concat(string));
        }
    }

    /* JADX INFO: renamed from: K3 */
    public void m212143K3() {
        ((LiveRtcPlayErrorView) this.viewModel).m73122d();
    }

    /* JADX INFO: renamed from: L3 */
    public void m212144L3() {
        m212142J3();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: M3 */
    public void m212145M3() {
        if (((ou40) m213810E2()).m202195r()) {
            m212142J3();
        }
    }

    /* JADX INFO: renamed from: N3 */
    public void m212146N3(String str) {
        ((LiveRtcPlayErrorView) this.viewModel).m73123f(str);
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
    }
}
