package p149l;

import com.p046p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveControlMessage;

/* JADX INFO: loaded from: classes4.dex */
public class h5u extends vp2<LongLinkLiveMessage.LiveStart> {
    public h5u(und undVar) {
        super(undVar);
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public LiveControlMessage mo99811w(String str, LongLinkLiveMessage.LiveStart liveStart, String str2) {
        return new LiveControlMessage(str, "start").setLiveId(liveStart.getLiveId());
    }

    @Override // p149l.vp2, p149l.sul
    /* JADX INFO: renamed from: b */
    public Class<LongLinkLiveMessage.LiveStart> mo94398b() {
        return LongLinkLiveMessage.LiveStart.class;
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: e */
    public String mo94399e() {
        return "live.room.start";
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public boolean mo94400q(LongLinkLiveMessage.LiveStart liveStart, String str) {
        return m199212r(liveStart.getRoomId(), liveStart.getUserId(), "no_care");
    }
}
