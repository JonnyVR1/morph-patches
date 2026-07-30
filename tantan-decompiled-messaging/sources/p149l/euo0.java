package p149l;

import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import com.p046p1.mobile.putong.live.livingroom.common.chat.VoiceChatItem;

/* JADX INFO: loaded from: classes5.dex */
public class euo0 extends wg2<VoiceChatItem> {
    public euo0(LiveMessage liveMessage, nol nolVar) {
        super(liveMessage, nolVar);
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public void mo70566u(VoiceChatItem voiceChatItem) {
        super.mo70566u(voiceChatItem);
        if (vwb.m200296J(this.f186132a.spanList)) {
            return;
        }
        nol nolVar = this.f186133b;
        LiveMessage liveMessage = this.f186132a;
        voiceChatItem.m72516e(nolVar, liveMessage, liveMessage.spanList.get(0), 0);
        xdl0.m208357U(voiceChatItem, m202998H() ? 0 : t100.m186890d(6.0f));
        xdl0.m208360X(voiceChatItem, t100.m186890d(6.0f));
        xdl0.m208358V(voiceChatItem, t100.m186890d(4.0f));
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: o */
    public int mo70565o() {
        return t6c0.f168371h8;
    }
}
