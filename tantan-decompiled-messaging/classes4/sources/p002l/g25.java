package p002l;

import com.p000p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveControlMessage;
import com.p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class g25 extends vp2<LongLinkLiveMessage.ChatTipsChange> {
    public g25(und undVar) {
        super(undVar);
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public LiveControlMessage mo10148w(String str, LongLinkLiveMessage.ChatTipsChange chatTipsChange, String str2) {
        return new LiveControlMessage(str, "chat_tip_change");
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: b */
    public Class<LongLinkLiveMessage.ChatTipsChange> mo9244b() {
        return LongLinkLiveMessage.ChatTipsChange.class;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: e */
    public String mo9245e() {
        return "live.chattips.change";
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public boolean mo9246q(LongLinkLiveMessage.ChatTipsChange chatTipsChange, String str) {
        return m24095r(chatTipsChange.getRoomId(), chatTipsChange.getAnchorId(), "no_care");
    }
}
