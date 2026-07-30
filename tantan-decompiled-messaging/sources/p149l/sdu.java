package p149l;

import com.p046p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveControlMessage;

/* JADX INFO: loaded from: classes4.dex */
public class sdu extends vp2<LongLinkLiveMessage.LiveUpdateVideoQuality> {
    public sdu(und undVar) {
        super(undVar);
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public LiveControlMessage mo99811w(String str, LongLinkLiveMessage.LiveUpdateVideoQuality liveUpdateVideoQuality, String str2) {
        return new LiveControlMessage(str, "live_update_video_quality");
    }

    @Override // p149l.vp2, p149l.sul
    /* JADX INFO: renamed from: b */
    public Class<LongLinkLiveMessage.LiveUpdateVideoQuality> mo94398b() {
        return LongLinkLiveMessage.LiveUpdateVideoQuality.class;
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: e */
    public String mo94399e() {
        return "live.update.videoquality";
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public boolean mo94400q(LongLinkLiveMessage.LiveUpdateVideoQuality liveUpdateVideoQuality, String str) {
        return m199212r(liveUpdateVideoQuality.getRoomId(), "no_care", "no_care");
    }
}
