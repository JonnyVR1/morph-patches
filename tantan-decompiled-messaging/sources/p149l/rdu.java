package p149l;

import com.p046p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveControlMessage;

/* JADX INFO: loaded from: classes4.dex */
public class rdu extends vp2<LongLinkLiveMessage.LiveUpdatePullVideoQuality> {
    public rdu(und undVar) {
        super(undVar);
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public LiveControlMessage mo99811w(String str, LongLinkLiveMessage.LiveUpdatePullVideoQuality liveUpdatePullVideoQuality, String str2) {
        liveUpdatePullVideoQuality.toString();
        return new LiveControlMessage(str, "live_pull_update_video_quality");
    }

    @Override // p149l.vp2, p149l.sul
    /* JADX INFO: renamed from: b */
    public Class<LongLinkLiveMessage.LiveUpdatePullVideoQuality> mo94398b() {
        return LongLinkLiveMessage.LiveUpdatePullVideoQuality.class;
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: e */
    public String mo94399e() {
        return "live.update.pullvideoquality";
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public boolean mo94400q(LongLinkLiveMessage.LiveUpdatePullVideoQuality liveUpdatePullVideoQuality, String str) {
        return m199212r(liveUpdatePullVideoQuality.getRoomId(), "no_care", "no_care");
    }
}
