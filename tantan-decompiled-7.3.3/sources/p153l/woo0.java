package p153l;

import com.p051p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.voice.intl.player.VoiceRoomLoadingView;
import com.tantanapp.common.utils.ConnectivityReceiver;

/* JADX INFO: loaded from: classes10.dex */
public class woo0 extends i6t<jqm0, VoiceRoomLoadingView> implements c6m {

    /* JADX INFO: renamed from: i */
    public final bro0 f190059i;

    public woo0(dum dumVar, VoiceRoomLoadingView voiceRoomLoadingView) {
        super(dumVar);
        this.f190059i = (bro0) m153103z2(new bro0(dumVar, this));
        mo52715C(voiceRoomLoadingView);
    }

    /* JADX INFO: renamed from: K3 */
    private void m207330K3(String str) {
        lti.m155791f();
    }

    /* JADX INFO: renamed from: L3 */
    private void m207331L3(String str) {
        if (m207341U3()) {
            return;
        }
        m207342V3();
    }

    /* JADX INFO: renamed from: M3 */
    private void m207332M3(BLiveAbsData bLiveAbsData) {
        ((VoiceRoomLoadingView) this.viewModel).m79530e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N3 */
    public void m207333N3(jsv jsvVar) {
        int iM146875a = jsvVar.m146875a();
        if (iM146875a == 2) {
            m207334P3();
        } else {
            if (iM146875a != 4) {
                return;
            }
            m207336S3();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: P3 */
    private void m207334P3() {
        act().progressDismiss();
        m207332M3(((jqm0) m213810E2()).mo183435j());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: R3 */
    private void m207335R3() {
        duringCreated(((jqm0) m213810E2()).m202192l()).subscribe(dhw.m115825d(new y20() { // from class: l.voo0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f185068a.m207333N3((jsv) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: S3 */
    private void m207336S3() {
        ((VoiceRoomLoadingView) this.viewModel).m79529d();
        m207337W3();
    }

    /* JADX INFO: renamed from: W3 */
    private void m207337W3() {
        ((VoiceRoomLoadingView) this.viewModel).m79529d();
    }

    /* JADX INFO: renamed from: O3 */
    public void m207338O3() {
        this.f190059i.m106158X3("0");
    }

    /* JADX INFO: renamed from: P0 */
    public void m207339P0(boolean z, String str) {
        m207331L3(str);
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        m207330K3("voice");
        m207335R3();
    }

    /* JADX INFO: renamed from: T3 */
    public void m207340T3() {
        ((VoiceRoomLoadingView) this.viewModel).m79532j();
    }

    /* JADX INFO: renamed from: U3 */
    public final boolean m207341U3() {
        if (!ConnectivityReceiver.m82467g()) {
            ((VoiceRoomLoadingView) this.viewModel).m79533k(xau.m209910t(R$string.f47524F9));
            return true;
        }
        if (!ConnectivityReceiver.m82471k()) {
            return false;
        }
        ((VoiceRoomLoadingView) this.viewModel).m79533k(xau.m209910t(R$string.f47480D9));
        return true;
    }

    /* JADX INFO: renamed from: V3 */
    public final void m207342V3() {
        ((VoiceRoomLoadingView) this.viewModel).m79533k(xau.m209910t(R$string.f47524F9));
        ((VoiceRoomLoadingView) this.viewModel).m79531f();
    }

    /* JADX INFO: renamed from: m */
    public void m207343m(boolean z) {
        ((VoiceRoomLoadingView) this.viewModel).m79534l(z);
    }

    @Override // p153l.i6t, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: n */
    public void mo70300n() {
        m207340T3();
        super.mo70300n();
    }

    @Override // p153l.c6m
    /* JADX INFO: renamed from: m1 */
    public void mo108170m1() {
    }
}
