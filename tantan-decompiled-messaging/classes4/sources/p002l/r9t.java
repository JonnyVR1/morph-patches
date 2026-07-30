package p002l;

import com.p000p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveControlMessage;
import com.p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class r9t extends vp2<LongLinkLiveMessage.LivePause> {
    public r9t(und undVar) {
        super(undVar);
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public LiveControlMessage mo10148w(String str, LongLinkLiveMessage.LivePause livePause, String str2) {
        return new LiveControlMessage(str, "pause");
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: b */
    public Class<LongLinkLiveMessage.LivePause> mo9244b() {
        return LongLinkLiveMessage.LivePause.class;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: e */
    public String mo9245e() {
        return "live.room.pause";
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public boolean mo9246q(LongLinkLiveMessage.LivePause livePause, String str) {
        return m24095r(livePause.getRoomId(), livePause.getUserId(), livePause.getLiveId());
    }
}
