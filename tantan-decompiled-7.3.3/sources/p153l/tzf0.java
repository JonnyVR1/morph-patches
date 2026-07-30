package p153l;

import com.p051p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p051p1.mobile.putong.live.base.data.VirtualVoiceMotionType;
import com.p051p1.mobile.putong.live.livingroom.virtual.api.VoiceVirtualApi;
import com.p051p1.mobile.putong.live.livingroom.virtual.room.functions.dialog.spy.SpyDialogView;

/* JADX INFO: loaded from: classes5.dex */
public class tzf0 extends i6t<rwn0, SpyDialogView> {
    public tzf0(dum<? extends rwn0> dumVar, SpyDialogView spyDialogView) {
        super(dumVar);
        mo52715C(spyDialogView);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: K3 */
    public void m193659K3() {
        ahn0.m97862d(this, VirtualVoiceMotionType.undercover);
        duringCreated(VoiceVirtualApi.switchTemplate(((rwn0) m213810E2()).m202191k(), VirtualVoiceMotionType.undercover)).subscribe(dhw.m115826e(new y20() { // from class: l.szf0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f171388a.m193660L3((BLiveEnvelope) obj);
            }
        }, new z2e0()));
    }

    /* JADX INFO: renamed from: L3 */
    public final /* synthetic */ void m193660L3(BLiveEnvelope bLiveEnvelope) {
        m213811F2().VoiceVirtualLiveEvent.showFunctionsDialog().mo199273j(-1);
    }
}
