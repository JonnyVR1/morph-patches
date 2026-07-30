package p153l;

import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import com.p051p1.mobile.putong.live.livingroom.common.chat.LiveChatItem;

/* JADX INFO: loaded from: classes4.dex */
public class sz4 extends dh2<LiveChatItem> {
    public sz4(LiveMessage liveMessage, yql yqlVar) {
        super(liveMessage, yqlVar);
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public void mo71749u(LiveChatItem liveChatItem) {
        super.mo71749u(liveChatItem);
        if (jyb.m147479J(this.f88411a.spanList)) {
            return;
        }
        yql yqlVar = this.f88412b;
        LiveMessage liveMessage = this.f88411a;
        liveChatItem.m73680f(yqlVar, liveMessage, liveMessage.spanList.get(0), 0);
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: o */
    public int mo71748o() {
        return yec0.f198979Y;
    }
}
