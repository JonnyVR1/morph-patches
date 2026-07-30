package p149l;

import com.p046p1.mobile.longlink.msg.livechat.LongLinkChatMessage;
import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;

/* JADX INFO: loaded from: classes4.dex */
public class h2s extends o2s {
    public h2s(und undVar) {
        super(undVar);
    }

    @Override // p149l.o2s, p149l.vp2
    /* JADX INFO: renamed from: A */
    public LiveMessage mo94401x(String str, LongLinkChatMessage.LiveChatMessage liveChatMessage, String str2) {
        LiveMessage liveMessageMo94401x = super.mo94401x(str, liveChatMessage, str2);
        wrj.m205253s(liveMessageMo94401x);
        liveMessageMo94401x.setLiveMessageType(LiveMessage.LiveMessageType.GIFT_MESSAGE);
        return liveMessageMo94401x;
    }

    @Override // p149l.o2s, p149l.vp2
    /* JADX INFO: renamed from: e */
    public String mo94399e() {
        return "live.chat.gift";
    }
}
