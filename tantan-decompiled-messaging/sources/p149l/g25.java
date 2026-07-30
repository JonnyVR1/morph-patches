package p149l;

import com.p046p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveControlMessage;

/* JADX INFO: loaded from: classes4.dex */
public class g25 extends vp2<LongLinkLiveMessage.ChatTipsChange> {
    public g25(und undVar) {
        super(undVar);
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public LiveControlMessage mo99811w(String str, LongLinkLiveMessage.ChatTipsChange chatTipsChange, String str2) {
        return new LiveControlMessage(str, "chat_tip_change");
    }

    @Override // p149l.vp2, p149l.sul
    /* JADX INFO: renamed from: b */
    public Class<LongLinkLiveMessage.ChatTipsChange> mo94398b() {
        return LongLinkLiveMessage.ChatTipsChange.class;
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: e */
    public String mo94399e() {
        return "live.chattips.change";
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public boolean mo94400q(LongLinkLiveMessage.ChatTipsChange chatTipsChange, String str) {
        return m199212r(chatTipsChange.getRoomId(), chatTipsChange.getAnchorId(), "no_care");
    }
}
