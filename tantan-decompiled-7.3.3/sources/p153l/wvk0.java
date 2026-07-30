package p153l;

import com.p051p1.mobile.putong.live.external.internal.vchat.LiveVChatAct;
import com.p051p1.mobile.putong.live.external.internal.vchat.LiveVChatEventBus;
import com.p051p1.mobile.putong.live.external.internal.vchat.VChatStartData;
import com.p051p1.mobile.putong.live.external.internal.vchat.view.LiveVChatView;

/* JADX INFO: loaded from: classes9.dex */
public class wvk0 extends ahu<LiveVChatView> {
    public wvk0(LiveVChatAct liveVChatAct, LiveVChatView liveVChatView, boolean z, VChatStartData vChatStartData, xnu xnuVar) {
        super(new knu(new LiveVChatEventBus(), liveVChatAct, z, xnuVar));
        mo52715C(liveVChatView);
        if (!z) {
            m97926H2().m212332Y(vChatStartData);
            if (vChatStartData.chat != null) {
                m97926H2().m212331X(vChatStartData.chat.roomId);
                m97926H2().m212341h0(vChatStartData.chat, false);
            }
        } else if (vChatStartData != null) {
            m97926H2().f195483n = vChatStartData.isFromWindow;
        }
        nsu.m164634a(this, m97930M2(), liveVChatView);
    }

    /* JADX INFO: renamed from: R2 */
    public void m208069R2() {
        mo71381T();
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: n */
    public void mo70300n() {
        super.mo70300n();
        m97926H2().m212343m(!m97926H2().f195482m);
    }
}
