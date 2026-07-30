package p153l;

import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceGrabHatCP;

/* JADX INFO: loaded from: classes5.dex */
public class a9k extends y8s<rwn0, c9k> {
    public a9k(dum<? extends rwn0> dumVar) {
        super(dumVar);
        mo52715C(new c9k(this));
    }

    /* JADX INFO: renamed from: U3 */
    public final /* synthetic */ void m96600U3() {
        ((c9k) this.viewModel).mo73021p();
    }

    /* JADX INFO: renamed from: V3 */
    public final void m96601V3(BLiveVoiceGrabHatCP bLiveVoiceGrabHatCP) {
        ((c9k) this.viewModel).m108444I(bLiveVoiceGrabHatCP);
        l51.m152888H(act(), new Runnable() { // from class: l.z8k
            @Override // java.lang.Runnable
            public final void run() {
                this.f203396a.m96600U3();
            }
        }, Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        duringCreated(((rwn0) m213810E2()).m168545q1().m98301l()).subscribe(dhw.m115829h(new y20() { // from class: l.y8k
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f198011a.m96601V3((BLiveVoiceGrabHatCP) obj);
            }
        }));
    }
}
