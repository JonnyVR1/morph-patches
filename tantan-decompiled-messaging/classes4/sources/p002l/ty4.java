package p002l;

import com.p000p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import com.p000p1.mobile.putong.live.livingroom.common.chat.LiveChatItem;
import l.vwb;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ty4 extends wg2<LiveChatItem> {
    public ty4(LiveMessage liveMessage, nol nolVar) {
        super(liveMessage, nolVar);
    }

    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public void m23234u(LiveChatItem liveChatItem) {
        super.u(liveChatItem);
        if (vwb.J(this.f21724a.spanList)) {
            return;
        }
        nol nolVar = this.f21725b;
        LiveMessage liveMessage = this.f21724a;
        liveChatItem.m5989f(nolVar, liveMessage, liveMessage.spanList.get(0), 0);
    }

    /* JADX INFO: renamed from: o */
    public int m23233o() {
        return t6c0.f19743Y;
    }
}
