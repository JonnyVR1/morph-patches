package p149l;

import com.p046p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.voice.intl.player.VoiceRoomLoadingView;
import com.tantanapp.common.utils.ConnectivityReceiver;

/* JADX INFO: loaded from: classes11.dex */
public class sfo0 extends h4t<fhm0, VoiceRoomLoadingView> implements l3m {

    /* JADX INFO: renamed from: i */
    public final xho0 f164324i;

    public sfo0(bsm bsmVar, VoiceRoomLoadingView voiceRoomLoadingView) {
        super(bsmVar);
        this.f164324i = (xho0) m144512z2(new xho0(bsmVar, this));
        mo51532C(voiceRoomLoadingView);
    }

    /* JADX INFO: renamed from: K3 */
    private void m183980K3(String str) {
        pqi.m170914f();
    }

    /* JADX INFO: renamed from: L3 */
    private void m183981L3(String str) {
        if (m183991U3()) {
            return;
        }
        m183992V3();
    }

    /* JADX INFO: renamed from: M3 */
    private void m183982M3(BLiveAbsData bLiveAbsData) {
        ((VoiceRoomLoadingView) this.viewModel).m78347e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N3 */
    public void m183983N3(iqv iqvVar) {
        int iM137794a = iqvVar.m137794a();
        if (iM137794a == 2) {
            m183984P3();
        } else {
            if (iM137794a != 4) {
                return;
            }
            m183986S3();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: P3 */
    private void m183984P3() {
        act().progressDismiss();
        m183982M3(((fhm0) m206027E2()).mo149813j());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: R3 */
    private void m183985R3() {
        duringCreated(((fhm0) m206027E2()).m149815l()).subscribe(ffw.m121193d(new e30() { // from class: l.rfo0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f159169a.m183983N3((iqv) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: S3 */
    private void m183986S3() {
        ((VoiceRoomLoadingView) this.viewModel).m78346d();
        m183987W3();
    }

    /* JADX INFO: renamed from: W3 */
    private void m183987W3() {
        ((VoiceRoomLoadingView) this.viewModel).m78346d();
    }

    /* JADX INFO: renamed from: O3 */
    public void m183988O3() {
        this.f164324i.m208817X3("0");
    }

    /* JADX INFO: renamed from: P0 */
    public void m183989P0(boolean z, String str) {
        m183981L3(str);
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        m183980K3("voice");
        m183985R3();
    }

    /* JADX INFO: renamed from: T3 */
    public void m183990T3() {
        ((VoiceRoomLoadingView) this.viewModel).m78349j();
    }

    /* JADX INFO: renamed from: U3 */
    public final boolean m183991U3() {
        if (!ConnectivityReceiver.m81284g()) {
            ((VoiceRoomLoadingView) this.viewModel).m78350k(w8u.m202217t(R$string.f46676F9));
            return true;
        }
        if (!ConnectivityReceiver.m81288k()) {
            return false;
        }
        ((VoiceRoomLoadingView) this.viewModel).m78350k(w8u.m202217t(R$string.f46632D9));
        return true;
    }

    /* JADX INFO: renamed from: V3 */
    public final void m183992V3() {
        ((VoiceRoomLoadingView) this.viewModel).m78350k(w8u.m202217t(R$string.f46676F9));
        ((VoiceRoomLoadingView) this.viewModel).m78348f();
    }

    /* JADX INFO: renamed from: m */
    public void m183993m(boolean z) {
        ((VoiceRoomLoadingView) this.viewModel).m78351l(z);
    }

    @Override // p149l.h4t, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        m183990T3();
        super.mo69117n();
    }

    @Override // p149l.l3m
    /* JADX INFO: renamed from: m1 */
    public void mo105734m1() {
    }
}
