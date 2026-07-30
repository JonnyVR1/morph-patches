package p153l;

import com.p051p1.mobile.putong.live.base.data.BLiveVoiceRoomAsset;
import com.p051p1.mobile.putong.live.livingroom.virtual.chat.VirtualChatInputTipsView;

/* JADX INFO: loaded from: classes5.dex */
public class zxl0 extends i6t<jqm0, VirtualChatInputTipsView> {
    public zxl0(dum<jqm0> dumVar, VirtualChatInputTipsView virtualChatInputTipsView) {
        super(dumVar);
        mo52715C(virtualChatInputTipsView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: M3 */
    public /* synthetic */ void m222008M3(vxj0 vxj0Var) {
        ((jqm0) m213810E2()).f165201X = false;
        ((VirtualChatInputTipsView) this.viewModel).m78112O();
    }

    /* JADX INFO: renamed from: N3 */
    public final void m222009N3(String str) {
        jkp0.m145877h(this, str);
        m213811F2().ChatEvent.sendNormalMessage().mo199273j(new gw40(str));
        m213811F2().VoiceVirtualLiveEvent.dismissChatTips().m199277p();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: O3 */
    public final void m222010O3(BLiveVoiceRoomAsset bLiveVoiceRoomAsset) {
        ((jqm0) m213810E2()).f165201X = !jyb.m147479J(bLiveVoiceRoomAsset.tips);
        ((VirtualChatInputTipsView) this.viewModel).m78117T(bLiveVoiceRoomAsset.tips, VirtualChatInputTipsView.f53129k, new y20() { // from class: l.yxl0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f201988a.m222009N3((String) obj);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        if (((jqm0) m213810E2()).f165201X) {
            duringCreated(((jqm0) m213810E2()).m183427c3(((jqm0) m213810E2()).m202194o(), ((jqm0) m213810E2()).m146609b4().getFocusUser())).subscribe(dhw.m115829h(new y20() { // from class: l.wxl0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f191501a.m222010O3((BLiveVoiceRoomAsset) obj);
                }
            }));
            m138863h3(m213811F2().VoiceVirtualLiveEvent.dismissChatTips(), new y20() { // from class: l.xxl0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f196659a.m222008M3((vxj0) obj);
                }
            });
        }
    }
}
