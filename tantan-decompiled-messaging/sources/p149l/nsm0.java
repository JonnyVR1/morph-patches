package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceCall;
import com.p046p1.mobile.putong.live.livingroom.voice.call.api.VCallApiProvider;

/* JADX INFO: loaded from: classes5.dex */
public class nsm0 extends pat<nnn0> {
    public nsm0(bsm bsmVar) {
        super(bsmVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: L3 */
    private void m160783L3() {
        if (((nnn0) m206027E2()).m160273k3() || m160786M3() == null) {
            return;
        }
        if (vdt.m198092b(3) || !((nnn0) m206027E2()).m160267e3()) {
            BLiveVoiceCall bLiveVoiceCallMo223809clone = m160786M3().mo223809clone();
            bLiveVoiceCallMo223809clone.state = "hung-up";
            VCallApiProvider.hangUpVoiceCall(bLiveVoiceCallMo223809clone.f44485id, ((nnn0) m206027E2()).mo97490p(), "destroy");
            m160788O3(bLiveVoiceCallMo223809clone);
        }
    }

    /* JADX INFO: renamed from: J3 */
    public void m160784J3(aqm0 aqm0Var) {
        m160788O3(aqm0Var.f71175a);
    }

    /* JADX INFO: renamed from: K3 */
    public void m160785K3(BLiveVoiceCall bLiveVoiceCall) {
        m160788O3(bLiveVoiceCall);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: M3 */
    public BLiveVoiceCall m160786M3() {
        return ((nnn0) m206027E2()).m160261Y2();
    }

    /* JADX INFO: renamed from: N3 */
    public void m160787N3(BLiveVoiceCall bLiveVoiceCall) {
        m160788O3(bLiveVoiceCall);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: O3 */
    public void m160788O3(BLiveVoiceCall bLiveVoiceCall) {
        gkh0.m126627j("[voice][call]", " start filter  sellCall  ");
        if (alk0.m97311j(bLiveVoiceCall)) {
            if (m160786M3() != null && TextUtils.equals(bLiveVoiceCall.state, m160786M3().state) && TextUtils.equals(bLiveVoiceCall.f44485id, m160786M3().f44485id) && bLiveVoiceCall.mutedByUser == m160786M3().mutedByUser && bLiveVoiceCall.mutedByAnchor == m160786M3().mutedByAnchor && bLiveVoiceCall.isAway == m160786M3().isAway) {
                return;
            }
            gkh0.m126627j("[voice][call]", "send self call state: id " + bLiveVoiceCall.f44485id + " state:" + bLiveVoiceCall.state + ",isAway:" + bLiveVoiceCall.isAway);
            ((nnn0) m206027E2()).m160240J2(bLiveVoiceCall);
        }
    }

    /* JADX INFO: renamed from: P3 */
    public void m160789P3(BLiveVoiceCall bLiveVoiceCall) {
        m160788O3(bLiveVoiceCall);
    }

    /* JADX INFO: renamed from: R3 */
    public void m160790R3(w3o0 w3o0Var) {
        BLiveVoiceCall bLiveVoiceCallM201350C = w3o0Var.m201350C(ypv.f199493a.m199309D0());
        if (bLiveVoiceCallM201350C != null) {
            m160788O3(bLiveVoiceCallM201350C);
        } else if (alk0.m97309h(m160786M3())) {
            m160783L3();
        }
    }

    @Override // p149l.h4t, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        super.mo69117n();
        m160783L3();
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        duringCreated(m206028F2().VoiceCallEvent.updateSelfCallEvent().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.msm0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f135516a.m160788O3((BLiveVoiceCall) obj);
            }
        }));
    }
}
