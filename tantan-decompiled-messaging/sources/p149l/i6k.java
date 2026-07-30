package p149l;

import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceGrabHatCP;

/* JADX INFO: loaded from: classes5.dex */
public class i6k extends x6s<nnn0, k6k> {
    public i6k(bsm<? extends nnn0> bsmVar) {
        super(bsmVar);
        mo51532C(new k6k(this));
    }

    /* JADX INFO: renamed from: U3 */
    public final /* synthetic */ void m134623U3() {
        ((k6k) this.viewModel).mo71838p();
    }

    /* JADX INFO: renamed from: V3 */
    public final void m134624V3(BLiveVoiceGrabHatCP bLiveVoiceGrabHatCP) {
        ((k6k) this.viewModel).m144627I(bLiveVoiceGrabHatCP);
        e51.m114743H(act(), new Runnable() { // from class: l.h6k
            @Override // java.lang.Runnable
            public final void run() {
                this.f106069a.m134623U3();
            }
        }, Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        duringCreated(((nnn0) m206027E2()).m132160q1().m189119l()).subscribe(ffw.m121197h(new e30() { // from class: l.g6k
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f101271a.m134624V3((BLiveVoiceGrabHatCP) obj);
            }
        }));
    }
}
