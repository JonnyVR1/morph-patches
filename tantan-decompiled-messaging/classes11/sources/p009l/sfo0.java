package p009l;

import com.p000p1.mobile.putong.live.livingroom.voice.intl.player.VoiceRoomLoadingView;
import com.p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p1.mobile.putong.live.livingroom.R;
import com.tantanapp.common.utils.ConnectivityReceiver;
import l.bsm;
import l.bwr;
import l.e30;
import l.ffw;
import l.fhm0;
import l.h4t;
import l.iqv;
import l.l3m;
import l.pqi;
import l.w8u;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class sfo0 extends h4t<fhm0, VoiceRoomLoadingView> implements l3m {

    /* JADX INFO: renamed from: i */
    public final xho0 f20230i;

    public sfo0(bsm bsmVar, VoiceRoomLoadingView voiceRoomLoadingView) {
        super(bsmVar);
        this.f20230i = z2(new xho0(bsmVar, this));
        C(voiceRoomLoadingView);
    }

    /* JADX INFO: renamed from: K3 */
    private void m22145K3(String str) {
        pqi.f();
    }

    /* JADX INFO: renamed from: L3 */
    private void m22146L3(String str) {
        if (m22157U3()) {
            return;
        }
        m22158V3();
    }

    /* JADX INFO: renamed from: M3 */
    private void m22147M3(BLiveAbsData bLiveAbsData) {
        ((VoiceRoomLoadingView) ((bwr) this).viewModel).m8545e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N3 */
    public void m22148N3(iqv iqvVar) {
        int iA = iqvVar.a();
        if (iA == 2) {
            m22149P3();
        } else {
            if (iA != 4) {
                return;
            }
            m22151S3();
        }
    }

    /* JADX INFO: renamed from: P3 */
    private void m22149P3() {
        act().progressDismiss();
        m22147M3(E2().V2());
    }

    /* JADX INFO: renamed from: R3 */
    private void m22150R3() {
        duringCreated(E2().l()).subscribe(ffw.d(new e30() { // from class: l.rfo0
            public final void call(Object obj) {
                this.f19817a.m22148N3((iqv) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: S3 */
    private void m22151S3() {
        ((VoiceRoomLoadingView) ((bwr) this).viewModel).m8544d();
        m22152W3();
    }

    /* JADX INFO: renamed from: W3 */
    private void m22152W3() {
        ((VoiceRoomLoadingView) ((bwr) this).viewModel).m8544d();
    }

    /* JADX INFO: renamed from: O3 */
    public void m22153O3() {
        this.f20230i.m24909X3("0");
    }

    /* JADX INFO: renamed from: P0 */
    public void m22154P0(boolean z, String str) {
        m22146L3(str);
    }

    /* JADX INFO: renamed from: T */
    public void m22155T() {
        super/*l.k4t*/.T();
        m22145K3("voice");
        m22150R3();
    }

    /* JADX INFO: renamed from: T3 */
    public void m22156T3() {
        ((VoiceRoomLoadingView) ((bwr) this).viewModel).m8548j();
    }

    /* JADX INFO: renamed from: U3 */
    public final boolean m22157U3() {
        if (!ConnectivityReceiver.g()) {
            ((VoiceRoomLoadingView) ((bwr) this).viewModel).m8549k(w8u.t(R.string.F9));
            return true;
        }
        if (!ConnectivityReceiver.k()) {
            return false;
        }
        ((VoiceRoomLoadingView) ((bwr) this).viewModel).m8549k(w8u.t(R.string.D9));
        return true;
    }

    /* JADX INFO: renamed from: V3 */
    public final void m22158V3() {
        ((VoiceRoomLoadingView) ((bwr) this).viewModel).m8549k(w8u.t(R.string.F9));
        ((VoiceRoomLoadingView) ((bwr) this).viewModel).m8546f();
    }

    /* JADX INFO: renamed from: m */
    public void m22159m(boolean z) {
        ((VoiceRoomLoadingView) ((bwr) this).viewModel).m8550l(z);
    }

    /* JADX INFO: renamed from: n */
    public void m22161n() {
        m22156T3();
        super.n();
    }

    /* JADX INFO: renamed from: m1 */
    public void m22160m1() {
    }
}
