package p002l;

import com.p000p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class h2s extends o2s {
    public h2s(und undVar) {
        super(undVar);
    }

    @Override // p002l.o2s, p002l.vp2
    /* JADX INFO: renamed from: A */
    public LiveMessage mo9247x(String str, LongLinkChatMessage.LiveChatMessage liveChatMessage, String str2) {
        LiveMessage liveMessageMo9247x = super.mo9247x(str, liveChatMessage, str2);
        wrj.m25425s(liveMessageMo9247x);
        liveMessageMo9247x.setLiveMessageType(LiveMessage.LiveMessageType.GIFT_MESSAGE);
        return liveMessageMo9247x;
    }

    @Override // p002l.o2s, p002l.vp2
    /* JADX INFO: renamed from: e */
    public String mo9245e() {
        return "live.chat.gift";
    }
}
