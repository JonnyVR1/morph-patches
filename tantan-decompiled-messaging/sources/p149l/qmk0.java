package p149l;

import com.p046p1.mobile.putong.live.external.internal.vchat.LiveVChatAct;
import com.p046p1.mobile.putong.live.external.internal.vchat.LiveVChatEventBus;
import com.p046p1.mobile.putong.live.external.internal.vchat.VChatStartData;
import com.p046p1.mobile.putong.live.external.internal.vchat.view.LiveVChatView;

/* JADX INFO: loaded from: classes13.dex */
public class qmk0 extends zeu<LiveVChatView> {
    public qmk0(LiveVChatAct liveVChatAct, LiveVChatView liveVChatView, boolean z, VChatStartData vChatStartData, wlu wluVar) {
        super(new jlu(new LiveVChatEventBus(), liveVChatAct, z, wluVar));
        mo51532C(liveVChatView);
        if (!z) {
            m218409H2().m203925Y(vChatStartData);
            if (vChatStartData.chat != null) {
                m218409H2().m203924X(vChatStartData.chat.roomId);
                m218409H2().m203934h0(vChatStartData.chat, false);
            }
        } else if (vChatStartData != null) {
            m218409H2().f187009n = vChatStartData.isFromWindow;
        }
        mqu.m155994a(this, m218413M2(), liveVChatView);
    }

    /* JADX INFO: renamed from: R2 */
    public void m175573R2() {
        mo70198T();
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        super.mo69117n();
        m218409H2().m203936m(!m218409H2().f187008m);
    }
}
