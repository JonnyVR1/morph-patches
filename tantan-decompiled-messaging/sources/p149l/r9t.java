package p149l;

import com.p046p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveControlMessage;

/* JADX INFO: loaded from: classes4.dex */
public class r9t extends vp2<LongLinkLiveMessage.LivePause> {
    public r9t(und undVar) {
        super(undVar);
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public LiveControlMessage mo99811w(String str, LongLinkLiveMessage.LivePause livePause, String str2) {
        return new LiveControlMessage(str, "pause");
    }

    @Override // p149l.vp2, p149l.sul
    /* JADX INFO: renamed from: b */
    public Class<LongLinkLiveMessage.LivePause> mo94398b() {
        return LongLinkLiveMessage.LivePause.class;
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: e */
    public String mo94399e() {
        return "live.room.pause";
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public boolean mo94400q(LongLinkLiveMessage.LivePause livePause, String str) {
        return m199212r(livePause.getRoomId(), livePause.getUserId(), livePause.getLiveId());
    }
}
