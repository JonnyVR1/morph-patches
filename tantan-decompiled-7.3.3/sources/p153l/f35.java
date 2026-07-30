package p153l;

import com.p051p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveControlMessage;

/* JADX INFO: loaded from: classes4.dex */
public class f35 extends mq2<LongLinkLiveMessage.ChatTipsChange> {
    public f35(zod zodVar) {
        super(zodVar);
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public LiveControlMessage mo95513w(String str, LongLinkLiveMessage.ChatTipsChange chatTipsChange, String str2) {
        return new LiveControlMessage(str, "chat_tip_change");
    }

    @Override // p153l.mq2, p153l.fxl
    /* JADX INFO: renamed from: b */
    public Class<LongLinkLiveMessage.ChatTipsChange> mo95510b() {
        return LongLinkLiveMessage.ChatTipsChange.class;
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: e */
    public String mo95511e() {
        return "live.chattips.change";
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public boolean mo95512q(LongLinkLiveMessage.ChatTipsChange chatTipsChange, String str) {
        return m159460r(chatTipsChange.getRoomId(), chatTipsChange.getAnchorId(), "no_care");
    }
}
