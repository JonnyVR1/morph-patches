package p002l;

import com.p000p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveControlMessage;
import com.p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class sdu extends vp2<LongLinkLiveMessage.LiveUpdateVideoQuality> {
    public sdu(und undVar) {
        super(undVar);
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public LiveControlMessage mo10148w(String str, LongLinkLiveMessage.LiveUpdateVideoQuality liveUpdateVideoQuality, String str2) {
        return new LiveControlMessage(str, "live_update_video_quality");
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: b */
    public Class<LongLinkLiveMessage.LiveUpdateVideoQuality> mo9244b() {
        return LongLinkLiveMessage.LiveUpdateVideoQuality.class;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: e */
    public String mo9245e() {
        return "live.update.videoquality";
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public boolean mo9246q(LongLinkLiveMessage.LiveUpdateVideoQuality liveUpdateVideoQuality, String str) {
        return m24095r(liveUpdateVideoQuality.getRoomId(), "no_care", "no_care");
    }
}
