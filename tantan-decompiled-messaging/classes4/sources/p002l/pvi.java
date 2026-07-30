package p002l;

import com.p000p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import com.p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import l.zcu;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class pvi extends vp2<LongLinkLiveMessage.Follow> {
    public pvi(und undVar) {
        super(undVar);
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public LiveMessage mo9247x(String str, LongLinkLiveMessage.Follow follow, String str2) {
        LiveMessage.ExtInfo extInfo = new LiveMessage.ExtInfo();
        extInfo.followUserId = follow.getFollower().getId();
        extInfo.followType = "otherFollowAnchor";
        extInfo.followTrackName = this.f21259c.m23570f() ? "follow_b" : "follow_a";
        LiveMessage liveMessageM24093o = m24093o(str, follow.getTempdata().getId(), follow.getFollower(), null, follow.getTempdata(), extInfo);
        zcu.e(liveMessageM24093o, this.f21259c);
        return liveMessageM24093o;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: b */
    public Class<LongLinkLiveMessage.Follow> mo9244b() {
        return LongLinkLiveMessage.Follow.class;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: e */
    public String mo9245e() {
        return "live.live.follow";
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public boolean mo9246q(LongLinkLiveMessage.Follow follow, String str) {
        return m24095r(follow.getRoomId(), "no_care", "no_care");
    }
}
