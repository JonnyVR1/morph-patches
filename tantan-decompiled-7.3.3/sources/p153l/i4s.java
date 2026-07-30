package p153l;

import com.p051p1.mobile.longlink.msg.livechat.LongLinkChatMessage;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;

/* JADX INFO: loaded from: classes4.dex */
public class i4s extends p4s {
    public i4s(zod zodVar) {
        super(zodVar);
    }

    @Override // p153l.p4s, p153l.mq2
    /* JADX INFO: renamed from: A */
    public LiveMessage mo113619x(String str, LongLinkChatMessage.LiveChatMessage liveChatMessage, String str2) {
        LiveMessage liveMessageMo113619x = super.mo113619x(str, liveChatMessage, str2);
        muj.m160217s(liveMessageMo113619x);
        liveMessageMo113619x.setLiveMessageType(LiveMessage.LiveMessageType.GIFT_MESSAGE);
        return liveMessageMo113619x;
    }

    @Override // p153l.p4s, p153l.mq2
    /* JADX INFO: renamed from: e */
    public String mo95511e() {
        return "live.chat.gift";
    }
}
