package p002l;

import com.p000p1.mobile.putong.live.livingroom.archi.longlink.bean.RewardPointMsg;
import com.p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import l.p3g0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class r0d0 extends bk2<LongLinkLiveMessage.LiveRewardPointInfo, RewardPointMsg> {
    public r0d0(p3g0<RewardPointMsg, RewardPointMsg> p3g0Var, und undVar) {
        super(p3g0Var, undVar);
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo9246q(LongLinkLiveMessage.LiveRewardPointInfo liveRewardPointInfo, String str) {
        return m24095r(liveRewardPointInfo.getRoomId(), "no_care", liveRewardPointInfo.getLiveId());
    }

    @Override // p002l.bk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public RewardPointMsg mo9251z(String str, LongLinkLiveMessage.LiveRewardPointInfo liveRewardPointInfo) {
        return new RewardPointMsg(liveRewardPointInfo.getRewardPoint()).setCallRewardPoint(liveRewardPointInfo.getCallRewardPointsList());
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: b */
    public Class<LongLinkLiveMessage.LiveRewardPointInfo> mo9244b() {
        return LongLinkLiveMessage.LiveRewardPointInfo.class;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: e */
    public String mo9245e() {
        return "voicelive.reward.point.info";
    }
}
