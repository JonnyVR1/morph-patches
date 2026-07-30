package p002l;

import com.p000p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveControlMessage;
import com.p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class rdu extends vp2<LongLinkLiveMessage.LiveUpdatePullVideoQuality> {
    public rdu(und undVar) {
        super(undVar);
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public LiveControlMessage mo10148w(String str, LongLinkLiveMessage.LiveUpdatePullVideoQuality liveUpdatePullVideoQuality, String str2) {
        liveUpdatePullVideoQuality.toString();
        return new LiveControlMessage(str, "live_pull_update_video_quality");
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: b */
    public Class<LongLinkLiveMessage.LiveUpdatePullVideoQuality> mo9244b() {
        return LongLinkLiveMessage.LiveUpdatePullVideoQuality.class;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: e */
    public String mo9245e() {
        return "live.update.pullvideoquality";
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public boolean mo9246q(LongLinkLiveMessage.LiveUpdatePullVideoQuality liveUpdatePullVideoQuality, String str) {
        return m24095r(liveUpdatePullVideoQuality.getRoomId(), "no_care", "no_care");
    }
}
