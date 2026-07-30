package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceCall;
import com.p051p1.mobile.putong.live.livingroom.voice.call.api.VCallApiProvider;

/* JADX INFO: loaded from: classes5.dex */
public class r1n0 extends qct<rwn0> {
    public r1n0(dum dumVar) {
        super(dumVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: L3 */
    private void m179427L3() {
        if (((rwn0) m213810E2()).m183437k3() || m179430M3() == null) {
            return;
        }
        if (wft.m206159b(3) || !((rwn0) m213810E2()).m183429e3()) {
            BLiveVoiceCall bLiveVoiceCallMo225055clone = m179430M3().mo225055clone();
            bLiveVoiceCallMo225055clone.state = "hung-up";
            VCallApiProvider.hangUpVoiceCall(bLiveVoiceCallMo225055clone.f45333id, ((rwn0) m213810E2()).mo118373p(), "destroy");
            m179432O3(bLiveVoiceCallMo225055clone);
        }
    }

    /* JADX INFO: renamed from: J3 */
    public void m179428J3(ezm0 ezm0Var) {
        m179432O3(ezm0Var.f96607a);
    }

    /* JADX INFO: renamed from: K3 */
    public void m179429K3(BLiveVoiceCall bLiveVoiceCall) {
        m179432O3(bLiveVoiceCall);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: M3 */
    public BLiveVoiceCall m179430M3() {
        return ((rwn0) m213810E2()).m183423Y2();
    }

    /* JADX INFO: renamed from: N3 */
    public void m179431N3(BLiveVoiceCall bLiveVoiceCall) {
        m179432O3(bLiveVoiceCall);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: O3 */
    public void m179432O3(BLiveVoiceCall bLiveVoiceCall) {
        nsh0.m164608j("[voice][call]", " start filter  sellCall  ");
        if (guk0.m132331j(bLiveVoiceCall)) {
            if (m179430M3() != null && TextUtils.equals(bLiveVoiceCall.state, m179430M3().state) && TextUtils.equals(bLiveVoiceCall.f45333id, m179430M3().f45333id) && bLiveVoiceCall.mutedByUser == m179430M3().mutedByUser && bLiveVoiceCall.mutedByAnchor == m179430M3().mutedByAnchor && bLiveVoiceCall.isAway == m179430M3().isAway) {
                return;
            }
            nsh0.m164608j("[voice][call]", "send self call state: id " + bLiveVoiceCall.f45333id + " state:" + bLiveVoiceCall.state + ",isAway:" + bLiveVoiceCall.isAway);
            ((rwn0) m213810E2()).m183402J2(bLiveVoiceCall);
        }
    }

    /* JADX INFO: renamed from: P3 */
    public void m179433P3(BLiveVoiceCall bLiveVoiceCall) {
        m179432O3(bLiveVoiceCall);
    }

    /* JADX INFO: renamed from: R3 */
    public void m179434R3(ado0 ado0Var) {
        BLiveVoiceCall bLiveVoiceCallM97107C = ado0Var.m97107C(zrv.f205799a.m207631D0());
        if (bLiveVoiceCallM97107C != null) {
            m179432O3(bLiveVoiceCallM97107C);
        } else if (guk0.m132329h(m179430M3())) {
            m179427L3();
        }
    }

    @Override // p153l.i6t, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: n */
    public void mo70300n() {
        super.mo70300n();
        m179427L3();
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        duringCreated(m213811F2().VoiceCallEvent.updateSelfCallEvent().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.q1n0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f155212a.m179432O3((BLiveVoiceCall) obj);
            }
        }));
    }
}
