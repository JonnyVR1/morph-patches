package p149l;

import com.p046p1.mobile.putong.live.base.data.BLiveVoiceRoomAsset;
import com.p046p1.mobile.putong.live.livingroom.virtual.chat.VirtualChatInputTipsView;

/* JADX INFO: loaded from: classes5.dex */
public class vol0 extends h4t<fhm0, VirtualChatInputTipsView> {
    public vol0(bsm<fhm0> bsmVar, VirtualChatInputTipsView virtualChatInputTipsView) {
        super(bsmVar);
        mo51532C(virtualChatInputTipsView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: M3 */
    public /* synthetic */ void m199171M3(soj0 soj0Var) {
        ((fhm0) m206027E2()).f139754X = false;
        ((VirtualChatInputTipsView) this.viewModel).m76929O();
    }

    /* JADX INFO: renamed from: N3 */
    public final void m199172N3(String str) {
        fbp0.m120392h(this, str);
        m206028F2().ChatEvent.sendNormalMessage().mo172463j(new sn40(str));
        m206028F2().VoiceVirtualLiveEvent.dismissChatTips().m172467p();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: O3 */
    public final void m199173O3(BLiveVoiceRoomAsset bLiveVoiceRoomAsset) {
        ((fhm0) m206027E2()).f139754X = !vwb.m200296J(bLiveVoiceRoomAsset.tips);
        ((VirtualChatInputTipsView) this.viewModel).m76934T(bLiveVoiceRoomAsset.tips, VirtualChatInputTipsView.f52281k, new e30() { // from class: l.uol0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f177515a.m199172N3((String) obj);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        if (((fhm0) m206027E2()).f139754X) {
            duringCreated(((fhm0) m206027E2()).m160265c3(((fhm0) m206027E2()).m149818o(), ((fhm0) m206027E2()).m121381b4().getFocusUser())).subscribe(ffw.m121197h(new e30() { // from class: l.sol0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f165703a.m199173O3((BLiveVoiceRoomAsset) obj);
                }
            }));
            m129304h3(m206028F2().VoiceVirtualLiveEvent.dismissChatTips(), new e30() { // from class: l.tol0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f171382a.m199171M3((soj0) obj);
                }
            });
        }
    }
}
