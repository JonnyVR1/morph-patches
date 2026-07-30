package p149l;

import com.p046p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p046p1.mobile.putong.live.base.data.VirtualVoiceMotionType;
import com.p046p1.mobile.putong.live.livingroom.virtual.api.VoiceVirtualApi;
import com.p046p1.mobile.putong.live.livingroom.virtual.room.functions.dialog.spy.SpyDialogView;

/* JADX INFO: loaded from: classes5.dex */
public class krf0 extends h4t<nnn0, SpyDialogView> {
    public krf0(bsm<? extends nnn0> bsmVar, SpyDialogView spyDialogView) {
        super(bsmVar);
        mo51532C(spyDialogView);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: K3 */
    public void m146975K3() {
        w7n0.m202027d(this, VirtualVoiceMotionType.undercover);
        duringCreated(VoiceVirtualApi.switchTemplate(((nnn0) m206027E2()).m149814k(), VirtualVoiceMotionType.undercover)).subscribe(ffw.m121194e(new e30() { // from class: l.jrf0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f119402a.m146976L3((BLiveEnvelope) obj);
            }
        }, new vud0()));
    }

    /* JADX INFO: renamed from: L3 */
    public final /* synthetic */ void m146976L3(BLiveEnvelope bLiveEnvelope) {
        m206028F2().VoiceVirtualLiveEvent.showFunctionsDialog().mo172463j(-1);
    }
}
