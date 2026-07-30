package p149l;

import com.p046p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;

/* JADX INFO: loaded from: classes4.dex */
public class nui extends vp2<LongLinkLiveMessage.Follow> {
    public nui(und undVar) {
        super(undVar);
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public LiveMessage mo94401x(String str, LongLinkLiveMessage.Follow follow, String str2) {
        LiveMessage.ExtInfo extInfo = new LiveMessage.ExtInfo();
        extInfo.followUserId = follow.getFollower().getId();
        extInfo.followType = "otherFollowAnchor";
        extInfo.followTrackName = this.f182445c.m194419f() ? "follow_b" : "follow_a";
        LiveMessage liveMessageM199210o = m199210o(str, follow.getTempdata().getId(), follow.getFollower(), null, follow.getTempdata(), extInfo);
        zcu.m218090e(liveMessageM199210o, this.f182445c);
        return liveMessageM199210o;
    }

    @Override // p149l.vp2, p149l.sul
    /* JADX INFO: renamed from: b */
    public Class<LongLinkLiveMessage.Follow> mo94398b() {
        return LongLinkLiveMessage.Follow.class;
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: e */
    public String mo94399e() {
        return "live.room.userFollowAnchor";
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public boolean mo94400q(LongLinkLiveMessage.Follow follow, String str) {
        return m199212r(follow.getRoomId(), "no_care", "no_care");
    }
}
