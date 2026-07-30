package p149l;

import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import com.p046p1.mobile.putong.live.livingroom.common.chat.LiveChatItem;

/* JADX INFO: loaded from: classes4.dex */
public class ty4 extends wg2<LiveChatItem> {
    public ty4(LiveMessage liveMessage, nol nolVar) {
        super(liveMessage, nolVar);
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public void mo70566u(LiveChatItem liveChatItem) {
        super.mo70566u(liveChatItem);
        if (vwb.m200296J(this.f186132a.spanList)) {
            return;
        }
        nol nolVar = this.f186133b;
        LiveMessage liveMessage = this.f186132a;
        liveChatItem.m72497f(nolVar, liveMessage, liveMessage.spanList.get(0), 0);
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: o */
    public int mo70565o() {
        return t6c0.f168247Y;
    }
}
