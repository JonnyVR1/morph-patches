package p153l;

import com.p051p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;

/* JADX INFO: loaded from: classes4.dex */
public class jxi extends mq2<LongLinkLiveMessage.Follow> {
    public jxi(zod zodVar) {
        super(zodVar);
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public LiveMessage mo113619x(String str, LongLinkLiveMessage.Follow follow, String str2) {
        LiveMessage.ExtInfo extInfo = new LiveMessage.ExtInfo();
        extInfo.followUserId = follow.getFollower().getId();
        extInfo.followType = "otherFollowAnchor";
        extInfo.followTrackName = this.f137993c.m220738f() ? "follow_b" : "follow_a";
        LiveMessage liveMessageM159458o = m159458o(str, follow.getTempdata().getId(), follow.getFollower(), null, follow.getTempdata(), extInfo);
        afu.m97556e(liveMessageM159458o, this.f137993c);
        return liveMessageM159458o;
    }

    @Override // p153l.mq2, p153l.fxl
    /* JADX INFO: renamed from: b */
    public Class<LongLinkLiveMessage.Follow> mo95510b() {
        return LongLinkLiveMessage.Follow.class;
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: e */
    public String mo95511e() {
        return "live.room.userFollowAnchor";
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public boolean mo95512q(LongLinkLiveMessage.Follow follow, String str) {
        return m159460r(follow.getRoomId(), "no_care", "no_care");
    }
}
